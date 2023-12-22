package Microsoft.UI.Xaml.Data

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

@ABIMarker(RelativeSourceMode.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.Data.RelativeSourceMode;i4)")
@WinRTByReference(brClass = RelativeSourceMode.ByReference::class)
public enum class RelativeSourceMode(
  public val value: Int
) : NativeMapped {
  None(0),
  TemplatedParent(1),
  Self(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      RelativeSourceMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> TemplatedParent
      2 -> Self
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<RelativeSourceMode> {
    public fun setValue(newValue: RelativeSourceMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): RelativeSourceMode =
        RelativeSourceMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<RelativeSourceMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): RelativeSourceMode =
        RelativeSourceMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: RelativeSourceMode): Int = obj.value
  }
}
