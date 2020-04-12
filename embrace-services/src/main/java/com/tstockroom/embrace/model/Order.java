package com.tstockroom.embrace.model;


import lombok.*;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Order {
    private String id;
    private Book book;
    private User borrowedBy;
    private Date startDate;
    private Date endDate;
    private Double totalPayment;
}
