package com.whayer.wx.product.service;

import com.github.pagehelper.PageInfo;
import com.whayer.wx.common.mvc.Pagination;
import com.whayer.wx.product.vo.Product;

public interface ProductService {
	
	/**
	 * 获取所有产品列表
	 * @param name
	 * @param pagination
	 * @return
	 */
	public PageInfo<Product> getProductList(String name, Pagination pagination);
	
	/**
	 * 通过角色编码获取产品列表
	 * @param Code
	 * @param pagination
	 * @return
	 */
	public PageInfo<Product> getProductListByUserType(String Code, Pagination pagination);
	
	/**
	 * 获取所有产品列表(指明和当前角色的关联关系)
	 * @param Code
	 * @param pagination
	 * @return
	 */
	public PageInfo<Product> getProductList2Role(String Code, Pagination pagination);
	
	/**
	 * 通过产品ID获取产品详情
	 * @param id
	 * @return
	 */
	public Product getProductById(String id);
	
	/**
	 * 保存产品
	 * @param product
	 * @return
	 */
	public Integer saveProduct(Product product);
	
	/**
	 * 更新产品
	 * @param product
	 * @return
	 */
	public Integer updateProduct(Product product);
	
	/**
	 * 通过ID删除产品
	 * @param id
	 * @return
	 */
	public Integer deleteProductById(String id);
	
	/**
	 * 角色关联产品
	 * @param role  角色编码
	 * @param addIds   添加的产品id数组
	 * @param delIds   删除的产品id数组
	 * @return
	 */
	public Integer associate(String role, String[] addIds, String[] delIds);
	
	/**
	 * 删除某产品id与所有角色的关联
	 * @param id
	 * @return
	 */
	public Integer deleteAssociation(String id);
	
	/**
	 * 更新产品上下架状态
	 * @param id
	 * @param isOff
	 * @return
	 */
	public Integer updateOnOrOff(String id, int isOff);
	
}
