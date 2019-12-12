package com.kodilla.sudoku;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Categories;

public class SolverTestSuite {

    private void showCharArray(char[][] array) {
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print("" + i + " ");
        }
        System.out.println();
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    private void showPossibleArray(PossibleSudokuElement[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j].possibleElements.size() == 0) {
                    System.out.print(0);
                } else {
                    System.out.print(array[i][j]);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    @Test
    public void testSolve1() {
        //Given
        Solver solver = new Solver();
        char[][] mainBoard = new char[9][9];
        PossibleSudokuElement[][] hideBoard = new PossibleSudokuElement[9][9];
        for (int i = 0; i < hideBoard.length; i++) {
            for (int j = 0; j < hideBoard.length; j++) {
                hideBoard[i][j] = new PossibleSudokuElement();
            }
        }

        for (int i = 0; i < mainBoard.length; i++) {
            for (int j = 0; j < mainBoard.length; j++) {
                mainBoard[i][j] = ' ';
            }
    }

        mainBoard[0][0] = '5';
        mainBoard[0][1] = '3';
        mainBoard[0][4] = '7';
        mainBoard[1][0] = '6';
        mainBoard[1][3] = '1';
        mainBoard[1][4] = '9';
        mainBoard[1][5] = '5';
        mainBoard[2][1] = '9';
        mainBoard[2][2] = '8';
        mainBoard[2][7] = '6';
        mainBoard[3][0] = '8';
        mainBoard[3][4] = '6';
        mainBoard[3][8] = '3';
        mainBoard[4][0] = '4';
        mainBoard[4][3] = '8';
        mainBoard[4][5] = '3';
        mainBoard[4][8] = '1';
        mainBoard[5][0] = '7';
        mainBoard[5][4] = '2';
        mainBoard[5][8] = '6';
        mainBoard[6][1] = '6';
        mainBoard[6][6] = '2';
        mainBoard[6][7] = '8';
        mainBoard[7][3] = '4';
        mainBoard[7][4] = '1';
        mainBoard[7][5] = '9';
        mainBoard[7][8] = '5';
        mainBoard[8][4] = '8';
        mainBoard[8][7] = '7';
        mainBoard[8][8] = '9';

        //When
        solver.solverWGuess(mainBoard, hideBoard);

        showPossibleArray(hideBoard);
        showCharArray(mainBoard);

    }


    @Test
    public void testSolve2() {
        //Given
        Solver solver = new Solver();
        char[][] mainBoard = new char[9][9];
        PossibleSudokuElement[][] hideBoard = new PossibleSudokuElement[9][9];
        for (int i = 0; i < hideBoard.length; i++) {
            for (int j = 0; j < hideBoard.length; j++) {
                hideBoard[i][j] = new PossibleSudokuElement();
            }
        }

        for (int i = 0; i < mainBoard.length; i++) {
            for (int j = 0; j < mainBoard.length; j++) {
                mainBoard[i][j] = ' ';
            }
        }

        mainBoard[0][1] = '4';
        mainBoard[0][3] = '2';
        mainBoard[0][5] = '1';
        mainBoard[0][7] = '6';
        mainBoard[2][0] = '9';
        mainBoard[2][2] = '5';
        mainBoard[2][6] = '3';
        mainBoard[2][8] = '7';
        mainBoard[4][0] = '5';
        mainBoard[4][2] = '7';
        mainBoard[4][4] = '8';
        mainBoard[4][6] = '1';
        mainBoard[4][8] = '4';
        mainBoard[5][1] = '1';
        mainBoard[5][7] = '9';
        mainBoard[6][2] = '1';
        mainBoard[6][6] = '6';
        mainBoard[7][3] = '7';
        mainBoard[7][5] = '5';
        mainBoard[8][0] = '6';
        mainBoard[8][2] = '8';
        mainBoard[8][3] = '9';
        mainBoard[8][5] = '4';
        mainBoard[8][6] = '5';
        mainBoard[8][8] = '3';
        //When

        showCharArray(mainBoard);

        solver.solverWGuess(mainBoard, hideBoard);

        showPossibleArray(hideBoard);
        showCharArray(mainBoard);

    }

    @Test
    public void testSolve3() {
        //Given
        Solver solver = new Solver();
        char[][] mainBoard = new char[9][9];
        PossibleSudokuElement[][] hideBoard = new PossibleSudokuElement[9][9];
        for (int i = 0; i < hideBoard.length; i++) {
            for (int j = 0; j < hideBoard.length; j++) {
                hideBoard[i][j] = new PossibleSudokuElement();
            }
        }

        for (int i = 0; i < mainBoard.length; i++) {
            for (int j = 0; j < mainBoard.length; j++) {
                mainBoard[i][j] = ' ';
            }
        }

        mainBoard[0][7] = '1';
        mainBoard[1][5] = '2';
        mainBoard[1][8] = '3';
        mainBoard[2][3] = '4';
        mainBoard[3][6] = '5';
        mainBoard[4][0] = '6';
        mainBoard[4][2] = '1';
        mainBoard[4][3] = '7';
        mainBoard[5][2] = '4';
        mainBoard[5][3] = '1';
        mainBoard[6][1] = '5';
        mainBoard[6][6] = '2';
        mainBoard[7][4] = '8';
        mainBoard[7][7] = '6';
        mainBoard[8][1] = '3';
        mainBoard[8][3] = '9';
        mainBoard[8][4] = '1';

        //When
        solver.solverWGuess(mainBoard, hideBoard);

        showPossibleArray(hideBoard);
        showCharArray(mainBoard);

    }

    @Test
    public void testSolve4() {
        //Given
        Solver solver = new Solver();
        char[][] mainBoard = new char[9][9];
        PossibleSudokuElement[][] hideBoard = new PossibleSudokuElement[9][9];
        for (int i = 0; i < hideBoard.length; i++) {
            for (int j = 0; j < hideBoard.length; j++) {
                hideBoard[i][j] = new PossibleSudokuElement();
            }
        }

        for (int i = 0; i < mainBoard.length; i++) {
            for (int j = 0; j < mainBoard.length; j++) {
                mainBoard[i][j] = ' ';
            }
        }

        mainBoard[0][3] = '8';
        mainBoard[0][5] = '6';
        mainBoard[1][4] = '2';
        mainBoard[1][5] = '3';
        mainBoard[2][4] = '1';
        mainBoard[2][7] = '2';
        mainBoard[2][8] = '7';
        mainBoard[3][0] = '3';
        mainBoard[3][1] = '2';
        mainBoard[3][7] = '1';
        mainBoard[4][1] = '7';
        mainBoard[4][2] = '1';
        mainBoard[4][6] = '8';
        mainBoard[4][7] = '5';
        mainBoard[5][1] = '4';
        mainBoard[5][5] = '2';
        mainBoard[5][6] = '6';
        mainBoard[6][2] = '4';
        mainBoard[6][5] = '5';
        mainBoard[6][8] = '8';
        mainBoard[7][4] = '3';
        mainBoard[8][7] = '7';
        mainBoard[8][8] = '5';
        //When

        showCharArray(mainBoard);

        char[][] returnBoard = solver.solverWGuess(mainBoard, hideBoard);

        showCharArray(returnBoard);

    }

    @Test
    public void testSolve5() {
        //Given
        Solver solver = new Solver();
        char[][] mainBoard = new char[9][9];
        PossibleSudokuElement[][] hideBoard = new PossibleSudokuElement[9][9];
        for (int i = 0; i < hideBoard.length; i++) {
            for (int j = 0; j < hideBoard.length; j++) {
                hideBoard[i][j] = new PossibleSudokuElement();
            }
        }

        for (int i = 0; i < mainBoard.length; i++) {
            for (int j = 0; j < mainBoard.length; j++) {
                mainBoard[i][j] = ' ';
            }
        }

        mainBoard[0][3] = '7';
        mainBoard[0][4] = '6';
        mainBoard[1][0] = '4';
        mainBoard[1][6] = '5';
        mainBoard[2][4] = '3';
        mainBoard[2][5] = '2';
        mainBoard[2][7] = '6';
        mainBoard[2][8] = '7';
        mainBoard[3][3] = '5';
        mainBoard[3][6] = '1';
        mainBoard[4][0] = '3';
        mainBoard[4][4] = '2';
        mainBoard[4][7] = '5';
        mainBoard[5][1] = '4';
        mainBoard[5][4] = '8';
        mainBoard[5][8] = '6';
        mainBoard[6][5] = '4';
        mainBoard[7][5] = '8';
        mainBoard[7][6] = '7';
        mainBoard[7][7] = '3';
        mainBoard[8][2] = '2';
        mainBoard[8][4] = '5';
        mainBoard[8][8] = '8';
        //When

        showCharArray(mainBoard);


        char[][] returnBoard = solver.solverWGuess(mainBoard, hideBoard);

        showCharArray(returnBoard);

    }


    @Test
    public void testSolve6() {
        //Given
        Solver solver = new Solver();
        char[][] mainBoard = new char[9][9];
        PossibleSudokuElement[][] hideBoard = new PossibleSudokuElement[9][9];
        for (int i = 0; i < hideBoard.length; i++) {
            for (int j = 0; j < hideBoard.length; j++) {
                hideBoard[i][j] = new PossibleSudokuElement();
            }
        }

        for (int i = 0; i < mainBoard.length; i++) {
            for (int j = 0; j < mainBoard.length; j++) {
                mainBoard[i][j] = ' ';
            }
        }

        mainBoard[0][2] = '5';
        mainBoard[0][3] = '9';
        mainBoard[0][5] = '3';
        mainBoard[0][6] = '7';
        mainBoard[1][5] = '7';
        mainBoard[1][7] = '9';
        mainBoard[1][8] = '8';
        mainBoard[2][2] = '8';
        mainBoard[2][5] = '4';
        mainBoard[2][6] = '1';
        mainBoard[2][8] = '5';
        mainBoard[3][2] = '4';
        mainBoard[3][3] = '8';
        mainBoard[3][8] = '3';
        mainBoard[4][0] = '8';
        mainBoard[4][4] = '6';
        mainBoard[5][1] = '7';
        mainBoard[5][2] = '1';
        mainBoard[6][0] = '4';
        mainBoard[7][6] = '6';
        mainBoard[7][7] = '5';
        mainBoard[8][2] = '7';
        mainBoard[8][3] = '5';
        mainBoard[8][7] = '1';
        mainBoard[8][8] = '4';
        //When

        showCharArray(mainBoard);


        char[][] returnBoard = solver.solverWGuess(mainBoard, hideBoard);
        showPossibleArray(hideBoard);
        showCharArray(returnBoard);

    }

    @Test
    public void testSolve7() {
        //Given
        Solver solver = new Solver();
        char[][] mainBoard = new char[9][9];
        PossibleSudokuElement[][] hideBoard = new PossibleSudokuElement[9][9];
        for (int i = 0; i < hideBoard.length; i++) {
            for (int j = 0; j < hideBoard.length; j++) {
                hideBoard[i][j] = new PossibleSudokuElement();
            }
        }

        for (int i = 0; i < mainBoard.length; i++) {
            for (int j = 0; j < mainBoard.length; j++) {
                mainBoard[i][j] = ' ';
            }
        }

        //When

        showCharArray(mainBoard);


        char[][] returnBoard = solver.solverWGuess(mainBoard, hideBoard);
        showPossibleArray(hideBoard);
        showCharArray(returnBoard);

    }

    @Test
    public void testSolve8() {
        //Given
        Solver solver = new Solver();
        char[][] mainBoard = new char[9][9];
        PossibleSudokuElement[][] hideBoard = new PossibleSudokuElement[9][9];
        for (int i = 0; i < hideBoard.length; i++) {
            for (int j = 0; j < hideBoard.length; j++) {
                hideBoard[i][j] = new PossibleSudokuElement();
            }
        }

        for (int i = 0; i < mainBoard.length; i++) {
            for (int j = 0; j < mainBoard.length; j++) {
                mainBoard[i][j] = ' ';
            }
        }

        mainBoard[0][2] = '5';
        mainBoard[0][3] = '5';
        mainBoard[0][5] = '5';
        mainBoard[0][6] = '5';
        mainBoard[1][5] = '5';
        mainBoard[1][7] = '5';
        mainBoard[1][8] = '8';
        mainBoard[2][2] = '8';
        mainBoard[2][5] = '4';
        mainBoard[2][6] = '1';
        mainBoard[2][8] = '5';
        mainBoard[3][2] = '4';
        mainBoard[3][3] = '8';
        mainBoard[3][8] = '3';
        mainBoard[4][0] = '8';
        mainBoard[4][4] = '6';
        mainBoard[5][1] = '7';
        mainBoard[5][2] = '1';
        mainBoard[6][0] = '4';
        mainBoard[7][6] = '6';
        mainBoard[7][7] = '5';
        mainBoard[8][2] = '7';
        mainBoard[8][3] = '5';
        mainBoard[8][7] = '1';
        mainBoard[8][8] = '4';
        //When
        showCharArray(mainBoard);


        char[][] returnBoard = solver.solverWGuess(mainBoard, hideBoard);
        showPossibleArray(hideBoard);
        showCharArray(returnBoard);

    }

    @Test
    public void testSolve9() {
        //Given
        Solver solver = new Solver();
        char[][] mainBoard = new char[9][9];
        PossibleSudokuElement[][] hideBoard = new PossibleSudokuElement[9][9];
        for (int i = 0; i < hideBoard.length; i++) {
            for (int j = 0; j < hideBoard.length; j++) {
                hideBoard[i][j] = new PossibleSudokuElement();
            }
        }

        for (int i = 0; i < mainBoard.length; i++) {
            for (int j = 0; j < mainBoard.length; j++) {
                mainBoard[i][j] = ' ';
            }
        }

        mainBoard[3][3] = '6';
        mainBoard[3][4] = '7';
        //When
        showCharArray(mainBoard);


        char[][] returnBoard = solver.solverWGuess(mainBoard, hideBoard);
        showPossibleArray(hideBoard);
        showCharArray(returnBoard);

    }


    @Test
    public void testCanSolve() {
        //Given
        Solver solver = new Solver();
        char[][] mainBoard = new char[9][9];

        for (int i = 0; i < mainBoard.length; i++) {
            for (int j = 0; j < mainBoard.length; j++) {
                mainBoard[i][j] = ' ';
            }
        }

        mainBoard[0][2] = '5';
        mainBoard[0][3] = '2';
        mainBoard[1][7] = '5';
        mainBoard[4][4] = '5';
        //When

        showCharArray(mainBoard);

        Assert.assertEquals(true, solver.canSolve(mainBoard));
    }

    @Test
    public void testDeletePossibleElementFromRow1() {
        //Given
        Solver solver = new Solver();
        char[][] mainBoard = new char[9][9];
        PossibleSudokuElement[][] hideBoard = new PossibleSudokuElement[9][9];
        for (int i = 0; i < hideBoard.length; i++) {
            for (int j = 0; j < hideBoard.length; j++) {
                hideBoard[i][j] = new PossibleSudokuElement();
            }
        }

        mainBoard[0][5] = '7';

        showCharArray(mainBoard);
        showPossibleArray(hideBoard);

        //When
        Vector indicateVector = new Vector(0, 0);
        solver.deletePossibleElementFromRow(mainBoard, hideBoard, indicateVector);

        System.out.println();
        showPossibleArray(hideBoard);
    }

    @Test
    public void testDeletePossibleElementFromRow2() {
        //Given
        Solver solver = new Solver();
        char[][] mainBoard = new char[9][9];
        PossibleSudokuElement[][] hideBoard = new PossibleSudokuElement[9][9];
        for (int i = 0; i < hideBoard.length; i++) {
            for (int j = 0; j < hideBoard.length; j++) {
                hideBoard[i][j] = new PossibleSudokuElement();
            }
        }

        mainBoard[5][5] = '4';

        showCharArray(mainBoard);
        showPossibleArray(hideBoard);

        //When
        Vector indicateVector = new Vector(0, 5);
        solver.deletePossibleElementFromRow(mainBoard, hideBoard, indicateVector);

        System.out.println();
        showPossibleArray(hideBoard);
    }

    @Test
    public void testDeletePossibleElementFromRow3() {
        //Given
        Solver solver = new Solver();
        char[][] mainBoard = new char[9][9];
        PossibleSudokuElement[][] hideBoard = new PossibleSudokuElement[9][9];
        for (int i = 0; i < hideBoard.length; i++) {
            for (int j = 0; j < hideBoard.length; j++) {
                hideBoard[i][j] = new PossibleSudokuElement();
            }
        }

        mainBoard[4][8] = '1';

        showCharArray(mainBoard);
        showPossibleArray(hideBoard);

        //When
        Vector indicateVector = new Vector(7, 4);
        solver.deletePossibleElementFromRow(mainBoard, hideBoard, indicateVector);

        System.out.println();
        showPossibleArray(hideBoard);
    }

    @Test
    public void testDeletePossibleElementFromRow4() {
        //Given
        Solver solver = new Solver();
        char[][] mainBoard = new char[9][9];
        PossibleSudokuElement[][] hideBoard = new PossibleSudokuElement[9][9];
        for (int i = 0; i < hideBoard.length; i++) {
            for (int j = 0; j < hideBoard.length; j++) {
                hideBoard[i][j] = new PossibleSudokuElement();
            }
        }

        mainBoard[8][8] = '1';

        showCharArray(mainBoard);
        showPossibleArray(hideBoard);

        //When
        Vector indicateVector = new Vector(0, 8);
        solver.deletePossibleElementFromRow(mainBoard, hideBoard, indicateVector);

        System.out.println();
        showPossibleArray(hideBoard);
    }

    @Test
    public void testDeletePossibleElementFromRow5() {
        //Given
        Solver solver = new Solver();
        char[][] mainBoard = new char[9][9];
        PossibleSudokuElement[][] hideBoard = new PossibleSudokuElement[9][9];
        for (int i = 0; i < hideBoard.length; i++) {
            for (int j = 0; j < hideBoard.length; j++) {
                hideBoard[i][j] = new PossibleSudokuElement();
            }
        }

        mainBoard[8][0] = '1';

        showCharArray(mainBoard);
        showPossibleArray(hideBoard);

        //When
        Vector indicateVector = new Vector(8, 8);
        solver.deletePossibleElementFromRow(mainBoard, hideBoard, indicateVector);

        System.out.println();
        showPossibleArray(hideBoard);
    }

    @Test
    public void testDeletePossibleElementFromColumn1() {
        //Given
        Solver solver = new Solver();
        char[][] mainBoard = new char[9][9];
        PossibleSudokuElement[][] hideBoard = new PossibleSudokuElement[9][9];
        for (int i = 0; i < hideBoard.length; i++) {
            for (int j = 0; j < hideBoard.length; j++) {
                hideBoard[i][j] = new PossibleSudokuElement();
            }
        }

        mainBoard[0][0] = '1';

        showCharArray(mainBoard);
        showPossibleArray(hideBoard);

        //When
        Vector indicateVector = new Vector(0, 1);
        solver.deletePossibleElementFromColumn(mainBoard, hideBoard, indicateVector);

        System.out.println();
        showPossibleArray(hideBoard);
    }

    @Test
    public void testDeletePossibleElementFromColumn2() {
        //Given
        Solver solver = new Solver();
        char[][] mainBoard = new char[9][9];
        PossibleSudokuElement[][] hideBoard = new PossibleSudokuElement[9][9];
        for (int i = 0; i < hideBoard.length; i++) {
            for (int j = 0; j < hideBoard.length; j++) {
                hideBoard[i][j] = new PossibleSudokuElement();
            }
        }

        mainBoard[4][4] = '1';

        showCharArray(mainBoard);
        showPossibleArray(hideBoard);

        //When
        Vector indicateVector = new Vector(4, 5);
        solver.deletePossibleElementFromColumn(mainBoard, hideBoard, indicateVector);

        System.out.println();
        showPossibleArray(hideBoard);
    }

    @Test
    public void testDeletePossibleElementFromColumn3() {
        //Given
        Solver solver = new Solver();
        char[][] mainBoard = new char[9][9];
        PossibleSudokuElement[][] hideBoard = new PossibleSudokuElement[9][9];
        for (int i = 0; i < hideBoard.length; i++) {
            for (int j = 0; j < hideBoard.length; j++) {
                hideBoard[i][j] = new PossibleSudokuElement();
            }
        }

        mainBoard[8][8] = '1';

        showCharArray(mainBoard);
        showPossibleArray(hideBoard);

        //When
        Vector indicateVector = new Vector(8, 7);
        solver.deletePossibleElementFromColumn(mainBoard, hideBoard, indicateVector);

        System.out.println();
        showPossibleArray(hideBoard);
    }


    @Test
    public void testDeletePossibleElementFromWindow1() {
        //Given
        Solver solver = new Solver();
        char[][] mainBoard = new char[9][9];
        PossibleSudokuElement[][] hideBoard = new PossibleSudokuElement[9][9];
        for (int i = 0; i < hideBoard.length; i++) {
            for (int j = 0; j < hideBoard.length; j++) {
                hideBoard[i][j] = new PossibleSudokuElement();
            }
        }

        mainBoard[8][8] = '1';

        showCharArray(mainBoard);
        showPossibleArray(hideBoard);

        //When
        Vector indicateVector = new Vector(7, 8);
        solver.deletePossibleElementFromWindow(mainBoard, hideBoard, indicateVector);

        System.out.println();
        showPossibleArray(hideBoard);
    }

    @Test
    public void testDeletePossibleElementFromWindow2() {
        //Given
        Solver solver = new Solver();
        char[][] mainBoard = new char[9][9];
        PossibleSudokuElement[][] hideBoard = new PossibleSudokuElement[9][9];
        for (int i = 0; i < hideBoard.length; i++) {
            for (int j = 0; j < hideBoard.length; j++) {
                hideBoard[i][j] = new PossibleSudokuElement();
            }
        }

        mainBoard[4][4] = '1';

        showCharArray(mainBoard);
        showPossibleArray(hideBoard);

        //When
        Vector indicateVector = new Vector(3, 3);
        solver.deletePossibleElementFromWindow(mainBoard, hideBoard, indicateVector);

        System.out.println();
        showPossibleArray(hideBoard);
    }

    @Test
    public void testDeletePossibleElementFromWindow3() {
        //Given
        Solver solver = new Solver();
        char[][] mainBoard = new char[9][9];
        PossibleSudokuElement[][] hideBoard = new PossibleSudokuElement[9][9];
        for (int i = 0; i < hideBoard.length; i++) {
            for (int j = 0; j < hideBoard.length; j++) {
                hideBoard[i][j] = new PossibleSudokuElement();
            }
        }

        mainBoard[0][0] = '1';

        showCharArray(mainBoard);
        showPossibleArray(hideBoard);

        //When
        Vector indicateVector = new Vector(1, 0);
        solver.deletePossibleElementFromWindow(mainBoard, hideBoard, indicateVector);

        System.out.println();
        showPossibleArray(hideBoard);
    }

    @Test
    public void testDeletePossibleElementFromWindow4() {
        //Given
        Solver solver = new Solver();
        char[][] mainBoard = new char[9][9];
        PossibleSudokuElement[][] hideBoard = new PossibleSudokuElement[9][9];
        for (int i = 0; i < hideBoard.length; i++) {
            for (int j = 0; j < hideBoard.length; j++) {
                hideBoard[i][j] = new PossibleSudokuElement();
            }
        }

        mainBoard[0][1] = '1';

        showCharArray(mainBoard);
        showPossibleArray(hideBoard);

        //When
        Vector indicateVector = new Vector(0, 0);
        solver.deletePossibleElementFromWindow(mainBoard, hideBoard, indicateVector);

        System.out.println();
        showPossibleArray(hideBoard);
    }

    @Test
    public void testDeletePossibleElementFromWindow5() {
        //Given
        Solver solver = new Solver();
        char[][] mainBoard = new char[9][9];
        PossibleSudokuElement[][] hideBoard = new PossibleSudokuElement[9][9];
        for (int i = 0; i < hideBoard.length; i++) {
            for (int j = 0; j < hideBoard.length; j++) {
                hideBoard[i][j] = new PossibleSudokuElement();
            }
        }

        mainBoard[1][3] = '1';

        showCharArray(mainBoard);
        showPossibleArray(hideBoard);

        //When
        Vector indicateVector = new Vector(4, 1);
        solver.deletePossibleElementFromWindow(mainBoard, hideBoard, indicateVector);

        System.out.println();
        showPossibleArray(hideBoard);
    }

    @Test
    public void testMidWindowWhereVector1() {
        //Given
        Solver solver = new Solver();
        Vector givenVector = new Vector(2, 2);

        //When
        Vector exceptVector = new Vector(1, 1);
        Vector returnVector = solver.midWindowWhereVector(givenVector);

        //Then
        Assert.assertEquals(exceptVector.x, returnVector.x);
        Assert.assertEquals(exceptVector.y, returnVector.y);

    }

    @Test
    public void testMidWindowWhereVector2() {
        //Given
        Solver solver = new Solver();
        Vector givenVector = new Vector(8, 8);

        //When
        Vector exceptVector = new Vector(7, 7);
        Vector returnVector = solver.midWindowWhereVector(givenVector);

        //Then
        Assert.assertEquals(exceptVector.x, returnVector.x);
        Assert.assertEquals(exceptVector.y, returnVector.y);

    }

    @Test
    public void testMidWindowWhereVector3() {
        //Given
        Solver solver = new Solver();
        Vector givenVector = new Vector(0, 0);

        //When
        Vector exceptVector = new Vector(1, 1);
        Vector returnVector = solver.midWindowWhereVector(givenVector);

        //Then
        Assert.assertEquals(exceptVector.x, returnVector.x);
        Assert.assertEquals(exceptVector.y, returnVector.y);

    }

    @Test
    public void testMidWindowWhereVector4() {
        //Given
        Solver solver = new Solver();
        Vector givenVector = new Vector(4, 8);

        //When
        Vector exceptVector = new Vector(4, 7);
        Vector returnVector = solver.midWindowWhereVector(givenVector);

        //Then
        Assert.assertEquals(exceptVector.x, returnVector.x);
        Assert.assertEquals(exceptVector.y, returnVector.y);

    }

    @Test
    public void testEnterIfNotPresentAsPossible() {
        //Given
        Solver solver = new Solver();
        char[][] mainBoard = new char[9][9];
        PossibleSudokuElement[][] hideBoard = new PossibleSudokuElement[9][9];
        for (int i = 0; i < hideBoard.length; i++) {
            for (int j = 0; j < hideBoard.length; j++) {
                hideBoard[i][j] = new PossibleSudokuElement();
            }
        }

        for (int i = 0; i < mainBoard.length; i++) {
            for (int j = 0; j < mainBoard.length; j++) {
                mainBoard[i][j] = ' ';
            }
        }

        PossibleSudokuElement possibleSudokuElement = new PossibleSudokuElement();
        possibleSudokuElement.possibleElements.clear();
        hideBoard[0][0] = possibleSudokuElement;
        hideBoard[0][1] = possibleSudokuElement;
        hideBoard[0][2] = possibleSudokuElement;
        hideBoard[0][3] = possibleSudokuElement;
        hideBoard[0][4] = possibleSudokuElement;
        hideBoard[0][5] = possibleSudokuElement;
        hideBoard[0][6] = possibleSudokuElement;
        hideBoard[0][7] = possibleSudokuElement;

        hideBoard[1][8] = possibleSudokuElement;
        hideBoard[2][8] = possibleSudokuElement;
        hideBoard[3][8] = possibleSudokuElement;
        hideBoard[4][8] = possibleSudokuElement;
        hideBoard[5][8] = possibleSudokuElement;
        hideBoard[6][8] = possibleSudokuElement;
        hideBoard[7][8] = possibleSudokuElement;

        PossibleSudokuElement possibleSudokuElement2 = new PossibleSudokuElement();
        possibleSudokuElement2.possibleElements.clear();
        possibleSudokuElement2.possibleElements.add(9);
        hideBoard[8][8] = possibleSudokuElement2;

        Vector vector = new Vector(8, 0);
        solver.enterIfNotPresentAsPossible(mainBoard, hideBoard, vector);

        showPossibleArray(hideBoard);
        showCharArray(mainBoard);
    }

    @Test
    public void testWhereLessNumberInHideBoard() {
        Solver solver = new Solver();
        char[][] mainBoard = new char[9][9];
        PossibleSudokuElement[][] hideBoard = new PossibleSudokuElement[9][9];
        for (int i = 0; i < hideBoard.length; i++) {
            for (int j = 0; j < hideBoard.length; j++) {
                hideBoard[i][j] = new PossibleSudokuElement();
            }
        }
        hideBoard[2][4].possibleElements.clear();
        hideBoard[2][4].possibleElements.add((Integer)5);
        hideBoard[2][4].possibleElements.add((Integer)8);

        hideBoard[7][4].possibleElements.clear();
        hideBoard[7][4].possibleElements.add((Integer)5);

        hideBoard[5][8].possibleElements.clear();

        //System.out.println(solver.whereLessNumberInHideBoard(hideBoard));
    }
}
