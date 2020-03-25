import RegEx.Task3_2;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {

 public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {
   // new Task3_2().task3_2();


 /* // System.out.println(Arrays.toString(new Task1_1().camelCaseTo_snake_case()));
  //new Task1_2().replaceAll_word_on_letter("wordword wor wrod rowd drow wor d worr d worddwor");
   //new Task1_3().getAllDigitsFromString("sdhgf4 wg r3 423g u234 g234");
  // new Task1_4().findAmountOfNumbers("sdhgf4 wg r3 458 423g u234 g234");
  //new Task1_5().removeExtraSpaces(" Вчера ,  я  ел , когда она ушла   ");
  //System.out.println(new Task2_1().findTheBiggestSequenceOfSpaces("hh  hv   h "));

  // new Task2_2().insertBafterA("That Sunday was last sunday in his life");
  // System.out.println(new Palindrom().isPalindrom("123321123321"));
 //new Task2_4().makeWordFromOtherWord();
  // System.out.println(new Task2_5().howMuchSymbolAInString("Chacha and Chicha have ate an apple"));
  // System.out.println(new Task2_6().getNewStringByDoublingEachSymbol("Egor"));
   // new Task2_7().deleteAllDiplicates("abcdefgh ab c hj uf nryhsd fd ghzsrh guisdrhgu aeruigh ;asekhg uifku WGFYUWGVeay gfuaegf ukrgfyueri gfaeruigf euiargf WFU IERGUIABIFU BAERHG8OH GDRHGUIERGK JBEARGY");

  // new Task2_8().findTheLongestWord("q we rty uiop asdfg hjkl;' 1234567 1234568 123456789 0123456789");
   // new Task2_9().getAmountOfLowerAndUpperCaseSymbols("abcdefgABCXDEFUHабвгд");
   // new Task2_10().determineAmountOfSentences("Я. ты? мы!");

  new Task3_1().task3_1("При разработке Трешера (была названа в честь сельдевой акулы) учли все прежние достижения и попытались заглянуть далеко в будущее туда, где подлодки сыграют важнейшую роль в какой-нибудь очередной мировой войне. Субмарину оборудовали совершенной гидролокационной аппаратурой с рекордной дальностью действия, корпус подводного судна собирали из сверхпрочной стали.\n" +
    "\n" +
    "\n" +

    "Обтекаемый сигарообразный силуэт Трешера помог подлодке превзойти конкурентов в маневренности и ходовых качествах. В качестве вооружения использовались новейшие ракеты Саброк, а силовой установкой выступал реактор S5W, позволявший судну с десяток раз обогнуть планету без единого всплытия. Корабль создавался в качестве охотника за вражескими подлодками, в качестве которых, конечно же, в первую очередь рассматривались советские субмарины. Практически бесшумный, очень быстрый и до макушки вооруженный Трешер в то время не оставлял шансов ни реальному, ни воображаемому противнику.\n" +
    "\n" +
    "На вооружение подлодка поступила в августе 1961 года. В команду из 12 офицеров и 96 матросов отобрали самых способных подводников. Эта субмарина должна была быть образцовой во всем.\n" +
    "\n" +
    "\n" +
    "Правда, как и все новое, Трешер был скорее не полноценной боевой машиной, а полигоном для испытаний. Достаточно сказать, что в первый год обкатки у подлодки обнаружили под тысячу недоделок и неисправностей. Не удивительно, что бóльшую часть времени субмарина проводила в ремонтных доках.\n" +
    "\n" +
    "За недолгую историю испытаний судна случались и довольно серьезные, хотя пока еще не смертельные нештатные ситуации. Например, однажды сломался генератор, и Трешер остался без электричества, даже ядерный реактор запустить не успели. Благо все случилось на воде, и вскоре подоспела помощь. А спустя какое-то время подлодку протаранил буксир, из-за чего образовалась пробоина диаметром в метр. Но все это мелочи по сравнению с катастрофой, которая произошла в апреле 1963-го.\n" +
    "\n" +

    "Утро 9 апреля сразу не задалось. Было пасмурно, ветрено, Атлантику в районе Портсмута слегка штормило. Трешер должен был пройти несколько испытаний, в том числе глубоководных. Согласно расчетам предельная глубина, на которую могла опуститься подлодка, составляла около 350 360 метров. Для судна это был очень важный показатель, так как советские субмарины, уступавшие американским конкурентам в боевой мощи, могли уходить от преследования, погружаясь на глубину, недоступную для американских подлодок прошлого поколения. Если испытания на 350-метровой глубине пройдут хорошо, то Трешер лишит потенциального соперника одного из главных преимуществ.\n" +
    "\n" +
    "\n" +

    "Вышли рано, в 7:30. На борту находилось 129 человек, в числе которых, помимо экипажа, были 17 инженеров, работников верфи и других гражданских специалистов. В течение суток субмарина в сопровождении спасательного катера Скайларк готовилась к погружению и проводила другие, менее значимые испытания. Наконец ранним утром 10 апреля Трешер и Скайларк прибыли к месту погружения. Точка находилась почти в 400 километрах от берега, глубина океанического дна здесь достигала 2,5 километра.\n" +
    "\n" +
    "Стоит уточнить, что для подлодки это не было первым погружением на предельную глубину. Ранее Трешер уже несколько раз опускался на 350 метров. Предстояло всего лишь очередное погружение. Как в таких случаях говорят, ничего не предвещало беды.\n" +
    "\n" +
    "\n" +
    "Испытание проходило поэтапно. Субмарина опускалась на 30 50 метров, после чего команда поверяла работу приборов, осматривала корпус на предмет течи. Если все было нормально, Трешер погружался еще на 30 50 метров. И так до предельной глубины в 350 360 метров. При этом на каждом этапе поддерживалась гидроакустическая связь со Скайларком.\n" +
    "\n" +
    "\n" +
    "Командиром подлодки тогда был Джон Харвей. Несмотря на молодость, ранее офицер успел отслужить три года на первой в мире атомной субмарине Наутилус. На ней же он прошел подо льдами Северного Ледовитого океана.\n" +
    "\n" +
    "Погружение началось с 7 часов 47 минут. На протяжении часа операция проходила штатно: Трешер постепенно опускался, проверял системы и выходил на связь со Скайларком. К 9 часам глубина была почти предельной. Тогда-то и начало происходить что-то непонятное.\n" +
    "\n" +
    "\n" +

    "В 9:13 катер Скайларк принял тревожное сообщение. Дословно его воспроизвести невозможно из-за помех, но суть сводится к тому, что Джон Харвей сообщил о неких незначительных затруднениях. В вахтенном журнале Скайларка сделана следующая урезанная запись сообщения с Трешера: Имею положение дифферент на корму... Пытаюсь продуть цистерны.\n" +
    "\n" +
    "Затем слышится звук стравливаемого сжатого воздуха. Любая подлодка погружается за счет заполнения забортной водой специальных балластных цистерн. Когда надо всплыть, жидкость под давлением выдувается из цистерн сжатым воздухом. Очевидно, именно это и делала команда Трешера пыталась аварийно всплыть, выдувая воду из балластных емкостей.\n" +
    "\n" +
    "\n" +

    "У вас все в порядке? Сообщите свой курс! в последующие несколько минут Скайларк пытался связаться с субмариной, но безрезультатно. В 9:17 от Трешера поступило последнее, крайне неразборчивое сообщение, которое впоследствии расшифровали как 900 n… превышение… предельная глубина… Затем через трубку гидроакустической связи на катере услышали треск разламывающегося корпуса судна. Гордость американского подводного флота, суперсовременная атомная подлодка, опередившая свое время, замолчала навсегда.\n" +
    "\n" +

    "Еще полтора часа Скайларк патрулировал район в месте погружения субмарины. В воду сбрасывали гранаты, что служило сигналом к немедленному всплытию. Спустя несколько часов о происшествии был уведомлен президент США Джон Кеннеди.\n" +
    "\n" +
    "Вскоре в поисках любых следов Трешера участвовал чуть ли не весь Атлантический флот. К концу дня нашли только масляное пятно и несколько кусков пластмассы, использовавшейся на атомных подлодках. Ничего не оставалось, как признать судно утраченным.\n" +
    "\n" +
    "\n" +

    "Остатки Трешера наверняка покоились на глубине 2500 метров. Сначала очертания обломков сфотографировали специальными подводными камерами Эджертона. Это позволило определить точное место гибели субмарины, куда летом 1963 года отправили батискаф Триест. Тот обнаружил резиновый чехол для ботинок с буквами SSN, которые указывали на принадлежность к атомной подлодке, и цифрой 5 первой из номера Трешера (593). Там же нашли воздушный баллон, бумагу и много других легковесных обломков. Само же разорванное судно погрузилось глубоко в ил.\n" +
    "\n" +
    "По мнению специалистов, Трешер падал на дно кормой вниз с очень высокой скоростью. Где-то у самого дна субмарина разломилась на две части. Но что послужило причиной ее гибели?\n" +
    "\n" +
    "\n" +

    "Точного ответа на этот вопрос никто никогда не сможет дать. Тем не менее сформированная комиссия изучила все возможные материалы и сформулировала наиболее правдоподобную причину катастрофы.\n" +
    "\n" +
    "В первую очередь тщательно исследовали последние донесения капитана Трешера. Так, в 9:12 он сообщил о неких незначительных проблемах. То есть ситуация еще не была критической. Но следом звучит тревожная фраза Пытаюсь продуть цистерны. Тревожной ее делает слово пытаюсь. Следовательно, возникла некая нештатная ситуация, которая вынудила команду подниматься. Однако продуть цистерны, видимо, не получилось.\n" +
    "\n" +
    "\n" +
    "А что значит 900 n первая часть неразборчивой фразы, произнесенной, скорее всего, непосредственно перед гибелью субмарины? С цифрой легче всего. В комиссии предположили, что 900 это обозначение по шкале инцидентов с кораблем, когда 0 все нормально, а 1000 полная потеря судна. Литера n обозначала либо ответ negative на запросы Скайларка типа Все ли в порядке?, либо указывала на северное направление движения подлодки.\n" +
    " \n" +
    "\n" +

    "Расследование пришло к выводу, что гибель Трешера стала возможной из-за стечения обстоятельств, когда вместе сошлись сразу две неисправности. Предполагается, что непосредственной причиной аварии стала течь трубопровода системы забортной воды. Из-за нее реакторный отсек в мгновение ока заполнился водой. Не исключено, что сработала аварийная защита, обесточившая сам реактор и всю подлодку. Чтобы всплыть, экипаж попытался продуть цистерны сжатым воздухом. И здесь сработал второй фактор обледенение клапанов: скопившаяся в них влага замерзла и не дала пропустить воздух. Оказалось, что такая проблема довольно часто встречалась в американских подлодках предыдущего поколения.\n" +
    "\n" +
    "Неуправляемый Трешер погрузился на 500 метров, после чего огромная толща воды буквально раздавила корпус судна и всех, кто находился внутри.\n" +
    "\n" +
    "\n" +
    "Другой вопрос: что вызвало течь трубопровода? Однако точного ответа на него не найти. Однозначно отметаются версии подрыва (его бы услышали на Скайларке) и диверсии. Вероятно, виной всему некачественное литье, дефекты сварки или технологический брак. В результате часть трубы просто не выдержала давления.\n" +
    "\n" +
    "После гибели Трешера вся программа развертывания обновленного подводного флота США сначала была отложена, а потом и вовсе значительно сокращена. Тип подлодок, родоначальником которого стал Трешер, переименовали в Пермит по названию второй субмарины серии.\n" +
    "\n" +
    "\n" +
    "Любопытно, но именно гибель подлодки послужила толчком для стремительного развития лунной программы американцев. Правительство решило резко сократить расходы на создание атомных субмарин, направив освободившиеся средства на освоение космоса.\n" +
    "\n" +
    "Наконец, пример Трешера заставил американских специалистов полностью пересмотреть подходы к судостроению. Была принята программа, согласно которой при любом развитии событий на первом месте должна стоять безопасность экипажа. Что бы ни случилось с подлодкой, она должна всплыть с целым реактором и живой командой. Это, впрочем, не уберегло США от еще одной катастрофы пять лет спустя, но после 1968 года ни одна американская атомная субмарина не погибла.");
*/
 }
}