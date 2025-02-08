package com.Exam.Transactions;

public class Transction {
    Integer Id;
    String type;
    Long Amount;

    public Transction() {
    }

    public Transction(Integer Id, String type, Long Amount) {
        this.Id = Id;
        this.type = type;
        this.Amount = Amount;
    }

    public Integer getId() {
        return this.Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getAmount() {
        return this.Amount;
    }

    public void setAmount(Long Amount) {
        this.Amount = Amount;
    }

    public Transction Id(Integer Id) {
        setId(Id);
        return this;
    }

    public Transction type(String type) {
        setType(type);
        return this;
    }

    public Transction Amount(Long Amount) {
        setAmount(Amount);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
                " Id='" + getId() + "'" +
                ", type='" + getType() + "'" +
                ", Amount='" + getAmount() + "'" +
                "}";
    }

}
