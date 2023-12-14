public class Task2 {
    enum TrafficLightColor {
        RED, YELLOW, GREEN
    }

    static class TrafficLightsSimulator {
        private TrafficLightColor currentColor;
        public TrafficLightsSimulator() {
            this.currentColor = TrafficLightColor.GREEN;
        }

        public void changeColor() {
            switch (currentColor) {
                case GREEN:
                    currentColor = TrafficLightColor.YELLOW;
                    break;
                case YELLOW:
                    currentColor = TrafficLightColor.RED;
                    break;
                case RED:
                    currentColor = TrafficLightColor.GREEN;
                    break;
            }
        }

        public String toString() {
            return "Current Traffic Light Color: " + currentColor;
        }
    }
    public static void main(String[] args) {
        TrafficLightsSimulator simulator = new TrafficLightsSimulator();

        for (int i = 0; i < 3; i++) {
            System.out.println(simulator);
            simulator.changeColor();

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Eror");
            }
        }
    }
}
