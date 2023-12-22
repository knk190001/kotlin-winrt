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

@ABIMarker(ISymmetricKeyAlgorithmProviderStatics.ABI::class)
@Signature("{8d3b2326-1f37-491f-b60e-f5431b26b483}")
@Guid("8d3b23261f37491fb60ef5431b26b483")
@WinRTInterface("8d3b23261f37491fb60ef5431b26b483")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISymmetricKeyAlgorithmProviderStatics.ByReference::class)
public interface ISymmetricKeyAlgorithmProviderStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun OpenAlgorithm(algorithm: String?): SymmetricKeyAlgorithmProvider?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISymmetricKeyAlgorithmProviderStatics> {
    public override fun getValue() =
        ABI.makeISymmetricKeyAlgorithmProviderStatics(pointer.getPointer(0))

    public fun setValue(value: ISymmetricKeyAlgorithmProviderStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISymmetricKeyAlgorithmProviderStatics {
    public val __1956693976_Ptr: Pointer?

    public val _1956693976_VtblPtr: Pointer?
      get() = __1956693976_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun OpenAlgorithm(algorithm: String?): SymmetricKeyAlgorithmProvider? {
      val fnPtr = _1956693976_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SymmetricKeyAlgorithmProvider>()
      val hr = fn.invokeHR(arrayOf(__1956693976_Ptr, marshalToNative(algorithm), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SymmetricKeyAlgorithmProvider>(result.getValue())
      return resultValue
    }
  }

  public class ISymmetricKeyAlgorithmProviderStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1956693976_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISymmetricKeyAlgorithmProviderStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8d3b23261f37491fb60ef5431b26b483")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISymmetricKeyAlgorithmProviderStatics(ptr: Pointer?): WithDefault =
        ISymmetricKeyAlgorithmProviderStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISymmetricKeyAlgorithmProviderStatics {
      val address = segment.toRawLongValue()
      return makeISymmetricKeyAlgorithmProviderStatics(Pointer(address))
    }

    public override fun toNative(obj: ISymmetricKeyAlgorithmProviderStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1956693976_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISymmetricKeyAlgorithmProviderStatics):
        Array<ISymmetricKeyAlgorithmProviderStatics?> = (elements as
        Array<ISymmetricKeyAlgorithmProviderStatics?>).castToImpl<ISymmetricKeyAlgorithmProviderStatics,ISymmetricKeyAlgorithmProviderStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISymmetricKeyAlgorithmProviderStatics?> =
        arrayOfNulls<ISymmetricKeyAlgorithmProviderStatics_Impl>(size) as
        Array<ISymmetricKeyAlgorithmProviderStatics?>
  }
}
