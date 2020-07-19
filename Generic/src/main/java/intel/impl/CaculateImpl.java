package intel.impl;

import intel.ICaculate;

/**
 * @ClassName CaculateImpl
 * @Description: TODO
 * @Author lxc
 * @Date 2020/7/19 09:44
 * @Version V1.0
 **/
public class CaculateImpl<K,T extends Integer> implements ICaculate<K,T> {

    public T getResult(K k) {
        T t=null;
        if(k instanceof Integer){
            t= (T) k;
        }else if(k instanceof String) {
            t = (T) Integer.valueOf(k.hashCode());
        }
        return t;
    }
}
