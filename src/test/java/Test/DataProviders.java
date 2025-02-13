package Test;

import org.testng.annotations.DataProvider;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class DataProviders {

    private static final Random random = new Random();

    private String generateNumberOfLength(int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(random.nextInt(10));
        }
        return sb.toString();
    }

    @DataProvider(name = "forNameField")
    public Object [][] nameField() {

        return new Object[][]{
                {""},
                {(RandomStringUtils.randomAlphabetic(1))},
                {(RandomStringUtils.randomAlphabetic(2))},
                {(RandomStringUtils.randomAlphabetic(256))},
                {(RandomStringUtils.randomAlphabetic(257))},

        };
    }

    @DataProvider(name = "forPriceField")
    public Object [][] numberField() {

        return new Object[][]{
                {""},
                {generateNumberOfLength(1)},
                {generateNumberOfLength(2)},
                {generateNumberOfLength(256)},
                {generateNumberOfLength(257)},
                {generateNumberOfLength(512)},
                {generateNumberOfLength(513)},
                { "10.99"},
                { "0.00"},
                { "10000"},
                { "-5.00"},
                { "abc"},
        };
    }

    @DataProvider(name = "forDescField")
    public Object [][] descField() {

        return new Object[][]{
                {""},
                {(RandomStringUtils.randomAlphabetic(1))},
                {(RandomStringUtils.randomAlphabetic(2))},
                {(RandomStringUtils.randomAlphabetic(512))},
                {(RandomStringUtils.randomAlphabetic(513))},

        };
    }

    @DataProvider(name = "imageUrlProvider")
    public Object[][] imageUrlProvider() {
        return new Object[][] {
                {""},
                {"https://example.com/image.jpg"},
                {"http://example.com/image.png"},
                {"ftp://example.com/image.gif"},
                {"https://example.com/image"},
                {"https://example.com/image."},
                {"http://example.com/image.jpeg"},
                {"example.com/image.jpg"},
                {"https://example.com/image.jpg"},
                {"https://example.com/image.pdf"},
        };
    }
}
