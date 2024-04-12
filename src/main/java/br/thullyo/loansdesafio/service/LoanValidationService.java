package br.thullyo.loansdesafio.service;

import br.thullyo.loansdesafio.dto.LoanDTO;
import br.thullyo.loansdesafio.dto.LoanRequest;
import br.thullyo.loansdesafio.dto.LoanResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoanValidationService {
    public LoanResponse validateLoan(LoanRequest request) {
        String customer = request.name();
        List<LoanDTO> listLoan = new ArrayList<>();

        if (request.income() <= 3000 || request.income() >= 3000 && request.income() <= 5000){
            listLoan.add(new LoanDTO("PERSONAL",4));
        }

        if (request.income() <= 3000){
            listLoan.add(new LoanDTO("GUARANTEED", 3));
        } else {
            if (request.income() >= 3000 && request.income() <= 5000 && request.age() < 30 && request.location().equals("SP")){
                listLoan.add(new LoanDTO("GUARANTEED", 3));
            }
        }

        if (request.income() >= 5000){
            listLoan.add(new LoanDTO("CONSIGNMENT",2));
        }


        LoanResponse loanResponse = new LoanResponse(customer, listLoan);
        return loanResponse;
    }
}
