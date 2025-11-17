package singletonAndFactoryMethod;

public class PushNotificationWithBuilder {
    private  String recipient; // Required
    private  String message;   // Required
    private  String title;     // Optional
    private  String iconUrl;   // Optional
    private  Priority priority; // Optional
    private  long timestamp;   // Optional

    // Private constructor: Only the Builder can call this.
    private PushNotificationWithBuilder(Builder builder) {
        this.recipient = builder.recipient;
        this.message = builder.message;
        this.title = builder.title;
        this.iconUrl = builder.iconUrl;
        this.priority = builder.priority;
        this.timestamp = builder.timestamp;
    }

    // Getters for all fields (omitted for brevity)

    public static class Builder {
        // --- Required Parameters ---
        private final String recipient;
        private final String message;

        // --- Optional Parameters (with default values or null) ---
        private String title = "New Notification";
        private String iconUrl = null;
        private Priority priority = Priority.LOW;
        private long timestamp = System.currentTimeMillis();

        /** Constructor for required fields. **/
        public Builder(String recipient, String message) {
            if (recipient == null || message == null || message.isEmpty()) {
                throw new IllegalArgumentException("Recipient and Message are required.");
            }
            this.recipient = recipient;
            this.message = message;
        }

        /** Setters for optional fields (Chaining methods). **/
        public Builder withTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder withIconUrl(String iconUrl) {
            this.iconUrl = iconUrl;
            return this;
        }

        public Builder withPriority(Priority priority) {
            this.priority = priority;
            return this;
        }

        public Builder withTimestamp(long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        /** The final method to build the Notification. **/
        public PushNotificationWithBuilder build() {
            return new PushNotificationWithBuilder(this);
        }
    }

    public enum Priority {
        LOW, MEDIUM, HIGH
    }
}
