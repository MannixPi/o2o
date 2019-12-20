package org.mannix.o2o.dao;

import java.util.List;

import org.mannix.o2o.entity.Area;

public interface AreaDao {
	/**
	 * 列出区域列表
	 * @return areaList
	 */
	List<Area> queryArea();
}
