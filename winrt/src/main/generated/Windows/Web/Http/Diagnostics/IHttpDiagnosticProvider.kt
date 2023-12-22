package Windows.Web.Http.Diagnostics

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
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

@ABIMarker(IHttpDiagnosticProvider.ABI::class)
@Signature("{bd811501-a056-4d39-b174-833b7b03b02c}")
@Guid("bd811501a0564d39b174833b7b03b02c")
@WinRTInterface("bd811501a0564d39b174833b7b03b02c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpDiagnosticProvider.ByReference::class)
public interface IHttpDiagnosticProvider : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Start(): Unit

  @InterfaceMethod(1)
  public fun Stop(): Unit

  @InterfaceMethod(2)
  public fun add_RequestSent(handler: TypedEventHandler<HttpDiagnosticProvider?,
      HttpDiagnosticProviderRequestSentEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_RequestSent(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun add_ResponseReceived(handler: TypedEventHandler<HttpDiagnosticProvider?,
      HttpDiagnosticProviderResponseReceivedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_ResponseReceived(token: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun add_RequestResponseCompleted(handler: TypedEventHandler<HttpDiagnosticProvider?,
      HttpDiagnosticProviderRequestResponseCompletedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_RequestResponseCompleted(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpDiagnosticProvider> {
    public override fun getValue() = ABI.makeIHttpDiagnosticProvider(pointer.getPointer(0))

    public fun setValue(value: IHttpDiagnosticProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpDiagnosticProvider {
    public val __629624514_Ptr: Pointer?

    public val _629624514_VtblPtr: Pointer?
      get() = __629624514_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Start(): Unit {
      val fnPtr = _629624514_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__629624514_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun Stop(): Unit {
      val fnPtr = _629624514_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__629624514_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_RequestSent(handler: TypedEventHandler<HttpDiagnosticProvider?,
        HttpDiagnosticProviderRequestSentEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _629624514_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__629624514_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_RequestSent(token: EventRegistrationToken?): Unit {
      val fnPtr = _629624514_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__629624514_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_ResponseReceived(handler: TypedEventHandler<HttpDiagnosticProvider?,
        HttpDiagnosticProviderResponseReceivedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _629624514_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__629624514_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_ResponseReceived(token: EventRegistrationToken?): Unit {
      val fnPtr = _629624514_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__629624514_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override
        fun add_RequestResponseCompleted(handler: TypedEventHandler<HttpDiagnosticProvider?,
        HttpDiagnosticProviderRequestResponseCompletedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _629624514_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__629624514_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_RequestResponseCompleted(token: EventRegistrationToken?): Unit {
      val fnPtr = _629624514_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__629624514_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IHttpDiagnosticProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __629624514_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpDiagnosticProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bd811501a0564d39b174833b7b03b02c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpDiagnosticProvider(ptr: Pointer?): WithDefault =
        IHttpDiagnosticProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHttpDiagnosticProvider {
      val address = segment.toRawLongValue()
      return makeIHttpDiagnosticProvider(Pointer(address))
    }

    public override fun toNative(obj: IHttpDiagnosticProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__629624514_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpDiagnosticProvider): Array<IHttpDiagnosticProvider?>
        = (elements as
        Array<IHttpDiagnosticProvider?>).castToImpl<IHttpDiagnosticProvider,IHttpDiagnosticProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpDiagnosticProvider?> =
        arrayOfNulls<IHttpDiagnosticProvider_Impl>(size) as Array<IHttpDiagnosticProvider?>
  }
}
