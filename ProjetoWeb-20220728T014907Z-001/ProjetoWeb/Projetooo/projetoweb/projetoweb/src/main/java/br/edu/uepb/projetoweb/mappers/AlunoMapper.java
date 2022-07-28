package br.edu.uepb.projetoweb.mappers;

import br.edu.uepb.projetoweb.domain.Aluno;
import br.edu.uepb.projetoweb.dto.AlunoDTO;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class AlunoMapper {

    @Autowired
    private ModelMapper modelMapper;
    
    public AlunoDTO convertToAlunoDTO(Aluno aluno) {
        AlunoDTO alunoDTO = modelMapper.map(aluno, AlunoDTO.class);
        return alunoDTO;
    }

    public Aluno convertFromAlunoDTO(AlunoDTO alunoDTO) {
        Aluno aluno = modelMapper.map(alunoDTO, Aluno.class);
        return aluno;
    }
}
