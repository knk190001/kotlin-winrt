package Windows.Storage

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

@ABIMarker(StreamedFileFailureMode.ABI::class)
@Signature("enum(Windows.Storage.StreamedFileFailureMode;i4)")
@WinRTByReference(brClass = StreamedFileFailureMode.ByReference::class)
public enum class StreamedFileFailureMode(
  public val value: Int
) : NativeMapped {
  Failed(0),
  CurrentlyUnavailable(1),
  Incomplete(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      StreamedFileFailureMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Failed
      1 -> CurrentlyUnavailable
      2 -> Incomplete
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<StreamedFileFailureMode> {
    public fun setValue(newValue: StreamedFileFailureMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): StreamedFileFailureMode =
        StreamedFileFailureMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<StreamedFileFailureMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): StreamedFileFailureMode =
        StreamedFileFailureMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: StreamedFileFailureMode): Int = obj.value
  }
}
