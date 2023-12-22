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

@ABIMarker(IMacAlgorithmProviderStatics.ABI::class)
@Signature("{c9bdc147-cc77-4df0-9e4e-b921e080644c}")
@Guid("c9bdc147cc774df09e4eb921e080644c")
@WinRTInterface("c9bdc147cc774df09e4eb921e080644c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMacAlgorithmProviderStatics.ByReference::class)
public interface IMacAlgorithmProviderStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun OpenAlgorithm(algorithm: String?): MacAlgorithmProvider?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMacAlgorithmProviderStatics> {
    public override fun getValue() = ABI.makeIMacAlgorithmProviderStatics(pointer.getPointer(0))

    public fun setValue(value: IMacAlgorithmProviderStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMacAlgorithmProviderStatics {
    public val __178298953_Ptr: Pointer?

    public val _178298953_VtblPtr: Pointer?
      get() = __178298953_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun OpenAlgorithm(algorithm: String?): MacAlgorithmProvider? {
      val fnPtr = _178298953_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MacAlgorithmProvider>()
      val hr = fn.invokeHR(arrayOf(__178298953_Ptr, marshalToNative(algorithm), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MacAlgorithmProvider>(result.getValue())
      return resultValue
    }
  }

  public class IMacAlgorithmProviderStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __178298953_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMacAlgorithmProviderStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c9bdc147cc774df09e4eb921e080644c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMacAlgorithmProviderStatics(ptr: Pointer?): WithDefault =
        IMacAlgorithmProviderStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMacAlgorithmProviderStatics {
      val address = segment.toRawLongValue()
      return makeIMacAlgorithmProviderStatics(Pointer(address))
    }

    public override fun toNative(obj: IMacAlgorithmProviderStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__178298953_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMacAlgorithmProviderStatics):
        Array<IMacAlgorithmProviderStatics?> = (elements as
        Array<IMacAlgorithmProviderStatics?>).castToImpl<IMacAlgorithmProviderStatics,IMacAlgorithmProviderStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMacAlgorithmProviderStatics?> =
        arrayOfNulls<IMacAlgorithmProviderStatics_Impl>(size) as
        Array<IMacAlgorithmProviderStatics?>
  }
}
