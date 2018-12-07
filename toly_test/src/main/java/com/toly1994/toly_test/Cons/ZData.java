package com.toly1994.toly_test.Cons;

/**
 * 作者：张风捷特烈<br/>
 * 时间：2018/12/4 0004:14:59<br/>
 * 邮箱：1981462002@qq.com<br/>
 * 说明：
 */
public class ZData {
    /**
     * 小写字母集
     */
    public static String[] abc = new String[]{
            "a", "b", "c", "d", "e", "f", "g",
            "h", "i", "j", "k", "l", "m", "n",
            "o", "p", "q", "r", "s", "t", "u",
            "v", "w", "x", "y", "z", " "};
    /**
     * 大写字母集
     */
    public static String[] ABC = new String[]{
            "A", "B", "C", "D", "E", "F", "G",
            "H", "I", "J", "K", "L", "M", "N",
            "O", "P", "Q", "R", "S", "T", "U",
            "V", "W", "X", "Y", "Z", " "};

    public static String[] BOOKS = new String[]{"《两种文化》", "《菊与刀》", "《古兰经》", "《圣经》", "《论学术的进展》", "《哈姆雷特》", "《英雄与英雄崇拜》", "《社会契约论》", "《电磁通论》", "《民族心理学》", "《文集》", "《细胞病理学》", "《城堡》", "《原始文化》", "《印度的发现》", "《极端的年代》", "《1984年》", "《共和国》", "《自由与组织》", "《知识分子的代表》", "《我的奋斗》", "《红楼梦》", "《共产党宣言》", "《战争与和平法》", "《作为意志和表象的世界》", "《双城记》", "《化学原论》", "《奥义书》", "《符号形式的哲学》", "《人工物的科学》", "《生命是什么?》", "《随笔集》", "《老实人或乐观主义》", "《梦的解析》", "《历史研究》", "《对策论与经济行为》", "《人力资本》", "《唐·吉诃德》", "《经济发展理论》", "《有闲阶级论》", "《老子》", "《偶然与必然》", "《论语》", "《神学大全》", "《第三次浪潮》", "《句法结构》", "《道德与立法原理引论》", "《寂静的春天》", "《国家与革命》", "《查泰莱夫人的情人》", "《百年孤独》", "《老实人》", "《国富论》", "《人口原理》", "《文明的冲突与世界秩序的重建》", "《自然哲学的数学原理》", "《玫瑰的名字》", "《卡拉马佐夫兄弟们》", "《无名的裘德》", "《新教伦理与资本主义精神》", "《理解媒体》", "《15至18世纪的物质文明、经济与资本主义》", "《人与超人》", "《鼠疫》", "《动机与人格》", "《第二性》", "《物种起源》", "《工具论》", "《道德经》", "《就业、利息和货币通论》", "《科学与近代世界》", "《群众与权力》", "《审判》", "《正义论》", "《中国的科学与文明》", "《控制论》", "《科学革命的结构》", "《孙子兵法》", "《伪币制造者》", "《经济增长的阶段》", "《阿含经》", "《词与物》", "《国家与市场》", "《浮士德》", "《方法谈》", "《科学发现的逻辑》", "《一维的人》", "《几何原本》", "《查拉图斯特拉如是说》", "《战争与和平》", "《阿Q正传》", "《毛主席语录》", "《论自由》", "《社会生物学：新的综合》", "《鲁滨逊飘流记》", "《黑暗的心》", "《民主主义与教育》", "《新科学》", "《实证哲学教程》", "《思想录》", "《论法的精神》", "《通往奴役之路》", "《工业管理与一般管理》", "《最后的知识分子》"};

