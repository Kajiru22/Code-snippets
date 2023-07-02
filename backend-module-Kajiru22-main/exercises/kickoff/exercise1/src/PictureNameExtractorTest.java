import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


class PictureNameExtractorTest {
    PictureNameExtractor pictureNameExtractor = new PictureNameExtractor();

    @ParameterizedTest
    @MethodSource("parameter")
    public void testExtract(String input, String expected) {
        String result = pictureNameExtractor.extract(input);
        Assertions.assertEquals(result,expected);
    }

    static Stream<Arguments> parameter() {
        return Stream.of(
                Arguments.of("20210202-Pic-cleaned-string.jpg", "cleaned string"),
                Arguments.of("Pic-20210202-cleaned-string.jpg", "cleaned string"),
                Arguments.of("20210202-cleaned-string-Pic.jpg", "cleaned string"),
                Arguments.of("20210202-Pic.jpg", ""),
                Arguments.of("Pic.jpg", ""),
                Arguments.of("20210202.jpg", ""),
                Arguments.of(".jpg", ""),
                Arguments.of("", "")
        );
    }
    //testing purpose
}