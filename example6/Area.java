import java.util.*;

public class Area {
	public static void main(String[] args) {
	
        int length, height, radius = 0;
        double area = 0;

	  Scanner input = new Scanner(System.in);
		
        System.out.println(String.format("What shape do you want to calculate the area for?\n1. Circle\n2. Triangle\n3." +
                " Square\n4. Rectangle\n5. Trapezoid\n6. Pentagon\n7. Hexagon\n8. Octagon"));
	  int shape = input.nextInt();

        switch (shape) {
            // Circle
            case 1:
                  System.out.print("Enter the radius: ");
                  radius = input.nextInt();
                  area = Math.PI*Math.pow(radius, 2);
                  System.out.println("Area: "+area);
                  break;
            // Triangle
            case 2:
                  System.out.print("Enter the length: ");
                  length = input.nextInt();
                  System.out.print("Enter the height: ");
                  height = input.nextInt();
                  area = 0.5*(length*height);
                  System.out.println("Area: "+area);
                  break;
            // Square
            case 3:
                  System.out.print("Enter the length: ");
                  length = input.nextInt();
                  area = Math.pow(length, 2);
                  System.out.println("Area: "+area);
            break;
            // Rectange
            case 4:
                  System.out.print("Enter the length: ");
                  length = input.nextInt();
                  System.out.print("Enter the height: ");
                  height = input.nextInt();
                  area = length*height;
                  System.out.println("Area: "+area);
                  break;
            // Trapezoid   
            case 5:
                  for (int i = 1; i <= 2; i++) {
                  System.out.print("Enter length "+i+": " );
                  length = input.nextInt();
                  area += length;
            }
                  System.out.print("Enter the height: ");
                  height = input.nextInt();
                  area = (area/2)*height;
                  System.out.println("Area: "+area);
                  break;
            // Pentagon
            case 6:
                  System.out.print("Enter the length: ");
                  length = input.nextInt();
                  area = ((0.25)*Math.sqrt(5*(5+2*Math.sqrt(5)))*Math.pow(length,2));
                  System.out.println("Area: "+area);
                  break;
            // Hexagon   
            case 7:
                  System.out.print("Enter the length: ");
                  length = input.nextInt();
                  area = (3*Math.sqrt(3)*length)/2;
                  System.out.println("Area: "+area);
                  break;
            // Octagon
            case 8:
                  System.out.print("Enter the length: ");
                  length = input.nextInt();
                  area = 2*(1+Math.sqrt(2))*Math.pow(length,2);
                  System.out.println("Area: "+area);
                  break;
           
            default:
                  System.out.println("Invalid shape.");
                  break;
        }
        input.close();
      }
    }
