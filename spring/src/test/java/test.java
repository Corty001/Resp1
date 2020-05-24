import cn.pojo.Bill;
import cn.pojo.Provider;
import cn.service.BillService;
import cn.service.ProviderService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class test {


    @Test
    public void run1(){
        // 加载配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring-config.xml");
        // 获取对象

        ProviderService ps = (ProviderService) ac.getBean("providerService");
        // 调用方法
        List<Provider> providerList = ps.findAll();
        for(Provider provider : providerList){
            System.out.println(provider);
        }
    }

    @Test
    public void run2(){
        // 加载配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring-config.xml");
        // 获取对象
        BillService ps = (BillService) ac.getBean("billServiceimpl");
        // 调用方法
        List<Bill> BillList = ps.findAll();
        for(Bill bill : BillList){
            System.out.println(bill);
            System.out.println(bill.getProvider());
        }
    }

    @Test
    public void run3(){
        // 加载配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring-config.xml");
        // 获取对象
        ProviderService ps = (ProviderService) ac.getBean("providerService");
        // 调用方法
        Provider provider = ps.findById(2);
            System.out.println(provider);
    }

}
