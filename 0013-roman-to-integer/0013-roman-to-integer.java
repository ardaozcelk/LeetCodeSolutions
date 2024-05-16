import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        // Roma rakamlarının sembol ve değerlerini içeren bir HashMap oluşturulması
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        int total = 0;
        int prevValue = 0; // Önceki sembolün değerini takip etmek için
        
        // Roma rakamını soldan sağa tarama
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int value = map.get(c);
            
            // Önceki sembolün değeri, mevcut sembolün değerinden küçükse, özel durum var demektir
            if (prevValue < value) {
                // Özel durum için önceki sembolün değerini toplamdan çıkar
                total -= prevValue * 2; // Çünkü önceki sembol zaten toplamda bir kez eklenmişti
            }
            
            // Toplam değeri güncelle
            total += value;
            prevValue = value; // Önceki sembolün değerini güncelle
        }
        
        return total;
    }
}
