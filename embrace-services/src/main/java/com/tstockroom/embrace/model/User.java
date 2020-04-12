package com.tstockroom.embrace.model;

import lombok.*;

import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class User {
    private String id;
    private String name;
    private String email;
    private String mobile;
    private String password;
    private List<Order> openOrders;
    private List<Order> closeOrders;
    private Date joiningDate;
    private Double deposit;
    private Double maxDue;
    private Address address;
}
