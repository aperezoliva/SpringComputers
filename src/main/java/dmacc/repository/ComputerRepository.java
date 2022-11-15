/**
* Alexander Perez Oliva - aperezoliva
* CIS175
* Nov 14, 2022
*/
package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.Computer;

/**
 * @author krazy
 *
 */

@Repository
public interface ComputerRepository extends JpaRepository<Computer, Long> {

}
