import java.util.Scanner;

public class letra_grande {

	public static void main(String[] args) {      
        Scanner in = new Scanner (System.in);
        
        // Mensagem pedindo ao usuário uma frase
        System.out.println("Digite sua frase: ");
        String fraseUsuario = in.nextLine();
        
        // Transforma a frase em caracteres
        String frase = fraseUsuario.toLowerCase();

        char[] letra = new char[frase.length()];
        String[][] letraTela = new String[frase.length()][];
        String[] esp = new String[6];
        esp[0]="  ";
        
        /* Loop for para atribuir esses caracteres à um array bidimensional
         * e que vai printar a frase em "letra grande" como um conjunto de caracteres "x"
         */
        for(int i = 0; i < frase.length(); i++){
            letra[i] = frase.charAt(i);
            letraTela[i] = comparar(letra[i]);  
        }
        
        // Loop for para printar a frase no console
        for(int c = 0; c <= 5; c++){
            for(int i = 0; i < frase.length(); i++){
                System.out.print(letraTela[i][c]);
                System.out.print(esp[0]);
            }
            System.out.println();
        }    
    }  
    
    // Método para atribuir o formato da letra
    public static String[] comparar (char letra){
    	switch (letra) {
        case ' ':
            return esp();
        case 'a':
            return a();
        case 'b':
            return b();
        case 'c':
            return c();
        case 'd':
            return d();
        case 'e':
            return e();
        case 'f':
            return f();
        case 'g':
            return g();
        case 'h':
            return h();
        case 'i':
            return i();
        case 'j':
            return j();
        case 'k':
            return k();
        case 'l':
            return l();
        case 'm':
            return m();
        case 'n':
            return n();
        case 'o':
            return o();
        case 'p':
            return p();
        case 'q':
            return q();
        case 'r':
            return r();
        case 's':
            return s();
        case 't':
            return t();
        case 'u':
            return u();
        case 'v':
            return v();
        case 'w':
            return w();
        case 'x':
            return x();
        case 'y':
            return y();
        case 'z':
            return z();
        default:
            return new String[6];
    	}
    }
    
    // Método que contém a estrutura de cada caracter 
    public static String[] esp (){
        String[] esp = new String[6];
       
        esp[0]="  ";
        esp[1]="  ";
        esp[2]="  ";
        esp[3]="  ";
        esp[4]="  ";
        esp[5]="  ";

        return esp;
    }
   
