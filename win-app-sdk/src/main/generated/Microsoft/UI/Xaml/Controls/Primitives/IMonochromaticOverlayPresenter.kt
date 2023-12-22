package Microsoft.UI.Xaml.Controls.Primitives

import Microsoft.UI.Xaml.UIElement
import Windows.UI.Color
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

@ABIMarker(IMonochromaticOverlayPresenter.ABI::class)
@Signature("{3f0d1e92-5450-5078-8f72-5ac1749976e3}")
@Guid("3f0d1e92545050788f725ac1749976e3")
@WinRTInterface("3f0d1e92545050788f725ac1749976e3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMonochromaticOverlayPresenter.ByReference::class)
public interface IMonochromaticOverlayPresenter : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SourceElement(): UIElement?

  @InterfaceMethod(1)
  public fun put_SourceElement(value: UIElement?): Unit

  @InterfaceMethod(2)
  public fun get_ReplacementColor(): Color?

  @InterfaceMethod(3)
  public fun put_ReplacementColor(value: Color?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMonochromaticOverlayPresenter> {
    public override fun getValue() = ABI.makeIMonochromaticOverlayPresenter(pointer.getPointer(0))

    public fun setValue(value: IMonochromaticOverlayPresenter_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMonochromaticOverlayPresenter {
    public val __1505736316_Ptr: Pointer?

    public val _1505736316_VtblPtr: Pointer?
      get() = __1505736316_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SourceElement(): UIElement? {
      val fnPtr = _1505736316_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIElement>()
      val hr = fn.invokeHR(arrayOf(__1505736316_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_SourceElement(value: UIElement?): Unit {
      val fnPtr = _1505736316_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1505736316_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_ReplacementColor(): Color? {
      val fnPtr = _1505736316_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Color>()
      val hr = fn.invokeHR(arrayOf(__1505736316_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Color>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_ReplacementColor(value: Color?): Unit {
      val fnPtr = _1505736316_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1505736316_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMonochromaticOverlayPresenter_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1505736316_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMonochromaticOverlayPresenter, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3f0d1e92545050788f725ac1749976e3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMonochromaticOverlayPresenter(ptr: Pointer?): WithDefault =
        IMonochromaticOverlayPresenter_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMonochromaticOverlayPresenter {
      val address = segment.toRawLongValue()
      return makeIMonochromaticOverlayPresenter(Pointer(address))
    }

    public override fun toNative(obj: IMonochromaticOverlayPresenter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1505736316_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMonochromaticOverlayPresenter):
        Array<IMonochromaticOverlayPresenter?> = (elements as
        Array<IMonochromaticOverlayPresenter?>).castToImpl<IMonochromaticOverlayPresenter,IMonochromaticOverlayPresenter_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMonochromaticOverlayPresenter?> =
        arrayOfNulls<IMonochromaticOverlayPresenter_Impl>(size) as
        Array<IMonochromaticOverlayPresenter?>
  }
}
