package Windows.Security.Cryptography.Core

import Windows.Storage.Streams.IBuffer
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IAsymmetricKeyAlgorithmProvider.ABI::class)
@Signature("{e8d2ff37-6259-4e88-b7e0-94191fde699e}")
@Guid("e8d2ff3762594e88b7e094191fde699e")
@WinRTInterface("e8d2ff3762594e88b7e094191fde699e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAsymmetricKeyAlgorithmProvider.ByReference::class)
public interface IAsymmetricKeyAlgorithmProvider : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AlgorithmName(): String?

  @InterfaceMethod(1)
  public fun CreateKeyPair(keySize: WinDef.UINT): CryptographicKey?

  @InterfaceMethod(2)
  public fun ImportKeyPair(keyBlob: IBuffer?): CryptographicKey?

  @InterfaceMethod(3)
  public fun ImportKeyPair(keyBlob: IBuffer?, BlobType: CryptographicPrivateKeyBlobType?):
      CryptographicKey?

  @InterfaceMethod(4)
  public fun ImportPublicKey(keyBlob: IBuffer?): CryptographicKey?

  @InterfaceMethod(5)
  public fun ImportPublicKey(keyBlob: IBuffer?, BlobType: CryptographicPublicKeyBlobType?):
      CryptographicKey?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAsymmetricKeyAlgorithmProvider> {
    public override fun getValue() = ABI.makeIAsymmetricKeyAlgorithmProvider(pointer.getPointer(0))

    public fun setValue(value: IAsymmetricKeyAlgorithmProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAsymmetricKeyAlgorithmProvider {
    public val __54166562_Ptr: Pointer?

    public val _54166562_VtblPtr: Pointer?
      get() = __54166562_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AlgorithmName(): String? {
      val fnPtr = _54166562_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__54166562_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateKeyPair(keySize: WinDef.UINT): CryptographicKey? {
      val fnPtr = _54166562_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CryptographicKey>()
      val hr = fn.invokeHR(arrayOf(__54166562_Ptr, keySize, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CryptographicKey>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun ImportKeyPair(keyBlob: IBuffer?): CryptographicKey? {
      val fnPtr = _54166562_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CryptographicKey>()
      val hr = fn.invokeHR(arrayOf(__54166562_Ptr, marshalToNative(keyBlob), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CryptographicKey>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun ImportKeyPair(keyBlob: IBuffer?,
        BlobType: CryptographicPrivateKeyBlobType?): CryptographicKey? {
      val fnPtr = _54166562_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CryptographicKey>()
      val hr = fn.invokeHR(arrayOf(__54166562_Ptr, marshalToNative(keyBlob),
          marshalToNative(BlobType), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CryptographicKey>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun ImportPublicKey(keyBlob: IBuffer?): CryptographicKey? {
      val fnPtr = _54166562_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CryptographicKey>()
      val hr = fn.invokeHR(arrayOf(__54166562_Ptr, marshalToNative(keyBlob), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CryptographicKey>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun ImportPublicKey(keyBlob: IBuffer?,
        BlobType: CryptographicPublicKeyBlobType?): CryptographicKey? {
      val fnPtr = _54166562_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CryptographicKey>()
      val hr = fn.invokeHR(arrayOf(__54166562_Ptr, marshalToNative(keyBlob),
          marshalToNative(BlobType), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CryptographicKey>(result.getValue())
      return resultValue
    }
  }

  public class IAsymmetricKeyAlgorithmProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __54166562_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAsymmetricKeyAlgorithmProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e8d2ff3762594e88b7e094191fde699e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAsymmetricKeyAlgorithmProvider(ptr: Pointer?): WithDefault =
        IAsymmetricKeyAlgorithmProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAsymmetricKeyAlgorithmProvider {
      val address = segment.toRawLongValue()
      return makeIAsymmetricKeyAlgorithmProvider(Pointer(address))
    }

    public override fun toNative(obj: IAsymmetricKeyAlgorithmProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__54166562_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAsymmetricKeyAlgorithmProvider):
        Array<IAsymmetricKeyAlgorithmProvider?> = (elements as
        Array<IAsymmetricKeyAlgorithmProvider?>).castToImpl<IAsymmetricKeyAlgorithmProvider,IAsymmetricKeyAlgorithmProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAsymmetricKeyAlgorithmProvider?> =
        arrayOfNulls<IAsymmetricKeyAlgorithmProvider_Impl>(size) as
        Array<IAsymmetricKeyAlgorithmProvider?>
  }
}