    public static String[] a (){
        String[] a = new String[6];
       
        a[0]="  xxx  ";
        a[1]=" x   x ";
        a[2]="x     x";
        a[3]="xxxxxxx";
        a[4]="x     x";
        a[5]="x     x";

        return a;
    }
    public static String[] b (){
        String[] b = new String[6];
       
        b[0]="xxxxxx ";
        b[1]="x     x";
        b[2]="xxxxxxx";
        b[3]="x     x";
        b[4]="x     x";
        b[5]="xxxxxxx";

        return b;
    }
    public static String[] c (){
        String[] c = new String[6];
       
        c[0]="  xxxxx";
        c[1]=" x     ";
        c[2]="x      ";
        c[3]="x      ";
        c[4]=" x     ";
        c[5]="  xxxxx";

        return c;
    }
    public static String[] d (){
        String[] d = new String[6];
       
        d[0]="xxxx  ";
        d[1]="x   x ";
        d[2]="x    x";
        d[3]="x    x";
        d[4]="x   x ";
        d[5]="xxxx  ";

        return d;
    }
    public static String[] e (){
        String[] e = new String[6];
       
        e[0]="xxxxx ";
        e[1]="x     ";
        e[2]="xxxx  ";
        e[3]="x     ";
        e[4]="x     ";
        e[5]="xxxxx ";

        return e;
    }    
    public static String[] f (){
        String[] f = new String[6];
       
        f[0]="xxxxxx";
        f[1]="x     ";
        f[2]="xxxxx ";
        f[3]="x     ";
        f[4]="x     ";
        f[5]="x     ";

        return f;
    }
    public static String[] g (){
        String[] g = new String[6];
       
        g[0]="xxxxx ";
        g[1]="x     ";
        g[2]="x  xxx";
        g[3]="x    x";
        g[4]="x   x ";
        g[5]=" xxx  ";

        return g;
    }
    public static String[] h (){
        String[] h = new String[6];
       
        h[0]="x     x";
        h[1]="x     x";
        h[2]="xxxxxxx";
        h[3]="x     x";
        h[4]="x     x";
        h[5]="x     x";

        return h;
    }
    public static String[] i (){
    String[] i = new String[6];
       
        i[0]="xxxxxxx";
        i[1]="   x   ";
        i[2]="   x   ";
        i[3]="   x   ";
        i[4]="   x   ";
        i[5]="xxxxxxx";

        return i;
    }
    public static String[] j (){
    String[] j = new String[6];
       
        j[0]="   xxxx";
        j[1]="      x";
        j[2]="      x";
        j[3]=" xxx  x";
        j[4]="  x   x";
        j[5]="  xxxx ";

        return j;
    }
    public static String[] k (){
    String[] k = new String[6];
       
        k[0]="x    x ";
        k[1]="x  x   ";
        k[2]="xxx    ";
        k[3]="x  x   ";
        k[4]="x   x  ";
        k[5]="x    x ";

        return k;
    }
    public static String[] l (){
    String[] l = new String[6];
       
        l[0]="x      ";
        l[1]="x      ";
        l[2]="x      ";
        l[3]="x      ";
        l[4]="x      ";
        l[5]="xxxxxxx";

        return l;
    }
    public static String[] m(){
    String[] m = new String[6];
       
        m[0]="x     x";
        m[1]="xx   xx";
        m[2]="x x x x";
        m[3]="x  x  x";
        m[4]="x     x";
        m[5]="x     x";

        return m;
    }
    public static String[] n(){
    String[] n = new String[6];
       
        n[0]="x     x";
        n[1]="xx    x";
        n[2]="x x   x";
        n[3]="x  x  x";
        n[4]="x   x x";
        n[5]="x    xx";

        return n;
    }
    public static String[] o(){
    String[] o = new String[6];
       
        o[0]=" xxxxx ";
        o[1]="x     x";
        o[2]="x     x";
        o[3]="x     x";
        o[4]="x     x";
        o[5]=" xxxxx ";

        return o;
    }
    public static String[] p(){
    String[] p = new String[6];
       
        p[0]=" xxxxx ";
        p[1]="x     x";
        p[2]="x     x";
        p[3]="xxxxxx ";
        p[4]="x      ";
        p[5]="x      ";

        return p;
    }
     public static String[] q(){
    String[] q = new String[6];
       
        q[0]="  xxx  ";
        q[1]=" x   x ";
        q[2]="x     x";
        q[3]="x     x";
        q[4]=" x   x ";
        q[5]="  xxx x";

        return q;        
    }
    public static String[] r(){
    String[] r = new String[6];
       
        r[0]="xxxxx ";
        r[1]="x    x";
        r[2]="xxxxxx";
        r[3]="x   x ";
        r[4]="x    x";
        r[5]="x    x";

        return r;
    }
    public static String[] s(){
    String[] s = new String[6];
       
        s[0]=" xxxxxx";
        s[1]="x      ";
        s[2]=" xxxx  ";
        s[3]="     x ";
        s[4]="      x";
        s[5]=" xxxxx ";

        return s;
    }
    public static String[] t(){
    String[] t = new String[6];
       
        t[0]="xxxxxxx";
        t[1]="   x   ";
        t[2]="   x   ";
        t[3]="   x   ";
        t[4]="   x   ";
        t[5]="   x   ";

        return t;
    }
    public static String[] u(){
    String[] u = new String[6];
       
        u[0]="x     x";
        u[1]="x     x";
        u[2]="x     x";
        u[3]="x     x";
        u[4]="x     x";
        u[5]=" xxxxx ";

        return u;
    }
    public static String[] v(){
    String[] v = new String[6];
       
        v[0]="x     x";
        v[1]="x     x";
        v[2]=" x   x ";
        v[3]=" x   x ";
        v[4]="  x x  ";
        v[5]="  xxx  ";

        return v;
    }
    public static String[] w(){
    String[] w = new String[6];
       
        w[0]="x     x";
        w[1]="x     x";
        w[2]="x  x  x";
        w[3]="x  x  x";
        w[4]=" x   x ";
        w[5]="  x x  ";

        return w;
    }
    public static String[] x(){
    String[] x = new String[6];
       
        x[0]="x     x";
        x[1]=" x   x ";
        x[2]="  x x  ";
        x[3]="   x   ";
        x[4]="  x  x ";
        x[5]=" x    x";

        return x;
    }
      public static String[] y(){
    String[] y = new String[6];
       
        y[0]="x     x";
        y[1]=" x   x ";
        y[2]="  x x  ";
        y[3]="   x   ";
        y[4]="   x   ";
        y[5]="   x   ";

        return y;
    }
    public static String[] z(){
    String[] z = new String[6];
       
        z[0]=" xxxxxx";
        z[1]="      x";
        z[2]="     x ";
        z[3]="   x   ";
        z[4]=" x     ";
        z[5]=" xxxxxx";

        return z;
    }

}
