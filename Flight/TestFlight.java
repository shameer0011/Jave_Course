package com.Exam.Flight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestFlight {
    public List<Flight> a;

    public TestFlight() {
        a = new ArrayList<>(Arrays.asList(
                new Flight("FL001", "cochi", "tvm", 678.0),
                new Flight("FL002", "kozhikoode", "cochi", 1000.0)));
    }

    public List<Flight> searchFlights(String source, String target) {
        return a.stream()
                .filter(e -> source.equalsIgnoreCase(e.getSource()) &&
                        target.equalsIgnoreCase(e.getDestination()))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        TestFlight testflight = new TestFlight();
        List<Flight> r = testflight.searchFlights("cochi", "tvm");
        System.out.println(r);
    }

}
