package Microsoft.UI.Xaml.Automation

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

@ABIMarker(SynchronizedInputType.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.Automation.SynchronizedInputType;i4)")
@WinRTByReference(brClass = SynchronizedInputType.ByReference::class)
public enum class SynchronizedInputType(
  public val value: Int
) : NativeMapped {
  KeyUp(1),
  KeyDown(2),
  LeftMouseUp(4),
  LeftMouseDown(8),
  RightMouseUp(16),
  RightMouseDown(32),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SynchronizedInputType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      1 -> KeyUp
      2 -> KeyDown
      4 -> LeftMouseUp
      8 -> LeftMouseDown
      16 -> RightMouseUp
      32 -> RightMouseDown
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<SynchronizedInputType> {
    public fun setValue(newValue: SynchronizedInputType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SynchronizedInputType =
        SynchronizedInputType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SynchronizedInputType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SynchronizedInputType =
        SynchronizedInputType.values()[0].fromNative(value, null)

    public override fun toNative(obj: SynchronizedInputType): Int = obj.value
  }
}
