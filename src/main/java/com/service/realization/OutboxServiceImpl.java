package com.service.realization;

import com.dao.OutboxDao;
import com.entity.Outbox;
import com.service.OutboxService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class OutboxServiceImpl implements OutboxService{

    @Autowired
    OutboxDao outboxDao;

    @Override
    public List<Outbox> getAllOutbox() {
        return outboxDao.getAllOutbox();
    }

    @Override
    public void addOutbox(Outbox outbox) {
        outboxDao.addOutbox(outbox);
    }

    @Override
    public Outbox getById(int id) {
        return outboxDao.getById(id);
    }

    @Override
    public void deleteOutbox(Outbox outbox) {
        outboxDao.deleteOutbox(outbox);
    }

    @Override
    public void deleteAllOutbox(int mailId) {
        outboxDao.deleteAllOutbox(mailId);
    }

    @Override
    public void updateOutbox(Outbox outbox) {

    }

/*   @Override
    public void updateOutbox(Outbox outbox) {
        outboxDao.updateOutbox(outbox);
    }*/
}