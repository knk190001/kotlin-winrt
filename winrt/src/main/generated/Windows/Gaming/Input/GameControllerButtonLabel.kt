package Windows.Gaming.Input

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

@ABIMarker(GameControllerButtonLabel.ABI::class)
@Signature("enum(Windows.Gaming.Input.GameControllerButtonLabel;i4)")
@WinRTByReference(brClass = GameControllerButtonLabel.ByReference::class)
public enum class GameControllerButtonLabel(
  public val value: Int
) : NativeMapped {
  None(0),
  XboxBack(1),
  XboxStart(2),
  XboxMenu(3),
  XboxView(4),
  XboxUp(5),
  XboxDown(6),
  XboxLeft(7),
  XboxRight(8),
  XboxA(9),
  XboxB(10),
  XboxX(11),
  XboxY(12),
  XboxLeftBumper(13),
  XboxLeftTrigger(14),
  XboxLeftStickButton(15),
  XboxRightBumper(16),
  XboxRightTrigger(17),
  XboxRightStickButton(18),
  XboxPaddle1(19),
  XboxPaddle2(20),
  XboxPaddle3(21),
  XboxPaddle4(22),
  Mode(23),
  Select(24),
  Menu(25),
  View(26),
  Back(27),
  Start(28),
  Options(29),
  Share(30),
  Up(31),
  Down(32),
  Left(33),
  Right(34),
  LetterA(35),
  LetterB(36),
  LetterC(37),
  LetterL(38),
  LetterR(39),
  LetterX(40),
  LetterY(41),
  LetterZ(42),
  Cross(43),
  Circle(44),
  Square(45),
  Triangle(46),
  LeftBumper(47),
  LeftTrigger(48),
  LeftStickButton(49),
  Left1(50),
  Left2(51),
  Left3(52),
  RightBumper(53),
  RightTrigger(54),
  RightStickButton(55),
  Right1(56),
  Right2(57),
  Right3(58),
  Paddle1(59),
  Paddle2(60),
  Paddle3(61),
  Paddle4(62),
  Plus(63),
  Minus(64),
  DownLeftArrow(65),
  DialLeft(66),
  DialRight(67),
  Suspension(68),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      GameControllerButtonLabel {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> XboxBack
      2 -> XboxStart
      3 -> XboxMenu
      4 -> XboxView
      5 -> XboxUp
      6 -> XboxDown
      7 -> XboxLeft
      8 -> XboxRight
      9 -> XboxA
      10 -> XboxB
      11 -> XboxX
      12 -> XboxY
      13 -> XboxLeftBumper
      14 -> XboxLeftTrigger
      15 -> XboxLeftStickButton
      16 -> XboxRightBumper
      17 -> XboxRightTrigger
      18 -> XboxRightStickButton
      19 -> XboxPaddle1
      20 -> XboxPaddle2
      21 -> XboxPaddle3
      22 -> XboxPaddle4
      23 -> Mode
      24 -> Select
      25 -> Menu
      26 -> View
      27 -> Back
      28 -> Start
      29 -> Options
      30 -> Share
      31 -> Up
      32 -> Down
      33 -> Left
      34 -> Right
      35 -> LetterA
      36 -> LetterB
      37 -> LetterC
      38 -> LetterL
      39 -> LetterR
      40 -> LetterX
      41 -> LetterY
      42 -> LetterZ
      43 -> Cross
      44 -> Circle
      45 -> Square
      46 -> Triangle
      47 -> LeftBumper
      48 -> LeftTrigger
      49 -> LeftStickButton
      50 -> Left1
      51 -> Left2
      52 -> Left3
      53 -> RightBumper
      54 -> RightTrigger
      55 -> RightStickButton
      56 -> Right1
      57 -> Right2
      58 -> Right3
      59 -> Paddle1
      60 -> Paddle2
      61 -> Paddle3
      62 -> Paddle4
      63 -> Plus
      64 -> Minus
      65 -> DownLeftArrow
      66 -> DialLeft
      67 -> DialRight
      68 -> Suspension
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<GameControllerButtonLabel>
      {
    public fun setValue(newValue: GameControllerButtonLabel): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): GameControllerButtonLabel =
        GameControllerButtonLabel.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<GameControllerButtonLabel, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): GameControllerButtonLabel =
        GameControllerButtonLabel.values()[0].fromNative(value, null)

    public override fun toNative(obj: GameControllerButtonLabel): Int = obj.value
  }
}
