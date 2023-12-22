package Windows.Networking.Sockets

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IStreamSocketInformation2.ABI::class)
@Signature("{12c28452-4bdc-4ee4-976a-cf130e9d92e3}")
@Guid("12c284524bdc4ee4976acf130e9d92e3")
@WinRTInterface("12c284524bdc4ee4976acf130e9d92e3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStreamSocketInformation2.ByReference::class)
public interface IStreamSocketInformation2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ServerCertificateErrorSeverity(): SocketSslErrorSeverity?

  @InterfaceMethod(1)
  public fun get_ServerCertificateErrors(): IVectorView<ChainValidationResult?>?

  @InterfaceMethod(2)
  public fun get_ServerCertificate(): Certificate?

  @InterfaceMethod(3)
  public fun get_ServerIntermediateCertificates(): IVectorView<Certificate?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStreamSocketInformation2> {
    public override fun getValue() = ABI.makeIStreamSocketInformation2(pointer.getPointer(0))

    public fun setValue(value: IStreamSocketInformation2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStreamSocketInformation2 {
    public val __1812091407_Ptr: Pointer?

    public val _1812091407_VtblPtr: Pointer?
      get() = __1812091407_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ServerCertificateErrorSeverity(): SocketSslErrorSeverity? {
      val fnPtr = _1812091407_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SocketSslErrorSeverity>()
      val hr = fn.invokeHR(arrayOf(__1812091407_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SocketSslErrorSeverity>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ServerCertificateErrors(): IVectorView<ChainValidationResult?>? {
      val fnPtr = _1812091407_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<ChainValidationResult?>>()
      val hr = fn.invokeHR(arrayOf(__1812091407_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<ChainValidationResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ServerCertificate(): Certificate? {
      val fnPtr = _1812091407_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Certificate>()
      val hr = fn.invokeHR(arrayOf(__1812091407_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Certificate>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_ServerIntermediateCertificates(): IVectorView<Certificate?>? {
      val fnPtr = _1812091407_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<Certificate?>>()
      val hr = fn.invokeHR(arrayOf(__1812091407_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<Certificate?>>(result.getValue())
      return resultValue
    }
  }

  public class IStreamSocketInformation2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1812091407_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStreamSocketInformation2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("12c284524bdc4ee4976acf130e9d92e3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStreamSocketInformation2(ptr: Pointer?): WithDefault =
        IStreamSocketInformation2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStreamSocketInformation2 {
      val address = segment.toRawLongValue()
      return makeIStreamSocketInformation2(Pointer(address))
    }

    public override fun toNative(obj: IStreamSocketInformation2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1812091407_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStreamSocketInformation2):
        Array<IStreamSocketInformation2?> = (elements as
        Array<IStreamSocketInformation2?>).castToImpl<IStreamSocketInformation2,IStreamSocketInformation2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStreamSocketInformation2?> =
        arrayOfNulls<IStreamSocketInformation2_Impl>(size) as Array<IStreamSocketInformation2?>
  }
}
