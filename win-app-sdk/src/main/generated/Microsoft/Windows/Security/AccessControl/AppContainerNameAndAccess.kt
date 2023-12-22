package Microsoft.Windows.Security.AccessControl

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
import java.lang.foreign.ValueLayout.ADDRESS
import java.lang.foreign.ValueLayout.JAVA_INT
import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import kotlin.String
import kotlin.jvm.JvmField

@ABIMarker(AppContainerNameAndAccess.ABI::class)
@Signature("struct(Microsoft.Windows.Security.AccessControl.AppContainerNameAndAccess;string;u4)")
@Structure.FieldOrder("appContainerName, accessMask")
@WinRTByReference(brClass = AppContainerNameAndAccess.ByReference::class)
public open class AppContainerNameAndAccess(
  ptr: Pointer? = Pointer.NULL
) : Structure(ptr) {
  @JvmField
  public var appContainerName: String? = null

  @JvmField
  public var accessMask: WinDef.UINT? = null

  public class ByReference : AppContainerNameAndAccess(), Structure.ByReference,
      IByReference<AppContainerNameAndAccess> {
    public override fun getValue(): AppContainerNameAndAccess = this
  }

  public class ByValue(
    ptr: Pointer? = Pointer.NULL
  ) : AppContainerNameAndAccess(ptr), Structure.ByValue

  public object ABI : IABI<ByValue, MemorySegment> {
    public val fromNativeHandle: MethodHandle =
        MethodHandles.lookup().findStatic(AppContainerNameAndAccess::class.java, "fromNative",
        MethodType.methodType(ByValue::class.java, MemorySegment::class.java))


    public override val layout: GroupLayout = MemoryLayout.structLayout(
      ADDRESS, 
      JAVA_INT, 
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
