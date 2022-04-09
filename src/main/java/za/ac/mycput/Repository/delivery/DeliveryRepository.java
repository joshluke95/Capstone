/*DeliveryRepository.java
   Class for the DeliveryRepository
   Author: Joshua Retief (214234169)
   Date: 09 April 2022
 */

package za.ac.mycput.Repository.delivery;

import za.ac.mycput.Entity.Delivery;

import java.util.HashSet;
import java.util.Set;

public class DeliveryRepository implements IDeliveryRepository
{
    public static DeliveryRepository repository = null;
    public Set<Delivery> deliveryDB = null;

    private DeliveryRepository(){
        deliveryDB = new HashSet<Delivery>();
    }

    public static DeliveryRepository getRepository(){
        if (repository == null)
        {
            repository = new DeliveryRepository();
        }
        return repository;
    }

    @Override
    public Delivery create(Delivery delivery) {
        boolean success = deliveryDB.add(delivery);
        if(!success)
            return null;
        return delivery;
    }

    @Override
    public Delivery read(String deliveryId) {
        for (Delivery delivery : deliveryDB){
            if (delivery.getDeliveryId().equals(deliveryId))
                return delivery;
        }
        return null;
    }

    @Override
    public Delivery update(Delivery delivery) {
        Delivery oldDriver = read(delivery.getDeliveryId());
        if (oldDriver != null)
        {
            deliveryDB.remove(oldDriver);
            deliveryDB.add(delivery);
            return delivery;
        }
        return null;
    }

    @Override
    public boolean delete(String deliveryId) {
        for (Delivery deleteDelivery : deliveryDB)
            if (deleteDelivery.deliveryId.equals(deliveryId))
            {
                return false;
            }
        return true;
    }

    @Override
    public Set<Delivery> getAllDelivery() {
        return deliveryDB;
    }
}
