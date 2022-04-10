package za.ac.mycput.Repository.Employee;
/*
    Author : Devon Sherwyn May
    Student number : 219168296
    Date : 10 April 2022
    IEmployeeRepository interface class
*/
import za.ac.mycput.Entity.Employee;
import za.ac.mycput.Repository.IRepository;

import java.util.Set;

public interface IEmployeeRepository extends IRepository<Employee,String>
{
    public Set<Employee> getAll();
}