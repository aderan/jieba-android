package io.github.jieba;

import io.github.jieba.JiebaSegmenter.SegMode;
import java.util.stream.Collectors;

class TestData {

    public static String[] sentences = {
        "他说的确实在理",
        "长春市长春节讲话",
        "结合成分子时有化学反应",
        "这件事情的确非常有意思",
        "中华人民共和国中央人民政府",
        "他昨天骑车去东郊游玩",
        "西伯利亚猛虎可以忍受严寒",
        "程序员需要掌握数据结构与算法",
        "这次考试的结果将在下周公布",
        "他迟到了40分钟,解释说车辆抛锚了",
        "股票市场受到了政治因素的影响而下跌",
        "云计算和大数据的发展改变了软件开发",
        "你好,很高兴见到您,祝您今天愉快",
        "这部电影非常精彩,演员的表演令人惊叹",
        "请带上雨具,因为今天的天气预报显示有暴雨",
        "我们走吧,现在已经很晚了,该回家了",
        "他毕业后就在一家著名IT公司找到了工作",
        "这次旅行让我看到了中国的另一种完全不同的风景",
        "火车晚点二十分钟到站,导致他差点错过面试",
        "世界上最长的河流是尼罗河,它流经十个国家",
        "昨天的数学考试他只做对了一半的题目",
        "阅读是获取知识和开拓视野的重要手段",
        "充分睡眠可以提高记忆力并增强身体免疫力",
        "移动互联网的迅猛发展改变人类的生活方式",
        "把窗户打开通通风,房间里的空气需要流通",
        "稳扎稳打的做好本职工作是对公司最好的回报",
        "医学研究表明吸烟对人体健康有很大危害",
        "保持乐观积极的心态有助于减轻压力",
    };

    public static String[][] sentencesCutForSearch = {
        {"他", "说", "的", "确实", "在理"},
        {"长春", "市长", "春节", "讲话"},
        {"结合", "成", "分子", "时有", "化学反应"},
        {"这件", "事情", "的确", "非常", "有意思"},
        {"中华人民共和国中央人民政府"},
        {"他", "昨天", "骑车", "去", "东郊", "游玩"},
        {"西伯利亚", "猛虎", "可以", "忍受", "严寒"},
        {"程序员", "需要", "掌握", "数据结构", "与", "算法"},
        {"这次", "考试", "的", "结果", "将", "在", "下周", "公布"},
        {"他", "迟到", "了", "40", "分钟", ",", "解释", "说", "车辆", "抛锚", "了"},
        {"股票市场", "受到", "了", "政治", "因素", "的", "影响", "而", "下跌"},
        {"云", "计算", "和", "大", "数据", "的", "发展", "改变", "了", "软件", "开发"},
        {"你好", ",", "很", "高兴", "见到", "您", ",", "祝", "您", "今天", "愉快"},
        {"这部", "电影", "非常", "精彩", ",", "演员", "的", "表演", "令人惊叹"},
        {"请", "带上", "雨具", ",", "因为", "今天", "的", "天气", "预报", "显示", "有", "暴雨"},
        {"我们", "走", "吧", ",", "现在", "已经", "很晚", "了", ",", "该", "回家", "了"},
        {"他", "毕业", "后", "就", "在", "一家", "著名", "it", "公司", "找到", "了", "工作"},
        {"这次", "旅行", "让", "我", "看到", "了", "中国", "的", "另", "一种", "完全", "不同", "的", "风景"},
        {"火车", "晚点", "二十分钟", "到", "站", ",", "导致", "他", "差点", "错过", "面试"},
        {"世界", "上", "最长", "的", "河流", "是", "尼罗河", ",", "它", "流经", "十个", "国家"},
        {"昨天", "的", "数学", "考试", "他", "只", "做", "对", "了", "一半", "的", "题目"},
        {"阅读", "是", "获取", "知识", "和", "开拓", "视野", "的", "重要", "手段"},
        {"充分", "睡眠", "可以", "提高", "记忆力", "并", "增强", "身体", "免疫力"},
        {"移动", "互联网", "的", "迅猛", "发展", "改变", "人类", "的", "生活", "方式"},
        {"把", "窗户", "打开", "通通风", ",", "房间", "里", "的", "空气", "需要", "流通"},
        {"稳扎稳打", "的", "做好", "本职工作", "是", "对", "公司", "最好", "的", "回报"},
        {"医学", "研究", "表明", "吸烟", "对", "人体", "健康", "有", "很大", "危害"},
        {"保持", "乐观", "积极", "的", "心态", "有助于", "减轻", "压力"},
    };