    /**
     * 百家姓
     */
    public static String[] XING = new String[]{"赵", "钱", "孙", "李", "周", "吴", "郑", "王", "冯", "陈", "褚", "卫", "蒋", "沈", "韩", "杨", "朱", "秦", "尤", "许", "何", "吕", "施", "张", "孔", "曹", "严", "华", "金", "魏", "陶", "姜", "戚", "谢", "邹", "喻", "柏", "水", "窦", "章", "云", "苏", "潘", "葛", "奚", "范", "彭", "郎", "鲁", "韦", "昌", "马", "苗", "凤", "花", "方", "俞", "任", "袁", "柳", "酆", "鲍", "史", "唐", "费", "廉", "岑", "薛", "雷", "贺", "倪", "汤", "滕", "殷", "罗", "毕", "郝", "邬", "安", "常", "乐", "于", "时", "傅", "皮", "卞", "齐", "康", "伍", "余", "元", "卜", "顾", "孟", "平", "黄", "和", "穆", "萧", "尹", "姚", "邵", "湛", "汪", "祁", "毛", "禹", "狄", "米", "贝", "明", "臧", "计", "伏", "成", "戴", "谈", "宋", "茅", "庞", "熊", "纪", "舒", "屈", "项", "祝", "董", "粱", "杜", "阮", "蓝", "闵", "席", "季", "麻", "强", "贾", "路", "娄", "危", "江", "童", "颜", "郭", "梅", "盛", "林", "刁", "钟", "徐", "邱", "骆", "高", "夏", "蔡", "田", "樊", "胡", "凌", "霍", "虞", "万", "支", "柯", "昝", "管", "卢", "莫", "经", "房", "裘", "缪", "干", "解", "应", "宗", "丁", "宣", "贲", "邓", "郁", "单", "杭", "洪", "包", "诸", "左", "石", "崔", "吉", "钮", "龚", "程", "嵇", "邢", "滑", "裴", "陆", "荣", "翁", "荀", "羊", "於", "惠", "甄", "麴", "家", "封", "芮", "羿", "储", "靳", "汲", "邴", "糜", "松", "井", "段", "富", "巫", "乌", "焦", "巴", "弓", "牧", "隗", "山", "谷", "车", "侯", "宓", "蓬", "全", "郗", "班", "仰", "秋", "仲", "伊", "宫", "宁", "仇", "栾", "暴", "甘", "钭", "厉", "戎", "祖", "武", "符", "刘", "景", "詹", "束", "龙", "叶", "幸", "司", "韶", "郜", "黎", "蓟", "薄", "印", "宿", "白", "怀", "蒲", "邰", "从", "鄂", "索", "咸", "籍", "赖", "卓", "蔺", "屠", "蒙", "池", "乔", "阴", "欎", "胥", "能", "苍", "双", "闻", "莘", "党", "翟", "谭", "贡", "劳", "逄", "姬", "申", "扶", "堵", "冉", "宰", "郦", "雍", "舄", "璩", "桑", "桂", "濮", "牛", "寿", "通", "边", "扈", "燕", "冀", "郏", "浦", "尚", "农", "温", "别", "庄", "晏", "柴", "瞿", "阎", "充", "慕", "连", "茹", "习", "宦", "艾", "鱼", "容", "向", "古", "易", "慎", "戈", "廖", "庾", "终", "暨", "居", "衡", "步", "都", "耿", "满", "弘", "匡", "国", "文", "寇", "广", "禄", "阙", "东", "殴", "殳", "沃", "利", "蔚", "越", "夔", "隆", "师", "巩", "厍", "聂", "晁", "勾", "敖", "融", "冷", "訾", "辛", "阚", "那", "简", "饶", "空", "曾", "毋", "沙", "乜", "养", "鞠", "须", "丰", "巢", "关", "蒯", "相", "查", "後", "荆", "红", "游", "竺", "权", "逯", "盖", "益", "桓", "公", "万俟", "司马", "上官", "欧阳", "夏侯", "诸葛", "闻人", "东方", "赫连", "皇甫", "尉迟", "公羊", "澹台", "公冶", "宗政", "濮阳", "淳于", "单于", "太叔", "申屠", "公孙", "仲孙", "轩辕", "令狐", "钟离", "宇文", "长孙", "慕容", "鲜于", "闾丘", "司徒", "司空", "亓官", "司寇", "仉", "督", "子车", "颛孙", "端木", "巫马", "公西", "漆雕", "乐正", "壤驷", "公良", "拓跋", "夹谷", "宰父", "谷梁", "晋", "楚", "闫", "法", "汝", "鄢", "涂", "钦", "段干", "百里", "东郭", "南门", "呼延", "归", "海", "羊舌", "微生", "岳", "帅", "缑", "亢", "况", "后", "有", "琴", "梁丘", "左丘", "东门", "西门", "商", "牟", "佘", "佴", "伯", "赏", "南宫", "墨", "哈", "谯", "笪", "年", "爱", "阳", "佟"};

