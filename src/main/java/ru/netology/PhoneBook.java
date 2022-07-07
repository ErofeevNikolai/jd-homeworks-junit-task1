package ru.netology;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    public static Map<String, List<Contact>> note = new HashMap<>();

    public static void creatGroup(String groups) {
        note.put(groups, new ArrayList<>());
    }

    public static void addNote(String groups, Contact contact) {
        note.get(groups).add(contact);
    }

    public static void printNote() {
        if (!note.keySet().isEmpty()) {
            for (String key : note.keySet()) {
                System.out.println(key.toUpperCase());
                for (Contact contact : note.get(key)) {
                    System.out.println(contact);
                }
            }
        }
    }

    public static Contact getСontactByName(String name) {
        if (!note.keySet().isEmpty()) {
            for (String key : note.keySet()) {
                for (Contact contact : note.get(key)) {
                    if (name.equals(contact.name)) {
                        return contact;
                    }
                }

            }
        }
        System.out.println("Контакт не найден");
        return null;
    }

    public static Contact getСontactByPhone(String phoneNumber) {
        if (!note.keySet().isEmpty()) {
            for (String key : note.keySet()) {
                for (Contact contact : note.get(key)) {
                    if (phoneNumber.equals(contact.phoneNumber)) {
                        return contact;
                    }
                }

            }
        }
        return null;
    }

}