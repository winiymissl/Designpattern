package designpattern.代理模式.代理模式;

/**
 * @Description
 * @Author winiymissl
 * @Date 2024-04-24
 */
public interface IGamePlayer {
    void login(String user, String password);

    void killBoss();

    void upgrade();
}