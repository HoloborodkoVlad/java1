package com.MuseumExhibition;

public class Author {
    private String name;
    private String surname;

    /** Creates an author using full_name.
     * @param full_name The author`s full_name
     */

    public Author(String full_name) {
        String[] temp = full_name.split(" ");
        this.name = temp[0];

        // Surname can have its prefix or can be consist of two or more words
        // For example: Leonardo Da Vinci, Lars von Trier, etc.
        StringBuilder surname = new StringBuilder();
        for(int i = 1 ; i < temp.length; i++){
            surname.append(temp[i]);
            if(i != temp.length - 1) {
                surname.append(" ");
            }
        }

        this.surname = surname.toString();
    }

    /** Creates an author with specified name and surname.
     * @param name The author`s name
     * @param surname The author`s surname
     */

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    /** Get an author`s name.
     * @return The author`s name
     */
    public String getName() {
        return this.name;
    }

    /** Set an author`s name.
     * @param name an author`s name
     */
    public void setName(String name) {
        this.name = name;
    }

    /** Get an author`s surname.
     * @return The author`s surname
     */
    public String getSurname() {
        return this.surname;
    }

    /** Set an author`s surname.
     * @param surname an author`s surname
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /** Get an author`s full name.
     * @return The author`s surname
     */
    public String getAuthorFullName() {
        return this.name + ' ' + this.surname;
    }

    /** Override toString method
     * @return author`s full name
     */
    @Override
    public String toString() {
        return getAuthorFullName();
    }
}
