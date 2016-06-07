package com.service;

import com.entity.Inbox;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface InboxService {

    public List<Inbox> getAllInbox();

    public void addInbox(Inbox inbox);

    public Inbox getById(int id);

    public void deleteInbox(Inbox inbox);

    public void updateInbox(Inbox inbox);
}