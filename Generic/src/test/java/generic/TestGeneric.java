package generic;

import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
import intel.ICaculate;
import intel.impl.CaculateImpl;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @ClassName TestGeneric
 * @Description: TODO
 * @Author lxc
 * @Date 2020/7/19 09:52
 * @Version V1.0
 **/
public class TestGeneric {

    @Test
    public void testGen() {
        /*ICaculate<Integer, Integer> caculate1 = new CaculateImpl<Integer, Integer>();
        Integer num = caculate1.getResult(8);
        System.out.println(num);

        ICaculate<String, Integer> caculate2 = new CaculateImpl<String, Integer>();
        Integer hashCode = caculate2.getResult("j");
        System.out.println(hashCode);*/

        int count =1;
        String str = "abcdefghigklmnopqrstuvwxyz";
        ICaculate<String, Integer> caculate3 = new CaculateImpl<String, Integer>();
        List<String> stringList = Arrays.asList(str.split(""));

        for (String s : stringList) {
            Integer hcode = caculate3.caculate(s);
            System.out.println((count++)+"----------------"+hcode);
        }
    }

    @Test
    public void mapToJson(){
        Map<String, Map<String,Object>> map = new HashMap<String, Map<String, Object>>();
        Map<String,Object> map1 = new HashMap<String, Object>();
        List<String> stringList = new ArrayList<String>();
        stringList.add("苹果");
        stringList.add("栗子");
        stringList.add("菠萝");
        stringList.add("香蕉");

        map1.put("入库单号","SO213322");
        map1.put("资产名字","扳手入库");
        map1.put("资产编号","SO213322");
        map1.put("资产图片","imageUrl");
        map1.put("资产列表",stringList);

        map.put("S0213322",map1);
        map.put("S0213323",map1);

        Gson gson = new Gson();
        String returnStr = gson.toJson(map);
        System.out.println(returnStr);
    }
}
