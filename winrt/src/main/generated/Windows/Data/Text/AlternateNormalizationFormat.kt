package Windows.Data.Text

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

@ABIMarker(AlternateNormalizationFormat.ABI::class)
@Signature("enum(Windows.Data.Text.AlternateNormalizationFormat;i4)")
@WinRTByReference(brClass = AlternateNormalizationFormat.ByReference::class)
public enum class AlternateNormalizationFormat(
  public val value: Int
) : NativeMapped {
  NotNormalized(0),
  Number(1),
  Currency(3),
  Date(4),
  Time(5),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AlternateNormalizationFormat {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> NotNormalized
      1 -> Number
      3 -> Currency
      4 -> Date
      5 -> Time
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<AlternateNormalizationFormat> {
    public fun setValue(newValue: AlternateNormalizationFormat): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AlternateNormalizationFormat =
        AlternateNormalizationFormat.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AlternateNormalizationFormat, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AlternateNormalizationFormat =
        AlternateNormalizationFormat.values()[0].fromNative(value, null)

    public override fun toNative(obj: AlternateNormalizationFormat): Int = obj.value
  }
}
