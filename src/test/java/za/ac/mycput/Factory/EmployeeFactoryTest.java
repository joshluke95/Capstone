package za.ac.mycput.Factory;
/*
    Author : Devon Sherwyn May
    Student number : 219168296
    Date : 10 April 2022
    EmployeeFactoryTest.Java
*/

import org.junit.Test;
import za.ac.mycput.Entity.Employee;

import static org.junit.Assert.assertNotNull;

public class EmployeeFactoryTest
{
    @Test
    public void test()
    {
        Employee employee = EmployeeFactory.createEmployee("Devon",
                "May","0662686800","Driver","01");
        System.out.println(employee.toString());
        assertNotNull(employee);
    }
}