package com.entity;

import org.hibernate.validator.constraints.Email;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "Contacts")
public class Contacts implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "Contact_id")
    private int contactId;

    @Column(name = "Name")
    @Pattern(regexp = "[A-Z][a-z]{1,32}")
    private String name;

    @Column(name = "Adress")
    @Email
    private String adress;

    @ManyToOne
    @JoinColumn(name = "Mail_id")
    private Mail mail;

    @OneToMany(mappedBy = "contacts", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Inbox> inboxSet;

    @OneToMany(mappedBy = "contacts", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Outbox> outboxSet;

    public int getContactId() {
        return contactId;
    }

    public void setContactId(int contactId) {
        this.contactId = contactId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Mail getMail() {
        return mail;
    }

    public void setMail(Mail mail) {
        this.mail = mail;
    }

    public Set<Inbox> getInboxSet() {
        return inboxSet;
    }

    public void setInboxSet(Set<Inbox> inboxSet) {
        this.inboxSet = inboxSet;
    }

    public Set<Outbox> getOutboxSet() {
        return outboxSet;
    }

    public void setOutboxSet(Set<Outbox> outboxSet) {
        this.outboxSet = outboxSet;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "contactId=" + contactId +
                ", name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", mail=" + mail +
                ", inboxSet=" + inboxSet +
                ", outboxSet=" + outboxSet +
                '}';
    }
}