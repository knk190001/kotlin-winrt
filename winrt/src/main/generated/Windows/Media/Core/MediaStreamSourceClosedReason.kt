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

@ABIMarker(MediaStreamSourceClosedReason.ABI::class)
@Signature("enum(Windows.Media.Core.MediaStreamSourceClosedReason;i4)")
@WinRTByReference(brClass = MediaStreamSourceClosedReason.ByReference::class)
public enum class MediaStreamSourceClosedReason(
  public val value: Int
) : NativeMapped {
  Done(0),
  UnknownError(1),
  AppReportedError(2),
  UnsupportedProtectionSystem(3),
  ProtectionSystemFailure(4),
  UnsupportedEncodingFormat(5),
  MissingSampleRequestedEventHandler(6),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      MediaStreamSourceClosedReason {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Done
      1 -> UnknownError
      2 -> AppReportedError
      3 -> UnsupportedProtectionSystem
      4 -> ProtectionSystemFailure
      5 -> UnsupportedEncodingFormat
      6 -> MissingSampleRequestedEventHandler
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<MediaStreamSourceClosedReason> {
    public fun setValue(newValue: MediaStreamSourceClosedReason): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): MediaStreamSourceClosedReason =
        MediaStreamSourceClosedReason.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<MediaStreamSourceClosedReason, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): MediaStreamSourceClosedReason =
        MediaStreamSourceClosedReason.values()[0].fromNative(value, null)

    public override fun toNative(obj: MediaStreamSourceClosedReason): Int = obj.value
  }
}
