import org.junit.jupiter.api.*;
import ru.netology.Contact;
import ru.netology.PhoneBook;

import java.util.*;

public class PhoneBookTest {
    Contact vlad;
    Contact ivan;

    @BeforeEach
    public void init() {
        this.vlad = new Contact("Иванов Влад", "+7 912-345-67-89");
        this.ivan = new Contact("Петров Иван", "+7 912-345-89-67");
        PhoneBook.creatGroup("Семья");
        PhoneBook.addNote("Семья", ivan);
        PhoneBook.addNote("Семья", vlad);
    }

    @BeforeEach
    public void started() {
        System.out.println("Запуск теста");
    }

    @AfterEach
    public void ended() {
        System.out.println("Тест завершен");
        System.out.println("\n");
    }

    @Test
    public void test_getСontactByName_PhoneBook() {
        // arrange
        // все исходные данные вынес в BeforeEach

        // act
        Contact result = PhoneBook.getСontactByName("Иванов Влад");

        // assert
        Assertions.assertEquals(vlad, result);
    }

    @Test
    public void test_getСontactByPhone_PhoneBook() {
        // arrange
        // все исходные данные вынес в BeforeEach

        // act
        Contact result = PhoneBook.getСontactByPhone("+7 912-345-67-89");

        // assert
        Assertions.assertEquals(vlad, result);
    }

    @Test
    public void test_addNote_PhoneBook() {
        // arrange
        // исходные данные частично вынесены в BeforeEach
        Map<String, List<Contact>> note = new HashMap<>();
        note.put("Семья", new ArrayList<>());
        note.get("Семья").add(ivan);
        note.get("Семья").add(vlad);

        // act
        // метод выполняется в исходных данных

        // assert
        Assertions.assertEquals(PhoneBook.note, note);
    }

}
