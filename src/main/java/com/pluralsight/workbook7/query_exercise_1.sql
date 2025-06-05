-- Level 1: Basics (1–10)
select * from products where UnitPrice > 50 order by UnitPrice;
select * from customers where CompanyName like 'B%';
select * from products where UnitPrice > 50 order by UnitPrice desc limit 5;
select * from products where UnitsInStock between 10 and 20 order by  UnitsInStock;
select * from customers where Country like 'Mexico';
select * from products where ProductName like '%cheese%';
select * from orders where OrderID > 10250 order by OrderID;
select * from products where UnitsOnOrder = 0;
select * from orders order by OrderDate desc limit 3;
select * from products where ProductName like '%s';

-- Level 2: Filtering & Aggregation (11–20)
select count(CustomerID) from customers;
select avg(UnitPrice) from products;
select max(Quantity) from order_details;
select ProductName, UnitPrice from products where UnitPrice < (select avg(UnitPrice) from products) order by UnitPrice;
select ProductID, count(ProductID) from order_details group by ProductID having count(ProductID) > 3;
select * from products p where p.ProductID in (select ProductID from order_details);
select * from products where products.UnitsInStock < 5 order by UnitsInStock;
select ProductName, UnitPrice, max(UnitPrice) from products where UnitPrice = (select max(UnitPrice) from products);
select * from customers where CustomerID like '%A';
select distinct City from customers;

-- Level 3: GROUP BY (21–30)
select SupplierID, count(SupplierID) from products group by SupplierID;
select ProductID, sum(Quantity) from order_details group by ProductID;
select CustomerID, count(CustomerID) from orders group by CustomerID;
SELECT CategoryID, COUNT(*) FROM Products GROUP BY CategoryID HAVING COUNT(*) > 5 ORDER BY CategoryID;
select CategoryID, avg(UnitPrice) from products group by CategoryID;
select year(OrderDate), count(OrderDate) from orders group by year(OrderDate);
select OrderID, sum(Quantity) from order_details group by OrderID having sum(Quantity) > 30;
select SupplierID, avg(UnitPrice) from products group by SupplierID having avg(UnitPrice) < 20;
select CategoryID, sum(UnitsInStock) from products group by CategoryID;
select ProductName, count(ProductName) from products group by ProductName

-- Level 4: HAVING (31–37)