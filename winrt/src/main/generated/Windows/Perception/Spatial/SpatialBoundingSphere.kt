package Windows.Perception.Spatial

import Windows.Foundation.Numerics.Vector3
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
import java.lang.foreign.ValueLayout.JAVA_BYTE
import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import kotlin.Float
import kotlin.jvm.JvmField

@ABIMarker(SpatialBoundingSphere.ABI::class)
@Signature("struct(Windows.Perception.Spatial.SpatialBoundingSphere;struct(Windows.Foundation.Numerics.Vector3;f4;f4;f4);f4)")
@Structure.FieldOrder("Center, Radius")
@WinRTByReference(brClass = SpatialBoundingSphere.ByReference::class)
public open class SpatialBoundingSphere(
  ptr: Pointer? = Pointer.NULL
) : Structure(ptr) {
  @JvmField
  public var Center: Vector3? = null

  @JvmField
  public var Radius: Float? = null

  public class ByReference : SpatialBoundingSphere(), Structure.ByReference,
      IByReference<SpatialBoundingSphere> {
    public override fun getValue(): SpatialBoundingSphere = this
  }

  public class ByValue(
    ptr: Pointer? = Pointer.NULL
  ) : SpatialBoundingSphere(ptr), Structure.ByValue

  public object ABI : IABI<ByValue, MemorySegment> {
    public val fromNativeHandle: MethodHandle =
        MethodHandles.lookup().findStatic(SpatialBoundingSphere::class.java, "fromNative",
        MethodType.methodType(ByValue::class.java, MemorySegment::class.java))


    public override val layout: GroupLayout = MemoryLayout.structLayout(
      Vector3.ABI.layout, 
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
