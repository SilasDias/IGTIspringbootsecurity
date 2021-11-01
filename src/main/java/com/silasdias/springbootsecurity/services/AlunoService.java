package com.silasdias.springbootsecurity.services;

import com.silasdias.springbootsecurity.dto.request.AlunoDTO;
import com.silasdias.springbootsecurity.entity.Aluno;
import com.silasdias.springbootsecurity.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    @Transactional
    public Page<AlunoDTO> findAll(Pageable pageable) {
        alunoRepository.findAll();
        Page<Aluno> result = alunoRepository.findAll(pageable);
        return result.map(x -> new AlunoDTO());
    }
}
