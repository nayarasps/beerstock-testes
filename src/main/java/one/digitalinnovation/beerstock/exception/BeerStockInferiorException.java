package one.digitalinnovation.beerstock.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BeerStockInferiorException extends Exception {

    public BeerStockInferiorException(Long id, int quantityToDecrement) {
        super(String.format("Beers with %s ID to decrement informed inferior the stock: %s", id, quantityToDecrement));
    }
}
