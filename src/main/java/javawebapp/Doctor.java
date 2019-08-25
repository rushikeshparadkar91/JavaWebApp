package javawebapp;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 * Class to represent the Doctor table.
 *
 * @author Rushikesh Paradkar.
 */
@Entity
public class Doctor
{
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String first;
    private String last;

    //add the app id to reference the foreign key for the appoitment table.
    //private int appid;

    /**
     * Default constructor for {@link Doctor}.
     */
    public Doctor()
    {
    }

    /**
     * Constructor for {@link Doctor} with following parameters.
     *
     * @param first   The String first for the doctor.
     * @param last The String last for the doctor.
     */
    public Doctor(final String first, final String last)
    {
        this.setFirst(first);
        this.setLast(last);
    }

    /**
     * Constructor for {@link Doctor} with following parameters.
     *
     * @param id      The int id of the doctor.
     * @param first   The String first for the doctor.
     * @param last The String last for the doctor.
     */
    public Doctor(final int id, final String first, final String last)
    {
        this.setId(id);
        this.setFirst(first);
        this.setLast(last);
    }

    /**
     * @return The id of the doctor.
     */
    public int getId()
    {
        return id;
    }

    /**
     * Sets the Doctor with the provided id.
     *
     * @param id The id to set.
     */
    public void setId(int id)
    {
        this.id = id;
    }

    /**
     * @return The String first of the doctor.
     */
    public String getFirst()
    {
        return first;
    }

    /**
     * Sets the first of the Doctor.
     *
     * @param first The first to set.
     */
    public void setFirst(final String first)
    {
        this.first = first;
    }

    /**
     * @return The last of the Doctor.
     */
    public String getLast()
    {
        return last;
    }

    /**
     * Sets the last of the Doctor.
     *
     * @param last The content to set.
     */
    public void setLast(final String last)
    {
        this.last = last;
    }

    /**
     * @return The overriden toString() method.
     */
    @Override public String toString()
    {
        return "Doctor{" + "id=" + id + ", first='" + first + '\'' + ", last='" + last + '\'' + '}';
    }
}