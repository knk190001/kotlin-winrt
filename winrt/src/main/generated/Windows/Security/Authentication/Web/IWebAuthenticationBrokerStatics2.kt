package Windows.Security.Authentication.Web

import Windows.Foundation.Collections.ValueSet
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.Uri
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

@ABIMarker(IWebAuthenticationBrokerStatics2.ABI::class)
@Signature("{73cdfb9e-14e7-41da-a971-aaf4410b621e}")
@Guid("73cdfb9e14e741daa971aaf4410b621e")
@WinRTInterface("73cdfb9e14e741daa971aaf4410b621e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebAuthenticationBrokerStatics2.ByReference::class)
public interface IWebAuthenticationBrokerStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun AuthenticateAndContinue(requestUri: Uri?): Unit

  @InterfaceMethod(1)
  public fun AuthenticateAndContinue(requestUri: Uri?, callbackUri: Uri?): Unit

  @InterfaceMethod(2)
  public fun AuthenticateAndContinue(
    requestUri: Uri?,
    callbackUri: Uri?,
    continuationData: ValueSet?,
    options: WebAuthenticationOptions?
  ): Unit

  @InterfaceMethod(3)
  public fun AuthenticateSilentlyAsync(requestUri: Uri?): IAsyncOperation<WebAuthenticationResult?>?

  @InterfaceMethod(4)
  public fun AuthenticateSilentlyAsync(requestUri: Uri?, options: WebAuthenticationOptions?):
      IAsyncOperation<WebAuthenticationResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebAuthenticationBrokerStatics2> {
    public override fun getValue() = ABI.makeIWebAuthenticationBrokerStatics2(pointer.getPointer(0))

    public fun setValue(value: IWebAuthenticationBrokerStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebAuthenticationBrokerStatics2 {
    public val __1686941610_Ptr: Pointer?

    public val _1686941610_VtblPtr: Pointer?
      get() = __1686941610_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun AuthenticateAndContinue(requestUri: Uri?): Unit {
      val fnPtr = _1686941610_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1686941610_Ptr, marshalToNative(requestUri),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun AuthenticateAndContinue(requestUri: Uri?, callbackUri: Uri?): Unit {
      val fnPtr = _1686941610_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1686941610_Ptr, marshalToNative(requestUri),
          marshalToNative(callbackUri),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun AuthenticateAndContinue(
      requestUri: Uri?,
      callbackUri: Uri?,
      continuationData: ValueSet?,
      options: WebAuthenticationOptions?
    ): Unit {
      val fnPtr = _1686941610_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1686941610_Ptr, marshalToNative(requestUri),
          marshalToNative(callbackUri), marshalToNative(continuationData),
          marshalToNative(options),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun AuthenticateSilentlyAsync(requestUri: Uri?):
        IAsyncOperation<WebAuthenticationResult?>? {
      val fnPtr = _1686941610_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<WebAuthenticationResult?>>()
      val hr = fn.invokeHR(arrayOf(__1686941610_Ptr, marshalToNative(requestUri), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<WebAuthenticationResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun AuthenticateSilentlyAsync(requestUri: Uri?,
        options: WebAuthenticationOptions?): IAsyncOperation<WebAuthenticationResult?>? {
      val fnPtr = _1686941610_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<WebAuthenticationResult?>>()
      val hr = fn.invokeHR(arrayOf(__1686941610_Ptr, marshalToNative(requestUri),
          marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<WebAuthenticationResult?>>(result.getValue())
      return resultValue
    }
  }

  public class IWebAuthenticationBrokerStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1686941610_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebAuthenticationBrokerStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("73cdfb9e14e741daa971aaf4410b621e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebAuthenticationBrokerStatics2(ptr: Pointer?): WithDefault =
        IWebAuthenticationBrokerStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebAuthenticationBrokerStatics2 {
      val address = segment.toRawLongValue()
      return makeIWebAuthenticationBrokerStatics2(Pointer(address))
    }

    public override fun toNative(obj: IWebAuthenticationBrokerStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1686941610_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebAuthenticationBrokerStatics2):
        Array<IWebAuthenticationBrokerStatics2?> = (elements as
        Array<IWebAuthenticationBrokerStatics2?>).castToImpl<IWebAuthenticationBrokerStatics2,IWebAuthenticationBrokerStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebAuthenticationBrokerStatics2?> =
        arrayOfNulls<IWebAuthenticationBrokerStatics2_Impl>(size) as
        Array<IWebAuthenticationBrokerStatics2?>
  }
}
