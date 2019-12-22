package org.mannix.o2o.service;

import java.io.InputStream;

import org.mannix.o2o.dto.ShopExecution;
import org.mannix.o2o.entity.Shop;
import org.mannix.o2o.exceptions.ShopOperationException;

public interface ShopService {
	ShopExecution addShop(Shop shop, InputStream shopImgInputStream, String fileName) throws ShopOperationException;
}
