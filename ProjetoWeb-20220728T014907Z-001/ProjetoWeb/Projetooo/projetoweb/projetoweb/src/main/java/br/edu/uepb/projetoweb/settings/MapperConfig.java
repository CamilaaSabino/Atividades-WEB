package br.edu.uepb.projetoweb.settings;



import br.edu.uepb.projetoweb.mappers.AlunoMapper;
import br.edu.uepb.projetoweb.mappers.ProfessorMapper;
import br.edu.uepb.projetoweb.mappers.TurmaMapper;
import br.edu.uepb.projetoweb.mappers.UserMapper;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {
    
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    @Bean
    public AlunoMapper alunoMapper() {
        return new AlunoMapper();
    }

    @Bean
    public ProfessorMapper professorMapper() {
        return new ProfessorMapper();
    }

    @Bean
    public TurmaMapper turmaMapper() {
        return new TurmaMapper();
    }

    @Bean
    public UserMapper userMapper() {
        return new UserMapper();
    }

}
