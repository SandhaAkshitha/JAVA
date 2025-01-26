
package dec_12_24;




interface SIMCardInterface {
   String getPhoneNumber(); // Corrected method name
   String getNetworkProvider();
   void activation();
   void deactivation();
}

class Jio implements SIMCardInterface {
   private String phoneNumber;

   public Jio(String phoneNumber) {
       this.phoneNumber = phoneNumber;
   }

   @Override
   public String getPhoneNumber() {
       return phoneNumber;
   }

   @Override
   public String getNetworkProvider() {
       return "Jio";
   }

   @Override
   public void activation() {
       System.out.println("Jio SIM card activated.");
   }

   @Override
   public void deactivation() {
       System.out.println("Jio SIM card deactivated.");
   }
}

class Airtel implements SIMCardInterface {
   private String phoneNumber;

   public Airtel(String phoneNumber) {
       this.phoneNumber = phoneNumber;
   }

   @Override
   public String getPhoneNumber() {
       return phoneNumber;
   }

   @Override
   public String getNetworkProvider() {
       return "Airtel";
   }

   @Override
   public void activation() {
       System.out.println("Airtel SIM card activated.");
   }

   @Override
   public void deactivation() {
       System.out.println("Airtel SIM card deactivated.");
   }
}

class BSNL implements SIMCardInterface {
   private String phoneNumber;

   public BSNL(String phoneNumber) {
       this.phoneNumber = phoneNumber;
   }

   @Override
   public String getPhoneNumber() {
       return phoneNumber;
   }

   @Override
   public String getNetworkProvider() {
       return "BSNL";
   }

   @Override
   public void activation() {
       System.out.println("BSNL SIM card activated.");
   }

   @Override
   public void deactivation() {
       System.out.println("BSNL SIM card deactivated.");
   }
}
