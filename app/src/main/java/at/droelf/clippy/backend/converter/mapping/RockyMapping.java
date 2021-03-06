package at.droelf.clippy.backend.converter.mapping;

import at.droelf.clippy.R;

public class RockyMapping implements AgentMapping {

    private final static int NUMBER_COLUMNS = 28;
    private final static int NUMBER_ROWS = 36;

    private static final int [] IMAGE_MAPPING = {
            R.drawable.rocky_0000,
            R.drawable.rocky_0001,
            R.drawable.rocky_0002,
            R.drawable.rocky_0003,
            R.drawable.rocky_0004,
            R.drawable.rocky_0005,
            R.drawable.rocky_0006,
            R.drawable.rocky_0007,
            R.drawable.rocky_0008,
            R.drawable.rocky_0009,
            R.drawable.rocky_0010,
            R.drawable.rocky_0011,
            R.drawable.rocky_0012,
            R.drawable.rocky_0013,
            R.drawable.rocky_0014,
            R.drawable.rocky_0015,
            R.drawable.rocky_0016,
            R.drawable.rocky_0017,
            R.drawable.rocky_0018,
            R.drawable.rocky_0019,
            R.drawable.rocky_0020,
            R.drawable.rocky_0021,
            R.drawable.rocky_0022,
            R.drawable.rocky_0023,
            R.drawable.rocky_0024,
            R.drawable.rocky_0025,
            R.drawable.rocky_0026,
            R.drawable.rocky_0027,
            R.drawable.rocky_0028,
            R.drawable.rocky_0029,
            R.drawable.rocky_0030,
            R.drawable.rocky_0031,
            R.drawable.rocky_0032,
            R.drawable.rocky_0033,
            R.drawable.rocky_0034,
            R.drawable.rocky_0035,
            R.drawable.rocky_0036,
            R.drawable.rocky_0037,
            R.drawable.rocky_0038,
            R.drawable.rocky_0039,
            R.drawable.rocky_0040,
            R.drawable.rocky_0041,
            R.drawable.rocky_0042,
            R.drawable.rocky_0043,
            R.drawable.rocky_0044,
            R.drawable.rocky_0045,
            R.drawable.rocky_0046,
            R.drawable.rocky_0047,
            R.drawable.rocky_0048,
            R.drawable.rocky_0049,
            R.drawable.rocky_0050,
            R.drawable.rocky_0051,
            R.drawable.rocky_0052,
            R.drawable.rocky_0053,
            R.drawable.rocky_0054,
            R.drawable.rocky_0055,
            R.drawable.rocky_0056,
            R.drawable.rocky_0057,
            R.drawable.rocky_0058,
            R.drawable.rocky_0059,
            R.drawable.rocky_0060,
            R.drawable.rocky_0061,
            R.drawable.rocky_0062,
            R.drawable.rocky_0063,
            R.drawable.rocky_0064,
            R.drawable.rocky_0065,
            R.drawable.rocky_0066,
            R.drawable.rocky_0067,
            R.drawable.rocky_0068,
            R.drawable.rocky_0069,
            R.drawable.rocky_0070,
            R.drawable.rocky_0071,
            R.drawable.rocky_0072,
            R.drawable.rocky_0073,
            R.drawable.rocky_0074,
            R.drawable.rocky_0075,
            R.drawable.rocky_0076,
            R.drawable.rocky_0077,
            R.drawable.rocky_0078,
            R.drawable.rocky_0079,
            R.drawable.rocky_0080,
            R.drawable.rocky_0081,
            R.drawable.rocky_0082,
            R.drawable.rocky_0083,
            R.drawable.rocky_0084,
            R.drawable.rocky_0085,
            R.drawable.rocky_0086,
            R.drawable.rocky_0087,
            R.drawable.rocky_0088,
            R.drawable.rocky_0089,
            R.drawable.rocky_0090,
            R.drawable.rocky_0091,
            R.drawable.rocky_0092,
            R.drawable.rocky_0093,
            R.drawable.rocky_0094,
            R.drawable.rocky_0095,
            R.drawable.rocky_0096,
            R.drawable.rocky_0097,
            R.drawable.rocky_0098,
            R.drawable.rocky_0099,
            R.drawable.rocky_0100,
            R.drawable.rocky_0101,
            R.drawable.rocky_0102,
            R.drawable.rocky_0103,
            R.drawable.rocky_0104,
            R.drawable.rocky_0105,
            R.drawable.rocky_0106,
            R.drawable.rocky_0107,
            R.drawable.rocky_0108,
            R.drawable.rocky_0109,
            R.drawable.rocky_0110,
            R.drawable.rocky_0111,
            R.drawable.rocky_0112,
            R.drawable.rocky_0113,
            R.drawable.rocky_0114,
            R.drawable.rocky_0115,
            R.drawable.rocky_0116,
            R.drawable.rocky_0117,
            R.drawable.rocky_0118,
            R.drawable.rocky_0119,
            R.drawable.rocky_0120,
            R.drawable.rocky_0121,
            R.drawable.rocky_0122,
            R.drawable.rocky_0123,
            R.drawable.rocky_0124,
            R.drawable.rocky_0125,
            R.drawable.rocky_0126,
            R.drawable.rocky_0127,
            R.drawable.rocky_0128,
            R.drawable.rocky_0129,
            R.drawable.rocky_0130,
            R.drawable.rocky_0131,
            R.drawable.rocky_0132,
            R.drawable.rocky_0133,
            R.drawable.rocky_0134,
            R.drawable.rocky_0135,
            R.drawable.rocky_0136,
            R.drawable.rocky_0137,
            R.drawable.rocky_0138,
            R.drawable.rocky_0139,
            R.drawable.rocky_0140,
            R.drawable.rocky_0141,
            R.drawable.rocky_0142,
            R.drawable.rocky_0143,
            R.drawable.rocky_0144,
            R.drawable.rocky_0145,
            R.drawable.rocky_0146,
            R.drawable.rocky_0147,
            R.drawable.rocky_0148,
            R.drawable.rocky_0149,
            R.drawable.rocky_0150,
            R.drawable.rocky_0151,
            R.drawable.rocky_0152,
            R.drawable.rocky_0153,
            R.drawable.rocky_0154,
            R.drawable.rocky_0155,
            R.drawable.rocky_0156,
            R.drawable.rocky_0157,
            R.drawable.rocky_0158,
            R.drawable.rocky_0159,
            R.drawable.rocky_0160,
            R.drawable.rocky_0161,
            R.drawable.rocky_0162,
            R.drawable.rocky_0163,
            R.drawable.rocky_0164,
            R.drawable.rocky_0165,
            R.drawable.rocky_0166,
            R.drawable.rocky_0167,
            R.drawable.rocky_0168,
            R.drawable.rocky_0169,
            R.drawable.rocky_0170,
            R.drawable.rocky_0171,
            R.drawable.rocky_0172,
            R.drawable.rocky_0173,
            R.drawable.rocky_0174,
            R.drawable.rocky_0175,
            R.drawable.rocky_0176,
            R.drawable.rocky_0177,
            R.drawable.rocky_0178,
            R.drawable.rocky_0179,
            R.drawable.rocky_0180,
            R.drawable.rocky_0181,
            R.drawable.rocky_0182,
            R.drawable.rocky_0183,
            R.drawable.rocky_0184,
            R.drawable.rocky_0185,
            R.drawable.rocky_0186,
            R.drawable.rocky_0187,
            R.drawable.rocky_0188,
            R.drawable.rocky_0189,
            R.drawable.rocky_0190,
            R.drawable.rocky_0191,
            R.drawable.rocky_0192,
            R.drawable.rocky_0193,
            R.drawable.rocky_0194,
            R.drawable.rocky_0195,
            R.drawable.rocky_0196,
            R.drawable.rocky_0197,
            R.drawable.rocky_0198,
            R.drawable.rocky_0199,
            R.drawable.rocky_0200,
            R.drawable.rocky_0201,
            R.drawable.rocky_0202,
            R.drawable.rocky_0203,
            R.drawable.rocky_0204,
            R.drawable.rocky_0205,
            R.drawable.rocky_0206,
            R.drawable.rocky_0207,
            R.drawable.rocky_0208,
            R.drawable.rocky_0209,
            R.drawable.rocky_0210,
            R.drawable.rocky_0211,
            R.drawable.rocky_0212,
            R.drawable.rocky_0213,
            R.drawable.rocky_0214,
            R.drawable.rocky_0215,
            R.drawable.rocky_0216,
            R.drawable.rocky_0217,
            R.drawable.rocky_0218,
            R.drawable.rocky_0219,
            R.drawable.rocky_0220,
            R.drawable.rocky_0221,
            R.drawable.rocky_0222,
            R.drawable.rocky_0223,
            R.drawable.rocky_0224,
            R.drawable.rocky_0225,
            R.drawable.rocky_0226,
            R.drawable.rocky_0227,
            R.drawable.rocky_0228,
            R.drawable.rocky_0229,
            R.drawable.rocky_0230,
            R.drawable.rocky_0231,
            R.drawable.rocky_0232,
            R.drawable.rocky_0233,
            R.drawable.rocky_0234,
            R.drawable.rocky_0235,
            R.drawable.rocky_0236,
            R.drawable.rocky_0237,
            R.drawable.rocky_0238,
            R.drawable.rocky_0239,
            R.drawable.rocky_0240,
            R.drawable.rocky_0241,
            R.drawable.rocky_0242,
            R.drawable.rocky_0243,
            R.drawable.rocky_0244,
            R.drawable.rocky_0245,
            R.drawable.rocky_0246,
            R.drawable.rocky_0247,
            R.drawable.rocky_0248,
            R.drawable.rocky_0249,
            R.drawable.rocky_0250,
            R.drawable.rocky_0251,
            R.drawable.rocky_0252,
            R.drawable.rocky_0253,
            R.drawable.rocky_0254,
            R.drawable.rocky_0255,
            R.drawable.rocky_0256,
            R.drawable.rocky_0257,
            R.drawable.rocky_0258,
            R.drawable.rocky_0259,
            R.drawable.rocky_0260,
            R.drawable.rocky_0261,
            R.drawable.rocky_0262,
            R.drawable.rocky_0263,
            R.drawable.rocky_0264,
            R.drawable.rocky_0265,
            R.drawable.rocky_0266,
            R.drawable.rocky_0267,
            R.drawable.rocky_0268,
            R.drawable.rocky_0269,
            R.drawable.rocky_0270,
            R.drawable.rocky_0271,
            R.drawable.rocky_0272,
            R.drawable.rocky_0273,
            R.drawable.rocky_0274,
            R.drawable.rocky_0275,
            R.drawable.rocky_0276,
            R.drawable.rocky_0277,
            R.drawable.rocky_0278,
            R.drawable.rocky_0279,
            R.drawable.rocky_0280,
            R.drawable.rocky_0281,
            R.drawable.rocky_0282,
            R.drawable.rocky_0283,
            R.drawable.rocky_0284,
            R.drawable.rocky_0285,
            R.drawable.rocky_0286,
            R.drawable.rocky_0287,
            R.drawable.rocky_0288,
            R.drawable.rocky_0289,
            R.drawable.rocky_0290,
            R.drawable.rocky_0291,
            R.drawable.rocky_0292,
            R.drawable.rocky_0293,
            R.drawable.rocky_0294,
            R.drawable.rocky_0295,
            R.drawable.rocky_0296,
            R.drawable.rocky_0297,
            R.drawable.rocky_0298,
            R.drawable.rocky_0299,
            R.drawable.rocky_0300,
            R.drawable.rocky_0301,
            R.drawable.rocky_0302,
            R.drawable.rocky_0303,
            R.drawable.rocky_0304,
            R.drawable.rocky_0305,
            R.drawable.rocky_0306,
            R.drawable.rocky_0307,
            R.drawable.rocky_0308,
            R.drawable.rocky_0309,
            R.drawable.rocky_0310,
            R.drawable.rocky_0311,
            R.drawable.rocky_0312,
            R.drawable.rocky_0313,
            R.drawable.rocky_0314,
            R.drawable.rocky_0315,
            R.drawable.rocky_0316,
            R.drawable.rocky_0317,
            R.drawable.rocky_0318,
            R.drawable.rocky_0319,
            R.drawable.rocky_0320,
            R.drawable.rocky_0321,
            R.drawable.rocky_0322,
            R.drawable.rocky_0323,
            R.drawable.rocky_0324,
            R.drawable.rocky_0325,
            R.drawable.rocky_0326,
            R.drawable.rocky_0327,
            R.drawable.rocky_0328,
            R.drawable.rocky_0329,
            R.drawable.rocky_0330,
            R.drawable.rocky_0331,
            R.drawable.rocky_0332,
            R.drawable.rocky_0333,
            R.drawable.rocky_0334,
            R.drawable.rocky_0335,
            R.drawable.rocky_0336,
            R.drawable.rocky_0337,
            R.drawable.rocky_0338,
            R.drawable.rocky_0339,
            R.drawable.rocky_0340,
            R.drawable.rocky_0341,
            R.drawable.rocky_0342,
            R.drawable.rocky_0343,
            R.drawable.rocky_0344,
            R.drawable.rocky_0345,
            R.drawable.rocky_0346,
            R.drawable.rocky_0347,
            R.drawable.rocky_0348,
            R.drawable.rocky_0349,
            R.drawable.rocky_0350,
            R.drawable.rocky_0351,
            R.drawable.rocky_0352,
            R.drawable.rocky_0353,
            R.drawable.rocky_0354,
            R.drawable.rocky_0355,
            R.drawable.rocky_0356,
            R.drawable.rocky_0357,
            R.drawable.rocky_0358,
            R.drawable.rocky_0359,
            R.drawable.rocky_0360,
            R.drawable.rocky_0361,
            R.drawable.rocky_0362,
            R.drawable.rocky_0363,
            R.drawable.rocky_0364,
            R.drawable.rocky_0365,
            R.drawable.rocky_0366,
            R.drawable.rocky_0367,
            R.drawable.rocky_0368,
            R.drawable.rocky_0369,
            R.drawable.rocky_0370,
            R.drawable.rocky_0371,
            R.drawable.rocky_0372,
            R.drawable.rocky_0373,
            R.drawable.rocky_0374,
            R.drawable.rocky_0375,
            R.drawable.rocky_0376,
            R.drawable.rocky_0377,
            R.drawable.rocky_0378,
            R.drawable.rocky_0379,
            R.drawable.rocky_0380,
            R.drawable.rocky_0381,
            R.drawable.rocky_0382,
            R.drawable.rocky_0383,
            R.drawable.rocky_0384,
            R.drawable.rocky_0385,
            R.drawable.rocky_0386,
            R.drawable.rocky_0387,
            R.drawable.rocky_0388,
            R.drawable.rocky_0389,
            R.drawable.rocky_0390,
            R.drawable.rocky_0391,
            R.drawable.rocky_0392,
            R.drawable.rocky_0393,
            R.drawable.rocky_0394,
            R.drawable.rocky_0395,
            R.drawable.rocky_0396,
            R.drawable.rocky_0397,
            R.drawable.rocky_0398,
            R.drawable.rocky_0399,
            R.drawable.rocky_0400,
            R.drawable.rocky_0401,
            R.drawable.rocky_0402,
            R.drawable.rocky_0403,
            R.drawable.rocky_0404,
            R.drawable.rocky_0405,
            R.drawable.rocky_0406,
            R.drawable.rocky_0407,
            R.drawable.rocky_0408,
            R.drawable.rocky_0409,
            R.drawable.rocky_0410,
            R.drawable.rocky_0411,
            R.drawable.rocky_0412,
            R.drawable.rocky_0413,
            R.drawable.rocky_0414,
            R.drawable.rocky_0415,
            R.drawable.rocky_0416,
            R.drawable.rocky_0417,
            R.drawable.rocky_0418,
            R.drawable.rocky_0419,
            R.drawable.rocky_0420,
            R.drawable.rocky_0421,
            R.drawable.rocky_0422,
            R.drawable.rocky_0423,
            R.drawable.rocky_0424,
            R.drawable.rocky_0425,
            R.drawable.rocky_0426,
            R.drawable.rocky_0427,
            R.drawable.rocky_0428,
            R.drawable.rocky_0429,
            R.drawable.rocky_0430,
            R.drawable.rocky_0431,
            R.drawable.rocky_0432,
            R.drawable.rocky_0433,
            R.drawable.rocky_0434,
            R.drawable.rocky_0435,
            R.drawable.rocky_0436,
            R.drawable.rocky_0437,
            R.drawable.rocky_0438,
            R.drawable.rocky_0439,
            R.drawable.rocky_0440,
            R.drawable.rocky_0441,
            R.drawable.rocky_0442,
            R.drawable.rocky_0443,
            R.drawable.rocky_0444,
            R.drawable.rocky_0445,
            R.drawable.rocky_0446,
            R.drawable.rocky_0447,
            R.drawable.rocky_0448,
            R.drawable.rocky_0449,
            R.drawable.rocky_0450,
            R.drawable.rocky_0451,
            R.drawable.rocky_0452,
            R.drawable.rocky_0453,
            R.drawable.rocky_0454,
            R.drawable.rocky_0455,
            R.drawable.rocky_0456,
            R.drawable.rocky_0457,
            R.drawable.rocky_0458,
            R.drawable.rocky_0459,
            R.drawable.rocky_0460,
            R.drawable.rocky_0461,
            R.drawable.rocky_0462,
            R.drawable.rocky_0463,
            R.drawable.rocky_0464,
            R.drawable.rocky_0465,
            R.drawable.rocky_0466,
            R.drawable.rocky_0467,
            R.drawable.rocky_0468,
            R.drawable.rocky_0469,
            R.drawable.rocky_0470,
            R.drawable.rocky_0471,
            R.drawable.rocky_0472,
            R.drawable.rocky_0473,
            R.drawable.rocky_0474,
            R.drawable.rocky_0475,
            R.drawable.rocky_0476,
            R.drawable.rocky_0477,
            R.drawable.rocky_0478,
            R.drawable.rocky_0479,
            R.drawable.rocky_0480,
            R.drawable.rocky_0481,
            R.drawable.rocky_0482,
            R.drawable.rocky_0483,
            R.drawable.rocky_0484,
            R.drawable.rocky_0485,
            R.drawable.rocky_0486,
            R.drawable.rocky_0487,
            R.drawable.rocky_0488,
            R.drawable.rocky_0489,
            R.drawable.rocky_0490,
            R.drawable.rocky_0491,
            R.drawable.rocky_0492,
            R.drawable.rocky_0493,
            R.drawable.rocky_0494,
            R.drawable.rocky_0495,
            R.drawable.rocky_0496,
            R.drawable.rocky_0497,
            R.drawable.rocky_0498,
            R.drawable.rocky_0499,
            R.drawable.rocky_0500,
            R.drawable.rocky_0501,
            R.drawable.rocky_0502,
            R.drawable.rocky_0503,
            R.drawable.rocky_0504,
            R.drawable.rocky_0505,
            R.drawable.rocky_0506,
            R.drawable.rocky_0507,
            R.drawable.rocky_0508,
            R.drawable.rocky_0509,
            R.drawable.rocky_0510,
            R.drawable.rocky_0511,
            R.drawable.rocky_0512,
            R.drawable.rocky_0513,
            R.drawable.rocky_0514,
            R.drawable.rocky_0515,
            R.drawable.rocky_0516,
            R.drawable.rocky_0517,
            R.drawable.rocky_0518,
            R.drawable.rocky_0519,
            R.drawable.rocky_0520,
            R.drawable.rocky_0521,
            R.drawable.rocky_0522,
            R.drawable.rocky_0523,
            R.drawable.rocky_0524,
            R.drawable.rocky_0525,
            R.drawable.rocky_0526,
            R.drawable.rocky_0527,
            R.drawable.rocky_0528,
            R.drawable.rocky_0529,
            R.drawable.rocky_0530,
            R.drawable.rocky_0531,
            R.drawable.rocky_0532,
            R.drawable.rocky_0533,
            R.drawable.rocky_0534,
            R.drawable.rocky_0535,
            R.drawable.rocky_0536,
            R.drawable.rocky_0537,
            R.drawable.rocky_0538,
            R.drawable.rocky_0539,
            R.drawable.rocky_0540,
            R.drawable.rocky_0541,
            R.drawable.rocky_0542,
            R.drawable.rocky_0543,
            R.drawable.rocky_0544,
            R.drawable.rocky_0545,
            R.drawable.rocky_0546,
            R.drawable.rocky_0547,
            R.drawable.rocky_0548,
            R.drawable.rocky_0549,
            R.drawable.rocky_0550,
            R.drawable.rocky_0551,
            R.drawable.rocky_0552,
            R.drawable.rocky_0553,
            R.drawable.rocky_0554,
            R.drawable.rocky_0555,
            R.drawable.rocky_0556,
            R.drawable.rocky_0557,
            R.drawable.rocky_0558,
            R.drawable.rocky_0559,
            R.drawable.rocky_0560,
            R.drawable.rocky_0561,
            R.drawable.rocky_0562,
            R.drawable.rocky_0563,
            R.drawable.rocky_0564,
            R.drawable.rocky_0565,
            R.drawable.rocky_0566,
            R.drawable.rocky_0567,
            R.drawable.rocky_0568,
            R.drawable.rocky_0569,
            R.drawable.rocky_0570,
            R.drawable.rocky_0571,
            R.drawable.rocky_0572,
            R.drawable.rocky_0573,
            R.drawable.rocky_0574,
            R.drawable.rocky_0575,
            R.drawable.rocky_0576,
            R.drawable.rocky_0577,
            R.drawable.rocky_0578,
            R.drawable.rocky_0579,
            R.drawable.rocky_0580,
            R.drawable.rocky_0581,
            R.drawable.rocky_0582,
            R.drawable.rocky_0583,
            R.drawable.rocky_0584,
            R.drawable.rocky_0585,
            R.drawable.rocky_0586,
            R.drawable.rocky_0587,
            R.drawable.rocky_0588,
            R.drawable.rocky_0589,
            R.drawable.rocky_0590,
            R.drawable.rocky_0591,
            R.drawable.rocky_0592,
            R.drawable.rocky_0593,
            R.drawable.rocky_0594,
            R.drawable.rocky_0595,
            R.drawable.rocky_0596,
            R.drawable.rocky_0597,
            R.drawable.rocky_0598,
            R.drawable.rocky_0599,
            R.drawable.rocky_0600,
            R.drawable.rocky_0601,
            R.drawable.rocky_0602,
            R.drawable.rocky_0603,
            R.drawable.rocky_0604,
            R.drawable.rocky_0605,
            R.drawable.rocky_0606,
            R.drawable.rocky_0607,
            R.drawable.rocky_0608,
            R.drawable.rocky_0609,
            R.drawable.rocky_0610,
            R.drawable.rocky_0611,
            R.drawable.rocky_0612,
            R.drawable.rocky_0613,
            R.drawable.rocky_0614,
            R.drawable.rocky_0615,
            R.drawable.rocky_0616,
            R.drawable.rocky_0617,
            R.drawable.rocky_0618,
            R.drawable.rocky_0619,
            R.drawable.rocky_0620,
            R.drawable.rocky_0621,
            R.drawable.rocky_0622,
            R.drawable.rocky_0623,
            R.drawable.rocky_0624,
            R.drawable.rocky_0625,
            R.drawable.rocky_0626,
            R.drawable.rocky_0627,
            R.drawable.rocky_0628,
            R.drawable.rocky_0629,
            R.drawable.rocky_0630,
            R.drawable.rocky_0631,
            R.drawable.rocky_0632,
            R.drawable.rocky_0633,
            R.drawable.rocky_0634,
            R.drawable.rocky_0635,
            R.drawable.rocky_0636,
            R.drawable.rocky_0637,
            R.drawable.rocky_0638,
            R.drawable.rocky_0639,
            R.drawable.rocky_0640,
            R.drawable.rocky_0641,
            R.drawable.rocky_0642,
            R.drawable.rocky_0643,
            R.drawable.rocky_0644,
            R.drawable.rocky_0645,
            R.drawable.rocky_0646,
            R.drawable.rocky_0647,
            R.drawable.rocky_0648,
            R.drawable.rocky_0649,
            R.drawable.rocky_0650,
            R.drawable.rocky_0651,
            R.drawable.rocky_0652,
            R.drawable.rocky_0653,
            R.drawable.rocky_0654,
            R.drawable.rocky_0655,
            R.drawable.rocky_0656,
            R.drawable.rocky_0657,
            R.drawable.rocky_0658,
            R.drawable.rocky_0659,
            R.drawable.rocky_0660,
            R.drawable.rocky_0661,
            R.drawable.rocky_0662,
            R.drawable.rocky_0663,
            R.drawable.rocky_0664,
            R.drawable.rocky_0665,
            R.drawable.rocky_0666,
            R.drawable.rocky_0667,
            R.drawable.rocky_0668,
            R.drawable.rocky_0669,
            R.drawable.rocky_0670,
            R.drawable.rocky_0671,
            R.drawable.rocky_0672,
            R.drawable.rocky_0673,
            R.drawable.rocky_0674,
            R.drawable.rocky_0675,
            R.drawable.rocky_0676,
            R.drawable.rocky_0677,
            R.drawable.rocky_0678,
            R.drawable.rocky_0679,
            R.drawable.rocky_0680,
            R.drawable.rocky_0681,
            R.drawable.rocky_0682,
            R.drawable.rocky_0683,
            R.drawable.rocky_0684,
            R.drawable.rocky_0685,
            R.drawable.rocky_0686,
            R.drawable.rocky_0687,
            R.drawable.rocky_0688,
            R.drawable.rocky_0689,
            R.drawable.rocky_0690,
            R.drawable.rocky_0691,
            R.drawable.rocky_0692,
            R.drawable.rocky_0693,
            R.drawable.rocky_0694,
            R.drawable.rocky_0695,
            R.drawable.rocky_0696,
            R.drawable.rocky_0697,
            R.drawable.rocky_0698,
            R.drawable.rocky_0699,
            R.drawable.rocky_0700,
            R.drawable.rocky_0701,
            R.drawable.rocky_0702,
            R.drawable.rocky_0703,
            R.drawable.rocky_0704,
            R.drawable.rocky_0705,
            R.drawable.rocky_0706,
            R.drawable.rocky_0707,
            R.drawable.rocky_0708,
            R.drawable.rocky_0709,
            R.drawable.rocky_0710,
            R.drawable.rocky_0711,
            R.drawable.rocky_0712,
            R.drawable.rocky_0713,
            R.drawable.rocky_0714,
            R.drawable.rocky_0715,
            R.drawable.rocky_0716,
            R.drawable.rocky_0717,
            R.drawable.rocky_0718,
            R.drawable.rocky_0719,
            R.drawable.rocky_0720,
            R.drawable.rocky_0721,
            R.drawable.rocky_0722,
            R.drawable.rocky_0723,
            R.drawable.rocky_0724,
            R.drawable.rocky_0725,
            R.drawable.rocky_0726,
            R.drawable.rocky_0727,
            R.drawable.rocky_0728,
            R.drawable.rocky_0729,
            R.drawable.rocky_0730,
            R.drawable.rocky_0731,
            R.drawable.rocky_0732,
            R.drawable.rocky_0733,
            R.drawable.rocky_0734,
            R.drawable.rocky_0735,
            R.drawable.rocky_0736,
            R.drawable.rocky_0737,
            R.drawable.rocky_0738,
            R.drawable.rocky_0739,
            R.drawable.rocky_0740,
            R.drawable.rocky_0741,
            R.drawable.rocky_0742,
            R.drawable.rocky_0743,
            R.drawable.rocky_0744,
            R.drawable.rocky_0745,
            R.drawable.rocky_0746,
            R.drawable.rocky_0747,
            R.drawable.rocky_0748,
            R.drawable.rocky_0749,
            R.drawable.rocky_0750,
            R.drawable.rocky_0751,
            R.drawable.rocky_0752,
            R.drawable.rocky_0753,
            R.drawable.rocky_0754,
            R.drawable.rocky_0755,
            R.drawable.rocky_0756,
            R.drawable.rocky_0757,
            R.drawable.rocky_0758,
            R.drawable.rocky_0759,
            R.drawable.rocky_0760,
            R.drawable.rocky_0761,
            R.drawable.rocky_0762,
            R.drawable.rocky_0763,
            R.drawable.rocky_0764,
            R.drawable.rocky_0765,
            R.drawable.rocky_0766,
            R.drawable.rocky_0767,
            R.drawable.rocky_0768,
            R.drawable.rocky_0769,
            R.drawable.rocky_0770,
            R.drawable.rocky_0771,
            R.drawable.rocky_0772,
            R.drawable.rocky_0773,
            R.drawable.rocky_0774,
            R.drawable.rocky_0775,
            R.drawable.rocky_0776,
            R.drawable.rocky_0777,
            R.drawable.rocky_0778,
            R.drawable.rocky_0779,
            R.drawable.rocky_0780,
            R.drawable.rocky_0781,
            R.drawable.rocky_0782,
            R.drawable.rocky_0783,
            R.drawable.rocky_0784,
            R.drawable.rocky_0785,
            R.drawable.rocky_0786,
            R.drawable.rocky_0787,
            R.drawable.rocky_0788,
            R.drawable.rocky_0789,
            R.drawable.rocky_0790,
            R.drawable.rocky_0791,
            R.drawable.rocky_0792,
            R.drawable.rocky_0793,
            R.drawable.rocky_0794,
            R.drawable.rocky_0795,
            R.drawable.rocky_0796,
            R.drawable.rocky_0797,
            R.drawable.rocky_0798,
            R.drawable.rocky_0799,
            R.drawable.rocky_0800,
            R.drawable.rocky_0801,
            R.drawable.rocky_0802,
            R.drawable.rocky_0803,
            R.drawable.rocky_0804,
            R.drawable.rocky_0805,
            R.drawable.rocky_0806,
            R.drawable.rocky_0807,
            R.drawable.rocky_0808,
            R.drawable.rocky_0809,
            R.drawable.rocky_0810,
            R.drawable.rocky_0811,
            R.drawable.rocky_0812,
            R.drawable.rocky_0813,
            R.drawable.rocky_0814,
            R.drawable.rocky_0815,
            R.drawable.rocky_0816,
            R.drawable.rocky_0817,
            R.drawable.rocky_0818,
            R.drawable.rocky_0819,
            R.drawable.rocky_0820,
            R.drawable.rocky_0821,
            R.drawable.rocky_0822,
            R.drawable.rocky_0823,
            R.drawable.rocky_0824,
            R.drawable.rocky_0825,
            R.drawable.rocky_0826,
            R.drawable.rocky_0827,
            R.drawable.rocky_0828,
            R.drawable.rocky_0829,
            R.drawable.rocky_0830,
            R.drawable.rocky_0831,
            R.drawable.rocky_0832,
            R.drawable.rocky_0833,
            R.drawable.rocky_0834,
            R.drawable.rocky_0835,
            R.drawable.rocky_0836,
            R.drawable.rocky_0837,
            R.drawable.rocky_0838,
            R.drawable.rocky_0839,
            R.drawable.rocky_0840,
            R.drawable.rocky_0841,
            R.drawable.rocky_0842,
            R.drawable.rocky_0843,
            R.drawable.rocky_0844,
            R.drawable.rocky_0845,
            R.drawable.rocky_0846,
            R.drawable.rocky_0847,
            R.drawable.rocky_0848,
            R.drawable.rocky_0849,
            R.drawable.rocky_0850,
            R.drawable.rocky_0851,
            R.drawable.rocky_0852,
            R.drawable.rocky_0853,
            R.drawable.rocky_0854,
            R.drawable.rocky_0855,
            R.drawable.rocky_0856,
            R.drawable.rocky_0857,
            R.drawable.rocky_0858,
            R.drawable.rocky_0859,
            R.drawable.rocky_0860,
            R.drawable.rocky_0861,
            R.drawable.rocky_0862,
            R.drawable.rocky_0863,
            R.drawable.rocky_0864,
            R.drawable.rocky_0865,
            R.drawable.rocky_0866,
            R.drawable.rocky_0867,
            R.drawable.rocky_0868,
            R.drawable.rocky_0869,
            R.drawable.rocky_0870,
            R.drawable.rocky_0871,
            R.drawable.rocky_0872,
            R.drawable.rocky_0873,
            R.drawable.rocky_0874,
            R.drawable.rocky_0875,
            R.drawable.rocky_0876,
            R.drawable.rocky_0877,
            R.drawable.rocky_0878,
            R.drawable.rocky_0879,
            R.drawable.rocky_0880,
            R.drawable.rocky_0881,
            R.drawable.rocky_0882,
            R.drawable.rocky_0883,
            R.drawable.rocky_0884,
            R.drawable.rocky_0885,
            R.drawable.rocky_0886,
            R.drawable.rocky_0887,
            R.drawable.rocky_0888,
            R.drawable.rocky_0889,
            R.drawable.rocky_0890,
            R.drawable.rocky_0891,
            R.drawable.rocky_0892,
            R.drawable.rocky_0893,
            R.drawable.rocky_0894,
            R.drawable.rocky_0895,
            R.drawable.rocky_0896,
            R.drawable.rocky_0897,
            R.drawable.rocky_0898,
            R.drawable.rocky_0899,
            R.drawable.rocky_0900,
            R.drawable.rocky_0901,
            R.drawable.rocky_0902,
            R.drawable.rocky_0903,
            R.drawable.rocky_0904,
            R.drawable.rocky_0905,
            R.drawable.rocky_0906,
            R.drawable.rocky_0907,
            R.drawable.rocky_0908,
            R.drawable.rocky_0909,
            R.drawable.rocky_0910,
            R.drawable.rocky_0911,
            R.drawable.rocky_0912,
            R.drawable.rocky_0913,
            R.drawable.rocky_0914,
            R.drawable.rocky_0915,
            R.drawable.rocky_0916,
            R.drawable.rocky_0917,
            R.drawable.rocky_0918,
            R.drawable.rocky_0919,
            R.drawable.rocky_0920,
            R.drawable.rocky_0921,
            R.drawable.rocky_0922,
            R.drawable.rocky_0923,
            R.drawable.rocky_0924,
            R.drawable.rocky_0925,
            R.drawable.rocky_0926,
            R.drawable.rocky_0927,
            R.drawable.rocky_0928,
            R.drawable.rocky_0929,
            R.drawable.rocky_0930,
            R.drawable.rocky_0931,
            R.drawable.rocky_0932,
            R.drawable.rocky_0933,
            R.drawable.rocky_0934,
            R.drawable.rocky_0935,
            R.drawable.rocky_0936,
            R.drawable.rocky_0937,
            R.drawable.rocky_0938,
            R.drawable.rocky_0939,
            R.drawable.rocky_0940,
            R.drawable.rocky_0941,
            R.drawable.rocky_0942,
            R.drawable.rocky_0943,
            R.drawable.rocky_0944,
            R.drawable.rocky_0945,
            R.drawable.rocky_0946,
            R.drawable.rocky_0947,
            R.drawable.rocky_0948,
            R.drawable.rocky_0949,
            R.drawable.rocky_0950,
            R.drawable.rocky_0951,
            R.drawable.rocky_0952,
            R.drawable.rocky_0953,
            R.drawable.rocky_0954,
            R.drawable.rocky_0955,
            R.drawable.rocky_0956,
            R.drawable.rocky_0957,
            R.drawable.rocky_0958,
            R.drawable.rocky_0959,
            R.drawable.rocky_0960,
            R.drawable.rocky_0961,
            R.drawable.rocky_0962,
            R.drawable.rocky_0963,
            R.drawable.rocky_0964,
            R.drawable.rocky_0965,
            R.drawable.rocky_0966,
            R.drawable.rocky_0967,
            R.drawable.rocky_0968,
            R.drawable.rocky_0969,
            R.drawable.rocky_0970,
            R.drawable.rocky_0971,
            R.drawable.rocky_0972,
            R.drawable.rocky_0973,
            R.drawable.rocky_0974,
            R.drawable.rocky_0975,
            R.drawable.rocky_0976,
            R.drawable.rocky_0977,
            R.drawable.rocky_0978,
            R.drawable.rocky_0979,
            R.drawable.rocky_0980,
            R.drawable.rocky_0981,
            R.drawable.rocky_0982,
            R.drawable.rocky_0983,
            R.drawable.rocky_0984,
            R.drawable.rocky_0985,
            R.drawable.rocky_0986,
            R.drawable.rocky_0987,
            R.drawable.rocky_0988,
            R.drawable.rocky_0989,
            R.drawable.rocky_0990,
            R.drawable.rocky_0991,
            R.drawable.rocky_0992,
            R.drawable.rocky_0993,
            R.drawable.rocky_0994,
            R.drawable.rocky_0995,
            R.drawable.rocky_0996,
            R.drawable.rocky_0997,
            R.drawable.rocky_0998,
            R.drawable.rocky_0999,
            R.drawable.rocky_1000,
            R.drawable.rocky_1001,
            R.drawable.rocky_1002,
            R.drawable.rocky_1003,
            R.drawable.rocky_1004,
            R.drawable.rocky_1005,
            R.drawable.rocky_1006,
            R.drawable.rocky_1007
    };

