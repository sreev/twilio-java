/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.twiml;

import com.twilio.twiml.messaging.Message;
import com.twilio.twiml.messaging.Redirect;

/**
 * TwiML wrapper for {@code <Response>}
 */
public class MessagingResponse extends TwiML {
    /**
     * For XML Serialization/Deserialization
     */
    private MessagingResponse() {
        this(new Builder());
    }

    /**
     * Create a new {@code <MessagingResponse>} element
     */
    private MessagingResponse(Builder b) {
        super("Response", b);
    }

    /**
     * Create a new {@code <Response>} element
     */
    public static class Builder extends TwiML.Builder<Builder> {
        /**
         * Add a child {@code <Message>} element
         */
        public Builder message(Message message) {
            this.children.add(message);
            return this;
        }

        /**
         * Add a child {@code <Redirect>} element
         */
        public Builder redirect(Redirect redirect) {
            this.children.add(redirect);
            return this;
        }

        /**
         * Create and return resulting {@code <Response>} element
         */
        public MessagingResponse build() {
            return new MessagingResponse(this);
        }
    }
}