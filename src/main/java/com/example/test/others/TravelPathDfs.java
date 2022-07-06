package com.example.test.others;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class TravelPathDfs {

    static class Ticket implements Comparable<Ticket> {
        String departure;
        String destination;
        Boolean isVisit;

        public Ticket(String dep, String dest) {
            this.departure = dep;
            this.destination = dest;
            this.isVisit = false;
        }

        @Override
        public int compareTo(Ticket o) {
            if (this.destination == null || o.destination == null) return 0;
            if (this.destination.charAt(0) > o.destination.charAt(0))
                return 1;
            else if (this.destination.charAt(0) < o.destination.charAt(0))
                return -1;
            return 0;
        }

        @Override
        public String toString() {
            return "Ticket{" +
                    "departure='" + departure + '\'' +
                    ", destination='" + destination + '\'' +
                    ", isVisit=" + isVisit +
                    '}';
        }
    }

    void dfs(Stack<Ticket> stack, Ticket ticket, List<Ticket> list) {
        stack.push(ticket);
        for (Ticket t : list) {
            if (t.isVisit == false && t.departure.equals(ticket.destination)) {
                t.isVisit = true;
                dfs(stack, t, list);
            }
        }
    }


    public String[] solution(String[][] tickets) {
        String[] answer = {};
        Stack<Ticket> res = new Stack<>();
        List<Ticket> ticket = new ArrayList<>();
        for (int i = 0; i < tickets.length; i++) {
            ticket.add(new Ticket(tickets[i][0], tickets[i][1]));
        }
        List<Ticket> sorted = ticket.stream().sorted().collect(Collectors.toList());
        Ticket start = sorted.stream().filter(obj -> obj.departure.equals("ICN")).findFirst().get();
        start.isVisit = true;
        dfs(res, start, sorted);
        List<String> out = new ArrayList<>();
        out.add("ICN");
        while (!res.isEmpty()) {
            Ticket t = res.remove(0);
            out.add(t.destination);
        }
        answer = out.toArray(new String[out.size()]);
        return answer;
    }
}
