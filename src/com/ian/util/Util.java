package com.ian.util;

/**
 * @author ian.caltabiano
 */
public class Util {
	
	/**
	 * Clamps a given integer value to a minimum and maximum (utility mathematics)
	 * @param val The value to clamp
	 * @param min The minimum value it can be
	 * @param max The maximum value it can be
	 * @return Returns the given value, minimized at the minimum value given and maximized at the maximum value given. 
	 */
	public static int clamp(int val, int min, int max) {
		return Math.min(max, Math.max(min, val));
	}
	
}
