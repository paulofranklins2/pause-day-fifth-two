package com.pluralsight.workbook8.NorthwindShippers;

import java.util.List;

public interface ShipperRepository {
    List<Shipper> getAllShippers();
    void addShipper(Shipper shipper);
    void removeShipper(int shipperId);
    void updateShipper(int shipper, String phone);
}
