package Windows.AI.MachineLearning.Preview

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

@ABIMarker(LearningModelDeviceKindPreview.ABI::class)
@Signature("enum(Windows.AI.MachineLearning.Preview.LearningModelDeviceKindPreview;i4)")
@WinRTByReference(brClass = LearningModelDeviceKindPreview.ByReference::class)
public enum class LearningModelDeviceKindPreview(
  public val value: Int
) : NativeMapped {
  LearningDeviceAny(0),
  LearningDeviceCpu(1),
  LearningDeviceGpu(2),
  LearningDeviceNpu(3),
  LearningDeviceDsp(4),
  LearningDeviceFpga(5),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      LearningModelDeviceKindPreview {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> LearningDeviceAny
      1 -> LearningDeviceCpu
      2 -> LearningDeviceGpu
      3 -> LearningDeviceNpu
      4 -> LearningDeviceDsp
      5 -> LearningDeviceFpga
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<LearningModelDeviceKindPreview> {
    public fun setValue(newValue: LearningModelDeviceKindPreview): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): LearningModelDeviceKindPreview =
        LearningModelDeviceKindPreview.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<LearningModelDeviceKindPreview, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): LearningModelDeviceKindPreview =
        LearningModelDeviceKindPreview.values()[0].fromNative(value, null)

    public override fun toNative(obj: LearningModelDeviceKindPreview): Int = obj.value
  }
}
