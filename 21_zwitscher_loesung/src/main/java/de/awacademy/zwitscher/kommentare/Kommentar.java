package de.awacademy.zwitscher.kommentare;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Kommentar {
        @Id
        @GeneratedValue
        private int id;

        private String text;

        @ManyToOne
        private Kommentarfeld kommentarfeld;

        public int getId() { return id; }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public Kommentarfeld getKommentarfeld() {
        return kommentarfeld;
    }


    public void setText(String text) {
        this.text = text;
    }

    public void setKommentarfeld(Kommentarfeld kommentarfeld) {
        this.kommentarfeld = kommentarfeld;
    }


}

