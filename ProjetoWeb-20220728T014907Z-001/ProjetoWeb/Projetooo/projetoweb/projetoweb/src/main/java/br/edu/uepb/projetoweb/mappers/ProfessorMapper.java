package br.edu.uepb.projetoweb.mappers;

import br.edu.uepb.projetoweb.domain.Professor;
import br.edu.uepb.projetoweb.dto.ProfessorDTO;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class ProfessorMapper {

    @Autowired
    private ModelMapper modelMapper;
    
    public ProfessorDTO convertToProfessorDTO(Professor professor) {
        ProfessorDTO professorDTO = modelMapper.map(professor, ProfessorDTO.class);

        return professorDTO;
    }

    public Professor convertFromProfessorDTO(ProfessorDTO professorDTO) {
        Professor professor = modelMapper.map(professorDTO, Professor.class);
    
        return professor;
    }
}
