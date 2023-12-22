package Windows.Perception.People

import Windows.Foundation.Numerics.Quaternion
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
import java.lang.foreign.ValueLayout.JAVA_INT
import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import kotlin.Float
import kotlin.jvm.JvmField

@ABIMarker(JointPose.ABI::class)
@Signature("struct(Windows.Perception.People.JointPose;struct(Windows.Foundation.Numerics.Quaternion;f4;f4;f4;f4);struct(Windows.Foundation.Numerics.Vector3;f4;f4;f4);f4;enum(Windows.Perception.People.JointPoseAccuracy;i4))")
@Structure.FieldOrder("Orientation, Position, Radius, Accuracy")
@WinRTByReference(brClass = JointPose.ByReference::class)
public open class JointPose(
  ptr: Pointer? = Pointer.NULL
) : Structure(ptr) {
  @JvmField
  public var Orientation: Quaternion? = null

  @JvmField
  public var Position: Vector3? = null

  @JvmField
  public var Radius: Float? = null

  @JvmField
  public var Accuracy: JointPoseAccuracy? = null

  public class ByReference : JointPose(), Structure.ByReference, IByReference<JointPose> {
    public override fun getValue(): JointPose = this
  }

  public class ByValue(
    ptr: Pointer? = Pointer.NULL
  ) : JointPose(ptr), Structure.ByValue

  public object ABI : IABI<ByValue, MemorySegment> {
    public val fromNativeHandle: MethodHandle =
        MethodHandles.lookup().findStatic(JointPose::class.java, "fromNative",
        MethodType.methodType(ByValue::class.java, MemorySegment::class.java))


    public override val layout: GroupLayout = MemoryLayout.structLayout(
      Quaternion.ABI.layout, 
      Vector3.ABI.layout, 
      JAVA_BYTE, 
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
