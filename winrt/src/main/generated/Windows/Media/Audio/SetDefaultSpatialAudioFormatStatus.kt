package Windows.Media.Audio

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

@ABIMarker(SetDefaultSpatialAudioFormatStatus.ABI::class)
@Signature("enum(Windows.Media.Audio.SetDefaultSpatialAudioFormatStatus;i4)")
@WinRTByReference(brClass = SetDefaultSpatialAudioFormatStatus.ByReference::class)
public enum class SetDefaultSpatialAudioFormatStatus(
  public val value: Int
) : NativeMapped {
  Succeeded(0),
  AccessDenied(1),
  LicenseExpired(2),
  LicenseNotValidForAudioEndpoint(3),
  NotSupportedOnAudioEndpoint(4),
  UnknownError(5),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SetDefaultSpatialAudioFormatStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Succeeded
      1 -> AccessDenied
      2 -> LicenseExpired
      3 -> LicenseNotValidForAudioEndpoint
      4 -> NotSupportedOnAudioEndpoint
      5 -> UnknownError
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<SetDefaultSpatialAudioFormatStatus> {
    public fun setValue(newValue: SetDefaultSpatialAudioFormatStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SetDefaultSpatialAudioFormatStatus =
        SetDefaultSpatialAudioFormatStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SetDefaultSpatialAudioFormatStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SetDefaultSpatialAudioFormatStatus =
        SetDefaultSpatialAudioFormatStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: SetDefaultSpatialAudioFormatStatus): Int = obj.value
  }
}
