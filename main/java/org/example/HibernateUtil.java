package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static SessionFactory sessionFactory;

    public HibernateUtil() {
        try {
            sessionFactory = new Configuration()
                    .configure("hibernate.cfg.xml")
                    .addAnnotatedClass(Image.class)
                    .buildSessionFactory();
        }catch (Exception e) {
            throw new RuntimeException("Error..");
        }
    }

    public static Session get() {
        return sessionFactory.openSession();
    }

    public static void end() {
        sessionFactory.close();
    }
}
