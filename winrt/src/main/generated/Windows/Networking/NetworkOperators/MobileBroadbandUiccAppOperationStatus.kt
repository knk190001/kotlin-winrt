package Windows.Networking.NetworkOperators

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

@ABIMarker(MobileBroadbandUiccAppOperationStatus.ABI::class)
@Signature("enum(Windows.Networking.NetworkOperators.MobileBroadbandUiccAppOperationStatus;i4)")
@WinRTByReference(brClass = MobileBroadbandUiccAppOperationStatus.ByReference::class)
public enum class MobileBroadbandUiccAppOperationStatus(
  public val value: Int
) : NativeMapped {
  Success(0),
  InvalidUiccFilePath(1),
  AccessConditionNotHeld(2),
  UiccBusy(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      MobileBroadbandUiccAppOperationStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Success
      1 -> InvalidUiccFilePath
      2 -> AccessConditionNotHeld
      3 -> UiccBusy
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<MobileBroadbandUiccAppOperationStatus> {
    public fun setValue(newValue: MobileBroadbandUiccAppOperationStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): MobileBroadbandUiccAppOperationStatus =
        MobileBroadbandUiccAppOperationStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<MobileBroadbandUiccAppOperationStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): MobileBroadbandUiccAppOperationStatus =
        MobileBroadbandUiccAppOperationStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: MobileBroadbandUiccAppOperationStatus): Int = obj.value
  }
}
