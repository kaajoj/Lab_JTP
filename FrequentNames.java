/*
Karol Nowak
I6X1N1
 */

package com.company;

import java.util.*;

public class FrequentNames {

    static String tekst = "";
    static String tekst2 = "";
    static int ilosc;
    static int max =0;

    static class Element {

        int val;
        String napis;
        Element nastepny;

        Element(String napis){
           this.napis = napis;
           this.nastepny = null;
        }

//        Element(int i){
//            this.val = i;
//            this.nastepny = null;
//        }

        void dodajNastepny(Element element){
            this.nastepny = element;
        }

        public Element pobierzNastepny() {
            return nastepny;
        }

    }

    static class Anchor {

        public Element first;

        public void insertAtTheFront(String imie){
            Element element = new Element(imie);
            element.dodajNastepny(this.first);
            this.first = element;
        }

        public void insertAtTheEnd(String imie) {
            Element element = new Element(imie);
            Element temp = this.first;
            if(this.first == null) this.first = element;
            else {
                while(temp.nastepny != null){
                temp = temp.nastepny;
            }
                temp.nastepny = element;
            }
        }

        public String toString(){
            Element temp = this.first;
                while(temp.nastepny != null){
                    tekst2+=temp.napis+" ";
                    temp = temp.nastepny;
                }
            tekst2+=temp.napis;
            return tekst2;
        }

        public void rozmiar() {
            Element pomoc = first;
            int i = 0;
            while (pomoc != null) {
                i++;
                pomoc = pomoc.pobierzNastepny();
            }
            System.out.println("Rozmiar listy: " + i);
            }
    }

    public static void main(String[] args) {

        // ZAD 3
        System.out.println("Z wykorzystaniem kolekcji: ");
        List<String> list = new ArrayList<String>();
        list.add("Paweł");
        list.add("Tomek");
        list.add("Paweł");
        list.add("Mateusz");
        list.add("Tomek");
        list.add("Tomek");
        list.add("Mateusz");
        list.add("Tomek");
        list.add("Paweł");

        Set<String> list2 = new HashSet<String>(list);
        for (String temp : list2) {
            System.out.println(temp + " " + Collections.frequency(list, temp));
            ilosc = Collections.frequency(list, temp);
            if(max<ilosc) {
                max = ilosc;
                tekst = temp;
            }
            // System.out.println(ilosc);
        }
        System.out.print("\nNajczesciej wystepujace imie: " + tekst + " ");
        System.out.println(max + "\n");
        list2.remove(tekst);

        System.out.println("Po usunieciu najczesciej wystepujacego imienia: ");
        for (String temp : list2) {
            System.out.println(temp + " " + Collections.frequency(list, temp));
            ilosc = Collections.frequency(list, temp);
        }
        // ZAD4???
        System.out.println("\nListy bez wykorzystania kolekcji: ");
        Anchor anchor = new Anchor();
        anchor.insertAtTheEnd("imie1");
        anchor.insertAtTheEnd("imie2");
        anchor.insertAtTheEnd("imie3");
        anchor.insertAtTheFront("imie4");
        anchor.insertAtTheFront("imie5");
        anchor.rozmiar();
        System.out.println("Elementy listy: "+ anchor);
    }
}