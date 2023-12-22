package Windows.Management.Deployment

import Windows.Foundation.HResult
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDeploymentResult.ABI::class)
@Signature("{2563b9ae-b77d-4c1f-8a7b-20e6ad515ef3}")
@Guid("2563b9aeb77d4c1f8a7b20e6ad515ef3")
@WinRTInterface("2563b9aeb77d4c1f8a7b20e6ad515ef3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDeploymentResult.ByReference::class)
public interface IDeploymentResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ErrorText(): String?

  @InterfaceMethod(1)
  public fun get_ActivityId(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(2)
  public fun get_ExtendedErrorCode(): HResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDeploymentResult> {
    public override fun getValue() = ABI.makeIDeploymentResult(pointer.getPointer(0))

    public fun setValue(value: IDeploymentResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDeploymentResult {
    public val __1022208070_Ptr: Pointer?

    public val _1022208070_VtblPtr: Pointer?
      get() = __1022208070_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ErrorText(): String? {
      val fnPtr = _1022208070_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1022208070_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ActivityId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1022208070_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1022208070_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ExtendedErrorCode(): HResult? {
      val fnPtr = _1022208070_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HResult>()
      val hr = fn.invokeHR(arrayOf(__1022208070_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HResult>(result.getValue())
      return resultValue
    }
  }

  public class IDeploymentResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1022208070_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDeploymentResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2563b9aeb77d4c1f8a7b20e6ad515ef3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDeploymentResult(ptr: Pointer?): WithDefault = IDeploymentResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDeploymentResult {
      val address = segment.toRawLongValue()
      return makeIDeploymentResult(Pointer(address))
    }

    public override fun toNative(obj: IDeploymentResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1022208070_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDeploymentResult): Array<IDeploymentResult?> = (elements
        as Array<IDeploymentResult?>).castToImpl<IDeploymentResult,IDeploymentResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDeploymentResult?> =
        arrayOfNulls<IDeploymentResult_Impl>(size) as Array<IDeploymentResult?>
  }
}
