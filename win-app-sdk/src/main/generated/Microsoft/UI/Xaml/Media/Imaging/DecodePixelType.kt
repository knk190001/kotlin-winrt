package Microsoft.UI.Xaml.Media.Imaging

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

@ABIMarker(DecodePixelType.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.Media.Imaging.DecodePixelType;i4)")
@WinRTByReference(brClass = DecodePixelType.ByReference::class)
public enum class DecodePixelType(
  public val value: Int
) : NativeMapped {
  Physical(0),
  Logical(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      DecodePixelType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Physical
      1 -> Logical
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<DecodePixelType> {
    public fun setValue(newValue: DecodePixelType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): DecodePixelType =
        DecodePixelType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<DecodePixelType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): DecodePixelType =
        DecodePixelType.values()[0].fromNative(value, null)

    public override fun toNative(obj: DecodePixelType): Int = obj.value
  }
}
