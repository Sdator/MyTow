import java.util.Vector;

class bc
{
  h a = null;
  g jdField_if = null;
  
  public bc(h paramh)
  {
    this.a = paramh;
    this.jdField_if = paramh.cJ;
  }
  
  public void a(byte paramByte)
  {
    switch (paramByte)
    {
    case 0: 
      if (this.jdField_if.d0)
      {
        this.a.cZ.a((byte)1, this.a.jdMethod_if((byte)104), 1, true);
        this.a.cJ.cJ = h.es[this.jdField_if.hZ];
        this.a.cJ.hv = h.aA[this.jdField_if.hZ];
        this.a.cJ.j();
        this.jdField_if.c9 = null;
        this.jdField_if.ip.removeAllElements();
        this.jdField_if.bS.removeAllElements();
      }
      else
      {
        this.a.S.as = h.es[this.jdField_if.hZ];
        this.a.S.l = h.aA[this.jdField_if.hZ];
        this.jdField_if.c9 = null;
        this.jdField_if.ip.removeAllElements();
        this.jdField_if.bS.removeAllElements();
        this.a.S.a(5, this.jdField_if);
      }
      break;
    case 1: 
      this.jdField_if.jdField_do = 26;
    }
  }
}


/* Location:              D:\OneDrive\游戏\客户端SOT觉醒者 - 副本.jar!\bc.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */