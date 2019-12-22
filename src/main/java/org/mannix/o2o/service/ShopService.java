package org.mannix.o2o.service;

import java.io.File;

import org.mannix.o2o.dto.ShopExecution;
import org.mannix.o2o.entity.Shop;

public interface ShopService {
	ShopExecution addShop(Shop shop, File shopImg);
}
