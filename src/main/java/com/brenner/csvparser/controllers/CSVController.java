package com.brenner.csvparser.controllers;

import com.brenner.csvparser.services.CSVService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/csv")
public class CSVController {
    @Autowired
    CSVService csvService;

    @RequestMapping("/translateCSV")
    public String translateCSV(@RequestParam(value = "csv") String csv) {
        return csvService.translateCSV(csv);
    }
}
