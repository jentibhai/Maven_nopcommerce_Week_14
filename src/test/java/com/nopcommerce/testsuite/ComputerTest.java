package com.nopcommerce.testsuite;

import com.nopcommerce.pages.HomePage;
import com.nopcommerce.pages.Computer;
import com.nopcommerce.testbase.BaseTest;
import org.testng.annotations.Test;

public class ComputerTest extends BaseTest {

    Computer computer = new Computer();

    //..Computer
    @Test
    public void verifyProductArrangeInAlphaBaticalOrder() {
        computer.clickOnComputer();
        computer.clickOnDesktop();
        computer.sortProductZToA();

    }
}
