package LuckyNumber;

public class LuckyNumber {
        private int number;
    
        public LuckyNumber(int number) {
            this.number = number;
        }
    
        public boolean isValid() {
            return Integer.toString(number).length() == 6;
        }
    
        public boolean isLucky() {
            if (!isValid()) {
                return false;
            }
    
            String numStr = Integer.toString(number);
            int firstHalfSum = 0;
            int secondHalfSum = 0;
    
            for (int i = 0; i < 3; i++) {
                firstHalfSum += Character.getNumericValue(numStr.charAt(i));
                secondHalfSum += Character.getNumericValue(numStr.charAt(i + 3));
            }
    
            return firstHalfSum == secondHalfSum;
        }
    }
    
    
