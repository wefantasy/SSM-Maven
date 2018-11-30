package com.ctgu.proname.dao;
/**  
* @Title: SchoolType.java  
*
* @Package com.ctgu.bookstore.dao  
*
* @Description: 学校接口类
*
* @author Fantasy  
*
* @date 2018年6月3日  
*
* @version V1.0  
*/

import java.util.List;

import com.ctgu.proname.entity.SchoolType;


public interface SchoolTypeDao {
	/**
	 * 查询所有学校
	 * @return SchoolTypeList
	 */
	List<SchoolType> querySchoolType();
	
	int insertSchoolType(SchoolType schoolType);
}
