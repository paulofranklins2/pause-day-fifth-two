package com.pluralsight.thirdworkbook.collections;

import java.util.*;

class Pet {
    String name;
    String type;

    public Pet(String name, String type) {
        this.name = name;
        this.type = type;
    }
}

class Person {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class HashMapExercises {
    public static HashMap<String, String> dictionaryHashMap = new HashMap<>();
    public static HashMap<String, Integer> peopleAndAgeHashMap = new HashMap<>();
    public static HashMap<String, Pet> ownerAndPetHashMap = new HashMap<>();
    public static HashMap<String, ArrayList<Pet>> ownerAndPetListHashMap = new HashMap<>();


    //    🔹 1. HashMap with String → String
    public static void addWordAndMeaning(String s1, String s2) {
        dictionaryHashMap.put(s1, s2);
    }

    public static String retrieveWord(String word) {
        System.out.println("word: " + word + ", meaning: " + dictionaryHashMap.get(word));
        return dictionaryHashMap.get(word);
    }

    public static void replaceWordMeaning(String s1, String s2) {
        dictionaryHashMap.put(s1, s2);
    }

    public static boolean containsWord(String s1) {
        if (dictionaryHashMap.containsKey(s1)) {
            System.out.println(s1 + ", exist meaning: " + dictionaryHashMap.get(s1));
            return true;
        } else {
            System.out.println(s1 + " does not exist");
            return false;
        }
    }

    public static void printAllWords() {
        for (String word : dictionaryHashMap.keySet()) {
            System.out.println(word);
        }
    }

    public static void printAllMeanings() {
        for (String meaning : dictionaryHashMap.values()) {
            System.out.println(meaning);
        }
    }

    //🔹 2. HashMap with String → Integer
    public static void addPeopleAndAge(String name, int age) {
        peopleAndAgeHashMap.put(name, age);
    }

    public static void retrieveSomeoneAge(String name) {
        System.out.println(name + " is " + peopleAndAgeHashMap.get(name));
    }

    public static void increaseAge(String name) {
        peopleAndAgeHashMap.put(name, peopleAndAgeHashMap.get(name) + 1);
    }

    public static void removeSomeone(String name) {
        peopleAndAgeHashMap.remove(name);
    }

    public static void printAllPeopleAndAge() {
        for (Map.Entry<String, Integer> entry : peopleAndAgeHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    //🔹 3. HashMap with String → Pet object
    public static void addOwnerAndPet(String owner, Pet pet) {
        ownerAndPetHashMap.put(owner, new Pet(pet.name, pet.type));
    }

    public static void retrieveSomeonePet(String name) {
        System.out.println(name + " has " + ownerAndPetHashMap.get(name).name + " is a" + ownerAndPetHashMap.get(name).type);
    }

    public static void replacePet(String owner, Pet pet) {
        ownerAndPetHashMap.put(owner, new Pet(pet.name, pet.type));
    }

    public static void printAllOwnerAndPet() {
        for (Map.Entry<String, Pet> entry : ownerAndPetHashMap.entrySet()) {
            System.out.println(entry.getKey() + " pet: " + entry.getValue().name + " is a" + entry.getValue().type);
        }
    }

    //💖 From here on it gets tough! Be nice to yourself. You don't need to be able to do the next three exercises yet 💖//
    //🔹 4. HashMap with String → List<Pet>

    public static void addOwnerAndPetList(String owner, ArrayList<Pet> petList) {
        ownerAndPetListHashMap.put(owner, petList);
    }

    public static void printAllPetsFromOwner(String owner) {
        for (Pet pet : ownerAndPetListHashMap.get(owner)) {
            System.out.println(owner + " has " + pet.name + " is a " + pet.type);
            ;
        }
    }

    public static void addAPetToSomeoneList(String owner, Pet pet) {
        ownerAndPetListHashMap.get(owner).add(pet);
    }

    public static void removeAPetFromSomeoneList(String owner, String petName) {
        for (Pet pet : ownerAndPetListHashMap.get(owner)) {
            if (pet.name.equals(petName)) {
                ownerAndPetListHashMap.get(owner).remove(pet);
            }
        }
    }

    public static void printAllOwnersAndPets() {
        Set<String> owners = ownerAndPetListHashMap.keySet();
        for (String owner : owners) {
            for (Pet pet : ownerAndPetListHashMap.get(owner)) {
                System.out.println(owner + " has " + pet.name + " is a " + pet.type);
            }
        }
    }

    //🔹 5. HashMap with Person → List<Pet>


    public static void main(String[] args) {

        System.out.println("\uD83D\uDD39 1. HashMap with String → String");
        addWordAndMeaning("elated", "feeling very happy or joyful");
        addWordAndMeaning("meticulous", "showing great attention to detail");
        addWordAndMeaning("resilient", "able to recover quickly from difficulties");

        retrieveWord("elated");
        replaceWordMeaning("elated", "calm, peaceful, and untroubled");
        retrieveWord("elated");
        containsWord("meticulous");

        System.out.println("All Words Found");
        printAllWords();
        System.out.println("All Meanings Found");
        printAllMeanings();

        System.out.println("\uD83D\uDD39 2. HashMap with String → Integer");
        addPeopleAndAge("elated", 18);
        addPeopleAndAge("meticulous", 19);
        addPeopleAndAge("resilient", 20);
        addPeopleAndAge("something", 21);
        retrieveSomeoneAge("elated");
        increaseAge("elated");
        retrieveSomeoneAge("elated");
        removeSomeone("elated");
        printAllPeopleAndAge();

        System.out.println("\uD83D\uDD39 3. HashMap with String → Pet object");
        addOwnerAndPet("blabla", new Pet("elated", "cat"));
        addOwnerAndPet("bleble", new Pet("meticulous", "dog"));
        addOwnerAndPet("blibli", new Pet("resilient", "pig"));

        retrieveSomeonePet("blabla");
        replacePet("blabla", new Pet("XXXX", "dog"));
        printAllOwnerAndPet();

        System.out.println("\uD83D\uDC96 From here on it gets tough! Be nice to yourself. You don't need to be able to do the next three exercises yet \uD83D\uDC96");
        System.out.println("\uD83D\uDD39 4. HashMap with String → List<Pet>");

        addOwnerAndPetList("paulo", new ArrayList<Pet>(Arrays.asList(new Pet("Harley", "Dog"), new Pet("X", "imaginary"))));
        addOwnerAndPetList("ryan", new ArrayList<Pet>(Arrays.asList(new Pet("YY", "Dog"))));
        addOwnerAndPetList("wilmer", new ArrayList<Pet>(Arrays.asList(new Pet("XX", "Dog"), new Pet("ZZ", "imaginary"))));
        printAllPetsFromOwner("paulo");
        addAPetToSomeoneList("paulo", new Pet("You know who", "You know who"));
        printAllPetsFromOwner("paulo");
        removeAPetFromSomeoneList("paulo", "X");
        System.out.println();
        printAllPetsFromOwner("paulo");

        System.out.println();
        printAllOwnersAndPets();

        System.out.println("\uD83D\uDD39 5. HashMap with Person → List<Pet>");
    }
}
