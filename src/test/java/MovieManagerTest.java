import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.filmManager.*;

public class MovieManagerTest {
    @Test
    public void addMovieTest() {

        MovieManager manager = new MovieManager();

        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Отель 'Белград'");
        manager.addMovie("Джентльмены");
        manager.addMovie("Тролли: мировой тур");
        manager.addMovie("Номер один");
        manager.addMovie("Человек-невидимка");
        manager.addMovie("Аватар: путь воды");
        manager.addMovie("Рубикон");
        manager.addMovie("Дочь короля");
        manager.addMovie("Человек из Торонто");
        manager.addMovie("Достатть ножи: стеклянная луковица");

        String[] expected = {"Бладшот", "Вперед", "Отель 'Белград'", "Джентльмены", "Тролли: мировой тур", "Номер один", "Человек-невидимка", "Аватар: путь воды", "Рубикон", "Дочь короля", "Человек из Торонто", "Достатть ножи: стеклянная луковица"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastMoviesTest() {

        MovieManager manager = new MovieManager();

        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Отель 'Белград'");
        manager.addMovie("Джентльмены");
        manager.addMovie("Тролли: мировой тур");
        manager.addMovie("Номер один");
        manager.addMovie("Человек-невидимка");
        manager.addMovie("Аватар: путь воды");
        manager.addMovie("Рубикон");
        manager.addMovie("Дочь короля");
        manager.addMovie("Человек из Торонто");
        manager.addMovie("Достатть ножи: стеклянная луковица");

        String[] expected = {"Достатть ножи: стеклянная луковица", "Человек из Торонто", "Дочь короля", "Рубикон", "Аватар: путь воды", "Человек-невидимка", "Номер один", "Тролли: мировой тур", "Джентльмены", "Отель 'Белград'"};
        String[] actual = manager.findLast(10);

        Assertions.assertArrayEquals(expected, actual);
    }
}
