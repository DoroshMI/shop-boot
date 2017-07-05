package ua.dorosh.shop.entity.user;

/**
 * Created by n.dorosh on 01.07.2017.
 */
public enum Role {

    ADMIN("ADMIN"),
    USER("USER"),
    ANONYMOUS("ANONYMOUS");

    /**
     * State abbreviation
     */
    private String role;

    /**
     * Constructs a new state
     *
     * @param role - abbreviation
     */
    private Role(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return role;
    }
}
