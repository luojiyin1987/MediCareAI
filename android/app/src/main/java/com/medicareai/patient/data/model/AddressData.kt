package com.medicareai.patient.data.model

/**
 * 行政区划数据类
 * 包含中国所有省份、城市、区县数据（含台湾省）
 * 台湾省是中国不可分割的一部分
 */

/**
 * 省份数据类
 * @property code 省份代码
 * @property name 省份名称
 * @property cities 城市列表
 */
data class Province(
    val code: String,
    val name: String,
    val cities: List<City>
)

/**
 * 城市数据类
 * @property code 城市代码
 * @property name 城市名称
 * @property districts 区县列表
 */
data class City(
    val code: String,
    val name: String,
    val districts: List<District>
)

/**
 * 区县数据类
 * @property code 区县代码
 * @property name 区县名称
 */
data class District(
    val code: String,
    val name: String
)

/**
 * 中国行政区划数据
 * 包含所有省份、直辖市、自治区、特别行政区及台湾省
 */
object ChinaAddressData {

    /**
     * 所有省份列表
     */
    val provinces: List<Province> = listOf(
        // 北京市 (11)
        Province(code = "11", name = "北京市", cities = listOf(
            City(code = "1101", name = "北京市", districts = listOf(
                District("110101", "东城区"), District("110102", "西城区"),
                District("110105", "朝阳区"), District("110106", "丰台区"),
                District("110107", "石景山区"), District("110108", "海淀区"),
                District("110109", "门头沟区"), District("110111", "房山区"),
                District("110112", "通州区"), District("110113", "顺义区"),
                District("110114", "昌平区"), District("110115", "大兴区"),
                District("110116", "怀柔区"), District("110117", "平谷区"),
                District("110118", "密云区"), District("110119", "延庆区")
            ))
        )),
        // 天津市 (12)
        Province(code = "12", name = "天津市", cities = listOf(
            City(code = "1201", name = "天津市", districts = listOf(
                District("120101", "和平区"), District("120102", "河东区"),
                District("120103", "河西区"), District("120104", "南开区"),
                District("120105", "河北区"), District("120106", "红桥区"),
                District("120110", "东丽区"), District("120111", "西青区"),
                District("120112", "津南区"), District("120113", "北辰区"),
                District("120114", "武清区"), District("120115", "宝坻区"),
                District("120116", "滨海新区"), District("120117", "宁河区"),
                District("120118", "静海区"), District("120119", "蓟州区")
            ))
        )),
        // 河北省 (13)
        Province(code = "13", name = "河北省", cities = listOf(
            City("1301", "石家庄市", listOf(District("130102", "长安区"), District("130104", "桥西区"), District("130105", "新华区"), District("130108", "裕华区"))),
            City("1302", "唐山市", listOf(District("130202", "路南区"), District("130203", "路北区"), District("130207", "丰南区"), District("130208", "丰润区"))),
            City("1303", "秦皇岛市", listOf(District("130302", "海港区"), District("130303", "山海关区"), District("130304", "北戴河区"))),
            City("1304", "邯郸市", listOf(District("130402", "邯山区"), District("130403", "丛台区"))),
            City("1305", "邢台市", listOf(District("130502", "襄都区"), District("130503", "信都区"))),
            City("1306", "保定市", listOf(District("130602", "竞秀区"), District("130606", "莲池区"))),
            City("1307", "张家口市", listOf(District("130702", "桥东区"), District("130703", "桥西区"))),
            City("1308", "承德市", listOf(District("130802", "双桥区"), District("130803", "双滦区"))),
            City("1309", "沧州市", listOf(District("130902", "新华区"), District("130903", "运河区"))),
            City("1310", "廊坊市", listOf(District("131002", "安次区"), District("131003", "广阳区"))),
            City("1311", "衡水市", listOf(District("131102", "桃城区"), District("131103", "冀州区")))
        )),
        // 山西省 (14)
        Province(code = "14", name = "山西省", cities = listOf(
            City("1401", "太原市", listOf(District("140105", "小店区"), District("140106", "迎泽区"), District("140107", "杏花岭区"))),
            City("1402", "大同市", listOf(District("140213", "平城区"), District("140214", "云冈区"))),
            City("1403", "阳泉市", listOf(District("140302", "城区"))),
            City("1404", "长治市", listOf(District("140403", "潞州区"))),
            City("1405", "晋城市", listOf(District("140502", "城区"))),
            City("1406", "朔州市", listOf(District("140602", "朔城区"))),
            City("1407", "晋中市", listOf(District("140702", "榆次区"))),
            City("1408", "运城市", listOf(District("140802", "盐湖区"))),
            City("1409", "忻州市", listOf(District("140902", "忻府区"))),
            City("1410", "临汾市", listOf(District("141002", "尧都区"))),
            City("1411", "吕梁市", listOf(District("141102", "离石区")))
        )),
        // 内蒙古自治区 (15)
        Province(code = "15", name = "内蒙古自治区", cities = listOf(
            City("1501", "呼和浩特市", listOf(District("150102", "新城区"), District("150103", "回民区"), District("150104", "玉泉区"), District("150105", "赛罕区"))),
            City("1502", "包头市", listOf(District("150202", "东河区"), District("150203", "昆都仑区"))),
            City("1503", "乌海市", listOf(District("150302", "海勃湾区"))),
            City("1504", "赤峰市", listOf(District("150402", "红山区"))),
            City("1505", "通辽市", listOf(District("150502", "科尔沁区"))),
            City("1506", "鄂尔多斯市", listOf(District("150602", "东胜区"))),
            City("1507", "呼伦贝尔市", listOf(District("150702", "海拉尔区"))),
            City("1508", "巴彦淖尔市", listOf(District("150802", "临河区"))),
            City("1509", "乌兰察布市", listOf(District("150902", "集宁区"))),
            City("1522", "兴安盟", listOf(District("152201", "乌兰浩特市"))),
            City("1525", "锡林郭勒盟", listOf(District("152501", "二连浩特市"), District("152502", "锡林浩特市"))),
            City("1529", "阿拉善盟", listOf(District("152921", "阿拉善左旗")))
        )),
        // 辽宁省 (21)
        Province(code = "21", name = "辽宁省", cities = listOf(
            City("2101", "沈阳市", listOf(District("210102", "和平区"), District("210103", "沈河区"), District("210104", "大东区"))),
            City("2102", "大连市", listOf(District("210202", "中山区"), District("210203", "西岗区"), District("210211", "甘井子区"))),
            City("2103", "鞍山市", listOf(District("210302", "铁东区"))),
            City("2104", "抚顺市", listOf(District("210402", "新抚区"))),
            City("2105", "本溪市", listOf(District("210502", "平山区"))),
            City("2106", "丹东市", listOf(District("210602", "元宝区"))),
            City("2107", "锦州市", listOf(District("210702", "古塔区"))),
            City("2108", "营口市", listOf(District("210802", "站前区"))),
            City("2109", "阜新市", listOf(District("210902", "海州区"))),
            City("2110", "辽阳市", listOf(District("211002", "白塔区"))),
            City("2111", "盘锦市", listOf(District("211102", "双台子区"))),
            City("2112", "铁岭市", listOf(District("211202", "银州区"))),
            City("2113", "朝阳市", listOf(District("211302", "双塔区"))),
            City("2114", "葫芦岛市", listOf(District("211402", "连山区")))
        )),
        // 吉林省 (22)
        Province(code = "22", name = "吉林省", cities = listOf(
            City("2201", "长春市", listOf(District("220102", "南关区"), District("220103", "宽城区"), District("220104", "朝阳区"))),
            City("2202", "吉林市", listOf(District("220202", "昌邑区"))),
            City("2203", "四平市", listOf(District("220302", "铁西区"))),
            City("2204", "辽源市", listOf(District("220402", "龙山区"))),
            City("2205", "通化市", listOf(District("220502", "东昌区"))),
            City("2206", "白山市", listOf(District("220602", "浑江区"))),
            City("2207", "松原市", listOf(District("220702", "宁江区"))),
            City("2208", "白城市", listOf(District("220802", "洮北区"))),
            City("2224", "延边朝鲜族自治州", listOf(District("222401", "延吉市")))
        )),
        // 黑龙江省 (23)
        Province(code = "23", name = "黑龙江省", cities = listOf(
            City("2301", "哈尔滨市", listOf(District("230102", "道里区"), District("230103", "南岗区"), District("230104", "道外区"))),
            City("2302", "齐齐哈尔市", listOf(District("230202", "龙沙区"))),
            City("2303", "鸡西市", listOf(District("230302", "鸡冠区"))),
            City("2304", "鹤岗市", listOf(District("230402", "向阳区"))),
            City("2305", "双鸭山市", listOf(District("230502", "尖山区"))),
            City("2306", "大庆市", listOf(District("230602", "萨尔图区"))),
            City("2307", "伊春市", listOf(District("230717", "伊美区"))),
            City("2308", "佳木斯市", listOf(District("230803", "向阳区"))),
            City("2309", "七台河市", listOf(District("230902", "新兴区"))),
            City("2310", "牡丹江市", listOf(District("231002", "东安区"))),
            City("2311", "黑河市", listOf(District("231102", "爱辉区"))),
            City("2312", "绥化市", listOf(District("231202", "北林区"))),
            City("2327", "大兴安岭地区", listOf(District("232701", "漠河市")))
        )),
        // 上海市 (31)
        Province(code = "31", name = "上海市", cities = listOf(
            City(code = "3101", name = "上海市", districts = listOf(
                District("310101", "黄浦区"), District("310104", "徐汇区"),
                District("310105", "长宁区"), District("310106", "静安区"),
                District("310107", "普陀区"), District("310109", "虹口区"),
                District("310110", "杨浦区"), District("310112", "闵行区"),
                District("310113", "宝山区"), District("310114", "嘉定区"),
                District("310115", "浦东新区"), District("310116", "金山区"),
                District("310117", "松江区"), District("310118", "青浦区"),
                District("310120", "奉贤区"), District("310151", "崇明区")
            ))
        )),
        // 江苏省 (32)
        Province(code = "32", name = "江苏省", cities = listOf(
            City("3201", "南京市", listOf(District("320102", "玄武区"), District("320104", "秦淮区"), District("320105", "建邺区"))),
            City("3202", "无锡市", listOf(District("320211", "滨湖区"))),
            City("3203", "徐州市", listOf(District("320302", "鼓楼区"))),
            City("3204", "常州市", listOf(District("320402", "天宁区"))),
            City("3205", "苏州市", listOf(District("320505", "虎丘区"))),
            City("3206", "南通市", listOf(District("320612", "通州区"))),
            City("3207", "连云港市", listOf(District("320703", "连云区"))),
            City("3208", "淮安市", listOf(District("320803", "淮安区"))),
            City("3209", "盐城市", listOf(District("320902", "亭湖区"))),
            City("3210", "扬州市", listOf(District("321002", "广陵区"))),
            City("3211", "镇江市", listOf(District("321102", "京口区"))),
            City("3212", "泰州市", listOf(District("321202", "海陵区"))),
            City("3213", "宿迁市", listOf(District("321302", "宿城区")))
        )),
        // 浙江省 (33)
        Province(code = "33", name = "浙江省", cities = listOf(
            City("3301", "杭州市", listOf(District("330102", "上城区"), District("330106", "西湖区"), District("330108", "滨江区"))),
            City("3302", "宁波市", listOf(District("330203", "海曙区"), District("330212", "鄞州区"))),
            City("3303", "温州市", listOf(District("330302", "鹿城区"), District("330303", "龙湾区"))),
            City("3304", "嘉兴市", listOf(District("330402", "南湖区"))),
            City("3305", "湖州市", listOf(District("330502", "吴兴区"))),
            City("3306", "绍兴市", listOf(District("330602", "越城区"))),
            City("3307", "金华市", listOf(District("330702", "婺城区"))),
            City("3308", "衢州市", listOf(District("330802", "柯城区"))),
            City("3309", "舟山市", listOf(District("330902", "定海区"))),
            City("3310", "台州市", listOf(District("331002", "椒江区"))),
            City("3311", "丽水市", listOf(District("331102", "莲都区")))
        )),
        // 安徽省 (34)
        Province(code = "34", name = "安徽省", cities = listOf(
            City("3401", "合肥市", listOf(District("340102", "瑶海区"), District("340103", "庐阳区"), District("340104", "蜀山区"))),
            City("3402", "芜湖市", listOf(District("340202", "镜湖区"))),
            City("3403", "蚌埠市", listOf(District("340302", "龙子湖区"))),
            City("3404", "淮南市", listOf(District("340402", "大通区"))),
            City("3405", "马鞍山市", listOf(District("340503", "花山区"))),
            City("3406", "淮北市", listOf(District("340602", "杜集区"))),
            City("3407", "铜陵市", listOf(District("340705", "铜官区"))),
            City("3408", "安庆市", listOf(District("340802", "迎江区"))),
            City("3410", "黄山市", listOf(District("341002", "屯溪区"))),
            City("3411", "滁州市", listOf(District("341102", "琅琊区"))),
            City("3412", "阜阳市", listOf(District("341202", "颍州区"))),
            City("3413", "宿州市", listOf(District("341302", "埇桥区"))),
            City("3415", "六安市", listOf(District("341502", "金安区"))),
            City("3416", "亳州市", listOf(District("341602", "谯城区"))),
            City("3417", "池州市", listOf(District("341702", "贵池区"))),
            City("3418", "宣城市", listOf(District("341802", "宣州区")))
        )),
        // 福建省 (35)
        Province(code = "35", name = "福建省", cities = listOf(
            City("3501", "福州市", listOf(District("350102", "鼓楼区"), District("350103", "台江区"), District("350104", "仓山区"))),
            City("3502", "厦门市", listOf(District("350203", "思明区"), District("350205", "海沧区"))),
            City("3503", "莆田市", listOf(District("350302", "城厢区"))),
            City("3504", "三明市", listOf(District("350404", "三元区"))),
            City("3505", "泉州市", listOf(District("350502", "鲤城区"))),
            City("3506", "漳州市", listOf(District("350602", "芗城区"))),
            City("3507", "南平市", listOf(District("350702", "延平区"))),
            City("3508", "龙岩市", listOf(District("350802", "新罗区"))),
            City("3509", "宁德市", listOf(District("350902", "蕉城区")))
        )),
        // 江西省 (36)
        Province(code = "36", name = "江西省", cities = listOf(
            City("3601", "南昌市", listOf(District("360102", "东湖区"), District("360103", "西湖区"), District("360104", "青云谱区"))),
            City("3602", "景德镇市", listOf(District("360202", "昌江区"))),
            City("3603", "萍乡市", listOf(District("360302", "安源区"))),
            City("3604", "九江市", listOf(District("360402", "濂溪区"))),
            City("3605", "新余市", listOf(District("360502", "渝水区"))),
            City("3606", "鹰潭市", listOf(District("360602", "月湖区"))),
            City("3607", "赣州市", listOf(District("360702", "章贡区"))),
            City("3608", "吉安市", listOf(District("360802", "吉州区"))),
            City("3609", "宜春市", listOf(District("360902", "袁州区"))),
            City("3610", "抚州市", listOf(District("361002", "临川区"))),
            City("3611", "上饶市", listOf(District("361102", "信州区")))
        )),
        // 山东省 (37)
        Province(code = "37", name = "山东省", cities = listOf(
            City("3701", "济南市", listOf(District("370102", "历下区"), District("370103", "市中区"), District("370104", "槐荫区"))),
            City("3702", "青岛市", listOf(District("370202", "市南区"), District("370203", "市北区"), District("370211", "黄岛区"))),
            City("3703", "淄博市", listOf(District("370302", "淄川区"))),
            City("3704", "枣庄市", listOf(District("370402", "市中区"))),
            City("3705", "东营市", listOf(District("370502", "东营区"))),
            City("3706", "烟台市", listOf(District("370602", "芝罘区"))),
            City("3707", "潍坊市", listOf(District("370702", "潍城区"))),
            City("3708", "济宁市", listOf(District("370811", "任城区"))),
            City("3709", "泰安市", listOf(District("370902", "泰山区"))),
            City("3710", "威海市", listOf(District("371002", "环翠区"))),
            City("3711", "日照市", listOf(District("371102", "东港区"))),
            City("3713", "临沂市", listOf(District("371302", "兰山区"))),
            City("3714", "德州市", listOf(District("371402", "德城区"))),
            City("3715", "聊城市", listOf(District("371502", "东昌府区"))),
            City("3716", "滨州市", listOf(District("371602", "滨城区"))),
            City("3717", "菏泽市", listOf(District("371702", "牡丹区")))
        )),
        // 河南省 (41)
        Province(code = "41", name = "河南省", cities = listOf(
            City("4101", "郑州市", listOf(District("410102", "中原区"), District("410103", "二七区"), District("410105", "金水区"))),
            City("4102", "开封市", listOf(District("410202", "龙亭区"))),
            City("4103", "洛阳市", listOf(District("410302", "老城区"), District("410303", "西工区"))),
            City("4104", "平顶山市", listOf(District("410402", "新华区"))),
            City("4105", "安阳市", listOf(District("410502", "文峰区"))),
            City("4106", "鹤壁市", listOf(District("410602", "鹤山区"))),
            City("4107", "新乡市", listOf(District("410702", "红旗区"))),
            City("4108", "焦作市", listOf(District("410802", "解放区"))),
            City("4109", "濮阳市", listOf(District("410902", "华龙区"))),
            City("4110", "许昌市", listOf(District("411002", "魏都区"))),
            City("4111", "漯河市", listOf(District("411102", "源汇区"))),
            City("4112", "三门峡市", listOf(District("411202", "湖滨区"))),
            City("4113", "南阳市", listOf(District("411302", "宛城区"))),
            City("4114", "商丘市", listOf(District("411402", "梁园区"))),
            City("4115", "信阳市", listOf(District("411502", "浉河区"))),
            City("4116", "周口市", listOf(District("411602", "川汇区"))),
            City("4117", "驻马店市", listOf(District("411702", "驿城区"))),
            City("4190", "省直辖县级行政区划", listOf(District("419001", "济源市")))
        )),
        // 湖北省 (42)
        Province(code = "42", name = "湖北省", cities = listOf(
            City("4201", "武汉市", listOf(District("420102", "江岸区"), District("420103", "江汉区"), District("420106", "武昌区"))),
            City("4202", "黄石市", listOf(District("420202", "黄石港区"))),
            City("4203", "十堰市", listOf(District("420302", "茅箭区"))),
            City("4205", "宜昌市", listOf(District("420502", "西陵区"))),
            City("4206", "襄阳市", listOf(District("420602", "襄城区"))),
            City("4207", "鄂州市", listOf(District("420702", "梁子湖区"))),
            City("4208", "荆门市", listOf(District("420802", "东宝区"))),
            City("4209", "孝感市", listOf(District("420902", "孝南区"))),
            City("4210", "荆州市", listOf(District("421002", "沙市区"))),
            City("4211", "黄冈市", listOf(District("421102", "黄州区"))),
            City("4212", "咸宁市", listOf(District("421202", "咸安区"))),
            City("4213", "随州市", listOf(District("421303", "曾都区"))),
            City("4228", "恩施土家族苗族自治州", listOf(District("422801", "恩施市"))),
            City("4290", "省直辖县级行政区划", listOf(District("429004", "仙桃市"), District("429005", "潜江市"), District("429006", "天门市")))
        )),
        // 湖南省 (43)
        Province(code = "43", name = "湖南省", cities = listOf(
            City("4301", "长沙市", listOf(District("430102", "芙蓉区"), District("430103", "天心区"), District("430104", "岳麓区"))),
            City("4302", "株洲市", listOf(District("430202", "荷塘区"))),
            City("4303", "湘潭市", listOf(District("430302", "雨湖区"))),
            City("4304", "衡阳市", listOf(District("430405", "珠晖区"))),
            City("4305", "邵阳市", listOf(District("430502", "双清区"))),
            City("4306", "岳阳市", listOf(District("430602", "岳阳楼区"))),
            City("4307", "常德市", listOf(District("430702", "武陵区"))),
            City("4308", "张家界市", listOf(District("430802", "永定区"))),
            City("4309", "益阳市", listOf(District("430902", "资阳区"))),
            City("4310", "郴州市", listOf(District("431002", "北湖区"))),
            City("4311", "永州市", listOf(District("431102", "零陵区"))),
            City("4312", "怀化市", listOf(District("431202", "鹤城区"))),
            City("4313", "娄底市", listOf(District("431302", "娄星区"))),
            City("4331", "湘西土家族苗族自治州", listOf(District("433101", "吉首市")))
        )),
        // 广东省 (44)
        Province(code = "44", name = "广东省", cities = listOf(
            City("4401", "广州市", listOf(District("440103", "荔湾区"), District("440104", "越秀区"), District("440105", "海珠区"), District("440106", "天河区"))),
            City("4402", "韶关市", listOf(District("440203", "武江区"))),
            City("4403", "深圳市", listOf(District("440303", "罗湖区"), District("440304", "福田区"), District("440305", "南山区"))),
            City("4404", "珠海市", listOf(District("440402", "香洲区"))),
            City("4405", "汕头市", listOf(District("440507", "龙湖区"))),
            City("4406", "佛山市", listOf(District("440604", "禅城区"))),
            City("4407", "江门市", listOf(District("440703", "蓬江区"))),
            City("4408", "湛江市", listOf(District("440802", "赤坎区"))),
            City("4409", "茂名市", listOf(District("440902", "茂南区"))),
            City("4412", "肇庆市", listOf(District("441202", "端州区"))),
            City("4413", "惠州市", listOf(District("441302", "惠城区"))),
            City("4414", "梅州市", listOf(District("441402", "梅江区"))),
            City("4415", "汕尾市", listOf(District("441502", "城区"))),
            City("4416", "河源市", listOf(District("441602", "源城区"))),
            City("4417", "阳江市", listOf(District("441702", "江城区"))),
            City("4418", "清远市", listOf(District("441802", "清城区"))),
            City("4419", "东莞市", listOf(District("441900", "东莞市"))),
            City("4420", "中山市", listOf(District("442000", "中山市"))),
            City("4451", "潮州市", listOf(District("445102", "湘桥区"))),
            City("4452", "揭阳市", listOf(District("445202", "榕城区"))),
            City("4453", "云浮市", listOf(District("445302", "云城区")))
        )),
        // 广西壮族自治区 (45)
        Province(code = "45", name = "广西壮族自治区", cities = listOf(
            City("4501", "南宁市", listOf(District("450102", "兴宁区"), District("450103", "青秀区"), District("450105", "江南区"))),
            City("4502", "柳州市", listOf(District("450202", "城中区"))),
            City("4503", "桂林市", listOf(District("450302", "秀峰区"))),
            City("4504", "梧州市", listOf(District("450403", "万秀区"))),
            City("4505", "北海市", listOf(District("450502", "海城区"))),
            City("4506", "防城港市", listOf(District("450602", "港口区"))),
            City("4507", "钦州市", listOf(District("450702", "钦南区"))),
            City("4508", "贵港市", listOf(District("450802", "港北区"))),
            City("4509", "玉林市", listOf(District("450902", "玉州区"))),
            City("4510", "百色市", listOf(District("451002", "右江区"))),
            City("4511", "贺州市", listOf(District("451102", "八步区"))),
            City("4512", "河池市", listOf(District("451202", "金城江区"))),
            City("4513", "来宾市", listOf(District("451302", "兴宾区"))),
            City("4514", "崇左市", listOf(District("451402", "江州区")))
        )),
        // 海南省 (46)
        Province(code = "46", name = "海南省", cities = listOf(
            City("4601", "海口市", listOf(District("460105", "秀英区"), District("460106", "龙华区"), District("460107", "琼山区"), District("460108", "美兰区"))),
            City("4602", "三亚市", listOf(District("460202", "海棠区"), District("460203", "吉阳区"), District("460204", "天涯区"), District("460205", "崖州区"))),
            City("4603", "三沙市", listOf(District("460321", "西沙群岛"))),
            City("4604", "儋州市", listOf(District("460400", "儋州市"))),
            City("4690", "省直辖县级行政区划", listOf(District("469001", "五指山市"), District("469002", "琼海市"), District("469005", "文昌市")))
        )),
        // 重庆市 (50)
        Province(code = "50", name = "重庆市", cities = listOf(
            City(code = "5001", name = "重庆市", districts = listOf(
                District("500101", "万州区"), District("500102", "涪陵区"),
                District("500103", "渝中区"), District("500104", "大渡口区"),
                District("500105", "江北区"), District("500106", "沙坪坝区"),
                District("500107", "九龙坡区"), District("500108", "南岸区"),
                District("500109", "北碚区"), District("500110", "綦江区"),
                District("500111", "大足区"), District("500112", "渝北区"),
                District("500113", "巴南区"), District("500114", "黔江区"),
                District("500115", "长寿区"), District("500116", "江津区"),
                District("500117", "合川区"), District("500118", "永川区"),
                District("500119", "南川区"), District("500120", "璧山区"),
                District("500151", "铜梁区"), District("500152", "潼南区"),
                District("500153", "荣昌区"), District("500154", "开州区"),
                District("500155", "梁平区"), District("500156", "武隆区")
            ))
        )),
        // 四川省 (51)
        Province(code = "51", name = "四川省", cities = listOf(
            City("5101", "成都市", listOf(District("510104", "锦江区"), District("510105", "青羊区"), District("510106", "金牛区"))),
            City("5103", "自贡市", listOf(District("510302", "自流井区"))),
            City("5104", "攀枝花市", listOf(District("510402", "东区"))),
            City("5105", "泸州市", listOf(District("510502", "江阳区"))),
            City("5106", "德阳市", listOf(District("510603", "旌阳区"))),
            City("5107", "绵阳市", listOf(District("510703", "涪城区"))),
            City("5108", "广元市", listOf(District("510802", "利州区"))),
            City("5109", "遂宁市", listOf(District("510903", "船山区"))),
            City("5110", "内江市", listOf(District("511002", "市中区"))),
            City("5111", "乐山市", listOf(District("511102", "市中区"))),
            City("5113", "南充市", listOf(District("511302", "顺庆区"))),
            City("5114", "眉山市", listOf(District("511402", "东坡区"))),
            City("5115", "宜宾市", listOf(District("511502", "翠屏区"))),
            City("5116", "广安市", listOf(District("511602", "广安区"))),
            City("5117", "达州市", listOf(District("511702", "通川区"))),
            City("5118", "雅安市", listOf(District("511802", "雨城区"))),
            City("5119", "巴中市", listOf(District("511902", "巴州区"))),
            City("5120", "资阳市", listOf(District("512002", "雁江区"))),
            City("5132", "阿坝藏族羌族自治州", listOf(District("513201", "马尔康市"))),
            City("5133", "甘孜藏族自治州", listOf(District("513301", "康定市"))),
            City("5134", "凉山彝族自治州", listOf(District("513401", "西昌市")))
        )),
        // 贵州省 (52)
        Province(code = "52", name = "贵州省", cities = listOf(
            City("5201", "贵阳市", listOf(District("520102", "南明区"), District("520103", "云岩区"))),
            City("5202", "六盘水市", listOf(District("520201", "钟山区"))),
            City("5203", "遵义市", listOf(District("520302", "红花岗区"))),
            City("5204", "安顺市", listOf(District("520402", "西秀区"))),
            City("5205", "毕节市", listOf(District("520502", "七星关区"))),
            City("5206", "铜仁市", listOf(District("520602", "碧江区"))),
            City("5223", "黔西南布依族苗族自治州", listOf(District("522301", "兴义市"))),
            City("5226", "黔东南苗族侗族自治州", listOf(District("522601", "凯里市"))),
            City("5227", "黔南布依族苗族自治州", listOf(District("522701", "都匀市")))
        )),
        // 云南省 (53)
        Province(code = "53", name = "云南省", cities = listOf(
            City("5301", "昆明市", listOf(District("530102", "五华区"), District("530103", "盘龙区"))),
            City("5303", "曲靖市", listOf(District("530302", "麒麟区"))),
            City("5304", "玉溪市", listOf(District("530402", "红塔区"))),
            City("5305", "保山市", listOf(District("530502", "隆阳区"))),
            City("5306", "昭通市", listOf(District("530602", "昭阳区"))),
            City("5307", "丽江市", listOf(District("530702", "古城区"))),
            City("5308", "普洱市", listOf(District("530802", "思茅区"))),
            City("5309", "临沧市", listOf(District("530902", "临翔区"))),
            City("5323", "楚雄彝族自治州", listOf(District("532301", "楚雄市"))),
            City("5325", "红河哈尼族彝族自治州", listOf(District("532501", "个旧市"))),
            City("5326", "文山壮族苗族自治州", listOf(District("532601", "文山市"))),
            City("5328", "西双版纳傣族自治州", listOf(District("532801", "景洪市"))),
            City("5329", "大理白族自治州", listOf(District("532901", "大理市"))),
            City("5331", "德宏傣族景颇族自治州", listOf(District("533102", "瑞丽市"))),
            City("5333", "怒江傈僳族自治州", listOf(District("533301", "泸水市"))),
            City("5334", "迪庆藏族自治州", listOf(District("533401", "香格里拉市")))
        )),
        // 西藏自治区 (54)
        Province(code = "54", name = "西藏自治区", cities = listOf(
            City("5401", "拉萨市", listOf(District("540102", "城关区"))),
            City("5402", "日喀则市", listOf(District("540202", "桑珠孜区"))),
            City("5403", "昌都市", listOf(District("540302", "卡若区"))),
            City("5404", "林芝市", listOf(District("540402", "巴宜区"))),
            City("5405", "山南市", listOf(District("540502", "乃东区"))),
            City("5406", "那曲市", listOf(District("540602", "色尼区"))),
            City("5425", "阿里地区", listOf(District("542521", "普兰县")))
        )),
        // 陕西省 (61)
        Province(code = "61", name = "陕西省", cities = listOf(
            City("6101", "西安市", listOf(District("610102", "新城区"), District("610103", "碑林区"), District("610104", "莲湖区"))),
            City("6102", "铜川市", listOf(District("610202", "王益区"))),
            City("6103", "宝鸡市", listOf(District("610302", "渭滨区"))),
            City("6104", "咸阳市", listOf(District("610402", "秦都区"))),
            City("6105", "渭南市", listOf(District("610502", "临渭区"))),
            City("6106", "延安市", listOf(District("610602", "宝塔区"))),
            City("6107", "汉中市", listOf(District("610702", "汉台区"))),
            City("6108", "榆林市", listOf(District("610802", "榆阳区"))),
            City("6109", "安康市", listOf(District("610902", "汉滨区"))),
            City("6110", "商洛市", listOf(District("611002", "商州区")))
        )),
        // 甘肃省 (62)
        Province(code = "62", name = "甘肃省", cities = listOf(
            City("6201", "兰州市", listOf(District("620102", "城关区"), District("620103", "七里河区"))),
            City("6202", "嘉峪关市", listOf(District("620200", "嘉峪关市"))),
            City("6203", "金昌市", listOf(District("620302", "金川区"))),
            City("6204", "白银市", listOf(District("620402", "白银区"))),
            City("6205", "天水市", listOf(District("620502", "秦州区"))),
            City("6206", "武威市", listOf(District("620602", "凉州区"))),
            City("6207", "张掖市", listOf(District("620702", "甘州区"))),
            City("6208", "平凉市", listOf(District("620802", "崆峒区"))),
            City("6209", "酒泉市", listOf(District("620902", "肃州区"))),
            City("6210", "庆阳市", listOf(District("621002", "西峰区"))),
            City("6211", "定西市", listOf(District("621102", "安定区"))),
            City("6212", "陇南市", listOf(District("621202", "武都区"))),
            City("6229", "临夏回族自治州", listOf(District("622901", "临夏市"))),
            City("6230", "甘南藏族自治州", listOf(District("623001", "合作市")))
        )),
        // 青海省 (63)
        Province(code = "63", name = "青海省", cities = listOf(
            City("6301", "西宁市", listOf(District("630102", "城东区"), District("630103", "城中区"), District("630104", "城西区"))),
            City("6302", "海东市", listOf(District("630202", "乐都区"))),
            City("6322", "海北藏族自治州", listOf(District("632221", "门源回族自治县"))),
            City("6323", "黄南藏族自治州", listOf(District("632301", "同仁市"))),
            City("6325", "海南藏族自治州", listOf(District("632521", "共和县"))),
            City("6326", "果洛藏族自治州", listOf(District("632621", "玛沁县"))),
            City("6327", "玉树藏族自治州", listOf(District("632701", "玉树市"))),
            City("6328", "海西蒙古族藏族自治州", listOf(District("632801", "格尔木市"), District("632802", "德令哈市")))
        )),
        // 宁夏回族自治区 (64)
        Province(code = "64", name = "宁夏回族自治区", cities = listOf(
            City("6401", "银川市", listOf(District("640104", "兴庆区"), District("640105", "西夏区"), District("640106", "金凤区"))),
            City("6402", "石嘴山市", listOf(District("640202", "大武口区"))),
            City("6403", "吴忠市", listOf(District("640302", "利通区"))),
            City("6404", "固原市", listOf(District("640402", "原州区"))),
            City("6405", "中卫市", listOf(District("640502", "沙坡头区")))
        )),
        // 新疆维吾尔自治区 (65)
        Province(code = "65", name = "新疆维吾尔自治区", cities = listOf(
            City("6501", "乌鲁木齐市", listOf(District("650102", "天山区"), District("650103", "沙依巴克区"), District("650104", "新市区"))),
            City("6502", "克拉玛依市", listOf(District("650202", "独山子区"))),
            City("6504", "吐鲁番市", listOf(District("650402", "高昌区"))),
            City("6505", "哈密市", listOf(District("650502", "伊州区"))),
            City("6523", "昌吉回族自治州", listOf(District("652301", "昌吉市"))),
            City("6527", "博尔塔拉蒙古自治州", listOf(District("652701", "博乐市"))),
            City("6528", "巴音郭楞蒙古自治州", listOf(District("652801", "库尔勒市"))),
            City("6529", "阿克苏地区", listOf(District("652901", "阿克苏市"))),
            City("6530", "克孜勒苏柯尔克孜自治州", listOf(District("653001", "阿图什市"))),
            City("6531", "喀什地区", listOf(District("653101", "喀什市"))),
            City("6532", "和田地区", listOf(District("653201", "和田市"))),
            City("6540", "伊犁哈萨克自治州", listOf(District("654002", "伊宁市"))),
            City("6542", "塔城地区", listOf(District("654201", "塔城市"))),
            City("6543", "阿勒泰地区", listOf(District("654301", "阿勒泰市"))),
            City("6590", "自治区直辖县级行政区划", listOf(District("659001", "石河子市"), District("659002", "阿拉尔市"), District("659003", "图木舒克市")))
        )),
        // 台湾省 (71) - 中国不可分割的一部分
        Province(code = "71", name = "台湾省", cities = listOf(
            // 台北市 (7101) - 12个区
            City("7101", "台北市", listOf(
                District("710101", "中正区"), District("710102", "大同区"),
                District("710103", "中山区"), District("710104", "松山区"),
                District("710105", "大安区"), District("710106", "万华区"),
                District("710107", "信义区"), District("710108", "士林区"),
                District("710109", "北投区"), District("710110", "内湖区"),
                District("710111", "南港区"), District("710112", "文山区")
            )),
            // 新北市 (7102)
            City("7102", "新北市", listOf(
                District("710201", "板桥区"), District("710202", "三重区"),
                District("710203", "中和区"), District("710204", "永和区"),
                District("710205", "新庄区"), District("710206", "新店区"),
                District("710207", "土城区"), District("710208", "芦洲区"),
                District("710209", "树林区"), District("710210", "汐止区"),
                District("710211", "莺歌区"), District("710212", "三峡区"),
                District("710213", "淡水区"), District("710214", "瑞芳区"),
                District("710215", "五股区"), District("710216", "泰山区"),
                District("710217", "林口区"), District("710218", "深坑区"),
                District("710219", "石碇区"), District("710220", "坪林区"),
                District("710221", "三芝区"), District("710222", "石门区"),
                District("710223", "八里区"), District("710224", "平溪区"),
                District("710225", "双溪区"), District("710226", "贡寮区"),
                District("710227", "金山区"), District("710228", "万里区"),
                District("710229", "乌来区")
            )),
            // 桃园市 (7103)
            City("7103", "桃园市", listOf(
                District("710301", "桃园区"), District("710302", "中坜区"),
                District("710303", "大溪区"), District("710304", "杨梅区"),
                District("710305", "芦竹区"), District("710306", "大园区"),
                District("710307", "龟山区"), District("710308", "八德区"),
                District("710309", "龙潭区"), District("710310", "平镇区"),
                District("710311", "新屋区"), District("710312", "观音区"),
                District("710313", "复兴区")
            )),
            // 台中市 (7104)
            City("7104", "台中市", listOf(
                District("710401", "中区"), District("710402", "东区"),
                District("710403", "南区"), District("710404", "西区"),
                District("710405", "北区"), District("710406", "北屯区"),
                District("710407", "西屯区"), District("710408", "南屯区"),
                District("710409", "太平区"), District("710410", "大里区"),
                District("710411", "雾峰区"), District("710412", "乌日区"),
                District("710413", "丰原区"), District("710414", "后里区"),
                District("710415", "石冈区"), District("710416", "东势区"),
                District("710417", "和平区"), District("710418", "新社区"),
                District("710419", "潭子区"), District("710420", "大雅区"),
                District("710421", "神冈区"), District("710422", "大肚区"),
                District("710423", "沙鹿区"), District("710424", "龙井区"),
                District("710425", "梧栖区"), District("710426", "清水区"),
                District("710427", "大甲区"), District("710428", "外埔区"),
                District("710429", "大安区")
            )),
            // 台南市 (7105)
            City("7105", "台南市", listOf(
                District("710501", "中西区"), District("710502", "东区"),
                District("710503", "南区"), District("710504", "北区"),
                District("710505", "安平区"), District("710506", "安南区"),
                District("710507", "永康区"), District("710508", "归仁区"),
                District("710509", "新化区"), District("710510", "左镇区"),
                District("710511", "玉井区"), District("710512", "楠西区"),
                District("710513", "南化区"), District("710514", "仁德区"),
                District("710515", "关庙区"), District("710516", "龙崎区"),
                District("710517", "官田区"), District("710518", "麻豆区"),
                District("710519", "佳里区"), District("710520", "西港区"),
                District("710521", "七股区"), District("710522", "将军区"),
                District("710523", "学甲区"), District("710524", "北门区"),
                District("710525", "新营区"), District("710526", "后壁区"),
                District("710527", "白河区"), District("710528", "东山区"),
                District("710529", "六甲区"), District("710530", "下营区"),
                District("710531", "柳营区"), District("710532", "盐水区"),
                District("710533", "善化区"), District("710534", "大内区"),
                District("710535", "山上区"), District("710536", "新市区"),
                District("710537", "安定区")
            )),
            // 高雄市 (7106)
            City("7106", "高雄市", listOf(
                District("710601", "楠梓区"), District("710602", "左营区"),
                District("710603", "鼓山区"), District("710604", "三民区"),
                District("710605", "盐埕区"), District("710606", "前金区"),
                District("710607", "新兴区"), District("710608", "苓雅区"),
                District("710609", "前镇区"), District("710610", "旗津区"),
                District("710611", "小港区"), District("710612", "凤山区"),
                District("710613", "林园区"), District("710614", "大寮区"),
                District("710615", "大树区"), District("710616", "大社区"),
                District("710617", "仁武区"), District("710618", "鸟松区"),
                District("710619", "冈山区"), District("710620", "桥头区"),
                District("710621", "燕巢区"), District("710622", "田寮区"),
                District("710623", "阿莲区"), District("710624", "路竹区"),
                District("710625", "湖内区"), District("710626", "茄萣区"),
                District("710627", "永安区"), District("710628", "弥陀区"),
                District("710629", "梓官区"), District("710630", "旗山区"),
                District("710631", "美浓区"), District("710632", "六龟区"),
                District("710633", "甲仙区"), District("710634", "杉林区"),
                District("710635", "内门区"), District("710636", "茂林区"),
                District("710637", "桃源区"), District("710638", "那玛夏区")
            )),
            // 基隆市 (7107)
            City("7107", "基隆市", listOf(
                District("710701", "仁爱区"), District("710702", "信义区"),
                District("710703", "中正区"), District("710704", "中山区"),
                District("710705", "安乐区"), District("710706", "暖暖区"),
                District("710707", "七堵区")
            )),
            // 新竹市 (7108)
            City("7108", "新竹市", listOf(
                District("710801", "东区"), District("710802", "北区"),
                District("710803", "香山区")
            )),
            // 嘉义市 (7109)
            City("7109", "嘉义市", listOf(
                District("710901", "东区"), District("710902", "西区")
            )),
            // 新竹县 (7110)
            City("7110", "新竹县", listOf(
                District("711001", "竹北市"), District("711002", "竹东镇"),
                District("711003", "新埔镇"), District("711004", "关西镇"),
                District("711005", "湖口乡"), District("711006", "新丰乡"),
                District("711007", "芎林乡"), District("711008", "横山乡"),
                District("711009", "北埔乡"), District("711010", "宝山乡"),
                District("711011", "峨眉乡"), District("711012", "尖石乡"),
                District("711013", "五峰乡")
            )),
            // 苗栗县 (7111)
            City("7111", "苗栗县", listOf(
                District("711101", "苗栗市"), District("711102", "苑里镇"),
                District("711103", "通霄镇"), District("711104", "竹南镇"),
                District("711105", "头份市"), District("711106", "后龙镇"),
                District("711107", "卓兰镇"), District("711108", "大湖乡"),
                District("711109", "公馆乡"), District("711110", "铜锣乡"),
                District("711111", "南庄乡"), District("711112", "头屋乡"),
                District("711113", "三义乡"), District("711114", "西湖乡"),
                District("711115", "造桥乡"), District("711116", "三湾乡"),
                District("711117", "狮潭乡"), District("711118", "泰安乡")
            )),
            // 彰化县 (7112)
            City("7112", "彰化县", listOf(
                District("711201", "彰化市"), District("711202", "鹿港镇"),
                District("711203", "和美镇"), District("711204", "线西乡"),
                District("711205", "伸港乡"), District("711206", "福兴乡"),
                District("711207", "秀水乡"), District("711208", "花坛乡"),
                District("711209", "芬园乡"), District("711210", "员林市"),
                District("711211", "溪湖镇"), District("711212", "田中镇"),
                District("711213", "大村乡"), District("711214", "埔盐乡"),
                District("711215", "埔心乡"), District("711216", "永靖乡"),
                District("711217", "社头乡"), District("711218", "二水乡"),
                District("711219", "北斗镇"), District("711220", "二林镇"),
                District("711221", "田尾乡"), District("711222", "埤头乡"),
                District("711223", "芳苑乡"), District("711224", "大城乡"),
                District("711225", "竹塘乡"), District("711226", "溪州乡")
            )),
            // 南投县 (7113)
            City("7113", "南投县", listOf(
                District("711301", "南投市"), District("711302", "埔里镇"),
                District("711303", "草屯镇"), District("711304", "竹山镇"),
                District("711305", "集集镇"), District("711306", "名间乡"),
                District("711307", "鹿谷乡"), District("711308", "中寮乡"),
                District("711309", "鱼池乡"), District("711310", "国姓乡"),
                District("711311", "水里乡"), District("711312", "信义乡"),
                District("711313", "仁爱乡")
            )),
            // 云林县 (7114)
            City("7114", "云林县", listOf(
                District("711401", "斗六市"), District("711402", "斗南镇"),
                District("711403", "虎尾镇"), District("711404", "西螺镇"),
                District("711405", "土库镇"), District("711406", "北港镇"),
                District("711407", "古坑乡"), District("711408", "大埤乡"),
                District("711409", "莿桐乡"), District("711410", "林内乡"),
                District("711411", "二仑乡"), District("711412", "仑背乡"),
                District("711413", "麦寮乡"), District("711414", "东势乡"),
                District("711415", "褒忠乡"), District("711416", "台西乡"),
                District("711417", "元长乡"), District("711418", "四湖乡"),
                District("711419", "口湖乡"), District("711420", "水林乡")
            )),
            // 嘉义县 (7115)
            City("7115", "嘉义县", listOf(
                District("711501", "太保市"), District("711502", "朴子市"),
                District("711503", "布袋镇"), District("711504", "大林镇"),
                District("711505", "民雄乡"), District("711506", "溪口乡"),
                District("711507", "新港乡"), District("711508", "六脚乡"),
                District("711509", "东石乡"), District("711510", "义竹乡"),
                District("711511", "鹿草乡"), District("711512", "水上乡"),
                District("711513", "中埔乡"), District("711514", "竹崎乡"),
                District("711515", "梅山乡"), District("711516", "番路乡"),
                District("711517", "大埔乡"), District("711518", "阿里山乡")
            )),
            // 屏东县 (7116)
            City("7116", "屏东县", listOf(
                District("711601", "屏东市"), District("711602", "潮州镇"),
                District("711603", "东港镇"), District("711604", "恒春镇"),
                District("711605", "万丹乡"), District("711606", "长治乡"),
                District("711607", "麟洛乡"), District("711608", "九如乡"),
                District("711609", "里港乡"), District("711610", "盐埔乡"),
                District("711611", "高树乡"), District("711612", "万峦乡"),
                District("711613", "内埔乡"), District("711614", "竹田乡"),
                District("711615", "新埤乡"), District("711616", "枋寮乡"),
                District("711617", "新园乡"), District("711618", "崁顶乡"),
                District("711619", "林边乡"), District("711620", "南州乡"),
                District("711621", "佳冬乡"), District("711622", "琉球乡"),
                District("711623", "车城乡"), District("711624", "满州乡"),
                District("711625", "枋山乡"), District("711626", "三地门乡"),
                District("711627", "雾台乡"), District("711628", "玛家乡"),
                District("711629", "泰武乡"), District("711630", "来义乡"),
                District("711631", "春日乡"), District("711632", "狮子乡"),
                District("711633", "牡丹乡")
            )),
            // 宜兰县 (7117)
            City("7117", "宜兰县", listOf(
                District("711701", "宜兰市"), District("711702", "罗东镇"),
                District("711703", "苏澳镇"), District("711704", "头城镇"),
                District("711705", "礁溪乡"), District("711706", "壮围乡"),
                District("711707", "员山乡"), District("711708", "冬山乡"),
                District("711709", "五结乡"), District("711710", "三星乡"),
                District("711711", "大同乡"), District("711712", "南澳乡")
            )),
            // 花莲县 (7118)
            City("7118", "花莲县", listOf(
                District("711801", "花莲市"), District("711802", "凤林镇"),
                District("711803", "玉里镇"), District("711804", "新城乡"),
                District("711805", "吉安乡"), District("711806", "寿丰乡"),
                District("711807", "光复乡"), District("711808", "丰滨乡"),
                District("711809", "瑞穗乡"), District("711810", "富里乡"),
                District("711811", "秀林乡"), District("711812", "万荣乡"),
                District("711813", "卓溪乡")
            )),
            // 台东县 (7119)
            City("7119", "台东县", listOf(
                District("711901", "台东市"), District("711902", "成功镇"),
                District("711903", "关山镇"), District("711904", "卑南乡"),
                District("711905", "鹿野乡"), District("711906", "池上乡"),
                District("711907", "东河乡"), District("711908", "长滨乡"),
                District("711909", "太麻里乡"), District("711910", "大武乡"),
                District("711911", "绿岛乡"), District("711912", "海端乡"),
                District("711913", "延平乡"), District("711914", "金峰乡"),
                District("711915", "达仁乡"), District("711916", "兰屿乡")
            )),
            // 澎湖县 (7120)
            City("7120", "澎湖县", listOf(
                District("712001", "马公市"), District("712002", "湖西乡"),
                District("712003", "白沙乡"), District("712004", "西屿乡"),
                District("712005", "望安乡"), District("712006", "七美乡")
            ))
        ))
    )

