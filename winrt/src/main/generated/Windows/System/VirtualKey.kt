package Windows.System

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.sun.jna.FromNativeContext
import com.sun.jna.NativeMapped
import java.lang.Class
import java.lang.IllegalArgumentException
import java.lang.Integer
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.JAVA_INT
import kotlin.Any
import kotlin.Int
import kotlin.Unit

@ABIMarker(VirtualKey.ABI::class)
@Signature("enum(Windows.System.VirtualKey;i4)")
@WinRTByReference(brClass = VirtualKey.ByReference::class)
public enum class VirtualKey(
  public val value: Int
) : NativeMapped {
  None(0),
  LeftButton(1),
  RightButton(2),
  Cancel(3),
  MiddleButton(4),
  XButton1(5),
  XButton2(6),
  Back(8),
  Tab(9),
  Clear(12),
  Enter(13),
  Shift(16),
  Control(17),
  Menu(18),
  Pause(19),
  CapitalLock(20),
  Kana(21),
  Hangul(21),
  ImeOn(22),
  Junja(23),
  Final(24),
  Hanja(25),
  Kanji(25),
  ImeOff(26),
  Escape(27),
  Convert(28),
  NonConvert(29),
  Accept(30),
  ModeChange(31),
  Space(32),
  PageUp(33),
  PageDown(34),
  End(35),
  Home(36),
  Left(37),
  Up(38),
  Right(39),
  Down(40),
  Select(41),
  Print(42),
  Execute(43),
  Snapshot(44),
  Insert(45),
  Delete(46),
  Help(47),
  Number0(48),
  Number1(49),
  Number2(50),
  Number3(51),
  Number4(52),
  Number5(53),
  Number6(54),
  Number7(55),
  Number8(56),
  Number9(57),
  A(65),
  B(66),
  C(67),
  D(68),
  E(69),
  F(70),
  G(71),
  H(72),
  I(73),
  J(74),
  K(75),
  L(76),
  M(77),
  N(78),
  O(79),
  P(80),
  Q(81),
  R(82),
  S(83),
  T(84),
  U(85),
  V(86),
  W(87),
  X(88),
  Y(89),
  Z(90),
  LeftWindows(91),
  RightWindows(92),
  Application(93),
  Sleep(95),
  NumberPad0(96),
  NumberPad1(97),
  NumberPad2(98),
  NumberPad3(99),
  NumberPad4(100),
  NumberPad5(101),
  NumberPad6(102),
  NumberPad7(103),
  NumberPad8(104),
  NumberPad9(105),
  Multiply(106),
  Add(107),
  Separator(108),
  Subtract(109),
  Decimal(110),
  Divide(111),
  F1(112),
  F2(113),
  F3(114),
  F4(115),
  F5(116),
  F6(117),
  F7(118),
  F8(119),
  F9(120),
  F10(121),
  F11(122),
  F12(123),
  F13(124),
  F14(125),
  F15(126),
  F16(127),
  F17(128),
  F18(129),
  F19(130),
  F20(131),
  F21(132),
  F22(133),
  F23(134),
  F24(135),
  NavigationView(136),
  NavigationMenu(137),
  NavigationUp(138),
  NavigationDown(139),
  NavigationLeft(140),
  NavigationRight(141),
  NavigationAccept(142),
  NavigationCancel(143),
  NumberKeyLock(144),
  Scroll(145),
  LeftShift(160),
  RightShift(161),
  LeftControl(162),
  RightControl(163),
  LeftMenu(164),
  RightMenu(165),
  GoBack(166),
  GoForward(167),
  Refresh(168),
  Stop(169),
  Search(170),
  Favorites(171),
  GoHome(172),
  GamepadA(195),
  GamepadB(196),
  GamepadX(197),
  GamepadY(198),
  GamepadRightShoulder(199),
  GamepadLeftShoulder(200),
  GamepadLeftTrigger(201),
  GamepadRightTrigger(202),
  GamepadDPadUp(203),
  GamepadDPadDown(204),
  GamepadDPadLeft(205),
  GamepadDPadRight(206),
  GamepadMenu(207),
  GamepadView(208),
  GamepadLeftThumbstickButton(209),
  GamepadRightThumbstickButton(210),
  GamepadLeftThumbstickUp(211),
  GamepadLeftThumbstickDown(212),
  GamepadLeftThumbstickRight(213),
  GamepadLeftThumbstickLeft(214),
  GamepadRightThumbstickUp(215),
  GamepadRightThumbstickDown(216),
  GamepadRightThumbstickRight(217),
  GamepadRightThumbstickLeft(218),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      VirtualKey {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> LeftButton
      2 -> RightButton
      3 -> Cancel
      4 -> MiddleButton
      5 -> XButton1
      6 -> XButton2
      8 -> Back
      9 -> Tab
      12 -> Clear
      13 -> Enter
      16 -> Shift
      17 -> Control
      18 -> Menu
      19 -> Pause
      20 -> CapitalLock
      21 -> Kana
      21 -> Hangul
      22 -> ImeOn
      23 -> Junja
      24 -> Final
      25 -> Hanja
      25 -> Kanji
      26 -> ImeOff
      27 -> Escape
      28 -> Convert
      29 -> NonConvert
      30 -> Accept
      31 -> ModeChange
      32 -> Space
      33 -> PageUp
      34 -> PageDown
      35 -> End
      36 -> Home
      37 -> Left
      38 -> Up
      39 -> Right
      40 -> Down
      41 -> Select
      42 -> Print
      43 -> Execute
      44 -> Snapshot
      45 -> Insert
      46 -> Delete
      47 -> Help
      48 -> Number0
      49 -> Number1
      50 -> Number2
      51 -> Number3
      52 -> Number4
      53 -> Number5
      54 -> Number6
      55 -> Number7
      56 -> Number8
      57 -> Number9
      65 -> A
      66 -> B
      67 -> C
      68 -> D
      69 -> E
      70 -> F
      71 -> G
      72 -> H
      73 -> I
      74 -> J
      75 -> K
      76 -> L
      77 -> M
      78 -> N
      79 -> O
      80 -> P
      81 -> Q
      82 -> R
      83 -> S
      84 -> T
      85 -> U
      86 -> V
      87 -> W
      88 -> X
      89 -> Y
      90 -> Z
      91 -> LeftWindows
      92 -> RightWindows
      93 -> Application
      95 -> Sleep
      96 -> NumberPad0
      97 -> NumberPad1
      98 -> NumberPad2
      99 -> NumberPad3
      100 -> NumberPad4
      101 -> NumberPad5
      102 -> NumberPad6
      103 -> NumberPad7
      104 -> NumberPad8
      105 -> NumberPad9
      106 -> Multiply
      107 -> Add
      108 -> Separator
      109 -> Subtract
      110 -> Decimal
      111 -> Divide
      112 -> F1
      113 -> F2
      114 -> F3
      115 -> F4
      116 -> F5
      117 -> F6
      118 -> F7
      119 -> F8
      120 -> F9
      121 -> F10
      122 -> F11
      123 -> F12
      124 -> F13
      125 -> F14
      126 -> F15
      127 -> F16
      128 -> F17
      129 -> F18
      130 -> F19
      131 -> F20
      132 -> F21
      133 -> F22
      134 -> F23
      135 -> F24
      136 -> NavigationView
      137 -> NavigationMenu
      138 -> NavigationUp
      139 -> NavigationDown
      140 -> NavigationLeft
      141 -> NavigationRight
      142 -> NavigationAccept
      143 -> NavigationCancel
      144 -> NumberKeyLock
      145 -> Scroll
      160 -> LeftShift
      161 -> RightShift
      162 -> LeftControl
      163 -> RightControl
      164 -> LeftMenu
      165 -> RightMenu
      166 -> GoBack
      167 -> GoForward
      168 -> Refresh
      169 -> Stop
      170 -> Search
      171 -> Favorites
      172 -> GoHome
      195 -> GamepadA
      196 -> GamepadB
      197 -> GamepadX
      198 -> GamepadY
      199 -> GamepadRightShoulder
      200 -> GamepadLeftShoulder
      201 -> GamepadLeftTrigger
      202 -> GamepadRightTrigger
      203 -> GamepadDPadUp
      204 -> GamepadDPadDown
      205 -> GamepadDPadLeft
      206 -> GamepadDPadRight
      207 -> GamepadMenu
      208 -> GamepadView
      209 -> GamepadLeftThumbstickButton
      210 -> GamepadRightThumbstickButton
      211 -> GamepadLeftThumbstickUp
      212 -> GamepadLeftThumbstickDown
      213 -> GamepadLeftThumbstickRight
      214 -> GamepadLeftThumbstickLeft
      215 -> GamepadRightThumbstickUp
      216 -> GamepadRightThumbstickDown
      217 -> GamepadRightThumbstickRight
      218 -> GamepadRightThumbstickLeft
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<VirtualKey> {
    public fun setValue(newValue: VirtualKey): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): VirtualKey =
        VirtualKey.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<VirtualKey, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): VirtualKey =
        VirtualKey.values()[0].fromNative(value, null)

    public override fun toNative(obj: VirtualKey): Int = obj.value
  }
}
