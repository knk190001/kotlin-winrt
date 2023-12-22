package Windows.Media.Protection

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

@ABIMarker(GraphicsTrustStatus.ABI::class)
@Signature("enum(Windows.Media.Protection.GraphicsTrustStatus;i4)")
@WinRTByReference(brClass = GraphicsTrustStatus.ByReference::class)
public enum class GraphicsTrustStatus(
  public val value: Int
) : NativeMapped {
  TrustNotRequired(0),
  TrustEstablished(1),
  EnvironmentNotSupported(2),
  DriverNotSupported(3),
  DriverSigningFailure(4),
  UnknownFailure(5),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      GraphicsTrustStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> TrustNotRequired
      1 -> TrustEstablished
      2 -> EnvironmentNotSupported
      3 -> DriverNotSupported
      4 -> DriverSigningFailure
      5 -> UnknownFailure
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<GraphicsTrustStatus> {
    public fun setValue(newValue: GraphicsTrustStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): GraphicsTrustStatus =
        GraphicsTrustStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<GraphicsTrustStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): GraphicsTrustStatus =
        GraphicsTrustStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: GraphicsTrustStatus): Int = obj.value
  }
}
