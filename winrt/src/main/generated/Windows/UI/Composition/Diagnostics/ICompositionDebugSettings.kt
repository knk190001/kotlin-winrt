package Windows.UI.Composition.Diagnostics

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

@ABIMarker(ICompositionDebugSettings.ABI::class)
@Signature("{2831987e-1d82-4d38-b7b7-efd11c7bc3d1}")
@Guid("2831987e1d824d38b7b7efd11c7bc3d1")
@WinRTInterface("2831987e1d824d38b7b7efd11c7bc3d1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionDebugSettings.ByReference::class)
public interface ICompositionDebugSettings : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_HeatMaps(): CompositionDebugHeatMaps?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionDebugSettings> {
    public override fun getValue() = ABI.makeICompositionDebugSettings(pointer.getPointer(0))

    public fun setValue(value: ICompositionDebugSettings_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionDebugSettings {
    public val __1404980900_Ptr: Pointer?

    public val _1404980900_VtblPtr: Pointer?
      get() = __1404980900_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_HeatMaps(): CompositionDebugHeatMaps? {
      val fnPtr = _1404980900_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionDebugHeatMaps>()
      val hr = fn.invokeHR(arrayOf(__1404980900_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionDebugHeatMaps>(result.getValue())
      return resultValue
    }
  }

  public class ICompositionDebugSettings_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1404980900_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionDebugSettings, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2831987e1d824d38b7b7efd11c7bc3d1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionDebugSettings(ptr: Pointer?): WithDefault =
        ICompositionDebugSettings_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionDebugSettings {
      val address = segment.toRawLongValue()
      return makeICompositionDebugSettings(Pointer(address))
    }

    public override fun toNative(obj: ICompositionDebugSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1404980900_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionDebugSettings):
        Array<ICompositionDebugSettings?> = (elements as
        Array<ICompositionDebugSettings?>).castToImpl<ICompositionDebugSettings,ICompositionDebugSettings_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionDebugSettings?> =
        arrayOfNulls<ICompositionDebugSettings_Impl>(size) as Array<ICompositionDebugSettings?>
  }
}
