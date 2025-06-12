package com.pluralsight.workbook8.NorthwindShippers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Shipper {
    private int shipperID;
    private String companyName;
    private String phone;

    public Shipper(String companyName, String phone) {
        this.companyName = companyName;
        this.phone = phone;
    }
}
