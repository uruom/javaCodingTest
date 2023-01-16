package Q8_10_Paint_Fill;

/**
 * @ClassName:MyCodeQ810
 * @Auther: uruom
 * @Description: color fill
 * @Date: 2023/1/13 17:56
 * @Version: v1.0
 */
public class MyCodeQ810 {
    public enum Color {
        Black, White, Red, Yellow, Green
    }

    public static String PrintColor(Question.Color c) {
        switch(c) {
            case Black:
                return "B";
            case White:
                return "W";
            case Red:
                return "R";
            case Yellow:
                return "Y";
            case Green:
                return "G";
        }
        return "X";
    }
    public static int randomInt(int n) {
        return (int) (Math.random() * n);
    }
    public static void PrintScreen(Question.Color[][] screen) {
        for (int r = 0; r < screen.length; r++) {
            for (int c = 0; c < screen[0].length; c++) {
                System.out.print(PrintColor(screen[r][c]));
            }
            System.out.println();
        }
    }
    public static void PaintDfs(Question.Color[][] screen,int row,int col,Question.Color tempColor,Question.Color replacedColor){
        if(screen[row][col]==tempColor){
            screen[row][col] = replacedColor;
            if(row>0) PaintDfs(screen,row-1,col,tempColor,replacedColor);
            if(col>0) PaintDfs(screen, row, col-1, tempColor, replacedColor);
            if(row<screen.length-1) PaintDfs(screen, row+1, col, tempColor, replacedColor);
            if(col<screen[0].length-1) PaintDfs(screen, row, col+1, tempColor, replacedColor);
        }else{
            return;
        }
    }
    public static void PaintFill(Question.Color[][] screen,int row,int col,Question.Color color){
        PaintDfs(screen,row,col,screen[row][col],color);
    }
    public static void main(String[] args) {
        int N = 10;
        Question.Color[][] screen = new Question.Color[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                screen[i][j] = Question.Color.Black;
            }
        }
        for (int i = 0; i < 100; i++) {
            screen[randomInt(N)][randomInt(N)] = Question.Color.Green;
        }
        PrintScreen(screen);
        PaintFill(screen, 2, 2, Question.Color.White);
        System.out.println();
        PrintScreen(screen);
    }
}
