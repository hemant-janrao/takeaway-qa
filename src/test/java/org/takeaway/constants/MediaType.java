package org.takeaway.constants;

public enum MediaType {
    MOVIE("movie"),
    TV("tv");

    final String type ;

    MediaType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }
}
