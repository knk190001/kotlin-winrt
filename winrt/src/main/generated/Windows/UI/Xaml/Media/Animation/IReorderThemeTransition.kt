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

@ABIMarker(IReorderThemeTransition.ABI::class)
@Signature("{f2065c6c-d052-4ad1-8362-b71b36df7497}")
@Guid("f2065c6cd0524ad18362b71b36df7497")
@WinRTInterface("f2065c6cd0524ad18362b71b36df7497")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IReorderThemeTransition.ByReference::class)
public interface IReorderThemeTransition : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IReorderThemeTransition> {
    public override fun getValue() = ABI.makeIReorderThemeTransition(pointer.getPointer(0))

    public fun setValue(value: IReorderThemeTransition_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IReorderThemeTransition {
    public val __1317300471_Ptr: Pointer?

    public val _1317300471_VtblPtr: Pointer?
      get() = __1317300471_Ptr?.getPointer(0)
  }

  public class IReorderThemeTransition_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1317300471_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IReorderThemeTransition, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f2065c6cd0524ad18362b71b36df7497")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIReorderThemeTransition(ptr: Pointer?): WithDefault =
        IReorderThemeTransition_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IReorderThemeTransition {
      val address = segment.toRawLongValue()
      return makeIReorderThemeTransition(Pointer(address))
    }

    public override fun toNative(obj: IReorderThemeTransition): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1317300471_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IReorderThemeTransition): Array<IReorderThemeTransition?>
        = (elements as
        Array<IReorderThemeTransition?>).castToImpl<IReorderThemeTransition,IReorderThemeTransition_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IReorderThemeTransition?> =
        arrayOfNulls<IReorderThemeTransition_Impl>(size) as Array<IReorderThemeTransition?>
  }
}
