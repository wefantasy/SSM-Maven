package com.ctgu.proname.entity;
/**  
* @Title: SchoolType.java  
*
* @Package com.ctgu.bookstore.entity  
*
* @Description: 学校类型实体
*
* @author Fantasy  
*
* @date 2018年6月3日  
*
* @version V1.0  
*/
public class SchoolType {

	private Integer id;
	private String explains;
	private String datetime;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getExplains() {
		return explains;
	}
	public void setExplains(String explains) {
		this.explains = explains;
	}
	public String getDatetime() {
		return datetime;
	}
	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}
	@Override
	public String toString() {
		return "SchoolType [id=" + id + ", explains=" + explains + ", datetime=" + datetime + "]";
	}
}
