package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void WhenRomanIs_Null_then_ThrowExeption() {
        assertThrows(IllegalArgumentException.class, () -> {
            Converter.romanToInt(null);
        });
        Exception exception = Assertions.assertThrows(Exception.class, () -> {
            Converter.romanToInt(null);
        });
        Assertions.assertSame(IllegalArgumentException.class, exception.getClass());
        Assertions.assertEquals("Invalid roman", exception.getMessage());

    }

    @Test
    public void WhenRomanIs_Empty_then_ThrowExeption() {
        assertThrows(IllegalArgumentException.class, () -> {
            Converter.romanToInt("");
        });
        Exception exception = Assertions.assertThrows(Exception.class, () -> {
            Converter.romanToInt("");
        });
        Assertions.assertSame(IllegalArgumentException.class, exception.getClass());
        Assertions.assertEquals("Invalid roman", exception.getMessage());

    }

    @Test
    public void WhenRomanIs_Number_then_ThrowExeption() {
        assertThrows(IllegalArgumentException.class, () -> {
            Converter.romanToInt("3");
        });
        Exception exception = Assertions.assertThrows(Exception.class, () -> {
            Converter.romanToInt("3");
        });
        Assertions.assertSame(IllegalArgumentException.class, exception.getClass());
        Assertions.assertEquals("Invalid roman", exception.getMessage());

    }

    @Test
    public void WhenRomanIs_NotValidLetter_then_ThrowExeption() {
        assertThrows(IllegalArgumentException.class, () -> {
            Converter.romanToInt("hfgg");
        });
        Exception exception = Assertions.assertThrows(Exception.class, () -> {
            Converter.romanToInt("hfgg");
        });
        Assertions.assertSame(IllegalArgumentException.class, exception.getClass());
        Assertions.assertEquals("Invalid roman", exception.getMessage());

    }

    @Test
    public void WhenRomanIs_LowercseLetter_then_ThrowExeption() {
        assertThrows(IllegalArgumentException.class, () -> {
            Converter.romanToInt("xii");
        });
        Exception exception = Assertions.assertThrows(Exception.class, () -> {
            Converter.romanToInt("xii");
        });
        Assertions.assertSame(IllegalArgumentException.class, exception.getClass());
        Assertions.assertEquals("Invalid roman", exception.getMessage());

    }

    @Test
    public void WhenRomanIs_SpecialCharacters_then_ThrowExeption() {
        assertThrows(IllegalArgumentException.class, () -> {
            Converter.romanToInt("!^#&");
        });
        Exception exception = Assertions.assertThrows(Exception.class, () -> {
            Converter.romanToInt("!^#&");
        });
        Assertions.assertSame(IllegalArgumentException.class, exception.getClass());
        Assertions.assertEquals("Invalid roman", exception.getMessage());

    }

    @Test
    public void WhenRomanIs_UkrLetter_then_ThrowExeption() {
        assertThrows(IllegalArgumentException.class, () -> {
            Converter.romanToInt("ХІІ");
        });
        Exception exception = Assertions.assertThrows(Exception.class, () -> {
            Converter.romanToInt("ХІІ");
        });
        Assertions.assertSame(IllegalArgumentException.class, exception.getClass());
        Assertions.assertEquals("Invalid roman", exception.getMessage());

    }

    @Test
    public void WhenRomanIs_UncorrectRoman_then_ThrowExeption() {
        assertThrows(IllegalArgumentException.class, () -> {
            Converter.romanToInt("IIXX");
        });
        Exception exception = Assertions.assertThrows(Exception.class, () -> {
            Converter.romanToInt("IIXX");
        });
        Assertions.assertSame(IllegalArgumentException.class, exception.getClass());
        Assertions.assertEquals("Invalid roman", exception.getMessage());

    }


    /*@Test
    public void WHenTest(){
        assertThrows(IllegalArgumentException.class, () ->{
            Converter.romanToInt(null);
        });
    }*/

}
