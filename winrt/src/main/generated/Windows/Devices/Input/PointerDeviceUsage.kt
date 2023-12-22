package Windows.Devices.Input

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
import java.lang.foreign.ValueLayout.JAVA_BYTE
import java.lang.foreign.ValueLayout.JAVA_INT
import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import kotlin.Float
import kotlin.Int
import kotlin.jvm.JvmField

@ABIMarker(PointerDeviceUsage.ABI::class)
@Signature("struct(Windows.Devices.Input.PointerDeviceUsage;u4;u4;i4;i4;i4;i4;u4;f4)")
@Structure.FieldOrder("UsagePage, Usage, MinLogical, MaxLogical, MinPhysical, MaxPhysical, Unit, PhysicalMultiplier")
@WinRTByReference(brClass = PointerDeviceUsage.ByReference::class)
public open class PointerDeviceUsage(
  ptr: Pointer? = Pointer.NULL
) : Structure(ptr) {
  @JvmField
  public var UsagePage: WinDef.UINT? = null

  @JvmField
  public var Usage: WinDef.UINT? = null

  @JvmField
  public var MinLogical: Int? = null

  @JvmField
  public var MaxLogical: Int? = null

  @JvmField
  public var MinPhysical: Int? = null

  @JvmField
  public var MaxPhysical: Int? = null

  @JvmField
  public var Unit: WinDef.UINT? = null

  @JvmField
  public var PhysicalMultiplier: Float? = null

  public class ByReference : PointerDeviceUsage(), Structure.ByReference,
      IByReference<PointerDeviceUsage> {
    public override fun getValue(): PointerDeviceUsage = this
  }

  public class ByValue(
    ptr: Pointer? = Pointer.NULL
  ) : PointerDeviceUsage(ptr), Structure.ByValue

  public object ABI : IABI<ByValue, MemorySegment> {
    public val fromNativeHandle: MethodHandle =
        MethodHandles.lookup().findStatic(PointerDeviceUsage::class.java, "fromNative",
        MethodType.methodType(ByValue::class.java, MemorySegment::class.java))


    public override val layout: GroupLayout = MemoryLayout.structLayout(
      JAVA_INT, 
      JAVA_INT, 
      JAVA_INT, 
      JAVA_INT, 
      JAVA_INT, 
      JAVA_INT, 
      JAVA_INT, 
      JAVA_BYTE, 
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
