package com.ssh.tool;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import net.sf.json.JSONObject;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Signature {
    public static final String TOKENS="F24587822154787878997799"; //钥匙
    public static final long EXPIRE_TIME=1000*180;


    public static  String sign(String username,String userid){
        Date date=new Date(System.currentTimeMillis()+EXPIRE_TIME);
        try {
            Algorithm algorithm=Algorithm.HMAC256(TOKENS);
            HashMap<String,Object> header=new HashMap<String,Object>(2);
            header.put("typ","JWT");
            header.put("alg","HS256");
            //附带username的签名
            return JWT.create()
                    .withHeader(header)
                    .withClaim("loginname",username)
                    .withClaim("userid",userid)
                    .withExpiresAt(date)
                    .sign(algorithm);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static JSONObject vertiy(String token){
        JSONObject jsonObject=new JSONObject();
        try {
            Algorithm algorithm=Algorithm.HMAC256(TOKENS);
            JWTVerifier verifier=JWT.require(algorithm).build();
            DecodedJWT jwt=verifier.verify(token);
            Map<String, Claim> map = jwt.getClaims();
            Claim d=map.get("userid");
            jsonObject.put("message",d.asString());
            return jsonObject;
        } catch (Exception e){
            jsonObject.put("message","过期了或已经失效了");
            return  jsonObject;
        }

    }
}
