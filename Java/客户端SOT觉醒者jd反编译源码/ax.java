public class ax
{
  h a = null;
  g jdField_if = null;
  
  public ax(h paramh)
  {
    this.a = paramh;
    this.jdField_if = paramh.cJ;
  }
  
  public void a(boolean paramBoolean)
  {
    if ((g.dD != 1) || (g.dZ != 0))
    {
      this.jdField_if.a(27, (short)0, false, 9999);
      return;
    }
    if (!this.a.fI)
    {
      this.jdField_if.a(28, (short)0, false, 9999);
      return;
    }
    if ((this.jdField_if.hD != null) && (this.jdField_if.hD.equals(this.jdField_if.b5)))
    {
      this.jdField_if.a("已锁定偷袭该玩家.", (short)0, false, 9999);
      return;
    }
    if (this.a.cZ.a8)
    {
      this.jdField_if.a(29, (short)0, false, 9999);
      return;
    }
    int i = 0;
    for (int j = 0; j < this.jdField_if.kT; j = (byte)(j + 1)) {
      if (this.jdField_if.iy[j].equals(this.jdField_if.b5))
      {
        if ((!h.M(this.jdField_if.dq[j])) && (!paramBoolean) && ((this.a.cZ.ge != this.jdField_if.mL[j]) || (this.a.cZ.gm != 1)))
        {
          this.jdField_if.a(30, (short)0, false, 9999);
          return;
        }
        if (h.jdMethod_case(this.jdField_if.dq[j]))
        {
          this.jdField_if.a(31, (short)0, false, 9999);
          return;
        }
        if (h.D(this.jdField_if.dq[j]))
        {
          this.jdField_if.a(32, (short)0, false, 9999);
          return;
        }
        i = 1;
        this.jdField_if.kg = this.jdField_if.co[j];
        this.jdField_if.hD = this.jdField_if.b5;
        this.jdField_if.gj = null;
        this.jdField_if.hc = null;
        for (int k = 0; k < this.jdField_if.li.length; k = (byte)(k + 1)) {
          if ((!this.jdField_if.li[k].gq) && (this.jdField_if.li[k].O.equals(this.jdField_if.hD)))
          {
            this.jdField_if.li[k].gq = true;
            break;
          }
        }
        this.jdField_if.bD = null;
        this.jdField_if.bD = new ag(this.a);
        this.jdField_if.bD.jdMethod_if(this.a.b0);
        this.jdField_if.bD.O = this.jdField_if.hD;
        this.jdField_if.bD.fp = 0;
        this.jdField_if.bD.T = false;
        this.jdField_if.bD.ao = false;
        this.jdField_if.bD.hU = false;
        this.jdField_if.bD.a4 = 0;
        this.jdField_if.bD.jdMethod_void(this.jdField_if.eX[j]);
        this.jdField_if.bD.m(this.jdField_if.kf[j]);
        this.jdField_if.bD.fa = this.jdField_if.gT[j];
        this.jdField_if.bD.aP = this.jdField_if.mX[j];
        this.jdField_if.bD.aM = this.jdField_if.mW[j];
        this.jdField_if.bD.dT = this.jdField_if.mX[j];
        this.jdField_if.bD.dS = this.jdField_if.mW[j];
        this.jdField_if.bD.g((byte)0);
        this.jdField_if.bD.eP = null;
        if (1 == h.h(this.jdField_if.dq[j])) {
          this.jdField_if.bD.jdMethod_if((byte)16, 0);
        }
        this.jdField_if.bD.X();
        this.jdField_if.bD.he = h.u(this.jdField_if.dq[j]);
        this.jdField_if.bD.gQ = this.a.a(this.jdField_if.hD);
        this.jdField_if.bD.gk = true;
        this.jdField_if.bD.h4 = h.jdMethod_new(this.jdField_if.dq[j]);
        this.jdField_if.bD.eN = this.jdField_if.gh[j];
        this.jdField_if.bD.eB = this.jdField_if.fy[j];
        this.jdField_if.bD.fj = this.jdField_if.k7[j];
        this.jdField_if.bD.fL = this.jdField_if.mL[j];
        this.jdField_if.bD.hv = this.jdField_if.en[j];
        this.jdField_if.bD.hP = this.jdField_if.jn[j];
        this.jdField_if.bD.hO = this.jdField_if.jm[j];
        this.jdField_if.bD.g4 = this.jdField_if.k9[j];
        this.a.a(this.jdField_if.bD, this.jdField_if.hQ[j]);
        this.jdField_if.bD.es = this.a.jdMethod_if(this.jdField_if.mL[j]);
        this.jdField_if.bD.fx = this.a.jdMethod_try(this.jdField_if.mL[j]);
        for (k = 0; k < a.ad; k = (byte)(k + 1))
        {
          this.jdField_if.bD.a7[k] = this.jdField_if.jC[j][k];
          this.jdField_if.bD.H[k] = a3.a(this.jdField_if.bD.a7[k], a.C);
        }
        this.jdField_if.bD.jdMethod_if((byte)14, this.jdField_if.iD[j]);
        this.jdField_if.bD.jdMethod_if((byte)16, this.jdField_if.fz[j]);
        this.jdField_if.bD.jdMethod_if((byte)20, this.jdField_if.g5[j]);
        this.jdField_if.bD.jdMethod_if((byte)28, this.jdField_if.kA[j]);
        this.jdField_if.bD.jdMethod_if((byte)30, this.jdField_if.dX[j]);
        this.jdField_if.bD.jdMethod_if((byte)32, this.jdField_if.fi[j]);
        this.jdField_if.bD.jdMethod_if((byte)34, this.jdField_if.kJ[j]);
        this.jdField_if.bD.g((byte)0);
        this.jdField_if.jdField_do = 0;
        if (!paramBoolean) {
          break;
        }
        this.a.cZ.a((byte)1, this.a.jdMethod_if((byte)114), 1, true);
        break;
      }
    }
    if (i == 0)
    {
      this.jdField_if.a("该玩家已离开本场景.", (short)0, false, 9999);
      return;
    }
  }
}


/* Location:              D:\OneDrive\游戏\客户端SOT觉醒者 - 副本.jar!\ax.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */