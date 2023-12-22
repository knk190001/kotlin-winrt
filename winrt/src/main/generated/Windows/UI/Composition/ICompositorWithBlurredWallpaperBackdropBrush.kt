package Windows.UI.Composition

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

@ABIMarker(ICompositorWithBlurredWallpaperBackdropBrush.ABI::class)
@Signature("{0d8fb190-f122-5b8d-9fdd-543b0d8eb7f3}")
@Guid("0d8fb190f1225b8d9fdd543b0d8eb7f3")
@WinRTInterface("0d8fb190f1225b8d9fdd543b0d8eb7f3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositorWithBlurredWallpaperBackdropBrush.ByReference::class)
public interface ICompositorWithBlurredWallpaperBackdropBrush : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun TryCreateBlurredWallpaperBackdropBrush(): CompositionBackdropBrush?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositorWithBlurredWallpaperBackdropBrush> {
    public override fun getValue() =
        ABI.makeICompositorWithBlurredWallpaperBackdropBrush(pointer.getPointer(0))

    public fun setValue(value: ICompositorWithBlurredWallpaperBackdropBrush_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositorWithBlurredWallpaperBackdropBrush {
    public val __1500063095_Ptr: Pointer?

    public val _1500063095_VtblPtr: Pointer?
      get() = __1500063095_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun TryCreateBlurredWallpaperBackdropBrush(): CompositionBackdropBrush? {
      val fnPtr = _1500063095_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionBackdropBrush>()
      val hr = fn.invokeHR(arrayOf(__1500063095_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionBackdropBrush>(result.getValue())
      return resultValue
    }
  }

  public class ICompositorWithBlurredWallpaperBackdropBrush_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1500063095_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositorWithBlurredWallpaperBackdropBrush, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0d8fb190f1225b8d9fdd543b0d8eb7f3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositorWithBlurredWallpaperBackdropBrush(ptr: Pointer?): WithDefault =
        ICompositorWithBlurredWallpaperBackdropBrush_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ICompositorWithBlurredWallpaperBackdropBrush {
      val address = segment.toRawLongValue()
      return makeICompositorWithBlurredWallpaperBackdropBrush(Pointer(address))
    }

    public override fun toNative(obj: ICompositorWithBlurredWallpaperBackdropBrush): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1500063095_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositorWithBlurredWallpaperBackdropBrush):
        Array<ICompositorWithBlurredWallpaperBackdropBrush?> = (elements as
        Array<ICompositorWithBlurredWallpaperBackdropBrush?>).castToImpl<ICompositorWithBlurredWallpaperBackdropBrush,ICompositorWithBlurredWallpaperBackdropBrush_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositorWithBlurredWallpaperBackdropBrush?> =
        arrayOfNulls<ICompositorWithBlurredWallpaperBackdropBrush_Impl>(size) as
        Array<ICompositorWithBlurredWallpaperBackdropBrush?>
  }
}
