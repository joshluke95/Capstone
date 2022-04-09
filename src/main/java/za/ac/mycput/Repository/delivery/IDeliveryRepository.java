/*IDeliveryRepository.java
   Interface for the DeliveryRepository
   Author: Joshua Retief (214234169)
   Date: 09 April 2022
 */

package za.ac.mycput.Repository.delivery;

import za.ac.mycput.Entity.Delivery;
import java.util.Set;

public interface IDeliveryRepository extends IRepository<Delivery, String>
{
    public Set<Delivery> getAllDelivery();
}
