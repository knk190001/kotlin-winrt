package Windows.UI.Xaml

import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.Uri
import Windows.UI.Xaml.Data.BindingBase
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IFrameworkElement.ABI::class)
@Signature("{a391d09b-4a99-4b7c-9d8d-6fa5d01f6fbf}")
@Guid("a391d09b4a994b7c9d8d6fa5d01f6fbf")
@WinRTInterface("a391d09b4a994b7c9d8d6fa5d01f6fbf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFrameworkElement.ByReference::class)
public interface IFrameworkElement : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Triggers(): TriggerCollection?

  @InterfaceMethod(1)
  public fun get_Resources(): ResourceDictionary?

  @InterfaceMethod(2)
  public fun put_Resources(value: ResourceDictionary?): Unit

  @InterfaceMethod(3)
  public fun get_Tag(): IUnknown?

  @InterfaceMethod(4)
  public fun put_Tag(value: IUnknown?): Unit

  @InterfaceMethod(5)
  public fun get_Language(): String?

  @InterfaceMethod(6)
  public fun put_Language(value: String?): Unit

  @InterfaceMethod(7)
  public fun get_ActualWidth(): Double

  @InterfaceMethod(8)
  public fun get_ActualHeight(): Double

  @InterfaceMethod(9)
  public fun get_Width(): Double

  @InterfaceMethod(10)
  public fun put_Width(value: Double): Unit

  @InterfaceMethod(11)
  public fun get_Height(): Double

  @InterfaceMethod(12)
  public fun put_Height(value: Double): Unit

  @InterfaceMethod(13)
  public fun get_MinWidth(): Double

  @InterfaceMethod(14)
  public fun put_MinWidth(value: Double): Unit

  @InterfaceMethod(15)
  public fun get_MaxWidth(): Double

  @InterfaceMethod(16)
  public fun put_MaxWidth(value: Double): Unit

  @InterfaceMethod(17)
  public fun get_MinHeight(): Double

  @InterfaceMethod(18)
  public fun put_MinHeight(value: Double): Unit

  @InterfaceMethod(19)
  public fun get_MaxHeight(): Double

  @InterfaceMethod(20)
  public fun put_MaxHeight(value: Double): Unit

  @InterfaceMethod(21)
  public fun get_HorizontalAlignment(): HorizontalAlignment?

  @InterfaceMethod(22)
  public fun put_HorizontalAlignment(value: HorizontalAlignment?): Unit

  @InterfaceMethod(23)
  public fun get_VerticalAlignment(): VerticalAlignment?

  @InterfaceMethod(24)
  public fun put_VerticalAlignment(value: VerticalAlignment?): Unit

  @InterfaceMethod(25)
  public fun get_Margin(): Thickness?

  @InterfaceMethod(26)
  public fun put_Margin(value: Thickness?): Unit

  @InterfaceMethod(27)
  public fun get_Name(): String?

  @InterfaceMethod(28)
  public fun put_Name(value: String?): Unit

  @InterfaceMethod(29)
  public fun get_BaseUri(): Uri?

  @InterfaceMethod(30)
  public fun get_DataContext(): IUnknown?

  @InterfaceMethod(31)
  public fun put_DataContext(value: IUnknown?): Unit

  @InterfaceMethod(32)
  public fun get_Style(): Style?

  @InterfaceMethod(33)
  public fun put_Style(value: Style?): Unit

  @InterfaceMethod(34)
  public fun get_Parent(): DependencyObject?

  @InterfaceMethod(35)
  public fun get_FlowDirection(): FlowDirection?

  @InterfaceMethod(36)
  public fun put_FlowDirection(value: FlowDirection?): Unit

  @InterfaceMethod(37)
  public fun add_Loaded(handler: RoutedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(38)
  public fun remove_Loaded(token: EventRegistrationToken?): Unit

  @InterfaceMethod(39)
  public fun add_Unloaded(handler: RoutedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(40)
  public fun remove_Unloaded(token: EventRegistrationToken?): Unit

  @InterfaceMethod(41)
  public fun add_SizeChanged(handler: SizeChangedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(42)
  public fun remove_SizeChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(43)
  public fun add_LayoutUpdated(handler: EventHandler<IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(44)
  public fun remove_LayoutUpdated(token: EventRegistrationToken?): Unit

  @InterfaceMethod(45)
  public fun FindName(name: String?): IUnknown?

  @InterfaceMethod(46)
  public fun SetBinding(dp: DependencyProperty?, binding: BindingBase?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFrameworkElement> {
    public override fun getValue() = ABI.makeIFrameworkElement(pointer.getPointer(0))

    public fun setValue(value: IFrameworkElement_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFrameworkElement {
    public val __127922832_Ptr: Pointer?

    public val _127922832_VtblPtr: Pointer?
      get() = __127922832_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Triggers(): TriggerCollection? {
      val fnPtr = _127922832_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TriggerCollection>()
      val hr = fn.invokeHR(arrayOf(__127922832_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TriggerCollection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Resources(): ResourceDictionary? {
      val fnPtr = _127922832_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ResourceDictionary>()
      val hr = fn.invokeHR(arrayOf(__127922832_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ResourceDictionary>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_Resources(value: ResourceDictionary?): Unit {
      val fnPtr = _127922832_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__127922832_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_Tag(): IUnknown? {
      val fnPtr = _127922832_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__127922832_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_Tag(value: IUnknown?): Unit {
      val fnPtr = _127922832_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__127922832_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_Language(): String? {
      val fnPtr = _127922832_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__127922832_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_Language(value: String?): Unit {
      val fnPtr = _127922832_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__127922832_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_ActualWidth(): Double {
      val fnPtr = _127922832_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__127922832_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun get_ActualHeight(): Double {
      val fnPtr = _127922832_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__127922832_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun get_Width(): Double {
      val fnPtr = _127922832_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__127922832_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(10)
    public override fun put_Width(value: Double): Unit {
      val fnPtr = _127922832_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__127922832_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun get_Height(): Double {
      val fnPtr = _127922832_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__127922832_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(12)
    public override fun put_Height(value: Double): Unit {
      val fnPtr = _127922832_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__127922832_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun get_MinWidth(): Double {
      val fnPtr = _127922832_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__127922832_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(14)
    public override fun put_MinWidth(value: Double): Unit {
      val fnPtr = _127922832_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__127922832_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun get_MaxWidth(): Double {
      val fnPtr = _127922832_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__127922832_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(16)
    public override fun put_MaxWidth(value: Double): Unit {
      val fnPtr = _127922832_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__127922832_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(17)
    public override fun get_MinHeight(): Double {
      val fnPtr = _127922832_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__127922832_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(18)
    public override fun put_MinHeight(value: Double): Unit {
      val fnPtr = _127922832_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__127922832_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(19)
    public override fun get_MaxHeight(): Double {
      val fnPtr = _127922832_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__127922832_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(20)
    public override fun put_MaxHeight(value: Double): Unit {
      val fnPtr = _127922832_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__127922832_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(21)
    public override fun get_HorizontalAlignment(): HorizontalAlignment? {
      val fnPtr = _127922832_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HorizontalAlignment>()
      val hr = fn.invokeHR(arrayOf(__127922832_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HorizontalAlignment>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(22)
    public override fun put_HorizontalAlignment(value: HorizontalAlignment?): Unit {
      val fnPtr = _127922832_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__127922832_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(23)
    public override fun get_VerticalAlignment(): VerticalAlignment? {
      val fnPtr = _127922832_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VerticalAlignment>()
      val hr = fn.invokeHR(arrayOf(__127922832_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VerticalAlignment>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(24)
    public override fun put_VerticalAlignment(value: VerticalAlignment?): Unit {
      val fnPtr = _127922832_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__127922832_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(25)
    public override fun get_Margin(): Thickness? {
      val fnPtr = _127922832_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Thickness>()
      val hr = fn.invokeHR(arrayOf(__127922832_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Thickness>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(26)
    public override fun put_Margin(value: Thickness?): Unit {
      val fnPtr = _127922832_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__127922832_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(27)
    public override fun get_Name(): String? {
      val fnPtr = _127922832_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__127922832_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(28)
    public override fun put_Name(value: String?): Unit {
      val fnPtr = _127922832_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__127922832_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(29)
    public override fun get_BaseUri(): Uri? {
      val fnPtr = _127922832_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__127922832_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(30)
    public override fun get_DataContext(): IUnknown? {
      val fnPtr = _127922832_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__127922832_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(31)
    public override fun put_DataContext(value: IUnknown?): Unit {
      val fnPtr = _127922832_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__127922832_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(32)
    public override fun get_Style(): Style? {
      val fnPtr = _127922832_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Style>()
      val hr = fn.invokeHR(arrayOf(__127922832_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Style>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(33)
    public override fun put_Style(value: Style?): Unit {
      val fnPtr = _127922832_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__127922832_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(34)
    public override fun get_Parent(): DependencyObject? {
      val fnPtr = _127922832_VtblPtr!!.getPointer(40L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyObject>()
      val hr = fn.invokeHR(arrayOf(__127922832_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyObject>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(35)
    public override fun get_FlowDirection(): FlowDirection? {
      val fnPtr = _127922832_VtblPtr!!.getPointer(41L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FlowDirection>()
      val hr = fn.invokeHR(arrayOf(__127922832_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FlowDirection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(36)
    public override fun put_FlowDirection(value: FlowDirection?): Unit {
      val fnPtr = _127922832_VtblPtr!!.getPointer(42L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__127922832_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(37)
    public override fun add_Loaded(handler: RoutedEventHandler?): EventRegistrationToken? {
      val fnPtr = _127922832_VtblPtr!!.getPointer(43L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__127922832_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(38)
    public override fun remove_Loaded(token: EventRegistrationToken?): Unit {
      val fnPtr = _127922832_VtblPtr!!.getPointer(44L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__127922832_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(39)
    public override fun add_Unloaded(handler: RoutedEventHandler?): EventRegistrationToken? {
      val fnPtr = _127922832_VtblPtr!!.getPointer(45L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__127922832_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(40)
    public override fun remove_Unloaded(token: EventRegistrationToken?): Unit {
      val fnPtr = _127922832_VtblPtr!!.getPointer(46L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__127922832_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(41)
    public override fun add_SizeChanged(handler: SizeChangedEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _127922832_VtblPtr!!.getPointer(47L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__127922832_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(42)
    public override fun remove_SizeChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _127922832_VtblPtr!!.getPointer(48L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__127922832_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(43)
    public override fun add_LayoutUpdated(handler: EventHandler<IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _127922832_VtblPtr!!.getPointer(49L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__127922832_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(44)
    public override fun remove_LayoutUpdated(token: EventRegistrationToken?): Unit {
      val fnPtr = _127922832_VtblPtr!!.getPointer(50L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__127922832_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(45)
    public override fun FindName(name: String?): IUnknown? {
      val fnPtr = _127922832_VtblPtr!!.getPointer(51L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__127922832_Ptr, marshalToNative(name), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(46)
    public override fun SetBinding(dp: DependencyProperty?, binding: BindingBase?): Unit {
      val fnPtr = _127922832_VtblPtr!!.getPointer(52L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__127922832_Ptr, marshalToNative(dp), marshalToNative(binding),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IFrameworkElement_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __127922832_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFrameworkElement, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a391d09b4a994b7c9d8d6fa5d01f6fbf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFrameworkElement(ptr: Pointer?): WithDefault = IFrameworkElement_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFrameworkElement {
      val address = segment.toRawLongValue()
      return makeIFrameworkElement(Pointer(address))
    }

    public override fun toNative(obj: IFrameworkElement): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__127922832_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFrameworkElement): Array<IFrameworkElement?> = (elements
        as Array<IFrameworkElement?>).castToImpl<IFrameworkElement,IFrameworkElement_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFrameworkElement?> =
        arrayOfNulls<IFrameworkElement_Impl>(size) as Array<IFrameworkElement?>
  }
}
