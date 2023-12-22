package Windows.UI.Composition

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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICompositionCapabilitiesStatics.ABI::class)
@Signature("{f7b7a86e-6416-49e5-8ddf-afe949e20562}")
@Guid("f7b7a86e641649e58ddfafe949e20562")
@WinRTInterface("f7b7a86e641649e58ddfafe949e20562")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionCapabilitiesStatics.ByReference::class)
public interface ICompositionCapabilitiesStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetForCurrentView(): CompositionCapabilities?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionCapabilitiesStatics> {
    public override fun getValue() = ABI.makeICompositionCapabilitiesStatics(pointer.getPointer(0))

    public fun setValue(value: ICompositionCapabilitiesStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionCapabilitiesStatics {
    public val __677629011_Ptr: Pointer?

    public val _677629011_VtblPtr: Pointer?
      get() = __677629011_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetForCurrentView(): CompositionCapabilities? {
      val fnPtr = _677629011_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionCapabilities>()
      val hr = fn.invokeHR(arrayOf(__677629011_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionCapabilities>(result.getValue())
      return resultValue
    }
  }

  public class ICompositionCapabilitiesStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __677629011_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionCapabilitiesStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f7b7a86e641649e58ddfafe949e20562")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionCapabilitiesStatics(ptr: Pointer?): WithDefault =
        ICompositionCapabilitiesStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionCapabilitiesStatics {
      val address = segment.toRawLongValue()
      return makeICompositionCapabilitiesStatics(Pointer(address))
    }

    public override fun toNative(obj: ICompositionCapabilitiesStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__677629011_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionCapabilitiesStatics):
        Array<ICompositionCapabilitiesStatics?> = (elements as
        Array<ICompositionCapabilitiesStatics?>).castToImpl<ICompositionCapabilitiesStatics,ICompositionCapabilitiesStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionCapabilitiesStatics?> =
        arrayOfNulls<ICompositionCapabilitiesStatics_Impl>(size) as
        Array<ICompositionCapabilitiesStatics?>
  }
}
