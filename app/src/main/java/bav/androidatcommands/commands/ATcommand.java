package bav.androidatcommands.commands;

import android.content.Context;

public class ATcommand implements IATcommand {

    // Constants to check permissions to run command variations.
    public static int CLEAN = 0x1;
    public static int AVAILABLE = 0x2;
    public static int CURRENT = 0x4;
    protected static int DEFAULT_ANSWER_WAIT_TIMEOUT_MS = 50;
    // Command itself (for example "$QCMRUE")
    private String mCommand;
    // Raw answer on pure command (for example "$QCMRUE")
    private String mRawAnswerClean;
    // Raw answer on command with additional characters =? (for example "$QCMRUE=?")
    private String mRawAnswerAvailable;
    // Raw answer on command with additional character ? (for example "$QCMRUE?")
    private String mRawAnswerCurrent;
    // Textual command description
    protected String mDescription;
    // Answer waiting timeout
    private int mTimeout;
    // This field should be initialized within subclass constructor,
    // by CLEAN, AVAILABLE and CURRENT flags.
    protected int mAllowedCommandFormats;

    public ATcommand(String command, int timeout) {
        mCommand = command;
        mTimeout = timeout;
        mRawAnswerClean = mRawAnswerAvailable = mRawAnswerCurrent = "";
        mDescription = "";
        mAllowedCommandFormats = 0;
    }

    public int getAllowedCommandFormats() {
        return mAllowedCommandFormats;
    }

    public String getDescription() {
        return mDescription;
    }

    public String getCommand() {
        return mCommand;
    }

    public int getTimeout() {
        return mTimeout;
    }

    public String getRawAnswerClean() {
        return mRawAnswerClean;
    }

    public String getRawAnswerAvailable() {
        return mRawAnswerAvailable;
    }

    public String getRawAnswerCurrent() {
        return mRawAnswerCurrent;
    }

    public void setRawAnswerClean(String rawAnswerClean) {
        mRawAnswerClean = rawAnswerClean;
    }

    public void setRawAnswerAvailable(String rawAnswerAvailable) {
        mRawAnswerAvailable = rawAnswerAvailable;
    }

    public void setRawAnswerCurrent(String rawAnswerCurrent) {
        mRawAnswerCurrent = rawAnswerCurrent;
    }

    public boolean isRunAllowed(int format) {
        return (mAllowedCommandFormats & format) > 0;
    }

