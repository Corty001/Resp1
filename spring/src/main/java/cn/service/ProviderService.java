package cn.service;

import cn.pojo.Provider;

import java.util.List;


public interface ProviderService {
    List<Provider> findAll();


    List<Provider> findBillAndProvider();

    Provider findById(Integer id);
}
