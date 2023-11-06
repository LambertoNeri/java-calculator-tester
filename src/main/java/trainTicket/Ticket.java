package trainTicket;

import trainTicket.exception.NegativeNumberException;

public class Ticket {
    //Esercizio 3: Calcolo biglietto del treno :vagone_treno:
    //Il programma dovrà chiedere all’utente il numero di chilometri che vuole percorrere e l’età del passeggero.
    //Sulla base di queste informazioni dovrà calcolare il prezzo totale del viaggio, secondo queste regole:
    // il prezzo del biglietto è definito in base ai km (0.21 € al km) va applicato uno sconto del 20% per i minorenni
    // va applicato uno sconto del 40% per gli over 65.

    // COSTANTI
    private final float KM_PRICE = .21F;
    private final float MINOR_DISCOUNT = .2F;
    private final float OLD_DISCOUNT = .4F;

    // VALORI
     private float km;
     private float age;

     private float ticketPrice;

    public Ticket(float km, float age) throws NegativeNumberException {
        if( km <= 0 || age <= 0) {
            throw new NegativeNumberException();
        }
        this.km = km;
        this.age = age;
        this.ticketPrice = km * KM_PRICE;
    }

    public float priceCalculator() {
        if(age >= 65) {
            float discountedPrice = ticketPrice - (ticketPrice * OLD_DISCOUNT);
            return discountedPrice;
        }else if (age < 18) {
            float discountedPrice = ticketPrice - (ticketPrice * MINOR_DISCOUNT);
            return discountedPrice;
        }
        return ticketPrice;
    }
}
