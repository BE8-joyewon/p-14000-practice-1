package com.team04.back.domain.user.user.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    private Long dummy;

    public void setDummy(Long dummy) {
        this.dummy = dummy;
    }

    public Long getDummy() {
        return dummy;
    }
}
