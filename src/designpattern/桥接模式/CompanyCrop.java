package designpattern.桥接模式;

/**
 * @Description
 * @Author winiymissl
 * @Date 2023-12-18
 */
public abstract class CompanyCrop {
    //抽象实现
    abstract void crop(Product product);

    abstract void makeMoney();
}