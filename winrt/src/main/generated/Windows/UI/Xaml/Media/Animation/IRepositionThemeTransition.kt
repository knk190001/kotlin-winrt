package Windows.UI.Xaml.Media.Animation

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

@ABIMarker(IRepositionThemeTransition.ABI::class)
@Signature("{88329b82-98f3-455a-ac53-2e7083b6e22c}")
@Guid("88329b8298f3455aac532e7083b6e22c")
@WinRTInterface("88329b8298f3455aac532e7083b6e22c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRepositionThemeTransition.ByReference::class)
public interface IRepositionThemeTransition : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRepositionThemeTransition> {
    public override fun getValue() = ABI.makeIRepositionThemeTransition(pointer.getPointer(0))

    public fun setValue(value: IRepositionThemeTransition_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRepositionThemeTransition {
    public val __519113540_Ptr: Pointer?

    public val _519113540_VtblPtr: Pointer?
      get() = __519113540_Ptr?.getPointer(0)
  }

  public class IRepositionThemeTransition_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __519113540_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRepositionThemeTransition, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("88329b8298f3455aac532e7083b6e22c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRepositionThemeTransition(ptr: Pointer?): WithDefault =
        IRepositionThemeTransition_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRepositionThemeTransition {
      val address = segment.toRawLongValue()
      return makeIRepositionThemeTransition(Pointer(address))
    }

    public override fun toNative(obj: IRepositionThemeTransition): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__519113540_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRepositionThemeTransition):
        Array<IRepositionThemeTransition?> = (elements as
        Array<IRepositionThemeTransition?>).castToImpl<IRepositionThemeTransition,IRepositionThemeTransition_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRepositionThemeTransition?> =
        arrayOfNulls<IRepositionThemeTransition_Impl>(size) as Array<IRepositionThemeTransition?>
  }
}
