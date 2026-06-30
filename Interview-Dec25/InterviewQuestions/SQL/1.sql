-- Cutomer: CustomerID, CustomerName
-- Order: OrderId, CustomerID, OrderDate, Amount

-- Give the Customer Names for the Customers who have more than 1 order and total order amount is more than 1000;

select c.CustomerName,
    count(*) order_count,
    sum(Amount) total_amount
from
	Customer c join	Orders o
    on c.CustomerID = o.CustomerID
group by
	o.CustomerID
having
    order_count > 1
    and total_amount > 1000;