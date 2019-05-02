import java.util.Vector;

public class ak
{
  h a;
  ao jdField_void = null;
  public Vector d = null;
  public short[] jdField_else = null;
  private ao[] jdField_null = null;
  public String[] jdField_new = null;
  public String[] jdField_long = null;
  public ao[] jdField_for = null;
  public static final byte jdField_byte = 0;
  public static final byte jdField_do = 1;
  public static final byte jdField_try = 2;
  public static final byte c = 3;
  String jdField_int = null;
  public static final short jdField_if = 8888;
  int[] jdField_goto = null;
  String[] jdField_char = null;
  String jdField_case = null;
  short b;
  
  public ak(h paramh)
  {
    this.a = paramh;
    this.d = new Vector();
    this.jdField_else = new short[0];
    this.jdField_null = new ao[0];
  }
  
  public ao jdMethod_int(short paramShort)
  {
    ao localao = null;
    if (this.jdField_for != null) {
      for (i = 0; i < this.jdField_for.length; i = (byte)(i + 1))
      {
        localao = this.jdField_for[i];
        if (localao.E == paramShort) {
          return localao;
        }
      }
    }
    for (int i = 0; i < this.jdField_null.length; i = (byte)(i + 1))
    {
      localao = this.jdField_null[i];
      if (localao.E == paramShort) {
        return localao;
      }
    }
    for (i = 0; i < this.d.size(); i = (byte)(i + 1))
    {
      localao = (ao)this.d.elementAt(i);
      if (localao.E == paramShort) {
        return localao;
      }
    }
    return null;
  }
  
  public void jdMethod_new(short paramShort)
  {
    this.jdField_void = jdMethod_int(paramShort);
    if (this.jdField_void == null) {
      return;
    }
    if (jdMethod_case(this.jdField_void.E))
    {
      this.a.S.a(this.a.S.jdField_long, this.a.cJ);
      return;
    }
    if (a(this.jdField_void.E))
    {
      if ((jdMethod_try(this.jdField_void.E)) && (jdMethod_for(this.jdField_void)))
      {
        a(this.jdField_void.E, true);
        this.a.S.a(this.a.S.jdField_for, this.a.cJ);
      }
      else
      {
        this.a.S.a(this.a.S.jdField_int, this.a.cJ);
      }
    }
    else if (jdMethod_if(this.jdField_void)) {
      this.a.S.a(this.a.S.jdField_byte, this.a.cJ);
    } else if (this.a.cZ.a((byte)14) < this.jdField_void.N) {
      this.a.S.a(this.a.S.jdField_char, this.a.cJ);
    } else if (this.a.cZ.a((byte)14) > this.jdField_void.r) {
      this.a.S.a(this.a.S.aR, this.a.cJ);
    }
  }
  
  public void jdMethod_do(short paramShort)
  {
    ao localao = jdMethod_int(paramShort);
    if (localao == null) {
      return;
    }
    a(localao, true);
  }
  
  public void jdMethod_for()
  {
    this.jdField_null = null;
    this.jdField_null = new ao[0];
  }
  
  public void a(ao paramao)
  {
    ao[] arrayOfao = new ao[this.jdField_null.length + 1];
    System.arraycopy(this.jdField_null, 0, arrayOfao, 0, this.jdField_null.length);
    arrayOfao[(arrayOfao.length - 1)] = paramao;
    this.jdField_null = arrayOfao;
    arrayOfao = null;
  }
  
  public void jdMethod_do(ao paramao)
  {
    a(paramao, false);
  }
  
  public void jdMethod_for(short paramShort)
  {
    for (int i = 0; i < this.jdField_else.length; i++) {
      if (paramShort == this.jdField_else[i]) {
        return;
      }
    }
    short[] arrayOfShort = new short[this.jdField_else.length + 1];
    System.arraycopy(this.jdField_else, 0, arrayOfShort, 0, this.jdField_else.length);
    arrayOfShort[(arrayOfShort.length - 1)] = paramShort;
    this.jdField_else = arrayOfShort;
    arrayOfShort = null;
  }
  
  public void a(ao paramao, boolean paramBoolean)
  {
    for (int i = 0; i < this.d.size(); i++)
    {
      ao localao = (ao)this.d.elementAt(i);
      if (paramao.E == localao.E) {
        return;
      }
    }
    switch (paramao.P)
    {
    case 1: 
      this.a.cZ.jdMethod_if((byte)0, (short)paramao.jdField_for[0], paramao.jdField_for[1]);
      break;
    case 5: 
      this.a.cZ.jdMethod_do(this.a.cZ.a((byte)0));
      this.a.cZ.jdMethod_if((byte)0, paramao.jdField_for[1]);
    }
    this.d.addElement(paramao);
    if ((paramBoolean) && (this.a.aG.jdMethod_int(5841)))
    {
      this.a.aG.jdMethod_new(paramao.E);
      this.a.aG.jdMethod_do(0);
      this.a.aG.jdMethod_if();
    }
  }
  
