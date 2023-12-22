package Windows.Media.Capture

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

@ABIMarker(GameBarTargetCapturePolicy.ABI::class)
@Signature("enum(Windows.Media.Capture.GameBarTargetCapturePolicy;i4)")
@WinRTByReference(brClass = GameBarTargetCapturePolicy.ByReference::class)
public enum class GameBarTargetCapturePolicy(
  public val value: Int
) : NativeMapped {
  EnabledBySystem(0),
  EnabledByUser(1),
  NotEnabled(2),
  ProhibitedBySystem(3),
  ProhibitedByPublisher(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      GameBarTargetCapturePolicy {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> EnabledBySystem
      1 -> EnabledByUser
      2 -> NotEnabled
      3 -> ProhibitedBySystem
      4 -> ProhibitedByPublisher
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<GameBarTargetCapturePolicy> {
    public fun setValue(newValue: GameBarTargetCapturePolicy): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): GameBarTargetCapturePolicy =
        GameBarTargetCapturePolicy.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<GameBarTargetCapturePolicy, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): GameBarTargetCapturePolicy =
        GameBarTargetCapturePolicy.values()[0].fromNative(value, null)

    public override fun toNative(obj: GameBarTargetCapturePolicy): Int = obj.value
  }
}
