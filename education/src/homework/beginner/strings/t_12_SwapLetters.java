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
              char[] lettersIntoWorld = parseWord[i].toCharArray();

        /*     for (int j = 0; j < lettersIntoWorld.length; j += 2) {

                  if( j + 1>= lettersIntoWorld.length){
                      break;
                  }

                  lettersIntoWorld[j] ^= lettersIntoWorld[j+1];
                  lettersIntoWorld[j+1] ^= lettersIntoWorld[j];
                  lettersIntoWorld[j] ^= lettersIntoWorld[j+1];

              }*/

          CharChangePositionSymbols.changePositionSymbols(lettersIntoWorld, 0, 1);

          result.append(lettersIntoWorld).append(" ");

          }
          System.out.println (result);
      }

  }
