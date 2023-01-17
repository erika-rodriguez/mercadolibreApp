package com.TrainingCycleSolvdArg.carina.demo;

import com.TrainingCycleSolvdArg.carina.demo.mobile.gui.common.HomeScreenBase;
import com.TrainingCycleSolvdArg.carina.demo.mobile.gui.common.MenuCatalogBase;
import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.zebrunner.agent.core.annotation.TestLabel;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMercadoLibre implements IAbstractTest {
    @Test
    @MethodOwner(owner = "MobileTrainingCycle")
    @TestLabel(name = "othername", value = {"mobile", "practice"})
    public void testClickOnMenuIcon() {
        HomeScreenBase homeScreen = initPage(getDriver(), HomeScreenBase.class);
        MenuCatalogBase menu = homeScreen.clickOnMenuIcon();
        String miCuentatext = menu.getCuentaText();

        Assert.assertEquals(miCuentatext,"Buscar en Mercado Libre","The text was not found");
    }


}
