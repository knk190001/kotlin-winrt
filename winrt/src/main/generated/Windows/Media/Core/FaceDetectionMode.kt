package Windows.Media.Core

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

@ABIMarker(FaceDetectionMode.ABI::class)
@Signature("enum(Windows.Media.Core.FaceDetectionMode;i4)")
@WinRTByReference(brClass = FaceDetectionMode.ByReference::class)
public enum class FaceDetectionMode(
  public val value: Int
) : NativeMapped {
  HighPerformance(0),
  Balanced(1),
  HighQuality(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      FaceDetectionMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> HighPerformance
      1 -> Balanced
      2 -> HighQuality
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<FaceDetectionMode> {
    public fun setValue(newValue: FaceDetectionMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): FaceDetectionMode =
        FaceDetectionMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<FaceDetectionMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): FaceDetectionMode =
        FaceDetectionMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: FaceDetectionMode): Int = obj.value
  }
}
