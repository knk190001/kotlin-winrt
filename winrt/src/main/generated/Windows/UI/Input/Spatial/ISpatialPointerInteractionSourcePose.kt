package Windows.UI.Input.Spatial

import Windows.Foundation.Numerics.Vector3
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISpatialPointerInteractionSourcePose.ABI::class)
@Signature("{a7104307-2c2b-4d3a-92a7-80ced7c4a0d0}")
@Guid("a71043072c2b4d3a92a780ced7c4a0d0")
@WinRTInterface("a71043072c2b4d3a92a780ced7c4a0d0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialPointerInteractionSourcePose.ByReference::class)
public interface ISpatialPointerInteractionSourcePose : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Position(): Vector3?

  @InterfaceMethod(1)
  public fun get_ForwardDirection(): Vector3?

  @InterfaceMethod(2)
  public fun get_UpDirection(): Vector3?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialPointerInteractionSourcePose> {
    public override fun getValue() =
        ABI.makeISpatialPointerInteractionSourcePose(pointer.getPointer(0))

    public fun setValue(value: ISpatialPointerInteractionSourcePose_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialPointerInteractionSourcePose {
    public val __1654644557_Ptr: Pointer?

    public val _1654644557_VtblPtr: Pointer?
      get() = __1654644557_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Position(): Vector3? {
      val fnPtr = _1654644557_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector3>()
      val hr = fn.invokeHR(arrayOf(__1654644557_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector3>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ForwardDirection(): Vector3? {
      val fnPtr = _1654644557_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector3>()
      val hr = fn.invokeHR(arrayOf(__1654644557_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector3>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_UpDirection(): Vector3? {
      val fnPtr = _1654644557_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector3>()
      val hr = fn.invokeHR(arrayOf(__1654644557_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector3>(result.getValue())
      return resultValue
    }
  }

  public class ISpatialPointerInteractionSourcePose_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1654644557_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialPointerInteractionSourcePose, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a71043072c2b4d3a92a780ced7c4a0d0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialPointerInteractionSourcePose(ptr: Pointer?): WithDefault =
        ISpatialPointerInteractionSourcePose_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialPointerInteractionSourcePose {
      val address = segment.toRawLongValue()
      return makeISpatialPointerInteractionSourcePose(Pointer(address))
    }

    public override fun toNative(obj: ISpatialPointerInteractionSourcePose): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1654644557_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialPointerInteractionSourcePose):
        Array<ISpatialPointerInteractionSourcePose?> = (elements as
        Array<ISpatialPointerInteractionSourcePose?>).castToImpl<ISpatialPointerInteractionSourcePose,ISpatialPointerInteractionSourcePose_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialPointerInteractionSourcePose?> =
        arrayOfNulls<ISpatialPointerInteractionSourcePose_Impl>(size) as
        Array<ISpatialPointerInteractionSourcePose?>
  }
}
