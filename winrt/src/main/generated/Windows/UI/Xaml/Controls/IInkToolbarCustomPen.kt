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

@ABIMarker(IInkToolbarCustomPen.ABI::class)
@Signature("{4082207b-2f3d-4e6a-8c27-fe61ef7e70eb}")
@Guid("4082207b2f3d4e6a8c27fe61ef7e70eb")
@WinRTInterface("4082207b2f3d4e6a8c27fe61ef7e70eb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkToolbarCustomPen.ByReference::class)
public interface IInkToolbarCustomPen : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInkDrawingAttributes(brush: Brush?, strokeWidth: Double): InkDrawingAttributes?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkToolbarCustomPen> {
    public override fun getValue() = ABI.makeIInkToolbarCustomPen(pointer.getPointer(0))

    public fun setValue(value: IInkToolbarCustomPen_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkToolbarCustomPen {
    public val __27303657_Ptr: Pointer?

    public val _27303657_VtblPtr: Pointer?
      get() = __27303657_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInkDrawingAttributes(brush: Brush?, strokeWidth: Double):
        InkDrawingAttributes? {
      val fnPtr = _27303657_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InkDrawingAttributes>()
      val hr = fn.invokeHR(arrayOf(__27303657_Ptr, marshalToNative(brush), strokeWidth, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InkDrawingAttributes>(result.getValue())
      return resultValue
    }
  }

  public class IInkToolbarCustomPen_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __27303657_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkToolbarCustomPen, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4082207b2f3d4e6a8c27fe61ef7e70eb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkToolbarCustomPen(ptr: Pointer?): WithDefault = IInkToolbarCustomPen_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkToolbarCustomPen {
      val address = segment.toRawLongValue()
      return makeIInkToolbarCustomPen(Pointer(address))
    }

    public override fun toNative(obj: IInkToolbarCustomPen): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__27303657_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkToolbarCustomPen): Array<IInkToolbarCustomPen?> =
        (elements as
        Array<IInkToolbarCustomPen?>).castToImpl<IInkToolbarCustomPen,IInkToolbarCustomPen_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkToolbarCustomPen?> =
        arrayOfNulls<IInkToolbarCustomPen_Impl>(size) as Array<IInkToolbarCustomPen?>
  }
}
