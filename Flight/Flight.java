package com.Exam.Flight;

public class Flight {
    String flightNumber;
    String source;
    String destination;
    Double price;

    public Flight() {
    }

    public Flight(String flightNumber, String source, String destination, Double price) {
        this.flightNumber = flightNumber;
        this.source = source;
        this.destination = destination;
        this.price = price;
    }

    public String getFlightNumber() {
        return this.flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getSource() {
        return this.source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return this.destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Flight flightNumber(String flightNumber) {
        setFlightNumber(flightNumber);
        return this;
    }

    public Flight source(String source) {
        setSource(source);
        return this;
    }

    public Flight destination(String destination) {
        setDestination(destination);
        return this;
    }

    public Flight price(Double price) {
        setPrice(price);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
                " flightNumber='" + getFlightNumber() + "'" +
                ", source='" + getSource() + "'" +
                ", destination='" + getDestination() + "'" +
                ", price='" + getPrice() + "'" +
                "}";
    }

}
