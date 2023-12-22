package Windows.Media.Devices

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

@ABIMarker(AdvancedPhotoMode.ABI::class)
@Signature("enum(Windows.Media.Devices.AdvancedPhotoMode;i4)")
@WinRTByReference(brClass = AdvancedPhotoMode.ByReference::class)
public enum class AdvancedPhotoMode(
  public val value: Int
) : NativeMapped {
  Auto(0),
  Standard(1),
  Hdr(2),
  LowLight(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AdvancedPhotoMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Auto
      1 -> Standard
      2 -> Hdr
      3 -> LowLight
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<AdvancedPhotoMode> {
    public fun setValue(newValue: AdvancedPhotoMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AdvancedPhotoMode =
        AdvancedPhotoMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AdvancedPhotoMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AdvancedPhotoMode =
        AdvancedPhotoMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: AdvancedPhotoMode): Int = obj.value
  }
}
