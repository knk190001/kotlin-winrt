package Windows.Security.Cryptography.Certificates

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

@ABIMarker(IKeyAlgorithmNamesStatics.ABI::class)
@Signature("{479065d7-7ac7-4581-8c3b-d07027140448}")
@Guid("479065d77ac745818c3bd07027140448")
@WinRTInterface("479065d77ac745818c3bd07027140448")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IKeyAlgorithmNamesStatics.ByReference::class)
public interface IKeyAlgorithmNamesStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Rsa(): String?

  @InterfaceMethod(1)
  public fun get_Dsa(): String?

  @InterfaceMethod(2)
  public fun get_Ecdh256(): String?

  @InterfaceMethod(3)
  public fun get_Ecdh384(): String?

  @InterfaceMethod(4)
  public fun get_Ecdh521(): String?

  @InterfaceMethod(5)
  public fun get_Ecdsa256(): String?

  @InterfaceMethod(6)
  public fun get_Ecdsa384(): String?

  @InterfaceMethod(7)
  public fun get_Ecdsa521(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IKeyAlgorithmNamesStatics> {
    public override fun getValue() = ABI.makeIKeyAlgorithmNamesStatics(pointer.getPointer(0))

    public fun setValue(value: IKeyAlgorithmNamesStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IKeyAlgorithmNamesStatics {
    public val __47946811_Ptr: Pointer?

    public val _47946811_VtblPtr: Pointer?
      get() = __47946811_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Rsa(): String? {
      val fnPtr = _47946811_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__47946811_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Dsa(): String? {
      val fnPtr = _47946811_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__47946811_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Ecdh256(): String? {
      val fnPtr = _47946811_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__47946811_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Ecdh384(): String? {
      val fnPtr = _47946811_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__47946811_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Ecdh521(): String? {
      val fnPtr = _47946811_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__47946811_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_Ecdsa256(): String? {
      val fnPtr = _47946811_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__47946811_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_Ecdsa384(): String? {
      val fnPtr = _47946811_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__47946811_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_Ecdsa521(): String? {
      val fnPtr = _47946811_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__47946811_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IKeyAlgorithmNamesStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __47946811_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IKeyAlgorithmNamesStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("479065d77ac745818c3bd07027140448")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIKeyAlgorithmNamesStatics(ptr: Pointer?): WithDefault =
        IKeyAlgorithmNamesStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IKeyAlgorithmNamesStatics {
      val address = segment.toRawLongValue()
      return makeIKeyAlgorithmNamesStatics(Pointer(address))
    }

    public override fun toNative(obj: IKeyAlgorithmNamesStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__47946811_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IKeyAlgorithmNamesStatics):
        Array<IKeyAlgorithmNamesStatics?> = (elements as
        Array<IKeyAlgorithmNamesStatics?>).castToImpl<IKeyAlgorithmNamesStatics,IKeyAlgorithmNamesStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IKeyAlgorithmNamesStatics?> =
        arrayOfNulls<IKeyAlgorithmNamesStatics_Impl>(size) as Array<IKeyAlgorithmNamesStatics?>
  }
}
