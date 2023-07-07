package order.service.serviceImpl;

import order.service.orderservice;
import org.springframework.stereotype.Service;

import java.lang.annotation.Annotation;

@Service
public class orderserviceImpl implements orderservice {
    public int add(int a,int b){
        return a + b;
    }
    public int get(int a){
        return a;
    }


    @Override
    public String value() {

        return null;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
