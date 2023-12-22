package Windows.AI.MachineLearning

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

@ABIMarker(LearningModelDeviceKind.ABI::class)
@Signature("enum(Windows.AI.MachineLearning.LearningModelDeviceKind;i4)")
@WinRTByReference(brClass = LearningModelDeviceKind.ByReference::class)
public enum class LearningModelDeviceKind(
  public val value: Int
) : NativeMapped {
  Default(0),
  Cpu(1),
  DirectX(2),
  DirectXHighPerformance(3),
  DirectXMinPower(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      LearningModelDeviceKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Default
      1 -> Cpu
      2 -> DirectX
      3 -> DirectXHighPerformance
      4 -> DirectXMinPower
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<LearningModelDeviceKind> {
    public fun setValue(newValue: LearningModelDeviceKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): LearningModelDeviceKind =
        LearningModelDeviceKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<LearningModelDeviceKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): LearningModelDeviceKind =
        LearningModelDeviceKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: LearningModelDeviceKind): Int = obj.value
  }
}
