package com.example.App.repository;

import com.example.App.model.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Database {
    @Autowired
    private HibernateUtil sessionFactory;

    public List getAllStudent() {
        String query = "FROM Student";
        try(Session session = sessionFactory.getSession()) {
            Transaction transaction = session.beginTransaction();
            Query<Student> studentQuery = session.createQuery(query,Student.class);
            List<Student> list = studentQuery.getResultList();
            transaction.commit();
            return list;
        } catch (Exception e) {
            throw new RuntimeException("Error By Om");
        }
    }

    public void addStudent(Student student) {
        try(Session session = sessionFactory.getSession()) {
            Transaction transaction = session.beginTransaction();
            session.persist(student);
            transaction.commit();
        } catch (Exception e) {
            throw new RuntimeException("Error By Om");
        }
    }

    public String getStudent(int id) {
        try(Session session = sessionFactory.getSession()) {
            Transaction transaction = session.beginTransaction();
            Student student = session.get(Student.class,id);
            transaction.commit();
            return student.getName();
        } catch (Exception e) {
            throw new RuntimeException("Error By Om");
        }
    }

    public void updateStudent(Student student) {
        try(Session session = sessionFactory.getSession()) {
            Transaction transaction = session.beginTransaction();
            session.merge(student);
            transaction.commit();
        } catch (Exception e) {
            throw new RuntimeException("Error By Om");
        }
    }

    public void deleteStudent(int id) {
        try(Session session = sessionFactory.getSession()) {
            Transaction transaction = session.beginTransaction();
            Student student = session.get(Student.class,id);
            session.remove(student);
            transaction.commit();
        } catch (Exception e) {
            throw new RuntimeException("Error By Om");
        }
    }

}
