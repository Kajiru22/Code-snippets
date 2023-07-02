package io.everyonecodes.booster.evaluation.udemy_users.endpoint;

import io.everyonecodes.booster.evaluation.udemy_users.endpoint.LoginEndpoint;
import io.everyonecodes.booster.evaluation.udemy_users.service.LoginService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.mockito.Mockito.when;

@WebMvcTest(LoginEndpoint.class)
public class LoginEndpointTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private LoginService loginService;

    @Test
    @WithMockUser(roles = "STUDENT")
    void login_ReturnsLoginServiceMessage() throws Exception {
        String expectedMessage = "Test Message";
        when(loginService.getMessage()).thenReturn(expectedMessage);

        mockMvc.perform(MockMvcRequestBuilders.get("/login"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(expectedMessage));
    }
}