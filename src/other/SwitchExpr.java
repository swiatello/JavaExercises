package other;

import java.util.Scanner;


class SwitchSize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rozmiar S, M, L lub XL");
        String shortSize = scanner.nextLine();

/**       opcja 1 */
//        String size = switch (shortSize) {
//            case "S":
//                size = "mały";
//                break;
//            case "M":
//                size = "średni";
//                break;
//            case "L":
//                size = "duży";
//                break;
//            case "XL":
//                size = "bardzo duży";
//                break;
//            default:
//                size = "nieznany";
//        }

/**       opcja 2 */
//        String size = switch (shortSize) {
//            case "S":
//                yield "mały";
//            case "M":
//                yield "średni";
//            case "L":
//                yield "duży";
//            case "XL":
//                yield "bardzo duży";
//            default:
//                yield "nieznany";
//        };
//
        /**       opcja 3 */
        String size = switch (shortSize) {
            case "S" -> "mały";
            case "M" -> "średni";
            case "L" -> "duży";
            case "XL" -> "bardzo mały";
            default -> "nieznany";
        };

        System.out.println("Wybrano rozmiar " + size);
    }
}
