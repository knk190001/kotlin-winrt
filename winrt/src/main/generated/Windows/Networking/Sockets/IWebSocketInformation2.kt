package Windows.Networking.Sockets

import Windows.Foundation.Collections.IVectorView
import Windows.Networking.Sockets.IWebSocketInformation.ABI.IID
import Windows.Security.Cryptography.Certificates.Certificate
import Windows.Security.Cryptography.Certificates.ChainValidationResult
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IWebSocketInformation2.ABI::class)
@Signature("{ce1d39ce-a1b7-4d43-8269-8d5b981bd47a}")
@Guid("ce1d39cea1b74d4382698d5b981bd47a")
@WinRTInterface("ce1d39cea1b74d4382698d5b981bd47a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebSocketInformation2.ByReference::class)
public interface IWebSocketInformation2 : NativeMapped, IWinRTInterface, IWebSocketInformation {
  @InterfaceMethod(0)
  public fun get_ServerCertificate(): Certificate?

  @InterfaceMethod(1)
  public fun get_ServerCertificateErrorSeverity(): SocketSslErrorSeverity?

  @InterfaceMethod(2)
  public fun get_ServerCertificateErrors(): IVectorView<ChainValidationResult?>?

  @InterfaceMethod(3)
  public fun get_ServerIntermediateCertificates(): IVectorView<Certificate?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebSocketInformation2> {
    public override fun getValue() = ABI.makeIWebSocketInformation2(pointer.getPointer(0))

    public fun setValue(value: IWebSocketInformation2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebSocketInformation2, IWebSocketInformation.WithDefault {
    public val __881144405_Ptr: Pointer?

    public val _881144405_VtblPtr: Pointer?
      get() = __881144405_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ServerCertificate(): Certificate? {
      val fnPtr = _881144405_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Certificate>()
      val hr = fn.invokeHR(arrayOf(__881144405_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Certificate>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ServerCertificateErrorSeverity(): SocketSslErrorSeverity? {
      val fnPtr = _881144405_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SocketSslErrorSeverity>()
      val hr = fn.invokeHR(arrayOf(__881144405_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SocketSslErrorSeverity>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ServerCertificateErrors(): IVectorView<ChainValidationResult?>? {
      val fnPtr = _881144405_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<ChainValidationResult?>>()
      val hr = fn.invokeHR(arrayOf(__881144405_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<ChainValidationResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_ServerIntermediateCertificates(): IVectorView<Certificate?>? {
      val fnPtr = _881144405_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<Certificate?>>()
      val hr = fn.invokeHR(arrayOf(__881144405_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<Certificate?>>(result.getValue())
      return resultValue
    }
  }

  public class IWebSocketInformation2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IWebSocketInformation {
    public override val __1690991997_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_881144405_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __881144405_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebSocketInformation2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ce1d39cea1b74d4382698d5b981bd47a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebSocketInformation2(ptr: Pointer?): WithDefault =
        IWebSocketInformation2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebSocketInformation2 {
      val address = segment.toRawLongValue()
      return makeIWebSocketInformation2(Pointer(address))
    }

    public override fun toNative(obj: IWebSocketInformation2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__881144405_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebSocketInformation2): Array<IWebSocketInformation2?> =
        (elements as
        Array<IWebSocketInformation2?>).castToImpl<IWebSocketInformation2,IWebSocketInformation2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebSocketInformation2?> =
        arrayOfNulls<IWebSocketInformation2_Impl>(size) as Array<IWebSocketInformation2?>
  }
}
