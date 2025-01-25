package krishna.cashcard;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController     // this tells Spring that this class is capable of handling HTTP requests
@RequestMapping("/cashcards/")       // this tells Spring that this class is responsible for handling requests that start with /cashcards
public class CashCardController {

    @GetMapping("/{requestedId}")        // this tells Spring that this method should be invoked when a GET request is made to /cashcards/{requestedId}
    private ResponseEntity<String> findById() {
        return ResponseEntity.ok("{}");
    }
}
