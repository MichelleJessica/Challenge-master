package com.challengeada.PontoEletronico.Controles;
import com.challengeada.PontoEletronico.Entidades.Registro;
import com.challengeada.PontoEletronico.Resposta.RegistrosFuncionario;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.text.ParseException;
import java.util.List;


@RestController
@RequestMapping

public class RegistroController {

    // Autentica o usuario

    @PostMapping(path = "/autentica")
    public <Login> void autenticar(@RequestHeader Login login) {

    }

    // Identifica o usuario

    @GetMapping(path = "/{identifica}")
    public List<RegistrosFuncionario> listarRegistrosFuncionario(@PathVariable("identificador") String identificar)    {
        return null;
    }

    // Registra o lançamento

    @PostMapping(path = "/{registra}")
    public ResponseEntity<Response<Registro>> adicionar(
            @Valid @RequestBody Registro registro, BindingResult result) throws ParseException {
        return null;
    }

    // Retorna a lista de lançamentos

    @GetMapping(path = "/{lista}")
    public ResponseEntity<Response<Page<Registro>>> listarPorFuncionarioId(
            @PathVariable("funcionarioId") Long funcionarioId,
            @RequestParam(value = "pag", defaultValue = "0") int pag,
            @RequestParam(value = "ord", defaultValue = "id") String ord,
            @RequestParam(value = "dir", defaultValue = "DESC") String dir) {
        return null;
    }

    // Retorna um lançamento específico

    @GetMapping(path = "/{retorna}")
    public ResponseEntity<Response<Registro>> listarPorId(@PathVariable("id") Long id) {
        return null;
    }

    // Atualiza um lançamento

    @PutMapping(path = "/{atualiza}")
    public ResponseEntity<Response<Registro>> atualizar
            (@PathVariable("id") Long id,
             @Valid @RequestBody Registro registro, BindingResult result) throws ParseException {
        return null;
    }

    // Deleta um lançamento

    @DeleteMapping(path = "/{deleta}")
    public ResponseEntity<Response<String>> remover(@PathVariable("id") Long id) {
        return null;
    }

}
