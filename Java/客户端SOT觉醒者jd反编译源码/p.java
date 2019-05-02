import java.io.DataInputStream;

public class p
{
  h a = null;
  g jdField_if = null;
  public a3[] jdField_do = null;
  
  public p(h paramh)
  {
    this.a = paramh;
    this.jdField_if = paramh.cJ;
  }
  
  public void jdMethod_do()
  {
    switch (this.jdField_if.jdField_do)
    {
    case -61: 
      this.jdField_if.E();
      a();
      int i = 0;
      for (int j = 0; j < this.a.f3.length; j = (byte)(j + 1)) {
        if (this.a.f3[j] != 0) {
          i = 1;
        }
      }
      if (i != 0) {
        this.a.x();
      }
      this.a.c();
      break;
    case -62: 
      this.jdField_if.a("确定购买?", "是", "否");
    }
  }
  
  public void a(int paramInt)
  {
    switch (this.jdField_if.jdField_do)
    {
    case -61: 
      jdMethod_if(paramInt);
      break;
    case -62: 
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
          for (int j = 0; j < this.a.f3.length; j = (byte)(j + 1)) {
            if (this.a.f3[j] != 0) {
              i = (byte)(i + 1);
            }
          }
          if (this.a.aG.jdMethod_int(4056))
          {
            this.a.aG.jdMethod_if(this.jdField_if.b5);
            this.a.aG.jdMethod_do(i);
            for (j = 0; j < this.a.f3.length; j = (byte)(j + 1)) {
              if (this.a.f3[j] != 0) {
                this.a.aG.jdMethod_for(this.jdField_do[j].a((byte)0));
              }
            }
            this.a.aG.jdMethod_if();
          }
          this.jdField_if.jdField_do = 21;
          break;
        case 1: 
          this.jdField_if.jdField_do = -61;
        }
        break;
      }
      break;
    }
  }
  
  public void a(int paramInt, String paramString, DataInputStream paramDataInputStream)
  {
    try
    {
      if (paramInt == 1)
      {
        this.jdField_if.a(paramString, (short)0, false, 9999);
        return;
      }
      this.a.cZ.jdMethod_if((byte)0, paramDataInputStream.readInt());
      int i = paramDataInputStream.readByte();
      for (int j = 0; j < i; j = (byte)(j + 1))
      {
        String str = paramDataInputStream.readUTF();
        byte[] arrayOfByte = new byte[54];
        paramDataInputStream.readFully(arrayOfByte);
        if (this.a.jdField_try < h.f0)
        {
          this.a.b7[this.a.jdField_try] = new a3(this.a, null);
          this.a.b7[this.a.jdField_try].O = str;
          this.a.b7[this.a.jdField_try].a(arrayOfByte);
          h tmp157_154 = this.a;
          tmp157_154.jdField_try = ((byte)(tmp157_154.jdField_try + 1));
        }
      }
      this.a.L();
      this.jdField_if.a("购买成功.", (short)0, false, 9999);
      this.jdField_do = null;
      this.a.ee = null;
    }
    catch (Exception localException) {}
  }
  
  public void a()
  {
    if (h.a9 == 0)
    {
      this.a.a((byte)2, 0, 0, 128, 128, true);
      this.a.a(this.jdField_do, (byte)this.jdField_do.length, (byte)this.jdField_do.length, this.a.f3);
      if ((this.jdField_do.length > 0) && (this.jdField_do[this.jdField_if.bf] != null))
      {
        jdMethod_if();
        if (this.jdField_if.mz == 0)
        {
          this.a.a(this.jdField_do[this.jdField_if.bf], (byte)0, (short)22);
          this.a.a(h.dU / 2 - 7, h.fp - 10 + (this.jdField_if.jdField_int % 6 == 0 ? 1 : -1), 14, 8, 0, 0, this.a.aH[4], 3);
        }
        else
        {
          this.a.a(this.jdField_do[this.jdField_if.bf], (byte)1, (short)35);
          this.a.a(h.dU / 2 - 7, 22 + (this.jdField_if.jdField_int % 6 == 0 ? -1 : 1), 14, 8, 0, 0, this.a.aH[4], 0);
        }
      }
    }
    else
    {
      this.a.a((byte)2, 0, 0, 176, 203, true);
      this.a.a(this.jdField_do, (byte)this.jdField_do.length, (byte)this.jdField_do.length, this.a.f3);
      if ((this.jdField_do.length > 0) && (this.jdField_do[this.jdField_if.bf] != null))
      {
        jdMethod_if();
        int i = this.a.a(this.jdField_do[this.jdField_if.bf], (byte)0, (short)22);
        this.a.a(this.jdField_do[this.jdField_if.bf], (byte)1, (short)(i + h.eA + 5));
      }
    }
  }
  
  public void jdMethod_if()
  {
    this.a.a(59, 20, 12, 12, 0, 0, this.a.aH[10], 0);
    this.a.a(71, 25, this.a.ee[this.jdField_if.bf], 20);
    this.a.a(59, 35, 12, 12, 12, 0, this.a.aH[10], 0);
    long l = this.jdField_if.bO;
    for (int i = 0; i < this.jdField_do.length; i = (byte)(i + 1)) {
      if (this.a.f3[i] != 0) {
        l -= this.a.ee[i];
      }
    }
    this.a.a(72, 40, l, 20);
  }
  
  public void jdMethod_if(int paramInt)
  {
    switch (paramInt)
    {
    case 6: 
      int i = 0;
      for (int j = 0; j < this.a.f3.length; j = (byte)(j + 1)) {
        if (this.a.f3[j] != 0) {
          i = 1;
        }
      }
      if (i == 0) {
        return;
      }
      this.jdField_if.e3 = 0;
      this.jdField_if.jdField_do = -62;
      break;
    case 5: 
      if (this.a.cZ.a8) {
        return;
      }
      if (this.a.f3.length == 0) {
        return;
      }
      if (this.a.f3[this.jdField_if.bf] != 0)
      {
        this.a.f3[this.jdField_if.bf] = false;
      }
      else
      {
        long l = 0L;
        int k = 0;
        for (int m = 0; m < this.jdField_do.length; m = (byte)(m + 1)) {
          if (this.a.f3[m] != 0)
          {
            k = (byte)(k + 1);
            l += this.a.ee[m];
          }
        }
        if (this.a.jdField_try + k + 1 > h.f0)
        {
          this.jdField_if.a("没有位置存放新的宠物.", (short)-61, false, 9999);
          return;
        }
        if (this.jdField_if.bO - l - this.a.ee[this.jdField_if.bf] < 0L)
        {
          this.jdField_if.a("钱不够啊", (short)-61, false, 9999);
          return;
        }
        this.a.f3[this.jdField_if.bf] = true;
      }
      break;
    case 7: 
      this.jdField_do = null;
      this.a.ee = null;
      this.jdField_if.jdField_do = 26;
      this.a.a4 = null;
      Runtime.getRuntime().gc();
      break;
    case 3: 
      this.jdField_if.mz = 0;
      g tmp393_390 = this.jdField_if;
      tmp393_390.bf = ((byte)(tmp393_390.bf - 1));
      if (this.jdField_if.bf < 0) {
        this.jdField_if.bf = ((byte)(this.jdField_do.length - 1));
      }
      break;
    case 4: 
      this.jdField_if.mz = 0;
      g tmp443_440 = this.jdField_if;
      tmp443_440.bf = ((byte)(tmp443_440.bf + 1));
      if (this.jdField_if.bf > this.jdField_do.length - 1) {
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
}


/* Location:              D:\OneDrive\游戏\客户端SOT觉醒者 - 副本.jar!\p.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */