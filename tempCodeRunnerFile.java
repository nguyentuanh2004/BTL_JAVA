import java.util.*;
import java.math.*;
public class OnlyThree {
    static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();
        long[] p1 = new long[100000], p2 = new long[100000];
        int id1, id2; id1 = id2 = 0;
        long temp = 0;
        BigInteger v1 = BigInteger.valueOf(1), v2 = BigInteger.valueOf(2), v3 = BigInteger.valueOf(3);
        String cs3 = "0" + n.toString(3).toString();
        //System.out.println(cs3);
        int j = -1;
        boolean check = true;
        for (int i = cs3.length() - 1; i >= 0; i--) {
            j++;
            int bit = cs3.charAt(i) - '0';
            if (check == false) {
                check = true;
                bit++;
            }
            if (bit == 1) {
                p2[id2++] = j;
            } else if (bit == 2) {
                p1[id1++] = j;
                check = false;
            } else if (bit == 3) {
                check = false;
            }
        }
        if (id1 == 0) System.out.println(-1);
        else {
            for (int i = 0; i < id1; i++) {
                System.out.print(p1[i] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < id2; i++) {
            System.out.print(p2[i] + " ");
        }
    }
}

/*
 * 
 mov ax, cx
  
        mov bx, 10H
        div bx   
        add dx, 48
        mov s + 32, dl
        
        mov bx, 10H
        div bx
        add dx, 48
        mov s + 33, dl
        
        mov bx, 10H
        div bx
        add dx, 48
        mov s + 34, dl
        
        mov bx, 10H
        div bx
        add dx, 48
        mov s + 35, dl
 */
/*
 * 
mov ah, 2ah
        
        cmp al, 0
        je chunhat 
        jmp other

chunhat:
        mov s + 4, 'S'
        mov s + 5, 'U'
        jmp cont    
other:  
        inc dl
        add dl, 48
        mov bl, dl
        mov s + 5, dl
        jmp cont
        
cont:   
        mov al, 0
        mov ah, dl
        mov bl, 10
        div bl
        add al, 48
        add ah, 48
        mov s + 13, al
        mov s + 14, ah
        
        
        mov al, 0
        mov ah, dh
        mov bl, 10
        div bl
        add al, 48
        add ah, 48
        mov s + 23, al
        mov s + 24, ah
        
        
        
        
year:       

        mov ah, 9
        lea dx, s
        int 21h
 */