    public static IATcommand getCommand(String cmd, Context ctx) {
        if (cmd.equals("+FDT")) {
            return new AtPlusFDT(ctx);
        } else if (cmd.equals("+CXT")) {
            return new AtPlusCXT(ctx);
        } else if (cmd.equals("+CGDCONT")) {
            return new AtPlusCGDCONT(ctx);
        } else if (cmd.equals("+CGSCONTRDP")) {
            return new AtPlusCGSCONTRDP(ctx);
        } else if (cmd.equals("^MEID")) {
            return new AtCarMEID(ctx);
        } else if (cmd.equals("+CRSM")) {
            return new AtPlusCRSM(ctx);
        } else if (cmd.equals("+FPP")) {
            return new AtPlusFPP(ctx);
        } else if (cmd.equals("$QCCAV")) {
            return new AtDolQCCAV(ctx);
        } else if (cmd.equals("+CMOD")) {
            return new AtPlusCMOD(ctx);
        } else if (cmd.equals("$QCSLOT")) {
            return new AtDolQCSLOT(ctx);
        } else if (cmd.equals("+CGTFT")) {
            return new AtPlusCGTFT(ctx);
        } else if (cmd.equals("+FIT")) {
            return new AtPlusFIT(ctx);
        } else if (cmd.equals("+FNR")) {
            return new AtPlusFNR(ctx);
        } else if (cmd.equals("+FTH")) {
            return new AtPlusFTH(ctx);
        } else if (cmd.equals("+CTZR")) {
            return new AtPlusCTZR(ctx);
        } else if (cmd.equals("^PREFMODE")) {
            return new AtCarPREFMODE(ctx);
        } else if (cmd.equals("+CDIP")) {
            return new AtPlusCDIP(ctx);
        } else if (cmd.equals("+CCUG")) {
            return new AtPlusCCUG(ctx);
        } else if (cmd.equals("+CSAS")) {
            return new AtPlusCSAS(ctx);
        } else if (cmd.equals("+GOI")) {
            return new AtPlusGOI(ctx);
        } else if (cmd.equals("&W")) {
            return new AtAmpW(ctx);
        } else if (cmd.equals("$QCPWRDN")) {
            return new AtDolQCPWRDN(ctx);
        } else if (cmd.equals("+CSCB")) {
            return new AtPlusCSCB(ctx);
        } else if (cmd.equals("+CMGL")) {
            return new AtPlusCMGL(ctx);
        } else if (cmd.equals("+FPW")) {
            return new AtPlusFPW(ctx);
        } else if (cmd.equals("$QCBOOTVER")) {
            return new AtDolQCBOOTVER(ctx);
        } else if (cmd.equals("$QCPINSTAT")) {
            return new AtDolQCPINSTAT(ctx);
        } else if (cmd.equals("$QCMGR")) {
            return new AtDolQCMGR(ctx);
        } else if (cmd.equals("$QCMIPHA")) {
            return new AtDolQCMIPHA(ctx);
        } else if (cmd.equals("+CRLP")) {
            return new AtPlusCRLP(ctx);
        } else if (cmd.equals("$QCRPW")) {
            return new AtDolQCRPW(ctx);
        } else if (cmd.equals("+FFC")) {
            return new AtPlusFFC(ctx);
        } else if (cmd.equals("+MR")) {
            return new AtPlusMR(ctx);
        } else if (cmd.equals("^GSN")) {
            return new AtCarGSN(ctx);
        } else if (cmd.equals("V")) {
            return new AtV(ctx);
        } else if (cmd.equals("+FPS")) {
            return new AtPlusFPS(ctx);
        } else if (cmd.equals("$BREW")) {
            return new AtDolBREW(ctx);
        } else if (cmd.equals("Q")) {
            return new AtQ(ctx);
        } else if (cmd.equals("$QCSO")) {
            return new AtDolQCSO(ctx);
        } else if (cmd.equals("+CPIN")) {
            return new AtPlusCPIN(ctx);
        } else if (cmd.equals("+CMSS")) {
            return new AtPlusCMSS(ctx);
        } else if (cmd.equals("+CGTFTRDP")) {
            return new AtPlusCGTFTRDP(ctx);
        } else if (cmd.equals("+FAR")) {
            return new AtPlusFAR(ctx);
        } else if (cmd.equals("+CGSMS")) {
            return new AtPlusCGSMS(ctx);
        } else if (cmd.equals("$QCBANDPREF")) {
            return new AtDolQCBANDPREF(ctx);
        } else if (cmd.equals("$QCPBMPREF")) {
            return new AtDolQCPBMPREF(ctx);
        } else if (cmd.equals("+CVMOD")) {
            return new AtPlusCVMOD(ctx);
        } else if (cmd.equals("+FRQ")) {
            return new AtPlusFRQ(ctx);
        } else if (cmd.equals("+FBO")) {
            return new AtPlusFBO(ctx);
        } else if (cmd.equals("+CTFR")) {
            return new AtPlusCTFR(ctx);
        } else if (cmd.equals("$QCMGS")) {
            return new AtDolQCMGS(ctx);
        } else if (cmd.equals("$QCMIPPHA")) {
            return new AtDolQCMIPPHA(ctx);
        } else if (cmd.equals("+CGPIAF")) {
            return new AtPlusCGPIAF(ctx);
        } else if (cmd.equals("+CGCONTRDP")) {
            return new AtPlusCGCONTRDP(ctx);
        } else if (cmd.equals("$QCPDPP")) {
            return new AtDolQCPDPP(ctx);
        } else if (cmd.equals("$CCLK")) {
            return new AtDolCCLK(ctx);
        } else if (cmd.equals("+CHUP")) {
            return new AtPlusCHUP(ctx);
        } else if (cmd.equals("+CR")) {
            return new AtPlusCR(ctx);
        } else if (cmd.equals("+CMUX")) {
            return new AtPlusCMUX(ctx);
        } else if (cmd.equals("+CMGW")) {
            return new AtPlusCMGW(ctx);
        } else if (cmd.equals("S2")) {
            return new AtS2(ctx);
        } else if (cmd.equals("+CMGF")) {
            return new AtPlusCMGF(ctx);
        } else if (cmd.equals("+FLO")) {
            return new AtPlusFLO(ctx);
        } else if (cmd.equals("S8")) {
            return new AtS8(ctx);
        } else if (cmd.equals("+CSQ")) {
            return new AtPlusCSQ(ctx);
        } else if (cmd.equals("+CMGD")) {
            return new AtPlusCMGD(ctx);
        } else if (cmd.equals("S11")) {
            return new AtS11(ctx);
        } else if (cmd.equals("+FCT")) {
            return new AtPlusFCT(ctx);
        } else if (cmd.equals("+EFCS")) {
            return new AtPlusEFCS(ctx);
        } else if (cmd.equals("$QCNMI")) {
            return new AtDolQCNMI(ctx);
        } else if (cmd.equals("&C")) {
            return new AtAmpC(ctx);
        } else if (cmd.equals("+CSTA")) {
            return new AtPlusCSTA(ctx);
        } else if (cmd.equals("^VOLT")) {
            return new AtCarVOLT(ctx);
        } else if (cmd.equals("$QCCHV")) {
            return new AtDolQCCHV(ctx);
        } else if (cmd.equals("+CRES")) {
            return new AtPlusCRES(ctx);
        } else if (cmd.equals("+FDD")) {
            return new AtPlusFDD(ctx);
        } else if (cmd.equals("$QCMDR")) {
            return new AtDolQCMDR(ctx);
        } else if (cmd.equals("+FCR")) {
            return new AtPlusFCR(ctx);
        } else if (cmd.equals("+CGDSCONT")) {
            return new AtPlusCGDSCONT(ctx);
        } else if (cmd.equals("+COLP")) {
            return new AtPlusCOLP(ctx);
        } else if (cmd.equals("$QCMIPP")) {
            return new AtDolQCMIPP(ctx);
        } else if (cmd.equals("$QCDNSS")) {
            return new AtDolQCDNSS(ctx);
        } else if (cmd.equals("$QCATMOD")) {
            return new AtDolQCATMOD(ctx);
        } else if (cmd.equals("&E")) {
            return new AtAmpE(ctx);
        } else if (cmd.equals("+QCIMI")) {
            return new AtPlusQCIMI(ctx);
        } else if (cmd.equals("+GCAP")) {
            return new AtPlusGCAP(ctx);
        } else if (cmd.equals("S7")) {
            return new AtS7(ctx);
        } else if (cmd.equals("+CEN")) {
            return new AtPlusCEN(ctx);
        } else if (cmd.equals("+FLP")) {
            return new AtPlusFLP(ctx);
        } else if (cmd.equals("+FBU")) {
            return new AtPlusFBU(ctx);
        } else if (cmd.equals("+CGQMIN")) {
            return new AtPlusCGQMIN(ctx);
        } else if (cmd.equals("$QCMIPSHA")) {
            return new AtDolQCMIPSHA(ctx);
        } else if (cmd.equals("+CEAP")) {
            return new AtPlusCEAP(ctx);
        } else if (cmd.equals("+CPBF")) {
            return new AtPlusCPBF(ctx);
        } else if (cmd.equals("$QCMGF")) {
            return new AtDolQCMGF(ctx);
        } else if (cmd.equals("$QCCLR")) {
            return new AtDolQCCLR(ctx);
        } else if (cmd.equals("$QCSIMSTAT")) {
            return new AtDolQCSIMSTAT(ctx);
        } else if (cmd.equals("+CPBW")) {
            return new AtPlusCPBW(ctx);
        } else if (cmd.equals("+CLCK")) {
            return new AtPlusCLCK(ctx);
        } else if (cmd.equals("$QCMGW")) {
            return new AtDolQCMGW(ctx);
        } else if (cmd.equals("+FBS")) {
            return new AtPlusFBS(ctx);
        } else if (cmd.equals("+ESR")) {
            return new AtPlusESR(ctx);
        } else if (cmd.equals("$QCMGL")) {
            return new AtDolQCMGL(ctx);
        } else if (cmd.equals("+FSP")) {
            return new AtPlusFSP(ctx);
        } else if (cmd.equals("$QCSIMAPP")) {
            return new AtDolQCSIMAPP(ctx);
        } else if (cmd.equals("+ER")) {
            return new AtPlusER(ctx);
        } else if (cmd.equals("+FPA")) {
            return new AtPlusFPA(ctx);
        } else if (cmd.equals("+MA")) {
            return new AtPlusMA(ctx);
        } else if (cmd.equals("&F")) {
            return new AtAmpF(ctx);
        } else if (cmd.equals("+CPBS")) {
            return new AtPlusCPBS(ctx);
        } else if (cmd.equals("$QCMGD")) {
            return new AtDolQCMGD(ctx);
        } else if (cmd.equals("+FAP")) {
            return new AtPlusFAP(ctx);
        } else if (cmd.equals("+CCLK")) {
            return new AtPlusCCLK(ctx);
        } else if (cmd.equals("+CPWD")) {
            return new AtPlusCPWD(ctx);
        } else if (cmd.equals("+CGEQOS")) {
            return new AtPlusCGEQOS(ctx);
        } else if (cmd.equals("O")) {
            return new AtO(ctx);
        } else if (cmd.equals("$QCMIPGETP")) {
            return new AtDolQCMIPGETP(ctx);
        } else if (cmd.equals("+WS46")) {
            return new AtPlusWS46(ctx);
        } else if (cmd.equals("+GMM")) {
            return new AtPlusGMM(ctx);
        } else if (cmd.equals("^RESET")) {
            return new AtCarRESET(ctx);
        } else if (cmd.equals("+CBIP")) {
            return new AtPlusCBIP(ctx);
        } else if (cmd.equals("S30")) {
            return new AtS30(ctx);
        } else if (cmd.equals("S10")) {
            return new AtS10(ctx);
        } else if (cmd.equals("$QCVOLT")) {
            return new AtDolQCVOLT(ctx);
        } else if (cmd.equals("S103")) {
            return new AtS103(ctx);
        } else if (cmd.equals("+FKS")) {
            return new AtPlusFKS(ctx);
        } else if (cmd.equals("+QCPWD")) {
            return new AtPlusQCPWD(ctx);
        } else if (cmd.equals("+CSCA")) {
            return new AtPlusCSCA(ctx);
        } else if (cmd.equals("+CEER")) {
            return new AtPlusCEER(ctx);
        } else if (cmd.equals("+CHV")) {
            return new AtPlusCHV(ctx);
        } else if (cmd.equals("+CRC")) {
            return new AtPlusCRC(ctx);
        } else if (cmd.equals("&D")) {
            return new AtAmpD(ctx);
        } else if (cmd.equals("+FLI")) {
            return new AtPlusFLI(ctx);
        } else if (cmd.equals("S4")) {
            return new AtS4(ctx);
        } else if (cmd.equals("+CSIM")) {
            return new AtPlusCSIM(ctx);
        } else if (cmd.equals("$QCHDRC")) {
            return new AtDolQCHDRC(ctx);
        } else if (cmd.equals("*CNTI")) {
            return new AtStarCNTI(ctx);
        } else if (cmd.equals("+CERP")) {
            return new AtPlusCERP(ctx);
        } else if (cmd.equals("A")) {
            return new AtA(ctx);
        } else if (cmd.equals("+IFC")) {
            return new AtPlusIFC(ctx);
        } else if (cmd.equals("M")) {
            return new AtM(ctx);
        } else if (cmd.equals("+QCLCK")) {
            return new AtPlusQCLCK(ctx);
        } else if (cmd.equals("+CDS")) {
            return new AtPlusCDS(ctx);
        } else if (cmd.equals("$QCCTM")) {
            return new AtDolQCCTM(ctx);
        } else if (cmd.equals("+CSMS")) {
            return new AtPlusCSMS(ctx);
        } else if (cmd.equals("$QCCHS")) {
            return new AtDolQCCHS(ctx);
        } else if (cmd.equals("+FCC")) {
            return new AtPlusFCC(ctx);
        } else if (cmd.equals("+CMEE")) {
            return new AtPlusCMEE(ctx);
        } else if (cmd.equals("+CGCMOD")) {
            return new AtPlusCGCMOD(ctx);
        } else if (cmd.equals("+CNMI")) {
            return new AtPlusCNMI(ctx);
        } else if (cmd.equals("I")) {
            return new AtI(ctx);
        } else if (cmd.equals("^CPIN")) {
            return new AtCarCPIN(ctx);
        } else if (cmd.equals("+CGMR")) {
            return new AtPlusCGMR(ctx);
        } else if (cmd.equals("+CMIP")) {
            return new AtPlusCMIP(ctx);
        } else if (cmd.equals("+CHLD")) {
            return new AtPlusCHLD(ctx);
        } else if (cmd.equals("$QCMIPMASSX")) {
            return new AtDolQCMIPMASSX(ctx);
        } else if (cmd.equals("+CBC")) {
            return new AtPlusCBC(ctx);
        } else if (cmd.equals("$QCHDRET")) {
            return new AtDolQCHDRET(ctx);
        } else if (cmd.equals("\\S")) {
            return new AtSlaS(ctx);
        } else if (cmd.equals("$QCOTC")) {
            return new AtDolQCOTC(ctx);
        } else if (cmd.equals("$QCPDPLT")) {
            return new AtDolQCPDPLT(ctx);
        } else if (cmd.equals("\\V")) {
            return new AtSlaV(ctx);
        } else if (cmd.equals("+CGEQREQ")) {
            return new AtPlusCGEQREQ(ctx);
        } else if (cmd.equals("+FIE")) {
            return new AtPlusFIE(ctx);
        } else if (cmd.equals("+CMMS")) {
            return new AtPlusCMMS(ctx);
        } else if (cmd.equals("$QCDNSP")) {
            return new AtDolQCDNSP(ctx);
        } else if (cmd.equals("+CNMA")) {
            return new AtPlusCNMA(ctx);
        } else if (cmd.equals("+PACSP")) {
            return new AtPlusPACSP(ctx);
        } else if (cmd.equals("+CFC")) {
            return new AtPlusCFC(ctx);
        } else if (cmd.equals("+CMGC")) {
            return new AtPlusCMGC(ctx);
        } else if (cmd.equals("+VTS")) {
            return new AtPlusVTS(ctx);
        } else if (cmd.equals("$QCMIPEP")) {
            return new AtDolQCMIPEP(ctx);
        } else if (cmd.equals("S3")) {
            return new AtS3(ctx);
        } else if (cmd.equals("+CCWA")) {
            return new AtPlusCCWA(ctx);
        } else if (cmd.equals("+FRY")) {
            return new AtPlusFRY(ctx);
        } else if (cmd.equals("+CGPADDR")) {
            return new AtPlusCGPADDR(ctx);
        } else if (cmd.equals("$QCDMR")) {
            return new AtDolQCDMR(ctx);
        } else if (cmd.equals("+FDR")) {
            return new AtPlusFDR(ctx);
        } else if (cmd.equals("+MS")) {
            return new AtPlusMS(ctx);
        } else if (cmd.equals("$QCSMP")) {
            return new AtDolQCSMP(ctx);
        } else if (cmd.equals("$QCAPNE")) {
            return new AtDolQCAPNE(ctx);
        } else if (cmd.equals("$CSQ")) {
            return new AtDolCSQ(ctx);
        } else if (cmd.equals("+CREG")) {
            return new AtPlusCREG(ctx);
        } else if (cmd.equals("T")) {
            return new AtT(ctx);
        } else if (cmd.equals("+PZID")) {
            return new AtPlusPZID(ctx);
        } else if (cmd.equals("+CPOL")) {
            return new AtPlusCPOL(ctx);
        } else if (cmd.equals("+CGMM")) {
            return new AtPlusCGMM(ctx);
        } else if (cmd.equals("+ILRR")) {
            return new AtPlusILRR(ctx);
        } else if (cmd.equals("+CSTF")) {
            return new AtPlusCSTF(ctx);
        } else if (cmd.equals("+ETBM")) {
            return new AtPlusETBM(ctx);
        } else if (cmd.equals("+CHV0")) {
            return new AtPlusCHV0(ctx);
        } else if (cmd.equals("+GMR")) {
            return new AtPlusGMR(ctx);
        } else if (cmd.equals("+CFG")) {
            return new AtPlusCFG(ctx);
        } else if (cmd.equals("+DR")) {
            return new AtPlusDR(ctx);
        } else if (cmd.equals("$QCDRX")) {
            return new AtDolQCDRX(ctx);
        } else if (cmd.equals("+CSSN")) {
            return new AtPlusCSSN(ctx);
        } else if (cmd.equals("+CTZU")) {
            return new AtPlusCTZU(ctx);
        } else if (cmd.equals("+FIS")) {
            return new AtPlusFIS(ctx);
        } else if (cmd.equals("+CQD")) {
            return new AtPlusCQD(ctx);
        } else if (cmd.equals("+FPI")) {
            return new AtPlusFPI(ctx);
        } else if (cmd.equals("S6")) {
            return new AtS6(ctx);
        } else if (cmd.equals("+EB")) {
            return new AtPlusEB(ctx);
        } else if (cmd.equals("^CARDMODE")) {
            return new AtCarCARDMODE(ctx);
        } else if (cmd.equals("+FRH")) {
            return new AtPlusFRH(ctx);
        } else if (cmd.equals("+MV18R")) {
            return new AtPlusMV18R(ctx);
        } else if (cmd.equals("+FCLASS")) {
            return new AtPlusFCLASS(ctx);
        } else if (cmd.equals("+GMI")) {
            return new AtPlusGMI(ctx);
        } else if (cmd.equals("+CBST")) {
            return new AtPlusCBST(ctx);
        } else if (cmd.equals("$QCMIPNAI")) {
            return new AtDolQCMIPNAI(ctx);
        } else if (cmd.equals("+FAA")) {
            return new AtPlusFAA(ctx);
        } else if (cmd.equals("+CLAC")) {
            return new AtPlusCLAC(ctx);
        } else if (cmd.equals("$QCQOSPRI")) {
            return new AtDolQCQOSPRI(ctx);
        } else if (cmd.equals("+CUSD")) {
            return new AtPlusCUSD(ctx);
        } else if (cmd.equals("^SYSCONFIG")) {
            return new AtCarSYSCONFIG(ctx);
        } else if (cmd.equals("D")) {
            return new AtD(ctx);
        } else if (cmd.equals("P")) {
            return new AtP(ctx);
        } else if (cmd.equals("$QCPDPCFGE")) {
            return new AtDolQCPDPCFGE(ctx);
        } else if (cmd.equals("+CGSN")) {
            return new AtPlusCGSN(ctx);
        } else if (cmd.equals("+CVHU")) {
            return new AtPlusCVHU(ctx);
        } else if (cmd.equals("+MV18S")) {
            return new AtPlusMV18S(ctx);
        } else if (cmd.equals("$QCCNMI")) {
            return new AtDolQCCNMI(ctx);
        } else if (cmd.equals("&S")) {
            return new AtAmpS(ctx);
        } else if (cmd.equals("+IPR")) {
            return new AtPlusIPR(ctx);
        } else if (cmd.equals("+FHS")) {
            return new AtPlusFHS(ctx);
        } else if (cmd.equals("+CEREG")) {
            return new AtPlusCEREG(ctx);
        } else if (cmd.equals("$QCTRTL")) {
            return new AtDolQCTRTL(ctx);
        } else if (cmd.equals("+CGEREP")) {
            return new AtPlusCGEREP(ctx);
        } else if (cmd.equals("+ICF")) {
            return new AtPlusICF(ctx);
        } else if (cmd.equals("$QCPREV")) {
            return new AtDolQCPREV(ctx);
        } else if (cmd.equals("+CSMP")) {
            return new AtPlusCSMP(ctx);
        } else if (cmd.equals("^SPN")) {
            return new AtCarSPN(ctx);
        } else if (cmd.equals("+CSDH")) {
            return new AtPlusCSDH(ctx);
        } else if (cmd.equals("+CGCLASS")) {
            return new AtPlusCGCLASS(ctx);
        } else if (cmd.equals("+CCSQ")) {
            return new AtPlusCCSQ(ctx);
        } else if (cmd.equals("+CIND")) {
            return new AtPlusCIND(ctx);
        } else if (cmd.equals("L")) {
            return new AtL(ctx);
        } else if (cmd.equals("+FCQ")) {
            return new AtPlusFCQ(ctx);
        } else if (cmd.equals("$QCMIPMASS")) {
            return new AtDolQCMIPMASS(ctx);
        } else if (cmd.equals("+COPS")) {
            return new AtPlusCOPS(ctx);
        } else if (cmd.equals("+CGDATA")) {
            return new AtPlusCGDATA(ctx);
        } else if (cmd.equals("$QCMRUE")) {
            return new AtDolQCMRUE(ctx);
        } else if (cmd.equals("$QCMIPT")) {
            return new AtDolQCMIPT(ctx);
        } else if (cmd.equals("+CDR")) {
            return new AtPlusCDR(ctx);
        } else if (cmd.equals("$QCMIPMHSSX")) {
            return new AtDolQCMIPMHSSX(ctx);
        } else if (cmd.equals("+CCFC")) {
            return new AtPlusCCFC(ctx);
        } else if (cmd.equals("+CV120")) {
            return new AtPlusCV120(ctx);
        } else if (cmd.equals("\\Q")) {
            return new AtSlaQ(ctx);
        } else if (cmd.equals("^DSCI")) {
            return new AtCarDSCI(ctx);
        } else if (cmd.equals("+CLCC")) {
            return new AtPlusCLCC(ctx);
        } else if (cmd.equals("+FRM")) {
            return new AtPlusFRM(ctx);
        } else if (cmd.equals("+CPBR")) {
            return new AtPlusCPBR(ctx);
        } else if (cmd.equals("$QCMRUC")) {
            return new AtDolQCMRUC(ctx);
        } else if (cmd.equals("+DS")) {
            return new AtPlusDS(ctx);
        } else if (cmd.equals("H")) {
            return new AtH(ctx);
        } else if (cmd.equals("+CUAD")) {
            return new AtPlusCUAD(ctx);
        } else if (cmd.equals("+FNS")) {
            return new AtPlusFNS(ctx);
        } else if (cmd.equals("+FTS")) {
            return new AtPlusFTS(ctx);
        } else if (cmd.equals("$QCHDRT")) {
            return new AtDolQCHDRT(ctx);
        } else if (cmd.equals("+ESA")) {
            return new AtPlusESA(ctx);
        } else if (cmd.equals("$QCRMCALL")) {
            return new AtDolQCRMCALL(ctx);
        } else if (cmd.equals("^SYSINFO")) {
            return new AtCarSYSINFO(ctx);
        } else if (cmd.equals("$QCANTE")) {
            return new AtDolQCANTE(ctx);
        } else if (cmd.equals("+FCL")) {
            return new AtPlusFCL(ctx);
        } else if (cmd.equals("+CDV")) {
            return new AtPlusCDV(ctx);
        } else if (cmd.equals("$QCSYSMODE")) {
            return new AtDolQCSYSMODE(ctx);
        } else if (cmd.equals("$QCRSRQ")) {
            return new AtDolQCRSRQ(ctx);
        } else if (cmd.equals("+CMGR")) {
            return new AtPlusCMGR(ctx);
        } else if (cmd.equals("+QCCSS")) {
            return new AtPlusQCCSS(ctx);
        } else if (cmd.equals("+CLIP")) {
            return new AtPlusCLIP(ctx);
        } else if (cmd.equals("$QCTER")) {
            return new AtDolQCTER(ctx);
        } else if (cmd.equals("Z")) {
            return new AtZ(ctx);
        } else if (cmd.equals("+FIP")) {
            return new AtPlusFIP(ctx);
        } else if (cmd.equals("$QCMIPMHSS")) {
            return new AtDolQCMIPMHSS(ctx);
        } else if (cmd.equals("+COPN")) {
            return new AtPlusCOPN(ctx);
        } else if (cmd.equals("$QCMSS")) {
            return new AtDolQCMSS(ctx);
        } else if (cmd.equals("+CPLS")) {
            return new AtPlusCPLS(ctx);
        } else if (cmd.equals("%V")) {
            return new AtPerV(ctx);
        } else if (cmd.equals("+CACM")) {
            return new AtPlusCACM(ctx);
        } else if (cmd.equals("+CGATT")) {
            return new AtPlusCGATT(ctx);
        } else if (cmd.equals("+MDN")) {
            return new AtPlusMDN(ctx);
        } else if (cmd.equals("+FTM")) {
            return new AtPlusFTM(ctx);
        } else if (cmd.equals("+CAOC")) {
            return new AtPlusCAOC(ctx);
        } else if (cmd.equals("+CAD")) {
            return new AtPlusCAD(ctx);
        } else if (cmd.equals("S9")) {
            return new AtS9(ctx);
        } else if (cmd.equals("+FEA")) {
            return new AtPlusFEA(ctx);
        } else if (cmd.equals("+CCRC")) {
            return new AtPlusCCRC(ctx);
        } else if (cmd.equals("$QCSQ")) {
            return new AtDolQCSQ(ctx);
        } else if (cmd.equals("+CIMI")) {
            return new AtPlusCIMI(ctx);
        } else if (cmd.equals("+CSDF")) {
            return new AtPlusCSDF(ctx);
        } else if (cmd.equals("$QCMIPRT")) {
            return new AtDolQCMIPRT(ctx);
        } else if (cmd.equals("+GSN")) {
            return new AtPlusGSN(ctx);
        } else if (cmd.equals("+CGREG")) {
            return new AtPlusCGREG(ctx);
        } else if (cmd.equals("$QCVAD")) {
            return new AtDolQCVAD(ctx);
        } else if (cmd.equals("$QCMIPMASPI")) {
            return new AtDolQCMIPMASPI(ctx);
        } else if (cmd.equals("+FRS")) {
            return new AtPlusFRS(ctx);
        } else if (cmd.equals("+CTA")) {
            return new AtPlusCTA(ctx);
        } else if (cmd.equals("+CGQREQ")) {
            return new AtPlusCGQREQ(ctx);
        } else if (cmd.equals("+CMGS")) {
            return new AtPlusCMGS(ctx);
        } else if (cmd.equals("+CFUN")) {
            return new AtPlusCFUN(ctx);
        } else if (cmd.equals("+CLIR")) {
            return new AtPlusCLIR(ctx);
        } else if (cmd.equals("S104")) {
            return new AtS104(ctx);
        } else if (cmd.equals("$QCHDRR")) {
            return new AtDolQCHDRR(ctx);
        } else if (cmd.equals("+CNUM")) {
            return new AtPlusCNUM(ctx);
        } else if (cmd.equals("+FPR")) {
            return new AtPlusFPR(ctx);
        } else if (cmd.equals("+CRM")) {
            return new AtPlusCRM(ctx);
        } else if (cmd.equals("+CGEQMIN")) {
            return new AtPlusCGEQMIN(ctx);
        } else if (cmd.equals("$QCMIP")) {
            return new AtDolQCMIP(ctx);
        } else if (cmd.equals("&V")) {
            return new AtAmpV(ctx);
        } else if (cmd.equals("+CEMODE")) {
            return new AtPlusCEMODE(ctx);
        } else if (cmd.equals("X")) {
            return new AtX(ctx);
        } else if (cmd.equals("+CGACT")) {
            return new AtPlusCGACT(ctx);
        } else if (cmd.equals("$QCCLAC")) {
            return new AtDolQCCLAC(ctx);
        } else if (cmd.equals("+ICCID")) {
            return new AtPlusICCID(ctx);
        } else if (cmd.equals("+CSCS")) {
            return new AtPlusCSCS(ctx);
        } else if (cmd.equals("+CMEC")) {
            return new AtPlusCMEC(ctx);
        } else if (cmd.equals("$QCPMS")) {
            return new AtDolQCPMS(ctx);
        } else if (cmd.equals("$QCQNC")) {
            return new AtDolQCQNC(ctx);
        } else if (cmd.equals("+CGEQOSRDP")) {
            return new AtPlusCGEQOSRDP(ctx);
        } else if (cmd.equals("$QCHWREV")) {
            return new AtDolQCHWREV(ctx);
        } else if (cmd.equals("+CAMM")) {
            return new AtPlusCAMM(ctx);
        } else if (cmd.equals("+CPUC")) {
            return new AtPlusCPUC(ctx);
        } else if (cmd.equals("$QCPDPIMSCFGE")) {
            return new AtDolQCPDPIMSCFGE(ctx);
        } else if (cmd.equals("$QCRSRP")) {
            return new AtDolQCRSRP(ctx);
        } else if (cmd.equals("$QCDGEN")) {
            return new AtDolQCDGEN(ctx);
        } else if (cmd.equals("+CHSN")) {
            return new AtPlusCHSN(ctx);
        } else if (cmd.equals("E")) {
            return new AtE(ctx);
        } else if (cmd.equals("+CMER")) {
            return new AtPlusCMER(ctx);
        } else if (cmd.equals("+CGMI")) {
            return new AtPlusCGMI(ctx);
        } else if (cmd.equals("^CGSN")) {
            return new AtCarCGSN(ctx);
        } else if (cmd.equals("$QCMIPMHSPI")) {
            return new AtDolQCMIPMHSPI(ctx);
        } else if (cmd.equals("S5")) {
            return new AtS5(ctx);
        } else if (cmd.equals("^HDRCSQ")) {
            return new AtCarHDRCSQ(ctx);
        } else if (cmd.equals("$QCSCRM")) {
            return new AtDolQCSCRM(ctx);
        } else if (cmd.equals("+FMS")) {
            return new AtPlusFMS(ctx);
        } else if (cmd.equals("S0")) {
            return new AtS0(ctx);
        } else if (cmd.equals("+CPAS")) {
            return new AtPlusCPAS(ctx);
        } else if (cmd.equals("$CREG")) {
            return new AtDolCREG(ctx);
        } else if (cmd.equals("+FSA")) {
            return new AtPlusFSA(ctx);
        } else if (cmd.equals("$QCDEFPROF")) {
            return new AtDolQCDEFPROF(ctx);
        } else if (cmd.equals("+CPMS")) {
            return new AtPlusCPMS(ctx);
        } else if (cmd.equals("^HWVER")) {
            return new AtCarHWVER(ctx);
        } else if (cmd.equals("+ES")) {
            return new AtPlusES(ctx);
        } else if (cmd.equals("+QCPIN")) {
            return new AtPlusQCPIN(ctx);
        }
        return null;
    }
}
