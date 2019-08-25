package javawebapp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Appointment class.
 * @author Rushikesh Paradkar.
 */
@Entity
public class Appointment
{
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    // TODO: Change this to date time if some time is left towards the end.
    private String time;
    private String kind;

    Appointment(int id, String name, String time, String kind)
    {
        this.setId(id);
        this.setName(name);
        this.setTime(time);
        this.setKind(kind);
    }

    Appointment(String name, String time, String kind)
    {
        this.setName(name);
        this.setTime(time);
        this.setKind(kind);
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getKind()
    {
        return kind;
    }

    public void setKind(String kind)
    {
        this.kind = kind;
    }

    public String getTime()
    {
        return time;
    }

    public void setTime(String time)
    {
        this.time = time;
    }

    /**
     * @return The overriden toString() method.
     */
    @Override public String toString()
    {
        return "Appointment{" + "id=" + id + ", name='" + name + '\'' + ", kind='" + kind + '\'' + ", time='" + time + '\'' + '}';
    }
}