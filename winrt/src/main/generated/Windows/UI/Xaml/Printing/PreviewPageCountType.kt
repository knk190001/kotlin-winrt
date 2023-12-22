package Windows.UI.Xaml.Printing

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

@ABIMarker(PreviewPageCountType.ABI::class)
@Signature("enum(Windows.UI.Xaml.Printing.PreviewPageCountType;i4)")
@WinRTByReference(brClass = PreviewPageCountType.ByReference::class)
public enum class PreviewPageCountType(
  public val value: Int
) : NativeMapped {
  Final(0),
  Intermediate(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PreviewPageCountType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Final
      1 -> Intermediate
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PreviewPageCountType> {
    public fun setValue(newValue: PreviewPageCountType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PreviewPageCountType =
        PreviewPageCountType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PreviewPageCountType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PreviewPageCountType =
        PreviewPageCountType.values()[0].fromNative(value, null)

    public override fun toNative(obj: PreviewPageCountType): Int = obj.value
  }
}
