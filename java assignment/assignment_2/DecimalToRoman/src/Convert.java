public class Convert {
    double num;
    int f=0;
    String st;

    public String getSt() {
        return st;
    }

    public Convert(double nu) {
        this.num=nu;
        int x=(int)num/1000;
        if(x!=0)
            st="M";
        for(int i=1;i<x;i++)
            st=st+"M";
        num=num-x*1000;
        x=0;
        x=(int)num/100;
        num=num-100*x;
        if(x==9)
        {
            f=0;
            if(st==null)
            {
                st="CM";
                f=1;
            }
            else {
                st = st + "CM";
            }
        }
        else if(x==4)
        {
            f=0;
            if(st==null)
            {
                st="CD";
                f=1;
            }
            else {
                st=st+"CD";
            }
            f=0;

        }
        else if(x>=5)
        {
            f=0;
            if(st==null)
            {
                st="D";
                f=1;
            }
            else {
                st = st + 'D';
            }

            x=x-5;
            for(int i=0;i<x;i++)
            {
                st=st+'C';
            }
        }
        else if(x<5&&x!=0) {
            f=0;
            if(st==null)
            {
                st="C";
                f=1;
            }
            for (int i = f; i < x; i++) {
                st = st + 'C';
            }
            f=0;
        }
        x=0;
        x=(int)num/10;
        num=num-x*10;
        if(x==9)
        {
            f=0;
            if(st==null)
            {
                st="XC";
                f=1;
            }
            else
            st=st+"XC";
            f=0;
        }
     else   if(x>=5)
        {

            if(st==null &&x!=0)
            {
                st="L";
            }
            else
            {
              st=st+"L";  
            }

            x=x-5;


            for(int i=0;i<x;i++)
            {
                st=st+'X';
            }
            f=0;
        }
     else if(x==4){
         if(x==4&&st==null)
        {
            st="XL";
        }
     else
         st=st+"XL";


        } else {
            if(st==null &&x!=0)
            {
                st="X";
                f=1;
            }
            for (int i = f; i < x; i++) {
                st = st + 'X';
            }
        }
     x=(int)num;
        if(x==9)
        {
            f=0;
            if(st==null)
            {
                st="IX";
                f=1;
            }
            else
            st=st+"IX";
        }
        else if(x>=5)
        {
            f=0;
            if(st==null)
            {
                st="V";
                f=1;
            }
            else {
                st = st + 'V';
            }
                x = x - 5;
                for (int i = 0; i < x; i++) {
                    st = st + 'I';

            }
        }
        else if (x==4) {
            f=0;
            if(st==null)
            {
                st="IV";
                f=1;
            }
            else
            st=st+"IV";

        }
        else  {
            f=0;
            if(st==null)
            {
                st="I";
                f=1;
            }
            for (int i=f;i<num;i++)
                st=st+'I';

        }


    }
}