    public static String[] MING = new String[]{
            "风", "花", "雪", "月", "雷", "电", "风",
            "霜", "星", "阳", "日", "天", "龙", "凤",
            "洪", "梦", "瑶", "茜", "玉", "富", "轩",
            "玉", "宝", "智", "峰", "贵", "城", "强", "德", "美","英","舞","川"};

    /**
     * 中国省份
     */
    public static String[] PROVINCES = new String[]{"北京市", "天津市", "上海市", "重庆市", "河北省", "山西省", "辽宁省", "吉林省", "黑龙江省", "江苏省", "浙江省", "安徽省", "福建省", "江西省", "山东省", "河南省", "湖北省", "湖南省", "广东省", "海南省", "四川省", "贵州省", "云南省", "陕西省", "甘肃省", "青海省", "台湾省", "内蒙古自治区", "广西壮族自治区", "西藏自治区", "宁夏回族自治区", "新疆维吾尔自治区", "香港特别行政区", "澳门特别行政区"};


    public static String[] CONG_CONG = new String[]{"燕", "子", "去", "了", "有", "再", "来", "的", "时", "候", "杨", "柳", "枯", "了", "有", "再", "青", "的", "时", "候", "桃", "花", "谢", "了", "有", "再", "开", "的", "时", "候", "但", "是", "聪", "明", "的", "你", "告", "诉", "我", "我", "们", "的", "日", "子", "为", "什", "么", "一", "去", "不", "复", "返", "呢", "是", "有", "人", "偷", "了", "他", "们", "罢", "那", "是", "谁", "又", "藏", "在", "何", "处", "呢", "是", "他", "们", "自", "己", "逃", "走", "了", "罢", "现", "在", "又", "到", "了", "哪", "里", "呢", "我", "不", "知", "道", "他", "们", "给", "了", "我", "多", "少", "日", "子", "但", "我", "的", "手", "确", "乎", "是", "渐", "渐", "空", "虚", "了", "在", "默", "默", "里", "算", "着", "八", "千", "多", "日", "子", "已", "经", "从", "我", "手", "中", "溜", "去", "像", "针", "尖", "上", "一", "滴", "水", "滴", "在", "大", "海", "里", "我", "的", "日", "子", "滴", "在", "时", "间", "的", "流", "里", "没", "有", "声", "音", "也", "没", "有", "影", "子", "我", "不", "禁", "头", "涔", "涔", "而", "泪", "潸", "潸", "了", "去", "的", "尽", "管", "去", "了", "来", "的", "尽", "管", "来", "着", "去", "来", "的", "中", "间", "又", "怎", "样", "地", "匆", "匆", "呢", "早", "上", "我", "起", "来", "的", "时", "候", "小", "屋", "里", "射", "进", "两", "三", "方", "斜", "斜", "的", "太", "阳", "太", "阳", "他", "有", "脚", "啊", "轻", "轻", "悄", "悄", "地", "挪", "移", "了", "我", "也", "茫", "茫", "然", "跟", "着", "旋", "转", "于", "是", "洗", "手", "的", "时", "候", "日", "子", "从", "水", "盆", "里", "过", "去", "吃", "饭", "的", "时", "候", "日", "子", "从", "饭", "碗", "里", "过", "去", "默", "默", "时", "便", "从", "凝", "然", "的", "双", "眼", "前", "过", "去", "我", "觉", "察", "他", "去", "的", "匆", "匆", "了", "伸", "出", "手", "遮", "挽", "时", "他", "又", "从", "遮", "挽", "着", "的", "手", "边", "过", "去", "天", "黑", "时", "我", "躺", "在", "床", "上", "他", "便", "伶", "伶", "俐", "俐", "地", "从", "我", "身", "上", "跨", "过", "从", "我", "脚", "边", "飞", "去", "了", "等", "我", "睁", "开", "眼", "和", "太", "阳", "再", "见", "这", "算", "又", "溜", "走", "了", "一", "日", "我", "掩", "着", "面", "叹", "息", "但", "是", "新", "来", "的", "日", "子", "的", "影", "儿", "又", "开", "始", "在", "叹", "息", "里", "闪", "过", "了", "在", "逃", "去", "如", "飞", "的", "日", "子", "里", "在", "千", "门", "万", "户", "的", "世", "界", "里", "的", "我", "能", "做", "些", "什", "么", "呢", "只", "有", "徘", "徊", "罢", "了", "只", "有", "匆", "匆", "罢", "了", "在", "八", "千", "多", "日", "的", "匆", "匆", "里", "除", "徘", "徊", "外", "又", "剩", "些", "什", "么", "呢", "过", "去", "的", "日", "子", "如", "轻", "烟", "被", "微", "风", "吹", "散", "了", "如", "薄", "雾", "被", "初", "阳", "蒸", "融", "了", "我", "留", "着", "些", "什", "么", "痕", "迹", "呢", "我", "何", "曾", "留", "着", "像", "游", "丝", "样", "的", "痕", "迹", "呢", "我", "赤", "裸", "裸", "来", "到", "这", "世", "界", "转", "眼", "间", "也", "将", "赤", "裸", "裸", "的", "回", "去", "罢", "但", "不", "能", "平", "的", "为", "什", "么", "偏", "要", "白", "白", "走", "这", "一", "遭", "啊", "你", "聪", "明", "的", "告", "诉", "我", "我", "们", "的", "日", "子", "为", "什", "么", "一", "去", "不", "复", "返", "呢"};
    public static String[] SEN_CONG_CONG = new String[]{"燕子去了，有再来的时候；杨柳枯了，有再青的时候；桃花谢了，有再开的时候", "但是，聪明的，你告诉我，我们的日子为什么一去不复返呢", "——是有人偷了他们罢：那是谁", "又藏在何处呢", "是他们自己逃走了罢：现在又到了哪里呢", "我不知道他们给了我多少日子；但我的手确乎是渐渐空虚了", "在默默里算着，八千多日子已经从我手中溜去；像针尖上一滴水滴在大海里，我的日子滴在时间的流里，没有声音，也没有影子", "我不禁头涔涔而泪潸潸了", "去的尽管去了，来的尽管来着；去来的中间，又怎样地匆匆呢", "早上我起来的时候，小屋里射进两三方斜斜的太阳", "太阳他有脚啊，轻轻悄悄地挪移了；我也茫茫然跟着旋转", "于是——洗手的时候，日子从水盆里过去；吃饭的时候，日子从饭碗里过去；默默时，便从凝然的双眼前过去", "我觉察他去的匆匆了，伸出手遮挽时，他又从遮挽着的手边过去，天黑时，我躺在床上，他便伶伶俐俐地从我身上跨过，从我脚边飞去了", "等我睁开眼和太阳再见，这算又溜走了一日", "我掩着面叹息", "但是新来的日子的影儿又开始在叹息里闪过了", "在逃去如飞的日子里，在千门万户的世界里的我能做些什么呢", "只有徘徊罢了，只有匆匆罢了；在八千多日的匆匆里，除徘徊外，又剩些什么呢", "过去的日子如轻烟，被微风吹散了，如薄雾，被初阳蒸融了；我留着些什么痕迹呢", "我何曾留着像游丝样的痕迹呢", "我赤裸裸来到这世界，转眼间也将赤裸裸的回去罢", "但不能平的，为什么偏要白白走这一遭啊", "你聪明的，告诉我，我们的日子为什么一去不复返呢"};

