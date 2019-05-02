import java.io.DataInputStream;

public class j
{
  h a = null;
  g jdField_if = null;
  
  public j(h paramh)
  {
    this.a = paramh;
    this.jdField_if = paramh.cJ;
  }
  
  public void a()
  {
    if (h.a9 == 0)
    {
      this.a.a((byte)2, 0, 0, 128, 128, true);
      this.a.a(this.a.b7, this.a.jdField_try, h.f0, this.a.f3);
      if (this.a.b7[this.jdField_if.bf] != null)
      {
        if (this.a.ee[this.jdField_if.bf] > 0)
        {
          this.a.a(42, 22, 12, 12, 0, 0, this.a.aH[10], 0);
          this.a.a(54, 25, this.a.ee[this.jdField_if.bf], 20);
        }
        if (this.jdField_if.mz == 0)
        {
          this.a.a(this.a.b7[this.jdField_if.bf], (byte)0, (short)22);
          this.a.a(h.dU / 2 - 7, h.fp - 10 + (this.jdField_if.jdField_int % 6 == 0 ? 1 : -1), 14, 8, 0, 0, this.a.aH[4], 3);
        }
        else
        {
          this.a.a(this.a.b7[this.jdField_if.bf], (byte)1, (short)35);
          this.a.a(h.dU / 2 - 7, 22 + (this.jdField_if.jdField_int % 6 == 0 ? -1 : 1), 14, 8, 0, 0, this.a.aH[4], 0);
        }
      }
    }
    else
    {
      this.a.a((byte)2, 0, 0, 176, 203, true);
      this.a.a(this.a.b7, this.a.jdField_try, this.a.jdField_try, this.a.f3);
      if (this.a.b7[this.jdField_if.bf] != null)
      {
        if (this.a.ee[this.jdField_if.bf] > 0)
        {
          this.a.a(42, 22, 12, 12, 0, 0, this.a.aH[10], 0);
          this.a.a(54, 25, this.a.ee[this.jdField_if.bf], 20);
        }
        int i = this.a.a(this.a.b7[this.jdField_if.bf], (byte)0, (short)22);
        this.a.a(this.a.b7[this.jdField_if.bf], (byte)1, (short)(i + h.eA + 5));
      }
    }
  }
  
  public void jdMethod_if()
  {
    switch (this.jdField_if.jdField_do)
    {
    case -59: 
      this.jdField_if.E();
      a();
      this.a.d9.a();
      break;
    case -60: 
      this.jdField_if.a("确定摆摊?", "是", "否");
      break;
    case -58: 
      this.jdField_if.E();
      a();
      this.a.x();
      this.a.c();
    }
  }
  
  public void a(int paramInt)
  {
    switch (this.jdField_if.jdField_do)
    {
    case -58: 
      jdMethod_if(paramInt);
      break;
    case -59: 
      switch (this.a.d9.a(paramInt))
      {
      case 2: 
        this.jdField_if.a("只能输入" + this.jdField_if.f4 + "-" + this.jdField_if.hG + "的数.", this.jdField_if.jdField_do, false, 9999);
        break;
      case 0: 
        this.a.ee[this.jdField_if.bf] = a3.jdMethod_do(this.jdField_if.mn, 4);
        if (this.a.ee[this.jdField_if.bf] > 0) {
          this.a.f3[this.jdField_if.bf] = true;
        } else {
          this.a.f3[this.jdField_if.bf] = false;
        }
        this.jdField_if.jdField_do = -58;
        break;
      case 1: 
        this.jdField_if.jdField_do = -58;
      }
      break;
    case -60: 
      switch (paramInt)
      {
      case 1: 
        this.jdField_if.e3 = 0;
        break;
      case 2: 
        this.jdField_if.e3 = 1;
        break;
      case 5: 
        switch (this.jdField_if.e3)
        {
        case 0: 
          int i = 0;
          for (int j = 0; j < this.a.ee.length; j = (byte)(j + 1)) {
            if (this.a.ee[j] > 0) {
              i = (byte)(i + 1);
            }
          }
          if (this.a.aG.jdMethod_int(4055))
          {
            this.a.aG.jdMethod_do(i);
            for (j = 0; j < this.a.ee.length; j = (byte)(j + 1)) {
              if (this.a.ee[j] > 0)
              {
                this.a.aG.jdMethod_for(this.a.b7[j].a((byte)0));
                this.a.aG.jdMethod_for(this.a.ee[j]);
              }
            }
            this.a.aG.jdMethod_if();
          }
          this.jdField_if.jdField_do = 21;
          break;
        case 1: 
          this.jdField_if.jdField_do = -58;
        }
        break;
      }
      break;
    }
  }
  
