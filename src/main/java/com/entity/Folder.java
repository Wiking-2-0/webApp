package com.entity;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "Folder")
public class Folder implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "Folder_id")
    private int folderId;

    @Column(name = "Name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "Mail_id")
    private Mail mail;

    @OneToMany(mappedBy = "folder", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Outbox> outboxSet;

    @OneToMany(mappedBy = "folder", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Outbox> inboxSet;

    public Set<Outbox> getInboxSet() {
        return inboxSet;
    }

    public void setInboxSet(Set<Outbox> inboxSet) {
        this.inboxSet = inboxSet;
    }

    public int getFolderId() {
        return folderId;
    }

    public void setFolderId(int folderId) {
        this.folderId = folderId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Outbox> getOutboxSet() {
        return outboxSet;
    }

    public void setOutboxSet(Set<Outbox> outboxSet) {
        this.outboxSet = outboxSet;
    }

    public Mail getMail() {
        return mail;
    }

    public void setMail(Mail mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Folder{" +
                "folderId=" + folderId +
                ", name='" + name + '\'' +
                ", mail=" + mail +
                ", outboxSet=" + outboxSet +
                ", inboxSet=" + inboxSet +
                '}';
    }
}
