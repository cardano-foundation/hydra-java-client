package org.cardanofoundation.hydra.client.model.query.request;

import lombok.val;
import org.cardanofoundation.hydra.client.model.query.request.base.SubmitRequest;
import org.cardanofoundation.hydra.client.model.query.request.base.Tag;
import org.stringtemplate.v4.ST;

public class AbortHeadRequest extends SubmitRequest {

    public AbortHeadRequest() {
        super(Tag.Abort);
    }

    @Override
    public String getRequestBody() {
        val template = new ST("{ \"tag\": \"<tag>\" }");
        template.add("tag", tag);

        return template.render();
    }

}
