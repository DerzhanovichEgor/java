package by.derzhanovich.learn;

import java.util.List;

public class ClientOffers {
    private Client client;
    private List<Tour> tour;

    public ClientOffers(Client client, List<Tour> tour) {
        this.client = client;
        this.tour = tour;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Tour> getTour() {
        return tour;
    }

    public void setTour(List<Tour> tour) {
        this.tour = tour;
    }

    @Override
    public String toString() {
        return "ClientOffers - " + client.getName() +
                ", tours: " + tour;
    }
}
