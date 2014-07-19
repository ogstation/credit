package com.github.ogstation.integral.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.ogstation.integral.domain.AddIntegral;
import com.github.ogstation.integral.domain.GasStation;
import com.github.ogstation.integral.domain.Member;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;

import java.math.BigDecimal;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

public class AddIntegralControllerTest
{
    private MockMvc mockMvc;

    @InjectMocks
    private IntegralController integralController;

    @Before
    public void setUp() throws Exception
    {
        MockitoAnnotations.initMocks(this);
        this.mockMvc = standaloneSetup(integralController).build();
    }

    @Test
    public void should_be_able_to_add_integral() throws Exception
    {
        // given
        AddIntegral addIntegral = new AddIntegral();
        Member member = new Member();
        member.setEmail("test@test.com");
        addIntegral.setMember(member);
        GasStation gasStation = new GasStation();
        gasStation.setName("gas station");
        addIntegral.setGasStation(gasStation);
        addIntegral.setAmount(new BigDecimal(500));

        // when

        // then
        this.mockMvc.perform(post("/api/integral")
                .contentType(APPLICATION_JSON)
                .content(new ObjectMapper().writeValueAsString(addIntegral)))
                .andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    public void should_be_able_to_return_bad_request_error_if_member_is_not_here() throws Exception
    {
        // given
        AddIntegral addIntegral = new AddIntegral();
        GasStation gasStation = new GasStation();
        gasStation.setName("gas station");
        addIntegral.setGasStation(gasStation);
        addIntegral.setAmount(new BigDecimal(500));

        // when

        // then
        this.mockMvc.perform(post("/api/integral")
                .contentType(APPLICATION_JSON)
                .content(new ObjectMapper().writeValueAsString(addIntegral)))
                .andDo(print())
                .andExpect(status().isBadRequest());
    }
}
