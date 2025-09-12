package core;

import java.util.Objects;

/**
 * User mô tả người dùng trong hệ thống.
 * Nguyên tắc Encapsulation: field private + getter/setter kiểm soát.
 */
public class User {
    private String id;        // bắt buộc
    private String fullName;  // bắt buộc
    private String email;     // tùy chọn

    public User(String id, String fullName) {
        if (id == null || id.isBlank()) throw new IllegalArgumentException("id is required");
        if (fullName == null || fullName.isBlank()) throw new IllegalArgumentException("fullName is required");
        this.id = id;
        this.fullName = fullName;
    }

    public User(String id, String fullName, String email) {
        this(id, fullName);
        this.email = email;
    }

    // Getter/Setter
    public String getId() { return id; }
    public void setId(String id) {
        if (id == null || id.isBlank()) throw new IllegalArgumentException("id is required");
        this.id = id;
    }

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) {
        if (fullName == null || fullName.isBlank()) throw new IllegalArgumentException("fullName is required");
        this.fullName = fullName;
    }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    // Utility
    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}