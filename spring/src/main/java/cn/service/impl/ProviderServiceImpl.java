package cn.service.impl;

import cn.dao.IProviderDao;
import cn.pojo.Provider;
import cn.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("providerService")
public class ProviderServiceImpl implements ProviderService {

    @Autowired
    private IProviderDao IProviderDao;

    @Override
    public List<Provider> findAll() {
        try {
            return IProviderDao.findAll();
        } catch (RuntimeException e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public List<Provider> findBillAndProvider() {
        try {
            return IProviderDao.findBillAndProvider();
        } catch (RuntimeException e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public Provider findById(Integer id) {
        return IProviderDao.findById(id);
    }


    public IProviderDao getIProviderDao() {
        return IProviderDao;
    }

    public void setIProviderDao(IProviderDao IProviderDao) {
        this.IProviderDao = IProviderDao;
    }
}
