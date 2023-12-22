package Windows.UI.Composition.Interactions

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
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
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICompositionInteractionSource.ABI::class)
@Signature("{043b2431-06e3-495a-ba54-409f0017fac0}")
@Guid("043b243106e3495aba54409f0017fac0")
@WinRTInterface("043b243106e3495aba54409f0017fac0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionInteractionSource.ByReference::class)
public interface ICompositionInteractionSource : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionInteractionSource> {
    public override fun getValue() = ABI.makeICompositionInteractionSource(pointer.getPointer(0))

    public fun setValue(value: ICompositionInteractionSource_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionInteractionSource {
    public val __1138000392_Ptr: Pointer?

    public val _1138000392_VtblPtr: Pointer?
      get() = __1138000392_Ptr?.getPointer(0)
  }

  public class ICompositionInteractionSource_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1138000392_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionInteractionSource, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("043b243106e3495aba54409f0017fac0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionInteractionSource(ptr: Pointer?): WithDefault =
        ICompositionInteractionSource_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionInteractionSource {
      val address = segment.toRawLongValue()
      return makeICompositionInteractionSource(Pointer(address))
    }

    public override fun toNative(obj: ICompositionInteractionSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1138000392_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionInteractionSource):
        Array<ICompositionInteractionSource?> = (elements as
        Array<ICompositionInteractionSource?>).castToImpl<ICompositionInteractionSource,ICompositionInteractionSource_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionInteractionSource?> =
        arrayOfNulls<ICompositionInteractionSource_Impl>(size) as
        Array<ICompositionInteractionSource?>
  }
}
