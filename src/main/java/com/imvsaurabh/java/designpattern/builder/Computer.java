package com.imvsaurabh.java.designpattern.builder;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Computer {
    private String cpu;
    private String motherboard;
    private String ram;
    private String hdd;
    private String ssd;
    private String powerSupply;
    private String coolingFan;
    private String graphicsCard;

    public Computer(String cpu, String motherboard, String ram, String hdd, String ssd, String powerSupply, String coolingFan, String graphicsCard) {
        this.cpu = cpu;
        this.motherboard = motherboard;
        this.ram = ram;
        this.hdd = hdd;
        this.ssd = ssd;
        this.powerSupply = powerSupply;
        this.coolingFan = coolingFan;
        this.graphicsCard = graphicsCard;
    }

    public Computer() {
    }

    public static ComputerBuilder builder() {
        return new ComputerBuilder();
    }

    public static class ComputerBuilder {
        private String cpu;
        private String motherboard;
        private String ram;
        private String hdd;
        private String ssd;
        private String powerSupply;
        private String coolingFan;
        private String graphicsCard;

        ComputerBuilder() {
        }

        public ComputerBuilder cpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public ComputerBuilder motherboard(String motherboard) {
            this.motherboard = motherboard;
            return this;
        }

        public ComputerBuilder ram(String ram) {
            this.ram = ram;
            return this;
        }

        public ComputerBuilder hdd(String hdd) {
            this.hdd = hdd;
            return this;
        }

        public ComputerBuilder ssd(String ssd) {
            this.ssd = ssd;
            return this;
        }

        public ComputerBuilder powerSupply(String powerSupply) {
            this.powerSupply = powerSupply;
            return this;
        }

        public ComputerBuilder coolingFan(String coolingFan) {
            this.coolingFan = coolingFan;
            return this;
        }

        public ComputerBuilder graphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Computer build() {
            return new Computer(this.cpu, this.motherboard, this.ram, this.hdd, this.ssd, this.powerSupply, this.coolingFan, this.graphicsCard);
        }
    }

    public String toString() {
        return "Computer(cpu=" + this.getCpu() + ", motherboard=" + this.getMotherboard() + ", ram=" + this.getRam() + ", hdd=" + this.getHdd() + ", ssd=" + this.getSsd() + ", powerSupply=" + this.getPowerSupply() + ", coolingFan=" + this.getCoolingFan() + ", graphicsCard=" + this.getGraphicsCard() + ")";
    }
}
