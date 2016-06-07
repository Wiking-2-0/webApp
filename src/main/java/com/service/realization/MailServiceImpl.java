package com.service.realization;

import com.dao.MailDao;
import com.entity.Mail;
import com.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MailServiceImpl implements MailService{

    @Autowired
    private MailDao mailDao;

    @Override
    public List<Mail> getAllMails() {
        return mailDao.getAllMails();
    }

    @Override
    public void addMail(Mail mail) {
        mailDao.addMail(mail);
    }

    @Override
    public Mail getById(int id) {
        return mailDao.getById(id);
    }

    @Override
    public void deleteMail(Mail mail) {
        mailDao.deleteMail(mail);
    }

   /* @Override
    public void updateMail(Mail mail) {
        mailDao.updateMail(mail);
    }*/
}