package Microsoft.UI.Input

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

@ABIMarker(IInputKeyboardSource.ABI::class)
@Signature("{ed61b906-16ad-5df7-a550-5e6f7d2229f7}")
@Guid("ed61b90616ad5df7a5505e6f7d2229f7")
@WinRTInterface("ed61b90616ad5df7a5505e6f7d2229f7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInputKeyboardSource.ByReference::class)
public interface IInputKeyboardSource : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInputKeyboardSource> {
    public override fun getValue() = ABI.makeIInputKeyboardSource(pointer.getPointer(0))

    public fun setValue(value: IInputKeyboardSource_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInputKeyboardSource {
    public val __1135711027_Ptr: Pointer?

    public val _1135711027_VtblPtr: Pointer?
      get() = __1135711027_Ptr?.getPointer(0)
  }

  public class IInputKeyboardSource_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1135711027_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInputKeyboardSource, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ed61b90616ad5df7a5505e6f7d2229f7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInputKeyboardSource(ptr: Pointer?): WithDefault = IInputKeyboardSource_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInputKeyboardSource {
      val address = segment.toRawLongValue()
      return makeIInputKeyboardSource(Pointer(address))
    }

    public override fun toNative(obj: IInputKeyboardSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1135711027_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInputKeyboardSource): Array<IInputKeyboardSource?> =
        (elements as
        Array<IInputKeyboardSource?>).castToImpl<IInputKeyboardSource,IInputKeyboardSource_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInputKeyboardSource?> =
        arrayOfNulls<IInputKeyboardSource_Impl>(size) as Array<IInputKeyboardSource?>
  }
}
