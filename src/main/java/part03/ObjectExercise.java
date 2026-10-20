package part03;

import java.util.ArrayList;
import java.util.List;

/**
 * First, implement the missing parts in Person class. Then, implement the
 * methods in this class.
 *
 * You can use the JUnit test provided to verify that your implementation works
 * as expected. You can also write a main method to test your implementations.
 */
public class ObjectExercise {

    // NOTE! The Person class needs fixing too. Make sure that the Person class is
    // complete before implementing these methods.

    /**
     * Returns the names of the people in the list. This method takes a list of
     * Person objects and returns a list of their names. If the list is empty, an
     * empty list is returned.
     *
     * @param people A list of Person objects to get the names from.
     * @return A list of names of the people in the list.
     */
    public List<String> getNames(List<Person> people) {
        // hint: you can call the getName() method of each Person on the list

        int listaPituus = people.size();
        List<String> nimet = new ArrayList<>();

        for (int i = 0; i < listaPituus; i++) {

            Person nimi = people.get(i);
            nimet.add(nimi.getName());

        }
        return nimet;
    }

    /**
     * Returns the oldest person in the list. This method takes a list of Person
     * objects and returns the oldest person in the list.
     *
     * If the list is empty, null is returned. In case there are multiple people
     * with the same age, any of them can be returned.
     *
     * @param people List of Person objects to find the oldest person from.
     * @return The oldest person in the list.
     */
    public Person getOldest(List<Person> people) {
        int listaPituus = people.size();
        Person vanhin = null;

        for (int i = 0; i < listaPituus; i++) {

            Person hlo = people.get(i);
            int age = hlo.getAge();

            if (vanhin == null || age > vanhin.getAge()) {

                vanhin = hlo;

            }

        }
        return vanhin;
    }

    /**
     * Generates a formatted string from a list of Person objects, representing
     * their names. This method takes a list of Person objects and generates a
     * string that represents the names of the people in the list.
     *
     * The formatting of the resulting string depends on the number of people in the
     * list:
     *
     * - If the list is empty, an empty string is returned.
     * - If the list contains only one person, their name is returned ("Rachel").
     * - If the list contains two people, their names are joined with "and" in
     * between ("Rachel and Monica").
     * - If the list contains three people, all names are included and a comma is
     * used between first two names ("Rachel, Monica and Ross")
     * - If the list contains more than three people, the names of the first two
     * people are listed, followed by "and X others", where X is the number of
     * remaining people ("Rachel, Monica and 4 others").
     *
     * @param people A list of Person objects to generate the names string from.
     * @return A formatted string representing the names of people in the list.
     */
    public String generateNamesString(List<Person> people) {

        int listaPituus = people.size();
        String lista = "";

        if (listaPituus < 1) {

            return "";

        } else if (listaPituus == 1) {

            Person hlo = people.get(0);
            return hlo.getName();

        } else if (listaPituus == 2) {

            String hlo = people.get(0).getName() + " and " + people.get(1).getName();
            return hlo;

        } else if (listaPituus == 3) {

            String hlo = people.get(0).getName() + ", " + people.get(1).getName() + " and " + people.get(2).getName();
            return hlo;

        } else {

            String hlo = people.get(0).getName() + ", " + people.get(1).getName() + " and " + (listaPituus - 2)
                    + " others";
            return hlo;

        }

    }
}
