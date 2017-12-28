package com.ibanyi.fileservice.controller;

import com.ibanyi.fileservice.service.ClientServce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by bykj003 on 2017/12/26.
 */
@RestController
public class FileController {

    @Autowired
    ClientServce clientServce;

    @RequestMapping(value = "/getFilePath", method = RequestMethod.GET)
    public String test() {
        return "hello server client";
    }

    @RequestMapping(value = "/app/getClient", method = RequestMethod.GET)
    public String client() {
        return clientServce.getClientString();
    }
}
