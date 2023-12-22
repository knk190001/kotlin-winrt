package Windows.Devices.Geolocation

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
import java.lang.foreign.ValueLayout.JAVA_DOUBLE
import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import kotlin.Double
import kotlin.jvm.JvmField

@ABIMarker(BasicGeoposition.ABI::class)
@Signature("struct(Windows.Devices.Geolocation.BasicGeoposition;f8;f8;f8)")
@Structure.FieldOrder("Latitude, Longitude, Altitude")
@WinRTByReference(brClass = BasicGeoposition.ByReference::class)
public open class BasicGeoposition(
  ptr: Pointer? = Pointer.NULL
) : Structure(ptr) {
  @JvmField
  public var Latitude: Double? = null

  @JvmField
  public var Longitude: Double? = null

  @JvmField
  public var Altitude: Double? = null

  public class ByReference : BasicGeoposition(), Structure.ByReference,
      IByReference<BasicGeoposition> {
    public override fun getValue(): BasicGeoposition = this
  }

  public class ByValue(
    ptr: Pointer? = Pointer.NULL
  ) : BasicGeoposition(ptr), Structure.ByValue

  public object ABI : IABI<ByValue, MemorySegment> {
    public val fromNativeHandle: MethodHandle =
        MethodHandles.lookup().findStatic(BasicGeoposition::class.java, "fromNative",
        MethodType.methodType(ByValue::class.java, MemorySegment::class.java))


    public override val layout: GroupLayout = MemoryLayout.structLayout(
      JAVA_DOUBLE, 
      JAVA_DOUBLE, 
      JAVA_DOUBLE, 
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
