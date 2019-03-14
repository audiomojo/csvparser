package com.brenner.csvparser.services;

import com.brenner.csvparser.helpers.CSVParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CSVService {

    @Autowired
    CSVParser csvParser;

    public String translateCSV(String csv) {
        String response = null;
        List<String> csvData = csvParser.parseCSV(csv);


        return response;
    }
}
