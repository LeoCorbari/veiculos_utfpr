import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Veiculo> listaVeiculos = new ArrayList<>();

        System.out.println("Veiculos");

        for (int i = 0; i < 5; i++) {
            Veiculo veiculo = new Veiculo();

            System.out.println("Informe a placa: ");
            veiculo.setPlaca(scanner.nextLine());

            System.out.println("Informe a marca: ");
            veiculo.setMarca(scanner.nextLine());

            System.out.println("Informe o modelo: ");
            veiculo.setModelo(scanner.nextLine());

            System.out.println("Informe a cor: ");
            veiculo.setCor(scanner.nextLine());

            System.out.println("Informe a velocidade maxima: ");
            veiculo.setVelocMax(Float.parseFloat(scanner.nextLine()));

            System.out.println("Informe a quantidade de rodas: ");
            veiculo.setQtdRodas(Integer.parseInt(scanner.nextLine()));

            System.out.println("Informe a quantidade de pistoes: ");
            veiculo.getMotor().setQtdPist(Integer.parseInt(scanner.nextLine()));

            System.out.println("Informe a potencia: ");
            veiculo.getMotor().setQtdPist(Integer.parseInt(scanner.nextLine()));

            listaVeiculos.add(veiculo);

            System.out.println("----------------------------------------------");
        }

        scanner.close();

        for (Veiculo veiculo : listaVeiculos) {
            System.out.println("----------------------------------------------");
            System.out.println("Placa: " + veiculo.getPlaca());
            System.out.println("Marca: " + veiculo.getMarca());
            System.out.println("Modelo: " + veiculo.getModelo());
            System.out.println("Cor: " + veiculo.getCor());
            System.out.println("Velocidade maxima: " + veiculo.getVelocMax());
            System.out.println("Quantidade de rodas: " + veiculo.getQtdRodas());
            System.out.println("Potencia do quantidade de pistoes: " + veiculo.getMotor().getQtdPist());
            System.out.println("Potencia do motor: " + veiculo.getMotor().getPotencia());
        }
    }

}