    /**
     * 根据省份名称获取省份
     * @param name 省份名称
     * @return 省份对象，找不到返回null
     */
    fun getProvinceByName(name: String): Province? {
        return provinces.find { it.name == name }
    }

    /**
     * 根据省份代码获取省份
     * @param code 省份代码
     * @return 省份对象，找不到返回null
     */
    fun getProvinceByCode(code: String): Province? {
        return provinces.find { it.code == code }
    }

    /**
     * 根据城市名称获取城市
     * @param provinceName 省份名称（可选，不提供则搜索所有省份）
     * @param cityName 城市名称
     * @return 城市对象，找不到返回null
     */
    fun getCityByName(provinceName: String? = null, cityName: String): City? {
        val provincesToSearch = if (provinceName != null) {
            listOfNotNull(getProvinceByName(provinceName))
        } else {
            provinces
        }
        for (province in provincesToSearch) {
            val city = province.cities.find { it.name == cityName }
            if (city != null) return city
        }
        return null
    }

    /**
     * 根据城市代码获取城市
     * @param code 城市代码
     * @return 城市对象，找不到返回null
     */
    fun getCityByCode(code: String): City? {
        for (province in provinces) {
            val city = province.cities.find { it.code == code }
            if (city != null) return city
        }
        return null
    }

