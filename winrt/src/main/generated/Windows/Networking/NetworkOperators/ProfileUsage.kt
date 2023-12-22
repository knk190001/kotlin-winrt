package Windows.Networking.NetworkOperators

import Windows.Foundation.DateTime
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
import java.lang.foreign.ValueLayout.JAVA_INT
import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import kotlin.jvm.JvmField

@ABIMarker(ProfileUsage.ABI::class)
@Signature("struct(Windows.Networking.NetworkOperators.ProfileUsage;u4;struct(Windows.Foundation.DateTime;i8))")
@Structure.FieldOrder("UsageInMegabytes, LastSyncTime")
@WinRTByReference(brClass = ProfileUsage.ByReference::class)
public open class ProfileUsage(
  ptr: Pointer? = Pointer.NULL
) : Structure(ptr) {
  @JvmField
  public var UsageInMegabytes: WinDef.UINT? = null

  @JvmField
  public var LastSyncTime: DateTime? = null

  public class ByReference : ProfileUsage(), Structure.ByReference, IByReference<ProfileUsage> {
    public override fun getValue(): ProfileUsage = this
  }

  public class ByValue(
    ptr: Pointer? = Pointer.NULL
  ) : ProfileUsage(ptr), Structure.ByValue

  public object ABI : IABI<ByValue, MemorySegment> {
    public val fromNativeHandle: MethodHandle =
        MethodHandles.lookup().findStatic(ProfileUsage::class.java, "fromNative",
        MethodType.methodType(ByValue::class.java, MemorySegment::class.java))


    public override val layout: GroupLayout = MemoryLayout.structLayout(
      JAVA_INT, 
      DateTime.ABI.layout, 
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
