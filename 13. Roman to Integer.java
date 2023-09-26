class Solution {
  public int romanToInt(String s) {
    int sum = 0;
    int i = 0;
    for (i = 0; i < s.length() - 1; i++) {
      switch (s.charAt(i)) {
        case 'M':
          sum += 1000;
          break;
        case 'D':
          sum += 500;
          break;
        case 'C':
          switch (s.charAt(i + 1)) {
            case 'D':
              sum += 400;
              i++;
              break;
            case 'M':
              sum += 900;
              i++;
              break;

            default:
              sum += 100;
          }

          break;
        case 'L':
          sum += 50;
          break;
        case 'X':
          switch (s.charAt(i + 1)) {
            case 'L':
              sum += 40;
              i++;
              break;
            case 'C':
              sum += 90;
              i++;
              break;

            default:
              sum += 10;
          }
          break;
        case 'V':
          sum += 5;
          break;
        case 'I':
          switch (s.charAt(i + 1)) {
            case 'V':
              sum += 4;
              i++;
              break;
            case 'X':
              sum += 9;
              i++;
              break;

            default:
              sum += 1;
          }

          break;
      }
    }
    if (i >= s.length()) {
      return sum;
    }
    switch (s.charAt(i)) {
      case 'M':
        sum += 1000;
        break;
      case 'D':
        sum += 500;
        break;
      case 'C':
        sum += 100;

        break;
      case 'L':
        sum += 50;
        break;
      case 'X':
        sum += 10;

        break;
      case 'V':
        sum += 5;
        break;
      case 'I':

        sum += 1;

        break;
    }

    return sum;
  }
}

// class Solution {
//     public int romanToInt(String s) {
//         Map<Character, Integer> m = new HashMap<>();
        
//         m.put('I', 1);
//         m.put('V', 5);
//         m.put('X', 10);
//         m.put('L', 50);
//         m.put('C', 100);
//         m.put('D', 500);
//         m.put('M', 1000);
        
//         int ans = 0;
        
//         for (int i = 0; i < s.length(); i++) {
//             if (i < s.length() - 1 && m.get(s.charAt(i)) < m.get(s.charAt(i + 1))) {
//                 ans -= m.get(s.charAt(i));
//             } else {
//                 ans += m.get(s.charAt(i));
//             }
//         }
        
//         return ans;
//     }
// }
