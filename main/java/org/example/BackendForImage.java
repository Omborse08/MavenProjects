package org.example;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

public class BackendForImage {
    public void transerFileLogic(String path) {
        File file_old = new File(path);
        File[] files = file_old.listFiles();
        for (File file: files) {
            try (Session session = HibernateUtil.get()) {
                Transaction transaction = session.beginTransaction();
                FileInputStream fileInputStream = new FileInputStream(file);
                Image images = new Image(fileInputStream.readAllBytes());
                session.persist(images);
                transaction.commit();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void takeFileLogic(String path) {
        String query = "FROM Image";
        try (Session session = HibernateUtil.get()){
            Query<Image> q = session.createQuery(query, Image.class);
            List<Image> lists = q.getResultList();
            for (Image file : lists) {
                String newPath = path+"\\Image"+file.getId()+".png";
                byte[] image = file.getImage();
                FileOutputStream fileOutputStream = new FileOutputStream(newPath);
                fileOutputStream.write(image);
                fileOutputStream.close();
            }
        } catch (Exception e) {
            System.out.println("Error.");
        }
    }
}
