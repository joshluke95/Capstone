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
        Employee employee = new Employee.Builder()
                .setEmpFirstName("Devon")
                .setEmpLastName("May")
                .setEmpPhoneNumber("0662686800")
                .setEmpRole("Driver")
                .setEmpID("01")
                .build();
        System.out.println(employee);
        assertNotNull(employee);
    }
}