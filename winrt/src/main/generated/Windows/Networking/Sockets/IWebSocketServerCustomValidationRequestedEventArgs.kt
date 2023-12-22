package Windows.Networking.Sockets

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.Deferral
import Windows.Security.Cryptography.Certificates.Certificate
import Windows.Security.Cryptography.Certificates.ChainValidationResult
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

@ABIMarker(IWebSocketServerCustomValidationRequestedEventArgs.ABI::class)
@Signature("{ffeffe48-022a-4ab7-8b36-e10af4640e6b}")
@Guid("ffeffe48022a4ab78b36e10af4640e6b")
@WinRTInterface("ffeffe48022a4ab78b36e10af4640e6b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebSocketServerCustomValidationRequestedEventArgs.ByReference::class)
public interface IWebSocketServerCustomValidationRequestedEventArgs : NativeMapped, IWinRTInterface
    {
  @InterfaceMethod(0)
  public fun get_ServerCertificate(): Certificate?

  @InterfaceMethod(1)
  public fun get_ServerCertificateErrorSeverity(): SocketSslErrorSeverity?

  @InterfaceMethod(2)
  public fun get_ServerCertificateErrors(): IVectorView<ChainValidationResult?>?

  @InterfaceMethod(3)
  public fun get_ServerIntermediateCertificates(): IVectorView<Certificate?>?

  @InterfaceMethod(4)
  public fun Reject(): Unit

  @InterfaceMethod(5)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebSocketServerCustomValidationRequestedEventArgs> {
    public override fun getValue() =
        ABI.makeIWebSocketServerCustomValidationRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IWebSocketServerCustomValidationRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebSocketServerCustomValidationRequestedEventArgs {
    public val __1131705125_Ptr: Pointer?

    public val _1131705125_VtblPtr: Pointer?
      get() = __1131705125_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ServerCertificate(): Certificate? {
      val fnPtr = _1131705125_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Certificate>()
      val hr = fn.invokeHR(arrayOf(__1131705125_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Certificate>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ServerCertificateErrorSeverity(): SocketSslErrorSeverity? {
      val fnPtr = _1131705125_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SocketSslErrorSeverity>()
      val hr = fn.invokeHR(arrayOf(__1131705125_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SocketSslErrorSeverity>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ServerCertificateErrors(): IVectorView<ChainValidationResult?>? {
      val fnPtr = _1131705125_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<ChainValidationResult?>>()
      val hr = fn.invokeHR(arrayOf(__1131705125_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<ChainValidationResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_ServerIntermediateCertificates(): IVectorView<Certificate?>? {
      val fnPtr = _1131705125_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<Certificate?>>()
      val hr = fn.invokeHR(arrayOf(__1131705125_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<Certificate?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun Reject(): Unit {
      val fnPtr = _1131705125_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1131705125_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _1131705125_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__1131705125_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class IWebSocketServerCustomValidationRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1131705125_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebSocketServerCustomValidationRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ffeffe48022a4ab78b36e10af4640e6b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebSocketServerCustomValidationRequestedEventArgs(ptr: Pointer?): WithDefault =
        IWebSocketServerCustomValidationRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IWebSocketServerCustomValidationRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeIWebSocketServerCustomValidationRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IWebSocketServerCustomValidationRequestedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1131705125_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebSocketServerCustomValidationRequestedEventArgs):
        Array<IWebSocketServerCustomValidationRequestedEventArgs?> = (elements as
        Array<IWebSocketServerCustomValidationRequestedEventArgs?>).castToImpl<IWebSocketServerCustomValidationRequestedEventArgs,IWebSocketServerCustomValidationRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IWebSocketServerCustomValidationRequestedEventArgs?> =
        arrayOfNulls<IWebSocketServerCustomValidationRequestedEventArgs_Impl>(size) as
        Array<IWebSocketServerCustomValidationRequestedEventArgs?>
  }
}
