package de.awacademy.zwitscher.kommentare;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GastKommentar {
    private LocalDateTime timestamp;
    private String name;
    private String text;


    public GastKommentar(LocalDateTime timestamp, String name, String text) {
        this.timestamp = timestamp;
        this.name = name;
        this.text = text;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String getTimestampAsString() {
        return DateTimeFormatter.ofPattern("dd.MM.yyyy  HH:mm:ss").format(timestamp);
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
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
}
