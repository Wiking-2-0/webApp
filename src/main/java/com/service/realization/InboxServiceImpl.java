package com.service.realization;

import com.dao.InboxDao;
import com.entity.Inbox;
import com.service.InboxService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class InboxServiceImpl implements InboxService{

    @Autowired
    InboxDao inboxDao;
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public List<Inbox> getAllInbox() {
        return inboxDao.getAllInbox();
    }

    @Override
    public void addInbox(Inbox inbox) {
        inboxDao.addInbox(inbox);
    }

    @Override
    public Inbox getById(int id) {
        return inboxDao.getById(id);
    }

    @Override
    public void deleteInbox(Inbox inbox) {
        inboxDao.deleteInbox(inbox);
    }

    @Override
    public void deleteAllInbox(int mailId) {
        inboxDao.deleteAllInbox(mailId);
    }

    @Override
    public void updateInbox(Inbox inbox) {

    }

    /*@Override
    public void updateInbox(Inbox inbox) {
        inboxDao.updateInbox(inbox);
    }*/
}