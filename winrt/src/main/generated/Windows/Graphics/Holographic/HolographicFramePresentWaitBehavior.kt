package Windows.Graphics.Holographic

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

@ABIMarker(HolographicFramePresentWaitBehavior.ABI::class)
@Signature("enum(Windows.Graphics.Holographic.HolographicFramePresentWaitBehavior;i4)")
@WinRTByReference(brClass = HolographicFramePresentWaitBehavior.ByReference::class)
public enum class HolographicFramePresentWaitBehavior(
  public val value: Int
) : NativeMapped {
  WaitForFrameToFinish(0),
  DoNotWaitForFrameToFinish(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      HolographicFramePresentWaitBehavior {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> WaitForFrameToFinish
      1 -> DoNotWaitForFrameToFinish
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<HolographicFramePresentWaitBehavior> {
    public fun setValue(newValue: HolographicFramePresentWaitBehavior): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): HolographicFramePresentWaitBehavior =
        HolographicFramePresentWaitBehavior.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<HolographicFramePresentWaitBehavior, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): HolographicFramePresentWaitBehavior =
        HolographicFramePresentWaitBehavior.values()[0].fromNative(value, null)

    public override fun toNative(obj: HolographicFramePresentWaitBehavior): Int = obj.value
  }
}
