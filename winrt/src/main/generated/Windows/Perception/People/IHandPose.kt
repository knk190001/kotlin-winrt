package Windows.Perception.People

import Windows.Perception.Spatial.SpatialCoordinateSystem
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IHandPose.ABI::class)
@Signature("{4d98e79a-bb08-5d09-91de-df0dd3fae46c}")
@Guid("4d98e79abb085d0991dedf0dd3fae46c")
@WinRTInterface("4d98e79abb085d0991dedf0dd3fae46c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHandPose.ByReference::class)
public interface IHandPose : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun TryGetJoint(
    coordinateSystem: SpatialCoordinateSystem?,
    joint: HandJointKind?,
    jointPose: Windows.Perception.People.JointPose.ByReference?
  ): Boolean

  @InterfaceMethod(1)
  public fun TryGetJoints(
    coordinateSystem: SpatialCoordinateSystem?,
    joints: Array<HandJointKind?>,
    jointPoses: Array<JointPose?>
  ): Boolean

  @InterfaceMethod(2)
  public fun GetRelativeJoint(joint: HandJointKind?, referenceJoint: HandJointKind?): JointPose?

  @InterfaceMethod(3)
  public fun GetRelativeJoints(
    joints: Array<HandJointKind?>,
    referenceJoints: Array<HandJointKind?>,
    jointPoses: Array<JointPose?>
  ): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IHandPose> {
    public override fun getValue() = ABI.makeIHandPose(pointer.getPointer(0))

    public fun setValue(value: IHandPose_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHandPose {
    public val __2048668284_Ptr: Pointer?

    public val _2048668284_VtblPtr: Pointer?
      get() = __2048668284_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun TryGetJoint(
      coordinateSystem: SpatialCoordinateSystem?,
      joint: HandJointKind?,
      jointPose: Windows.Perception.People.JointPose.ByReference?
    ): Boolean {
      val fnPtr = _2048668284_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2048668284_Ptr, marshalToNative(coordinateSystem),
          marshalToNative(joint), marshalToNative(jointPose), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun TryGetJoints(
      coordinateSystem: SpatialCoordinateSystem?,
      joints: Array<HandJointKind?>,
      jointPoses: Array<JointPose?>
    ): Boolean {
      val fnPtr = _2048668284_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2048668284_Ptr, marshalToNative(coordinateSystem),
          joints.size,marshalToNative(joints), jointPoses.size,marshalToNative(jointPoses), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun GetRelativeJoint(joint: HandJointKind?, referenceJoint: HandJointKind?):
        JointPose? {
      val fnPtr = _2048668284_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<JointPose>()
      val hr = fn.invokeHR(arrayOf(__2048668284_Ptr, marshalToNative(joint),
          marshalToNative(referenceJoint), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<JointPose>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetRelativeJoints(
      joints: Array<HandJointKind?>,
      referenceJoints: Array<HandJointKind?>,
      jointPoses: Array<JointPose?>
    ): Unit {
      val fnPtr = _2048668284_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2048668284_Ptr, joints.size,marshalToNative(joints),
          referenceJoints.size,marshalToNative(referenceJoints),
          jointPoses.size,marshalToNative(jointPoses),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IHandPose_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2048668284_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHandPose, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4d98e79abb085d0991dedf0dd3fae46c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHandPose(ptr: Pointer?): WithDefault = IHandPose_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHandPose {
      val address = segment.toRawLongValue()
      return makeIHandPose(Pointer(address))
    }

    public override fun toNative(obj: IHandPose): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2048668284_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHandPose): Array<IHandPose?> = (elements as
        Array<IHandPose?>).castToImpl<IHandPose,IHandPose_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHandPose?> = arrayOfNulls<IHandPose_Impl>(size)
        as Array<IHandPose?>
  }
}
