package com.deepex.osa.service;

import java.util.List;

import com.deepex.osa.domain.ProductDTO;
import com.deepex.osa.domain.ProductQuery;

/**
 * 产品Service组件
 * @author yangxi
 *
 */
public interface ProductService {

	/**
	 * 分页查询产品信息
	 * @param productQuery 查询参数
	 * @return
	 */
    List<ProductDTO> listProducts(ProductQuery productQuery);

    /**
     * 根据ID查询产品
     * @param id
     * @return
     */
    ProductDTO getProductById(Long id);

    /**
     * 新增产品
     * @param productDTO
     * @return
     */
    ProductDTO saveProduct(ProductDTO productDTO);
    
    /**
     * 更新产品
     * @param productDTO
     * @return
     */
    ProductDTO updateProduct(ProductDTO productDTO);

    /**
     * 删除产品
     * @param id
     * @return
     */
    Boolean deleteProductById(Long id);

    /**
     * 测试抛业务异常
     */
    void testError();
}