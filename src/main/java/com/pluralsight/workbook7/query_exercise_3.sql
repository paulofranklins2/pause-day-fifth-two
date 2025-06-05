-- Exercise workbook page #106
INSERT INTO suppliers (supplierid, companyname, contactname, contacttitle, address, city, region, postalcode, country,
                       phone, fax, homepage)
VALUES (30, 'Green Valley Foods', 'Laura Simmons', 'Purchasing Manager', '1234 Harvest Lane',
        'Portland', 'OR', '97205', 'USA',
        '+1-503-555-8723', '+1-503-555-8724', 'http://www.greenvalleyfoods.com');

insert into products(productid, productname, supplierid, categoryid, unitprice, unitsinstock, discontinued)
values (78, 'Green Valley Meat', 30, 1, 10.00, 100, 0);

select ProductName, SupplierID from products;

update products set unitprice = 11.50 where productid = 78;

delete from products where productid = 78;
delete from suppliers where supplierid = 30;

select * from products;
select * from suppliers;