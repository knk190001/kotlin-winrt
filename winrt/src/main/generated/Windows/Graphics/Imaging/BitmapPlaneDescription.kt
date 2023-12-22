package Windows.Graphics.Imaging

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

@ABIMarker(BitmapPlaneDescription.ABI::class)
@Signature("struct(Windows.Graphics.Imaging.BitmapPlaneDescription;i4;i4;i4;i4)")
@Structure.FieldOrder("StartIndex, Width, Height, Stride")
@WinRTByReference(brClass = BitmapPlaneDescription.ByReference::class)
public open class BitmapPlaneDescription(
  ptr: Pointer? = Pointer.NULL
) : Structure(ptr) {
  @JvmField
  public var StartIndex: Int? = null

  @JvmField
  public var Width: Int? = null

  @JvmField
  public var Height: Int? = null

  @JvmField
  public var Stride: Int? = null

  public class ByReference : BitmapPlaneDescription(), Structure.ByReference,
      IByReference<BitmapPlaneDescription> {
    public override fun getValue(): BitmapPlaneDescription = this
  }

  public class ByValue(
    ptr: Pointer? = Pointer.NULL
  ) : BitmapPlaneDescription(ptr), Structure.ByValue

  public object ABI : IABI<ByValue, MemorySegment> {
    public val fromNativeHandle: MethodHandle =
        MethodHandles.lookup().findStatic(BitmapPlaneDescription::class.java, "fromNative",
        MethodType.methodType(ByValue::class.java, MemorySegment::class.java))


    public override val layout: GroupLayout = MemoryLayout.structLayout(
      JAVA_INT, 
      JAVA_INT, 
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
