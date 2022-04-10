package za.ac.mycput.Repository.customer;

import za.ac.mycput.Entity.Customer;
import za.ac.mycput.Repository.IRepository;

import java.util.Set;

public interface ICustomerRepository  extends IRepository<Customer,Integer> {
    public Set<Customer> getAll();
}
