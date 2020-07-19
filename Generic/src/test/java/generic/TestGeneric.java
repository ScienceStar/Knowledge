package generic;

import intel.ICaculate;
import intel.impl.CaculateImpl;
import org.junit.Test;

/**
 * @ClassName TestGeneric
 * @Description: TODO
 * @Author lxc
 * @Date 2020/7/19 09:52
 * @Version V1.0
 **/
public class TestGeneric {

    @Test
    public void testGen(){
        ICaculate<Integer,Integer> caculate1 = new CaculateImpl<Integer, Integer>();
        Integer num = caculate1.getResult(8);
        System.out.println(num);

        ICaculate<String,Integer> caculate2 = new CaculateImpl<String, Integer>();
        Integer hashCode = caculate2.getResult("f");
        System.out.println(hashCode);
    }
}
