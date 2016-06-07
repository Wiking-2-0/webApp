package com.dao.realisation;

import com.dao.OutboxDao;
import com.entity.Outbox;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class OutboxDaoImpl implements OutboxDao {

    @Autowired
    SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public List<Outbox> getAllOutbox() {
        return getSession().createQuery("from Outbox").list();
    }

    @Override
    public void addOutbox(Outbox outbox) {
        getSession().save(outbox);
    }

    @Override
    public Outbox getById(int id) {
        return (Outbox) getSession().get(Outbox.class, id);
    }

    @Override
    public void deleteOutbox(Outbox outbox) {
        getSession().delete(outbox);
    }
}