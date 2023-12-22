package Windows.Devices.AllJoyn

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.Deferral
import Windows.Networking.Sockets.SocketSslErrorSeverity
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAllJoynCredentialsVerificationRequestedEventArgs.ABI::class)
@Signature("{800a7612-b805-44af-a2e1-792ab655a2d0}")
@Guid("800a7612b80544afa2e1792ab655a2d0")
@WinRTInterface("800a7612b80544afa2e1792ab655a2d0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAllJoynCredentialsVerificationRequestedEventArgs.ByReference::class)
public interface IAllJoynCredentialsVerificationRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AuthenticationMechanism(): AllJoynAuthenticationMechanism?

  @InterfaceMethod(1)
  public fun get_PeerUniqueName(): String?

  @InterfaceMethod(2)
  public fun get_PeerCertificate(): Certificate?

  @InterfaceMethod(3)
  public fun get_PeerCertificateErrorSeverity(): SocketSslErrorSeverity?

  @InterfaceMethod(4)
  public fun get_PeerCertificateErrors(): IVectorView<ChainValidationResult?>?

  @InterfaceMethod(5)
  public fun get_PeerIntermediateCertificates(): IVectorView<Certificate?>?

  @InterfaceMethod(6)
  public fun Accept(): Unit

  @InterfaceMethod(7)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAllJoynCredentialsVerificationRequestedEventArgs> {
    public override fun getValue() =
        ABI.makeIAllJoynCredentialsVerificationRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IAllJoynCredentialsVerificationRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAllJoynCredentialsVerificationRequestedEventArgs {
    public val __280662513_Ptr: Pointer?

    public val _280662513_VtblPtr: Pointer?
      get() = __280662513_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AuthenticationMechanism(): AllJoynAuthenticationMechanism? {
      val fnPtr = _280662513_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AllJoynAuthenticationMechanism>()
      val hr = fn.invokeHR(arrayOf(__280662513_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AllJoynAuthenticationMechanism>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_PeerUniqueName(): String? {
      val fnPtr = _280662513_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__280662513_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_PeerCertificate(): Certificate? {
      val fnPtr = _280662513_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Certificate>()
      val hr = fn.invokeHR(arrayOf(__280662513_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Certificate>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_PeerCertificateErrorSeverity(): SocketSslErrorSeverity? {
      val fnPtr = _280662513_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SocketSslErrorSeverity>()
      val hr = fn.invokeHR(arrayOf(__280662513_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SocketSslErrorSeverity>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_PeerCertificateErrors(): IVectorView<ChainValidationResult?>? {
      val fnPtr = _280662513_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<ChainValidationResult?>>()
      val hr = fn.invokeHR(arrayOf(__280662513_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<ChainValidationResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_PeerIntermediateCertificates(): IVectorView<Certificate?>? {
      val fnPtr = _280662513_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<Certificate?>>()
      val hr = fn.invokeHR(arrayOf(__280662513_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<Certificate?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun Accept(): Unit {
      val fnPtr = _280662513_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__280662513_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _280662513_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__280662513_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class IAllJoynCredentialsVerificationRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __280662513_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAllJoynCredentialsVerificationRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("800a7612b80544afa2e1792ab655a2d0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAllJoynCredentialsVerificationRequestedEventArgs(ptr: Pointer?): WithDefault =
        IAllJoynCredentialsVerificationRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IAllJoynCredentialsVerificationRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeIAllJoynCredentialsVerificationRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IAllJoynCredentialsVerificationRequestedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__280662513_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAllJoynCredentialsVerificationRequestedEventArgs):
        Array<IAllJoynCredentialsVerificationRequestedEventArgs?> = (elements as
        Array<IAllJoynCredentialsVerificationRequestedEventArgs?>).castToImpl<IAllJoynCredentialsVerificationRequestedEventArgs,IAllJoynCredentialsVerificationRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IAllJoynCredentialsVerificationRequestedEventArgs?> =
        arrayOfNulls<IAllJoynCredentialsVerificationRequestedEventArgs_Impl>(size) as
        Array<IAllJoynCredentialsVerificationRequestedEventArgs?>
  }
}
