package Microsoft.UI.Xaml.Media.Animation

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

@ABIMarker(IAddDeleteThemeTransition.ABI::class)
@Signature("{3728595e-0ea2-524b-9348-86cfb860a0ff}")
@Guid("3728595e0ea2524b934886cfb860a0ff")
@WinRTInterface("3728595e0ea2524b934886cfb860a0ff")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAddDeleteThemeTransition.ByReference::class)
public interface IAddDeleteThemeTransition : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAddDeleteThemeTransition> {
    public override fun getValue() = ABI.makeIAddDeleteThemeTransition(pointer.getPointer(0))

    public fun setValue(value: IAddDeleteThemeTransition_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAddDeleteThemeTransition {
    public val __1015447123_Ptr: Pointer?

    public val _1015447123_VtblPtr: Pointer?
      get() = __1015447123_Ptr?.getPointer(0)
  }

  public class IAddDeleteThemeTransition_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1015447123_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAddDeleteThemeTransition, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3728595e0ea2524b934886cfb860a0ff")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAddDeleteThemeTransition(ptr: Pointer?): WithDefault =
        IAddDeleteThemeTransition_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAddDeleteThemeTransition {
      val address = segment.toRawLongValue()
      return makeIAddDeleteThemeTransition(Pointer(address))
    }

    public override fun toNative(obj: IAddDeleteThemeTransition): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1015447123_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAddDeleteThemeTransition):
        Array<IAddDeleteThemeTransition?> = (elements as
        Array<IAddDeleteThemeTransition?>).castToImpl<IAddDeleteThemeTransition,IAddDeleteThemeTransition_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAddDeleteThemeTransition?> =
        arrayOfNulls<IAddDeleteThemeTransition_Impl>(size) as Array<IAddDeleteThemeTransition?>
  }
}
