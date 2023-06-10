package kz.kopanitsa.task3._main;

import kz.kopanitsa.task3.model.BrownBear;
import kz.kopanitsa.task3.service.ForestService;

public class _Main {
    public static void main(String[] args) {
        BrownBear bear = new BrownBear();
        bear.setHealth(100);
        bear.setEnergy(100);
        ForestService myForestService = new ForestService();
        while (bear.checkBearLife()) {
            myForestService.startSimulation(bear);
        }
    }
}
