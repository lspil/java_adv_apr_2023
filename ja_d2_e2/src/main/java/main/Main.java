package main;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {

  }

  public static long countTicketsPerDestination(List<Ticket> tickets, String destination) {
    return tickets.stream()
        .map(t -> t.getDestination())
        .filter(d -> d.equals(destination))
        .count();
  }

  public static void printTicketDetailsForClientEmail(List<Ticket> tickets, String email) {
    tickets.stream()
        .filter(t -> t.getClient().getEmail().equals(email))
        .forEach(t -> System.out.println(t));
  }

  public static boolean ticketExistsForClient(List<Ticket> tickets, String email) {
    return tickets.stream()
        .anyMatch(t -> t.getClient().getEmail().equals(email));
  }

  public static double calculateTicketsAverageValue(List<Ticket> tickets) {
//    return tickets.stream()
//        .mapToDouble(t -> t.getPrice())
//        .average().orElse(0);

    return tickets.stream()
        .collect(Collectors.averagingDouble(t -> t.getPrice()));
  }

  public static long countTicketsForClientOrigin(List<Ticket> tickets, String origin) {
    return tickets.stream()
        .filter(t -> t.getOrigin().equals(origin))
        .count();
  }

  public static long countClientsForTicketOrigin(List<Ticket> tickets, String origin) {
    return tickets.stream()
        .filter(t -> t.getOrigin().equals(origin))
        .map(t  -> t.getClient())
        .distinct()
        .count();
  }

  public static boolean checkAllClientsHaveEmailDefined(List<Ticket> tickets) {
    return tickets.stream()
        .allMatch(t -> t.getClient().getEmail() != null);
  }

}
