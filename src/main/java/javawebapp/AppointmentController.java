package javawebapp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * Controller for the Appointment.
 * <p>NOTE: Class created for Notable take home test to support the following operations:</p>
 * <ul>
 *     <li>POST</li>
 *     <li>PUT</li>
 *     <li>GET</li>
 *     <li>DELETE</li>
 * </ul>
 *
 * @author Rushikesh Paradkar
 */
@RestController
public class AppointmentController
{
    @Autowired
    AppointmentRepository appointmentRepository;

    @GetMapping("/appointment")
    public List<Appointment> index(){
        AppointmentMockedData data = new AppointmentMockedData();
        return data.fetchAppointments();
    }

    @GetMapping("/appointment/{id}")
    public Appointment show(@PathVariable String id){
        int appointmentId = Integer.parseInt(id);
        return appointmentRepository.findOne(appointmentId);
    }

    @PostMapping("/appointment/search")
    public List<Appointment> search(@RequestBody Map<String, String> body){
        String searchTerm = body.get("name");
        return appointmentRepository.findByNameContainingOrKindContaining(searchTerm, searchTerm);
    }

    @PostMapping("/appointment")
    public Appointment create(@RequestBody Map<String, String> body){
        String name = body.get("name");
        String kind = body.get("kind");
        String time = body.get("time");
        return appointmentRepository.save(new Appointment(name, time, kind));
    }

    @PutMapping("/appointment/{id}")
    public Appointment update(@PathVariable String id, @RequestBody Map<String, String> body){
        int appointmentId = Integer.parseInt(id);
        // getting appointment
        Appointment appointment = appointmentRepository.findOne(appointmentId);
        appointment.setName(body.get("name"));
        appointment.setKind(body.get("kind"));
        appointment.setTime(body.get("time"));
        return appointmentRepository.save(appointment);
    }

    @DeleteMapping("appointment/{id}")
    public boolean delete(@PathVariable String id){
        int appointmentId = Integer.parseInt(id);
        appointmentRepository.delete(appointmentId);
        return true;
    }
}