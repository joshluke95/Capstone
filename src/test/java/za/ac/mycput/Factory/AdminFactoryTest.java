package za.ac.mycput.Factory;

/*
    Author : Devon Sherwyn May
    Student number : 219168296
    Date : 10 April 2022
    AdminFactoryTest.Java
*/
import org.junit.Test;
import za.ac.mycput.Entity.Admin;

import static org.junit.Assert.assertNotNull;

public class AdminFactoryTest
{
    @Test
    public void test()
    {
        Admin admin = AdminFactory.createAdmin("Brad",
                "Raatz","0662686801","01");
        System.out.println(admin.toString());
        assertNotNull(admin);
    }
}