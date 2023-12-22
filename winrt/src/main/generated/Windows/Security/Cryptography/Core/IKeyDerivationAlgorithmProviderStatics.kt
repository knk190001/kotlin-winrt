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

@ABIMarker(IKeyDerivationAlgorithmProviderStatics.ABI::class)
@Signature("{0a22097a-0a1c-443b-9418-b9498aeb1603}")
@Guid("0a22097a0a1c443b9418b9498aeb1603")
@WinRTInterface("0a22097a0a1c443b9418b9498aeb1603")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IKeyDerivationAlgorithmProviderStatics.ByReference::class)
public interface IKeyDerivationAlgorithmProviderStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun OpenAlgorithm(algorithm: String?): KeyDerivationAlgorithmProvider?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IKeyDerivationAlgorithmProviderStatics> {
    public override fun getValue() =
        ABI.makeIKeyDerivationAlgorithmProviderStatics(pointer.getPointer(0))

    public fun setValue(value: IKeyDerivationAlgorithmProviderStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IKeyDerivationAlgorithmProviderStatics {
    public val __661389360_Ptr: Pointer?

    public val _661389360_VtblPtr: Pointer?
      get() = __661389360_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun OpenAlgorithm(algorithm: String?): KeyDerivationAlgorithmProvider? {
      val fnPtr = _661389360_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<KeyDerivationAlgorithmProvider>()
      val hr = fn.invokeHR(arrayOf(__661389360_Ptr, marshalToNative(algorithm), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<KeyDerivationAlgorithmProvider>(result.getValue())
      return resultValue
    }
  }

  public class IKeyDerivationAlgorithmProviderStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __661389360_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IKeyDerivationAlgorithmProviderStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0a22097a0a1c443b9418b9498aeb1603")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIKeyDerivationAlgorithmProviderStatics(ptr: Pointer?): WithDefault =
        IKeyDerivationAlgorithmProviderStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IKeyDerivationAlgorithmProviderStatics {
      val address = segment.toRawLongValue()
      return makeIKeyDerivationAlgorithmProviderStatics(Pointer(address))
    }

    public override fun toNative(obj: IKeyDerivationAlgorithmProviderStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__661389360_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IKeyDerivationAlgorithmProviderStatics):
        Array<IKeyDerivationAlgorithmProviderStatics?> = (elements as
        Array<IKeyDerivationAlgorithmProviderStatics?>).castToImpl<IKeyDerivationAlgorithmProviderStatics,IKeyDerivationAlgorithmProviderStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IKeyDerivationAlgorithmProviderStatics?> =
        arrayOfNulls<IKeyDerivationAlgorithmProviderStatics_Impl>(size) as
        Array<IKeyDerivationAlgorithmProviderStatics?>
  }
}
