# Car Service Station Software
This software is designed for a car service station and demonstrates the use of Object-Oriented Programming (OOP) concepts. It provides features to generate a detailed bill for different types of cars and services requested by customers, showcasing the following OOP principles:

## Encapsulation
The software uses encapsulation to hide the implementation details of the CarServiceStation class and expose only the necessary methods and properties to interact with the car service station functionality. The internal data structures and pricing information are encapsulated within the class, providing a clean and organized interface for generating bills.

## Inheritance
The software utilizes inheritance to define different types of cars: Hatchback, Sedan, and SUV. Each car type inherits common properties and methods from a base Car class, allowing for code reuse and maintaining a consistent structure across different car types.

## Polymorphism
The software demonstrates polymorphism by defining multiple service classes, such as BasicService, EngineFixingService, ClutchFixingService, BrakeFixingService, and GearFixingService. These classes inherit from a common Service class and override its methods to provide specific implementations for each service type. The polymorphic behavior allows treating different service objects uniformly, simplifying the code and enabling flexibility in adding new service types.

## How to Use
1. Compile the Java program using the following command:
**javac Main.java**
2. Run the program using the following command:
**java Main**
3. Enter the type of car: Hatchback, Sedan, or SUV.
4. Enter the service codes separated by commas (e.g., BS01, EF01, CF01).
5. The program will generate a detailed bill based on the provided information.
6. The bill will include the charges for each service and the total bill amount.
7. If the total bill exceeds ₹ 10000, a complimentary cleaning will be mentioned in the bill.

## Screenshots
![CarServiceStation – Main java 16-06-2023 20_24_47](https://github.com/nitu8860/CarServiceStation/assets/112774001/1a0eb24c-4d3b-4f0d-b5f3-b5a28b9320dd)
