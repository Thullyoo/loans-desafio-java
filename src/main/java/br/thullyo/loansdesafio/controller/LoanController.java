package br.thullyo.loansdesafio.controller;

import br.thullyo.loansdesafio.dto.LoanRequest;
import br.thullyo.loansdesafio.dto.LoanResponse;
import br.thullyo.loansdesafio.service.LoanValidationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/customer-loans")
public class LoanController {

    private final LoanValidationService loanValidationService;

    public LoanController(LoanValidationService service){
        this.loanValidationService = service;
    }

    @PostMapping
    public ResponseEntity<LoanResponse> validateLoan(@RequestBody LoanRequest request){
        LoanResponse listLoan = loanValidationService.validateLoan(request);
        return ResponseEntity.ok(listLoan);
    }
}
