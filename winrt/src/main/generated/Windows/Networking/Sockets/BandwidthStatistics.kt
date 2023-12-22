package Windows.Networking.Sockets

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.sun.jna.Pointer
import com.sun.jna.Structure
import com.sun.jna.platform.win32.WinDef
import java.lang.foreign.GroupLayout
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.MemorySegment
import java.lang.foreign.MemorySession
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.JAVA_BOOLEAN
import java.lang.foreign.ValueLayout.JAVA_LONG
import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import kotlin.Boolean
import kotlin.jvm.JvmField

@ABIMarker(BandwidthStatistics.ABI::class)
@Signature("struct(Windows.Networking.Sockets.BandwidthStatistics;u8;u8;u8;u8;b1;b1)")
@Structure.FieldOrder("OutboundBitsPerSecond, InboundBitsPerSecond, OutboundBitsPerSecondInstability, InboundBitsPerSecondInstability, OutboundBandwidthPeaked, InboundBandwidthPeaked")
@WinRTByReference(brClass = BandwidthStatistics.ByReference::class)
public open class BandwidthStatistics(
  ptr: Pointer? = Pointer.NULL
) : Structure(ptr) {
  @JvmField
  public var OutboundBitsPerSecond: WinDef.ULONG? = null

  @JvmField
  public var InboundBitsPerSecond: WinDef.ULONG? = null

  @JvmField
  public var OutboundBitsPerSecondInstability: WinDef.ULONG? = null

  @JvmField
  public var InboundBitsPerSecondInstability: WinDef.ULONG? = null

  @JvmField
  public var OutboundBandwidthPeaked: Boolean? = null

  @JvmField
  public var InboundBandwidthPeaked: Boolean? = null

  public class ByReference : BandwidthStatistics(), Structure.ByReference,
      IByReference<BandwidthStatistics> {
    public override fun getValue(): BandwidthStatistics = this
  }

  public class ByValue(
    ptr: Pointer? = Pointer.NULL
  ) : BandwidthStatistics(ptr), Structure.ByValue

  public object ABI : IABI<ByValue, MemorySegment> {
    public val fromNativeHandle: MethodHandle =
        MethodHandles.lookup().findStatic(BandwidthStatistics::class.java, "fromNative",
        MethodType.methodType(ByValue::class.java, MemorySegment::class.java))


    public override val layout: GroupLayout = MemoryLayout.structLayout(
      JAVA_LONG, 
      JAVA_LONG, 
      JAVA_LONG, 
      JAVA_LONG, 
      JAVA_BOOLEAN, 
      JAVA_BOOLEAN, 
    )


    public override fun fromNative(segment: MemorySegment): ByValue {
      val address = segment.address().toRawLongValue()
      return ByValue(Pointer(address))
    }

    public override fun toNative(obj: ByValue): MemorySegment {
      obj.write()
      val address  = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
      return MemorySegment.ofAddress(address, layout.byteSize(), MemorySession.global())
    }
  }
}
