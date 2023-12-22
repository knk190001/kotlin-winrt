package Windows.UI.Xaml.Controls

import Windows.UI.Input.Inking.InkDrawingAttributes
import Windows.UI.Xaml.Media.Brush
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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IInkToolbarCustomPenOverrides.ABI::class)
@Signature("{9d22eb6c-1255-4256-b6bd-82c2fd273488}")
@Guid("9d22eb6c12554256b6bd82c2fd273488")
@WinRTInterface("9d22eb6c12554256b6bd82c2fd273488")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkToolbarCustomPenOverrides.ByReference::class)
public interface IInkToolbarCustomPenOverrides : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInkDrawingAttributesCore(brush: Brush?, strokeWidth: Double):
      InkDrawingAttributes?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkToolbarCustomPenOverrides> {
    public override fun getValue() = ABI.makeIInkToolbarCustomPenOverrides(pointer.getPointer(0))

    public fun setValue(value: IInkToolbarCustomPenOverrides_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkToolbarCustomPenOverrides {
    public val __843749680_Ptr: Pointer?

    public val _843749680_VtblPtr: Pointer?
      get() = __843749680_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInkDrawingAttributesCore(brush: Brush?, strokeWidth: Double):
        InkDrawingAttributes? {
      val fnPtr = _843749680_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InkDrawingAttributes>()
      val hr = fn.invokeHR(arrayOf(__843749680_Ptr, marshalToNative(brush), strokeWidth, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InkDrawingAttributes>(result.getValue())
      return resultValue
    }
  }

  public class IInkToolbarCustomPenOverrides_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __843749680_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkToolbarCustomPenOverrides, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9d22eb6c12554256b6bd82c2fd273488")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkToolbarCustomPenOverrides(ptr: Pointer?): WithDefault =
        IInkToolbarCustomPenOverrides_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkToolbarCustomPenOverrides {
      val address = segment.toRawLongValue()
      return makeIInkToolbarCustomPenOverrides(Pointer(address))
    }

    public override fun toNative(obj: IInkToolbarCustomPenOverrides): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__843749680_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkToolbarCustomPenOverrides):
        Array<IInkToolbarCustomPenOverrides?> = (elements as
        Array<IInkToolbarCustomPenOverrides?>).castToImpl<IInkToolbarCustomPenOverrides,IInkToolbarCustomPenOverrides_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkToolbarCustomPenOverrides?> =
        arrayOfNulls<IInkToolbarCustomPenOverrides_Impl>(size) as
        Array<IInkToolbarCustomPenOverrides?>
  }
}
