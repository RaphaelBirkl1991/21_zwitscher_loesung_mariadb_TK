package de.awacademy.zwitscher.kommentare;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KommentarfeldService {

    @Autowired
    private KommentarfeldRepository kommentarfeldRepository;

    public Iterable<Kommentarfeld> getKommentarfelder() {
        return kommentarfeldRepository.findAll();
    }

    public void addEintrag(Kommentarfeld kommentarfeld) {
        kommentarfeldRepository.save(kommentarfeld);
    }
}

