package Windows.Media.Capture.Frames

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

@ABIMarker(MultiSourceMediaFrameReaderStartStatus.ABI::class)
@Signature("enum(Windows.Media.Capture.Frames.MultiSourceMediaFrameReaderStartStatus;i4)")
@WinRTByReference(brClass = MultiSourceMediaFrameReaderStartStatus.ByReference::class)
public enum class MultiSourceMediaFrameReaderStartStatus(
  public val value: Int
) : NativeMapped {
  Success(0),
  NotSupported(1),
  InsufficientResources(2),
  DeviceNotAvailable(3),
  UnknownFailure(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      MultiSourceMediaFrameReaderStartStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Success
      1 -> NotSupported
      2 -> InsufficientResources
      3 -> DeviceNotAvailable
      4 -> UnknownFailure
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<MultiSourceMediaFrameReaderStartStatus> {
    public fun setValue(newValue: MultiSourceMediaFrameReaderStartStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): MultiSourceMediaFrameReaderStartStatus =
        MultiSourceMediaFrameReaderStartStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<MultiSourceMediaFrameReaderStartStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): MultiSourceMediaFrameReaderStartStatus =
        MultiSourceMediaFrameReaderStartStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: MultiSourceMediaFrameReaderStartStatus): Int = obj.value
  }
}
