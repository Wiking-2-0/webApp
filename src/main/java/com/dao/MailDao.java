package com.dao;

import com.entity.Mail;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface MailDao {

    public List<Mail> getAllMails();

    public void addMail(Mail mail);

    public Mail getById(int id);

    public void deleteMail(Mail mail);

    public void deleteAllMail(int mailId);

    //public void updateMail(Mail Mail);
}