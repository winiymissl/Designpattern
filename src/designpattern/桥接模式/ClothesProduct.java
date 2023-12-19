package designpattern.桥接模式;

/**
 * @Description
 * @Author winiymissl
 * @Date 2023-12-19
 */
public class ClothesProduct extends Product {
    @Override
    void sell() {
        System.out.println("衣服售卖");
    }

    @Override
    void make() {
        System.out.println("衣服盈利");
    }
}
