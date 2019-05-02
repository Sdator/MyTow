import java.util.Vector;

class bd
{
  h a = null;
  g jdField_if = null;
  
  public bd(h paramh)
  {
    this.a = paramh;
    this.jdField_if = paramh.cJ;
  }
  
  public void a(byte paramByte)
  {
    switch (paramByte)
    {
    case 0: 
      int i = -1;
      if (this.jdField_if.fa == 0) {
        i = this.jdField_if.jV[this.jdField_if.jM];
      } else if (this.jdField_if.fa == 1) {
        i = this.jdField_if.cT[this.jdField_if.jM][this.jdField_if.ix];
      } else {
        i = this.jdField_if.iM[this.jdField_if.jM][this.jdField_if.ix][this.jdField_if.dA];
      }
      if (i == 1)
      {
        g tmp138_135 = this.jdField_if;
        tmp138_135.fa = ((byte)(tmp138_135.fa + 1));
        this.jdField_if.ip.removeAllElements();
        this.jdField_if.bS.removeAllElements();
        int j;
        if (this.jdField_if.fa == 1)
        {
          this.jdField_if.jb = this.jdField_if.kd[this.jdField_if.jM];
          for (j = 0; j < this.jdField_if.gq[this.jdField_if.jM].length; j = (byte)(j + 1)) {
            this.jdField_if.ip.addElement(this.jdField_if.gq[this.jdField_if.jM][j]);
          }
        }
        else if (this.jdField_if.fa == 2)
        {
          this.jdField_if.jb = (this.jdField_if.kd[this.jdField_if.jM] + "-" + this.jdField_if.gq[this.jdField_if.jM][this.jdField_if.ix]);
          for (j = 0; j < this.jdField_if.cv[this.jdField_if.jM][this.jdField_if.ix].length; j = (byte)(j + 1)) {
            this.jdField_if.ip.addElement(this.jdField_if.cv[this.jdField_if.jM][this.jdField_if.ix][j]);
          }
        }
        this.a.i.jdMethod_for();
        this.jdField_if.jdField_do = 26;
      }
      else if (i == 3)
      {
        if (this.jdField_if.fa == 1) {
          this.a.i.a(this.jdField_if.gq[this.jdField_if.jM][this.jdField_if.hZ], (byte)26);
        } else if (this.jdField_if.fa == 2) {
          this.a.i.a(this.jdField_if.cv[this.jdField_if.jM][this.jdField_if.ix][this.jdField_if.hZ], (byte)26);
        }
        this.a.cJ.jdField_do = 21;
      }
      else if (i == 2)
      {
        this.jdField_if.a(this.jdField_if.jM, this.jdField_if.ix);
      }
      break;
    case 1: 
      this.jdField_if.jdField_do = 26;
    }
  }
}


/* Location:              D:\OneDrive\游戏\客户端SOT觉醒者 - 副本.jar!\bd.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */