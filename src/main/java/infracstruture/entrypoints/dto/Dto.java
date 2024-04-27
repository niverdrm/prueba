package infracstruture.entrypoints.dto;

import lombok.Builder;

@Builder
public class Dto {

    private int status;
    private Object data;
    private String  msg;

    public static Dto buildSuccess(String msg,Object data){
        return  Dto.builder()
                .data(data)
                .msg("Respuesta ok, ".concat(msg))
                .status(200)
                .build();

    }
    public static  Dto buildError(String msg,Object data){
        return  Dto.builder()
                .data(data)
                .msg("algo salio mal, ".concat(msg))
                .status(400)
                .build();

    }
}

