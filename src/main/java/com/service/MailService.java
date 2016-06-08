package com.service;

import com.entity.Mail;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MailService {

    public List<Mail> getAllMails();

    public void addMail(Mail mail);

    public Mail getById(int id);

    public void deleteMail(Mail mail);

    public void deleteAllMail(int mailId);

    //public void updateMail(Mail mail);
}