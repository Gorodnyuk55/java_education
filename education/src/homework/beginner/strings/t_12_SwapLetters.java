package homework.beginner.strings;

import homework.beginner.utils.CharChangePositionSymbols;

//Write a program swap symbols group of 2 in string
  public class t_12_SwapLetters {
      public static void main(String[] args) {
          String text = "Envy is the ulcer of the soul";
          System.out.println(text);
          String[] parseWord = text.split(" ");

          StringBuilder result = new StringBuilder();

          for (int i = 0; i < parseWord.length; i++) {
              /*if (parseWord[i].length() == 1) {
                  result.append(parseWord[i] + " ");
                  continue;
              }

              if (parseWord[i].length() == 2) {
                  result.append(new StringBuilder(parseWord[i]).reverse().toString() + " ");
                  continue;
              }*/

              char[] lettersIntoWorld = parseWord[i].toCharArray();

        /*     for (int j = 0; j < lettersIntoWorld.length; j += 2) {

                  if( j + 1>= lettersIntoWorld.length){
                      break;
                  }

                  lettersIntoWorld[j] ^= lettersIntoWorld[j+1];
                  lettersIntoWorld[j+1] ^= lettersIntoWorld[j];
                  lettersIntoWorld[j] ^= lettersIntoWorld[j+1];

              }*/

          CharChangePositionSymbols.changePositionSymbols(lettersIntoWorld, 1, 2);

          result.append(lettersIntoWorld).append(" ");

          }
          System.out.println (result);
      }

  }
