package javawebapp;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Integer>
{

    // custom query to search to blog post by title or content
    List<Appointment> findByNameContainingOrKindContaining(String text, String textAgain);
}