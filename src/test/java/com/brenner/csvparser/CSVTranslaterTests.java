package com.brenner.csvparser;

import com.brenner.csvparser.services.CSVService;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class CSVTranslaterTests {


    @Test
    public void NoCommasInText(){
        String val1 = "Ixalan";
        String val2 = "Dominaria";
        String val3 = "Ravnica";
        String csv = val1 + "," + val2 + "," + val3;
        String target = "[" + val1 + "][" + val2 + "][" + val3 + "]";

        CSVService csvService = new CSVService();
        String result = csvService.translateCSV(csv);
        assertEquals(result, target);
    }
}
