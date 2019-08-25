package javawebapp;

import java.util.ArrayList;
import java.util.List;

/**
 * Mocked data for doctors.
 */
public class DoctorMockedData
{
    //list of blog posts
    private List<Doctor> doctors;
    private static DoctorMockedData instance = null;

    /**
     * Constructor for {@link DoctorMockedData}.
     *
     * @return A static singleton instance of {@link DoctorMockedData}.
     */
    public static DoctorMockedData getInstance(){
        if(instance == null){
            instance = new DoctorMockedData();
        }
        return instance;
    }

    public DoctorMockedData(){
        doctors = new ArrayList<Doctor>();
        doctors.add(new Doctor(1, "Justin", "Clark"));
        doctors.add(new Doctor(2, "John", "Doe"));
        doctors.add(new Doctor(3, "Richard", "Hans"));
    }

    /**
     * Return all the blogs.
     * @return The List of blogs.
     */
    public List<Doctor> fetchDoctors() {
        return doctors;
    }
}
