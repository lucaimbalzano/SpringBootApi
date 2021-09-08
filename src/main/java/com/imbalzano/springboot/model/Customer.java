package com.imbalzano.springboot.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;


@Data
@Entity
@Table(name="customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="customer_id", nullable = false)
    private Integer customer_id;
    @Column(name="store_id", nullable = false)
    private Integer store_id;
    @Column(name="first_name" , nullable = false)
    private String first_name;
    @Column(name="last_name", nullable = false)
    private String last_name;
    @Column(name="email", nullable = false)
    private String email;
    @Column(name="address_id", nullable = false)
    private int address_id;
    @Column(name="active", nullable = false)
    private byte active;
    //@Temporal(TemporalType.TIMESTAMP)
    @Column(name="create_date", nullable = false)
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonProperty("create_date")
    private Date create_date;
    //@Temporal(TemporalType.TIMESTAMP)
    @Column(name="last_update", nullable = false)
    @JsonProperty("last_update")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date last_update;



}


