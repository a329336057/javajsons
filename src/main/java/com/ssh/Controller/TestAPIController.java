package com.ssh.Controller;


import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

@Controller
@RequestMapping(value = "/api")
public class TestAPIController {

    @RequestMapping(value = "logincode",method = RequestMethod.GET )
    public void yzmCode(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String phone = request.getParameter("phone");
        HashMap<String,Object> hashMap=new HashMap<String, Object>();
        JSONObject jsonObject=new JSONObject();
        if(phone.equals("17623882165")){

            jsonObject.put("code",200);
            jsonObject.put("message","已发送验证码");

            hashMap.put("state",1);
            jsonObject.put("data",hashMap);
            System.out.println(jsonObject.toString());
        }else {

            jsonObject.put("code",200);
            jsonObject.put("message","失败");
            hashMap.put("state",1);
            jsonObject.put("data",hashMap);
            System.out.println(jsonObject.toString());
        }
        response.getWriter().write(jsonObject.toString());


    }
    @RequestMapping(value = "login",method = RequestMethod.GET )
    public void login(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String phone = request.getParameter("phone");
        String code = request.getParameter("code");
        HashMap<String,Object> hashMap=new HashMap<String, Object>();
        JSONObject jsonObject=new JSONObject();
        if(phone.equals("17623882165") && code.equals("123456")){
            jsonObject.put("code",200);
            jsonObject.put("message","登陆成功");


            //用户信息
            HashMap<String,Object> userinformation=new HashMap<String, Object>();
            userinformation.put("role",1); //1城市合伙人 2地推 3创客 4商家 5分享达人 6用户
            userinformation.put("userid","asdtttrhggfhjyty2311sadfwweew");//用户id

            hashMap.put("token","wqewqeqweqe12312321312312312qseqe");

//            hashMap.put("update",update);
            hashMap.put("userinformation",userinformation);
            jsonObject.put("data",hashMap);
            System.out.println(jsonObject.toString());
        }else {
            jsonObject.put("code",200);
            jsonObject.put("message","验证码错误");

            jsonObject.put("data",hashMap);
            System.out.println(jsonObject.toString());
        }
        response.getWriter().write(jsonObject.toString());


    }
    @RequestMapping(value = "loadlogin",method = RequestMethod.GET )
    public void loadlogin(HttpServletRequest request, HttpServletResponse response) throws IOException {

        HashMap<String,Object> hashMap=new HashMap<String, Object>();
        JSONObject jsonObject=new JSONObject();


        jsonObject.put("code",200);
        jsonObject.put("message","已发送验证码");





        //升级信息
        HashMap<String,Object> update=new HashMap<String, Object>();
        update.put("updatetype",1); //1为提示升级  2强制升级 0为不升级
        update.put("versioncode",2.0);
        update.put("title","有新的消息啦");
        update.put("url","http://106.13.131.133:8080/apk/updata.apk");
        update.put("explain","\n1/做了更大可能的优化*更好的体验*-更快捷的享受生活\n2/更美好的明天而战\n3/更美好的明天而战");



        hashMap.put("update",update);
        jsonObject.put("data",hashMap);
        System.out.println(jsonObject.toString());

        response.getWriter().write(jsonObject.toString());


    }

