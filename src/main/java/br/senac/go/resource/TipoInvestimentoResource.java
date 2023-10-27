package br.senac.go.resource;

import br.senac.go.interfaces.IResource;
import br.senac.go.model.Conta;
import br.senac.go.model.TipoInvestimento;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("api/tipo_investimento")
@Tags({
        @Tag(name = "tipo_investimento", description = "documentação ao resource tipo_investimento"),
        // @Tag(name = "investimento", description = "documentação para conta de investimento")
})
public class TipoInvestimentoResource implements IResource <TipoInvestimento, Integer> {

    @Override
    @Operation(
            summary = "Criar um tipo de investimento",
            description = "Método responsável por criar um tipo de investimento no sistema",
            tags = { "tipo_investimento"}
    )
    @ApiResponses({
            @ApiResponse(responseCode = "201", content = { @Content(schema = @Schema(implementation = Conta.class), mediaType = MediaType.APPLICATION_JSON_VALUE)}),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "304", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) })
    })
    @PostMapping(
            consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE },
            produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }
    )
    public TipoInvestimento create(TipoInvestimento entity) {
        return null;
    }

    @Override
    @Operation(
            summary = "Recupera varios tipos de investimentos",
            description = "Método responsável para recuperar varios tipos de investimentos no sistema",
            tags = { "tipo_investimento" }
    )
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = Conta.class), mediaType = "application/json") }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema(implementation = Conta.class), mediaType = "application/json") }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) }
    )
    @GetMapping(
            consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE },
            produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }
    )
    public TipoInvestimento read(TipoInvestimento entity) throws Exception {
        return null;
    }

    @Override
    @Operation(
            summary = "Recupera um tipo de investimento",
            description = "Método responsável para recuperar um tipo de investimento no sistema",
            tags = { "tipo_investimento" }
    )
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = Conta.class), mediaType = "application/json") }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema(implementation = Conta.class), mediaType = "application/json") }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) }
    )
    @GetMapping(value = "/{id}",
            produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }
    )
    public TipoInvestimento readById(Integer id) throws Exception {
        return null;
    }

    @Override
    @Operation(
            summary = "Alterar o tipo de investimento",
            description = "Método responsável para alterar o tipo de investimento no sistema",
            tags = { "tipo_investimento" }
    )
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = Conta.class), mediaType = "application/json") }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema(implementation = Conta.class), mediaType = "application/json") }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) }
    )
    @PatchMapping(
            consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE },
            produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }
    )
    public TipoInvestimento update(TipoInvestimento entity) {
        return null;
    }

    @Override
    @Operation(
            summary = "Alterar uma parte do tipo de investimento",
            description = "Método responsável para alterar uma parte do tipo de investimento no sistema",
            tags = { "tipo_investimento" }
    )
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = Conta.class), mediaType = "application/json") }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema(implementation = Conta.class), mediaType = "application/json") }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) }
    )
    @PatchMapping(value ="/{id}",
            consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE },
            produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }
    )
    public TipoInvestimento updatePart(Integer id, TipoInvestimento entity) throws Exception {
        return null;
    }

    @Override
    @Operation(
            summary = "Alterar um tipo de investimento todo",
            description = "Método responsável para alterar o tipo de investimento por completo no sistema",
            tags = { "tipo_investimento" }
    )
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = Conta.class), mediaType = "application/json") }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema(implementation = Conta.class), mediaType = "application/json") }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) }
    )
    @PutMapping(value ="/{id}",
            consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE },
            produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }
    )
    public TipoInvestimento updateFull(Integer id, TipoInvestimento entity) {
        return null;
    }

    @Override
    @Operation(
            summary = "Deletar um tipo de investimento",
            description = "Método responsável por deletar um tipo de investimento no sistema",
            tags = { "tipo_investimento" }
    )
    @ApiResponses({
            @ApiResponse(responseCode = "204", content = { @Content(schema = @Schema(implementation = Conta.class), mediaType = "application/json") }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema(implementation = Conta.class), mediaType = "application/json") }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) }
    )
    @DeleteMapping("/{id}")
    public void delete(Integer id) {

    }

    @Override
    @Operation(
            summary = "Deletar um tipo de investimento",
            description = "Método responsável para Deletar um tipo de investimento no sistema",
            tags = { "tipo_investimento" }
    )
    @ApiResponses({
            @ApiResponse(responseCode = "204", content = { @Content(schema = @Schema(implementation = Conta.class), mediaType = "application/json") }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema(implementation = Conta.class), mediaType = "application/json") }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) }
    )
    @DeleteMapping(
            consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE },
            produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }
    )
    public void deleteByEntity(TipoInvestimento entity) {

    }
}
