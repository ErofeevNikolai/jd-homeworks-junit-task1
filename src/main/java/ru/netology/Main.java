package ru.netology;


import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Contact Vlad = new Contact("Иванов Влад", "+7 912-345-67-89");
        Contact Ivan = new Contact("Петров Иван", "+7 912-345-89-67");
        Contact Irina = new Contact("Авдеева Ирина", "+7 922-345-67-89");

        //Добавляем группы.
        PhoneBook.creatGroup("Семья");
        PhoneBook.creatGroup("Работа");
        PhoneBook.creatGroup("Друзья");

        //В группы добавляем контакты.
        PhoneBook.addNote("Семья", Vlad);
        PhoneBook.addNote("Семья", Irina);
        PhoneBook.addNote("Работа", Irina);
        PhoneBook.addNote("Работа", Ivan);
        PhoneBook.addNote("Друзья", Ivan);

        //Добавляем пропущенные вызовы
        MissedCalls.putMissedCalls("+7 912-345-89-67");
        TimeUnit.SECONDS.sleep(2);
        MissedCalls.putMissedCalls("+7 912-345-89-67");
        TimeUnit.SECONDS.sleep(2);
        MissedCalls.putMissedCalls("+7 912-345-67-89");
        TimeUnit.SECONDS.sleep(2);
        MissedCalls.putMissedCalls("+7 912-345-67-79");

        //Выводим на печать
        MissedCalls.printMissedCalls();
    }
}