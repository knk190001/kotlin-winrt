package Windows.Security.Authentication.Web.Core

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IAsyncAction
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

@ABIMarker(IWebTokenRequestResult.ABI::class)
@Signature("{c12a8305-d1f8-4483-8d54-38fe292784ff}")
@Guid("c12a8305d1f844838d5438fe292784ff")
@WinRTInterface("c12a8305d1f844838d5438fe292784ff")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebTokenRequestResult.ByReference::class)
public interface IWebTokenRequestResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ResponseData(): IVectorView<WebTokenResponse?>?

  @InterfaceMethod(1)
  public fun get_ResponseStatus(): WebTokenRequestStatus?

  @InterfaceMethod(2)
  public fun get_ResponseError(): WebProviderError?

  @InterfaceMethod(3)
  public fun InvalidateCacheAsync(): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebTokenRequestResult> {
    public override fun getValue() = ABI.makeIWebTokenRequestResult(pointer.getPointer(0))

    public fun setValue(value: IWebTokenRequestResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebTokenRequestResult {
    public val __451600086_Ptr: Pointer?

    public val _451600086_VtblPtr: Pointer?
      get() = __451600086_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ResponseData(): IVectorView<WebTokenResponse?>? {
      val fnPtr = _451600086_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<WebTokenResponse?>>()
      val hr = fn.invokeHR(arrayOf(__451600086_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<WebTokenResponse?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ResponseStatus(): WebTokenRequestStatus? {
      val fnPtr = _451600086_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WebTokenRequestStatus>()
      val hr = fn.invokeHR(arrayOf(__451600086_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WebTokenRequestStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ResponseError(): WebProviderError? {
      val fnPtr = _451600086_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WebProviderError>()
      val hr = fn.invokeHR(arrayOf(__451600086_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WebProviderError>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun InvalidateCacheAsync(): IAsyncAction? {
      val fnPtr = _451600086_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__451600086_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IWebTokenRequestResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __451600086_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebTokenRequestResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c12a8305d1f844838d5438fe292784ff")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebTokenRequestResult(ptr: Pointer?): WithDefault =
        IWebTokenRequestResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebTokenRequestResult {
      val address = segment.toRawLongValue()
      return makeIWebTokenRequestResult(Pointer(address))
    }

    public override fun toNative(obj: IWebTokenRequestResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__451600086_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebTokenRequestResult): Array<IWebTokenRequestResult?> =
        (elements as
        Array<IWebTokenRequestResult?>).castToImpl<IWebTokenRequestResult,IWebTokenRequestResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebTokenRequestResult?> =
        arrayOfNulls<IWebTokenRequestResult_Impl>(size) as Array<IWebTokenRequestResult?>
  }
}
