package ru.netology;

import java.util.Comparator;

public class Contact {
    String name;
    String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String toString() {

        return "Имя: " + name + "\nТел. - " + phoneNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Contact guest = (Contact) obj;
        if(name == guest.name && phoneNumber == guest.phoneNumber){
            return true;
        }
        else {
            return false;
        }
    }
}