    @RequestMapping(value = "datasurvey",method = RequestMethod.GET )
    public void Homedata(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String token = request.getParameter("token");
        String userid = request.getParameter("userid");

        HashMap<String,Object> hashMap=new HashMap<String, Object>();
        JSONObject jsonObject=new JSONObject();
        if(token.equals("wqewqeqweqe12312321312312312qseqe") && userid.equals("asdtttrhggfhjyty2311sadfwweew")){

            jsonObject.put("code",200);
            jsonObject.put("message","获取数据成功");

            HashMap<String,Object>panledata=new HashMap<String, Object>();
            panledata.put("usernewtitle","近七天内新用户增长");
            panledata.put("usernew","15496");
            panledata.put("teamnewtitle","近七天内团队新用户增长");
            panledata.put("teamnew","166888.00");
            panledata.put("rabatetitle","近七天内返润金额");
            panledata.put("rabate","17338.25");
            panledata.put("teamrobatetitle","近七天团队内返润金额");
            panledata.put("teamrobate","255000.00");
            panledata.put("tamemerchanttitle","近七天商家范润");
            panledata.put("tamemerchant","157800.00");
            HashMap<String,Object>notice=new HashMap<String, Object>();
            notice.put("noticetitle","我们还很幸福的，别以为我是什么垃圾二流校色，请叫我们傻B啊");
            notice.put("noticeid","qqqqqqqqqqqqqqqqqqqq");


            //升级信息
            HashMap<String,Object> update=new HashMap<String, Object>();
            update.put("updatetype",0); //1为提示升级  2强制升级 0为不升级
            update.put("versioncode",2.0);
            update.put("title","有新的消息啦");
            update.put("url","http://106.13.131.133:8080/apk/updata.apk");
            update.put("explain","\n1/做了更大可能的优化*更好的体验*-更快捷的享受生活\n2/更美好的明天而战\n3/更美好的明天而战");



            List<Object>linchartdata =new ArrayList<Object>();

            for (int i = 0; i < 5; i++) {
                List<Object>list =new ArrayList<Object>();
                List<Float> usernewdata=new ArrayList<Float>();
                for (int j = 0; j < 150; j++) {
                    usernewdata.add(1.5f+j);
                }
                list.add("第"+i+"条数据标题");
                list.add(usernewdata);
                List<String> listdays=new ArrayList<String>();
                for (int j = 0; j < usernewdata.size(); j++) {
                    listdays.add("10月"+j+"日");
                }


                list.add(listdays);
                linchartdata.add(list);
            }


            hashMap.put("updata",update);
            hashMap.put("notice",notice);
            hashMap.put("linchartdata",linchartdata);
            hashMap.put("panledata",panledata);

            jsonObject.put("data",hashMap);
            System.out.println(jsonObject.toString());
        }else {
            jsonObject.put("code",100);
            jsonObject.put("message","token错误");
            System.out.println(jsonObject.toString());
        }

        response.getWriter().write(jsonObject.toString());
    }

