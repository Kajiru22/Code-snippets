package io.everyonecodes.week10_evaluation2.steam_purchases.Endpoints;

import io.everyonecodes.week10_evaluation2.steam_purchases.Data.Purchase;
import io.everyonecodes.week10_evaluation2.steam_purchases.Service.PurchaseService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PurchaseEndpoint {
    private final PurchaseService purchaseService;

    public PurchaseEndpoint(PurchaseService purchaseService) {
        this.purchaseService = purchaseService;
    }

    /*@PostMapping("/purchases")
    @PreAuthorize("hasRole('APP')")
    public Purchase addPurchase(@RequestBody PurchaseRequest purchaseRequest) {
        return purchaseService.processPurchase(purchaseRequest.getUsername(), purchaseRequest.getGameUniqueIdentifier());*/
}
