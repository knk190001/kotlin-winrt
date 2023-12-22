package Windows.UI.Input.Spatial

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

@ABIMarker(SpatialInteractionSourceHandedness.ABI::class)
@Signature("enum(Windows.UI.Input.Spatial.SpatialInteractionSourceHandedness;i4)")
@WinRTByReference(brClass = SpatialInteractionSourceHandedness.ByReference::class)
public enum class SpatialInteractionSourceHandedness(
  public val value: Int
) : NativeMapped {
  Unspecified(0),
  Left(1),
  Right(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SpatialInteractionSourceHandedness {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unspecified
      1 -> Left
      2 -> Right
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<SpatialInteractionSourceHandedness> {
    public fun setValue(newValue: SpatialInteractionSourceHandedness): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SpatialInteractionSourceHandedness =
        SpatialInteractionSourceHandedness.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SpatialInteractionSourceHandedness, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SpatialInteractionSourceHandedness =
        SpatialInteractionSourceHandedness.values()[0].fromNative(value, null)

    public override fun toNative(obj: SpatialInteractionSourceHandedness): Int = obj.value
  }
}
