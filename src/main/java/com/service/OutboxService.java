package com.service;

import com.entity.Outbox;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OutboxService {

    public List<Outbox> getAllOutbox();

    public void addOutbox(Outbox outbox);

    public Outbox getById(int id);

    public void deleteOutbox(Outbox outbox);

    public void deleteAllOutbox(int mailId);

    public void updateOutbox(Outbox outbox);
}