    @RequestMapping(value = "robate",method = RequestMethod.GET )
    public void getrelationship(HttpServletResponse response,HttpServletRequest request)throws IOException{
        String token = request.getParameter("token");
        String userid = request.getParameter("userid");
        String type = request.getParameter("type");
        String phone = request.getParameter("phone");
        String selecttime = request.getParameter("selecttime");

        HashMap<String,Object> hashMap=new HashMap<String, Object>();

        JSONObject jsonObject=new JSONObject();
        if(token.equals("wqewqeqweqe12312321312312312qseqe") && userid.equals("asdtttrhggfhjyty2311sadfwweew")) {


            if(Integer.valueOf(type)==1){
                System.out.println( "个日返利 token:"+token+"   userid:"+userid+"  type:"+type+"   phone:"+phone+"   selecttime:"+selecttime);
                jsonObject.put("code", 200);
                jsonObject.put("message", "获取数据成功");
                List<Object> linchartdata = new ArrayList<Object>();

                HashMap<String, Object> listlinechart = new HashMap<String, Object>();
                List<Float> usernewdata = new ArrayList<Float>();
                for (int j = 0; j <100; j++) {
                    usernewdata.add(1.5f + j);
                }
                listlinechart.put("userrobate", "个人返利统计");
                listlinechart.put("userlinechartdata", usernewdata);
                List<String> listdays = new ArrayList<String>();
                for (int j = 0; j < usernewdata.size(); j++) {
                    listdays.add("10月" + j + "日");
                }
                listlinechart.put("day", listdays);

                List<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
                for (int i = 0; i < 20; i++) {
                    HashMap<String, Object> listdata = new HashMap<String, Object>();
                    listdata.put("phone", "17623882165");
                    listdata.put("time", "19-10-02 21:45:27");
                    listdata.put("money", "1231");
                    listdata.put("id", "saDSADASDASDASDasdasd");
                    list.add(listdata);
                }


                hashMap.put("linechart", listlinechart);
                hashMap.put("list", list);
                jsonObject.put("data", hashMap);
                System.out.println(jsonObject.toString());

            }else {



                System.out.println("团队返利    token:"+token+"   userid:"+userid+"  type:"+type+"   phone:"+phone+"   selecttime:"+selecttime);
                jsonObject.put("code", 200);
                jsonObject.put("message", "获取数据成功");
                List<Object> linchartdata = new ArrayList<Object>();

                HashMap<String, Object> listlinechart = new HashMap<String, Object>();
                List<Float> usernewdata = new ArrayList<Float>();
                for (int j = 0; j <15; j++) {
                    usernewdata.add(1.533f + j);
                }
                listlinechart.put("userrobate", "个人返利统计");
                listlinechart.put("userlinechartdata", usernewdata);
                List<String> listdays = new ArrayList<String>();
                for (int j = 0; j < usernewdata.size(); j++) {
                    listdays.add("10月" + j + "日");
                }
                listlinechart.put("day", listdays);

                List<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
                for (int i = 0; i < 20; i++) {
                    HashMap<String, Object> listdata = new HashMap<String, Object>();
                    listdata.put("phone", "17623882165");
                    listdata.put("time", "19-10-02 21:45:27");
                    listdata.put("money", "1231");
                    listdata.put("id", "saDSADASDASDASDasdasd");
                    list.add(listdata);
                }


                hashMap.put("linechart", listlinechart);
                hashMap.put("list", list);
                jsonObject.put("data", hashMap);
                System.out.println(jsonObject.toString());
            }

        }
        response.getWriter().write(jsonObject.toString());
    }
    @RequestMapping(value = "usergrowthanalysis",method = RequestMethod.POST)
    public void userGrowthAnalysis(HttpServletRequest request,HttpServletResponse response) throws IOException {
        HashMap<String,Object> hashMap=new HashMap<String, Object>();

        JSONObject jsonObject=new JSONObject();
        jsonObject.put("code", 200);
        jsonObject.put("message", "获取数据成功");
        String token = request.getParameter("token");
        String userid = request.getParameter("userid");
        String type = request.getParameter("type");
        String phone = request.getParameter("phone");
        String selecttime = request.getParameter("selecttime");

        HashMap<String, Object> listlinechart = new HashMap<String, Object>();
        List<Float> usernewdata = new ArrayList<Float>();
        for (int j = 0; j <100; j++) {
            usernewdata.add(1.5f + j);
        }
        listlinechart.put("usergrowthanalysis", "个人用户增长情况");
        listlinechart.put("userlinechartdata", usernewdata);
        List<String> listdays = new ArrayList<String>();
        for (int j = 0; j < usernewdata.size(); j++) {
            listdays.add("10月" + j + "日");
        }
        listlinechart.put("day", listdays);

        List<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
        for (int i = 0; i < 20; i++) {
            HashMap<String, Object> listdata = new HashMap<String, Object>();
            listdata.put("userphone", "17623882165");
            listdata.put("registrationtime", "19-10-02 21:45:27 注册");
            listdata.put("role", "城市合伙人");
            listdata.put("roleorname", "城市合伙人 万镇源");
            listdata.put("directlyunderphone", "直属上级 17783562515");
            listdata.put("id", "saDSADASDASDASDasdasd");
            list.add(listdata);
            if(i==5){
                listdata.put("headimage","");
            }else {
                listdata.put("headimage","http://b-ssl.duitang.com/uploads/item/201810/18/20181018162951_kgwzm.thumb.700_0.jpeg");
            }
        }



        hashMap.put("linechart", listlinechart);
        hashMap.put("list", list);
        jsonObject.put("data", hashMap);
        System.out.println(jsonObject.toString());
        response.getWriter().write(jsonObject.toString());
    }
    @RequestMapping(value = "relationuser",method = RequestMethod.GET)
    public void getrelationuser(HttpServletRequest request,HttpServletResponse response){
        request.getParameter("userid");
        request.getParameter("token");
        String phone = request.getParameter("phone");
        request.getParameter("subordinate");
        HashMap<String,Object> hashMap=new HashMap<String, Object>();

        JSONObject jsonObject=new JSONObject();
        jsonObject.put("code", 200);
        jsonObject.put("message", "获取数据成功");
        if(phone=="17623882165"){
            List<HashMap<String, Object>> Subordinatelist = new ArrayList<HashMap<String, Object>>();
            for (int i = 0; i < 0; i++) {
                HashMap<String, Object> Subordinate = new HashMap<String, Object>();
                Subordinate.put("userphone", "17623882165");
                Subordinate.put("registrationtime", "19-10-02 21:45:27 注册");
                Subordinate.put("role", "城市合伙人");
                Subordinate.put("roleorname", "城市合伙人 万镇源");
                Subordinate.put("directlyunderphone", "直属上级 17783562515");
                Subordinate.put("id", "saDSADASDASDASDasdasd");
                Subordinate.put("headimage","http://b-ssl.duitang.com/uploads/item/201810/18/20181018162951_kgwzm.thumb.700_0.jpeg");
                Subordinatelist.add(Subordinate);

            }

            List<HashMap<String, Object>> Superiorslist = new ArrayList<HashMap<String, Object>>();
            for (int i = 0; i < 0; i++) {
                HashMap<String, Object> Superiors = new HashMap<String, Object>();
                Superiors.put("Directly", "直属上级");
                Superiors.put("phone", "17623882165");
                Superiors.put("role", "城市合伙人");
                Superiors.put("id", "saDSADASDASDASDasdasd");
                Superiorslist.add(Superiors);
            }
            HashMap<String, Object> userinfo = new HashMap<String, Object>();
            userinfo.put("phone", "17623882165");
            userinfo.put("time", "2019-10-06 19:54:51");
            userinfo.put("role", "城市合伙人");
            userinfo.put("name", "万镇源");
            userinfo.put("headimage","http://b-ssl.duitang.com/uploads/item/201810/18/20181018162951_kgwzm.thumb.700_0.jpeg");

            hashMap.put("Subordinate", Subordinatelist);
            hashMap.put("Superiors", Superiorslist);
            hashMap.put("userinfo", userinfo);
            jsonObject.put("data", hashMap);
            System.out.println(jsonObject.toString());
            try {
                response.getWriter().write(jsonObject.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            List<HashMap<String, Object>> Subordinatelist = new ArrayList<HashMap<String, Object>>();
            for (int i = 0; i < 20; i++) {
                HashMap<String, Object> Subordinate = new HashMap<String, Object>();
                Subordinate.put("userphone", "17623882165");
                Subordinate.put("registrationtime", "19-10-02 21:45:27 注册");
                Subordinate.put("role", "城市合伙人");
                Subordinate.put("roleorname", "城市合伙人 万镇源");
                Subordinate.put("directlyunderphone", "直属上级 17783562515");
                Subordinate.put("id", "saDSADASDASDASDasdasd");
                Subordinate.put("headimage","http://b-ssl.duitang.com/uploads/item/201810/18/20181018162951_kgwzm.thumb.700_0.jpeg");
                Subordinatelist.add(Subordinate);

            }

            List<HashMap<String, Object>> Superiorslist = new ArrayList<HashMap<String, Object>>();
            for (int i = 0; i < 20; i++) {
                HashMap<String, Object> Superiors = new HashMap<String, Object>();
                Superiors.put("Directly", "直属上级");
                Superiors.put("phone", "17623882165");
                Superiors.put("role", "城市合伙人");
                Superiors.put("id", "saDSADASDASDASDasdasd");
                Superiorslist.add(Superiors);
            }
            HashMap<String, Object> userinfo = new HashMap<String, Object>();
            userinfo.put("phone", "17623882165");
            userinfo.put("time", "2019-10-06 19:54:51");
            userinfo.put("role", "城市合伙人");
            userinfo.put("name", "万镇源");
            userinfo.put("headimage","http://b-ssl.duitang.com/uploads/item/201810/18/20181018162951_kgwzm.thumb.700_0.jpeg");

            hashMap.put("Subordinate", Subordinatelist);
            hashMap.put("Superiors", Superiorslist);
            hashMap.put("userinfo", userinfo);
            jsonObject.put("data", hashMap);
            System.out.println(jsonObject.toString());
            try {
                response.getWriter().write(jsonObject.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


}
