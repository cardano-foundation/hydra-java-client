package org.cardanofoundation.hydra.client.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ValidationError {

    String reason;

    @Override
    public String toString() {
        return "ValidationError{" +
                "reason='" + reason + '\'' +
                '}';
    }

}
