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

@ABIMarker(ISymmetricAlgorithmNamesStatics.ABI::class)
@Signature("{6870727b-c996-4eae-84d7-79b2aeb73b9c}")
@Guid("6870727bc9964eae84d779b2aeb73b9c")
@WinRTInterface("6870727bc9964eae84d779b2aeb73b9c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISymmetricAlgorithmNamesStatics.ByReference::class)
public interface ISymmetricAlgorithmNamesStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DesCbc(): String?

  @InterfaceMethod(1)
  public fun get_DesEcb(): String?

  @InterfaceMethod(2)
  public fun get_TripleDesCbc(): String?

  @InterfaceMethod(3)
  public fun get_TripleDesEcb(): String?

  @InterfaceMethod(4)
  public fun get_Rc2Cbc(): String?

  @InterfaceMethod(5)
  public fun get_Rc2Ecb(): String?

  @InterfaceMethod(6)
  public fun get_AesCbc(): String?

  @InterfaceMethod(7)
  public fun get_AesEcb(): String?

  @InterfaceMethod(8)
  public fun get_AesGcm(): String?

  @InterfaceMethod(9)
  public fun get_AesCcm(): String?

  @InterfaceMethod(10)
  public fun get_AesCbcPkcs7(): String?

  @InterfaceMethod(11)
  public fun get_AesEcbPkcs7(): String?

  @InterfaceMethod(12)
  public fun get_DesCbcPkcs7(): String?

  @InterfaceMethod(13)
  public fun get_DesEcbPkcs7(): String?

  @InterfaceMethod(14)
  public fun get_TripleDesCbcPkcs7(): String?

  @InterfaceMethod(15)
  public fun get_TripleDesEcbPkcs7(): String?

  @InterfaceMethod(16)
  public fun get_Rc2CbcPkcs7(): String?

  @InterfaceMethod(17)
  public fun get_Rc2EcbPkcs7(): String?

  @InterfaceMethod(18)
  public fun get_Rc4(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISymmetricAlgorithmNamesStatics> {
    public override fun getValue() = ABI.makeISymmetricAlgorithmNamesStatics(pointer.getPointer(0))

    public fun setValue(value: ISymmetricAlgorithmNamesStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISymmetricAlgorithmNamesStatics {
    public val __1878760096_Ptr: Pointer?

    public val _1878760096_VtblPtr: Pointer?
      get() = __1878760096_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DesCbc(): String? {
      val fnPtr = _1878760096_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1878760096_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_DesEcb(): String? {
      val fnPtr = _1878760096_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1878760096_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_TripleDesCbc(): String? {
      val fnPtr = _1878760096_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1878760096_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_TripleDesEcb(): String? {
      val fnPtr = _1878760096_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1878760096_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Rc2Cbc(): String? {
      val fnPtr = _1878760096_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1878760096_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_Rc2Ecb(): String? {
      val fnPtr = _1878760096_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1878760096_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_AesCbc(): String? {
      val fnPtr = _1878760096_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1878760096_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_AesEcb(): String? {
      val fnPtr = _1878760096_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1878760096_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_AesGcm(): String? {
      val fnPtr = _1878760096_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1878760096_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_AesCcm(): String? {
      val fnPtr = _1878760096_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1878760096_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_AesCbcPkcs7(): String? {
      val fnPtr = _1878760096_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1878760096_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_AesEcbPkcs7(): String? {
      val fnPtr = _1878760096_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1878760096_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun get_DesCbcPkcs7(): String? {
      val fnPtr = _1878760096_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1878760096_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun get_DesEcbPkcs7(): String? {
      val fnPtr = _1878760096_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1878760096_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun get_TripleDesCbcPkcs7(): String? {
      val fnPtr = _1878760096_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1878760096_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun get_TripleDesEcbPkcs7(): String? {
      val fnPtr = _1878760096_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1878760096_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun get_Rc2CbcPkcs7(): String? {
      val fnPtr = _1878760096_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1878760096_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun get_Rc2EcbPkcs7(): String? {
      val fnPtr = _1878760096_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1878760096_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun get_Rc4(): String? {
      val fnPtr = _1878760096_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1878760096_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class ISymmetricAlgorithmNamesStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1878760096_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISymmetricAlgorithmNamesStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6870727bc9964eae84d779b2aeb73b9c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISymmetricAlgorithmNamesStatics(ptr: Pointer?): WithDefault =
        ISymmetricAlgorithmNamesStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISymmetricAlgorithmNamesStatics {
      val address = segment.toRawLongValue()
      return makeISymmetricAlgorithmNamesStatics(Pointer(address))
    }

    public override fun toNative(obj: ISymmetricAlgorithmNamesStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1878760096_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISymmetricAlgorithmNamesStatics):
        Array<ISymmetricAlgorithmNamesStatics?> = (elements as
        Array<ISymmetricAlgorithmNamesStatics?>).castToImpl<ISymmetricAlgorithmNamesStatics,ISymmetricAlgorithmNamesStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISymmetricAlgorithmNamesStatics?> =
        arrayOfNulls<ISymmetricAlgorithmNamesStatics_Impl>(size) as
        Array<ISymmetricAlgorithmNamesStatics?>
  }
}
