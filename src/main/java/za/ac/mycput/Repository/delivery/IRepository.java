/*IRepository.java
   Interface for the Repository
   Author: Joshua Retief (214234169)
   Date: 09 April 2022
 */

package za.ac.mycput.Repository.delivery;

public interface IRepository<T, ID> {
    T create (T t);
    T read (ID id);
    T update (T t);
    boolean delete (ID id);

}
