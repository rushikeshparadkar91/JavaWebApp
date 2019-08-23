package javawebapp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Blog Repository.
 * <p>NOTE: This class was created while setting up the environment for Notable take home test to support the following operations:</p>
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
public interface BlogRepository extends JpaRepository<Blog, Integer> {

    // custom query to search to blog post by title or content
    List<Blog> findByTitleContainingOrContentContaining(String text, String textAgain);
}