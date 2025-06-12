package com.pluralsight.workbook8.NorthwindShippers;

import java.util.List;

public class ShipperService {
    private final ShipperRepository shipperRepository;

    public ShipperService(ShipperRepository shipperRepository) {
        this.shipperRepository = shipperRepository;
    }

    public void printShippers() {
        List<Shipper> allShippers = shipperRepository.getAllShippers();
        for (Shipper shipper : allShippers) {
            System.out.printf("ID: %d%n\t CompanyName: %s%n\t\t Phone: %s%n", shipper.getShipperID(), shipper.getCompanyName(), shipper.getPhone());
        }
    }

    public void addShipper(Shipper shipper) {
        shipperRepository.addShipper(shipper);
        System.out.println("Shipper added.");
    }

    public void removeShipper(int shipperId) {
        shipperRepository.removeShipper(shipperId);
        if (shipperId > 3)
            System.out.println("Shipper removed.");
    }

    public void updateShipper(int shipperId, String phone) {
        shipperRepository.updateShipper(shipperId, phone);
        if (shipperId > 3)
            System.out.println("Shipper updated.");
    }
}
