package Windows.ApplicationModel.Background

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

@ABIMarker(BackgroundTaskThrottleCounter.ABI::class)
@Signature("enum(Windows.ApplicationModel.Background.BackgroundTaskThrottleCounter;i4)")
@WinRTByReference(brClass = BackgroundTaskThrottleCounter.ByReference::class)
public enum class BackgroundTaskThrottleCounter(
  public val value: Int
) : NativeMapped {
  All(0),
  Cpu(1),
  Network(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      BackgroundTaskThrottleCounter {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> All
      1 -> Cpu
      2 -> Network
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<BackgroundTaskThrottleCounter> {
    public fun setValue(newValue: BackgroundTaskThrottleCounter): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): BackgroundTaskThrottleCounter =
        BackgroundTaskThrottleCounter.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<BackgroundTaskThrottleCounter, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): BackgroundTaskThrottleCounter =
        BackgroundTaskThrottleCounter.values()[0].fromNative(value, null)

    public override fun toNative(obj: BackgroundTaskThrottleCounter): Int = obj.value
  }
}
