package designpattern.桥接模式;

/**
 * @Description
 * @Author winiymissl
 * @Date 2023-12-19
 */
public class ClothesCrop extends CompanyCrop {
    @Override
    void crop(Product product) {
        System.out.println("这是方法的具体实现，衣服制造厂商盈利");
    }

    @Override
    void makeMoney() {
        System.out.println("这是方法的具体实现，衣服制造厂商");
    }
}
