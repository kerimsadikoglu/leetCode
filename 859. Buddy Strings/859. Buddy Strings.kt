class Solution {
    fun buddyStrings(s: String, goal: String): Boolean {
        // Uzunluklar farklı ise hemen false döndür
        if (s.length != goal.length) return false
        
        // Eğer s ve goal aynı ise ve s içerisinde aynı karakter iki kez varsa, bu karakterleri swap yaparak sonucu elde edebiliriz
        if (s == goal) {
            val charCount = mutableMapOf<Char, Int>()
            for (char in s) {
                charCount[char] = charCount.getOrDefault(char, 0) + 1
            }
            for (count in charCount.values) {
                if (count >= 2) return true
            }
            return false
        }
        
        // Farklı karakterlerin indekslerini bul ve swap ederek goal elde edilebilir mi kontrol et
        val diffIndices = mutableListOf<Int>()
        for (i in s.indices) {
            if (s[i] != goal[i]) {
                diffIndices.add(i)
            }
        }
        return diffIndices.size == 2 && s[diffIndices[0]] == goal[diffIndices[1]] && s[diffIndices[1]] == goal[diffIndices[0]]
    }
}
