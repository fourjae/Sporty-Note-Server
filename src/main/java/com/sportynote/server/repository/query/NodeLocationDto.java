package com.sportynote.server.repository.query;

import com.sportynote.server.type.NodeType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Data
public class NodeLocationDto {
    private Long machineId;

    private NodeType nodeType;

    private Float x_location;

    private Float y_location;
}