    public static String[][] sentencesCutForIndex = {
        {"他", "说", "的", "确实", "在理"},
        {"长春", "市长", "春节", "讲话"},
        {"结合", "成", "分子", "时有", "化学", "反应", "化学反应"},
        {"这件", "事情", "的确", "非常", "有意", "意思", "有意思"},
        {"中华", "华人", "人民", "共和", "中央", "人民", "民政", "政府", "共和国", "中华人民共和国中央人民政府"},
        {"他", "昨天", "骑车", "去", "东郊", "游玩"},
        {"西伯", "利亚", "西伯利亚", "猛虎", "可以", "忍受", "严寒"},
        {"程序", "程序员", "需要", "掌握", "数据", "结构", "数据结构", "与", "算法"},
        {"这次", "考试", "的", "结果", "将", "在", "下周", "公布"},
        {"他", "迟到", "了", "40", "分钟", ",", "解释", "说", "车辆", "抛锚", "了"},
        {"股票", "市场", "股票市场", "受到", "了", "政治", "因素", "的", "影响", "而", "下跌"},
        {"云", "计算", "和", "大", "数据", "的", "发展", "改变", "了", "软件", "开发"},
        {"你好", ",", "很", "高兴", "见到", "您", ",", "祝", "您", "今天", "愉快"},
        {"这部", "电影", "非常", "精彩", ",", "演员", "的", "表演", "令人", "惊叹", "令人惊叹"},
        {"请", "带上", "雨具", ",", "因为", "今天", "的", "天气", "预报", "显示", "有", "暴雨"},
        {"我们", "走", "吧", ",", "现在", "已经", "很晚", "了", ",", "该", "回家", "了"},
        {"他", "毕业", "后", "就", "在", "一家", "著名", "it", "公司", "找到", "了", "工作"},
        {"这次", "旅行", "让", "我", "看到", "了", "中国", "的", "另", "一种", "完全", "不同", "的", "风景"},
        {"火车", "晚点", "二十", "十分", "分钟", "二十分", "十分钟", "二十分钟", "到", "站", ",", "导致", "他", "差点",
            "错过", "面试"},
        {"世界", "上", "最长", "的", "河流", "是", "尼罗", "尼罗河", ",", "它", "流经", "十个", "国家"},
        {"昨天", "的", "数学", "考试", "他", "只", "做", "对", "了", "一半", "的", "题目"},
        {"阅读", "是", "获取", "知识", "和", "开拓", "视野", "的", "重要", "手段"},
        {"充分", "睡眠", "可以", "提高", "记忆", "记忆力", "并", "增强", "身体", "免疫", "免疫力"},
        {"移动", "互联", "联网", "互联网", "的", "迅猛", "发展", "改变", "人类", "的", "生活", "方式"},
        {"把", "窗户", "打开", "通通", "通风", "通通风", ",", "房间", "里", "的", "空气", "需要", "流通"},
        {"稳扎稳打", "的", "做好", "本职", "职工", "工作", "本职工作", "是", "对", "公司", "最好", "的", "回报"},
        {"医学", "研究", "表明", "吸烟", "对", "人体", "健康", "有", "很大", "危害"},
        {"保持", "乐观", "积极", "的", "心态", "有助", "助于", "有助于", "减轻", "压力"},
    };

