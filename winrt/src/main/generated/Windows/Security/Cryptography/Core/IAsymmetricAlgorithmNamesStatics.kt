package Windows.Security.Cryptography.Core

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

@ABIMarker(IAsymmetricAlgorithmNamesStatics.ABI::class)
@Signature("{caf6fce4-67c0-46aa-84f9-752e77449f9b}")
@Guid("caf6fce467c046aa84f9752e77449f9b")
@WinRTInterface("caf6fce467c046aa84f9752e77449f9b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAsymmetricAlgorithmNamesStatics.ByReference::class)
public interface IAsymmetricAlgorithmNamesStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_RsaPkcs1(): String?

  @InterfaceMethod(1)
  public fun get_RsaOaepSha1(): String?

  @InterfaceMethod(2)
  public fun get_RsaOaepSha256(): String?

  @InterfaceMethod(3)
  public fun get_RsaOaepSha384(): String?

  @InterfaceMethod(4)
  public fun get_RsaOaepSha512(): String?

  @InterfaceMethod(5)
  public fun get_EcdsaP256Sha256(): String?

  @InterfaceMethod(6)
  public fun get_EcdsaP384Sha384(): String?

  @InterfaceMethod(7)
  public fun get_EcdsaP521Sha512(): String?

  @InterfaceMethod(8)
  public fun get_DsaSha1(): String?

  @InterfaceMethod(9)
  public fun get_DsaSha256(): String?

  @InterfaceMethod(10)
  public fun get_RsaSignPkcs1Sha1(): String?

  @InterfaceMethod(11)
  public fun get_RsaSignPkcs1Sha256(): String?

  @InterfaceMethod(12)
  public fun get_RsaSignPkcs1Sha384(): String?

  @InterfaceMethod(13)
  public fun get_RsaSignPkcs1Sha512(): String?

  @InterfaceMethod(14)
  public fun get_RsaSignPssSha1(): String?

  @InterfaceMethod(15)
  public fun get_RsaSignPssSha256(): String?

  @InterfaceMethod(16)
  public fun get_RsaSignPssSha384(): String?

  @InterfaceMethod(17)
  public fun get_RsaSignPssSha512(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAsymmetricAlgorithmNamesStatics> {
    public override fun getValue() = ABI.makeIAsymmetricAlgorithmNamesStatics(pointer.getPointer(0))

    public fun setValue(value: IAsymmetricAlgorithmNamesStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAsymmetricAlgorithmNamesStatics {
    public val __177436597_Ptr: Pointer?

    public val _177436597_VtblPtr: Pointer?
      get() = __177436597_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RsaPkcs1(): String? {
      val fnPtr = _177436597_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__177436597_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_RsaOaepSha1(): String? {
      val fnPtr = _177436597_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__177436597_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_RsaOaepSha256(): String? {
      val fnPtr = _177436597_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__177436597_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_RsaOaepSha384(): String? {
      val fnPtr = _177436597_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__177436597_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_RsaOaepSha512(): String? {
      val fnPtr = _177436597_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__177436597_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_EcdsaP256Sha256(): String? {
      val fnPtr = _177436597_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__177436597_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_EcdsaP384Sha384(): String? {
      val fnPtr = _177436597_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__177436597_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_EcdsaP521Sha512(): String? {
      val fnPtr = _177436597_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__177436597_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_DsaSha1(): String? {
      val fnPtr = _177436597_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__177436597_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_DsaSha256(): String? {
      val fnPtr = _177436597_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__177436597_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_RsaSignPkcs1Sha1(): String? {
      val fnPtr = _177436597_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__177436597_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_RsaSignPkcs1Sha256(): String? {
      val fnPtr = _177436597_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__177436597_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun get_RsaSignPkcs1Sha384(): String? {
      val fnPtr = _177436597_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__177436597_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun get_RsaSignPkcs1Sha512(): String? {
      val fnPtr = _177436597_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__177436597_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun get_RsaSignPssSha1(): String? {
      val fnPtr = _177436597_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__177436597_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun get_RsaSignPssSha256(): String? {
      val fnPtr = _177436597_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__177436597_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun get_RsaSignPssSha384(): String? {
      val fnPtr = _177436597_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__177436597_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun get_RsaSignPssSha512(): String? {
      val fnPtr = _177436597_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__177436597_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IAsymmetricAlgorithmNamesStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __177436597_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAsymmetricAlgorithmNamesStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("caf6fce467c046aa84f9752e77449f9b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAsymmetricAlgorithmNamesStatics(ptr: Pointer?): WithDefault =
        IAsymmetricAlgorithmNamesStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAsymmetricAlgorithmNamesStatics {
      val address = segment.toRawLongValue()
      return makeIAsymmetricAlgorithmNamesStatics(Pointer(address))
    }

    public override fun toNative(obj: IAsymmetricAlgorithmNamesStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__177436597_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAsymmetricAlgorithmNamesStatics):
        Array<IAsymmetricAlgorithmNamesStatics?> = (elements as
        Array<IAsymmetricAlgorithmNamesStatics?>).castToImpl<IAsymmetricAlgorithmNamesStatics,IAsymmetricAlgorithmNamesStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAsymmetricAlgorithmNamesStatics?> =
        arrayOfNulls<IAsymmetricAlgorithmNamesStatics_Impl>(size) as
        Array<IAsymmetricAlgorithmNamesStatics?>
  }
}
