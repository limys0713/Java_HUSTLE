package wizardsAndWarriors;

//Define the Wizard class
class Wizard extends Fighter{
 
 private boolean isVul = true;

 @Override
 boolean isVulnerable(){
     return isVul;
 }

 @Override
 int getDamagePoints(Fighter fighter){
     // If casted the spell
     if(isVul == false){
         return 12;
     }
     return 3;
 }
 
 void prepareSpell(){
     isVul = false;
 }

 @Override
 public String toString(){
     return "Fighter is a Wizard";
 }
}
