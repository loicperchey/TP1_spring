package com.example.tp1_spring.tools;
//préparer la gestion des sessions
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory(){
        try {
            return new Configuration().configure("static/hibernate.cfg.xml").buildSessionFactory();
        }catch (HibernateException e) {
            throw e;
        }
    }

    public static SessionFactory getSessionFactory() {return buildSessionFactory();}
}


