package javawebapp;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Doctor Repository.
 * <p>NOTE: Creating a doctor repository that extends from the JPA for Notable take home test to support the following operations:</p>
 * <ul>
 *     <li>POST</li>
 *     <li>PUT</li>
 *     <li>GET</li>
 *     <li>DELETE</li>
 * </ul>
 *
 * @author Rushikesh Paradkar
 */
@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Integer>
{
    List<Doctor> findByFirstContainingOrLastContaining(String text, String textAgain);
}