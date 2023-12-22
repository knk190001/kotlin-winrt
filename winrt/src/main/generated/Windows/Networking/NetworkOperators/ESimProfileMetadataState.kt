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

@ABIMarker(ESimProfileMetadataState.ABI::class)
@Signature("enum(Windows.Networking.NetworkOperators.ESimProfileMetadataState;i4)")
@WinRTByReference(brClass = ESimProfileMetadataState.ByReference::class)
public enum class ESimProfileMetadataState(
  public val value: Int
) : NativeMapped {
  Unknown(0),
  WaitingForInstall(1),
  Downloading(2),
  Installing(3),
  Expired(4),
  RejectingDownload(5),
  NoLongerAvailable(6),
  DeniedByPolicy(7),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ESimProfileMetadataState {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unknown
      1 -> WaitingForInstall
      2 -> Downloading
      3 -> Installing
      4 -> Expired
      5 -> RejectingDownload
      6 -> NoLongerAvailable
      7 -> DeniedByPolicy
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ESimProfileMetadataState>
      {
    public fun setValue(newValue: ESimProfileMetadataState): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ESimProfileMetadataState =
        ESimProfileMetadataState.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ESimProfileMetadataState, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ESimProfileMetadataState =
        ESimProfileMetadataState.values()[0].fromNative(value, null)

    public override fun toNative(obj: ESimProfileMetadataState): Int = obj.value
  }
}
