package Windows.ApplicationModel.Background

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

@ABIMarker(MediaProcessingTriggerResult.ABI::class)
@Signature("enum(Windows.ApplicationModel.Background.MediaProcessingTriggerResult;i4)")
@WinRTByReference(brClass = MediaProcessingTriggerResult.ByReference::class)
public enum class MediaProcessingTriggerResult(
  public val value: Int
) : NativeMapped {
  Allowed(0),
  CurrentlyRunning(1),
  DisabledByPolicy(2),
  UnknownError(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      MediaProcessingTriggerResult {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Allowed
      1 -> CurrentlyRunning
      2 -> DisabledByPolicy
      3 -> UnknownError
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<MediaProcessingTriggerResult> {
    public fun setValue(newValue: MediaProcessingTriggerResult): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): MediaProcessingTriggerResult =
        MediaProcessingTriggerResult.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<MediaProcessingTriggerResult, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): MediaProcessingTriggerResult =
        MediaProcessingTriggerResult.values()[0].fromNative(value, null)

    public override fun toNative(obj: MediaProcessingTriggerResult): Int = obj.value
  }
}
