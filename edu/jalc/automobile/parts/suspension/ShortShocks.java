package edu.jalc.automobile.parts.suspension;

public class ShortShocks extends Shock{

   public ShortShocks(double height){
      super(height);
   }

   public String toString(){
      return getHeight() + "in Short Shocks";
   }
}
