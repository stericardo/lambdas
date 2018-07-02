package com.stevenprogramming.training.lambda.core.services.impl;

import com.stevenprogramming.training.lambda.core.HelloCore;
import com.stevenprogramming.training.lambda.core.builder.Builder;
import com.stevenprogramming.training.lambda.core.builder.impl.BuilderImpl;
import com.stevenprogramming.training.lambda.core.services.IRunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service("runService")
public class RunServiceImpl implements IRunService {

    @Autowired
    HelloCore helloCore;

    @Override
    public void runApp(String parameter){
        System.out.println(helloCore.getGreeting("Steven From App to Core " + parameter));
        try {
            if (null != parameter) {
                int option = Integer.parseInt(parameter);
                Builder builder = BuilderImpl.getInstance();
                builder.build(option);
                System.out.println("***********************************************************");
                builder.build(2);
            }
        } catch (NumberFormatException nFE) {
            System.out.println("Error >>> " + nFE.toString());
            nFE.printStackTrace();
        }

    }
}
