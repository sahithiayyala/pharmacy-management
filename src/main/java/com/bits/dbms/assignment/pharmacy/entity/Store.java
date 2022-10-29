package com.bits.dbms.assignment.pharmacy.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity(name = "store")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer store_id;
    private String store_name;
    private Integer address_id;
    private Integer mobile_no;
    private String email_id;
    private Boolean is_physical_store;
    private String created_by;
    private Date created_on;
    private String modified_by;
    private Date modified_on;
}


