/**
 * FacadeSystem
 */
public class FacadeSystem {

    SubSystemA_Light light;
    SubSystemB_Television television;
    SubSystemC_Aircondition aircondition;

    // 传参
    public FacadeSystem(SubSystemA_Light light,SubSystemB_Television television,SubSystemC_Aircondition aircondition){  
        this.light = light;  
        this.television  = television ;  
        this.aircondition = aircondition;  
    
    }

    // 起床后一键开电器
    public void on(){
        System.out.println("起床了");
        light.on();
        television.on(); 
        aircondition.on();
    }

    // 睡觉时一键关电器
    public void off(){
        System.out.println("睡觉了");
        light.off();
        television.off();
        aircondition.off();
    }

}