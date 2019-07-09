package com.ntyl.retiresCadres.controller;

import com.alibaba.fastjson.JSONObject;
import com.ntyl.retiresCadres.model.RetiredCadres;
import com.ntyl.retiresCadres.service.IRetiredCadresService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author Jayson 2019-07-05
 *
 */

@Controller
@RequestMapping("/cadres")
@Api(value = "干部信息", description = "干部信息", produces = MediaType.APPLICATION_JSON)
public class RetiredCadresController {

    @Resource
    private IRetiredCadresService cadresService;


    @RequestMapping("/getCadres")
    @ResponseBody
    @ApiOperation(value = "获取单个干部信息", notes = "传入身份证号，获取该身份证号对应的干部。", httpMethod = "POST")
    public RetiredCadres getCadresById(HttpServletRequest request, Model model) {
        String identityId = request.getParameter("identityId");
        return this.cadresService.getModelById(identityId);
    }

    @RequestMapping("/addOrUpstateCadres")
    @ResponseBody
    @ApiOperation(value = "添加/修改一个干部信息", notes = "传入一个干部实体对象,添加/修改一个干部信息。", httpMethod = "POST")
    public JSONObject addOrUpstateCadres(HttpServletRequest request, Model model) {
        Map<String, Object> resJson = new HashMap<>();
        RetiredCadres rcs = new RetiredCadres();
        String identityId = request.getParameter("identityId");
        String name = request.getParameter("name");
        String birthday = request.getParameter("birthday");
        String gender = request.getParameter("gender");
        String nativePlace = request.getParameter("nativePlace");
        int age = Integer.parseInt(request.getParameter("age"));
        if (this.cadresService.getModelById(identityId) != null) {
            //update
        } else {
            //insert
            rcs.setIdentityId(identityId);
            rcs.setName(name);
            rcs.setBirthday(birthday);
            rcs.setGender(gender);
            rcs.setNativePlace(nativePlace);
            rcs.setAge(age);
            int res = this.cadresService.addCadres(rcs);
            if (res == 1) {
                resJson.put("status", "SUCCESS");
            } else {
                resJson.put("status", "FALSE");
            }
        }
        return (new JSONObject(resJson));
    }
}
