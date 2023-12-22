package Microsoft.UI.Xaml.Media.Animation

import Microsoft.UI.Xaml.DependencyProperty
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

@ABIMarker(IDropTargetItemThemeAnimationStatics.ABI::class)
@Signature("{a0ce9e16-ae12-55fc-a9e5-29dc94a713bd}")
@Guid("a0ce9e16ae1255fca9e529dc94a713bd")
@WinRTInterface("a0ce9e16ae1255fca9e529dc94a713bd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDropTargetItemThemeAnimationStatics.ByReference::class)
public interface IDropTargetItemThemeAnimationStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TargetNameProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDropTargetItemThemeAnimationStatics> {
    public override fun getValue() =
        ABI.makeIDropTargetItemThemeAnimationStatics(pointer.getPointer(0))

    public fun setValue(value: IDropTargetItemThemeAnimationStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDropTargetItemThemeAnimationStatics {
    public val __661873444_Ptr: Pointer?

    public val _661873444_VtblPtr: Pointer?
      get() = __661873444_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TargetNameProperty(): DependencyProperty? {
      val fnPtr = _661873444_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__661873444_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IDropTargetItemThemeAnimationStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __661873444_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDropTargetItemThemeAnimationStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a0ce9e16ae1255fca9e529dc94a713bd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDropTargetItemThemeAnimationStatics(ptr: Pointer?): WithDefault =
        IDropTargetItemThemeAnimationStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDropTargetItemThemeAnimationStatics {
      val address = segment.toRawLongValue()
      return makeIDropTargetItemThemeAnimationStatics(Pointer(address))
    }

    public override fun toNative(obj: IDropTargetItemThemeAnimationStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__661873444_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDropTargetItemThemeAnimationStatics):
        Array<IDropTargetItemThemeAnimationStatics?> = (elements as
        Array<IDropTargetItemThemeAnimationStatics?>).castToImpl<IDropTargetItemThemeAnimationStatics,IDropTargetItemThemeAnimationStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDropTargetItemThemeAnimationStatics?> =
        arrayOfNulls<IDropTargetItemThemeAnimationStatics_Impl>(size) as
        Array<IDropTargetItemThemeAnimationStatics?>
  }
}
