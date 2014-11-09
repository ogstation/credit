package com.github.ogstation.credit.controller;

import com.github.ogstation.credit.domain.Credit;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

import static com.github.ogstation.credit.helper.RestURIConstants.ADD_CREDIT;
import static org.springframework.http.HttpStatus.OK;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class CreditController
{

    @RequestMapping(value = ADD_CREDIT, method = POST)
    public ResponseEntity<String> add(@Valid @RequestBody Credit credit)
    {
        return new ResponseEntity<String>(OK);
    }
}
