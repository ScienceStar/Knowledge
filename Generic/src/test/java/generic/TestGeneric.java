package generic;

import intel.ICaculate;
import intel.impl.CaculateImpl;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
}
