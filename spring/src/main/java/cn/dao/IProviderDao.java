package cn.dao;

import cn.pojo.Provider;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IProviderDao {

    /**
     * 查询所有
     * @return
     */
    @Select("select * from smbms_provider")
    List<Provider> findAll();



    /**
     * 根据id查询用户
     * @paramserId
     * @return
     */
    @Select("select * from smbms_provider  where id=#{id} ")
    Provider findById(Integer id);

    /**
     * 实现按条件查询订单表，查询条件包括：商品名称（模糊查询）、供应商（供应商id）、是否付款。
     * @param
     * @return 订单编码、商品名称、供应商名称、账单金额、是否付款、创建时间。
     */
    List<Provider> findBillAndProvider();

}
