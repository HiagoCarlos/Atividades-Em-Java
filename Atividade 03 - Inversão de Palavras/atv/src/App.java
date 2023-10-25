public class App {

    public static String inverterLetras(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder();
            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWord.append(word.charAt(i));
            }
            result.append(reversedWord).append(" ");
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        String input1 = "UM CIENTISTA DA COMPUTAÇAO DEVE RESOLVER OS PROBLEMAS LOGICAMENTE";
        String input2 = "ESARF ATERCES ODALERAHCAB ME AICNEIC AD OAÇATUPMOC FI ONAIOG SUPMAC SOHNIRROM HE MU SOD SEROHLEM SOSRUC ED OAÇATUPMOC OD ODATSE ED SAIOG";

        String result1 = inverterLetras(input1);
        String result2 = inverterLetras(input2);

        System.out.println("Resultado 1: " + result1);
        System.out.println("Resultado 2: " + result2);
    }
}