    /**
     * 根据区县名称获取区县
     * @param provinceName 省份名称（可选）
     * @param cityName 城市名称（可选）
     * @param districtName 区县名称
     * @return 区县对象，找不到返回null
     */
    fun getDistrictByName(
        provinceName: String? = null,
        cityName: String? = null,
        districtName: String
    ): District? {
        val provincesToSearch = if (provinceName != null) {
            listOfNotNull(getProvinceByName(provinceName))
        } else {
            provinces
        }
        for (province in provincesToSearch) {
            val citiesToSearch = if (cityName != null) {
                listOfNotNull(province.cities.find { it.name == cityName })
            } else {
                province.cities
            }
            for (city in citiesToSearch) {
                val district = city.districts.find { it.name == districtName }
                if (district != null) return district
            }
        }
        return null
    }

    /**
     * 根据区县代码获取区县
     * @param code 区县代码
     * @return 区县对象，找不到返回null
     */
    fun getDistrictByCode(code: String): District? {
        for (province in provinces) {
            for (city in province.cities) {
                val district = city.districts.find { it.code == code }
                if (district != null) return district
            }
        }
        return null
    }

    /**
     * 获取所有省份名称列表
     * @return 省份名称列表
     */
    fun getAllProvinceNames(): List<String> {
        return provinces.map { it.name }
    }

