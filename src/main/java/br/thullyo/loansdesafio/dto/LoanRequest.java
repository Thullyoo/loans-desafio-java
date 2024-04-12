package br.thullyo.loansdesafio.dto;

public record LoanRequest(Integer age,
                          String cpf,
                          String name,
                          Double income,
                          String location


) {
    @Override
    public Integer age() {
        return age;
    }

    @Override
    public Double income() {
        return income;
    }

    @Override
    public String location() {
        return location;
    }
}
