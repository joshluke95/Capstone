/*DriverRepository.java
   Class for the DriverRepository
   Author: Joshua Retief (214234169)
   Date: 09 April 2022
 */

package za.ac.mycput.Repository.driver;

import za.ac.mycput.Entity.Driver;

import java.util.HashSet;
import java.util.Set;

public class DriverRepository implements IDriverRepository
{
    public static DriverRepository repository = null;
    public Set<Driver> driverDB = null;

    private DriverRepository(){
        driverDB = new HashSet<Driver>();
    }

    public static DriverRepository getRepository(){
        if (repository == null)
        {
            repository = new DriverRepository();

        }
        return repository;
    }

    @Override
    public Driver create(Driver driver) {
        boolean success = driverDB.add(driver);
        if(!success)
            return null;
        return driver;
    }

    @Override
    public Driver read(String driverId) {
        for (Driver driver : driverDB){
            if (driver.getDriverId().equals(driverId))
                return driver;

        }
        return null;
    }

    @Override
    public Driver update(Driver driver) {
        Driver oldDriver = read(driver.getDriverId());
        if (oldDriver != null)
        {
            driverDB.remove(oldDriver);
            driverDB.add(driver);
            return driver;
        }
        return null;
    }

    @Override
    public boolean delete(String driverId) {
        Driver driverToDelete = read(driverId);
        if(driverToDelete == null)
            return false;
        driverDB.remove(driverToDelete);
        return true;
    }

    @Override
    public Set<Driver> getAllDriver() {
        return driverDB;
    }
}
