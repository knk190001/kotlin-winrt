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

@ABIMarker(IAsymmetricKeyAlgorithmProviderStatics.ABI::class)
@Signature("{425bde18-a7f3-47a6-a8d2-c48d6033a65c}")
@Guid("425bde18a7f347a6a8d2c48d6033a65c")
@WinRTInterface("425bde18a7f347a6a8d2c48d6033a65c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAsymmetricKeyAlgorithmProviderStatics.ByReference::class)
public interface IAsymmetricKeyAlgorithmProviderStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun OpenAlgorithm(algorithm: String?): AsymmetricKeyAlgorithmProvider?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAsymmetricKeyAlgorithmProviderStatics> {
    public override fun getValue() =
        ABI.makeIAsymmetricKeyAlgorithmProviderStatics(pointer.getPointer(0))

    public fun setValue(value: IAsymmetricKeyAlgorithmProviderStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAsymmetricKeyAlgorithmProviderStatics {
    public val __1598715581_Ptr: Pointer?

    public val _1598715581_VtblPtr: Pointer?
      get() = __1598715581_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun OpenAlgorithm(algorithm: String?): AsymmetricKeyAlgorithmProvider? {
      val fnPtr = _1598715581_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AsymmetricKeyAlgorithmProvider>()
      val hr = fn.invokeHR(arrayOf(__1598715581_Ptr, marshalToNative(algorithm), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AsymmetricKeyAlgorithmProvider>(result.getValue())
      return resultValue
    }
  }

  public class IAsymmetricKeyAlgorithmProviderStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1598715581_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAsymmetricKeyAlgorithmProviderStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("425bde18a7f347a6a8d2c48d6033a65c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAsymmetricKeyAlgorithmProviderStatics(ptr: Pointer?): WithDefault =
        IAsymmetricKeyAlgorithmProviderStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAsymmetricKeyAlgorithmProviderStatics {
      val address = segment.toRawLongValue()
      return makeIAsymmetricKeyAlgorithmProviderStatics(Pointer(address))
    }

    public override fun toNative(obj: IAsymmetricKeyAlgorithmProviderStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1598715581_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAsymmetricKeyAlgorithmProviderStatics):
        Array<IAsymmetricKeyAlgorithmProviderStatics?> = (elements as
        Array<IAsymmetricKeyAlgorithmProviderStatics?>).castToImpl<IAsymmetricKeyAlgorithmProviderStatics,IAsymmetricKeyAlgorithmProviderStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAsymmetricKeyAlgorithmProviderStatics?> =
        arrayOfNulls<IAsymmetricKeyAlgorithmProviderStatics_Impl>(size) as
        Array<IAsymmetricKeyAlgorithmProviderStatics?>
  }
}
