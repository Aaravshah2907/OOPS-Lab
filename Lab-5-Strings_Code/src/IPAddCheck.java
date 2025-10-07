import java.util.Scanner;

public class IPAddCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an IP address: ");
        String ipAddress = sc.nextLine();

        if (isValidIP(ipAddress)) {
            System.out.println("✅ Valid IP");
        } else {
            System.out.println("❌ Invalid IP");
        }
        sc.close();
    }

    /**
     * Checks if the given String is a valid IPv4 address.
     * @param ip The String to validate.
     * @return true if the IP is valid, false otherwise.
     */
    public static boolean isValidIP(String ip) {
        // 1. Split the string by dots. The dot is a special character in regex,
        // so we need to escape it with double backslashes "\\.".
        String[] parts = ip.split("\\.");

        // 2. An IP address must have exactly four parts.
        if (parts.length != 4) {
            return false;
        }

        // 3. Loop through each part and validate it.
        for (String part : parts) {
            try {
                // Try to convert the part into an integer.
                int num = Integer.parseInt(part);

                // 4. Check if the number is in the valid range (0-255).
                if (num < 0 || num > 255) {
                    return false;
                }

                // 5. Check for leading zeros (e.g., "01" is invalid).
                // An IP part can only start with '0' if it is just "0".
                if (part.length() > 1 && part.startsWith("0")) {
                    return false;
                }

            } catch (NumberFormatException e) {
                // 6. If Integer.parseInt fails, it means the part contains
                // non-numeric characters, so the IP is invalid.
                return false;
            }
        }

        // If all checks pass, the IP is valid.
        return true;
    }
}