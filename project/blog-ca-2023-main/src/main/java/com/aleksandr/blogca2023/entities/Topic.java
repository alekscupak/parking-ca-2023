package com.aleksandr.blogca2023.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

    @Entity
    @NoArgsConstructor
    @AllArgsConstructor
    @Data

    public class Topic {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @Column
        private String title;
        @Column
        private String header;
        @Column
        private String paid; //test
        @Column
        private String space;
        @Column
        private Date datefrom;
        @Column
        private Date dateto;


        @OneToMany(mappedBy = "topic", orphanRemoval = true)
        private List<Comment> comments = new ArrayList<>();



    }
