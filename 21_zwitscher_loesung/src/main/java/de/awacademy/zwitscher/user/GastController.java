package de.awacademy.zwitscher.user;

import de.awacademy.zwitscher.kommentare.GastKommentar;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Controller
public class GastController {


    private List<GastKommentar> KOMMENTARLISTE = new ArrayList<>();

    @GetMapping("/guestLogin")
    public String get(Model model) {
        model.addAttribute("KOMMENTARLISTE", KOMMENTARLISTE);
        return "guestLogin";
    }




    @PostMapping("/guestLogin")
    public String post(Model model, @RequestParam String name, @RequestParam String text) {

        GastKommentar kommentar = new GastKommentar(LocalDateTime.now(), name, text);
        model.addAttribute("KOMMENTARLISTE", KOMMENTARLISTE);
        KOMMENTARLISTE.add(kommentar);
        return "redirect:/guestLogin";
    }
}
