package com.dao;

import com.entity.Outbox;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface OutboxDao {

    public List<Outbox> getAllOutbox();

    public void addOutbox(Outbox outbox);

    public Outbox getById(int id);

    public void deleteOutbox(Outbox outbox);

    public void deleteAllOutbox(int mailId);

    //public void updateOutbox(Outbox outbox);
}