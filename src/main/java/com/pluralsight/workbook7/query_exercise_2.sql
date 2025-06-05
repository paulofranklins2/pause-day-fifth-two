--      1–5: Simple Joins
select * from products as p join suppliers as s on  s.SupplierID = p.SupplierID;
select OrderID, c.CompanyName from orders o join customers c on o.CustomerID = c.CustomerID;
select ProductName,  c.CategoryName from products p join categories c on p.CategoryID = c.CategoryID;
select FirstName, LastName, Title from  employees;
select ProductName, UnitPrice, SupplierID from products order by ProductName;

--     6–10: Two- and Three-Table Joins
select * from orders o join customers c on o.CustomerID = c.CustomerID where c.Country like 'Germany';
select * from order_details od join products p on od.ProductID = p.ProductID where p.UnitPrice > 50 order by p.UnitPrice;
select * from products p join suppliers s on p.SupplierID = s.SupplierID where s.Country like 'USA';
select * from order_details od join products p on od.ProductID = p.ProductID where p.ProductName like 'chai';
SELECT DISTINCT c.CustomerID, c.CompanyName, p.ProductName
FROM Orders o JOIN Order_Details od ON o.OrderID = od.OrderID JOIN Products p ON od.ProductID = p.ProductID JOIN Categories cg ON p.CategoryID = cg.CategoryID JOIN Customers c ON o.CustomerID = c.CustomerID WHERE cg.CategoryName = 'Beverages';

--      16–20: Joins with Aggregates and GROUP BY
select p.ProductName, sum(od.Quantity) from order_details od join products p on od.ProductID = p.ProductID group by p.ProductName;
select c.ContactName, count(c.ContactName) from orders o join customers c on o.CustomerID = c.CustomerID group by c.ContactName;
select s.CompanyName, count(ProductID) from products p join suppliers s on p.SupplierID = s.SupplierID group by s.CompanyName;
select c.CategoryName, avg(p.UnitPrice) from products p join categories c on p.CategoryID = c.CategoryID group by c.CategoryName;
select c.CompanyName, sum(od.Quantity) from orders o join order_details od on o.OrderID = od.OrderID join customers c on o.CustomerID = c.CustomerID group by c.ContactName;

--     21–25: Joins with Subqueries or HAVING
select c.ContactName, sum(od.Quantity) from customers c join orders o on c.CustomerID = o.CustomerID join northwind.order_details od on o.OrderID = od.OrderID group by c.ContactName having sum(od.Quantity) > 300;
select ProductName, count(od.ProductID) from products p join order_details od on p.ProductID = od.ProductID group by ProductName having count(p.ProductID) > 50;
select *, max(p.UnitPrice) from suppliers s join products p on s.SupplierID = p.SupplierID having max(UnitPrice);
select c.CustomerID, sum(od.Quantity)  from customers c join orders o on c.CustomerID = o.CustomerID join order_details od on o.OrderID = od.OrderID group by c.CustomerID having sum(od.Quantity) > 0 order by sum(od.Quantity) desc limit 5;
select p.ProductName, od.Quantity from products p join order_details od on p.ProductID = od.ProductID WHERE od.Quantity = (select max(Quantity) from order_details);