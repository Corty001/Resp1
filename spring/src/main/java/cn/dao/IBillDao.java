package cn.dao;

import cn.pojo.Bill;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IBillDao {
    /**
     * 查询所有
     * @return
     */
    @Select("select * from smbms_bill")
    @Results(id="billMap" ,value = {
            @Result(id=true,property = "id",column = "id"),
            @Result(column = "billCode",property = "billCode"),
            @Result(column = "productName",property = "productName"),
            @Result(column = "productDesc",property = "productDesc"),
            @Result(column = "productUnit",property = "productUnit"),
            @Result(column = "productCount",property = "productCount"),
            @Result(column = "totalPrice",property = "totalPrice"),
            @Result(column = "isPayment",property = "isPayment"),
            @Result(column = "createdBy",property = "createdBy"),
            @Result(column = "creationDate",property = "creationDate"),
            @Result(column = "modifyBy",property = "modifyBy"),
            @Result(column = "modifyDate",property = "modifyDate"),
            @Result(column = "providerId",property = "providerId"),
            @Result(property = "provider",column = "providerId",one=@One(select="cn.dao.IProviderDao.findById"))
    })
    List<Bill> findAll();
}
