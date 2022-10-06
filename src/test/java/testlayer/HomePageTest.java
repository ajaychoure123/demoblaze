package testlayer;

import org.testng.annotations.Test;

import testbase.BaseClass;

public class HomePageTest extends BaseClass{

	@Test
	
	public void verifyBuySamsungGalaxy6()
	{
	h.ClickOnPhones();
	h.buySamsungGalaxy6();
	util.addtocart();
	}
	@Test
	public void verifybuyNokialumia1520()
	{
	h.ClickOnPhones();
	h.buySamsungGalaxy6();
	util.addtocart();
	}
	@Test
	public void verifybuyNexus6()
	{
	h.ClickOnPhones();
	h.buyNexus6();
	util.addtocart();
	}
	@Test
	public void verifybuySamsunggalaxys7()
	{
	h.ClickOnPhones();
	h.buySamsunggalaxys7();
	util.addtocart();
}
}