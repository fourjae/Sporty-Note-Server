package com.sportynote.server.repository.query;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
public class MachineDto {

    //내 기구 정보
    private Integer idx;
    private String machineName;
    private String targetArea;
    private String Url;

    @Data
    @AllArgsConstructor
    public static class RoutineMachineDto {
        //내 기구 정보 내 루틴 idx
        private Integer PrimaryKey;
        private Integer idx;
        private String machineName;
        private String targetArea;
        private String Url;
    }

}