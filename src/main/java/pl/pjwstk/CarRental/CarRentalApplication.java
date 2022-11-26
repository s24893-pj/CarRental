package pl.pjwstk.CarRental;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class CarRentalApplication {
    private final CarService carService;


    public CarRentalApplication(CarService carService) {
        this.carService = carService;

        User user = new User("1");
        RentalInfo rentalInfo = carService.rentACar(user, "12355", LocalDate.of(2022, 12, 01),
                LocalDate.of(2022, 12, 15));
        System.out.println(rentalInfo);
        //carService.rentACar(user, "12344",3 );
        //carService.rentACar(user, "1", 3);
        //carService.rentACar(user, "12344", 5);
        //carService.rentACar(user, "12366", 8);
    }


    public static void main(String[] args) {
        SpringApplication.run(CarRentalApplication.class, args);
    }


}
