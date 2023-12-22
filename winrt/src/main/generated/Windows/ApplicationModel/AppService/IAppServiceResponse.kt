package Windows.ApplicationModel.AppService

import Windows.Foundation.Collections.ValueSet
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

@ABIMarker(IAppServiceResponse.ABI::class)
@Signature("{8d503cec-9aa3-4e68-9559-9de63e372ce4}")
@Guid("8d503cec9aa34e6895599de63e372ce4")
@WinRTInterface("8d503cec9aa34e6895599de63e372ce4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppServiceResponse.ByReference::class)
public interface IAppServiceResponse : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Message(): ValueSet?

  @InterfaceMethod(1)
  public fun get_Status(): AppServiceResponseStatus?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppServiceResponse> {
    public override fun getValue() = ABI.makeIAppServiceResponse(pointer.getPointer(0))

    public fun setValue(value: IAppServiceResponse_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppServiceResponse {
    public val __1965201280_Ptr: Pointer?

    public val _1965201280_VtblPtr: Pointer?
      get() = __1965201280_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Message(): ValueSet? {
      val fnPtr = _1965201280_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ValueSet>()
      val hr = fn.invokeHR(arrayOf(__1965201280_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ValueSet>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Status(): AppServiceResponseStatus? {
      val fnPtr = _1965201280_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppServiceResponseStatus>()
      val hr = fn.invokeHR(arrayOf(__1965201280_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppServiceResponseStatus>(result.getValue())
      return resultValue
    }
  }

  public class IAppServiceResponse_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1965201280_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppServiceResponse, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8d503cec9aa34e6895599de63e372ce4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppServiceResponse(ptr: Pointer?): WithDefault = IAppServiceResponse_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppServiceResponse {
      val address = segment.toRawLongValue()
      return makeIAppServiceResponse(Pointer(address))
    }

    public override fun toNative(obj: IAppServiceResponse): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1965201280_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppServiceResponse): Array<IAppServiceResponse?> =
        (elements as
        Array<IAppServiceResponse?>).castToImpl<IAppServiceResponse,IAppServiceResponse_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppServiceResponse?> =
        arrayOfNulls<IAppServiceResponse_Impl>(size) as Array<IAppServiceResponse?>
  }
}
