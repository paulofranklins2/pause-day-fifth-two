INSERT INTO garages_manager.dealerships (dealership_name, address, phone, email)
VALUES ('AutoHub Central', '123 Main St, Springfield, IL', '217-555-0134', 'contact@autohubcentral.com'),
       ('Premier Motors', '456 Market Rd, Austin, TX', '512-555-0198', 'info@premiermotors.com'),
       ('Sunset Autos', '789 Sunset Blvd, Los Angeles, CA', '310-555-0420', 'sales@sunsetautos.com'),
       ('Mountain Drive Dealership', '321 Alpine Ave, Denver, CO', '303-555-0275', 'hello@mountaindrive.com'),
       ('Cityline Cars', '159 River St, New York, NY', '212-555-0842', 'support@citylinecars.com');

INSERT INTO garages_manager.customers (ssn, first_name, last_name, address, phone, email)
VALUES ('123-45-6789', 'John', 'Doe', '101 Maple St, Springfield, IL', '217-555-0101', 'john.doe@example.com'),
       ('987-65-4321', 'Jane', 'Smith', '202 Oak Ave, Austin, TX', '512-555-0202', 'jane.smith@example.com'),
       ('111-22-3333', 'Alice', 'Johnson', '303 Pine Rd, Denver, CO', '303-555-0303', 'alice.johnson@example.com'),
       ('444-55-6666', 'Robert', 'Brown', '404 Cedar Blvd, Los Angeles, CA', '310-555-0404',
        'robert.brown@example.com'),
       ('777-88-9999', 'Emily', 'Davis', '505 Birch Ln, New York, NY', '212-555-0505', 'emily.davis@example.com');

INSERT INTO garages_manager.vehicles (vin, year, make, model, type, color, price, odometer, sold)
VALUES ('1HGCM82633A123456', 2021, 'Honda', 'Civic', 'car', 'Blue', 21999.99, 15342.5, 'available'),
       ('1FTRX18L1XNB12345', 2020, 'Ford', 'F-150', 'truck', 'Black', 28995.00, 45231.8, 'sold'),
       ('2T1BURHE5JC123456', 2022, 'Toyota', 'Corolla', 'car', 'White', 19995.00, 7280.0, 'available'),
       ('JHMFA16586S012345', 2019, 'Honda', 'Odyssey', 'van', 'Silver', 25450.75, 68450.1, 'leased'),
       ('WBA3A5C51DF123456', 2023, 'BMW', '3 Series', 'car', 'Red', 41999.00, 1120.4, 'available'),
       ('1HD1BJY102Y123456', 2018, 'Harley-Davidson', 'Sportster', 'motorcycle', 'Orange', 14500.00, 8420.9, 'sold'),
       ('JN1AZ4EH6EM123456', 2021, 'Nissan', '370Z', 'car', 'Yellow', 31900.00, 12150.3, 'leased');

INSERT INTO garages_manager.inventory (vin, dealership_id)
VALUES ('1HGCM82633A123456', 1),
       ('1FTRX18L1XNB12345', 2),
       ('2T1BURHE5JC123456', 1),
       ('JHMFA16586S012345', 3),
       ('WBA3A5C51DF123456', 4),
       ('1HD1BJY102Y123456', 5),
       ('JN1AZ4EH6EM123456', 2);

INSERT INTO garages_manager.sale_contracts (vin, dealership_id, customer_id, date_sold, price)
VALUES ('1FTRX18L1XNB12345', 2, 1, '2024-11-15', 27995.00),
       ('1HD1BJY102Y123456', 5, 2, '2025-01-20', 13900.00),
       ('JHMFA16586S012345', 3, 3, '2024-12-05', 24950.75),
       ('JN1AZ4EH6EM123456', 2, 4, '2025-03-22', 30900.00),
       ('2T1BURHE5JC123456', 1, 5, '2025-05-10', 18995.00);
