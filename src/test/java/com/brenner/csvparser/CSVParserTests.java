package com.brenner.csvparser;

import com.brenner.csvparser.helpers.CSVParser;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class CSVParserTests {
    @Test
    public void NoCommasInText(){
        String val1 = "Ixalan";
        String val2 = "Dominaria";
        String val3 = "Ravnica";
        String csv = val1 + "," + val2 + "," + val3;
        List<String> target = new ArrayList<>();
        target.add(val1);
        target.add(val2);
        target.add(val3);

        CSVParser csvParser = new CSVParser();
        List<String> result = csvParser.parseCSV(csv);
        assertEquals(result, target);
    }

    @Test
    public void CommasInText(){
        String val1 = "\"Ixalan, NO\"";
        String val2 = "\"Dominaria, YES\"";
        String val3 = "\"Ravnica, YES\"";
        String csv = val1 + "," + val2 + "," + val3;
        List<String> target = new ArrayList<>();
        target.add(val1);
        target.add(val2);
        target.add(val3);

        CSVParser csvParser = new CSVParser();
        List<String> result = csvParser.parseCSV(csv);
        assertEquals(result, target);
    }

}
