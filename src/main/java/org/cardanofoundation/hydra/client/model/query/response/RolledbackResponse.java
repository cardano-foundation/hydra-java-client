package org.cardanofoundation.hydra.client.model.query.response;

import com.fasterxml.jackson.databind.JsonNode;
import lombok.val;
import org.cardanofoundation.hydra.client.model.Tag;
import org.cardanofoundation.hydra.client.util.MoreJson;

import java.time.LocalDateTime;

// The node has adopted a different chain fork and we had to rollback the application state.
public class RolledbackResponse extends Response {

    private final int seq;

    private final LocalDateTime timestamp;

    public RolledbackResponse(int seq, LocalDateTime timestamp) {
        super(Tag.RolledBack);
        this.seq = seq;
        this.timestamp = timestamp;
    }

    public static RolledbackResponse create(JsonNode raw) {
        val seq = raw.get("seq").asInt();
        val timestamp = MoreJson.convert(raw.get("timestamp"), LocalDateTime.class);

        return new RolledbackResponse(seq, timestamp);
    }

    public int getSeq() {
        return seq;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "Rolledback{" +
                "seq=" + seq +
                ", timestamp=" + timestamp +
                ", tag=" + tag +
                '}';
    }

}
