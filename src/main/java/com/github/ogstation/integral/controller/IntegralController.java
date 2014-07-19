package com.github.ogstation.integral.controller;

import com.github.ogstation.integral.domain.AddIntegral;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

import static org.springframework.http.HttpStatus.OK;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class IntegralController
{

    @RequestMapping(value = "/api/integral", method = POST)
    public ResponseEntity<String> add(@Valid @RequestBody AddIntegral addIntegral)
    {
        return new ResponseEntity<String>(OK);
    }
}
