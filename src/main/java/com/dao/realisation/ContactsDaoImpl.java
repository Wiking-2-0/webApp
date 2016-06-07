package com.dao.realisation;

import com.dao.ContactsDao;
import com.entity.Contacts;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ContactsDaoImpl implements ContactsDao {

    @Autowired
    SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }


    @Override
    public List<Contacts> getAllContacts() {
        return getSession().createQuery("from Contacts").list();
    }

    @Override
    public void addContacts(Contacts contacts) {
        getSession().save(contacts);
    }

    @Override
    public Contacts getById(int id) {
        return (Contacts) getSession().get(Contacts.class, id);
    }

    @Override
    public void deleteContacts(Contacts contacts) {
        getSession().delete(contacts);
    }
}