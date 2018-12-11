package com.springboot.common;

import org.hibernate.annotations.Type;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.GeneratedValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.GenerationType;

import java.time.LocalDateTime;
import java.util.UUID;


@Entity
@Table(name = "user_root")
@EntityListeners(AuditingEntityListener.class)
public class UserRootImpl implements UserRoot{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String login;
    String password;

    @Type(type = "pg-uuid")
    UUID uuid;

    @Column(nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    LocalDateTime createdAt;


    public UserRootImpl() {
    }

    public UserRootImpl(String login, String password, UUID uuid, LocalDateTime time) {
        this.login = login;
        this.password = password;
        this.uuid = uuid;
        this.createdAt = time;
    }


    @Override
    public String getLogin() {
        return login;
    }

    @Override
    public void setLogin(String login) {
            this.login = login;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public UUID getUUID() {
        return uuid;
    }

    @Override
    public void setUUID(UUID uuid) {
        this.uuid = uuid;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
