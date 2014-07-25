package com.github.ogstation.credit.controller;

import com.github.ogstation.credit.domain.AddCredit;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

import static org.springframework.http.HttpStatus.OK;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class CreditController
{

    @RequestMapping(value = "/api/credit", method = POST)
    public ResponseEntity<String> add(@Valid @RequestBody AddCredit addCredit)
    {
        return new ResponseEntity<String>(OK);
    }
}
