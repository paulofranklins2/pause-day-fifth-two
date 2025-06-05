select *
from garages_manager.dealerships;

select *
from garages_manager.vehicles
         join garages_manager.inventory i on vehicles.vin = i.vin
         join garages_manager.inventory on i.dealership_id = inventory.dealership_id
where inventory.dealership_id = 1;

select *
from garages_manager.vehicles
where vin like '1HGCM82633A123456';

select *
from garages_manager.dealerships
         join garages_manager.inventory i on dealerships.dealership_id = i.dealership_id
where vin = '1HGCM82633A123456';

select *
from garages_manager.dealerships
         join garages_manager.inventory i on dealerships.dealership_id = i.dealership_id
         join garages_manager.vehicles v on i.vin = v.vin
where color = 'red';

select *
from garages_manager.sale_contracts
where dealership_id = 2
  and date_sold between '2024-01-01' and '2024-12-31';