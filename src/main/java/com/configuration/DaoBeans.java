package com.configuration;

import com.dao.*;
import com.dao.realisation.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DaoBeans {

    @Bean
    public ContactsDao contactsDao() {
        return new ContactsDaoImpl();
    }

    @Bean
    public FolderDao folderDao() {
        return new FolderDaoImpl();
    }

    @Bean
    public InboxDao inboxDao() {
        return new InboxDaoImpl();
    }

    @Bean
    public MailDao mailDao() {
        return new MailDaoImpl();
    }

    @Bean
    public OutboxDao outboxDao() {
        return new OutboxDaoImpl();
    }

}