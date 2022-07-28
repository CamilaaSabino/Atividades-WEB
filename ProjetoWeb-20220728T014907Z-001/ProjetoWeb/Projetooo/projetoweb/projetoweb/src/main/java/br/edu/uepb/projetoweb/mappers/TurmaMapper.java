package br.edu.uepb.projetoweb.mappers;

import br.edu.uepb.projetoweb.domain.Turma;
import br.edu.uepb.projetoweb.dto.TurmaDTO;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class TurmaMapper {

    @Autowired
    private ModelMapper modelMapper;
    
    public TurmaDTO convertToTurmaDTO(Turma turma) {
        TurmaDTO turmaDTO = modelMapper.map(turma, TurmaDTO.class);
        return turmaDTO;
    }

    public Turma convertFromTurmaDTO(TurmaDTO turmaDTO) {
        Turma turma = modelMapper.map(turmaDTO, Turma.class);
        return turma;
    }
}
