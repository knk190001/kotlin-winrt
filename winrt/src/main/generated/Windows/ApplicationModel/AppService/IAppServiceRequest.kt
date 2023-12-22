package Windows.ApplicationModel.AppService

import Windows.Foundation.Collections.ValueSet
import Windows.Foundation.IAsyncOperation
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

@ABIMarker(IAppServiceRequest.ABI::class)
@Signature("{20e58d9d-18de-4b01-80ba-90a76204e3c8}")
@Guid("20e58d9d18de4b0180ba90a76204e3c8")
@WinRTInterface("20e58d9d18de4b0180ba90a76204e3c8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppServiceRequest.ByReference::class)
public interface IAppServiceRequest : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Message(): ValueSet?

  @InterfaceMethod(1)
  public fun SendResponseAsync(message: ValueSet?): IAsyncOperation<AppServiceResponseStatus?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppServiceRequest> {
    public override fun getValue() = ABI.makeIAppServiceRequest(pointer.getPointer(0))

    public fun setValue(value: IAppServiceRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppServiceRequest {
    public val __1462334608_Ptr: Pointer?

    public val _1462334608_VtblPtr: Pointer?
      get() = __1462334608_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Message(): ValueSet? {
      val fnPtr = _1462334608_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ValueSet>()
      val hr = fn.invokeHR(arrayOf(__1462334608_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ValueSet>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun SendResponseAsync(message: ValueSet?):
        IAsyncOperation<AppServiceResponseStatus?>? {
      val fnPtr = _1462334608_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<AppServiceResponseStatus?>>()
      val hr = fn.invokeHR(arrayOf(__1462334608_Ptr, marshalToNative(message), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<AppServiceResponseStatus?>>(result.getValue())
      return resultValue
    }
  }

  public class IAppServiceRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1462334608_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppServiceRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("20e58d9d18de4b0180ba90a76204e3c8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppServiceRequest(ptr: Pointer?): WithDefault = IAppServiceRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppServiceRequest {
      val address = segment.toRawLongValue()
      return makeIAppServiceRequest(Pointer(address))
    }

    public override fun toNative(obj: IAppServiceRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1462334608_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppServiceRequest): Array<IAppServiceRequest?> =
        (elements as
        Array<IAppServiceRequest?>).castToImpl<IAppServiceRequest,IAppServiceRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppServiceRequest?> =
        arrayOfNulls<IAppServiceRequest_Impl>(size) as Array<IAppServiceRequest?>
  }
}
