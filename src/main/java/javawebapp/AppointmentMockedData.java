package javawebapp;

import java.util.ArrayList;
import java.util.List;

public class AppointmentMockedData
{
    //list of blog posts
    private List<Appointment> appointments;
    private static AppointmentMockedData instance = null;

    /**
     * Constructor for {@link DoctorMockedData}.
     *
     * @return A static singleton instance of {@link DoctorMockedData}.
     */
    public static AppointmentMockedData getInstance(){
        if(instance == null){
            instance = new AppointmentMockedData();
        }
        return instance;
    }

    public AppointmentMockedData(){
        appointments = new ArrayList<Appointment>();
        appointments.add(new Appointment(201, "Frank Timer", "9:00 AM", "Follow Up"));
        appointments.add(new Appointment(202, "Hans Dustin", "10:15 AM", "Follow Up"));
        appointments.add(new Appointment(203, "Copper Lia", "3:00 PM", "New Patient"));
    }

    /**
     * Return all the blogs.
     * @return The List of blogs.
     */
    public List<Appointment> fetchAppointments() {
        return appointments;
    }
}
