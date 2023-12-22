package Windows.Devices.Perception

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

@ABIMarker(PerceptionFrameSourcePropertyChangeStatus.ABI::class)
@Signature("enum(Windows.Devices.Perception.PerceptionFrameSourcePropertyChangeStatus;i4)")
@WinRTByReference(brClass = PerceptionFrameSourcePropertyChangeStatus.ByReference::class)
public enum class PerceptionFrameSourcePropertyChangeStatus(
  public val value: Int
) : NativeMapped {
  Unknown(0),
  Accepted(1),
  LostControl(2),
  PropertyNotSupported(3),
  PropertyReadOnly(4),
  ValueOutOfRange(5),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PerceptionFrameSourcePropertyChangeStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unknown
      1 -> Accepted
      2 -> LostControl
      3 -> PropertyNotSupported
      4 -> PropertyReadOnly
      5 -> ValueOutOfRange
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<PerceptionFrameSourcePropertyChangeStatus> {
    public fun setValue(newValue: PerceptionFrameSourcePropertyChangeStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PerceptionFrameSourcePropertyChangeStatus =
        PerceptionFrameSourcePropertyChangeStatus.values()[0].fromNative(this.pointer.getInt(0),
        null)
  }

  public object ABI : IABI<PerceptionFrameSourcePropertyChangeStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PerceptionFrameSourcePropertyChangeStatus =
        PerceptionFrameSourcePropertyChangeStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: PerceptionFrameSourcePropertyChangeStatus): Int = obj.value
  }
}
