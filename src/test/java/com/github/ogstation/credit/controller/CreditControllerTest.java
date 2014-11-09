package com.github.ogstation.credit.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.ogstation.credit.domain.Credit;
import com.github.ogstation.credit.domain.GasStation;
import com.github.ogstation.credit.domain.Member;
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

public class CreditControllerTest
{
    private MockMvc mockMvc;

    @InjectMocks
    private CreditController creditController;

    @Before
    public void setUp() throws Exception
    {
        MockitoAnnotations.initMocks(this);
        this.mockMvc = standaloneSetup(creditController).build();
    }

    @Test
    public void should_be_able_to_add_integral() throws Exception
    {
        // given
        Credit credit = new Credit();
        Member member = new Member();
        member.setEmail("test@test.com");
        credit.setMember(member);
        GasStation gasStation = new GasStation();
        gasStation.setName("gas station");
        credit.setGasStation(gasStation);
        credit.setAmount(new BigDecimal(500));

        // when

        // then
        this.mockMvc.perform(post("/api/credit")
                .contentType(APPLICATION_JSON)
                .content(new ObjectMapper().writeValueAsString(credit)))
                .andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    public void should_be_able_to_return_bad_request_error_if_member_is_not_here() throws Exception
    {
        // given
        Credit credit = new Credit();
        GasStation gasStation = new GasStation();
        gasStation.setName("gas station");
        credit.setGasStation(gasStation);
        credit.setAmount(new BigDecimal(500));

        // when

        // then
        this.mockMvc.perform(post("/api/credit")
                .contentType(APPLICATION_JSON)
                .content(new ObjectMapper().writeValueAsString(credit)))
                .andDo(print())
                .andExpect(status().isBadRequest());
    }
}
