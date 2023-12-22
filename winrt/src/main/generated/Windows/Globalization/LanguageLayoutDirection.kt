package Windows.Globalization

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

@ABIMarker(LanguageLayoutDirection.ABI::class)
@Signature("enum(Windows.Globalization.LanguageLayoutDirection;i4)")
@WinRTByReference(brClass = LanguageLayoutDirection.ByReference::class)
public enum class LanguageLayoutDirection(
  public val value: Int
) : NativeMapped {
  Ltr(0),
  Rtl(1),
  TtbLtr(2),
  TtbRtl(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      LanguageLayoutDirection {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Ltr
      1 -> Rtl
      2 -> TtbLtr
      3 -> TtbRtl
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<LanguageLayoutDirection> {
    public fun setValue(newValue: LanguageLayoutDirection): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): LanguageLayoutDirection =
        LanguageLayoutDirection.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<LanguageLayoutDirection, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): LanguageLayoutDirection =
        LanguageLayoutDirection.values()[0].fromNative(value, null)

    public override fun toNative(obj: LanguageLayoutDirection): Int = obj.value
  }
}
