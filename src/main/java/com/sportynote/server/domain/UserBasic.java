package com.sportynote.server.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import com.sportynote.server.Enum.SocialType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class UserBasic {
    @Id
    @GeneratedValue
    @Column
    private Integer idx;

    @NotNull
    @Column(name = "user_id")
    private String userId;

    @JsonIgnore
    @OneToMany(mappedBy = "userBasic")
    private List<UserFavorite> userFavorites = new ArrayList<>();

    private String email;

    private String id;

    private String name;

    private SocialType socialtype;

    @Column(name = "lastlogin_at")
    private LocalDateTime lastloginat;

    private String nickname;

    private String userid;

}