    public static String[] SEN_HTYS = new String[]{"这几天心里颇不宁静", "今晚在院子里坐着乘凉，忽然想起日日走过的荷塘，在这满月的光里，总该另有一番样子吧", "月亮渐渐地升高了，墙外马路上孩子们的欢笑，已经听不见了；妻在屋里拍着闰儿，迷迷糊糊地哼着眠歌", "我悄悄地披了大衫，带上门出去", "沿着荷塘，是一条曲折的小煤屑路", "这是一条幽僻的路；白天也少人走，夜晚更加寂寞", "荷塘四面，长着许多树，蓊蓊郁郁的", "路的一旁，是些杨柳，和一些不知道名字的树", "没有月光的晚上，这路上阴森森的，有些怕人", "今晚却很好，虽然月光也还是淡淡的", "路上只我一个人，背着手踱着", "这一片天地好像是我的；我也像超出了平常的自己，到了另一世界里", "我爱热闹，也爱冷静；爱群居，也爱独处", "像今晚上，一个人在这苍茫的月下，什么都可以想，什么都可以不想，便觉是个自由的人", "白天里一定要做的事，一定要说的话，现在都可不理", "这是独处的妙处，我且受用这无边的荷香月色好了", "曲曲折折的荷塘上面，弥望的是田田的叶子", "叶子出水很高，像亭亭的舞女的裙", "层层的叶子中间，零星地点缀着些白花，有袅娜地开着的，有羞涩地打着朵儿的；正如一粒粒的明珠，又如碧天里的星星，又如刚出浴的美人", "微风过处，送来缕缕清香，仿佛远处高楼上渺茫的歌声似的", "这时候叶子与花也有一丝的颤动，像闪电般，霎时传过荷塘的那边去了", "叶子本是肩并肩密密地挨着，这便宛然有了一道凝碧的波痕", "叶子底下是脉脉的流水，遮住了，不能见一些颜色；而叶子却更见风致了", "月光如流水一般，静静地泻在这一片叶子和花上", "薄薄的青雾浮起在荷塘里", "叶子和花仿佛在牛乳中洗过一样；又像笼着轻纱的梦", "虽然是满月，天上却有一层淡淡的云，所以不能朗照；但我以为这恰是到了好处——酣眠固不可少，小睡也别有风味的", "月光是隔了树照过来的，高处丛生的灌木，落下参差的斑驳的黑影，峭楞楞如鬼一般；弯弯的杨柳的稀疏的倩影，却又像是画在荷叶上", "塘中的月色并不均匀；但光与影有着和谐的旋律，如梵婀玲上奏着的名曲", "荷塘的四面，远远近近，高高低低都是树，而杨柳最多", "这些树将一片荷塘重重围住；只在小路一旁，漏着几段空隙，像是特为月光留下的", "树色一例是阴阴的，乍看像一团烟雾；但杨柳的丰姿，便在烟雾里也辨得出", "树梢上隐隐约约的是一带远山，只有些大意罢了", "树缝里也漏着一两点路灯光，没精打采的，是渴睡人的眼", "这时候最热闹的，要数树上的蝉声与水里的蛙声；但热闹是它们的，我什么也没有", "忽然想起采莲的事情来了", "采莲是江南的旧俗，似乎很早就有，而六朝时为盛；从诗歌里可以约略知道", "采莲的是少年的女子，她们是荡着小船，唱着艳歌去的", "采莲人不用说很多，还有看采莲的人", "那是一个热闹的季节，也是一个风流的季节", "梁元帝《采莲赋》里说得好：于是妖童媛女，荡舟心许；鷁首徐回，兼传羽杯；欋将移而藻挂，船欲动而萍开", "尔其纤腰束素，迁延顾步；夏始春余，叶嫩花初，恐沾裳而浅笑，畏倾船而敛裾", "可见当时嬉游的光景了", "这真是有趣的事，可惜我们现在早已无福消受了", "于是又记起《西洲曲》里的句子：采莲南塘秋，莲花过人头；低头弄莲子，莲子清如水", "今晚若有采莲人，这儿的莲花也算得“过人头”了；只不见一些流水的影子，是不行的", "这令我到底惦着江南了", "——这样想着，猛一抬头，不觉已是自己的门前；轻轻地推门进去，什么声息也没有，妻已睡熟好久了"};

