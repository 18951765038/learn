package com.fh.common.vo;

import java.util.List;

/**
 * 前台展示树形结构
 * @author xujun
 *
 */
public class JsonTreeData {
	/**
	 * id
	 */
	public String id;
	/**
	 * 父id
	 */
	public String pid;
	/**
	 * 显示文本
	 */
	public String text;
	/**
	 * 打开状态
	 */
	public String state;
	/**
	 * 子节点信息
	 */
	public List<JsonTreeData> children;
	/**
	 * 树形等级
	 */
	public String level;
	/**
	 * 图标
	 */
	private String iconCls;
	/**
	 * 树形节点对应地址
	 */
	private String url;
	/**
	 * 节点类型
	 */
	private String treeType;
	
	
	public String getTreeType() {
		return treeType;
	}
	public void setTreeType(String treeType) {
		this.treeType = treeType;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public List<JsonTreeData> getChildren() {
		return children;
	}
	public void setChildren(List<JsonTreeData> children) {
		this.children = children;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getIconCls() {
		return iconCls;
	}
	public void setIconCls(String iconCls) {
		this.iconCls = iconCls;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
}
