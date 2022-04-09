package za.ac.mycput.Repository.Admin;
/*
    Author : Devon Sherwyn May
    Student number : 219168296
    Date : 10 April 2022
    IAdminRepository interface class
*/
import za.ac.mycput.Entity.Admin;
import za.ac.mycput.Repository.IRepository;

import java.util.Set;

public interface IAdminRepository  extends IRepository<Admin,String>
{
    public Set<Admin> getAll();
}

