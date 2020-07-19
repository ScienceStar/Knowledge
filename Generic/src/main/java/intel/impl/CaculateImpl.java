package intel.impl;

import intel.ICaculate;

/**
 * @ClassName CaculateImpl
 * @Description: TODO
 * @Author lxc
 * @Date 2020/7/19 09:44
 * @Version V1.0
 **/
public class CaculateImpl<T,K extends Integer> implements ICaculate<T,K> {

    @Override
    public K getResult(T t) {
        K k=null;
        if(t instanceof Integer){
            k= (K) t;
        }else if(t instanceof String) {
            k = (K) Integer.valueOf(t.hashCode());
        }
        return k;
    }

    @Override
    public <K> K caculate(T t) {
        K k=null;
        if(t instanceof Integer){
            k= (K) t;
        }else if(t instanceof String) {
            k = (K) Integer.valueOf(t.hashCode());
        }
        return k;
    }
}
