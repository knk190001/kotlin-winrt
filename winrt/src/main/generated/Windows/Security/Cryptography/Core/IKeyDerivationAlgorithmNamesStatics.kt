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

@ABIMarker(IKeyDerivationAlgorithmNamesStatics.ABI::class)
@Signature("{7b6e363e-94d2-4739-a57b-022e0c3a402a}")
@Guid("7b6e363e94d24739a57b022e0c3a402a")
@WinRTInterface("7b6e363e94d24739a57b022e0c3a402a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IKeyDerivationAlgorithmNamesStatics.ByReference::class)
public interface IKeyDerivationAlgorithmNamesStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Pbkdf2Md5(): String?

  @InterfaceMethod(1)
  public fun get_Pbkdf2Sha1(): String?

  @InterfaceMethod(2)
  public fun get_Pbkdf2Sha256(): String?

  @InterfaceMethod(3)
  public fun get_Pbkdf2Sha384(): String?

  @InterfaceMethod(4)
  public fun get_Pbkdf2Sha512(): String?

  @InterfaceMethod(5)
  public fun get_Sp800108CtrHmacMd5(): String?

  @InterfaceMethod(6)
  public fun get_Sp800108CtrHmacSha1(): String?

  @InterfaceMethod(7)
  public fun get_Sp800108CtrHmacSha256(): String?

  @InterfaceMethod(8)
  public fun get_Sp800108CtrHmacSha384(): String?

  @InterfaceMethod(9)
  public fun get_Sp800108CtrHmacSha512(): String?

  @InterfaceMethod(10)
  public fun get_Sp80056aConcatMd5(): String?

  @InterfaceMethod(11)
  public fun get_Sp80056aConcatSha1(): String?

  @InterfaceMethod(12)
  public fun get_Sp80056aConcatSha256(): String?

  @InterfaceMethod(13)
  public fun get_Sp80056aConcatSha384(): String?

  @InterfaceMethod(14)
  public fun get_Sp80056aConcatSha512(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IKeyDerivationAlgorithmNamesStatics> {
    public override fun getValue() =
        ABI.makeIKeyDerivationAlgorithmNamesStatics(pointer.getPointer(0))

    public fun setValue(value: IKeyDerivationAlgorithmNamesStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IKeyDerivationAlgorithmNamesStatics {
    public val __869086529_Ptr: Pointer?

    public val _869086529_VtblPtr: Pointer?
      get() = __869086529_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Pbkdf2Md5(): String? {
      val fnPtr = _869086529_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__869086529_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Pbkdf2Sha1(): String? {
      val fnPtr = _869086529_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__869086529_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Pbkdf2Sha256(): String? {
      val fnPtr = _869086529_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__869086529_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Pbkdf2Sha384(): String? {
      val fnPtr = _869086529_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__869086529_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Pbkdf2Sha512(): String? {
      val fnPtr = _869086529_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__869086529_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_Sp800108CtrHmacMd5(): String? {
      val fnPtr = _869086529_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__869086529_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_Sp800108CtrHmacSha1(): String? {
      val fnPtr = _869086529_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__869086529_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_Sp800108CtrHmacSha256(): String? {
      val fnPtr = _869086529_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__869086529_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_Sp800108CtrHmacSha384(): String? {
      val fnPtr = _869086529_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__869086529_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_Sp800108CtrHmacSha512(): String? {
      val fnPtr = _869086529_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__869086529_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_Sp80056aConcatMd5(): String? {
      val fnPtr = _869086529_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__869086529_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_Sp80056aConcatSha1(): String? {
      val fnPtr = _869086529_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__869086529_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun get_Sp80056aConcatSha256(): String? {
      val fnPtr = _869086529_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__869086529_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun get_Sp80056aConcatSha384(): String? {
      val fnPtr = _869086529_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__869086529_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun get_Sp80056aConcatSha512(): String? {
      val fnPtr = _869086529_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__869086529_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IKeyDerivationAlgorithmNamesStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __869086529_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IKeyDerivationAlgorithmNamesStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7b6e363e94d24739a57b022e0c3a402a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIKeyDerivationAlgorithmNamesStatics(ptr: Pointer?): WithDefault =
        IKeyDerivationAlgorithmNamesStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IKeyDerivationAlgorithmNamesStatics {
      val address = segment.toRawLongValue()
      return makeIKeyDerivationAlgorithmNamesStatics(Pointer(address))
    }

    public override fun toNative(obj: IKeyDerivationAlgorithmNamesStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__869086529_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IKeyDerivationAlgorithmNamesStatics):
        Array<IKeyDerivationAlgorithmNamesStatics?> = (elements as
        Array<IKeyDerivationAlgorithmNamesStatics?>).castToImpl<IKeyDerivationAlgorithmNamesStatics,IKeyDerivationAlgorithmNamesStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IKeyDerivationAlgorithmNamesStatics?> =
        arrayOfNulls<IKeyDerivationAlgorithmNamesStatics_Impl>(size) as
        Array<IKeyDerivationAlgorithmNamesStatics?>
  }
}
