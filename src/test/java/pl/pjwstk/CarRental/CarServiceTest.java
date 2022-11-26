package pl.pjwstk.CarRental;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CarServiceTest {
    // co sie dzieje z wynajmem jak ktos wynajmuje
    // co sie dzieje jak samochód nie istnieje
    // end date wczesniej niz start date
    // end date == start date
    // wszystko działa poprawnie i się wynajął
    // jaka jest cena samochodu premium
    // jaka jest cena samochodu standard

    private CarStorage carstorage;
    private RentalStorage rentalstorage;
    CarService carService = new CarService(carstorage,  rentalstorage);

    @Test
    void carServiceTest(){
        //Given
        User user = new User("1");
        String vin = "12366";
        LocalDate startDate = LocalDate.of(2022, 12, 1);
        LocalDate endDate = LocalDate.of(2022, 12, 5);
        //When
        RentalInfo rentalInfo = carService.rentACar(user, vin, startDate, endDate);
        //Then
        assertThat(rentalInfo.getPrice()).isEqualTo(1000);
    }

}