package Windows.ApplicationModel.Store.Preview

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

@ABIMarker(StoreSystemFeature.ABI::class)
@Signature("enum(Windows.ApplicationModel.Store.Preview.StoreSystemFeature;i4)")
@WinRTByReference(brClass = StoreSystemFeature.ByReference::class)
public enum class StoreSystemFeature(
  public val value: Int
) : NativeMapped {
  ArchitectureX86(0),
  ArchitectureX64(1),
  ArchitectureArm(2),
  DirectX9(3),
  DirectX10(4),
  DirectX11(5),
  D3D12HardwareFL11(6),
  D3D12HardwareFL12(7),
  Memory300MB(8),
  Memory750MB(9),
  Memory1GB(10),
  Memory2GB(11),
  CameraFront(12),
  CameraRear(13),
  Gyroscope(14),
  Hover(15),
  Magnetometer(16),
  Nfc(17),
  Resolution720P(18),
  ResolutionWvga(19),
  ResolutionWvgaOr720P(20),
  ResolutionWxga(21),
  ResolutionWvgaOrWxga(22),
  ResolutionWxgaOr720P(23),
  Memory4GB(24),
  Memory6GB(25),
  Memory8GB(26),
  Memory12GB(27),
  Memory16GB(28),
  Memory20GB(29),
  VideoMemory2GB(30),
  VideoMemory4GB(31),
  VideoMemory6GB(32),
  VideoMemory1GB(33),
  ArchitectureArm64(34),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      StoreSystemFeature {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> ArchitectureX86
      1 -> ArchitectureX64
      2 -> ArchitectureArm
      3 -> DirectX9
      4 -> DirectX10
      5 -> DirectX11
      6 -> D3D12HardwareFL11
      7 -> D3D12HardwareFL12
      8 -> Memory300MB
      9 -> Memory750MB
      10 -> Memory1GB
      11 -> Memory2GB
      12 -> CameraFront
      13 -> CameraRear
      14 -> Gyroscope
      15 -> Hover
      16 -> Magnetometer
      17 -> Nfc
      18 -> Resolution720P
      19 -> ResolutionWvga
      20 -> ResolutionWvgaOr720P
      21 -> ResolutionWxga
      22 -> ResolutionWvgaOrWxga
      23 -> ResolutionWxgaOr720P
      24 -> Memory4GB
      25 -> Memory6GB
      26 -> Memory8GB
      27 -> Memory12GB
      28 -> Memory16GB
      29 -> Memory20GB
      30 -> VideoMemory2GB
      31 -> VideoMemory4GB
      32 -> VideoMemory6GB
      33 -> VideoMemory1GB
      34 -> ArchitectureArm64
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<StoreSystemFeature> {
    public fun setValue(newValue: StoreSystemFeature): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): StoreSystemFeature =
        StoreSystemFeature.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<StoreSystemFeature, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): StoreSystemFeature =
        StoreSystemFeature.values()[0].fromNative(value, null)

    public override fun toNative(obj: StoreSystemFeature): Int = obj.value
  }
}
