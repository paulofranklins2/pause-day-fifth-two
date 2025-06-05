drop database if exists garages_manager;

CREATE SCHEMA IF NOT EXISTS garages_manager;

-- Dealerships
CREATE TABLE IF NOT EXISTS garages_manager.dealerships
(
    dealership_id   INT AUTO_INCREMENT PRIMARY KEY,
    dealership_name VARCHAR(255) NOT NULL,
    address         VARCHAR(255) NOT NULL,
    phone           VARCHAR(15)  NOT NULL,
    email           VARCHAR(255) NOT NULL,
    UNIQUE (dealership_name)
);

-- Customers
CREATE TABLE IF NOT EXISTS garages_manager.customers
(
    customer_id INT AUTO_INCREMENT PRIMARY KEY,
    ssn         VARCHAR(11) NOT NULL UNIQUE,
    first_name  VARCHAR(50) NOT NULL,
    last_name   VARCHAR(50) NOT NULL,
    address     VARCHAR(255),
    phone       VARCHAR(15),
    email       VARCHAR(255)
);

-- Vehicles
CREATE TABLE IF NOT EXISTS garages_manager.vehicles
(
    vin      VARCHAR(17)                          NOT NULL PRIMARY KEY,
    year     INT                                  NOT NULL,
    make     VARCHAR(255)                         NOT NULL,
    model    VARCHAR(255)                         NOT NULL,
    type     ENUM ('car', 'truck', 'van', 'motorcycle', 'other'),
    color    VARCHAR(100)                         NOT NULL,
    price    NUMERIC(10, 2)                       NOT NULL,
    odometer DOUBLE PRECISION                     NOT NULL,
    sold     ENUM ('available', 'sold', 'leased') NOT NULL DEFAULT 'available'
);

-- Inventory
CREATE TABLE IF NOT EXISTS garages_manager.inventory
(
    vin           VARCHAR(17) PRIMARY KEY,
    dealership_id INT,
    FOREIGN KEY (dealership_id) REFERENCES garages_manager.dealerships (dealership_id),
    FOREIGN KEY (vin) REFERENCES garages_manager.vehicles (vin)
);

-- Sale Contracts
CREATE TABLE IF NOT EXISTS garages_manager.sale_contracts
(
    id            INT AUTO_INCREMENT PRIMARY KEY,
    vin           VARCHAR(17) NOT NULL,
    dealership_id INT         NOT NULL,
    customer_id   INT         NOT NULL,
    date_sold     DATE,
    price         NUMERIC(10, 2),
    FOREIGN KEY (vin) REFERENCES garages_manager.vehicles (vin),
    FOREIGN KEY (dealership_id) REFERENCES garages_manager.dealerships (dealership_id),
    FOREIGN KEY (customer_id) REFERENCES garages_manager.customers (customer_id)
);

CREATE INDEX idx_sale_vin ON garages_manager.sale_contracts (vin);
CREATE INDEX idx_sale_dealer ON garages_manager.sale_contracts (dealership_id);
CREATE INDEX idx_sale_customer ON garages_manager.sale_contracts (customer_id);

-- Lease Contracts
CREATE TABLE IF NOT EXISTS garages_manager.lease_contracts
(
    id              INT AUTO_INCREMENT PRIMARY KEY,
    vin             VARCHAR(17) NOT NULL,
    dealership_id   INT         NOT NULL,
    customer_id     INT         NOT NULL,
    date_leased     DATE,
    price           NUMERIC(10, 2),
    months          INT CHECK (months > 0),
    monthly_payment NUMERIC(10, 2),
    FOREIGN KEY (vin) REFERENCES garages_manager.vehicles (vin),
    FOREIGN KEY (dealership_id) REFERENCES garages_manager.dealerships (dealership_id),
    FOREIGN KEY (customer_id) REFERENCES garages_manager.customers (customer_id)
);

CREATE INDEX idx_lease_vin ON garages_manager.lease_contracts (vin);
CREATE INDEX idx_lease_dealer ON garages_manager.lease_contracts (dealership_id);
CREATE INDEX idx_lease_customer ON garages_manager.lease_contracts (customer_id);