    public static String[] SPRING = new String[]{"盼", "望", "着", "盼", "望", "着", "东", "风", "来", "了", "春", "天", "的", "脚", "步", "近", "了", "一", "切", "都", "像", "刚", "睡", "醒", "的", "样", "子", "欣", "欣", "然", "张", "开", "了", "眼", "山", "朗", "润", "起", "来", "了", "水", "涨", "起", "来", "了", "太", "阳", "的", "脸", "红", "起", "来", "了", "小", "草", "偷", "偷", "地", "从", "土", "地", "里", "钻", "出", "来", "嫩", "嫩", "的", "绿", "绿", "的", "园", "子", "里", "田", "野", "里", "瞧", "去", "一", "大", "片", "一", "大", "片", "满", "是", "的", "坐", "着", "躺", "着", "打", "两", "个", "滚", "踢", "几", "脚", "球", "赛", "几", "趟", "跑", "捉", "几", "回", "迷", "藏", "风", "轻", "悄", "悄", "的", "草", "软", "绵", "绵", "的", "桃", "树", "杏", "树", "梨", "树", "你", "不", "让", "我", "我", "不", "让", "你", "都", "开", "满", "了", "花", "赶", "趟", "儿", "红", "的", "像", "火", "粉", "的", "像", "霞", "白", "的", "像", "雪", "花", "里", "带", "着", "甜", "味", "；", "闭", "了", "眼", "树", "上", "仿", "佛", "已", "经", "满", "是", "桃", "儿", "杏", "儿", "梨", "儿", "花", "下", "成", "千", "成", "百", "的", "蜜", "蜂", "嗡", "嗡", "的", "闹", "着", "大", "小", "的", "蝴", "蝶", "飞", "来", "飞", "去", "野", "花", "遍", "地", "是", "：", "杂", "样", "儿", "有", "名", "字", "的", "没", "名", "字", "的", "散", "在", "草", "丛", "里", "像", "眼", "睛", "像", "星", "星", "还", "眨", "呀", "眨", "的", "吹", "面", "不", "寒", "杨", "柳", "风", "不", "错", "的", "像", "母", "亲", "的", "手", "抚", "摸", "着", "你", "风", "里", "带", "着", "些", "新", "翻", "的", "泥", "土", "的", "气", "息", "混", "着", "青", "草", "味", "儿", "还", "有", "各", "种", "花", "的", "香", "都", "在", "微", "微", "润", "湿", "的", "空", "气", "里", "酝", "酿", "鸟", "儿", "将", "巢", "安", "在", "繁", "花", "嫩", "叶", "当", "中", "高", "兴", "起", "来", "了", "呼", "朋", "引", "伴", "的", "卖", "弄", "清", "脆", "的", "歌", "喉", "唱", "出", "婉", "转", "的", "曲", "子", "跟", "清", "风", "流", "水", "应", "和", "着", "牛", "背", "上", "牧", "童", "的", "短", "笛", "这", "时", "候", "也", "成", "天", "嘹", "亮", "的", "响", "着", "雨", "是", "最", "寻", "常", "的", "一", "下", "就", "是", "三", "两", "天", "可", "别", "恼", "看", "像", "牛", "毛", "像", "花", "针", "像", "细", "丝", "密", "密", "地", "斜", "织", "着", "人", "家", "屋", "顶", "上", "全", "笼", "着", "一", "层", "薄", "烟", "树", "叶", "却", "绿", "得", "发", "亮", "小", "草", "也", "青", "得", "逼", "你", "的", "眼", "傍", "晚", "时", "候", "上", "灯", "了", "一", "点", "点", "黄", "晕", "的", "光", "烘", "托", "出", "一", "片", "安", "静", "而", "和", "平", "的", "夜", "在", "乡", "下", "小", "路", "上", "石", "桥", "边", "有", "撑", "着", "伞", "慢", "慢", "走", "着", "的", "人", "地", "里", "还", "有", "工", "作", "的", "农", "民", "披", "着", "蓑", "戴", "着", "笠", "他", "们", "的", "房", "屋", "稀", "稀", "疏", "疏", "的", "在", "雨", "里", "静", "默", "着", "天", "上", "的", "风", "筝", "渐", "渐", "多", "了", "地", "上", "的", "孩", "子", "也", "多", "了", "城", "里", "乡", "下", "家", "家", "户", "户", "老", "老", "小", "小", "也", "赶", "趟", "似", "的", "一", "个", "个", "都", "出", "来", "了", "舒", "活", "舒", "活", "筋", "骨", "抖", "擞", "抖", "擞", "精", "神", "各", "做", "各", "的", "一", "份", "事", "儿", "去", "一", "年", "之", "计", "在", "于", "春", "刚", "起", "头", "儿", "有", "的", "是", "功", "夫", "有", "的", "是", "希", "望", "春", "天", "像", "刚", "落", "地", "的", "娃", "娃", "从", "头", "到", "脚", "都", "是", "新", "的", "它", "生", "长", "着", "春", "天", "像", "小", "姑", "娘", "花", "枝", "招", "展", "的", "笑", "着", "走", "着", "春", "天", "像", "健", "壮", "的", "青", "年", "有", "铁", "一", "般", "的", "胳", "膊", "和", "腰", "脚", "领", "着", "我", "们", "向", "前", "去"};

