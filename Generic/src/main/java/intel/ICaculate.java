package intel;

/**
 * @ClassName ICaculate
 * @Description: TODO
 * @Author lxc
 * @Date 2020/7/19 09:40
 * @Version V1.0
 **/
public interface ICaculate<T extends Object,K extends Integer> {
    public K getResult(T t);
    public <K> K caculate(T t);
}
