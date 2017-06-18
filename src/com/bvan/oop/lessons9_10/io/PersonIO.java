package com.bvan.oop.lessons9_10.io;

import com.bvan.oop.common.Person;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author bvanchuhov
 */
public class PersonIO {

    public static void main(String[] args) {
        try {
            Person person = readPersonFromFile("files/person.txt");
            System.out.println(person);
        } catch (FileNotFoundException e) {
            System.out.println("Sorry, file not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Sorry, IO error: " + e.getMessage());
        }
    }

    /**
     * @throws IOException
     * @throws FileNotFoundException
     */
    public static Person readPersonFromFile(String fileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = reader.readLine();
            return parsePerson(line);
        }
    }

    private static Person parsePerson(String line) {
        String[] tokens = line.split(";");
        String name = tokens[0];
        int age = Integer.parseInt(tokens[1]);
        return new Person(name, age);
    }
}
