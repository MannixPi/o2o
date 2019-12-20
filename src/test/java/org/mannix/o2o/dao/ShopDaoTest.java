package org.mannix.o2o.dao;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;
import org.mannix.o2o.BaseTest;
import org.mannix.o2o.entity.Area;
import org.mannix.o2o.entity.PersonInfo;
import org.mannix.o2o.entity.Shop;
import org.mannix.o2o.entity.ShopCategory;
import org.springframework.beans.factory.annotation.Autowired;

public class ShopDaoTest extends BaseTest {
	@Autowired
	private ShopDao shopDao;
	
	@Test
	public void testInsertShop() {
		Shop shop = new Shop();
		PersonInfo owner = new PersonInfo();
		Area area = new Area();
		ShopCategory shopCategory = new ShopCategory();
		owner.setUserId(1L);
		area.setAreaId(2);
		shopCategory.setShopCategoryId(1L);
		shop.setOwner(owner);
		shop.setArea(area);
		shop.setShopCategory(shopCategory);
		shop.setShopName("测试的店铺");
		shop.setShopDesc("test");
		shop.setShopAddr("test");
		shop.setPhone("test");
		shop.setShopImg("test");
		shop.setCreateTime(new Date());
		shop.setEnableStatus(1);
		shop.setAdvice("审核中");
		int effectedNum = shopDao.insertShop(shop);
		assertEquals(1, effectedNum);
	}
}
