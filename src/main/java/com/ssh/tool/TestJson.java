package com.ssh.tool;

import net.sf.json.JSONObject;
import org.junit.Test;

import java.util.*;

public class TestJson {
    @Test
    public void logincode(){
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("code",200);
        jsonObject.put("message","已发送验证码");
        HashMap<String,Object> hashMap=new HashMap<String, Object>();
        hashMap.put("state",1);
        jsonObject.put("data",hashMap);
        System.out.println(jsonObject.toString());
    }
    @Test
    public void loadlogin(){
        JSONObject jsonObject=new JSONObject();

        HashMap<String,Object> hashMap=new HashMap<String, Object>();
        jsonObject.put("code",200);
        jsonObject.put("message","返回成功");

        hashMap.put("state",1);



        //升级信息
        HashMap<String,Object> update=new HashMap<String, Object>();
        update.put("updatetype",1); //1为提示升级  2强制升级 0为不升级
        update.put("versioncode",2.0);
        update.put("title","新版本升级啦");

        update.put("url","http://106.13.131.133:8080/apk/updata.apk");
        update.put("explain","\n1/做了更大可能的优化*更好的体验*-更快捷的享受生活\n2/更美好的明天而战\n3/更美好的明天而战");



        hashMap.put("update",update);
        jsonObject.put("data",hashMap);

        System.out.println(jsonObject.toString());
    }
    @Test
    public void login(){
        JSONObject jsonObject=new JSONObject();

        HashMap<String,Object> hashMap=new HashMap<String, Object>();
        jsonObject.put("code",200);
        jsonObject.put("message","登陆成功");

        //用户信息
        HashMap<String,Object> userinformation=new HashMap<String, Object>();
        userinformation.put("role",1); //1城市合伙人 2地推 3创客 4商家 5分享达人 6用户
        userinformation.put("userid","asdtttrhggfhjyty2311sadfwweew");//用户id

//        //升级信息
//        HashMap<String,Object> update=new HashMap<String, Object>();
//        update.put("updatetype",1); //1为提示升级  2强制升级 0为不升级
//        update.put("versioncode",2.0);
//        update.put("url","http://106.13.131.133:8080/apk/updata.apk");
//        update.put("explain","*-做了更大可能的优化*更好的体验*-更快捷的享受生活*-更美好的明天而战");


//        hashMap.put("update",update);
        hashMap.put("userinformation",userinformation);
        hashMap.put("state",1);
        hashMap.put("token","wqewqeqweqe12312321312312312qseqe");
        jsonObject.put("data",hashMap);
        System.out.println(jsonObject.toString());
    }
    @Test
    public void MianLoad(){
        HashMap<String,Object> hashMap=new HashMap<String, Object>();
        JSONObject jsonObject=new JSONObject();

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
        update.put("updatetype",1); //1为提示升级  2强制升级 0为不升级
        update.put("versioncode",2.0);
        update.put("title","有新的消息啦");
        update.put("url","http://106.13.131.133:8080/apk/updata.apk");
        update.put("explain","\n1/做了更大可能的优化*更好的体验*-更快捷的享受生活\n2/更美好的明天而战\n3/更美好的明天而战");



        List<Object>linchartdata =new ArrayList<Object>();

        for (int i = 0; i < 5; i++) {
            List<Object>list =new ArrayList<Object>();
            List<Float> usernewdata=new ArrayList<Float>();
            for (int j = 0; j < 5; j++) {
                usernewdata.add(1.5f+j);
            }
            list.add("第"+i+"条数据标题");
            list.add(usernewdata);
            List<String> listdays=new ArrayList<String>();
            listdays.add("10月1日");
            listdays.add("10月2日");
            listdays.add("10月3日");
            listdays.add("10月4日");
            listdays.add("10月5日");
            list.add(listdays);
            linchartdata.add(list);
        }


        hashMap.put("updata",update);
        hashMap.put("notice",notice);
        hashMap.put("linchartdata",linchartdata);
        hashMap.put("panledata",panledata);

        jsonObject.put("data",hashMap);
        System.out.println(jsonObject.toString());
    }
    @Test
    public void getrobate(){
        HashMap<String,Object> hashMap=new HashMap<String, Object>();

        JSONObject jsonObject=new JSONObject();

            jsonObject.put("code", 200);
            jsonObject.put("message", "获取数据成功");
            List<Object>linchartdata =new ArrayList<Object>();

            HashMap<String,Object> listlinechart=new HashMap<String,Object>();
            List<Float> usernewdata=new ArrayList<Float>();
            for (int j = 0; j < 5; j++) {
                usernewdata.add(1.5f+j);
            }
        listlinechart.put("userrobate","个人返利统计");
        listlinechart.put("userlinechartdata",usernewdata);
            List<String> listdays=new ArrayList<String>();
            for (int j = 0; j < usernewdata.size(); j++) {
                listdays.add("10月"+j+"日");
            }
        listlinechart.put("day",listdays);

        List<HashMap<String,Object>> list=new ArrayList<HashMap<String,Object>>();
        for (int i = 0; i < 5; i++) {
            HashMap<String,Object> listdata=new HashMap<String,Object>();
            listdata.put("phone", "17623882165");
            listdata.put("time", "2019-10-02 21:45:27");
            listdata.put("money", "17623882165");
            listdata.put("id","saDSADASDASDASDasdasd");
            list.add(listdata);
        }


        hashMap.put("linechart",listlinechart);
        hashMap.put("list",list);
        jsonObject.put("data",hashMap);
        System.out.println(jsonObject.toString());
    }
    @Test
    public void usergrowthanalysis(){
        HashMap<String,Object> hashMap=new HashMap<String, Object>();

        JSONObject jsonObject=new JSONObject();
        jsonObject.put("code", 200);
        jsonObject.put("message", "获取数据成功");
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
    }

    @Test
    public void relation(){

        HashMap<String,Object> hashMap=new HashMap<String, Object>();

        JSONObject jsonObject=new JSONObject();
        jsonObject.put("code", 200);
        jsonObject.put("message", "获取数据成功");
        List<HashMap<String, Object>> Subordinatelist = new ArrayList<HashMap<String, Object>>();
        for (int i = 0; i < 2; i++) {
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
        for (int i = 0; i < 2; i++) {
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

    }
}
