package com.MuseumExhibition;

public abstract class Exhibit {

    private String name;
    private Author author;
    private int creationYear;
    private DescriptionPlate descriptionPlate;

    /** Creates an exhibit with specified name, author, creationYear.
     * @param name The exhibit`s name
     * @param author The exhibit`s author
     * @param creationYear The exhibit`s year of creation
     */
    public Exhibit(String name, Author author, int creationYear) {
        this.name = name;
        this.author = author;
        this.creationYear = creationYear;
        descriptionPlate = new DescriptionPlate(
                 author + " - \"" + name + "\" (" + creationYear + ")"
        );
    }

    /** Get an exhibit`s name.
     * @return The exhibit`s name
     */
    public String getName() {
        return name;
    }

    /** Set an exhibit`s name.
     * @param name exhibit`s name
     */
    public void setName(String name) {
        this.name = name;
    }

    /** Get an exhibit`s author.
     * @return The exhibit`s author
     */
    public Author getAuthor() {
        return author;
    }

    /** Set an exhibit`s author.
     * @param author exhibit`s author
     */
    public void setAuthor(Author author) {
        this.author = author;
    }

    /** Get an exhibit`s year of creation.
     * @return The exhibit`s year of creation
     */
    public int getCreationYear() {
        return creationYear;
    }

    /** Set an exhibit`s year of creation.
     * @param creationYear exhibit`s year of creation
     */
    public void setCreationYear(int creationYear) {
        this.creationYear = creationYear;
    }

    /** Get a description plate.
     * @return description plateo object.
     */
    public DescriptionPlate getDescriptionPlate() {
        return descriptionPlate;
    }

    /** Set an description plate text.
     * @param text text to be set
     */
    public void setDescriptionPlate(String text) {
        descriptionPlate.setText(text);
    }

    /** Override toString method
     * @return text of description plate
     */
    @Override
    public String toString() {
        return descriptionPlate.getText();
    }


    private class DescriptionPlate {
        private String text;

        /** Creates an description plate with specified text.
         * @param text The description plate`s name
         */
        public DescriptionPlate(String text) {
            this.text = text;
        }

        /** Get an description plate`s text.
         * @return The description plate`s text
         */
        public String getText() {
            return text;
        }

        /** Set an description plate`s text.
         * @param text The description plate`s text
         */
        public void setText(String text) {
            this.text = text;
        }
    }
}
