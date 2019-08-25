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
 * Controller for the Doctor.
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
public class DoctorController
{
    @Autowired
    DoctorRepository doctorRepository;

    @GetMapping("/doctor")
    public List<Doctor> index(){
        DoctorMockedData data = new DoctorMockedData();
        // to fetch from mocked data use data.fetchDoctors();
        return doctorRepository.findAll();
    }

    @GetMapping("/doctor/{id}")
    public Doctor show(@PathVariable String id){
        int doctorId = Integer.parseInt(id);
        return doctorRepository.findOne(doctorId);
    }

    @PostMapping("/doctor/search")
    public List<Doctor> search(@RequestBody Map<String, String> body){
        String searchTerm = body.get("first");
        return doctorRepository.findByFirstContainingOrLastContaining(searchTerm, searchTerm);
    }

    @PostMapping("/doctor")
    public Doctor create(@RequestBody Map<String, String> body){
        String first = body.get("first");
        String last = body.get("last");
        return doctorRepository.save(new Doctor(first, last));
    }

    @PutMapping("/doctor/{id}")
    public Doctor update(@PathVariable String id, @RequestBody Map<String, String> body){
        int doctorId = Integer.parseInt(id);
        // getting doctor
        Doctor doctor = doctorRepository.findOne(doctorId);
        doctor.setFirst(body.get("first"));
        doctor.setLast(body.get("last"));
        return doctorRepository.save(doctor);
    }

    @DeleteMapping("doctor/{id}")
    public boolean delete(@PathVariable String id){
        int doctorId = Integer.parseInt(id);
        doctorRepository.delete(doctorId);
        return true;
    }
}