    private final static int[] SOUND_MAPPING = {
            R.raw.rocky_snd_01,
            R.raw.rocky_snd_02,
            R.raw.rocky_snd_03,
            R.raw.rocky_snd_04,
            R.raw.rocky_snd_05,
            R.raw.rocky_snd_06,
            R.raw.rocky_snd_07,
            R.raw.rocky_snd_08,
            R.raw.rocky_snd_09,
            R.raw.rocky_snd_10,
            R.raw.rocky_snd_11,
            R.raw.rocky_snd_12,
            R.raw.rocky_snd_13,
            R.raw.rocky_snd_14,
            R.raw.rocky_snd_15,
            R.raw.rocky_snd_16,
            R.raw.rocky_snd_17,
            R.raw.rocky_snd_18,
            R.raw.rocky_snd_19,
            R.raw.rocky_snd_20,
            R.raw.rocky_snd_21,
            R.raw.rocky_snd_22,
            R.raw.rocky_snd_23,
            R.raw.rocky_snd_24,
            R.raw.rocky_snd_25,
            R.raw.rocky_snd_26,
            R.raw.rocky_snd_27,
            R.raw.rocky_snd_28,
            R.raw.rocky_snd_29,
            R.raw.rocky_snd_30,
            R.raw.rocky_snd_31,
            R.raw.rocky_snd_32,
            R.raw.rocky_snd_33,
            R.raw.rocky_snd_34
    };

    @Override
    public int[] getMapping() {
        return IMAGE_MAPPING;
    }

    @Override
    public int[] getSoundMapping() {
        return SOUND_MAPPING;
    }

    @Override
    public int getNumberRows() {
        return NUMBER_ROWS;
    }

    @Override
    public int getNumberColumns() {
        return NUMBER_COLUMNS;
    }

    @Override
    public int getEmptyFrameId() {
        return R.drawable.rocky_1007;
    }

    @Override
    public int getFirstFrameId() {
        return R.drawable.rocky_0000;
    }
}
