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

@ABIMarker(IInputPreTranslateKeyboardSource.ABI::class)
@Signature("{2f327feb-b7e7-5e37-a0cc-37dcabe76588}")
@Guid("2f327febb7e75e37a0cc37dcabe76588")
@WinRTInterface("2f327febb7e75e37a0cc37dcabe76588")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInputPreTranslateKeyboardSource.ByReference::class)
public interface IInputPreTranslateKeyboardSource : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInputPreTranslateKeyboardSource> {
    public override fun getValue() = ABI.makeIInputPreTranslateKeyboardSource(pointer.getPointer(0))

    public fun setValue(value: IInputPreTranslateKeyboardSource_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInputPreTranslateKeyboardSource {
    public val __1825692798_Ptr: Pointer?

    public val _1825692798_VtblPtr: Pointer?
      get() = __1825692798_Ptr?.getPointer(0)
  }

  public class IInputPreTranslateKeyboardSource_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1825692798_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInputPreTranslateKeyboardSource, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2f327febb7e75e37a0cc37dcabe76588")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInputPreTranslateKeyboardSource(ptr: Pointer?): WithDefault =
        IInputPreTranslateKeyboardSource_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInputPreTranslateKeyboardSource {
      val address = segment.toRawLongValue()
      return makeIInputPreTranslateKeyboardSource(Pointer(address))
    }

    public override fun toNative(obj: IInputPreTranslateKeyboardSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1825692798_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInputPreTranslateKeyboardSource):
        Array<IInputPreTranslateKeyboardSource?> = (elements as
        Array<IInputPreTranslateKeyboardSource?>).castToImpl<IInputPreTranslateKeyboardSource,IInputPreTranslateKeyboardSource_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInputPreTranslateKeyboardSource?> =
        arrayOfNulls<IInputPreTranslateKeyboardSource_Impl>(size) as
        Array<IInputPreTranslateKeyboardSource?>
  }
}
