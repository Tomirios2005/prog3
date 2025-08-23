public class App {
    public static void main(String[] args) throws Exception {
        Jardin miJardin = new Jardin();
        miJardin.agregarPlanta("Rosa chinensis", "Rosa", "China", "2023-03-15");
        miJardin.agregarPlanta("Ficus lyrata", "Ficus", "África Occidental", "2024-04-10");
        miJardin.agregarPlanta("Monstera deliciosa", "Costilla de Adán", "México", "2022-08-22");
        miJardin.listarPlantas();

    }
}
