package com.configuration;

import com.service.*;
import com.service.realization.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServicesBeans {

    @Bean
    public ContactsService contactsService() {
        return new ContactsServiceImpl();
    }

    @Bean
    public FolderService folderService() {
        return new FolderServiceImpl();
    }

    @Bean
    public InboxService inboxService() {
        return new InboxServiceImpl();
    }

    @Bean
    public MailService mailService() {
        return new MailServiceImpl();
    }

    @Bean
    public OutboxService outboxService() {
        return new OutboxServiceImpl();
    }

}
