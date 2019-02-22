package com.telesens.academy.lesson03;

public class TrackExc {

    public static void main(String[] args) {
        String[] tracks={"track_01", "track_03", "track_21", "track_15", "track_12","track_99", "track_11", "track_10"};
        for (int i = 0; i < tracks.length; i++) {
            String LastTwoSymbols = extractLastTwoSymbols(tracks[i]);
            int number = Integer.parseInt(LastTwoSymbols);
            System.out.println(LastTwoSymbols);
            System.out.println(tracks[i]);
            if (number >= 10 && number <= 15)
                System.out.println(number);
            else
                System.out.println("wrong number");

        }

    }

    private static String extractLastTwoSymbols(String track) {
        return track.substring(track.length()-2);
    }
}
