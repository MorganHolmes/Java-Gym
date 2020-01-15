
package Gym;

/**
 *
 * @author Morgan
 */
public enum ClassType {
    SPIN,
    HIIT,
    CORE,
    LBT,
    LIFTING;
    
    public static String classTypeToString(ClassType ty){
     switch(ty){
         case SPIN:
             return "Spin";
         case HIIT:
             return "HIIT";
         case CORE:
             return "Core";
         case LBT: 
             return "Legs, Bums and Tums";
         case LIFTING:
             return "Lifting";
     }
     return "Invalid Class Type";
    }
    
}
