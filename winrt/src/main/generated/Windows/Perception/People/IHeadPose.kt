package Windows.Perception.People

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

@ABIMarker(IHeadPose.ABI::class)
@Signature("{7f5ac5a5-49db-379f-9429-32a2faf34fa6}")
@Guid("7f5ac5a549db379f942932a2faf34fa6")
@WinRTInterface("7f5ac5a549db379f942932a2faf34fa6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHeadPose.ByReference::class)
public interface IHeadPose : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Position(): Vector3?

  @InterfaceMethod(1)
  public fun get_ForwardDirection(): Vector3?

  @InterfaceMethod(2)
  public fun get_UpDirection(): Vector3?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IHeadPose> {
    public override fun getValue() = ABI.makeIHeadPose(pointer.getPointer(0))

    public fun setValue(value: IHeadPose_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHeadPose {
    public val __931536749_Ptr: Pointer?

    public val _931536749_VtblPtr: Pointer?
      get() = __931536749_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Position(): Vector3? {
      val fnPtr = _931536749_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector3>()
      val hr = fn.invokeHR(arrayOf(__931536749_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector3>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ForwardDirection(): Vector3? {
      val fnPtr = _931536749_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector3>()
      val hr = fn.invokeHR(arrayOf(__931536749_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector3>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_UpDirection(): Vector3? {
      val fnPtr = _931536749_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector3>()
      val hr = fn.invokeHR(arrayOf(__931536749_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector3>(result.getValue())
      return resultValue
    }
  }

  public class IHeadPose_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __931536749_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHeadPose, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7f5ac5a549db379f942932a2faf34fa6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHeadPose(ptr: Pointer?): WithDefault = IHeadPose_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHeadPose {
      val address = segment.toRawLongValue()
      return makeIHeadPose(Pointer(address))
    }

    public override fun toNative(obj: IHeadPose): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__931536749_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHeadPose): Array<IHeadPose?> = (elements as
        Array<IHeadPose?>).castToImpl<IHeadPose,IHeadPose_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHeadPose?> = arrayOfNulls<IHeadPose_Impl>(size)
        as Array<IHeadPose?>
  }
}
