package DataBase;

/**
 * Created by andrey on 09.07.17.
 */
import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "users")
public class WordDataSet implements Serializable { // Serializable Important to Hibernate!
    private static final long serialVersionUID = -8706689714326132798L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "word", unique = true, updatable = false)
    private String word;

    @Column(name = "translation")
    private String translation;



    //Important to Hibernate!
    @SuppressWarnings("UnusedDeclaration")
    public WordDataSet()
    {

    }

    @SuppressWarnings("UnusedDeclaration")
    public WordDataSet(long id, String word, String translation)
    {
        this.setId(id);
        this.setWord(word);
        this.setTranslation(translation);
    }

    public WordDataSet(String word, String translation)
    {
        this.setId(-1);
        this.setWord(word);
        this.setTranslation(translation);
    }

    @SuppressWarnings("UnusedDeclaration")
    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public long getId()
    {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTranslation()
    {
        return translation;
    }

    public void setTranslation(String translation)
    {
        this.translation = translation;
    }

    @Override
    public String toString()
    {
        return "WordDataSet{" +
                "id=" + id +
                ", word='" + word + " translation " + translation + '\'' +
                '}';
    }
}