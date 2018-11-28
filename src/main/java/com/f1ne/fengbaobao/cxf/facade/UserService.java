package com.f1ne.fengbaobao.cxf.facade;

import com.f1ne.fengbaobao.cxf.bean.User;
import org.springframework.stereotype.Component;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@Component
@WebService(serviceName = "UserService" ,targetNamespace="http://fengbaobao.f1ne.com/")
public interface UserService {

    @WebMethod
    String getName(@WebParam(name="userId") Long userId);

    @WebMethod
    User getUser(Long userId);

}
