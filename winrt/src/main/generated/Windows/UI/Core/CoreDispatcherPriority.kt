package Windows.UI.Core

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

@ABIMarker(CoreDispatcherPriority.ABI::class)
@Signature("enum(Windows.UI.Core.CoreDispatcherPriority;i4)")
@WinRTByReference(brClass = CoreDispatcherPriority.ByReference::class)
public enum class CoreDispatcherPriority(
  public val value: Int
) : NativeMapped {
  Idle(-2),
  Low(-1),
  Normal(0),
  High(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CoreDispatcherPriority {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      -2 -> Idle
      -1 -> Low
      0 -> Normal
      1 -> High
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<CoreDispatcherPriority> {
    public fun setValue(newValue: CoreDispatcherPriority): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CoreDispatcherPriority =
        CoreDispatcherPriority.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CoreDispatcherPriority, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CoreDispatcherPriority =
        CoreDispatcherPriority.values()[0].fromNative(value, null)

    public override fun toNative(obj: CoreDispatcherPriority): Int = obj.value
  }
}
