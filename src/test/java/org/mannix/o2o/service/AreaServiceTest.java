package org.mannix.o2o.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.mannix.o2o.BaseTest;
import org.mannix.o2o.entity.Area;
import org.springframework.beans.factory.annotation.Autowired;

public class AreaServiceTest extends BaseTest {
	@Autowired
	private AreaService areaService;
	
	@Test
	public void testGetAreaList() {
		List<Area> areaList = areaService.getAreaList();
		assertEquals("西苑", areaList.get(0).getAreaName());
	}
}
