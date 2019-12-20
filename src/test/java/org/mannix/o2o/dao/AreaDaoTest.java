package org.mannix.o2o.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.mannix.o2o.BaseTest;
import org.mannix.o2o.entity.Area;
import org.springframework.beans.factory.annotation.Autowired;

public class AreaDaoTest extends BaseTest {
	@Autowired
	private AreaDao areaDao;
	
	@Test
	public void testQueryArea() {
		List<Area> areaList = areaDao.queryArea();
		assertEquals(2, areaList.size());
	}
}
