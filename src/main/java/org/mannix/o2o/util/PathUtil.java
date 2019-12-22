package org.mannix.o2o.util;

public class PathUtil {
	private static String separator = System.getProperty("file.separator");

	public static String getImgBasePath() {
		String os = System.getProperty("os.name");
		String basePath = "";
		if (os.toLowerCase().startsWith("win")) {
			basePath = "C:/Users/MannixPi/Pictures/";
		} else {
			basePath = "/home/mannixpi/image/";
		}
		basePath = basePath.replace("/", separator);
		return basePath;
	}

	public static String getShopImagePath(long shopId) {
		String imagePath = "/upload/images/item/shop/" + shopId + "/";
		return imagePath.replace("/", separator);
	}
}
