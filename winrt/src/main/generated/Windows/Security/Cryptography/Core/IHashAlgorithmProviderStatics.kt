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

@ABIMarker(IHashAlgorithmProviderStatics.ABI::class)
@Signature("{9fac9741-5cc4-4336-ae38-6212b75a915a}")
@Guid("9fac97415cc44336ae386212b75a915a")
@WinRTInterface("9fac97415cc44336ae386212b75a915a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHashAlgorithmProviderStatics.ByReference::class)
public interface IHashAlgorithmProviderStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun OpenAlgorithm(algorithm: String?): HashAlgorithmProvider?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHashAlgorithmProviderStatics> {
    public override fun getValue() = ABI.makeIHashAlgorithmProviderStatics(pointer.getPointer(0))

    public fun setValue(value: IHashAlgorithmProviderStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHashAlgorithmProviderStatics {
    public val __32813506_Ptr: Pointer?

    public val _32813506_VtblPtr: Pointer?
      get() = __32813506_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun OpenAlgorithm(algorithm: String?): HashAlgorithmProvider? {
      val fnPtr = _32813506_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HashAlgorithmProvider>()
      val hr = fn.invokeHR(arrayOf(__32813506_Ptr, marshalToNative(algorithm), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HashAlgorithmProvider>(result.getValue())
      return resultValue
    }
  }

  public class IHashAlgorithmProviderStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __32813506_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHashAlgorithmProviderStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9fac97415cc44336ae386212b75a915a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHashAlgorithmProviderStatics(ptr: Pointer?): WithDefault =
        IHashAlgorithmProviderStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHashAlgorithmProviderStatics {
      val address = segment.toRawLongValue()
      return makeIHashAlgorithmProviderStatics(Pointer(address))
    }

    public override fun toNative(obj: IHashAlgorithmProviderStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__32813506_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHashAlgorithmProviderStatics):
        Array<IHashAlgorithmProviderStatics?> = (elements as
        Array<IHashAlgorithmProviderStatics?>).castToImpl<IHashAlgorithmProviderStatics,IHashAlgorithmProviderStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHashAlgorithmProviderStatics?> =
        arrayOfNulls<IHashAlgorithmProviderStatics_Impl>(size) as
        Array<IHashAlgorithmProviderStatics?>
  }
}