  public void a(short paramShort, boolean paramBoolean)
  {
    ao localao = jdMethod_int(paramShort);
    if (localao == null) {
      return;
    }
    int i = -1;
    switch (localao.P)
    {
    case 15: 
    case 20: 
    case 24: 
      if (this.jdField_goto == null) {
        return;
      }
      i = this.jdField_goto[this.a.cJ.gd];
      break;
    case 0: 
    case 11: 
    case 12: 
    case 13: 
    case 14: 
    case 18: 
    case 19: 
    case 22: 
    case 23: 
      this.a.cZ.a((byte)0, (short)localao.jdField_for[0], localao.jdField_for[1], false);
      break;
    case 1: 
      this.a.cZ.a((byte)0, (short)localao.jdField_for[2], localao.jdField_for[3], false);
      break;
    case 5: 
      this.a.cZ.jdMethod_if((byte)0, this.a.cZ.am());
      break;
    case 8: 
      return;
    }
    if (this.a.aG.jdMethod_int(5842))
    {
      this.a.aG.jdMethod_new(localao.E);
      this.a.aG.jdMethod_for(i);
      this.a.aG.jdMethod_if();
    }
  }
  
  private void jdMethod_if(byte paramByte)
  {
    for (int i = 0; i < this.jdField_else.length; i++) {
      if (jdMethod_if(this.jdField_else[i]) == paramByte)
      {
        this.jdField_else[i] = this.jdField_else[(this.jdField_else.length - 1)];
        short[] arrayOfShort = new short[this.jdField_else.length - 1];
        System.arraycopy(this.jdField_else, 0, arrayOfShort, 0, arrayOfShort.length);
        this.jdField_else = arrayOfShort;
      }
    }
  }
  
  public void a()
  {
    for (int i = 0; i < this.d.size(); i++)
    {
      ao localao = (ao)this.d.elementAt(i);
      if (jdMethod_if(localao.E) == 7) {
        this.d.removeElementAt(i);
      }
    }
    jdMethod_if((byte)7);
  }
  
  public void jdMethod_byte(short paramShort)
  {
    Object localObject;
    for (int i = 0; i < this.d.size(); i++)
    {
      localObject = (ao)this.d.elementAt(i);
      if (((ao)localObject).E == paramShort)
      {
        this.d.removeElementAt(i);
        break;
      }
    }
    for (i = 0; i < this.jdField_else.length; i++) {
      if (this.jdField_else[i] == paramShort)
      {
        this.jdField_else[i] = this.jdField_else[(this.jdField_else.length - 1)];
        localObject = new short[this.jdField_else.length - 1];
        System.arraycopy(this.jdField_else, 0, localObject, 0, localObject.length);
        this.jdField_else = ((short[])localObject);
      }
    }
  }
  
  public void jdMethod_int()
  {
    for (int i = 0; i < this.d.size(); i++)
    {
      ao localao = (ao)this.d.elementAt(i);
      if (jdMethod_if(localao.E) == 9)
      {
        this.d.removeElementAt(i);
        break;
      }
    }
    jdMethod_if((byte)9);
  }
  
  public void jdMethod_do()
  {
    for (int i = 0; i < this.d.size(); i++)
    {
      ao localao = (ao)this.d.elementAt(i);
      if ((this.a.cZ.a((byte)14) > localao.r) || (this.a.cZ.a((byte)14) < localao.N))
      {
        this.d.removeElementAt(i);
        a(localao);
        if (this.a.aG.jdMethod_int(5845))
        {
          this.a.aG.jdMethod_new(localao.E);
          this.a.aG.jdMethod_if();
        }
      }
    }
  }
  
  public boolean a(byte paramByte)
  {
    for (int i = 0; i < this.d.size(); i = (byte)(i + 1))
    {
      ao localao = (ao)this.d.elementAt(i);
      if (localao.P == paramByte) {
        return true;
      }
    }
    return false;
  }
  
  public boolean jdMethod_if()
  {
    for (int i = 0; i < this.d.size(); i = (byte)(i + 1))
    {
      ao localao = (ao)this.d.elementAt(i);
      if ((localao.E >= 1000) && (localao.E < 2000) && (localao.E != 8888)) {
        return true;
      }
    }
    return false;
  }
  
  public boolean jdMethod_do(byte paramByte)
  {
    for (int i = 0; i < this.d.size(); i = (byte)(i + 1))
    {
      ao localao = (ao)this.d.elementAt(i);
      if (jdMethod_if(localao.E) == paramByte) {
        return true;
      }
    }
    return false;
  }
  
  public boolean jdMethod_case(short paramShort)
  {
    for (int i = 0; i < this.jdField_else.length; i = (short)(i + 1)) {
      if ((paramShort == this.jdField_else[i]) && ((jdMethod_int(paramShort) == null) || (!jdMethod_int(paramShort).jdField_char))) {
        return true;
      }
    }
    return false;
  }
  
