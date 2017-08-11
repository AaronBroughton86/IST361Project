package testpack;

/**
 * Purpose: The purpose of the main class is to pull all classes and run.
 *
 * @author Aaron Broughton, Austin Brown, Nathan Oberdick, Sahil Heighes
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Run {


   public static void main (String[] args){

      Scanner sc = new Scanner(System.in);
      char z, y;
      String s;
      boolean loop;

      //Declares and Instantiates an array of Aircraft objects.
      Aircraft aircraft[] = new Aircraft[4];
      for(int i=0;i<aircraft.length;i++){
         aircraft[i] = new Aircraft();
      }

      //Declares and Instantiates an array of Customer objects.
      Customer customer[] = new Customer[4];
      for(int i=0;i<customer.length;i++){
         customer[i] = new Customer();
      }

      //Declares and Instantiates an array of Drawing objects.
      Drawing drawing[] = new Drawing[20];
      for(int i=0;i<drawing.length;i++){
         drawing[i] = new Drawing();
      }

      //Declares and Instantiates an array of Engineer objects.
      Engineer engineer[] = new Engineer[20];
      for(int i=0;i<engineer.length;i++){
         engineer[i] = new Engineer();
      }

      //Declares and Instantiates an array of Orders objects.
      Orders orders[] = new Orders[4];
      for(int i=0;i<orders.length;i++){
         orders[i] = new Orders();
      }

      //Declares and Instantiates an array of Part objects.
      Part part[] = new Part[12];
      for(int i=0;i<part.length;i++){
         part[i] = new Part();
      }

      //Declares and Instantiates an array of Revision objects.
      Revision revision[] = new Revision[5];
      for(int i=0;i<revision.length;i++){
         revision[i] = new Revision(engineer[i]);
      }

      //Declares two counter variables
      int i,j;

      //Hard coded initial variables

      //Sets the aircraft names in the Aircraft Array
      aircraft[0].setName("ABC");
      aircraft[1].setName("DEF");
      aircraft[2].setName("GHI");
      aircraft[3].setName("JKL");


      //Sets the aircraft description in the Aircraft Array
      aircraft[0].setDescription("B52 Bomber");
      aircraft[1].setDescription("Boeing 747");
      aircraft[2].setDescription("P51 Mustang");
      aircraft[3].setDescription("Northrop Grumman E-2 Hawkeye");

      //Sets the aircraft prices in the Aircraft Array
      aircraft[0].setPrice(80000);
      aircraft[1].setPrice(97000);
      aircraft[2].setPrice(47000);
      aircraft[3].setPrice(32000);

      //Sets the engineer names in the Aircraft Array
      aircraft[0].setEngineer(engineer[0], engineer[4]);
      aircraft[1].setEngineer(engineer[1], null);
      aircraft[2].setEngineer(engineer[2], null);
      aircraft[3].setEngineer(engineer[3], engineer[7]);

      //Sets the part objects in the Aircraft Array
      aircraft[0].setPart(1 ,part[0]);
      aircraft[0].setPart(2, part[1]);
      aircraft[0].setPart(3, part[2]);
      aircraft[1].setPart(1, part[3]);
      aircraft[1].setPart(2, part[4]);
      aircraft[1].setPart(3, part[5]);
      aircraft[2].setPart(1, part[6]);
      aircraft[2].setPart(2, part[7]);
      aircraft[2].setPart(3, part[8]);
      aircraft[3].setPart(1, part[9]);
      aircraft[3].setPart(2, part[10]);
      aircraft[3].setPart(3, part[11]);


      //Sets the customer names in the Customer Array
      customer[0].setCustName("Billy");
      customer[1].setCustName("Joel");
      customer[2].setCustName("Harry");
      customer[3].setCustName("Dr. Frankenstein");

      //Sets the customer addresses in the Customer Array
      customer[0].setCustAddress("22 King St.");
      customer[1].setCustAddress("14 Fanta St.");
      customer[2].setCustAddress("55 Termite terrorist");
      customer[3].setCustAddress("123 Elm St.");

      //Sets the customer emails in the Customer Array
      customer[0].setCustEmail("greg@gmail.com");
      customer[1].setCustEmail("whySoSerious@yahoo.com");
      customer[2].setCustEmail("coolguy@gmail.com");
      customer[3].setCustEmail("Ilovepsu@gmail.com");

      //Sets the revision objects in the Drawing Array
      drawing[0].setRevision(1 ,revision[0]);
      drawing[3].setRevision(1, revision[3]);
      drawing[3].setRevision(2, revision[4]);

      //Sets the drawing dates in the Drawing Array
      for (i=0; i<drawing.length; i++){
         drawing[i].setDate(null);
      }
      drawing[0].setDate("01-12-1995");
      drawing[1].setDate("03-22-2015");
      drawing[2].setDate("04-20-2000");
      drawing[3].setDate("06-09-1969");

      //Sets the engineer objects in the Drawing Array
      for (i=0 ; i<drawing.length ; i++){
         drawing[i].setEngineer(engineer[i]);
      }


      //Sets the drawing ID in the Drawing Array
      for(i = 0; i < drawing.length; i++){
         drawing[i].setDrawingID(i+1);
      }

      //Sets the engineer last names in the Engineer Array
      engineer[0].setLastName("Bond");
      engineer[1].setLastName("Turner");
      engineer[2].setLastName("Fenton");
      engineer[3].setLastName("Neutron");
      engineer[4].setLastName("Flinstone");
      engineer[5].setLastName("Jetson");
      engineer[6].setLastName("Stine");
      engineer[7].setLastName("Blanc");
      engineer[8].setLastName("Curry");
      engineer[9].setLastName("Raymond");
      engineer[10].setLastName("Prince");
      engineer[11].setLastName("Morales");
      engineer[12].setLastName("Fries");
      engineer[13].setLastName("Reyes");
      engineer[14].setLastName("Hawkins");
      engineer[15].setLastName("Elric");
      engineer[16].setLastName("Son");
      engineer[17].setLastName("Tetch");
      engineer[18].setLastName("Hagen");
      engineer[19].setLastName("Avery");

      //Sets the engineer first names in the Engineer Array
      engineer[0].setFirstName("James");
      engineer[1].setFirstName("Timmothy");
      engineer[2].setFirstName("Daniel");
      engineer[3].setFirstName("James");
      engineer[4].setFirstName("Frederick");
      engineer[5].setFirstName("George");
      engineer[6].setFirstName("Robert");
      engineer[7].setFirstName("Mel");
      engineer[8].setFirstName("Arthur");
      engineer[9].setFirstName("Robert");
      engineer[10].setFirstName("Diana");
      engineer[11].setFirstName("Miles");
      engineer[12].setFirstName("Victor");
      engineer[13].setFirstName("Jamie");
      engineer[14].setFirstName("Virgil");
      engineer[15].setFirstName("Edward");
      engineer[16].setFirstName("Gohan");
      engineer[17].setFirstName("Edward");
      engineer[18].setFirstName("Matthew");
      engineer[19].setFirstName("Tex");

      //Sets the engineer hours in the Engineer Array
      engineer[0].setHours(7);
      engineer[1].setHours(10);
      engineer[2].setHours(22);
      engineer[3].setHours(45);



      //Creates the Orders

      //Sets the quantity of aircrafts ordered by calling the setQuantity function from the Aircraft object array from wihtin the Orders object array
      orders[0].aircraft[0].setQuantity(3);
      orders[0].aircraft[3].setQuantity(1);
      orders[1].aircraft[1].setQuantity(2);
      orders[2].aircraft[3].setQuantity(2);

      //Sets the customer of each order by calling the setCustomer function from the Orders object array
      orders[0].setCustomer(customer[0]);
      orders[1].setCustomer(customer[1]);
      orders[2].setCustomer(customer[2]);
      orders[3].setCustomer(customer[3]);

      //Sets the dates of each order by calling the setDate function from the Orders object array
      orders[0].setDate("02-01-2017");
      orders[1].setDate("02-02-2017");
      orders[2].setDate("02-17-2017");

      //Sets the flag determining if the order is open or closed by calling the setStatusFlag function from the Orders object array
      orders[0].setStatusFlag(true);
      orders[1].setStatusFlag(true);
      orders[2].setStatusFlag(false);
      orders[3].setStatusFlag(false);

      //For loop setting the name of each aicraft within each order by using the setName function from the Aircraft array from within the Orders array
      for(i=0; i<4 ; i++){
         orders[i].aircraft[0].setName(aircraft[0].getName());
         orders[i].aircraft[1].setName("DEF");
         orders[i].aircraft[2].setName("GHI");
         orders[i].aircraft[3].setName("JKL");
      }

    //Part Creation

      //Sets the aircraftId for the part array by passing the value of the aircraft name by using the getName function from the Aircraft array
      part[0].setAircraftID(aircraft[0].getName());
      part[1].setAircraftID(aircraft[0].getName());
      part[2].setAircraftID(aircraft[0].getName());
      part[3].setAircraftID(aircraft[1].getName());
      part[4].setAircraftID(aircraft[1].getName());
      part[5].setAircraftID(aircraft[1].getName());
      part[6].setAircraftID(aircraft[2].getName());
      part[7].setAircraftID(aircraft[2].getName());
      part[8].setAircraftID(aircraft[2].getName());
      part[9].setAircraftID(aircraft[3].getName());
      part[10].setAircraftID(aircraft[3].getName());
      part[11].setAircraftID(aircraft[3].getName());

      //For loop used to set the drawing for each part by using the setDrawing function from the Part array
      for (i = 0; i<part.length;i++){
         part[i].setDrawing(drawing[i]);
      }

      //Sets the part description for each part by using the setDescription method from the Part array
      part[0].setDescription("Engine");
      part[1].setDescription("Wings");
      part[2].setDescription("Landing Gear");
      part[3].setDescription("Engine");
      part[4].setDescription("Windows");
      part[5].setDescription("Landing Gear");
      part[6].setDescription("Engine");
      part[7].setDescription("Exhaust fan");
      part[8].setDescription("Seats");
      part[9].setDescription("Engine");
      part[10].setDescription("Landing Gear");
      part[11].setDescription("Windows");

      //Sets the part ID for each part by using the setPartID method from the Part array
      part[0].setPartID(10001);
      part[1].setPartID(10002);
      part[2].setPartID(10003);
      part[3].setPartID(10004);
      part[4].setPartID(10005);
      part[5].setPartID(10006);
      part[6].setPartID(10007);
      part[7].setPartID(10008);
      part[8].setPartID(10009);
      part[9].setPartID(10010);
      part[10].setPartID(10011);
      part[11].setPartID(10012);

      //Sets the vendor for each part by by using the setVendorID method from the Part array
      part[0].setVendorID(2001);
      part[1].setVendorID(2002);
      part[2].setVendorID(2003);
      part[3].setVendorID(2001);
      part[4].setVendorID(2004);
      part[5].setVendorID(2003);
      part[6].setVendorID(2001);
      part[7].setVendorID(2005);
      part[8].setVendorID(2006);
      part[9].setVendorID(2001);
      part[10].setVendorID(2003);
      part[11].setVendorID(2004);


    //Revisions Creation

      //Sets the date of each revision by using the setDate function from the Revisions array
      revision[0].setDate("01-01-2016");
      revision[3].setDate("01-05-2016");
      revision[4].setDate("01-08-2016");

      //Sets the second and third revisions as not having happened by setting them to null
      revision[1] = null;
      revision[2] = null;

      //Sets the drawing Id for each revision by using the setDrawingID function of the Revision array, and passing the value acquired by using the getDrawingID function of the Drawing array
      revision[0].setDrawingID(drawing[0].getDrawingID());
      revision[3].setDrawingID(drawing[3].getDrawingID());
      revision[4].setDrawingID(drawing[3].getDrawingID());

      //Sets the engineer of each revision by using the setEngineer function from the Revisions array
      revision[0].setEngineer(engineer[1]);
      revision[3].setEngineer(engineer[3]);
      revision[4].setEngineer(engineer[2]);

      //Sets the revision letter of each revision by using the setLetter function from the Revisions array
      revision[0].setLetter("A");
      revision[3].setLetter("A");
      revision[4].setLetter("B");
      System.out.println("===================================");
      System.out.println("  Welcome to Whatever Electronics  ");
      System.out.println("==================================\n");

      //Do while loop to process user input to run various reports
      do{
         //Prompts the user to see which report they want to run
         System.out.println("\na = Report All Customers and Their Purchases");
         System.out.println("b = Report All Open Orders");
         System.out.println("c = Report all Parts that go to Each Aircraft");
         System.out.println("d = Report a list of all Parts by a specific VendorID");
         System.out.println("e = Report of all Aircrafts associated with a specific part");
         System.out.println("f = Report of all Engineers Assigned to a specific Aircraft");
         System.out.println("g = Report of all Drawing Assigned to a specific Engineer");
         System.out.println("h = Report of all Revisions");
         System.out.println("i = Report of all Customers by Aircraft\n");
         System.out.println("x = To close the program");
         System.out.print("\nPlease enter a choice: ");

         //Acquires the user input, and records the first character
         z = sc.next().charAt(0);
         z = Character.toLowerCase(z);

         System.out.print("\n");
         //Star of initial switch to choose which report to run
         switch (z) {
            //If user types in selection 'a', this runs
            case 'a':
            

                //Prompts user for additional input so that they can chose which customer or customers to view
                System.out.println("Select which Customer you wish to view \n\n a - All Customers \n b - "
                    + customer[0].getCustName() + "\n c - "+customer[1].getCustName()+ "\n d - "+customer[2].getCustName()+
                    "\n e - "+customer[3].getCustName());
                
               System.out.print("\nPlease enter a choice: ");
               //Acquires the user input, and records the first character
               y = sc.next().charAt(0);
               y = Character.toLowerCase(y);
               System.out.print("\n");
               //Start of secondary switch to choose which customer or customers to view their orders
               switch(y){

                  //Case 'a' to view the orders for all the customers
                  case 'a':

                  //Report of all Customers and their Purchases
                     System.out.println("===============================================");
                     System.out.println("  Report of all Customers and their Purchases  ");
                     System.out.println("===============================================");

                     //For loop used to cycle through each orders
                     for(i=0; i<orders.length; i++){

                        //For loop used to cycle through each aircraft
                        for(j=0; j<aircraft.length; j++){

                           //If statements used to output the customer name, and the description of the aircraft ordered if one aircraft was ordered
                           if(orders[i].aircraft[j].getQuantity() == 1 )
                              //Outputs the appropriate text if the if statment is reached
                              System.out.println(orders[i].getCustomer().getCustName()+" Ordered 1 "+aircraft[j].getDescription());

                           //If statements used to output the customer name, and the description of the aircraft ordered if two aircrafts were ordered
                           if(orders[i].aircraft[j].getQuantity() == 2 )
                              //Outputs the appropriate text if the if statment is reached
                              System.out.println(orders[i].getCustomer().getCustName()+" Ordered 2 "+aircraft[j].getDescription());

                           //If statements used to output the customer name, and the description of the aircraft ordered if three aircrafts were ordered
                           if(orders[i].aircraft[j].getQuantity() == 3 )
                              //Outputs the appropriate text if the if statment is reached
                              System.out.println(orders[i].getCustomer().getCustName()+" Ordered 3 "+aircraft[j].getDescription());

                           //If statements used to output the customer name, and the description of the aircraft ordered if four aircrafts were ordered
                           if(orders[i].aircraft[j].getQuantity() == 4 )
                              //Outputs the appropriate text if the if statment is reached
                              System.out.println(orders[i].getCustomer().getCustName()+" Ordered 4 "+aircraft[j].getDescription());
                        }//Ends inner for loop
                     }//Ends outer for loop
                     //Ends case 'a'
                     break;

                  //Case 'b' to view the orders for the first customer
                  case 'b':

                     //For loop used to cycle through each orders
                     for(i=0; i<orders.length; i++){

                        //For loop used to cycle through each aircraft
                        for(j=0; j<aircraft.length; j++){

                           //If statement used to verify that customer chosen from the Orders array is also the same customer in the Customers array
                           if (orders[i].getCustomer().getCustName() == customer[0].getCustName()){

                              //If statements used to output the customer name, and the description of the aircraft ordered if one aircraft was ordered
                              if(orders[i].aircraft[j].getQuantity() == 1 )
                                 //Outputs the appropriate text if the if statment is reached
                                 System.out.println(orders[i].getCustomer().getCustName()+" Ordered 1 "+aircraft[j].getDescription());

                              //If statements used to output the customer name, and the description of the aircraft ordered if two aircrafts were ordered
                              if(orders[i].aircraft[j].getQuantity() == 2 )
                                 //Outputs the appropriate text if the if statment is reached
                                 System.out.println(orders[i].getCustomer().getCustName()+" Ordered 2 "+aircraft[j].getDescription());

                              //If statements used to output the customer name, and the description of the aircraft ordered if three aircrafts were ordered
                              if(orders[i].aircraft[j].getQuantity() == 3 )
                                 //Outputs the appropriate text if the if statment is reached
                                 System.out.println(orders[i].getCustomer().getCustName()+" Ordered 3 "+aircraft[j].getDescription());

                              //If statements used to output the customer name, and the description of the aircraft ordered if four aircrafts were ordered
                              if(orders[i].aircraft[j].getQuantity() == 4 )
                                 //Outputs the appropriate text if the if statment is reached
                                 System.out.println(orders[i].getCustomer().getCustName()+" Ordered 4 "+aircraft[j].getDescription());
                           }//Ends the outer if statement
                        }//Ends the inner for loop
                     }//Ends the outer for loop
                     //Ends case 'b'
                     break;

                  //Case 'c' to view the orders for the second customer
                  case 'c':

                     //For loop used to cycle through each orders
                     for(i=0; i<orders.length; i++){

                        //For loop used to cycle through each aircraft
                        for(j=0; j<aircraft.length; j++){

                           //If statement used to verify that customer chosen from the Orders array is also the same customer in the Customers array
                           if (orders[i].getCustomer().getCustName() == customer[1].getCustName()){


                              //If statements used to output the customer name, and the description of the aircraft ordered if one aircraft was ordered
                              if(orders[i].aircraft[j].getQuantity() == 1 )
                                 //Outputs the appropriate text if the if statment is reached
                                 System.out.println(orders[i].getCustomer().getCustName()+" Ordered 1 "+aircraft[j].getDescription());

                              //If statements used to output the customer name, and the description of the aircraft ordered if two aircrafts were ordered
                              if(orders[i].aircraft[j].getQuantity() == 2 )
                                 //Outputs the appropriate text if the if statment is reached
                                 System.out.println(orders[i].getCustomer().getCustName()+" Ordered 2 "+aircraft[j].getDescription());

                              //If statements used to output the customer name, and the description of the aircraft ordered if three aircrafts were ordered
                              if(orders[i].aircraft[j].getQuantity() == 3 )
                                 //Outputs the appropriate text if the if statment is reached
                                 System.out.println(orders[i].getCustomer().getCustName()+" Ordered 3 "+aircraft[j].getDescription());

                              //If statements used to output the customer name, and the description of the aircraft ordered if four aircrafts were ordered
                              if(orders[i].aircraft[j].getQuantity() == 4 )
                                 //Outputs the appropriate text if the if statment is reached
                                 System.out.println(orders[i].getCustomer().getCustName()+" Ordered 4 "+aircraft[j].getDescription());
                           }//Ends the outer if statement
                        }//Ends the inner for loop
                     }//Ends the outer for loop
                     //Ends case 'c'
                     break;

                  //Case 'd' to view the orders for the third customer
                  case 'd':

                     //For loop used to cycle through each orders
                     for(i=0; i<orders.length; i++){

                        //For loop used to cycle through each aircraft
                        for(j=0; j<aircraft.length; j++){

                           //If statement used to verify that customer chosen from the Orders array is also the same customer in the Customers array
                           if (orders[i].getCustomer().getCustName() == customer[2].getCustName()){


                              //If statements used to output the customer name, and the description of the aircraft ordered if one aircraft was ordered
                              if(orders[i].aircraft[j].getQuantity() == 1 )
                                 //Outputs the appropriate text if the if statment is reached
                                 System.out.println(orders[i].getCustomer().getCustName()+" Ordered 1 "+aircraft[j].getDescription());

                              //If statements used to output the customer name, and the description of the aircraft ordered if two aircrafts were ordered
                              if(orders[i].aircraft[j].getQuantity() == 2 )
                                 //Outputs the appropriate text if the if statment is reached
                                 System.out.println(orders[i].getCustomer().getCustName()+" Ordered 2 "+aircraft[j].getDescription());

                              //If statements used to output the customer name, and the description of the aircraft ordered if three aircrafts were ordered
                              if(orders[i].aircraft[j].getQuantity() == 3 )
                                 //Outputs the appropriate text if the if statment is reached
                                 System.out.println(orders[i].getCustomer().getCustName()+" Ordered 3 "+aircraft[j].getDescription());

                              //If statements used to output the customer name, and the description of the aircraft ordered if four aircrafts were ordered
                              if(orders[i].aircraft[j].getQuantity() == 4 )
                                 //Outputs the appropriate text if the if statment is reached
                                 System.out.println(orders[i].getCustomer().getCustName()+" Ordered 4 "+aircraft[j].getDescription());
                           }//Ends the outer if statement
                        }//Ends the inner for loop
                     }//Ends the outer for loop
                     //Ends case 'd' or 'D'
                     break;

                  //Case 'e' to view the orders for the fourth customer
                  case 'e':


                     //For loop used to cycle through each orders
                     for(i=0; i<orders.length; i++){

                        //For loop used to cycle through each aircraft
                        for(j=0; j<aircraft.length; j++){

                           //If statement used to verify that customer chosen from the Orders array is also the same customer in the Customers array
                           if (orders[i].getCustomer().getCustName() == customer[3].getCustName()){


                              //If statements used to output the customer name, and the description of the aircraft ordered if one aircraft was ordered
                              if(orders[i].aircraft[j].getQuantity() == 1 )
                                 //Outputs the appropriate text if the if statment is reached
                                 System.out.println(orders[i].getCustomer().getCustName()+" Ordered 1 "+aircraft[j].getDescription());

                              //If statements used to output the customer name, and the description of the aircraft ordered if two aircrafts were ordered
                              if(orders[i].aircraft[j].getQuantity() == 2 )
                                 //Outputs the appropriate text if the if statment is reached
                                 System.out.println(orders[i].getCustomer().getCustName()+" Ordered 2 "+aircraft[j].getDescription());

                              //If statements used to output the customer name, and the description of the aircraft ordered if three aircrafts were ordered
                              if(orders[i].aircraft[j].getQuantity() == 3 )
                                 //Outputs the appropriate text if the if statment is reached
                                 System.out.println(orders[i].getCustomer().getCustName()+" Ordered 3 "+aircraft[j].getDescription());

                              //If statements used to output the customer name, and the description of the aircraft ordered if four aircrafts were ordered
                              if(orders[i].aircraft[j].getQuantity() == 4 )
                                 //Outputs the appropriate text if the if statment is reached
                                 System.out.println(orders[i].getCustomer().getCustName()+" Ordered 4 "+aircraft[j].getDescription());
                           }//Ends the outer if statement
                        }//Ends the inner for loop
                     }//Ends the outer for loop
                     //Ends case 'c'
                     break;

                  //Case that executes if the customer enters in a character that is not a choice
                  default:

                     //Error message that is outputted
                     System.out.println("Error");

                     //Ends the default case
                     break;
               }//Ends the inner switch

               //Ends case 'a'
               break;

            //Case 'b' to run report of all orders
            case 'b':

            //Report of all open orders
               System.out.println("=============================");
               System.out.println("  Report of all open orders  ");
               System.out.println("=============================");

               //Cycles through each order
               for (i=0;i<orders.length;i++){

                  //Checks if the order is open by seeing if the status flag is set to false
                  if (!orders[i].getStatusFlag()){

                     /**
                        Outputs the open orders by cycling through the orders array and get the customer name from the open order by using the Order array's getCustomer function to get the
                        getCustName function
                     */
                     System.out.println(orders[i].getCustomer().getCustName() + " still has an open order");
                  }//Ends if statement
               }//Ends the for loop

               //Ends case 'b'
               break;

            //Case 'c' to view parts related to specific aircrafts
            case 'c':

               //Prompts the user about which aircraft they want to see parts for
               System.out.println("Select aircraft to view parts for: \n a - All Aircraft \n b - "+aircraft[0].getDescription() +
                    "\n c - "+ aircraft[1].getDescription()+"\n d - "+aircraft[2].getDescription()+"\n e - "+aircraft[3].getDescription());
               
               System.out.print("\nPlease enter a choice: ");
               //Records the first character from the user input
               y = sc.next().charAt(0);
               y = Character.toLowerCase(y);
               System.out.print("\n");
               //Start of secondary switch used to show the part for the aircraft that the customer chose
               switch (y) {

                  //Case 'a' used to show all the parts for every aircraft
                  case 'a':

                     //Outputs a report of all parts that go into each aircraft
                     System.out.println("==================================================");
                     System.out.println("  Report of all parts that go into each aircraft  ");
                     System.out.println("==================================================");

                     //For loop used to cycle through each aircraft in the Aircraft array
                     for (i=0;i<aircraft.length;i++){

                        //For loop used to cycle through each part in the Parts array
                        for (j=0;j<3;j++){

                           //Outputs parts for specific aircrafts
                           System.out.println(aircraft[i].getDescription() + " uses " + aircraft[i].getPart(j).getDescription());
                        }//Ends inner for loop
                     }//Ends outer for loop

                     //Ends case 'a'
                     break;

                  //Case 'b' used to show the parts for the first aircraft in the Aircraft array
                  case 'b':

                     //For loop used to cycle through the parts array, and output both the first aircraft and its parts
                     for (j=0;j<3;j++){
                        System.out.println(aircraft[0].getDescription() + " uses " + aircraft[0].getPart(j).getDescription());
                     }//Ends for loop

                     //Ends case 'b'
                     break;

                  //Case 'c' used to show the parts for the second aircraft in the Aircraft array
                  case 'c':

                     //For loop used to cycle through the parts array, and output both the second aircraft and its parts
                     for (j=0;j<3;j++){
                        System.out.println(aircraft[1].getDescription() + " uses " + aircraft[1].getPart(j).getDescription());
                     } // end for loop

                     //Ends case 'c'
                     break;

                  //Case 'd' used to show the parts for the third aircraft in the Aircraft array
                  case 'd':

                     //For loop used to cycle through the parts array, and output both the third aircraft and its parts
                     for (j=0;j<3;j++){
                        System.out.println(aircraft[2].getDescription() + " uses " + aircraft[2].getPart(j).getDescription());
                     }// end for loop

                     //end case 'd'
                     break;

                  //Case 'e' used to show the parts for the fourth aircraft in the Aircraft array
                  case 'e':

                     //For loop used to cycle through the parts array, and output both the fourth aircraft and its parts
                     for (j=0;j<3;j++){
                        System.out.println(aircraft[3].getDescription() + " uses " + aircraft[3].getPart(j).getDescription());
                     }// end for loop

                     //End case 'e'
                     break;

                  // Default case
                  default:
                      //lets user know they did not type in a correct selection
                     System.out.println("ERROR! Please try again.");

                     //end default
                     break;
               }//End secondary switch

               //End case 'c'
               break;

	    //Case 'd' runs a report of parts by specific vendor
            case 'd':

               //Used to output the report of the parts made by a specific vendor

               //Prompts the user to enter the Vendor ID of a vendor to see the parts associated to the vendor
               System.out.println("Report for list of parts given by a specific vendor ");
               System.out.println("----------------------------------------------------");
               System.out.print("\nEnter Vendor ID: ");

               //Takes the user input from the prompt, and stores it as the integer x
               int x = sc.nextInt();

	       //For loop used to cycle through the Parts array to find parts by the Vendor ID stored in the variable x
               for (i=0; i<part.length;i++){

		  //If statement used to verify that the part is from the Vendor ID stored in the variable x
                  if (part[i].getVendorID() ==x)

		     //Outputs the parts description, aircraft ID, and vendor ID from the vendor ID stored in x
                     System.out.println(part[i].getDescription() + " For Aircraft " + part[i].getAircraftID() + " is given to us by Vendor ID: "+ part[i].getVendorID());
               }//Ends for loop

               //Ends case 'd'
               break;

	    //If the user types in 'e', this runs
            case 'e':

               //Report used to show which aircrafts are tied to which parts

	       //Prompts the the user to enter in a partID
               System.out.println("Report of what partID goes to which aircraft");
               System.out.println("--------------------------------------------");
               System.out.print("\nEnter Part ID: ");

	       //Takes the user input, and stores it an the integer x
               x = sc.nextInt();

	       //For loop used to cycle through the array, and the output the aircrafts tied to the pardID stored in the variable x
               for (i=0;i<part.length;i++){

	          //If statement used to verify that the integer entered in x is a partID in the Part array
                  if (x == part[i].getPartID())

		     /**
			Outputs the partID by using the getPartID function from the Part array, and uses the getAircraftID function from the Part array
			to get the aircraftID
		     */
                     System.out.println("Part ID "+part[i].getPartID() + " goes to Aircraft ID: " + part[i].getAircraftID());
               }//Ends the for loop

	       //Ends case 'e'
               break;

	    //If the user types in 'f', this runs
            case 'f':

               //A report of all Engineers assigned to a specific Aircraft

	       //Prompts the user to chose to view the engineers for all aircrafts or a specific one
               System.out.println("Select which aircraft to view: \n a - All Aircraft \n b - "+aircraft[0].getDescription() +
                    "\n c - "+ aircraft[1].getDescription()+"\n d - "+aircraft[2].getDescription()+"\n e - "+aircraft[3].getDescription());
               
               System.out.print("\nPlease enter a choice: ");
	       //Takes the user inpet from the prompt, and stores the first character of it as the char variable y
               y = sc.next().charAt(0);
               y = Character.toLowerCase(y);
               System.out.print("\n");
	       //Switch used to print out the engineers based on the choice of aircraft(s) stored in the y variable
               switch (y){

		  //Case 'a' shows the output of all engineers for all aircrafts
                  case'a':

		     //Outputs the title of the option that was selected
                     System.out.println("=============================================================");
                     System.out.println("  A report of all Engineers assigned to a specific Aircraft  ");
                     System.out.println("=============================================================");

		     //For loop used to cycle through the Aircraft array to ouput all aircrafts and their engineers
                     for(i=0;i<aircraft.length;i++){

			/**
			    Outputs the description of the aircraft by using the getDescription method from the Aircraft array, and the last name of the
			    engineer tied to that aircraft by using the getEngineer1 function from the Aircraft array
		        */
                        System.out.print(aircraft[i].getDescription() + " is worked on by " + aircraft[i].getEngineer1().getLastName());

			/**
			    If statement used to catch if the aircraft has a second engineer by checking if the value stored in the getEngineer2 function
			    from the aircraft array is not set to null
			*/
                        if (aircraft[i].getEngineer2() != null){

			   //Outputs the second engineer by using the getLastname function from within the getEngineer2 function of the Aircraft array
                           System.out.println(" and "+ aircraft[i].getEngineer2().getLastName());
                        }//Ends the if statement

			//Else statement used to catch if the aircraft does not have a second engineer
                        else
                           System.out.println("");
                     }//Ends for loop

		     //Ends case 'a'
                     break;

		  //Case 'b' shows the output of all engineers for the first aircraft
                  case'b':

    		     /**
			Outputs the description of the first aircraft by using the getDescription function from the Aircraft array, and it's engineer
			by using the getLastName function from within the getEngineer1 function of the Aircraft array
		     */
                     System.out.print(aircraft[0].getDescription() + " is worked on by " + aircraft[0].getEngineer1().getLastName());

		     /**
			If statement used to check if the aircraft has a second engineer by seeing if the value acquired by the getEngineer2 function
			from the Aircraft array is not set to null
		     */
                     if (aircraft[0].getEngineer2() != null){
                        System.out.println(" and "+ aircraft[0].getEngineer2().getLastName());
                     }

		     //Else statement used to catch any aircraft that does not have a second engineer
                     else
                        System.out.println("");
                     break;
                     
                  //Case 'c' shows the output of aircrafts being worked on by specific engineers 
                  case'c':
                      
                     System.out.print(aircraft[1].getDescription() + " is worked on by " + aircraft[1].getEngineer1().getLastName());
                     if (aircraft[1].getEngineer2() != null){
                        System.out.println(" and "+ aircraft[1].getEngineer2().getLastName());
                     }
                     else
                        System.out.println("");
                     break;
                     
                  //Case 'd'
                  case'd':
                      
                     System.out.print(aircraft[2].getDescription() + " is worked on by " + aircraft[2].getEngineer1().getLastName());
                     if (aircraft[2].getEngineer2() != null){
                        System.out.println(" and "+ aircraft[2].getEngineer2().getLastName());
                     }
                     else
                        System.out.println("");
                     break;
                     
                  //Case 'e'
                  case'e':
                      
                     System.out.print(aircraft[3].getDescription() + " is worked on by " + aircraft[3].getEngineer1().getLastName());
                     if (aircraft[3].getEngineer2() != null){
                        System.out.println(" and "+ aircraft[3].getEngineer2().getLastName());
                     }
                     else
                        System.out.println("");
                     break;

                  default:
                     System.out.println("ERROR! Please try again.");
                     break;
               }
               break;

            //Case 'g'
            case 'g':

               System.out.println("Type in the last name of the Engineer, or type \"*\" (without quotes) for all engineers: ");
               System.out.println("-------------------------------------------------------------------------------------------");
               System.out.print("\nEnter last name: ");
               s = sc.next();
               
               if (s.equals("*"))
               {
                  for(i=0;i<drawing.length;i++){

                     if (drawing[i].getDate() != null)
                        System.out.println(drawing[i].getEngineer().getLastName() + " Has Drawn ID: "+ drawing[i].getDrawingID() + " on " +drawing[i].getDate());
                  }
               }

               else
               {
                  for(i=0;i<drawing.length;i++){
                     if (s.equals(drawing[i].getEngineer().getLastName())){
                        if (drawing[i].getDate() != null)
                           System.out.println(drawing[i].getEngineer().getLastName() + " Has Drawn ID: "+ drawing[i].getDrawingID() + " on " +drawing[i].getDate());
                        else
                           System.out.println(s + " did not make a drawing.");
                     }
                  }
               }

               //end Case 'g'
               break;
            
            //Case 'h'
            case 'h':
                
               System.out.println("======================================================");
               System.out.println("  Report of all revisions with their date, drawingID,  ");
               System.out.println("           and which engineer did the revision        ");
               System.out.println("======================================================");
               for(i=0;i<revision.length;i++){
                  if (revision[i] != null){
                     System.out.println("Drawing ID " + revision[i].getDrawingID() + " was revised on "+revision[i].getDate()+" By "+revision[i].getEngineer().getLastName()+". This is Revision "+ revision[i].getLetter());
                  }
               }
               //end Case 'h'
               break;
            
            //Case 'i'
            case 'i':

               //Prompts the user about which aircraft they want to see parts for
               System.out.println("Select aircraft to view customers for: \n a - All Aircraft \n b - "+aircraft[0].getDescription() +
                    "\n c - "+ aircraft[1].getDescription()+"\n d - "+aircraft[2].getDescription()+"\n e - "+aircraft[3].getDescription());
               
               System.out.print("\nPlease enter a choice: ");
               //Records the first character from the user input
               y = sc.next().charAt(0);
               y = Character.toLowerCase(y);
               System.out.print("\n");
               
               //Start of secondary switch used to show the part for the aircraft that the customer chose
               switch (y) {
                  //Case 'a'
                  case 'a':
                      
                     System.out.println("=============================================================");
                     System.out.println("   Report of all customers by the aircraft(s) they ordered   ");
                     System.out.println("=============================================================");

                     for(i=0; i<aircraft.length;i++){
                        for(j=0;j<orders.length;j++){
                           if (orders[j].aircraft[i].getQuantity() == 0){
                           }
                           else{

                              System.out.println("This person ordered a " + aircraft[i].getDescription() + ": " + customer[j].getCustName() );
                           }
                        }
                     }
                     //end Case 'a'
                     break;
                     
                  //Case 'b'
                  case 'b':
                      
                     for(j=0;j<orders.length;j++){
                        if (orders[j].aircraft[0].getQuantity() == 0){
                        }
                        else{

                           System.out.println("This person ordered a " + aircraft[0].getDescription() + ": " + customer[j].getCustName() );
                        }
                     }
                     //end Case 'b'
                     break;
                  
                  //Case 'c'
                  case 'c':
                      
                     for(j=0;j<orders.length;j++){
                        if (orders[j].aircraft[1].getQuantity() == 0){
                        }
                        else{

                           System.out.println("This person ordered a " + aircraft[1].getDescription() + ": " + customer[j].getCustName() );
                        }
                     }
                     //end Case 'c'
                     break;
                  
                  //Case 'd'
                  case 'd':
                      
                     for(j=0;j<orders.length;j++){
                        if (orders[j].aircraft[2].getQuantity() == 0){
                        }
                        else{

                           System.out.println("This person ordered a " + aircraft[2].getDescription() + ": " + customer[j].getCustName() );
                        }
                     }
                     //end Case 'd'
                     break;
                  
                  //Case 'e'
                  case 'e':
                      
                     for(j=0;j<orders.length;j++){
                        if (orders[j].aircraft[3].getQuantity() == 0){
                        }
                        else{

                           System.out.println("This person ordered a " + aircraft[3].getDescription() + ": " + customer[j].getCustName() );
                        }
                     }
                     //end Case 'e'
                     break;

                  default:
                     System.out.println("ERROR! Please try again.");
                     break;
               }
               break;
            //Case 'x'
            case 'x':
               System.exit(-1);

            default:
               System.out.println("ERROR! Please try again.");
               break;
         }
         sleep(3000); // sleep for 2 seconds
         System.out.println("\n=======================");
         System.out.println("  Select a new option  ");
         System.out.println("=======================");

      }// end do
      while(true);



   }// end main method
   
   /** sleep method: allows program to wait/pause
    * 
    * @param time 
    */
   public static void sleep(int time){
       try {
           Thread.sleep(time);
           
       } catch (Exception e) {}
   } // end sleep method



}// end Run class
