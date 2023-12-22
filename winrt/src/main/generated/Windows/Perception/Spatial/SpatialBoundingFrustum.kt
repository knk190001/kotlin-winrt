package Windows.Perception.Spatial

import Windows.Foundation.Numerics.Plane
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
import kotlin.jvm.JvmField

@ABIMarker(SpatialBoundingFrustum.ABI::class)
@Signature("struct(Windows.Perception.Spatial.SpatialBoundingFrustum;struct(Windows.Foundation.Numerics.Plane;struct(Windows.Foundation.Numerics.Vector3;f4;f4;f4);f4);struct(Windows.Foundation.Numerics.Plane;struct(Windows.Foundation.Numerics.Vector3;f4;f4;f4);f4);struct(Windows.Foundation.Numerics.Plane;struct(Windows.Foundation.Numerics.Vector3;f4;f4;f4);f4);struct(Windows.Foundation.Numerics.Plane;struct(Windows.Foundation.Numerics.Vector3;f4;f4;f4);f4);struct(Windows.Foundation.Numerics.Plane;struct(Windows.Foundation.Numerics.Vector3;f4;f4;f4);f4);struct(Windows.Foundation.Numerics.Plane;struct(Windows.Foundation.Numerics.Vector3;f4;f4;f4);f4))")
@Structure.FieldOrder("Near, Far, Right, Left, Top, Bottom")
@WinRTByReference(brClass = SpatialBoundingFrustum.ByReference::class)
public open class SpatialBoundingFrustum(
  ptr: Pointer? = Pointer.NULL
) : Structure(ptr) {
  @JvmField
  public var Near: Plane? = null

  @JvmField
  public var Far: Plane? = null

  @JvmField
  public var Right: Plane? = null

  @JvmField
  public var Left: Plane? = null

  @JvmField
  public var Top: Plane? = null

  @JvmField
  public var Bottom: Plane? = null

  public class ByReference : SpatialBoundingFrustum(), Structure.ByReference,
      IByReference<SpatialBoundingFrustum> {
    public override fun getValue(): SpatialBoundingFrustum = this
  }

  public class ByValue(
    ptr: Pointer? = Pointer.NULL
  ) : SpatialBoundingFrustum(ptr), Structure.ByValue

  public object ABI : IABI<ByValue, MemorySegment> {
    public val fromNativeHandle: MethodHandle =
        MethodHandles.lookup().findStatic(SpatialBoundingFrustum::class.java, "fromNative",
        MethodType.methodType(ByValue::class.java, MemorySegment::class.java))


    public override val layout: GroupLayout = MemoryLayout.structLayout(
      Plane.ABI.layout, 
      Plane.ABI.layout, 
      Plane.ABI.layout, 
      Plane.ABI.layout, 
      Plane.ABI.layout, 
      Plane.ABI.layout, 
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
