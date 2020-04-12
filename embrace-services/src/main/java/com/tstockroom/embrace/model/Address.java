package com.tstockroom.embrace.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Address {
    private String flat;
    private String locality;
    private String city;
    private String state;
    private String country;
    private String pincode;
}
