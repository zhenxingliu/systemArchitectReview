/**
 * FacadePatternDemo
 */
public class FacadePatternDemo {

    public static void main(String[] args) {
        // 实例化电器类
        SubSystemA_Light light = new SubSystemA_Light();
        SubSystemB_Television television = new SubSystemB_Television();
        SubSystemC_Aircondition aircondition = new SubSystemC_Aircondition();

        // 传参
        FacadeSystem facade = new FacadeSystem(light, television, aircondition);

        // 客户端直接与外观对象进行交互
        facade.on();
        System.out.println("可以看电视了");
        facade.off();
        System.out.println("可以睡觉了");
    }
}