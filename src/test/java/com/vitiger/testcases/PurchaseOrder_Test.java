package com.vitiger.testcases;

import org.testng.annotations.Test;

import com.vtiger.Pompages.CreatePurchaseOrder;
import com.vtiger.Pompages.Home;
import com.vtiger.genericlibraries.BaseClass;

public class PurchaseOrder_Test extends BaseClass {
	
@Test
public void PurchaseOrder() throws Throwable {
Home h1=new Home(driver);
h1.getMore().click();

h1.getPurchaseOrder().click();

utilities.waitForPageToLoad(driver);
CreatePurchaseOrder cp=new CreatePurchaseOrder(driver);

utilities.waitForPageToLoad(driver);

cp.CreatePurchaseOrdermethod("veni");



}
}
