package javawebapp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Class to represent the Blog table.
 * <p>NOTE: This class was created while setting up the environment for Notable take home test</p>
 *
 * @author Rushikesh Paradkar.
 */
@Entity public class Blog
{
    @Id @GeneratedValue(strategy = GenerationType.AUTO) private int id;

    private String title;
    private String content;

    /**
     * Default constructor for {@link Blog}.
     */
    public Blog()
    {
    }

    /**
     * Constructor for {@link Blog} with following parameters.
     *
     * @param title   The String title for the blog.
     * @param content The String content for the blog.
     */
    public Blog(String title, String content)
    {
        this.setTitle(title);
        this.setContent(content);
    }

    /**
     * Constructor for {@link Blog} with following parameters.
     *
     * @param id      The int id of the blog.
     * @param title   The String title for the blog.
     * @param content The String content for the blog.
     */
    public Blog(int id, String title, String content)
    {
        this.setId(id);
        this.setTitle(title);
        this.setContent(content);
    }

    /**
     * @return The id of the blog.
     */
    public int getId()
    {
        return id;
    }

    /**
     * Sets the blog with the provided id.
     *
     * @param id The id to set.
     */
    public void setId(int id)
    {
        this.id = id;
    }

    /**
     * @return The String title of the blog.
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * Sets the title of the blog.
     *
     * @param title The title to set.
     */
    public void setTitle(String title)
    {
        this.title = title;
    }

    /**
     * @return The content of the blog.
     */
    public String getContent()
    {
        return content;
    }

    /**
     * Sets the content of the blog.
     *
     * @param content The content to set.
     */
    public void setContent(String content)
    {
        this.content = content;
    }

    /**
     * @return The overriden toString() method.
     */
    @Override public String toString()
    {
        return "Blog{" + "id=" + id + ", title='" + title + '\'' + ", content='" + content + '\'' + '}';
    }
}