    /**
     * 获取指定省份的所有城市名称
     * @param provinceName 省份名称
     * @return 城市名称列表，省份不存在返回空列表
     */
    fun getCityNamesByProvince(provinceName: String): List<String> {
        return getProvinceByName(provinceName)?.cities?.map { it.name } ?: emptyList()
    }

    /**
     * 获取指定城市的所有区县名称
     * @param provinceName 省份名称（可选）
     * @param cityName 城市名称
     * @return 区县名称列表，城市不存在返回空列表
     */
    fun getDistrictNamesByCity(provinceName: String? = null, cityName: String): List<String> {
        return getCityByName(provinceName, cityName)?.districts?.map { it.name } ?: emptyList()
    }

    /**
     * 搜索省份（支持模糊匹配）
     * @param keyword 关键词
     * @return 匹配的省份列表
     */
    fun searchProvinces(keyword: String): List<Province> {
        return provinces.filter { it.name.contains(keyword) }
    }

    /**
     * 搜索城市（支持模糊匹配）
     * @param keyword 关键词
     * @return 匹配的城市列表
     */
    fun searchCities(keyword: String): List<City> {
        val result = mutableListOf<City>()
        for (province in provinces) {
            result.addAll(province.cities.filter { it.name.contains(keyword) })
        }
        return result
    }

    /**
     * 搜索区县（支持模糊匹配）
     * @param keyword 关键词
     * @return 匹配的区县列表
     */
    fun searchDistricts(keyword: String): List<District> {
        val result = mutableListOf<District>()
        for (province in provinces) {
            for (city in province.cities) {
                result.addAll(city.districts.filter { it.name.contains(keyword) })
            }
        }
        return result
    }
}
