package Windows.Security.Cryptography.Core

import Windows.Foundation.IAsyncOperation
import Windows.Security.Cryptography.Certificates.Certificate
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

@ABIMarker(IPersistedKeyProviderStatics.ABI::class)
@Signature("{77274814-d9d4-4cf5-b668-e0457df30894}")
@Guid("77274814d9d44cf5b668e0457df30894")
@WinRTInterface("77274814d9d44cf5b668e0457df30894")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPersistedKeyProviderStatics.ByReference::class)
public interface IPersistedKeyProviderStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun OpenKeyPairFromCertificateAsync(
    certificate: Certificate?,
    hashAlgorithmName: String?,
    padding: CryptographicPadding?
  ): IAsyncOperation<CryptographicKey?>?

  @InterfaceMethod(1)
  public fun OpenPublicKeyFromCertificate(
    certificate: Certificate?,
    hashAlgorithmName: String?,
    padding: CryptographicPadding?
  ): CryptographicKey?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPersistedKeyProviderStatics> {
    public override fun getValue() = ABI.makeIPersistedKeyProviderStatics(pointer.getPointer(0))

    public fun setValue(value: IPersistedKeyProviderStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPersistedKeyProviderStatics {
    public val __1044901187_Ptr: Pointer?

    public val _1044901187_VtblPtr: Pointer?
      get() = __1044901187_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun OpenKeyPairFromCertificateAsync(
      certificate: Certificate?,
      hashAlgorithmName: String?,
      padding: CryptographicPadding?
    ): IAsyncOperation<CryptographicKey?>? {
      val fnPtr = _1044901187_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<CryptographicKey?>>()
      val hr = fn.invokeHR(arrayOf(__1044901187_Ptr, marshalToNative(certificate),
          marshalToNative(hashAlgorithmName), marshalToNative(padding), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<CryptographicKey?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun OpenPublicKeyFromCertificate(
      certificate: Certificate?,
      hashAlgorithmName: String?,
      padding: CryptographicPadding?
    ): CryptographicKey? {
      val fnPtr = _1044901187_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CryptographicKey>()
      val hr = fn.invokeHR(arrayOf(__1044901187_Ptr, marshalToNative(certificate),
          marshalToNative(hashAlgorithmName), marshalToNative(padding), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CryptographicKey>(result.getValue())
      return resultValue
    }
  }

  public class IPersistedKeyProviderStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1044901187_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPersistedKeyProviderStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("77274814d9d44cf5b668e0457df30894")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPersistedKeyProviderStatics(ptr: Pointer?): WithDefault =
        IPersistedKeyProviderStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPersistedKeyProviderStatics {
      val address = segment.toRawLongValue()
      return makeIPersistedKeyProviderStatics(Pointer(address))
    }

    public override fun toNative(obj: IPersistedKeyProviderStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1044901187_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPersistedKeyProviderStatics):
        Array<IPersistedKeyProviderStatics?> = (elements as
        Array<IPersistedKeyProviderStatics?>).castToImpl<IPersistedKeyProviderStatics,IPersistedKeyProviderStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPersistedKeyProviderStatics?> =
        arrayOfNulls<IPersistedKeyProviderStatics_Impl>(size) as
        Array<IPersistedKeyProviderStatics?>
  }
}
