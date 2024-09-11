package local;

import java.util.ArrayList;
import java.util.List;

public class Business {
    private final int id;
    private final String name;
    private final String address;
    private final String contact;
    private final String category;
    private final String services;
    private final List<String> reviews; // New field for reviews

    public Business(int id, String name, String address, String contact, String category, String services) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.category = category;
        this.services = services;
        this.reviews = new ArrayList<>(); 
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getContact() {
        return contact;
    }

    public String getCategory() {
        return category;
    }

    public String getServices() {
        return services;
    }

    public List<String> getReviews() {
        return reviews;
    }

    // Method to add a review
    public void addReview(String review) {
        reviews.add(review);
    }
}
