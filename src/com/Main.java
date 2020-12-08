package com;

import java.util.Iterator;
import java.util.Map;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Exhibition daVinciExhibition = createDaVinciExhibition();
        Exhibition vanGoghExhibition = createVanGoghExhibition();
        presentExhibition(daVinciExhibition);
        System.out.println("----------------------------------");
        presentExhibition(vanGoghExhibition);
        System.out.println("----------------------------------");

        /* Test objects` equals and hash_code */
        if (daVinciExhibition.equals(vanGoghExhibition)) {
            System.out.println("Opps, something went wrong, there are the same exhibition.");
        }
    }

    /**
     * Create a new Exhibition with related objects
     *
     * @return created exhibition
     */
    private static Exhibition createDaVinciExhibition() {

        Exhibition exhibition = new Exhibition("Exhibition of Leonardo da Vinci");
        Author author = new Author("Leonardo da Vinci", new int[]{1452, 1519});
        exhibition.addExhibit(new Painting("Homo vitruvianus", author, 1491, 26, 35));
        exhibition.addExhibit(new Sculpture("Rider", author, 1508, MaterialType.Wood));

        /* Test override equals and has_code */
        Painting p1 = new Painting("Mona Lisa", author, 1630, 53, 77);
        Painting p2 = new Painting("Mona Lisa", author, 1630, 2323, 3223);
        if (p1.equals(p2)) {
            System.out.println("There are same paintings, but with different sizes. " +
                    "To exhibition will be added only one of them.");
            exhibition.addExhibit(p1);
        }

        for (Exhibit ex : exhibition.getExhibits()) {
            for (int i = 0; i < 5; i++) {
                ex.addMark((int) (Math.random() * 10));
            }
        }

        return exhibition;
    }

    /**
     * Create a new Exhibition with related objects
     *
     * @return created exhibition
     */
    private static Exhibition createVanGoghExhibition() {

        Exhibition exhibition = new Exhibition("Exhibition of Van Gogh");
        Author author = new Author("Vincent Willem van Gogh", new int[]{1853, 1890});
        exhibition.addExhibit(new Painting("De sterrennacht", author, 1889, 74, 92));
        exhibition.addExhibit(new Painting("Self-Portrait", author, 1889, 65, 54));
        exhibition.addExhibit(new Painting("Olive Trees with the Alpilles in the Background", author, 1889, 46, 75));
        for (Exhibit ex : exhibition.getExhibits()) {
            for (int i = 0; i < 5; i++) {
                ex.addMark((int) (Math.random() * 10));
            }
        }
        return exhibition;
    }

    /**
     * Present exhibition
     *
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
        exhibition.getMostCommonMarkOfExhibit().ifPresent(mark -> {
            System.out.println("Most common mark: " + mark.getKey() + " appears " + mark.getValue() + " times");
        });
        System.out.println("Min required perimeter of a hall: " + exhibition.findMinPerimeterOfHall());
        System.out.println("The biggest painting: " + exhibition.findTheBiggestPainting());
        System.out.println("Average area of paintings: " + exhibition.findAverageAreaOfPaintings());
        System.out.println(exhibition.getExhibitByType(Painting.class));
        System.out.println("We will be glad, if you visit our exhibition.");
    }
}
