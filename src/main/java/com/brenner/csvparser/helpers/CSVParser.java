package com.brenner.csvparser.helpers;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class CSVParser {
    public List<String> parseCSV(String csv) {
        String[] response = csv.split(",");
        return Arrays.asList(response);
    }
}
