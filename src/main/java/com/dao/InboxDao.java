package com.dao;

import com.entity.Inbox;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface InboxDao {

    public List<Inbox> getAllInbox();

    public void addInbox(Inbox inbox);

    public Inbox getById(int id);

    public void deleteInbox(Inbox inbox);

    public void updateInbox(Inbox inbox);

    public  void  deleteAllInbox(int mailId);
}