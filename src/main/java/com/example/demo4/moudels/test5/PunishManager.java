package com.example.demo4.moudels.test5;//package com.example.demo.moudels.test5;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;
//
//import javax.annotation.PostConstruct;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
///**
// * @author daizhi
// * @version 1.0.0
// * @date 2019/10/18
// * @description：${description}
// */
//
//@Component
//public class PunishManager {
//
//    private List<IPunish> list;
//
//    private static final Map<String, IPunish> punishServices = new HashMap<String, IPunish>();
//
//    @Autowired
//    public PunishManager(List<IPunish> list) {
//        System.out.println("初始化" + list.size());
//        this.list = list;
//    }
//
//    @PostConstruct
//    public void initOrderServiceCache() {
//        System.out.println("Existing converters are: ");
//        for (IPunish item : list) {
//            Service annotation = item.getClass().getAnnotation(Service.class);
//            String value = annotation.value();
//            System.out.println("=============注解的值：" + value);
//            punishServices.put(value, item);
//        }
//    }
//
////    private IPunish getOrderService(String type) {
////        IPunish converter = punishServices.get(type);
////        if (converter == null) {
////            throw new RuntimeException("Unknown converter type: " + type);
////        }
////        return converter;
////    }
//
//
//    public List<IPunish> getList() {
//        return list;
//    }
//
//    public void setList(List<IPunish> list) {
//        this.list = list;
//    }
//
//    public static Map<String, IPunish> getPunishServices() {
//        return punishServices;
//    }
//}
