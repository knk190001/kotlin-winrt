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

@ABIMarker(AppCaptureMetadataPriority.ABI::class)
@Signature("enum(Windows.Media.Capture.AppCaptureMetadataPriority;i4)")
@WinRTByReference(brClass = AppCaptureMetadataPriority.ByReference::class)
public enum class AppCaptureMetadataPriority(
  public val value: Int
) : NativeMapped {
  Informational(0),
  Important(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AppCaptureMetadataPriority {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Informational
      1 -> Important
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<AppCaptureMetadataPriority> {
    public fun setValue(newValue: AppCaptureMetadataPriority): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AppCaptureMetadataPriority =
        AppCaptureMetadataPriority.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AppCaptureMetadataPriority, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AppCaptureMetadataPriority =
        AppCaptureMetadataPriority.values()[0].fromNative(value, null)

    public override fun toNative(obj: AppCaptureMetadataPriority): Int = obj.value
  }
}
