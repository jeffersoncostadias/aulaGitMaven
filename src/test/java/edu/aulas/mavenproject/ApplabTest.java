/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.aulas.mavenproject;

import org.junit.Test;
import static org.junit.Assert.*;

public class ApplabTest{
       public ApplabTest() { }
/**
* Test oflerJSONmethod, ofclassAppLab.
*/
    @Test
    public void testLerJSON() throws Exception{
        System.out.println("lerJSON");
        String url = "http://time.jsontest.com/"; // esta URL gera um conteúdo JSON
        String result = Applab.lerJSON(url);
        assertTrue(result.length() > 0);
}
}