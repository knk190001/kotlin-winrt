package Windows.UI.Xaml.Input

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

@ABIMarker(InputScopeNameValue.ABI::class)
@Signature("enum(Windows.UI.Xaml.Input.InputScopeNameValue;i4)")
@WinRTByReference(brClass = InputScopeNameValue.ByReference::class)
public enum class InputScopeNameValue(
  public val value: Int
) : NativeMapped {
  Default(0),
  Url(1),
  EmailSmtpAddress(5),
  PersonalFullName(7),
  CurrencyAmountAndSymbol(20),
  CurrencyAmount(21),
  DateMonthNumber(23),
  DateDayNumber(24),
  DateYear(25),
  Digits(28),
  Number(29),
  Password(31),
  TelephoneNumber(32),
  TelephoneCountryCode(33),
  TelephoneAreaCode(34),
  TelephoneLocalNumber(35),
  TimeHour(37),
  TimeMinutesOrSeconds(38),
  NumberFullWidth(39),
  AlphanumericHalfWidth(40),
  AlphanumericFullWidth(41),
  Hiragana(44),
  KatakanaHalfWidth(45),
  KatakanaFullWidth(46),
  Hanja(47),
  HangulHalfWidth(48),
  HangulFullWidth(49),
  Search(50),
  Formula(51),
  SearchIncremental(52),
  ChineseHalfWidth(53),
  ChineseFullWidth(54),
  NativeScript(55),
  Text(57),
  Chat(58),
  NameOrPhoneNumber(59),
  EmailNameOrAddress(60),
  Private(61),
  Maps(62),
  NumericPassword(63),
  NumericPin(64),
  AlphanumericPin(65),
  FormulaNumber(67),
  ChatWithoutEmoji(68),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      InputScopeNameValue {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Default
      1 -> Url
      5 -> EmailSmtpAddress
      7 -> PersonalFullName
      20 -> CurrencyAmountAndSymbol
      21 -> CurrencyAmount
      23 -> DateMonthNumber
      24 -> DateDayNumber
      25 -> DateYear
      28 -> Digits
      29 -> Number
      31 -> Password
      32 -> TelephoneNumber
      33 -> TelephoneCountryCode
      34 -> TelephoneAreaCode
      35 -> TelephoneLocalNumber
      37 -> TimeHour
      38 -> TimeMinutesOrSeconds
      39 -> NumberFullWidth
      40 -> AlphanumericHalfWidth
      41 -> AlphanumericFullWidth
      44 -> Hiragana
      45 -> KatakanaHalfWidth
      46 -> KatakanaFullWidth
      47 -> Hanja
      48 -> HangulHalfWidth
      49 -> HangulFullWidth
      50 -> Search
      51 -> Formula
      52 -> SearchIncremental
      53 -> ChineseHalfWidth
      54 -> ChineseFullWidth
      55 -> NativeScript
      57 -> Text
      58 -> Chat
      59 -> NameOrPhoneNumber
      60 -> EmailNameOrAddress
      61 -> Private
      62 -> Maps
      63 -> NumericPassword
      64 -> NumericPin
      65 -> AlphanumericPin
      67 -> FormulaNumber
      68 -> ChatWithoutEmoji
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<InputScopeNameValue> {
    public fun setValue(newValue: InputScopeNameValue): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): InputScopeNameValue =
        InputScopeNameValue.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<InputScopeNameValue, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): InputScopeNameValue =
        InputScopeNameValue.values()[0].fromNative(value, null)

    public override fun toNative(obj: InputScopeNameValue): Int = obj.value
  }
}
