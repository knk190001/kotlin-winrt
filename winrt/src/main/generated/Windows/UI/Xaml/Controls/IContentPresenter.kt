package Windows.UI.Xaml.Controls

import Windows.UI.Text.FontStretch
import Windows.UI.Text.FontStyle
import Windows.UI.Text.FontWeight
import Windows.UI.Xaml.DataTemplate
import Windows.UI.Xaml.Media.Animation.TransitionCollection
import Windows.UI.Xaml.Media.Brush
import Windows.UI.Xaml.Media.FontFamily
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IContentPresenter.ABI::class)
@Signature("{79fde5b4-cd37-491c-8845-daf472defff6}")
@Guid("79fde5b4cd37491c8845daf472defff6")
@WinRTInterface("79fde5b4cd37491c8845daf472defff6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContentPresenter.ByReference::class)
public interface IContentPresenter : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Content(): IUnknown?

  @InterfaceMethod(1)
  public fun put_Content(value: IUnknown?): Unit

  @InterfaceMethod(2)
  public fun get_ContentTemplate(): DataTemplate?

  @InterfaceMethod(3)
  public fun put_ContentTemplate(value: DataTemplate?): Unit

  @InterfaceMethod(4)
  public fun get_ContentTemplateSelector(): DataTemplateSelector?

  @InterfaceMethod(5)
  public fun put_ContentTemplateSelector(value: DataTemplateSelector?): Unit

  @InterfaceMethod(6)
  public fun get_ContentTransitions(): TransitionCollection?

  @InterfaceMethod(7)
  public fun put_ContentTransitions(value: TransitionCollection?): Unit

  @InterfaceMethod(8)
  public fun get_FontSize(): Double

  @InterfaceMethod(9)
  public fun put_FontSize(value: Double): Unit

  @InterfaceMethod(10)
  public fun get_FontFamily(): FontFamily?

  @InterfaceMethod(11)
  public fun put_FontFamily(value: FontFamily?): Unit

  @InterfaceMethod(12)
  public fun get_FontWeight(): FontWeight?

  @InterfaceMethod(13)
  public fun put_FontWeight(value: FontWeight?): Unit

  @InterfaceMethod(14)
  public fun get_FontStyle(): FontStyle?

  @InterfaceMethod(15)
  public fun put_FontStyle(value: FontStyle?): Unit

  @InterfaceMethod(16)
  public fun get_FontStretch(): FontStretch?

  @InterfaceMethod(17)
  public fun put_FontStretch(value: FontStretch?): Unit

  @InterfaceMethod(18)
  public fun get_CharacterSpacing(): Int

  @InterfaceMethod(19)
  public fun put_CharacterSpacing(value: Int): Unit

  @InterfaceMethod(20)
  public fun get_Foreground(): Brush?

  @InterfaceMethod(21)
  public fun put_Foreground(value: Brush?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContentPresenter> {
    public override fun getValue() = ABI.makeIContentPresenter(pointer.getPointer(0))

    public fun setValue(value: IContentPresenter_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContentPresenter {
    public val __617428405_Ptr: Pointer?

    public val _617428405_VtblPtr: Pointer?
      get() = __617428405_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Content(): IUnknown? {
      val fnPtr = _617428405_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__617428405_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Content(value: IUnknown?): Unit {
      val fnPtr = _617428405_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__617428405_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_ContentTemplate(): DataTemplate? {
      val fnPtr = _617428405_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataTemplate>()
      val hr = fn.invokeHR(arrayOf(__617428405_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataTemplate>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_ContentTemplate(value: DataTemplate?): Unit {
      val fnPtr = _617428405_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__617428405_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_ContentTemplateSelector(): DataTemplateSelector? {
      val fnPtr = _617428405_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataTemplateSelector>()
      val hr = fn.invokeHR(arrayOf(__617428405_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataTemplateSelector>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_ContentTemplateSelector(value: DataTemplateSelector?): Unit {
      val fnPtr = _617428405_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__617428405_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_ContentTransitions(): TransitionCollection? {
      val fnPtr = _617428405_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TransitionCollection>()
      val hr = fn.invokeHR(arrayOf(__617428405_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TransitionCollection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_ContentTransitions(value: TransitionCollection?): Unit {
      val fnPtr = _617428405_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__617428405_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_FontSize(): Double {
      val fnPtr = _617428405_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__617428405_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_FontSize(value: Double): Unit {
      val fnPtr = _617428405_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__617428405_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_FontFamily(): FontFamily? {
      val fnPtr = _617428405_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FontFamily>()
      val hr = fn.invokeHR(arrayOf(__617428405_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FontFamily>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_FontFamily(value: FontFamily?): Unit {
      val fnPtr = _617428405_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__617428405_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_FontWeight(): FontWeight? {
      val fnPtr = _617428405_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FontWeight>()
      val hr = fn.invokeHR(arrayOf(__617428405_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FontWeight>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_FontWeight(value: FontWeight?): Unit {
      val fnPtr = _617428405_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__617428405_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_FontStyle(): FontStyle? {
      val fnPtr = _617428405_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FontStyle>()
      val hr = fn.invokeHR(arrayOf(__617428405_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FontStyle>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun put_FontStyle(value: FontStyle?): Unit {
      val fnPtr = _617428405_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__617428405_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_FontStretch(): FontStretch? {
      val fnPtr = _617428405_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FontStretch>()
      val hr = fn.invokeHR(arrayOf(__617428405_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FontStretch>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun put_FontStretch(value: FontStretch?): Unit {
      val fnPtr = _617428405_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__617428405_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_CharacterSpacing(): Int {
      val fnPtr = _617428405_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__617428405_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(19)
    public override fun put_CharacterSpacing(value: Int): Unit {
      val fnPtr = _617428405_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__617428405_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun get_Foreground(): Brush? {
      val fnPtr = _617428405_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__617428405_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun put_Foreground(value: Brush?): Unit {
      val fnPtr = _617428405_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__617428405_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IContentPresenter_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __617428405_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContentPresenter, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("79fde5b4cd37491c8845daf472defff6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContentPresenter(ptr: Pointer?): WithDefault = IContentPresenter_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContentPresenter {
      val address = segment.toRawLongValue()
      return makeIContentPresenter(Pointer(address))
    }

    public override fun toNative(obj: IContentPresenter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__617428405_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContentPresenter): Array<IContentPresenter?> = (elements
        as Array<IContentPresenter?>).castToImpl<IContentPresenter,IContentPresenter_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContentPresenter?> =
        arrayOfNulls<IContentPresenter_Impl>(size) as Array<IContentPresenter?>
  }
}