  public void jdMethod_if(int paramInt)
  {
    switch (paramInt)
    {
    case 6: 
      int i = 0;
      for (int j = 0; j < this.a.ee.length; j = (byte)(j + 1)) {
        if (this.a.ee[j] > 0) {
          i = 1;
        }
      }
      if (i == 0) {
        return;
      }
      this.jdField_if.e3 = 0;
      this.jdField_if.jdField_do = -60;
      break;
    case 5: 
      if (this.a.b7[this.jdField_if.bf] == null) {
        return;
      }
      if (this.a.b7[this.jdField_if.bf].a((byte)12) != 0)
      {
        this.jdField_if.a(4, (short)-58, false, 9999);
        return;
      }
      this.a.d9 = new w(this.a, "价格", 0, 99999999, this.a.ee[this.jdField_if.bf]);
      this.jdField_if.jdField_do = -59;
      break;
    case 7: 
      this.jdField_if.jdField_do = 0;
      this.a.di = null;
      break;
    case 3: 
      this.jdField_if.mz = 0;
      g tmp250_247 = this.jdField_if;
      tmp250_247.bf = ((byte)(tmp250_247.bf - 1));
      if (this.jdField_if.bf < 0) {
        this.jdField_if.bf = ((byte)(this.a.jdField_try - 1));
      }
      break;
    case 4: 
      this.jdField_if.mz = 0;
      g tmp302_299 = this.jdField_if;
      tmp302_299.bf = ((byte)(tmp302_299.bf + 1));
      if (this.jdField_if.bf > this.a.jdField_try - 1) {
        this.jdField_if.bf = 0;
      }
      break;
    case 1: 
      if (h.a9 == 0) {
        this.jdField_if.mz = 0;
      }
      break;
    case 2: 
      if (h.a9 == 0) {
        this.jdField_if.mz = 1;
      }
      break;
    }
  }
  
  public void a(int paramInt, String paramString, DataInputStream paramDataInputStream)
  {
    try
    {
      this.a.cZ.d = 1;
      this.a.cZ.a8 = (paramDataInputStream.readByte() == 0);
      this.jdField_if.a(paramDataInputStream.readUTF(), (short)0, false, 9999);
      this.jdField_if.mw = paramDataInputStream.readInt();
      int i = paramDataInputStream.readByte();
      int[] arrayOfInt1 = new int[i];
      for (int j = 0; j < i; j = (byte)(j + 1)) {
        arrayOfInt1[j] = paramDataInputStream.readInt();
      }
      j = 0;
      int n;
      for (int k = 0; k < this.a.jdField_try; k = (byte)(k + 1))
      {
        m = 0;
        for (n = 0; n < i; n = (byte)(n + 1)) {
          if (arrayOfInt1[n] == this.a.b7[k].a((byte)0))
          {
            m = 1;
            break;
          }
        }
        if (m == 0) {
          j = (byte)(j + 1);
        }
      }
      int[] arrayOfInt2 = new int[j];
      j = 0;
      for (int m = 0; m < this.a.jdField_try; m = (byte)(m + 1))
      {
        n = 0;
        for (int i1 = 0; i1 < i; i1 = (byte)(i1 + 1)) {
          if (arrayOfInt1[i1] == this.a.b7[m].a((byte)0))
          {
            n = 1;
            break;
          }
        }
        if (n == 0)
        {
          arrayOfInt2[j] = this.a.b7[m].a(0);
          j = (byte)(j + 1);
        }
      }
      for (m = 0; m < j; m = (byte)(m + 1)) {
        for (n = 0; n < this.a.jdField_try; n = (byte)(n + 1)) {
          if (this.a.b7[n].a((byte)0) == arrayOfInt2[m])
          {
            this.a.b7[n] = this.a.b7[(this.a.jdField_try - 1)];
            this.a.b7[(this.a.jdField_try - 1)] = null;
            h tmp404_401 = this.a;
            tmp404_401.jdField_try = ((byte)(tmp404_401.jdField_try - 1));
            break;
          }
        }
      }
      this.a.L();
    }
    catch (Exception localException) {}
  }
}


/* Location:              D:\OneDrive\游戏\客户端SOT觉醒者 - 副本.jar!\j.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */