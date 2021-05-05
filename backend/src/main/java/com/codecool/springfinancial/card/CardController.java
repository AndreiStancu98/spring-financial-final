package com.codecool.springfinancial.card;

import com.codecool.springfinancial.account.AccountRepository;
import com.codecool.springfinancial.payload.request.CardRequest;
import com.codecool.springfinancial.payload.response.MessageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/test")
@RestController
public class CardController {

    private final CardService cardService;

    @Autowired
    CardRepository cardRepository;

    @Autowired
    AccountRepository accountRepository;


    public CardController(CardService cardService) {
        this.cardService = cardService;
    }

    @GetMapping("/card/accountNumber={accountNumber}")
    public List<Card> getCardsByAccountNumber(@PathVariable("accountNumber")String accountNumber){
        return cardService.getCardsByAccountNumber(accountNumber);
    }

    @PostMapping("/card/new-card")
    public ResponseEntity<?> createCard(@Valid @RequestBody CardRequest cardRequest) {
        if (cardRepository.existsByCardNumber(cardRequest.getCardNumber())) {
            return ResponseEntity.badRequest().body(new MessageResponse("Error card already exists"));
        }

        if (!accountRepository.existsByAccountNumber(cardRequest.getAccountNumber())) {
            return ResponseEntity.badRequest().body(new MessageResponse("Account does not exist !"));
        }

        Card card = new Card(cardRequest.getAccountNumber(), cardRequest.getCardNumber(), cardRequest.getAccountType(), cardRequest.getExpirationDate(), cardRequest.getCvv(), cardRequest.getCustomerFirstName(), cardRequest.getCustomerLastName(), cardRequest.isContactless());
        cardRepository.save(card);

        return ResponseEntity.ok(new MessageResponse("Card created successfully"));
    }
}
