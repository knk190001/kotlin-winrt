package Windows.Devices.Printers

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

@ABIMarker(IppAttributeValueKind.ABI::class)
@Signature("enum(Windows.Devices.Printers.IppAttributeValueKind;i4)")
@WinRTByReference(brClass = IppAttributeValueKind.ByReference::class)
public enum class IppAttributeValueKind(
  public val value: Int
) : NativeMapped {
  Unsupported(0),
  Unknown(1),
  NoValue(2),
  Integer(3),
  Boolean(4),
  Enum(5),
  OctetString(6),
  DateTime(7),
  Resolution(8),
  RangeOfInteger(9),
  Collection(10),
  TextWithLanguage(11),
  NameWithLanguage(12),
  TextWithoutLanguage(13),
  NameWithoutLanguage(14),
  Keyword(15),
  Uri(16),
  UriSchema(17),
  Charset(18),
  NaturalLanguage(19),
  MimeMediaType(20),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      IppAttributeValueKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unsupported
      1 -> Unknown
      2 -> NoValue
      3 -> Integer
      4 -> Boolean
      5 -> Enum
      6 -> OctetString
      7 -> DateTime
      8 -> Resolution
      9 -> RangeOfInteger
      10 -> Collection
      11 -> TextWithLanguage
      12 -> NameWithLanguage
      13 -> TextWithoutLanguage
      14 -> NameWithoutLanguage
      15 -> Keyword
      16 -> Uri
      17 -> UriSchema
      18 -> Charset
      19 -> NaturalLanguage
      20 -> MimeMediaType
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<IppAttributeValueKind> {
    public fun setValue(newValue: IppAttributeValueKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): IppAttributeValueKind =
        IppAttributeValueKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<IppAttributeValueKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): IppAttributeValueKind =
        IppAttributeValueKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: IppAttributeValueKind): Int = obj.value
  }
}
