package ru.netology;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Map;
import java.util.TreeMap;

public class MissedCalls {
    static Map<LocalDateTime, String> missedCalls = new TreeMap<>();


    public static void putMissedCalls(String phoneNumber) {
        missedCalls.put(LocalDateTime.now(), phoneNumber);
    }

    public static void printMissedCalls() {
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        if (!missedCalls.keySet().isEmpty()) {
            for (LocalDateTime key : missedCalls.keySet()) {

                if (PhoneBook.getСontactByPhone(missedCalls.get(key)) == null) {
                    System.out.println("\n" + key.format(formatter) + " пропущен вызов от:\n" + missedCalls.get(key));
                } else {
                    System.out.println("\n" + key.format(formatter) + " пропущен вызов от:\n" + PhoneBook.getСontactByPhone(missedCalls.get(key)));
                }
            }
        }
    }

}