/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gambling_thing;
import org.junit.Test;
import org.junit.Assert;
/**
 *
 * @author summers
 */

public class Tests {
   
    @Test
    public void testLoseWhenBetBlack() {
        RouletteWheel wheel = new RouletteWheel();
        boolean win = wheel.bet(RouletteWheel.COLORS.BLACK);
        Assert.assertFalse(win);
    }
    
    @Test
    public void testWinWhenBetRed() {
        RouletteWheel wheel = new RouletteWheel();
        boolean win = wheel.bet(RouletteWheel.COLORS.RED);
        Assert.assertTrue(win);
    }
    
}
