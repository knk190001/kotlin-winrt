package Windows.Media.Protection.PlayReady

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

@ABIMarker(NDProximityDetectionType.ABI::class)
@Signature("enum(Windows.Media.Protection.PlayReady.NDProximityDetectionType;i4)")
@WinRTByReference(brClass = NDProximityDetectionType.ByReference::class)
public enum class NDProximityDetectionType(
  public val value: Int
) : NativeMapped {
  UDP(1),
  TCP(2),
  TransportAgnostic(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      NDProximityDetectionType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      1 -> UDP
      2 -> TCP
      4 -> TransportAgnostic
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<NDProximityDetectionType>
      {
    public fun setValue(newValue: NDProximityDetectionType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): NDProximityDetectionType =
        NDProximityDetectionType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<NDProximityDetectionType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): NDProximityDetectionType =
        NDProximityDetectionType.values()[0].fromNative(value, null)

    public override fun toNative(obj: NDProximityDetectionType): Int = obj.value
  }
}
