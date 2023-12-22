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

@ABIMarker(IHashAlgorithmNamesStatics.ABI::class)
@Signature("{6b5e0516-de96-4f0a-8d57-dcc9dae36c76}")
@Guid("6b5e0516de964f0a8d57dcc9dae36c76")
@WinRTInterface("6b5e0516de964f0a8d57dcc9dae36c76")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHashAlgorithmNamesStatics.ByReference::class)
public interface IHashAlgorithmNamesStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Md5(): String?

  @InterfaceMethod(1)
  public fun get_Sha1(): String?

  @InterfaceMethod(2)
  public fun get_Sha256(): String?

  @InterfaceMethod(3)
  public fun get_Sha384(): String?

  @InterfaceMethod(4)
  public fun get_Sha512(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHashAlgorithmNamesStatics> {
    public override fun getValue() = ABI.makeIHashAlgorithmNamesStatics(pointer.getPointer(0))

    public fun setValue(value: IHashAlgorithmNamesStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHashAlgorithmNamesStatics {
    public val __222735885_Ptr: Pointer?

    public val _222735885_VtblPtr: Pointer?
      get() = __222735885_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Md5(): String? {
      val fnPtr = _222735885_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__222735885_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Sha1(): String? {
      val fnPtr = _222735885_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__222735885_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Sha256(): String? {
      val fnPtr = _222735885_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__222735885_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Sha384(): String? {
      val fnPtr = _222735885_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__222735885_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Sha512(): String? {
      val fnPtr = _222735885_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__222735885_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IHashAlgorithmNamesStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __222735885_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHashAlgorithmNamesStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6b5e0516de964f0a8d57dcc9dae36c76")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHashAlgorithmNamesStatics(ptr: Pointer?): WithDefault =
        IHashAlgorithmNamesStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHashAlgorithmNamesStatics {
      val address = segment.toRawLongValue()
      return makeIHashAlgorithmNamesStatics(Pointer(address))
    }

    public override fun toNative(obj: IHashAlgorithmNamesStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__222735885_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHashAlgorithmNamesStatics):
        Array<IHashAlgorithmNamesStatics?> = (elements as
        Array<IHashAlgorithmNamesStatics?>).castToImpl<IHashAlgorithmNamesStatics,IHashAlgorithmNamesStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHashAlgorithmNamesStatics?> =
        arrayOfNulls<IHashAlgorithmNamesStatics_Impl>(size) as Array<IHashAlgorithmNamesStatics?>
  }
}
