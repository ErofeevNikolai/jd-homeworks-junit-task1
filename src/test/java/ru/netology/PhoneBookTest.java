package ru.netology;

import org.junit.jupiter.api.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PhoneBookTest {
    private Contact vlad;
    private Contact ivan;
    private PhoneBook phonBook;

    @BeforeEach
    public void init() {
        this.phonBook = new PhoneBook();
        this.vlad = new Contact("Иванов Влад", "+7 912-345-67-89");
        this.ivan = new Contact("Петров Иван", "+7 912-345-89-67");
        phonBook.creatGroup("Семья");
        phonBook.addNote("Семья", ivan);
        phonBook.addNote("Семья", vlad);
    }

    @BeforeEach
    public void started() {
        System.out.println("Запуск теста");
    }

    @AfterEach
    public void ended() {
        System.out.println("Тест завершен");
    }

    @Test
    public void testGetСontactByNamePhoneBook() {
        // arrange
        // все исходные данные вынес в BeforeEach

        // act
        Contact result = phonBook.getСontactByName("Иванов Влад");

        // assert
        assertEquals(vlad, result);
    }

    @Test
    public void testGetСontactByPhonePhoneBook() {
        // arrange
        // все исходные данные вынес в BeforeEach

        // act
        Contact result = phonBook.getСontactByPhone("+7 912-345-67-89");

        // assert
        assertEquals(vlad, result);
    }

    @Test
    public void testAddNotePhoneBook() {
        // arrange
        // исходные данные частично вынесены в BeforeEach
        Map<String, List<Contact>> note = new HashMap<>();
        note.put("Семья", new ArrayList<>());
        note.get("Семья").add(ivan);
        note.get("Семья").add(vlad);

        // act
        // метод выполняется в исходных данных

        // assert
        assertEquals(phonBook.note, note);
    }

}