    public static String[][] sentencesProcessExpected = {
        {"他", "说", "的", "确实", "在理"},
        {"长春", "市长", "春节", "讲话"},
        {"结合", "成", "分子", "时有", "化学反应"},
        {"这件", "事情", "的确", "非常", "有意思"},
        {"中华人民共和国中央人民政府"},
        {"他", "昨天", "骑车", "去", "东郊", "游玩"},
        {"西伯利亚", "猛虎", "可以", "忍受", "严寒"},
        {"程序员", "需要", "掌握", "数据结构", "与", "算法"},
        {"这次", "考试", "的", "结果", "将", "在", "下周", "公布"},
        {"他", "迟到", "了", "40", "分钟", ",", "解释", "说", "车辆", "抛锚", "了"},
        {"股票市场", "受到", "了", "政治", "因素", "的", "影响", "而", "下跌"},
        {"云", "计算", "和", "大", "数据", "的", "发展", "改变", "了", "软件", "开发"},
        {"你好", ",", "很", "高兴", "见到", "您", ",", "祝", "您", "今天", "愉快"},
        {"这部", "电影", "非常", "精彩", ",", "演员", "的", "表演", "令人惊叹"},
        {"请", "带上", "雨具", ",", "因为", "今天", "的", "天气", "预报", "显示", "有", "暴雨"},
        {"我们", "走", "吧", ",", "现在", "已经", "很晚", "了", ",", "该", "回家", "了"},
        {"他", "毕业", "后", "就", "在", "一家", "著名", "IT", "公司", "找到", "了", "工作"},
        {"这次", "旅行", "让", "我", "看到", "了", "中国", "的", "另", "一种", "完全", "不同", "的", "风景"},
        {"火车", "晚点", "二十分钟", "到", "站", ",", "导致", "他", "差点", "错过", "面试"},
        {"世界", "上", "最长", "的", "河流", "是", "尼罗河", ",", "它", "流经", "十个", "国家"},
        {"昨天", "的", "数学", "考试", "他", "只", "做", "对", "了", "一半", "的", "题目"},
        {"阅读", "是", "获取", "知识", "和", "开拓", "视野", "的", "重要", "手段"},
        {"充分", "睡眠", "可以", "提高", "记忆力", "并", "增强", "身体", "免疫力"},
        {"移动", "互联网", "的", "迅猛", "发展", "改变", "人类", "的", "生活", "方式"},
        {"把", "窗户", "打开", "通通风", ",", "房间", "里", "的", "空气", "需要", "流通"},
        {"稳扎稳打", "的", "做好", "本职工作", "是", "对", "公司", "最好", "的", "回报"},
        {"医学", "研究", "表明", "吸烟", "对", "人体", "健康", "有", "很大", "危害"},
        {"保持", "乐观", "积极", "的", "心态", "有助于", "减轻", "压力"},
    };

    public static String[] longSentences = {
        "化學反應（英語：chemical reaction）是一個或一個以上的物質（又稱作反應物）經由化學變化转化為不同於反應物的過程。化學變化定義為當一個分子接觸另一個分子合成大分子，或者分子經斷裂分開形成兩個以上的小分子，又或者是分子內部的原子重組。為了形成變化，化學反應通常和化學鍵的形成與斷裂有關。特別注意化學反應不會以任何方式改變原子核，而仅限於在原子外的電子雲交互作用。雖然核變形後可能會引發化學反應，但是核反應與化學反應無關，因為核反應會改變反應的原子，變成另一種原子，根據質量守恆，反應前後原子之種類數目皆不變，核反應不符合此定律，因此核反應不為化學反應。化學性質是物質只能在化學變化中表現出來的性質，例如有酸鹼性、氧化还原性质、熱穩定性、反应性等等。",
        "程序员（Programmer，Computer Programmer或Coder；程式師），可以指在程序设计某個專業領域中的專業人士，或是从事軟體撰寫，程序开发、维护的专业人员。但一般Coder特指進行編寫代碼的編碼員。一个程序员最常使用的编程语言（如汇编语言、COBOL、C、C++、C#、JavaScript、Lisp、Python）可以加在“程序员”这个词前面用来修饰。涉及编程的一系列职业，如（软件）开发人员、网络开发人员、流動應用程式开发人员、嵌入式韌體开发人员、软件工程师、電腦科學家、游戏程序师、游戏开发人员和软件分析师，通常还需要一系列其他类似的技能。用程序员这个词来指代这些职位，有时被认为是一种侮辱性的简化，甚至是贬损。",
    };

    public static void generateProcess_CutForSearch() {
        JiebaSegmenter.getInstance().init(new TestDictStreamFetcher());
        JiebaSegmenter segmenter = JiebaSegmenter.getInstance();
        for (String sentence : TestData.sentences) {
            String str = segmenter.process(sentence, SegMode.SEARCH).stream()
                .map(token -> token.word)
                .map(e -> "\"" + e + "\"")
                .collect(Collectors.joining(", ", "new String[] {", "},"));
            System.out.println(str);
        }
    }

    public static void generateSentenceProcess() {
        JiebaSegmenter.getInstance().init(new TestDictStreamFetcher());
        JiebaSegmenter segmenter = JiebaSegmenter.getInstance();
        for (String sentence : TestData.sentences) {
            String str = segmenter.sentenceProcess(sentence).stream()
                .map(e -> "\"" + e + "\"")
                .collect(Collectors.joining(", ", "new String[] {", "},"));
            System.out.println(str);
        }
    }
}
