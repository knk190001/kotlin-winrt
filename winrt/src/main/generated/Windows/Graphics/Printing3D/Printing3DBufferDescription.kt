package Windows.Graphics.Printing3D

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
import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import kotlin.jvm.JvmField

@ABIMarker(Printing3DBufferDescription.ABI::class)
@Signature("struct(Windows.Graphics.Printing3D.Printing3DBufferDescription;enum(Windows.Graphics.Printing3D.Printing3DBufferFormat;i4);u4)")
@Structure.FieldOrder("Format, Stride")
@WinRTByReference(brClass = Printing3DBufferDescription.ByReference::class)
public open class Printing3DBufferDescription(
  ptr: Pointer? = Pointer.NULL
) : Structure(ptr) {
  @JvmField
  public var Format: Printing3DBufferFormat? = null

  @JvmField
  public var Stride: WinDef.UINT? = null

  public class ByReference : Printing3DBufferDescription(), Structure.ByReference,
      IByReference<Printing3DBufferDescription> {
    public override fun getValue(): Printing3DBufferDescription = this
  }

  public class ByValue(
    ptr: Pointer? = Pointer.NULL
  ) : Printing3DBufferDescription(ptr), Structure.ByValue

  public object ABI : IABI<ByValue, MemorySegment> {
    public val fromNativeHandle: MethodHandle =
        MethodHandles.lookup().findStatic(Printing3DBufferDescription::class.java, "fromNative",
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
