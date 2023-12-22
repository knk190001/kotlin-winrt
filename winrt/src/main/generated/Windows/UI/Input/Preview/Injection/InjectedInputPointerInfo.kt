package Windows.UI.Input.Preview.Injection

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
import java.lang.foreign.ValueLayout.JAVA_INT
import java.lang.foreign.ValueLayout.JAVA_LONG
import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import kotlin.jvm.JvmField

@ABIMarker(InjectedInputPointerInfo.ABI::class)
@Signature("struct(Windows.UI.Input.Preview.Injection.InjectedInputPointerInfo;u4;enum(Windows.UI.Input.Preview.Injection.InjectedInputPointerOptions;u4);struct(Windows.UI.Input.Preview.Injection.InjectedInputPoint;i4;i4);u4;u8)")
@Structure.FieldOrder("PointerId, PointerOptions, PixelLocation, TimeOffsetInMilliseconds, PerformanceCount")
@WinRTByReference(brClass = InjectedInputPointerInfo.ByReference::class)
public open class InjectedInputPointerInfo(
  ptr: Pointer? = Pointer.NULL
) : Structure(ptr) {
  @JvmField
  public var PointerId: WinDef.UINT? = null

  @JvmField
  public var PointerOptions: InjectedInputPointerOptions? = null

  @JvmField
  public var PixelLocation: InjectedInputPoint? = null

  @JvmField
  public var TimeOffsetInMilliseconds: WinDef.UINT? = null

  @JvmField
  public var PerformanceCount: WinDef.ULONG? = null

  public class ByReference : InjectedInputPointerInfo(), Structure.ByReference,
      IByReference<InjectedInputPointerInfo> {
    public override fun getValue(): InjectedInputPointerInfo = this
  }

  public class ByValue(
    ptr: Pointer? = Pointer.NULL
  ) : InjectedInputPointerInfo(ptr), Structure.ByValue

  public object ABI : IABI<ByValue, MemorySegment> {
    public val fromNativeHandle: MethodHandle =
        MethodHandles.lookup().findStatic(InjectedInputPointerInfo::class.java, "fromNative",
        MethodType.methodType(ByValue::class.java, MemorySegment::class.java))


    public override val layout: GroupLayout = MemoryLayout.structLayout(
      JAVA_INT, 
      JAVA_INT, 
      InjectedInputPoint.ABI.layout, 
      JAVA_INT, 
      JAVA_LONG, 
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
