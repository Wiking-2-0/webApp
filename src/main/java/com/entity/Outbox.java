package com.entity;

import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.Email;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "Outbox")
public class Outbox implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "Outbox_id")
    private int outboxId;

    @Column(name = "Subject")
    private String subject;

    @Column(name = "Content", columnDefinition="LONGTEXT")
    private String content;

    @ManyToOne
    @JoinColumn(name = "Mail_id")
    private Mail mail;

    @ManyToOne
    @JoinColumn(name = "Folder_id")
    private Folder folder;

    @ManyToOne
    @JoinColumn(name = "Adress")
    private Contacts contacts;

    public int getOutboxId() {
        return outboxId;
    }

    public void setOutboxId(int outboxId) {
        this.outboxId = outboxId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Mail getMail() {
        return mail;
    }

    public void setMail(Mail mail) {
        this.mail = mail;
    }

    public Folder getFolder() {
        return folder;
    }

    public void setFolder(Folder folder) {
        this.folder = folder;
    }

    public Contacts getContacts() {
        return contacts;
    }

    public void setContacts(Contacts contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "Outbox{" +
                "outboxId=" + outboxId +
                ", subject='" + subject + '\'' +
                ", content='" + content + '\'' +
                ", mail=" + mail +
                ", folder=" + folder +
                ", contacts=" + contacts +
                '}';
    }
}
