import java.util.*;

/**
 * Computer
 */
public class Computer {
    
     private List<String> parts = new ArrayList<String>();

    //用于将组件组装到电脑里
    public void Add(String part) {
        parts.add(part);
    }

    public void Show(){
          for (int i = 0;i<parts.size();i++){    
            System.out.println("组件"+parts.get(i)+"装好了");
          }
          System.out.println("电脑组装完成，请验收");
          
    }
}