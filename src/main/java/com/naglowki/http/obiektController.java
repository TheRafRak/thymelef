package com.naglowki.http;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class obiektController {
    @GetMapping("/obiekt")
    public String obiekt(Model model) {
        Osoba osoba1 = new Osoba(1, "Jan", "Kowalski", "600-500-400", "kowalski@mail.com");
        model.addAttribute("osoba1", osoba1);
        Osoba osoba2 = new Osoba(2, "Anna", "Nowak", "600-100-300", "nowak@mail.com");
        model.addAttribute("osoba2", osoba2);
        return "obiekt";
    }
    private static class Osoba {
        private int id;
        private String imie;
        private String nazwisko;
        private String telefon;
        private String mail;

        public Osoba(int id, String imie, String nazwisko, String telefon, String mail) {
            this.id = id;
            this.imie = imie;
            this.nazwisko = nazwisko;
            this.telefon = telefon;
            this.mail = mail;
        }
        // getters and setters
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public String getImie() {
            return imie;
        }
        public void setImie(String imie) {
            this.imie = imie;
        }
        public String getNazwisko() {
            return nazwisko;
        }
        public void setNazwisko(String nazwisko) {
            this.nazwisko = nazwisko;
        }
        public String getTelefon() {
            return telefon;
        }
        public void setTelefon(String numer) {
            this.telefon = telefon;
        }
        public String getMail() {
            return mail;
        }
        public void setMail(String mail) {
            this.mail = mail;
        }
    }
}
