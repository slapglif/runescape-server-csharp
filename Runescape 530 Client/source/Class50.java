/* Class50 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Date;

public class Class50
{
    public static RSString aRSString_1012;
    public static short[][] aShortArrayArray1013;
    public Class67 aClass67_1014 = new Class67();
    public static int anInt1015;
    public static int[] anIntArray1016;
    public static RSString aRSString_1017
	= Class134.method1914("<col=40ff00>", (byte) 15);
    public static int anInt1018;
    public static int anInt1019;
    public static int[] anIntArray1020;
    public static int anInt1021;
    public static int anInt1022;
    public static RSString aRSString_1023;
    public static int anInt1024;
    public static int anInt1025;
    public static short[][] aShortArrayArray1026;
    public static int anInt1027;
    public static int anInt1028;
    public static int anInt1029;
    public static int anInt1030;
    public Class67 aClass67_1031;
    public static int anInt1032;
    public static int anInt1033;
    public static int anInt1034;
    public static int anInt1035;
    
    public static void method431(int arg0, int arg1, int arg2, boolean arg3,
				 int arg4, int arg5, int arg6, int[] arg7,
				 int arg8, int arg9, int arg10) {
	int i = arg5;
	anInt1015++;
	if (i < Class121.anInt2301) {
	    if ((i ^ 0xffffffff) > (Class121.anInt2298 ^ 0xffffffff))
		i = Class121.anInt2298;
	    int i_0_ = arg2 + arg5;
	    if (Class121.anInt2298 < i_0_) {
		if (i_0_ > Class121.anInt2301)
		    i_0_ = Class121.anInt2301;
		if (arg9 != 0)
		    method434(null, -30);
		int i_1_ = arg10;
		if (i_1_ < Class121.anInt2297) {
		    int i_2_ = arg10 + arg8;
		    if (Class121.anInt2295 > i_1_)
			i_1_ = Class121.anInt2295;
		    if ((i_2_ ^ 0xffffffff)
			< (Class121.anInt2295 ^ 0xffffffff)) {
			if (Class121.anInt2297 < i_2_)
			    i_2_ = Class121.anInt2297;
			i_2_ -= arg10;
			if (arg1 == 9) {
			    arg1 = 1;
			    arg6 = 1 + arg6 & 0x3;
			}
			if (arg1 == 10) {
			    arg6 = 0x3 & 3 + arg6;
			    arg1 = 1;
			}
			if ((arg1 ^ 0xffffffff) == -12) {
			    arg1 = 8;
			    arg6 = 3 + arg6 & 0x3;
			}
			int i_3_ = i + Class121.anInt2296 - i_0_;
			i_0_ -= arg5;
			int i_4_ = Class121.anInt2296 * i_1_ - -i;
			i -= arg5;
			int i_5_ = arg2 + -i_0_;
			int i_6_ = arg8 - i_2_;
			i_1_ -= arg10;
			int i_7_ = arg2 - i;
			int i_8_ = -i_1_ + arg8;
			if (arg1 == 1) {
			    if (arg6 == 0) {
				for (int i_9_ = i_1_; i_2_ > i_9_; i_9_++) {
				    for (int i_10_ = i; i_10_ < i_0_;
					 i_10_++) {
					if ((i_9_ ^ 0xffffffff)
					    <= (i_10_ ^ 0xffffffff))
					    arg7[i_4_] = arg0;
					else if (arg3)
					    arg7[i_4_] = arg4;
					i_4_++;
				    }
				    i_4_ += i_3_;
				}
			    } else if ((arg6 ^ 0xffffffff) == -2) {
				for (int i_11_ = i_8_ + -1;
				     ((i_6_ ^ 0xffffffff)
				      >= (i_11_ ^ 0xffffffff));
				     i_11_--) {
				    for (int i_12_ = i;
					 ((i_0_ ^ 0xffffffff)
					  < (i_12_ ^ 0xffffffff));
					 i_12_++) {
					if (i_12_ > i_11_) {
					    if (arg3)
						arg7[i_4_] = arg4;
					} else
					    arg7[i_4_] = arg0;
					i_4_++;
				    }
				    i_4_ += i_3_;
				}
			    } else if ((arg6 ^ 0xffffffff) == -3) {
				for (int i_13_ = i_1_;
				     ((i_13_ ^ 0xffffffff)
				      > (i_2_ ^ 0xffffffff));
				     i_13_++) {
				    for (int i_14_ = i;
					 ((i_0_ ^ 0xffffffff)
					  < (i_14_ ^ 0xffffffff));
					 i_14_++) {
					if ((i_13_ ^ 0xffffffff)
					    < (i_14_ ^ 0xffffffff)) {
					    if (arg3)
						arg7[i_4_] = arg4;
					} else
					    arg7[i_4_] = arg0;
					i_4_++;
				    }
				    i_4_ += i_3_;
				}
			    } else if ((arg6 ^ 0xffffffff) == -4) {
				for (int i_15_ = i_8_ + -1;
				     ((i_6_ ^ 0xffffffff)
				      >= (i_15_ ^ 0xffffffff));
				     i_15_--) {
				    for (int i_16_ = i; i_16_ < i_0_;
					 i_16_++) {
					if (i_16_ >= i_15_)
					    arg7[i_4_] = arg0;
					else if (arg3)
					    arg7[i_4_] = arg4;
					i_4_++;
				    }
				    i_4_ += i_3_;
				}
			    }
			} else if ((arg1 ^ 0xffffffff) == -3) {
			    if ((arg6 ^ 0xffffffff) == -1) {
				for (int i_17_ = i_8_ + -1; i_17_ >= i_6_;
				     i_17_--) {
				    for (int i_18_ = i;
					 ((i_0_ ^ 0xffffffff)
					  < (i_18_ ^ 0xffffffff));
					 i_18_++) {
					if ((i_18_ ^ 0xffffffff)
					    >= (i_17_ >> -1131030495
						^ 0xffffffff))
					    arg7[i_4_] = arg0;
					else if (arg3)
					    arg7[i_4_] = arg4;
					i_4_++;
				    }
				    i_4_ += i_3_;
				}
			    } else if ((arg6 ^ 0xffffffff) == -2) {
				for (int i_19_ = i_1_; i_19_ < i_2_; i_19_++) {
				    for (int i_20_ = i; i_20_ < i_0_;
					 i_20_++) {
					if (i_4_ < 0 || arg7.length <= i_4_)
					    i_4_++;
					else {
					    if (i_19_ << 1680568609 > i_20_) {
						if (arg3)
						    arg7[i_4_] = arg4;
					    } else
						arg7[i_4_] = arg0;
					    i_4_++;
					}
				    }
				    i_4_ += i_3_;
				}
			    } else if ((arg6 ^ 0xffffffff) == -3) {
				for (int i_21_ = i_1_;
				     ((i_21_ ^ 0xffffffff)
				      > (i_2_ ^ 0xffffffff));
				     i_21_++) {
				    for (int i_22_ = -1 + i_7_; i_5_ <= i_22_;
					 i_22_--) {
					if ((i_22_ ^ 0xffffffff)
					    >= (i_21_ >> 686396065
						^ 0xffffffff))
					    arg7[i_4_] = arg0;
					else if (arg3)
					    arg7[i_4_] = arg4;
					i_4_++;
				    }
				    i_4_ += i_3_;
				}
			    } else if (arg6 == 3) {
				for (int i_23_ = i_8_ - 1;
				     ((i_6_ ^ 0xffffffff)
				      >= (i_23_ ^ 0xffffffff));
				     i_23_--) {
				    for (int i_24_ = -1 + i_7_; i_24_ >= i_5_;
					 i_24_--) {
					if ((i_23_ << -1109852063 ^ 0xffffffff)
					    < (i_24_ ^ 0xffffffff)) {
					    if (arg3)
						arg7[i_4_] = arg4;
					} else
					    arg7[i_4_] = arg0;
					i_4_++;
				    }
				    i_4_ += i_3_;
				}
			    }
			} else if ((arg1 ^ 0xffffffff) == -4) {
			    if (arg6 == 0) {
				for (int i_25_ = -1 + i_8_;
				     ((i_25_ ^ 0xffffffff)
				      <= (i_6_ ^ 0xffffffff));
				     i_25_--) {
				    for (int i_26_ = -1 + i_7_; i_26_ >= i_5_;
					 i_26_--) {
					if ((i_26_ ^ 0xffffffff)
					    >= (i_25_ >> 857273537
						^ 0xffffffff))
					    arg7[i_4_] = arg0;
					else if (arg3)
					    arg7[i_4_] = arg4;
					i_4_++;
				    }
				    i_4_ += i_3_;
				}
			    } else if (arg6 == 1) {
				for (int i_27_ = i_8_ - 1; i_6_ <= i_27_;
				     i_27_--) {
				    for (int i_28_ = i; i_0_ > i_28_;
					 i_28_++) {
					if (i_27_ << 438394561 > i_28_) {
					    if (arg3)
						arg7[i_4_] = arg4;
					} else
					    arg7[i_4_] = arg0;
					i_4_++;
				    }
				    i_4_ += i_3_;
				}
			    } else if ((arg6 ^ 0xffffffff) == -3) {
				for (int i_29_ = i_1_; i_2_ > i_29_; i_29_++) {
				    for (int i_30_ = i;
					 ((i_30_ ^ 0xffffffff)
					  > (i_0_ ^ 0xffffffff));
					 i_30_++) {
					if ((i_30_ ^ 0xffffffff)
					    >= (i_29_ >> 1894828161
						^ 0xffffffff))
					    arg7[i_4_] = arg0;
					else if (arg3)
					    arg7[i_4_] = arg4;
					i_4_++;
				    }
				    i_4_ += i_3_;
				}
			    } else if ((arg6 ^ 0xffffffff) == -4) {
				for (int i_31_ = i_1_; i_31_ < i_2_; i_31_++) {
				    for (int i_32_ = -1 + i_7_;
					 ((i_32_ ^ 0xffffffff)
					  <= (i_5_ ^ 0xffffffff));
					 i_32_--) {
					if (i_31_ << -953594207 <= i_32_)
					    arg7[i_4_] = arg0;
					else if (arg3)
					    arg7[i_4_] = arg4;
					i_4_++;
				    }
				    i_4_ += i_3_;
				}
			    }
			} else if ((arg1 ^ 0xffffffff) == -5) {
			    if (arg6 == 0) {
				for (int i_33_ = i_8_ - 1;
				     ((i_6_ ^ 0xffffffff)
				      >= (i_33_ ^ 0xffffffff));
				     i_33_--) {
				    for (int i_34_ = i;
					 ((i_0_ ^ 0xffffffff)
					  < (i_34_ ^ 0xffffffff));
					 i_34_++) {
					if ((i_34_ ^ 0xffffffff)
					    > (i_33_ >> 1223728129
					       ^ 0xffffffff)) {
					    if (arg3)
						arg7[i_4_] = arg4;
					} else
					    arg7[i_4_] = arg0;
					i_4_++;
				    }
				    i_4_ += i_3_;
				}
			    } else if ((arg6 ^ 0xffffffff) == -2) {
				for (int i_35_ = i_1_;
				     ((i_2_ ^ 0xffffffff)
				      < (i_35_ ^ 0xffffffff));
				     i_35_++) {
				    for (int i_36_ = i;
					 ((i_0_ ^ 0xffffffff)
					  < (i_36_ ^ 0xffffffff));
					 i_36_++) {
					if ((i_35_ << -273843999 ^ 0xffffffff)
					    > (i_36_ ^ 0xffffffff)) {
					    if (arg3)
						arg7[i_4_] = arg4;
					} else
					    arg7[i_4_] = arg0;
					i_4_++;
				    }
				    i_4_ += i_3_;
				}
			    } else if (arg6 == 2) {
				for (int i_37_ = i_1_; i_2_ > i_37_; i_37_++) {
				    for (int i_38_ = -1 + i_7_; i_38_ >= i_5_;
					 i_38_--) {
					if (i_37_ >> 1216946177 <= i_38_)
					    arg7[i_4_] = arg0;
					else if (arg3)
					    arg7[i_4_] = arg4;
					i_4_++;
				    }
				    i_4_ += i_3_;
				}
			    } else if (arg6 == 3) {
				for (int i_39_ = i_8_ - 1;
				     ((i_6_ ^ 0xffffffff)
				      >= (i_39_ ^ 0xffffffff));
				     i_39_--) {
				    for (int i_40_ = i_7_ - 1; i_40_ >= i_5_;
					 i_40_--) {
					if (i_39_ << 1220552929 >= i_40_)
					    arg7[i_4_] = arg0;
					else if (arg3)
					    arg7[i_4_] = arg4;
					i_4_++;
				    }
				    i_4_ += i_3_;
				}
			    }
			} else if (arg1 == 5) {
			    if ((arg6 ^ 0xffffffff) == -1) {
				for (int i_41_ = i_8_ + -1; i_41_ >= i_6_;
				     i_41_--) {
				    for (int i_42_ = -1 + i_7_;
					 ((i_5_ ^ 0xffffffff)
					  >= (i_42_ ^ 0xffffffff));
					 i_42_--) {
					if (i_41_ >> -1256606015 > i_42_) {
					    if (arg3)
						arg7[i_4_] = arg4;
					} else
					    arg7[i_4_] = arg0;
					i_4_++;
				    }
				    i_4_ += i_3_;
				}
			    } else if (arg6 == 1) {
				for (int i_43_ = -1 + i_8_; i_6_ <= i_43_;
				     i_43_--) {
				    for (int i_44_ = i;
					 ((i_0_ ^ 0xffffffff)
					  < (i_44_ ^ 0xffffffff));
					 i_44_++) {
					if ((i_44_ ^ 0xffffffff)
					    >= (i_43_ << 1282724833
						^ 0xffffffff))
					    arg7[i_4_] = arg0;
					else if (arg3)
					    arg7[i_4_] = arg4;
					i_4_++;
				    }
				    i_4_ += i_3_;
				}
			    } else if ((arg6 ^ 0xffffffff) == -3) {
				for (int i_45_ = i_1_; i_2_ > i_45_; i_45_++) {
				    for (int i_46_ = i; i_0_ > i_46_;
					 i_46_++) {
					if ((i_45_ >> 1579459777 ^ 0xffffffff)
					    >= (i_46_ ^ 0xffffffff))
					    arg7[i_4_] = arg0;
					else if (arg3)
					    arg7[i_4_] = arg4;
					i_4_++;
				    }
				    i_4_ += i_3_;
				}
			    } else if ((arg6 ^ 0xffffffff) == -4) {
				for (int i_47_ = i_1_; i_47_ < i_2_; i_47_++) {
				    for (int i_48_ = i_7_ + -1;
					 ((i_48_ ^ 0xffffffff)
					  <= (i_5_ ^ 0xffffffff));
					 i_48_--) {
					if (i_47_ << -809806687 >= i_48_)
					    arg7[i_4_] = arg0;
					else if (arg3)
					    arg7[i_4_] = arg4;
					i_4_++;
				    }
				    i_4_ += i_3_;
				}
			    }
			} else {
			    if (arg1 == 6) {
				if ((arg6 ^ 0xffffffff) == -1) {
				    for (int i_49_ = i_1_; i_2_ > i_49_;
					 i_49_++) {
					for (int i_50_ = i;
					     ((i_0_ ^ 0xffffffff)
					      < (i_50_ ^ 0xffffffff));
					     i_50_++) {
					    if (arg2 / 2 >= i_50_)
						arg7[i_4_] = arg0;
					    else if (arg3)
						arg7[i_4_] = arg4;
					    i_4_++;
					}
					i_4_ += i_3_;
				    }
				    return;
				}
				if ((arg6 ^ 0xffffffff) == -2) {
				    for (int i_51_ = i_1_; i_51_ < i_2_;
					 i_51_++) {
					for (int i_52_ = i; i_0_ > i_52_;
					     i_52_++) {
					    if (arg8 / 2 >= i_51_)
						arg7[i_4_] = arg0;
					    else if (arg3)
						arg7[i_4_] = arg4;
					    i_4_++;
					}
					i_4_ += i_3_;
				    }
				    return;
				}
				if (arg6 == 2) {
				    for (int i_53_ = i_1_;
					 ((i_2_ ^ 0xffffffff)
					  < (i_53_ ^ 0xffffffff));
					 i_53_++) {
					for (int i_54_ = i;
					     ((i_0_ ^ 0xffffffff)
					      < (i_54_ ^ 0xffffffff));
					     i_54_++) {
					    if (i_54_ >= arg2 / 2)
						arg7[i_4_] = arg0;
					    else if (arg3)
						arg7[i_4_] = arg4;
					    i_4_++;
					}
					i_4_ += i_3_;
				    }
				    return;
				}
				if ((arg6 ^ 0xffffffff) == -4) {
				    for (int i_55_ = i_1_;
					 ((i_55_ ^ 0xffffffff)
					  > (i_2_ ^ 0xffffffff));
					 i_55_++) {
					for (int i_56_ = i;
					     ((i_56_ ^ 0xffffffff)
					      > (i_0_ ^ 0xffffffff));
					     i_56_++) {
					    if ((arg8 / 2 ^ 0xffffffff)
						< (i_55_ ^ 0xffffffff)) {
						if (arg3)
						    arg7[i_4_] = arg4;
					    } else
						arg7[i_4_] = arg0;
					    i_4_++;
					}
					i_4_ += i_3_;
				    }
				    return;
				}
			    }
			    if (arg1 == 7) {
				if (arg6 == 0) {
				    for (int i_57_ = i_1_;
					 ((i_2_ ^ 0xffffffff)
					  < (i_57_ ^ 0xffffffff));
					 i_57_++) {
					for (int i_58_ = i; i_58_ < i_0_;
					     i_58_++) {
					    if ((i_58_ ^ 0xffffffff)
						>= (-(arg8 / 2) + i_57_
						    ^ 0xffffffff))
						arg7[i_4_] = arg0;
					    else if (arg3)
						arg7[i_4_] = arg4;
					    i_4_++;
					}
					i_4_ += i_3_;
				    }
				    return;
				}
				if (arg6 == 1) {
				    for (int i_59_ = -1 + i_8_; i_59_ >= i_6_;
					 i_59_--) {
					for (int i_60_ = i;
					     ((i_60_ ^ 0xffffffff)
					      > (i_0_ ^ 0xffffffff));
					     i_60_++) {
					    if ((i_60_ ^ 0xffffffff)
						>= (i_59_ + -(arg8 / 2)
						    ^ 0xffffffff))
						arg7[i_4_] = arg0;
					    else if (arg3)
						arg7[i_4_] = arg4;
					    i_4_++;
					}
					i_4_ += i_3_;
				    }
				    return;
				}
				if (arg6 == 2) {
				    for (int i_61_ = i_8_ - 1;
					 ((i_61_ ^ 0xffffffff)
					  <= (i_6_ ^ 0xffffffff));
					 i_61_--) {
					for (int i_62_ = -1 + i_7_;
					     ((i_62_ ^ 0xffffffff)
					      <= (i_5_ ^ 0xffffffff));
					     i_62_--) {
					    if (i_62_ <= -(arg8 / 2) + i_61_)
						arg7[i_4_] = arg0;
					    else if (arg3)
						arg7[i_4_] = arg4;
					    i_4_++;
					}
					i_4_ += i_3_;
				    }
				    return;
				}
				if ((arg6 ^ 0xffffffff) == -4) {
				    for (int i_63_ = i_1_; i_2_ > i_63_;
					 i_63_++) {
					for (int i_64_ = i_7_ - 1;
					     i_5_ <= i_64_; i_64_--) {
					    if ((i_63_ - arg8 / 2 ^ 0xffffffff)
						<= (i_64_ ^ 0xffffffff))
						arg7[i_4_] = arg0;
					    else if (arg3)
						arg7[i_4_] = arg4;
					    i_4_++;
					}
					i_4_ += i_3_;
				    }
				    return;
				}
			    }
			    if ((arg1 ^ 0xffffffff) == -9) {
				if ((arg6 ^ 0xffffffff) == -1) {
				    for (int i_65_ = i_1_;
					 ((i_2_ ^ 0xffffffff)
					  < (i_65_ ^ 0xffffffff));
					 i_65_++) {
					for (int i_66_ = i; i_66_ < i_0_;
					     i_66_++) {
					    if (i_66_ >= i_65_ + -(arg8 / 2))
						arg7[i_4_] = arg0;
					    else if (arg3)
						arg7[i_4_] = arg4;
					    i_4_++;
					}
					i_4_ += i_3_;
				    }
				} else if (arg6 == 1) {
				    for (int i_67_ = i_8_ - 1;
					 ((i_6_ ^ 0xffffffff)
					  >= (i_67_ ^ 0xffffffff));
					 i_67_--) {
					for (int i_68_ = i; i_0_ > i_68_;
					     i_68_++) {
					    if ((i_68_ ^ 0xffffffff)
						<= (i_67_ - arg8 / 2
						    ^ 0xffffffff))
						arg7[i_4_] = arg0;
					    else if (arg3)
						arg7[i_4_] = arg4;
					    i_4_++;
					}
					i_4_ += i_3_;
				    }
				} else if (arg6 == 2) {
				    for (int i_69_ = -1 + i_8_; i_69_ >= i_6_;
					 i_69_--) {
					for (int i_70_ = i_7_ - 1;
					     ((i_5_ ^ 0xffffffff)
					      >= (i_70_ ^ 0xffffffff));
					     i_70_--) {
					    if ((i_70_ ^ 0xffffffff)
						> (i_69_ - arg8 / 2
						   ^ 0xffffffff)) {
						if (arg3)
						    arg7[i_4_] = arg4;
					    } else
						arg7[i_4_] = arg0;
					    i_4_++;
					}
					i_4_ += i_3_;
				    }
				} else if (arg6 == 3) {
				    for (int i_71_ = i_1_;
					 ((i_71_ ^ 0xffffffff)
					  > (i_2_ ^ 0xffffffff));
					 i_71_++) {
					for (int i_72_ = -1 + i_7_;
					     ((i_5_ ^ 0xffffffff)
					      >= (i_72_ ^ 0xffffffff));
					     i_72_--) {
					    if (i_71_ + -(arg8 / 2) <= i_72_)
						arg7[i_4_] = arg0;
					    else if (arg3)
						arg7[i_4_] = arg4;
					    i_4_++;
					}
					i_4_ += i_3_;
				    }
				}
			    }
			}
		    }
		}
	    }
	}
    }
    
    public Class67 method432(int arg0) {
	anInt1030++;
	Class67 class67 = aClass67_1031;
	if (arg0 != 0)
	    aRSString_1017 = null;
	if (class67 == aClass67_1014) {
	    aClass67_1031 = null;
	    return null;
	}
	aClass67_1031 = class67.aClass67_1340;
	return class67;
    }
    
    public Class67 method433(byte arg0) {
	int i = -15 % ((arg0 - -28) / 51);
	Class67 class67 = aClass67_1014.aClass67_1349;
	anInt1022++;
	if (aClass67_1014 == class67) {
	    aClass67_1031 = null;
	    return null;
	}
	aClass67_1031 = class67.aClass67_1349;
	return class67;
    }
    
    public static RSString method434(Stream arg0, int arg1) {
	anInt1027++;
	if (arg1 <= 93)
	    return null;
	return Class95.method1501(32767, 0, arg0);
    }
    
    public static void method435(int arg0, int arg1, Class131_Sub7 arg2) {
	if (arg0 == -1) {
	    if (arg2.anInt3714 > Class67_Sub1_Sub9.anInt3952)
		Class67_Sub1_Sub37.method794(arg2, true);
	    else if (arg2.anInt3734 < Class67_Sub1_Sub9.anInt3952)
		Class67_Sub1_Sub37.method792((byte) 34, arg2);
	    else
		Class114.method1609((byte) 32, arg2);
	    if ((arg2.anInt3733 ^ 0xffffffff) > -129
		|| (arg2.anInt3726 ^ 0xffffffff) > -129
		|| (arg2.anInt3733 ^ 0xffffffff) <= -13185
		|| arg2.anInt3726 >= 13184) {
		arg2.anInt3714 = 0;
		arg2.anInt3734 = 0;
		arg2.anInt3735 = -1;
		arg2.anInt3739 = -1;
		arg2.anInt3733 = (arg2.smallX[0] * 128
				  - -(64 * arg2.method1887((byte) -96)));
		arg2.anInt3726 = (128 * arg2.smallY[0]
				  + arg2.method1887((byte) -98) * 64);
		arg2.method1871(2);
	    }
	    if (Class122.aClass131_Sub7_Sub2_2309 == arg2
		&& (arg2.anInt3733 < 1536
		    || (arg2.anInt3726 ^ 0xffffffff) > -1537
		    || (arg2.anInt3733 ^ 0xffffffff) <= -11777
		    || arg2.anInt3726 >= 11776)) {
		arg2.anInt3739 = -1;
		arg2.anInt3735 = -1;
		arg2.anInt3714 = 0;
		arg2.anInt3734 = 0;
		arg2.anInt3733 = (128 * arg2.smallX[0]
				  + arg2.method1887((byte) -54) * 64);
		arg2.anInt3726 = (arg2.smallY[0] * 128
				  + arg2.method1887((byte) -68) * 64);
		arg2.method1871(2);
	    }
	    anInt1025++;
	    Login.method1415(64, arg2);
	    Class129.method1743((byte) 124, arg2);
	}
    }
    
    public void method436(Class67 arg0, boolean arg1) {
	anInt1019++;
	if (arg1 != false)
	    anInt1021 = -43;
	if (arg0.aClass67_1349 != null)
	    arg0.method606((byte) -118);
	arg0.aClass67_1340 = aClass67_1014;
	arg0.aClass67_1349 = aClass67_1014.aClass67_1349;
	arg0.aClass67_1349.aClass67_1340 = arg0;
	arg0.aClass67_1340.aClass67_1349 = arg0;
    }
    
    public void method437(byte arg0) {
	anInt1029++;
	if (arg0 < 125)
	    aShortArrayArray1026 = null;
	for (;;) {
	    Class67 class67 = aClass67_1014.aClass67_1340;
	    if (aClass67_1014 == class67)
		break;
	    class67.method606((byte) -118);
	}
	aClass67_1031 = null;
    }
    
    public static RSString method438(int arg0, long arg1) {
	try {
	    Class53.aCalendar1058.setTime(new Date(arg1));
	    int i = Class53.aCalendar1058.get(7);
	    if (arg0 != 0)
		anInt1021 = -14;
	    int i_73_ = Class53.aCalendar1058.get(5);
	    anInt1032++;
	    int i_74_ = Class53.aCalendar1058.get(2);
	    int i_75_ = Class53.aCalendar1058.get(1);
	    int i_76_ = Class53.aCalendar1058.get(11);
	    int i_77_ = Class53.aCalendar1058.get(12);
	    int i_78_ = Class53.aCalendar1058.get(13);
	    return (Class67_Sub1_Sub27.method744
		    ((new RSString[]
		      { Class113.aRSStringArray2132[-1 + i],
			Class41.aRSString_852,
			InputStream_Sub1.method47(i_73_ / 10, true),
			InputStream_Sub1.method47(i_73_ % 10, true),
			RuntimeException_Sub1.aRSString_2619,
			Applet_Sub1.aRSStringArray3[i_74_],
			RuntimeException_Sub1.aRSString_2619,
			InputStream_Sub1.method47(i_75_, true),
			Class104.aRSString_2036,
			InputStream_Sub1.method47(i_76_ / 10, true),
			InputStream_Sub1.method47(i_76_ % 10, true),
			Class129_Sub1.aRSString_3498,
			InputStream_Sub1.method47(i_77_ / 10, true),
			InputStream_Sub1.method47(i_77_ % 10, true),
			Class129_Sub1.aRSString_3498,
			InputStream_Sub1.method47(i_78_ / 10, true),
			InputStream_Sub1.method47(i_78_ % 10, true),
			Class67_Sub1_Sub15.aRSString_4057 }),
		     -103));
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("gk.E(" + arg0 + ',' + arg1
						+ ')'));
	}
    }
    
    public static void method439(int arg0) {
	aShortArrayArray1013 = null;
	anIntArray1020 = null;
	aRSString_1023 = null;
	aShortArrayArray1026 = null;
	if (arg0 != 30551)
	    aShortArrayArray1026 = null;
	anIntArray1016 = null;
	aRSString_1012 = null;
	aRSString_1017 = null;
    }
    
    public static void method440(int arg0, int arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6) {
	if (arg4 != -18752)
	    anIntArray1020 = null;
	anInt1018++;
	if ((arg3 ^ 0xffffffff) <= (Class139.anInt2533 ^ 0xffffffff)
	    && Class126_Sub1.anInt3423 >= arg0
	    && (arg1 ^ 0xffffffff) <= (Class55_Sub2.anInt2801 ^ 0xffffffff)
	    && OutputStream_Sub1.anInt87 >= arg5) {
	    if (arg2 == 1)
		Class67_Sub19.method1265(arg1, arg6, 8, arg5, arg3, arg0);
	    else
		Class131_Sub3.method1810(arg0, (byte) -62, arg2, arg3, arg5,
					 arg1, arg6);
	} else if (arg2 == 1)
	    Class83.method1436(arg0, (byte) -113, arg3, arg1, arg5, arg6);
	else
	    Class51.method447(arg3, 8805, arg1, arg2, arg6, arg0, arg5);
    }
    
    public void method441(Class67 arg0, byte arg1) {
	anInt1034++;
	if (arg0.aClass67_1349 != null)
	    arg0.method606((byte) -118);
	arg0.aClass67_1349 = aClass67_1014;
	arg0.aClass67_1340 = aClass67_1014.aClass67_1340;
	int i = -123 % ((-54 - arg1) / 50);
	arg0.aClass67_1349.aClass67_1340 = arg0;
	arg0.aClass67_1340.aClass67_1349 = arg0;
    }
    
    public Class67 method442(boolean arg0) {
	anInt1028++;
	if (arg0 != true)
	    method444(69, -127, 126);
	Class67 class67 = aClass67_1014.aClass67_1340;
	if (class67 == aClass67_1014)
	    return null;
	class67.method606((byte) -118);
	return class67;
    }
    
    public Class67 method443(int arg0) {
	anInt1024++;
	Class67 class67 = aClass67_1031;
	if (class67 == aClass67_1014) {
	    aClass67_1031 = null;
	    return null;
	}
	aClass67_1031 = class67.aClass67_1349;
	int i = 76 % ((-16 - arg0) / 51);
	return class67;
    }
    
    public static long method444(int arg0, int arg1, int arg2) {
	Class67_Sub24 class67_sub24
	    = Class76.aClass67_Sub24ArrayArrayArray1578[arg0][arg1][arg2];
	if (class67_sub24 == null || class67_sub24.aClass94_3224 == null)
	    return 0L;
	return class67_sub24.aClass94_3224.aLong1886;
    }
    
    public Class50() {
	aClass67_1014.aClass67_1349 = aClass67_1014;
	aClass67_1014.aClass67_1340 = aClass67_1014;
    }
    
    public Class67 method445(int arg0) {
	Class67 class67 = aClass67_1014.aClass67_1340;
	anInt1033++;
	if (aClass67_1014 == class67) {
	    aClass67_1031 = null;
	    return null;
	}
	aClass67_1031 = class67.aClass67_1340;
	if (arg0 != 0)
	    method445(-87);
	return class67;
    }
    
    static {
	aRSString_1012 = Class134.method1914("::pcachesize", (byte) 68);
	aShortArrayArray1013
	    = (new short[][]
	       { { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454,
		   6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310,
		   10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160,
		   -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892,
		   -23872, -19146, -18772, -18752, -14026, -13652, -13632,
		   -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038,
		   14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986,
		   -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556,
		   940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924,
		   10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766,
		   20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296,
		   -24266, -23892, -23872, -19146, -18772, -18752, -14026,
		   -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814,
		   11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898,
		   -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110,
		   310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732,
		   2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646,
		   15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992,
		   31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772,
		   -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522,
		   542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150,
		   -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50,
		   70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972,
		   2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576,
		   14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012,
		   -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146,
		   -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464,
		   522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130,
		   21150, -28918, -28898, -22006, -21986, -12918, -12898 },
		 { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454,
		   6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310,
		   10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160,
		   -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892,
		   -23872, -19146, -18772, -18752, -14026, -13652, -13632,
		   -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038,
		   14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986,
		   -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556,
		   940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924,
		   10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766,
		   20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296,
		   -24266, -23892, -23872, -19146, -18772, -18752, -14026,
		   -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814,
		   11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898,
		   -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110,
		   310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732,
		   2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646,
		   15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992,
		   31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772,
		   -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522,
		   542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150,
		   -28918, -28898, -22006, -21986, -12918, -12898, 10347,
		   10582, 10429, 10407, 10359, 8414, 9540, 10456, 0, 0, 0, 0,
		   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
		   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
		   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
		 { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454,
		   6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310,
		   10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160,
		   -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892,
		   -23872, -19146, -18772, -18752, -14026, -13652, -13632,
		   -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038,
		   14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986,
		   -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556,
		   940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924,
		   10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766,
		   20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296,
		   -24266, -23892, -23872, -19146, -18772, -18752, -14026,
		   -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814,
		   11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898,
		   -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110,
		   310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732,
		   2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646,
		   15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992,
		   31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772,
		   -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522,
		   542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150,
		   -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50,
		   70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972,
		   2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576,
		   14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012,
		   -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146,
		   -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464,
		   522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130,
		   21150, -28918, -28898, -22006, -21986, -12918, -12898 },
		 { 4300, 3294, 3303, 3264, 4506, 4382, 4387, 5293, 7622, 7384,
		   8412, 7496, 86, 123, 111, 99, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
		   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
		   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10,
		   30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454,
		   6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310,
		   10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160,
		   -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892,
		   -23872, -19146, -18772, -18752, -14026, -13652, -13632,
		   -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038,
		   14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986,
		   -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556,
		   940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924,
		   10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766,
		   20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296,
		   -24266, -23892, -23872, -19146, -18772, -18752, -14026,
		   -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814,
		   11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898,
		   -22006, -21986, -12918, -12898, 13766, 13745, 13726, 13890,
		   13743, 13852, 17602, 18605, 21660, 24000, 24997, 24088,
		   27972, 25903, 26904, 27193, 27175, 27156, 30020, 28975,
		   29976, 12482, 13485, 10392, 10692, 10669, 10776, 6717, 6695,
		   7830, 6971, 6951, 5910, 3389, 3369, 3356, 0, 0, 0, 0, 0, 0,
		   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
		   0, 0 },
		 { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454,
		   6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310,
		   10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160,
		   -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892,
		   -23872, -19146, -18772, -18752, -14026, -13652, -13632,
		   -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038,
		   14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986,
		   -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556,
		   940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924,
		   10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766,
		   20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296,
		   -24266, -23892, -23872, -19146, -18772, -18752, -14026,
		   -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814,
		   11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898,
		   -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110,
		   310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732,
		   2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646,
		   15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992,
		   31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772,
		   -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522,
		   542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150,
		   -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50,
		   70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972,
		   2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576,
		   14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012,
		   -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146,
		   -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464,
		   522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130,
		   21150, -28918, -28898, -22006, -21986, -12918, -12898 } });
	anIntArray1020 = new int[100];
	aRSString_1023
	    = Class134.method1914("Spieler kann nicht gefunden werden: ",
				  (byte) 39);
	anInt1021 = -1;
	anIntArray1016 = new int[50];
	aShortArrayArray1026
	    = (new short[][]
	       { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
		   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
		   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
		   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
		   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
		   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
		   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
		   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
		   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
		   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104,
		   304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726,
		   2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640,
		   15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998,
		   31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778,
		   -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516,
		   536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144,
		   -28924, -28904, -22012, -21992, -12924, -12904 },
		 { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
		   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
		   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
		   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
		   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
		   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
		   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
		   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
		   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
		   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10339, 10574, 10425,
		   10398, 10345, 7512, 8507, 7378, 0, 0, 0, 0, 0, 0, 0, 0, 0,
		   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
		   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
		   0, 0, 0, 0, 0, 0, 0 },
		 { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
		   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
		   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
		   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
		   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
		   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
		   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
		   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
		   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
		   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104,
		   304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726,
		   2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640,
		   15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998,
		   31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778,
		   -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516,
		   536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144,
		   -28924, -28904, -22012, -21992, -12924, -12904 },
		 { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
		   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
		   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
		   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
		   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
		   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
		   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
		   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
		   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
		   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 13753, 13737, 13719,
		   13883, 13863, 13974, 19643, 18601, 16532, 23993, 25121,
		   24980, 26944, 26921, 24854, 27191, 27171, 26130, 26941,
		   28696, 30100, 12477, 10407, 10388, 10685, 10665, 10646,
		   6711, 6693, 6674, 6965, 7073, 7056, 2361, 4387, 3346, 0, 0,
		   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
		   0, 0, 0, 0, 0, 0 },
		 { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
		   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
		   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
		   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
		   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
		   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
		   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
		   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
		   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
		   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104,
		   304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726,
		   2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640,
		   15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998,
		   31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778,
		   -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516,
		   536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144,
		   -28924, -28904, -22012, -21992, -12924, -12904 } });
	anInt1035 = 2;
    }
}
