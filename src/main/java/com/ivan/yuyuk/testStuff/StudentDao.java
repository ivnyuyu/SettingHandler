package com.ivan.yuyuk.testStuff;


import java.util.List;

import com.ivan.yuyuk.configure.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.ivan.yuyuk.entity.Setting;
public class StudentDao {
    public void saveStudent(Setting student) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.save(student);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
    public List < Setting > getStudents() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Setting", Setting.class).list();
        }
    }
}
