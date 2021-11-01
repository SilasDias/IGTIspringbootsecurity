package com.silasdias.springbootsecurity.controller;

import com.silasdias.springbootsecurity.dto.request.AlunoDTO;
import com.silasdias.springbootsecurity.services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @GetMapping
    public ResponseEntity<Page<AlunoDTO>> findAll(Pageable pageable) {
        Page<AlunoDTO> list = alunoService.findAll(pageable);
        return ResponseEntity.ok(list);
    }

}
