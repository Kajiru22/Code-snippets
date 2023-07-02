package io.everyonecodes_optional_evaluation.artwork.Service;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import javax.validation.ConstraintViolationException;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@SpringBootTest
@SpringJUnitConfig
class TextServiceTest {

    @Autowired
    @MockBean
    private TextService textService;

    @Test
    void validateText_withValidText_returnsText() {
        String text = "hello";
        String result = textService.validateText(text);
        assertEquals(text, result);
    }

    @Test
    void validateText_withInvalidText_throwsException() {
        String text = "hi";
        assertThatExceptionOfType(ConstraintViolationException.class).isThrownBy(()-> textService.validateText(text));
    }

    @Test
    void validateText_withNullText_throwsException() {
        assertThatExceptionOfType(ConstraintViolationException.class).isThrownBy(() -> textService.validateText(null));
    }

    @Test
    void validateText_withMockedLengthValidation() {
        TextService textServiceSpy = spy(textService);
        doReturn("valid text").when(textServiceSpy).validateText(anyString());
        String result = textServiceSpy.validateText("any text");
        assertEquals("valid text", result);
        verify(textServiceSpy, times(1)).validateText(anyString());
    }
}






