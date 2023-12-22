package Windows.UI.Xaml

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

@ABIMarker(IElementSoundPlayer.ABI::class)
@Signature("{387773a5-f036-460c-9b81-f3d6ea43f6f2}")
@Guid("387773a5f036460c9b81f3d6ea43f6f2")
@WinRTInterface("387773a5f036460c9b81f3d6ea43f6f2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IElementSoundPlayer.ByReference::class)
public interface IElementSoundPlayer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IElementSoundPlayer> {
    public override fun getValue() = ABI.makeIElementSoundPlayer(pointer.getPointer(0))

    public fun setValue(value: IElementSoundPlayer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IElementSoundPlayer {
    public val __36647430_Ptr: Pointer?

    public val _36647430_VtblPtr: Pointer?
      get() = __36647430_Ptr?.getPointer(0)
  }

  public class IElementSoundPlayer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __36647430_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IElementSoundPlayer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("387773a5f036460c9b81f3d6ea43f6f2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIElementSoundPlayer(ptr: Pointer?): WithDefault = IElementSoundPlayer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IElementSoundPlayer {
      val address = segment.toRawLongValue()
      return makeIElementSoundPlayer(Pointer(address))
    }

    public override fun toNative(obj: IElementSoundPlayer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__36647430_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IElementSoundPlayer): Array<IElementSoundPlayer?> =
        (elements as
        Array<IElementSoundPlayer?>).castToImpl<IElementSoundPlayer,IElementSoundPlayer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IElementSoundPlayer?> =
        arrayOfNulls<IElementSoundPlayer_Impl>(size) as Array<IElementSoundPlayer?>
  }
}
