package structural.flyweight;

import structural.flyweight.enums.Color;
import structural.flyweight.enums.Model;

import java.util.HashMap;
import java.util.Map;

public class IphoneFactory {
    private static Map<String,IphoneType> iphoneTypes = new HashMap<>();
    public static IphoneType getIphoneType(Color color, short memorySize, Model model){
        IphoneType type = iphoneTypes.get(color.toString()+memorySize+model.toString());
        if(type==null){
            type = new IphoneType(color, memorySize, model);
            iphoneTypes.put(color.toString()+memorySize+model, type);
        }
        return type;
    }
}
