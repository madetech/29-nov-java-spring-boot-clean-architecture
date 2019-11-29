package com.learntech.horsefacts;

import com.learntech.horsefacts.core.interfaces.IGetHorseFactUseCase;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class HorsefactsApplicationTests {
    @Autowired
    MockMvc mockMvc;

    @MockBean
    IGetHorseFactUseCase getHorseFactUseCase;

    @Test
    void canGetASingleHorseFact() throws Exception {
        given(getHorseFactUseCase.execute()).willReturn("A random horse fact");

        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(content().string("A random horse fact"));
    }

    @Test
    void canGetAnotherHorseFact() throws Exception {
        given(getHorseFactUseCase.execute()).willReturn("Another horse fact");

        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(content().string("Another horse fact"));
    }
}
