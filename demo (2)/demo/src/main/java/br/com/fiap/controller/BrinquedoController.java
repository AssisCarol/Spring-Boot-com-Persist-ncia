package br.com.fiap.controller;

import br.com.fiap.model.Brinquedo;
import br.com.fiap.service.BrinquedoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/brinquedos")
public class BrinquedoController {

    @Autowired
    private BrinquedoService brinquedoService;

    @PostMapping
    public Brinquedo createBrinquedo(@RequestBody Brinquedo brinquedo) {
        return brinquedoService.createBrinquedo(brinquedo);
    }

    @GetMapping
    public List<Brinquedo> getAllBrinquedos() {
        return brinquedoService.getAllBrinquedos();
    }

    @GetMapping("/{id}")
    public Optional<Brinquedo> getBrinquedoById(@PathVariable Long id) {
        return brinquedoService.getBrinquedoById(id);
    }
}
