package br.com.fiap.service;

import br.com.fiap.model.Brinquedo;
import br.com.fiap.repository.BrinquedoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BrinquedoService {

    @Autowired
    private BrinquedoRepository brinquedoRepository;

    public Brinquedo createBrinquedo(Brinquedo brinquedo) {
        return brinquedoRepository.save(brinquedo);
    }

    public List<Brinquedo> getAllBrinquedos() {
        return brinquedoRepository.findAll();
    }

    public Optional<Brinquedo> getBrinquedoById(Long id) {
        return brinquedoRepository.findById(id);
    }
}
