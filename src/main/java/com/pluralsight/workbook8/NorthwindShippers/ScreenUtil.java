package com.pluralsight.workbook8.NorthwindShippers;

import static com.pluralsight.workbook8.NorthwindShippers.InputHandler.input;

public class ScreenUtil {
    private final ShipperService shipperService;

    public ScreenUtil(ShipperService shipperService) {
        this.shipperService = shipperService;
    }

    public void init() {
        while (true) {
            logicScreen(printScreen());
        }
    }

    public int printScreen() {
        System.out.println("[1] Show All Shippers");
        System.out.println("[2] Add Shipper");
        System.out.println("[3] Remove Shipper");
        System.out.println("[4] Update Shipper");
        System.out.println("[0] Exit");
        return Integer.parseInt(input("Choice: "));
    }

    public void logicScreen(int choice) {
        switch (choice) {
            case 1 -> shipperService.printShippers();
            case 2 -> shipperService.addShipper(new Shipper(input("CompanyName"), input("Phone")));
            case 3 -> shipperService.removeShipper(Integer.parseInt(input("ShipperID")));
            case 4 -> shipperService.updateShipper(Integer.parseInt(input("ShipperID")), input("Phone"));
            case 0 -> System.exit(0);
            default -> System.out.println("Invalid choice");
        }
    }
}
