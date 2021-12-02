package com.fstg.bookerinventoryservice.application.ws;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.fstg.bookerinventoryservice.application.dto.CommandeDto;
import com.fstg.bookerinventoryservice.domain.commande.delete.CommandeDeleteInput;
import com.fstg.bookerinventoryservice.domain.commande.delete.CommandeDeleteProcess;
import com.fstg.bookerinventoryservice.domain.commande.paiement.CommandePaiementInput;
import com.fstg.bookerinventoryservice.domain.commande.paiement.CommandePaiementProcess;
import com.fstg.bookerinventoryservice.domain.core.Result;

@RestController
@RequestMapping("/api/v1/commande")
@Api("Cette classe permet de tester les process de la commande : delete et payer")
public class CommandeRest {

    @ApiOperation("paiement process : check commande & update totalPayer")
    @PutMapping("/")
    public Result payer(@RequestBody CommandeDto commandeDto) {
        CommandePaiementInput commandePaiementInput = CommandeDto.toCommandePaiementInput(commandeDto);
        return commandePaiementProcess.execute(commandePaiementInput);
    }
    @ApiOperation("delete process : check commande & check totalPayer confrome")
    @DeleteMapping("/")
    public Result delete(@RequestBody CommandeDto commandeDto) {
        CommandeDeleteInput commandeDeleteInput = CommandeDto.toCommandeDeleteInput(commandeDto);
        return commandeDeleteProcess.execute(commandeDeleteInput);
    }

    @Autowired
    private CommandePaiementProcess commandePaiementProcess;
    @Autowired
    private CommandeDeleteProcess commandeDeleteProcess;

}
