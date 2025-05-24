package wizardsAndWarriors;

//Define the Warrior class
class Warrior extends Fighter{

 @Override
 boolean isVulnerable() {
     return false;
 }

 @Override
 int getDamagePoints(Fighter fighter){
     if(fighter.toString() == "Fighter is a Warrior"){
         return 6;
     }else{ // Wizard
         if(fighter.isVulnerable()){
             return 10;
         }else{ // Not vulnerable, cuz it has casted the spell
             return 6;
         }
     }
 }

 /* 
 Write @Override because the method name matches with method in java.lang.Object & the method in java.lang.Object is public, it will cause compile-time error if you try to assign weaker access(without public)
 */
 /*
 Every class in Java implicitly inherits from java.lang.Object, even if you don’t write it.
 */
 @Override
 public String toString(){
     return "Fighter is a Warrior";
 }
}
