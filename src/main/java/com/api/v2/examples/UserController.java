package com.api.v2.examples;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by tim on 17/1/9.
 */
@Controller
public class UserController {

    /**
     * 返回JSON
     *
     * @return
     */
    @RequestMapping(value = "/json", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, String> singin() {
        Map<String, String> result = new HashMap<String, String>();

        result.put("code", "0");
        result.put("message", "成功");

        return result;
    }
}