    public static String[] EMAIL = new String[]{"309271243@qq.com","463843103@qq.com","188676021@qq.com","405434395@qq.com","531107538@qq.com","2522695703@qq.com","1362834925@qq.com","420538494@qq.com","2514719426@qq.com","805939917@qq.com","820508871@qq.com","374741351@qq.com","780197542@qq.com","646298139@qq.com","879986816@qq.com","849094271@qq.com","562342887@qq.com","wslmx19940208@qq.com","547251572@qq.com","793203822@qq.com","522273243@qq.com","914184206@qq.com","530614263@qq.com","uff0c516196032@qq.com","709470229@qq.com","552918264@qq.com","u697c1262281146@qq.com","932461176@qq.com","869193763@qq.com","345637358@qq.com","919649417@qq.com","576412250@qq.com","405434395@qq.com","531065591@qq.com","274887860@qq.com","810047429@qq.com","1223357798@qq.com","uff011071020150@qq.com","494388004@qq.com","452806138@qq.com","275750588@qq.com","tchzw@126.com","954007646@aw.com","641153394@qq.com","1163169455@qq.com","512907981@qq.com","834221816@qq.com","465855898@qq.com","1105575587@qq.com","2482027271@qq.com","1913416436@qq.com","1577941070@qq.com","897153762@qq.com","2974224377@qq.com","798192847@qq.com","391824291@qq.com","569101239@qq.com","315041654@qq.com","394733048@qq.com","302552894@qq.com","1975995027@qq.com","773032135@qq.com","965049083@qq.com","295973125@qq.com","287816407@qq.com","529431213@qq.com","328830080@qq.com","494388004@qq.com","690562665@qq.com","499292792@qq.com","834533421@qq.com","768323520@qq.com","294781424@qq.com","1364361959@qq.com","1041535634@qq.com","liutao18345@163.com","835890539@qq.com","463778884@qq.com","460178466@qq.com","2396910329@qq.com","782727552@qq.com","924561752@qq.com","947510947@qq.com","453909042@qq.com","994275146@qq.com","1172456682@qq.com","568103293@qq.com","516602849@qq.com","592874808@qq.com","1010667094@qq.com","1511919579@qq.com","413997372@qq.com","786564307@qq.com","1009390815@qq.com","690562665@qq.com","853076066@qq.com","651309418@qq.com","905348473@qq.com","1312239370@qq.com","526710003@qq.com","651148809@qq.com","943507249@qq.com","1113846679@qq.com","749519236@qq.com","552918264@qq.com","1505894896@qq.com","295973125@qq.com","396379110@qq.com","244282464@qq.com","1844489821@qq.com","912039654@qq.com","749519236@qq.com","475671042@qq.com","1135894082@qq.com","547053198@qq.com","732666784@qq.com","550850281@qq.com","290102150@qq.com","511302066@qq.com","451614355@qq.com","853076066@qq.com","429457106@qq.com","490463025@qq.com","1354132201@qq.com","531382089@qq.com","23876638@qq.com","1739700693@qq.com","1822959784@qq.com","1147236660@qq.com","905315048@qq.com","849549376@qq.com","516930444@qq.com","404134406@qq.com","wangshizhihao@foxmail.com","2507003180@qq.com","349765167@qq.com","472564802@qq.com","709759914@qq.com","441891602@qq.com","521176494@qq.com","943895988@qq.com","hui277205670@126.com","1310601511@QQ.com","417318589@qq.com","758065117@qq.com","36953775@qq.com","429457106@qq.com","1695654148@qq.com","308542872@qq.com","826989580@qq.com","2575995141@qq.com","772707149@qq.com","31327840@qq.com","648195981@qq.com","452639095@qq.com","619399468@qq.com","362464938@qq.com","651768744@qq.com","572619372@qq.com","1965820861@qq.com","1937150225@qq.com","ggl0228@163.com","1933650832@qq.com","1455911373@qq.com","363079643@qq.com","2296480080@qq.com","1023947094@qq.com","1023947094@qq.com","51857637@qq.com","960946764@qq.com","876276051@qq.com","844193032@qq.com","369217756@qq.com","185509551@qq.com","694465639@qq.com","1695654148@qq.com","473388505@qq.com","2651236891@qq.com","991620701@qq.com","hzwhyrz@163.com","125460232@qq.com","1131566315@qq.com","1014357045@qq.com","296821896@qq.com","361692642@qq.com","954990112@qq.com","376691979@qq.com","615907367@qq.com","576744324@qq.com","308396568@qq.com","1506831146@qq.com","932461176@qq.com","594826764@qq.com","1213404780@qq.com","1391340342@qq.com","1153663828@qq.com","454731031@qq.com","1575665658@qq.com","354408582@qq.com","184215041@qq.com","425758878@qq.com","863452823@qq.com","1149079187@qq.com","1342580812@qq.com","473388505@qq.com","568134489@qq.com","958968373@qq.com","657921125@qq.com","1042317171@qq.com","714818434@qq.com","366852627@qq.com","946158916@qq.com","475378214@qq.com","1203243122@qq.com","1512158755@qq.com","1285069555@qq.com","1621339817@qq.com","348033961@qq.com","404785413@qq.com","552035003@qq.com","460524796@qq.com","337066243@qq.com","915625764@qq.com","lanxyun@qq.com","315051901@qq.com","1294992891@qq.com","291979564@qq.com","369347190@qq.com","wx807663414@qq.com","002@qq.com","2654935311@qq.com","937681952@qq.com","1164093162@qq.com","568134489@qq.com",};
}
