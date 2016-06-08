package com.dao.realisation;

import com.dao.MailDao;
import com.entity.Mail;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MailDaoImpl implements MailDao {

    @Autowired
    SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }


    @Override
    public List<Mail> getAllMails() {
        return getSession().createQuery("from Mail").list();
    }

    @Override
    public void addMail(Mail mail) {
        getSession().save(mail);
    }

    @Override
    public Mail getById(int id) {
        return (Mail) getSession().get(Mail.class, id);
        }

    @Override
    public void deleteMail(Mail mail) {
        getSession().delete(mail);
    }

    @Override
    public void deleteAllMail(int mailId) {
        String hql = String.format("DELETE FROM inbox WHERE ='Mail_id'",mailId);
        Query query = getSession().createQuery(hql);
        query.executeUpdate();
    }

    /*@Override
    public void updateMail(Mail Mail) {
        getSession().update(mail);
    }*/
}