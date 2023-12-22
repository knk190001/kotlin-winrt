package Microsoft.UI.Content

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

@ABIMarker(IContentAppWindowBridge.ABI::class)
@Signature("{a17d6b39-5b52-5974-88e5-60cde3967b5e}")
@Guid("a17d6b395b52597488e560cde3967b5e")
@WinRTInterface("a17d6b395b52597488e560cde3967b5e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContentAppWindowBridge.ByReference::class)
public interface IContentAppWindowBridge : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContentAppWindowBridge> {
    public override fun getValue() = ABI.makeIContentAppWindowBridge(pointer.getPointer(0))

    public fun setValue(value: IContentAppWindowBridge_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContentAppWindowBridge {
    public val __1228048565_Ptr: Pointer?

    public val _1228048565_VtblPtr: Pointer?
      get() = __1228048565_Ptr?.getPointer(0)
  }

  public class IContentAppWindowBridge_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1228048565_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContentAppWindowBridge, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a17d6b395b52597488e560cde3967b5e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContentAppWindowBridge(ptr: Pointer?): WithDefault =
        IContentAppWindowBridge_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContentAppWindowBridge {
      val address = segment.toRawLongValue()
      return makeIContentAppWindowBridge(Pointer(address))
    }

    public override fun toNative(obj: IContentAppWindowBridge): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1228048565_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContentAppWindowBridge): Array<IContentAppWindowBridge?>
        = (elements as
        Array<IContentAppWindowBridge?>).castToImpl<IContentAppWindowBridge,IContentAppWindowBridge_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContentAppWindowBridge?> =
        arrayOfNulls<IContentAppWindowBridge_Impl>(size) as Array<IContentAppWindowBridge?>
  }
}
