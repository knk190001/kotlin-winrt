package Windows.UI.ViewManagement

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.sun.jna.Pointer
import com.sun.jna.Structure
import java.lang.foreign.GroupLayout
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.MemorySegment
import java.lang.foreign.MemorySession
import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@ABIMarker(ViewManagementViewScalingContract.ABI::class)
@Signature("struct(Windows.UI.ViewManagement.ViewManagementViewScalingContract;)")
@Structure.FieldOrder("")
@WinRTByReference(brClass = ViewManagementViewScalingContract.ByReference::class)
public open class ViewManagementViewScalingContract(
  ptr: Pointer? = Pointer.NULL
) : Structure(ptr) {
  public class ByReference : ViewManagementViewScalingContract(), Structure.ByReference,
      IByReference<ViewManagementViewScalingContract> {
    public override fun getValue(): ViewManagementViewScalingContract = this
  }

  public class ByValue(
    ptr: Pointer? = Pointer.NULL
  ) : ViewManagementViewScalingContract(ptr), Structure.ByValue

  public object ABI : IABI<ByValue, MemorySegment> {
    public val fromNativeHandle: MethodHandle =
        MethodHandles.lookup().findStatic(ViewManagementViewScalingContract::class.java,
        "fromNative", MethodType.methodType(ByValue::class.java, MemorySegment::class.java))


    public override val layout: GroupLayout = MemoryLayout.structLayout(
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