  public boolean a(short paramShort)
  {
    for (int i = 0; i < this.d.size(); i++)
    {
      ao localao = (ao)this.d.elementAt(i);
      if (localao.E == paramShort) {
        return true;
      }
    }
    return false;
  }
  
  public boolean jdMethod_if(ao paramao)
  {
    if (this.a.cZ.a((byte)14) >= paramao.N)
    {
      switch (paramao.P)
      {
      case 1: 
        return this.a.cZ.a((byte)0, (short)paramao.jdField_for[0], paramao.jdField_for[1]);
      case 0: 
      case 2: 
      case 3: 
      case 4: 
      case 5: 
      case 6: 
      case 7: 
      case 8: 
      case 9: 
        return true;
      case 21: 
      case 22: 
      case 23: 
      case 24: 
        return !jdMethod_do((byte)9);
      case 10: 
      case 18: 
      case 19: 
      case 20: 
        return !jdMethod_do((byte)7);
      case 11: 
      case 12: 
      case 13: 
      case 14: 
      case 15: 
      case 16: 
      case 17: 
        return !jdMethod_do((byte)8);
      }
      return false;
    }
    return false;
  }
  
  public boolean jdMethod_for(ao paramao)
  {
    if (paramao.jdField_int.length == 0) {
      return true;
    }
    return this.a.cZ.a((byte)0, paramao.jdField_int[0][0], paramao.jdField_int[0][1]);
  }
  
  public boolean jdMethod_try(short paramShort)
  {
    ao localao = jdMethod_int(paramShort);
    switch (localao.P)
    {
    case 15: 
    case 20: 
    case 24: 
      int i = 0;
      for (int j = 0; j < 2; j = (byte)(j + 1))
      {
        i = 0;
        for (int k = 0; k < this.a.jdField_try; k = (byte)(k + 1))
        {
          a3 locala3 = this.a.b7[k];
          if ((locala3.a((byte)14) >= localao.jdField_for[2]) && (locala3.a((byte)42) >= localao.jdField_for[3]) && (locala3.a((byte)44) >= localao.jdField_for[4]) && (locala3.a((byte)28) >= localao.jdField_for[5]) && (locala3.a((byte)30) >= localao.jdField_for[6]) && (locala3.a((byte)32) >= localao.jdField_for[7]) && (locala3.a((byte)34) >= localao.jdField_for[8]) && ((localao.jdField_for[0] == -1) || (localao.jdField_for[0] == locala3.a((byte)48))) && ((localao.jdField_for[1] == -1) || (localao.jdField_for[1] == this.a.a(locala3))))
          {
            if (j == 1)
            {
              this.jdField_goto[i] = locala3.a(0);
              this.jdField_char[i] = (locala3.a(14) + "级 " + locala3.O);
            }
            i = (byte)(i + 1);
          }
        }
        if (j == 0)
        {
          this.jdField_goto = new int[i];
          this.jdField_char = new String[i];
        }
      }
      if (i > 0)
      {
        this.b = localao.E;
        this.jdField_case = localao.h;
        return true;
      }
      return false;
    case 16: 
    case 17: 
      return false;
    case 0: 
    case 11: 
    case 12: 
    case 13: 
    case 14: 
    case 18: 
    case 19: 
    case 22: 
    case 23: 
      return this.a.cZ.jdMethod_if((short)localao.jdField_for[0]) >= localao.jdField_for[1];
    case 1: 
      return this.a.cZ.jdMethod_if((short)localao.jdField_for[2]) >= localao.jdField_for[3];
    case 2: 
      return true;
    case 3: 
    case 4: 
    case 6: 
    case 7: 
    case 9: 
    case 10: 
    case 21: 
      return false;
    case 5: 
      return this.a.cZ.a((byte)0) >= localao.jdField_for[2];
    case 8: 
      return this.a.cZ.a((byte)0, (short)localao.jdField_for[0]) >= 0;
    }
    return true;
  }
  
  public static byte jdMethod_if(short paramShort)
  {
    if (paramShort < 2000) {
      return 5;
    }
    if (paramShort < 3000) {
      return 6;
    }
    if (paramShort < 3500) {
      return 0;
    }
    if (paramShort < 4000) {
      return 1;
    }
    if (paramShort < 4500) {
      return 2;
    }
    if (paramShort < 5000) {
      return 3;
    }
    if (paramShort < 6000) {
      return 4;
    }
    if (paramShort < 7000) {
      return 9;
    }
    if ((paramShort >= 10000) && (paramShort < 10020)) {
      return 7;
    }
    if ((paramShort >= 10100) && (paramShort < 20100)) {
      return 8;
    }
    return 5;
  }
}


/* Location:              D:\OneDrive\游戏\客户端SOT觉醒者 - 副本.jar!\ak.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */