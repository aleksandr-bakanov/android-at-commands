package bav.androidatcommands.commands;

public class ATcommand implements IATcommand {

    protected static int DEFAULT_ANSWER_WAIT_TIMEOUT_MS = 20;
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

    public ATcommand(String command, int timeout) {
        mCommand = command;
        mTimeout = timeout;
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

    public static IATcommand getCommand(String cmd) {
        if (cmd.equals("+FDT")) {
            return new AtPlusFDT();
        } else if (cmd.equals("+CXT")) {
            return new AtPlusCXT();
        } else if (cmd.equals("+CGDCONT")) {
            return new AtPlusCGDCONT();
        } else if (cmd.equals("+CGSCONTRDP")) {
            return new AtPlusCGSCONTRDP();
        } else if (cmd.equals("^MEID")) {
            return new AtCarMEID();
        } else if (cmd.equals("+CRSM")) {
            return new AtPlusCRSM();
        } else if (cmd.equals("+FPP")) {
            return new AtPlusFPP();
        } else if (cmd.equals("$QCCAV")) {
            return new AtDolQCCAV();
        } else if (cmd.equals("+CMOD")) {
            return new AtPlusCMOD();
        } else if (cmd.equals("$QCSLOT")) {
            return new AtDolQCSLOT();
        } else if (cmd.equals("+CGTFT")) {
            return new AtPlusCGTFT();
        } else if (cmd.equals("+FIT")) {
            return new AtPlusFIT();
        } else if (cmd.equals("+FNR")) {
            return new AtPlusFNR();
        } else if (cmd.equals("+FTH")) {
            return new AtPlusFTH();
        } else if (cmd.equals("+CTZR")) {
            return new AtPlusCTZR();
        } else if (cmd.equals("^PREFMODE")) {
            return new AtCarPREFMODE();
        } else if (cmd.equals("+CDIP")) {
            return new AtPlusCDIP();
        } else if (cmd.equals("+CCUG")) {
            return new AtPlusCCUG();
        } else if (cmd.equals("+CSAS")) {
            return new AtPlusCSAS();
        } else if (cmd.equals("+GOI")) {
            return new AtPlusGOI();
        } else if (cmd.equals("&W")) {
            return new AtAmpW();
        } else if (cmd.equals("$QCPWRDN")) {
            return new AtDolQCPWRDN();
        } else if (cmd.equals("+CSCB")) {
            return new AtPlusCSCB();
        } else if (cmd.equals("+CMGL")) {
            return new AtPlusCMGL();
        } else if (cmd.equals("+FPW")) {
            return new AtPlusFPW();
        } else if (cmd.equals("$QCBOOTVER")) {
            return new AtDolQCBOOTVER();
        } else if (cmd.equals("$QCPINSTAT")) {
            return new AtDolQCPINSTAT();
        } else if (cmd.equals("$QCMGR")) {
            return new AtDolQCMGR();
        } else if (cmd.equals("$QCMIPHA")) {
            return new AtDolQCMIPHA();
        } else if (cmd.equals("+CRLP")) {
            return new AtPlusCRLP();
        } else if (cmd.equals("$QCRPW")) {
            return new AtDolQCRPW();
        } else if (cmd.equals("+FFC")) {
            return new AtPlusFFC();
        } else if (cmd.equals("+MR")) {
            return new AtPlusMR();
        } else if (cmd.equals("^GSN")) {
            return new AtCarGSN();
        } else if (cmd.equals("V")) {
            return new AtV();
        } else if (cmd.equals("+FPS")) {
            return new AtPlusFPS();
        } else if (cmd.equals("$BREW")) {
            return new AtDolBREW();
        } else if (cmd.equals("Q")) {
            return new AtQ();
        } else if (cmd.equals("$QCSO")) {
            return new AtDolQCSO();
        } else if (cmd.equals("+CPIN")) {
            return new AtPlusCPIN();
        } else if (cmd.equals("+CMSS")) {
            return new AtPlusCMSS();
        } else if (cmd.equals("+CGTFTRDP")) {
            return new AtPlusCGTFTRDP();
        } else if (cmd.equals("+FAR")) {
            return new AtPlusFAR();
        } else if (cmd.equals("+CGSMS")) {
            return new AtPlusCGSMS();
        } else if (cmd.equals("$QCBANDPREF")) {
            return new AtDolQCBANDPREF();
        } else if (cmd.equals("$QCPBMPREF")) {
            return new AtDolQCPBMPREF();
        } else if (cmd.equals("+CVMOD")) {
            return new AtPlusCVMOD();
        } else if (cmd.equals("+FRQ")) {
            return new AtPlusFRQ();
        } else if (cmd.equals("+FBO")) {
            return new AtPlusFBO();
        } else if (cmd.equals("+CTFR")) {
            return new AtPlusCTFR();
        } else if (cmd.equals("$QCMGS")) {
            return new AtDolQCMGS();
        } else if (cmd.equals("$QCMIPPHA")) {
            return new AtDolQCMIPPHA();
        } else if (cmd.equals("+CGPIAF")) {
            return new AtPlusCGPIAF();
        } else if (cmd.equals("+CGCONTRDP")) {
            return new AtPlusCGCONTRDP();
        } else if (cmd.equals("$QCPDPP")) {
            return new AtDolQCPDPP();
        } else if (cmd.equals("$CCLK")) {
            return new AtDolCCLK();
        } else if (cmd.equals("+CHUP")) {
            return new AtPlusCHUP();
        } else if (cmd.equals("+CR")) {
            return new AtPlusCR();
        } else if (cmd.equals("+CMUX")) {
            return new AtPlusCMUX();
        } else if (cmd.equals("+CMGW")) {
            return new AtPlusCMGW();
        } else if (cmd.equals("S2")) {
            return new AtS2();
        } else if (cmd.equals("+CMGF")) {
            return new AtPlusCMGF();
        } else if (cmd.equals("+FLO")) {
            return new AtPlusFLO();
        } else if (cmd.equals("S8")) {
            return new AtS8();
        } else if (cmd.equals("+CSQ")) {
            return new AtPlusCSQ();
        } else if (cmd.equals("+CMGD")) {
            return new AtPlusCMGD();
        } else if (cmd.equals("S11")) {
            return new AtS11();
        } else if (cmd.equals("+FCT")) {
            return new AtPlusFCT();
        } else if (cmd.equals("+EFCS")) {
            return new AtPlusEFCS();
        } else if (cmd.equals("$QCNMI")) {
            return new AtDolQCNMI();
        } else if (cmd.equals("&C")) {
            return new AtAmpC();
        } else if (cmd.equals("+CSTA")) {
            return new AtPlusCSTA();
        } else if (cmd.equals("^VOLT")) {
            return new AtCarVOLT();
        } else if (cmd.equals("$QCCHV")) {
            return new AtDolQCCHV();
        } else if (cmd.equals("+CRES")) {
            return new AtPlusCRES();
        } else if (cmd.equals("+FDD")) {
            return new AtPlusFDD();
        } else if (cmd.equals("$QCMDR")) {
            return new AtDolQCMDR();
        } else if (cmd.equals("+FCR")) {
            return new AtPlusFCR();
        } else if (cmd.equals("+CGDSCONT")) {
            return new AtPlusCGDSCONT();
        } else if (cmd.equals("+COLP")) {
            return new AtPlusCOLP();
        } else if (cmd.equals("$QCMIPP")) {
            return new AtDolQCMIPP();
        } else if (cmd.equals("$QCDNSS")) {
            return new AtDolQCDNSS();
        } else if (cmd.equals("$QCATMOD")) {
            return new AtDolQCATMOD();
        } else if (cmd.equals("&E")) {
            return new AtAmpE();
        } else if (cmd.equals("+QCIMI")) {
            return new AtPlusQCIMI();
        } else if (cmd.equals("+GCAP")) {
            return new AtPlusGCAP();
        } else if (cmd.equals("S7")) {
            return new AtS7();
        } else if (cmd.equals("+CEN")) {
            return new AtPlusCEN();
        } else if (cmd.equals("+FLP")) {
            return new AtPlusFLP();
        } else if (cmd.equals("+FBU")) {
            return new AtPlusFBU();
        } else if (cmd.equals("+CGQMIN")) {
            return new AtPlusCGQMIN();
        } else if (cmd.equals("$QCMIPSHA")) {
            return new AtDolQCMIPSHA();
        } else if (cmd.equals("+CEAP")) {
            return new AtPlusCEAP();
        } else if (cmd.equals("+CPBF")) {
            return new AtPlusCPBF();
        } else if (cmd.equals("$QCMGF")) {
            return new AtDolQCMGF();
        } else if (cmd.equals("$QCCLR")) {
            return new AtDolQCCLR();
        } else if (cmd.equals("$QCSIMSTAT")) {
            return new AtDolQCSIMSTAT();
        } else if (cmd.equals("+CPBW")) {
            return new AtPlusCPBW();
        } else if (cmd.equals("+CLCK")) {
            return new AtPlusCLCK();
        } else if (cmd.equals("$QCMGW")) {
            return new AtDolQCMGW();
        } else if (cmd.equals("+FBS")) {
            return new AtPlusFBS();
        } else if (cmd.equals("+ESR")) {
            return new AtPlusESR();
        } else if (cmd.equals("$QCMGL")) {
            return new AtDolQCMGL();
        } else if (cmd.equals("+FSP")) {
            return new AtPlusFSP();
        } else if (cmd.equals("$QCSIMAPP")) {
            return new AtDolQCSIMAPP();
        } else if (cmd.equals("+ER")) {
            return new AtPlusER();
        } else if (cmd.equals("+FPA")) {
            return new AtPlusFPA();
        } else if (cmd.equals("+MA")) {
            return new AtPlusMA();
        } else if (cmd.equals("&F")) {
            return new AtAmpF();
        } else if (cmd.equals("+CPBS")) {
            return new AtPlusCPBS();
        } else if (cmd.equals("$QCMGD")) {
            return new AtDolQCMGD();
        } else if (cmd.equals("+FAP")) {
            return new AtPlusFAP();
        } else if (cmd.equals("+CCLK")) {
            return new AtPlusCCLK();
        } else if (cmd.equals("+CPWD")) {
            return new AtPlusCPWD();
        } else if (cmd.equals("+CGEQOS")) {
            return new AtPlusCGEQOS();
        } else if (cmd.equals("O")) {
            return new AtO();
        } else if (cmd.equals("$QCMIPGETP")) {
            return new AtDolQCMIPGETP();
        } else if (cmd.equals("+WS46")) {
            return new AtPlusWS46();
        } else if (cmd.equals("+GMM")) {
            return new AtPlusGMM();
        } else if (cmd.equals("^RESET")) {
            return new AtCarRESET();
        } else if (cmd.equals("+CBIP")) {
            return new AtPlusCBIP();
        } else if (cmd.equals("S30")) {
            return new AtS30();
        } else if (cmd.equals("S10")) {
            return new AtS10();
        } else if (cmd.equals("$QCVOLT")) {
            return new AtDolQCVOLT();
        } else if (cmd.equals("S103")) {
            return new AtS103();
        } else if (cmd.equals("+FKS")) {
            return new AtPlusFKS();
        } else if (cmd.equals("+QCPWD")) {
            return new AtPlusQCPWD();
        } else if (cmd.equals("+CSCA")) {
            return new AtPlusCSCA();
        } else if (cmd.equals("+CEER")) {
            return new AtPlusCEER();
        } else if (cmd.equals("+CHV")) {
            return new AtPlusCHV();
        } else if (cmd.equals("+CRC")) {
            return new AtPlusCRC();
        } else if (cmd.equals("&D")) {
            return new AtAmpD();
        } else if (cmd.equals("+FLI")) {
            return new AtPlusFLI();
        } else if (cmd.equals("S4")) {
            return new AtS4();
        } else if (cmd.equals("+CSIM")) {
            return new AtPlusCSIM();
        } else if (cmd.equals("$QCHDRC")) {
            return new AtDolQCHDRC();
        } else if (cmd.equals("*CNTI")) {
            return new AtStarCNTI();
        } else if (cmd.equals("+CERP")) {
            return new AtPlusCERP();
        } else if (cmd.equals("A")) {
            return new AtA();
        } else if (cmd.equals("+IFC")) {
            return new AtPlusIFC();
        } else if (cmd.equals("M")) {
            return new AtM();
        } else if (cmd.equals("+QCLCK")) {
            return new AtPlusQCLCK();
        } else if (cmd.equals("+CDS")) {
            return new AtPlusCDS();
        } else if (cmd.equals("$QCCTM")) {
            return new AtDolQCCTM();
        } else if (cmd.equals("+CSMS")) {
            return new AtPlusCSMS();
        } else if (cmd.equals("$QCCHS")) {
            return new AtDolQCCHS();
        } else if (cmd.equals("+FCC")) {
            return new AtPlusFCC();
        } else if (cmd.equals("+CMEE")) {
            return new AtPlusCMEE();
        } else if (cmd.equals("+CGCMOD")) {
            return new AtPlusCGCMOD();
        } else if (cmd.equals("+CNMI")) {
            return new AtPlusCNMI();
        } else if (cmd.equals("I")) {
            return new AtI();
        } else if (cmd.equals("^CPIN")) {
            return new AtCarCPIN();
        } else if (cmd.equals("+CGMR")) {
            return new AtPlusCGMR();
        } else if (cmd.equals("+CMIP")) {
            return new AtPlusCMIP();
        } else if (cmd.equals("+CHLD")) {
            return new AtPlusCHLD();
        } else if (cmd.equals("$QCMIPMASSX")) {
            return new AtDolQCMIPMASSX();
        } else if (cmd.equals("+CBC")) {
            return new AtPlusCBC();
        } else if (cmd.equals("$QCHDRET")) {
            return new AtDolQCHDRET();
        } else if (cmd.equals("\\S")) {
            return new AtSlaS();
        } else if (cmd.equals("$QCOTC")) {
            return new AtDolQCOTC();
        } else if (cmd.equals("$QCPDPLT")) {
            return new AtDolQCPDPLT();
        } else if (cmd.equals("\\V")) {
            return new AtSlaV();
        } else if (cmd.equals("+CGEQREQ")) {
            return new AtPlusCGEQREQ();
        } else if (cmd.equals("+FIE")) {
            return new AtPlusFIE();
        } else if (cmd.equals("+CMMS")) {
            return new AtPlusCMMS();
        } else if (cmd.equals("$QCDNSP")) {
            return new AtDolQCDNSP();
        } else if (cmd.equals("+CNMA")) {
            return new AtPlusCNMA();
        } else if (cmd.equals("+PACSP")) {
            return new AtPlusPACSP();
        } else if (cmd.equals("+CFC")) {
            return new AtPlusCFC();
        } else if (cmd.equals("+CMGC")) {
            return new AtPlusCMGC();
        } else if (cmd.equals("+VTS")) {
            return new AtPlusVTS();
        } else if (cmd.equals("$QCMIPEP")) {
            return new AtDolQCMIPEP();
        } else if (cmd.equals("S3")) {
            return new AtS3();
        } else if (cmd.equals("+CCWA")) {
            return new AtPlusCCWA();
        } else if (cmd.equals("+FRY")) {
            return new AtPlusFRY();
        } else if (cmd.equals("+CGPADDR")) {
            return new AtPlusCGPADDR();
        } else if (cmd.equals("$QCDMR")) {
            return new AtDolQCDMR();
        } else if (cmd.equals("+FDR")) {
            return new AtPlusFDR();
        } else if (cmd.equals("+MS")) {
            return new AtPlusMS();
        } else if (cmd.equals("$QCSMP")) {
            return new AtDolQCSMP();
        } else if (cmd.equals("$QCAPNE")) {
            return new AtDolQCAPNE();
        } else if (cmd.equals("$CSQ")) {
            return new AtDolCSQ();
        } else if (cmd.equals("+CREG")) {
            return new AtPlusCREG();
        } else if (cmd.equals("T")) {
            return new AtT();
        } else if (cmd.equals("+PZID")) {
            return new AtPlusPZID();
        } else if (cmd.equals("+CPOL")) {
            return new AtPlusCPOL();
        } else if (cmd.equals("+CGMM")) {
            return new AtPlusCGMM();
        } else if (cmd.equals("+ILRR")) {
            return new AtPlusILRR();
        } else if (cmd.equals("+CSTF")) {
            return new AtPlusCSTF();
        } else if (cmd.equals("+ETBM")) {
            return new AtPlusETBM();
        } else if (cmd.equals("+CHV0")) {
            return new AtPlusCHV0();
        } else if (cmd.equals("+GMR")) {
            return new AtPlusGMR();
        } else if (cmd.equals("+CFG")) {
            return new AtPlusCFG();
        } else if (cmd.equals("+DR")) {
            return new AtPlusDR();
        } else if (cmd.equals("$QCDRX")) {
            return new AtDolQCDRX();
        } else if (cmd.equals("+CSSN")) {
            return new AtPlusCSSN();
        } else if (cmd.equals("+CTZU")) {
            return new AtPlusCTZU();
        } else if (cmd.equals("+FIS")) {
            return new AtPlusFIS();
        } else if (cmd.equals("+CQD")) {
            return new AtPlusCQD();
        } else if (cmd.equals("+FPI")) {
            return new AtPlusFPI();
        } else if (cmd.equals("S6")) {
            return new AtS6();
        } else if (cmd.equals("+EB")) {
            return new AtPlusEB();
        } else if (cmd.equals("^CARDMODE")) {
            return new AtCarCARDMODE();
        } else if (cmd.equals("+FRH")) {
            return new AtPlusFRH();
        } else if (cmd.equals("+MV18R")) {
            return new AtPlusMV18R();
        } else if (cmd.equals("+FCLASS")) {
            return new AtPlusFCLASS();
        } else if (cmd.equals("+GMI")) {
            return new AtPlusGMI();
        } else if (cmd.equals("+CBST")) {
            return new AtPlusCBST();
        } else if (cmd.equals("$QCMIPNAI")) {
            return new AtDolQCMIPNAI();
        } else if (cmd.equals("+FAA")) {
            return new AtPlusFAA();
        } else if (cmd.equals("+CLAC")) {
            return new AtPlusCLAC();
        } else if (cmd.equals("$QCQOSPRI")) {
            return new AtDolQCQOSPRI();
        } else if (cmd.equals("+CUSD")) {
            return new AtPlusCUSD();
        } else if (cmd.equals("^SYSCONFIG")) {
            return new AtCarSYSCONFIG();
        } else if (cmd.equals("D")) {
            return new AtD();
        } else if (cmd.equals("P")) {
            return new AtP();
        } else if (cmd.equals("$QCPDPCFGE")) {
            return new AtDolQCPDPCFGE();
        } else if (cmd.equals("+CGSN")) {
            return new AtPlusCGSN();
        } else if (cmd.equals("+CVHU")) {
            return new AtPlusCVHU();
        } else if (cmd.equals("+MV18S")) {
            return new AtPlusMV18S();
        } else if (cmd.equals("$QCCNMI")) {
            return new AtDolQCCNMI();
        } else if (cmd.equals("&S")) {
            return new AtAmpS();
        } else if (cmd.equals("+IPR")) {
            return new AtPlusIPR();
        } else if (cmd.equals("+FHS")) {
            return new AtPlusFHS();
        } else if (cmd.equals("+CEREG")) {
            return new AtPlusCEREG();
        } else if (cmd.equals("$QCTRTL")) {
            return new AtDolQCTRTL();
        } else if (cmd.equals("+CGEREP")) {
            return new AtPlusCGEREP();
        } else if (cmd.equals("+ICF")) {
            return new AtPlusICF();
        } else if (cmd.equals("$QCPREV")) {
            return new AtDolQCPREV();
        } else if (cmd.equals("+CSMP")) {
            return new AtPlusCSMP();
        } else if (cmd.equals("^SPN")) {
            return new AtCarSPN();
        } else if (cmd.equals("+CSDH")) {
            return new AtPlusCSDH();
        } else if (cmd.equals("+CGCLASS")) {
            return new AtPlusCGCLASS();
        } else if (cmd.equals("+CCSQ")) {
            return new AtPlusCCSQ();
        } else if (cmd.equals("+CIND")) {
            return new AtPlusCIND();
        } else if (cmd.equals("L")) {
            return new AtL();
        } else if (cmd.equals("+FCQ")) {
            return new AtPlusFCQ();
        } else if (cmd.equals("$QCMIPMASS")) {
            return new AtDolQCMIPMASS();
        } else if (cmd.equals("+COPS")) {
            return new AtPlusCOPS();
        } else if (cmd.equals("+CGDATA")) {
            return new AtPlusCGDATA();
        } else if (cmd.equals("$QCMRUE")) {
            return new AtDolQCMRUE();
        } else if (cmd.equals("$QCMIPT")) {
            return new AtDolQCMIPT();
        } else if (cmd.equals("+CDR")) {
            return new AtPlusCDR();
        } else if (cmd.equals("$QCMIPMHSSX")) {
            return new AtDolQCMIPMHSSX();
        } else if (cmd.equals("+CCFC")) {
            return new AtPlusCCFC();
        } else if (cmd.equals("+CV120")) {
            return new AtPlusCV120();
        } else if (cmd.equals("\\Q")) {
            return new AtSlaQ();
        } else if (cmd.equals("^DSCI")) {
            return new AtCarDSCI();
        } else if (cmd.equals("+CLCC")) {
            return new AtPlusCLCC();
        } else if (cmd.equals("+FRM")) {
            return new AtPlusFRM();
        } else if (cmd.equals("+CPBR")) {
            return new AtPlusCPBR();
        } else if (cmd.equals("$QCMRUC")) {
            return new AtDolQCMRUC();
        } else if (cmd.equals("+DS")) {
            return new AtPlusDS();
        } else if (cmd.equals("H")) {
            return new AtH();
        } else if (cmd.equals("+CUAD")) {
            return new AtPlusCUAD();
        } else if (cmd.equals("+FNS")) {
            return new AtPlusFNS();
        } else if (cmd.equals("+FTS")) {
            return new AtPlusFTS();
        } else if (cmd.equals("$QCHDRT")) {
            return new AtDolQCHDRT();
        } else if (cmd.equals("+ESA")) {
            return new AtPlusESA();
        } else if (cmd.equals("$QCRMCALL")) {
            return new AtDolQCRMCALL();
        } else if (cmd.equals("^SYSINFO")) {
            return new AtCarSYSINFO();
        } else if (cmd.equals("$QCANTE")) {
            return new AtDolQCANTE();
        } else if (cmd.equals("+FCL")) {
            return new AtPlusFCL();
        } else if (cmd.equals("+CDV")) {
            return new AtPlusCDV();
        } else if (cmd.equals("$QCSYSMODE")) {
            return new AtDolQCSYSMODE();
        } else if (cmd.equals("$QCRSRQ")) {
            return new AtDolQCRSRQ();
        } else if (cmd.equals("+CMGR")) {
            return new AtPlusCMGR();
        } else if (cmd.equals("+QCCSS")) {
            return new AtPlusQCCSS();
        } else if (cmd.equals("+CLIP")) {
            return new AtPlusCLIP();
        } else if (cmd.equals("$QCTER")) {
            return new AtDolQCTER();
        } else if (cmd.equals("Z")) {
            return new AtZ();
        } else if (cmd.equals("+FIP")) {
            return new AtPlusFIP();
        } else if (cmd.equals("$QCMIPMHSS")) {
            return new AtDolQCMIPMHSS();
        } else if (cmd.equals("+COPN")) {
            return new AtPlusCOPN();
        } else if (cmd.equals("$QCMSS")) {
            return new AtDolQCMSS();
        } else if (cmd.equals("+CPLS")) {
            return new AtPlusCPLS();
        } else if (cmd.equals("%V")) {
            return new AtPerV();
        } else if (cmd.equals("+CACM")) {
            return new AtPlusCACM();
        } else if (cmd.equals("+CGATT")) {
            return new AtPlusCGATT();
        } else if (cmd.equals("+MDN")) {
            return new AtPlusMDN();
        } else if (cmd.equals("+FTM")) {
            return new AtPlusFTM();
        } else if (cmd.equals("+CAOC")) {
            return new AtPlusCAOC();
        } else if (cmd.equals("+CAD")) {
            return new AtPlusCAD();
        } else if (cmd.equals("S9")) {
            return new AtS9();
        } else if (cmd.equals("+FEA")) {
            return new AtPlusFEA();
        } else if (cmd.equals("+CCRC")) {
            return new AtPlusCCRC();
        } else if (cmd.equals("$QCSQ")) {
            return new AtDolQCSQ();
        } else if (cmd.equals("+CIMI")) {
            return new AtPlusCIMI();
        } else if (cmd.equals("+CSDF")) {
            return new AtPlusCSDF();
        } else if (cmd.equals("$QCMIPRT")) {
            return new AtDolQCMIPRT();
        } else if (cmd.equals("+GSN")) {
            return new AtPlusGSN();
        } else if (cmd.equals("+CGREG")) {
            return new AtPlusCGREG();
        } else if (cmd.equals("$QCVAD")) {
            return new AtDolQCVAD();
        } else if (cmd.equals("$QCMIPMASPI")) {
            return new AtDolQCMIPMASPI();
        } else if (cmd.equals("+FRS")) {
            return new AtPlusFRS();
        } else if (cmd.equals("+CTA")) {
            return new AtPlusCTA();
        } else if (cmd.equals("+CGQREQ")) {
            return new AtPlusCGQREQ();
        } else if (cmd.equals("+CMGS")) {
            return new AtPlusCMGS();
        } else if (cmd.equals("+CFUN")) {
            return new AtPlusCFUN();
        } else if (cmd.equals("+CLIR")) {
            return new AtPlusCLIR();
        } else if (cmd.equals("S104")) {
            return new AtS104();
        } else if (cmd.equals("$QCHDRR")) {
            return new AtDolQCHDRR();
        } else if (cmd.equals("+CNUM")) {
            return new AtPlusCNUM();
        } else if (cmd.equals("+FPR")) {
            return new AtPlusFPR();
        } else if (cmd.equals("+CRM")) {
            return new AtPlusCRM();
        } else if (cmd.equals("+CGEQMIN")) {
            return new AtPlusCGEQMIN();
        } else if (cmd.equals("$QCMIP")) {
            return new AtDolQCMIP();
        } else if (cmd.equals("&V")) {
            return new AtAmpV();
        } else if (cmd.equals("+CEMODE")) {
            return new AtPlusCEMODE();
        } else if (cmd.equals("X")) {
            return new AtX();
        } else if (cmd.equals("+CGACT")) {
            return new AtPlusCGACT();
        } else if (cmd.equals("$QCCLAC")) {
            return new AtDolQCCLAC();
        } else if (cmd.equals("+ICCID")) {
            return new AtPlusICCID();
        } else if (cmd.equals("+CSCS")) {
            return new AtPlusCSCS();
        } else if (cmd.equals("+CMEC")) {
            return new AtPlusCMEC();
        } else if (cmd.equals("$QCPMS")) {
            return new AtDolQCPMS();
        } else if (cmd.equals("$QCQNC")) {
            return new AtDolQCQNC();
        } else if (cmd.equals("+CGEQOSRDP")) {
            return new AtPlusCGEQOSRDP();
        } else if (cmd.equals("$QCHWREV")) {
            return new AtDolQCHWREV();
        } else if (cmd.equals("+CAMM")) {
            return new AtPlusCAMM();
        } else if (cmd.equals("+CPUC")) {
            return new AtPlusCPUC();
        } else if (cmd.equals("$QCPDPIMSCFGE")) {
            return new AtDolQCPDPIMSCFGE();
        } else if (cmd.equals("$QCRSRP")) {
            return new AtDolQCRSRP();
        } else if (cmd.equals("$QCDGEN")) {
            return new AtDolQCDGEN();
        } else if (cmd.equals("+CHSN")) {
            return new AtPlusCHSN();
        } else if (cmd.equals("E")) {
            return new AtE();
        } else if (cmd.equals("+CMER")) {
            return new AtPlusCMER();
        } else if (cmd.equals("+CGMI")) {
            return new AtPlusCGMI();
        } else if (cmd.equals("^CGSN")) {
            return new AtCarCGSN();
        } else if (cmd.equals("$QCMIPMHSPI")) {
            return new AtDolQCMIPMHSPI();
        } else if (cmd.equals("S5")) {
            return new AtS5();
        } else if (cmd.equals("^HDRCSQ")) {
            return new AtCarHDRCSQ();
        } else if (cmd.equals("$QCSCRM")) {
            return new AtDolQCSCRM();
        } else if (cmd.equals("+FMS")) {
            return new AtPlusFMS();
        } else if (cmd.equals("S0")) {
            return new AtS0();
        } else if (cmd.equals("+CPAS")) {
            return new AtPlusCPAS();
        } else if (cmd.equals("$CREG")) {
            return new AtDolCREG();
        } else if (cmd.equals("+FSA")) {
            return new AtPlusFSA();
        } else if (cmd.equals("$QCDEFPROF")) {
            return new AtDolQCDEFPROF();
        } else if (cmd.equals("+CPMS")) {
            return new AtPlusCPMS();
        } else if (cmd.equals("^HWVER")) {
            return new AtCarHWVER();
        } else if (cmd.equals("+ES")) {
            return new AtPlusES();
        } else if (cmd.equals("+QCPIN")) {
            return new AtPlusQCPIN();
        }
        return new ATcommand("dummy", 50);
    }
}
