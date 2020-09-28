package com.MuseumExhibition;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Exhibition exhibition = createExhibition();
        presentExhibition(exhibition);
    }

    /** Create a new Exhibition with related objects
     * @return created exhibition
     */
    private static Exhibition createExhibition() {

        Exhibition exhibition = new Exhibition("Exhibition of Leonardo da Vinci");
        Author author = new Author("Leonardo", "da Vinci");
        exhibition.addExhibit(new Painting("Mona Lisa", author, 1503, 53, 77));
        exhibition.addExhibit(new Painting("Homo vitruvianus", author, 1491, 26, 35));
        exhibition.addExhibit(new Painting("Dama con l'ermellino", author, 1490, 39, 54));
        exhibition.addExhibit(new Sculpture("Rider", author, 1508, MaterialType.Wood));
        exhibition.addExhibit(new Sculpture("Madonna with the laughing child", author, 1472, MaterialType.Clay));
        return exhibition;
    }

    /** Present exhibition
     * @param exhibition The Exhibition object
     */
    private static void presentExhibition(Exhibition exhibition) {

        System.out.println("Welcome to the exhibition " + exhibition.getName() + '!');
        System.out.println("Here you can find " + exhibition.getExhibitsAmount() + " exhibits:");
        Iterator iterator = exhibition.getExhibits().iterator();
        while (iterator.hasNext()) {
            Exhibit exhibit = (Exhibit) iterator.next();
            System.out.println(exhibit.toString());
        }
        System.out.println("We will be glad, if you visit our exhibition.");
    }
}
