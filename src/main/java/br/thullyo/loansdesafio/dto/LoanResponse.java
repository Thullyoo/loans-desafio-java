package br.thullyo.loansdesafio.dto;

import java.util.List;

public record LoanResponse(String customer,
                           List<LoanDTO> loans

                           ) {
}
