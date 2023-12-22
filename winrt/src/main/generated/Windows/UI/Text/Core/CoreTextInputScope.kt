package Windows.UI.Text.Core

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

@ABIMarker(CoreTextInputScope.ABI::class)
@Signature("enum(Windows.UI.Text.Core.CoreTextInputScope;i4)")
@WinRTByReference(brClass = CoreTextInputScope.ByReference::class)
public enum class CoreTextInputScope(
  public val value: Int
) : NativeMapped {
  Default(0),
  Url(1),
  FilePath(2),
  FileName(3),
  EmailUserName(4),
  EmailAddress(5),
  UserName(6),
  PersonalFullName(7),
  PersonalNamePrefix(8),
  PersonalGivenName(9),
  PersonalMiddleName(10),
  PersonalSurname(11),
  PersonalNameSuffix(12),
  Address(13),
  AddressPostalCode(14),
  AddressStreet(15),
  AddressStateOrProvince(16),
  AddressCity(17),
  AddressCountryName(18),
  AddressCountryShortName(19),
  CurrencyAmountAndSymbol(20),
  CurrencyAmount(21),
  Date(22),
  DateMonth(23),
  DateDay(24),
  DateYear(25),
  DateMonthName(26),
  DateDayName(27),
  Number(29),
  SingleCharacter(30),
  Password(31),
  TelephoneNumber(32),
  TelephoneCountryCode(33),
  TelephoneAreaCode(34),
  TelephoneLocalNumber(35),
  Time(36),
  TimeHour(37),
  TimeMinuteOrSecond(38),
  NumberFullWidth(39),
  AlphanumericHalfWidth(40),
  AlphanumericFullWidth(41),
  CurrencyChinese(42),
  Bopomofo(43),
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
  EmailUserNameOrAddress(60),
  Private(61),
  Maps(62),
  PasswordNumeric(63),
  FormulaNumber(67),
  ChatWithoutEmoji(68),
  Digits(28),
  PinNumeric(64),
  PinAlphanumeric(65),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CoreTextInputScope {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Default
      1 -> Url
      2 -> FilePath
      3 -> FileName
      4 -> EmailUserName
      5 -> EmailAddress
      6 -> UserName
      7 -> PersonalFullName
      8 -> PersonalNamePrefix
      9 -> PersonalGivenName
      10 -> PersonalMiddleName
      11 -> PersonalSurname
      12 -> PersonalNameSuffix
      13 -> Address
      14 -> AddressPostalCode
      15 -> AddressStreet
      16 -> AddressStateOrProvince
      17 -> AddressCity
      18 -> AddressCountryName
      19 -> AddressCountryShortName
      20 -> CurrencyAmountAndSymbol
      21 -> CurrencyAmount
      22 -> Date
      23 -> DateMonth
      24 -> DateDay
      25 -> DateYear
      26 -> DateMonthName
      27 -> DateDayName
      29 -> Number
      30 -> SingleCharacter
      31 -> Password
      32 -> TelephoneNumber
      33 -> TelephoneCountryCode
      34 -> TelephoneAreaCode
      35 -> TelephoneLocalNumber
      36 -> Time
      37 -> TimeHour
      38 -> TimeMinuteOrSecond
      39 -> NumberFullWidth
      40 -> AlphanumericHalfWidth
      41 -> AlphanumericFullWidth
      42 -> CurrencyChinese
      43 -> Bopomofo
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
      60 -> EmailUserNameOrAddress
      61 -> Private
      62 -> Maps
      63 -> PasswordNumeric
      67 -> FormulaNumber
      68 -> ChatWithoutEmoji
      28 -> Digits
      64 -> PinNumeric
      65 -> PinAlphanumeric
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<CoreTextInputScope> {
    public fun setValue(newValue: CoreTextInputScope): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CoreTextInputScope =
        CoreTextInputScope.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CoreTextInputScope, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CoreTextInputScope =
        CoreTextInputScope.values()[0].fromNative(value, null)

    public override fun toNative(obj: CoreTextInputScope): Int = obj.value
  }
}
