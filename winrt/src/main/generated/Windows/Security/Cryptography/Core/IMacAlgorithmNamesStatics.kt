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

@ABIMarker(IMacAlgorithmNamesStatics.ABI::class)
@Signature("{41412678-fb1e-43a4-895e-a9026e4390a3}")
@Guid("41412678fb1e43a4895ea9026e4390a3")
@WinRTInterface("41412678fb1e43a4895ea9026e4390a3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMacAlgorithmNamesStatics.ByReference::class)
public interface IMacAlgorithmNamesStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_HmacMd5(): String?

  @InterfaceMethod(1)
  public fun get_HmacSha1(): String?

  @InterfaceMethod(2)
  public fun get_HmacSha256(): String?

  @InterfaceMethod(3)
  public fun get_HmacSha384(): String?

  @InterfaceMethod(4)
  public fun get_HmacSha512(): String?

  @InterfaceMethod(5)
  public fun get_AesCmac(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMacAlgorithmNamesStatics> {
    public override fun getValue() = ABI.makeIMacAlgorithmNamesStatics(pointer.getPointer(0))

    public fun setValue(value: IMacAlgorithmNamesStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMacAlgorithmNamesStatics {
    public val __605211704_Ptr: Pointer?

    public val _605211704_VtblPtr: Pointer?
      get() = __605211704_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_HmacMd5(): String? {
      val fnPtr = _605211704_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__605211704_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_HmacSha1(): String? {
      val fnPtr = _605211704_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__605211704_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_HmacSha256(): String? {
      val fnPtr = _605211704_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__605211704_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_HmacSha384(): String? {
      val fnPtr = _605211704_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__605211704_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_HmacSha512(): String? {
      val fnPtr = _605211704_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__605211704_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_AesCmac(): String? {
      val fnPtr = _605211704_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__605211704_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IMacAlgorithmNamesStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __605211704_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMacAlgorithmNamesStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("41412678fb1e43a4895ea9026e4390a3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMacAlgorithmNamesStatics(ptr: Pointer?): WithDefault =
        IMacAlgorithmNamesStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMacAlgorithmNamesStatics {
      val address = segment.toRawLongValue()
      return makeIMacAlgorithmNamesStatics(Pointer(address))
    }

    public override fun toNative(obj: IMacAlgorithmNamesStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__605211704_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMacAlgorithmNamesStatics):
        Array<IMacAlgorithmNamesStatics?> = (elements as
        Array<IMacAlgorithmNamesStatics?>).castToImpl<IMacAlgorithmNamesStatics,IMacAlgorithmNamesStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMacAlgorithmNamesStatics?> =
        arrayOfNulls<IMacAlgorithmNamesStatics_Impl>(size) as Array<IMacAlgorithmNamesStatics?>
  }
}
