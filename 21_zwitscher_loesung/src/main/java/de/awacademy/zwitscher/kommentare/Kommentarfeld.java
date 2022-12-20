package de.awacademy.zwitscher.kommentare;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Entity
public class Kommentarfeld {

    @Id
    @GeneratedValue
    private int id;

    @NotEmpty(message = "Bitte geben Sie hier ihre Nachricht ein")
    private String name;

    @NotEmpty(message = "Bitte geben Sie hier ihren Beitrag ein")
    private String text;

    @OneToMany(mappedBy = "kommentarfeld")
    private List<Kommentar> kommentare;

    public Kommentarfeld() {

    }

    public Kommentarfeld(String name, String text) {
        this.name = name;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<Kommentar> getKommentare() {
        return kommentare;
    }

    public void setKommentare(List<Kommentar> kommentare) {
        this.kommentare = kommentare;
    }



    @Override
    public String toString() {
        return "Kommentarfeld{" +
                ", name='" + name + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
