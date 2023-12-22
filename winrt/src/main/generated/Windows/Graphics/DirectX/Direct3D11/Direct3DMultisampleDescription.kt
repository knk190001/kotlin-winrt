package Windows.Graphics.DirectX.Direct3D11

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
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.JAVA_INT
import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import kotlin.Int
import kotlin.jvm.JvmField

@ABIMarker(Direct3DMultisampleDescription.ABI::class)
@Signature("struct(Windows.Graphics.DirectX.Direct3D11.Direct3DMultisampleDescription;i4;i4)")
@Structure.FieldOrder("Count, Quality")
@WinRTByReference(brClass = Direct3DMultisampleDescription.ByReference::class)
public open class Direct3DMultisampleDescription(
  ptr: Pointer? = Pointer.NULL
) : Structure(ptr) {
  @JvmField
  public var Count: Int? = null

  @JvmField
  public var Quality: Int? = null

  public class ByReference : Direct3DMultisampleDescription(), Structure.ByReference,
      IByReference<Direct3DMultisampleDescription> {
    public override fun getValue(): Direct3DMultisampleDescription = this
  }

  public class ByValue(
    ptr: Pointer? = Pointer.NULL
  ) : Direct3DMultisampleDescription(ptr), Structure.ByValue

  public object ABI : IABI<ByValue, MemorySegment> {
    public val fromNativeHandle: MethodHandle =
        MethodHandles.lookup().findStatic(Direct3DMultisampleDescription::class.java, "fromNative",
        MethodType.methodType(ByValue::class.java, MemorySegment::class.java))


    public override val layout: GroupLayout = MemoryLayout.structLayout(
      JAVA_INT, 
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
