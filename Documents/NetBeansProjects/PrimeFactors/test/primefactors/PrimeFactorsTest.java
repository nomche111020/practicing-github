/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primefactors;

import java.util.List;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

/**
 *
 * @author test
 */
public class PrimeFactorsTest extends TestCase{

    
    private List<Integer> list(int... ints){
        List<Integer> list = new ArrayList<Integer>();
        for(int i: ints)
            list.add(i);
        return list;
    }
    
    @Test    
    public void textOne() throws Exception{
        assertEquals(list(), PrimeFactors.generate(1));
    }
    
    @Test
    public void textTwo() throws Exception{
        assertEquals(list(2), PrimeFactors.generate(2));
    }

}
