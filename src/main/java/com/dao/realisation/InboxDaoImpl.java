package com.dao.realisation;

import com.dao.InboxDao;
import com.entity.Inbox;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class InboxDaoImpl implements InboxDao {

    @Autowired
    SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }


    @Override
    public List<Inbox> getAllInbox() {
        return getSession().createQuery("from Inbox").list();
    }

    @Override
    public void addInbox(Inbox inbox) {
        getSession().save(inbox);
    }

    @Override
    public Inbox getById(int id) {
        return (Inbox) getSession().get(Inbox.class, id);
    }

    @Override
    public void deleteInbox(Inbox inbox) {
        getSession().delete(inbox);
    }

    @Override
    public void updateInbox(Inbox inbox) {
        getSession().update(inbox);
    }
}