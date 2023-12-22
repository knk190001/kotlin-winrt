package Windows.UI.Xaml.Documents

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

@ABIMarker(ITextHighlighterBaseFactory.ABI::class)
@Signature("{9592b2d0-eadc-4c74-92c8-6e896e22506d}")
@Guid("9592b2d0eadc4c7492c86e896e22506d")
@WinRTInterface("9592b2d0eadc4c7492c86e896e22506d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITextHighlighterBaseFactory.ByReference::class)
public interface ITextHighlighterBaseFactory : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITextHighlighterBaseFactory> {
    public override fun getValue() = ABI.makeITextHighlighterBaseFactory(pointer.getPointer(0))

    public fun setValue(value: ITextHighlighterBaseFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITextHighlighterBaseFactory {
    public val __507752333_Ptr: Pointer?

    public val _507752333_VtblPtr: Pointer?
      get() = __507752333_Ptr?.getPointer(0)
  }

  public class ITextHighlighterBaseFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __507752333_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITextHighlighterBaseFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9592b2d0eadc4c7492c86e896e22506d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITextHighlighterBaseFactory(ptr: Pointer?): WithDefault =
        ITextHighlighterBaseFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITextHighlighterBaseFactory {
      val address = segment.toRawLongValue()
      return makeITextHighlighterBaseFactory(Pointer(address))
    }

    public override fun toNative(obj: ITextHighlighterBaseFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__507752333_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITextHighlighterBaseFactory):
        Array<ITextHighlighterBaseFactory?> = (elements as
        Array<ITextHighlighterBaseFactory?>).castToImpl<ITextHighlighterBaseFactory,ITextHighlighterBaseFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextHighlighterBaseFactory?> =
        arrayOfNulls<ITextHighlighterBaseFactory_Impl>(size) as Array<ITextHighlighterBaseFactory?>
  }
}
