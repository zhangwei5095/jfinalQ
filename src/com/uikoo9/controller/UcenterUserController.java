package com.uikoo9.controller;

import com.uikoo9.QContants;
import com.uikoo9.util.jfinal.QActionMap;
import com.uikoo9.util.jfinal.QController;

/**
 * 用户中心-用户controller
 * @author uikoo9
 */
@QActionMap(QContants.U_UCENTER_USER)
public class UcenterUserController extends QController{
	
	/**
	 * 跳转到首页 
	 */
	public void index(){
		setAttr(QContants.V_QPAGE, list(getParaMap(), QContants.TABLE_UCENTER_USER));
		render(QContants.P_UCENTER_USER_INDEX);
	}
	
	/**
	 * 跳转到保存修改页 
	 */
	public void savep(){
		setAttr(QContants.V_ROW, get(getPara(QContants.V_ID), QContants.TABLE_UCENTER_USER));
		render(QContants.P_UCENTER_USER_INPUT);
	}
	
	/**
	 * 保存或修改
	 */
	public void save(){
		renderJson(save(getParaMap(), QContants.TABLE_UCENTER_USER));
	}
	
	/**
	 * 删除一条或多条
	 */
	public void del(){
		renderJson(del(getPara(QContants.V_IDS), QContants.TABLE_UCENTER_USER));
	}
	
}
