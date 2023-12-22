package Windows.Graphics.Imaging

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

@ABIMarker(BitmapRotation.ABI::class)
@Signature("enum(Windows.Graphics.Imaging.BitmapRotation;i4)")
@WinRTByReference(brClass = BitmapRotation.ByReference::class)
public enum class BitmapRotation(
  public val value: Int
) : NativeMapped {
  None(0),
  Clockwise90Degrees(1),
  Clockwise180Degrees(2),
  Clockwise270Degrees(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      BitmapRotation {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Clockwise90Degrees
      2 -> Clockwise180Degrees
      3 -> Clockwise270Degrees
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<BitmapRotation> {
    public fun setValue(newValue: BitmapRotation): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): BitmapRotation =
        BitmapRotation.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<BitmapRotation, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): BitmapRotation =
        BitmapRotation.values()[0].fromNative(value, null)

    public override fun toNative(obj: BitmapRotation): Int = obj.value
  }
}
