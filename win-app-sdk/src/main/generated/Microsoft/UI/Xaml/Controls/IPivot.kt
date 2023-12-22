package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.DataTemplate
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPivot.ABI::class)
@Signature("{1c6438e5-ecac-5fb6-8e8e-00de7e922303}")
@Guid("1c6438e5ecac5fb68e8e00de7e922303")
@WinRTInterface("1c6438e5ecac5fb68e8e00de7e922303")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPivot.ByReference::class)
public interface IPivot : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Title(): IUnknown?

  @InterfaceMethod(1)
  public fun put_Title(value: IUnknown?): Unit

  @InterfaceMethod(2)
  public fun get_TitleTemplate(): DataTemplate?

  @InterfaceMethod(3)
  public fun put_TitleTemplate(value: DataTemplate?): Unit

  @InterfaceMethod(4)
  public fun get_LeftHeader(): IUnknown?

  @InterfaceMethod(5)
  public fun put_LeftHeader(value: IUnknown?): Unit

  @InterfaceMethod(6)
  public fun get_LeftHeaderTemplate(): DataTemplate?

  @InterfaceMethod(7)
  public fun put_LeftHeaderTemplate(value: DataTemplate?): Unit

  @InterfaceMethod(8)
  public fun get_RightHeader(): IUnknown?

  @InterfaceMethod(9)
  public fun put_RightHeader(value: IUnknown?): Unit

  @InterfaceMethod(10)
  public fun get_RightHeaderTemplate(): DataTemplate?

  @InterfaceMethod(11)
  public fun put_RightHeaderTemplate(value: DataTemplate?): Unit

  @InterfaceMethod(12)
  public fun get_HeaderTemplate(): DataTemplate?

  @InterfaceMethod(13)
  public fun put_HeaderTemplate(value: DataTemplate?): Unit

  @InterfaceMethod(14)
  public fun get_SelectedIndex(): Int

  @InterfaceMethod(15)
  public fun put_SelectedIndex(value: Int): Unit

  @InterfaceMethod(16)
  public fun get_SelectedItem(): IUnknown?

  @InterfaceMethod(17)
  public fun put_SelectedItem(value: IUnknown?): Unit

  @InterfaceMethod(18)
  public fun get_IsLocked(): Boolean

  @InterfaceMethod(19)
  public fun put_IsLocked(value: Boolean): Unit

  @InterfaceMethod(20)
  public fun get_HeaderFocusVisualPlacement(): PivotHeaderFocusVisualPlacement?

  @InterfaceMethod(21)
  public fun put_HeaderFocusVisualPlacement(value: PivotHeaderFocusVisualPlacement?): Unit

  @InterfaceMethod(22)
  public fun get_IsHeaderItemsCarouselEnabled(): Boolean

  @InterfaceMethod(23)
  public fun put_IsHeaderItemsCarouselEnabled(value: Boolean): Unit

  @InterfaceMethod(24)
  public fun add_SelectionChanged(handler: SelectionChangedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(25)
  public fun remove_SelectionChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(26)
  public fun add_PivotItemLoading(handler: TypedEventHandler<Pivot?, PivotItemEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(27)
  public fun remove_PivotItemLoading(token: EventRegistrationToken?): Unit

  @InterfaceMethod(28)
  public fun add_PivotItemLoaded(handler: TypedEventHandler<Pivot?, PivotItemEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(29)
  public fun remove_PivotItemLoaded(token: EventRegistrationToken?): Unit

  @InterfaceMethod(30)
  public fun add_PivotItemUnloading(handler: TypedEventHandler<Pivot?, PivotItemEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(31)
  public fun remove_PivotItemUnloading(token: EventRegistrationToken?): Unit

  @InterfaceMethod(32)
  public fun add_PivotItemUnloaded(handler: TypedEventHandler<Pivot?, PivotItemEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(33)
  public fun remove_PivotItemUnloaded(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPivot> {
    public override fun getValue() = ABI.makeIPivot(pointer.getPointer(0))

    public fun setValue(value: IPivot_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPivot {
    public val __2004843813_Ptr: Pointer?

    public val _2004843813_VtblPtr: Pointer?
      get() = __2004843813_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Title(): IUnknown? {
      val fnPtr = _2004843813_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__2004843813_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Title(value: IUnknown?): Unit {
      val fnPtr = _2004843813_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2004843813_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_TitleTemplate(): DataTemplate? {
      val fnPtr = _2004843813_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataTemplate>()
      val hr = fn.invokeHR(arrayOf(__2004843813_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataTemplate>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_TitleTemplate(value: DataTemplate?): Unit {
      val fnPtr = _2004843813_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2004843813_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_LeftHeader(): IUnknown? {
      val fnPtr = _2004843813_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__2004843813_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_LeftHeader(value: IUnknown?): Unit {
      val fnPtr = _2004843813_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2004843813_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_LeftHeaderTemplate(): DataTemplate? {
      val fnPtr = _2004843813_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataTemplate>()
      val hr = fn.invokeHR(arrayOf(__2004843813_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataTemplate>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_LeftHeaderTemplate(value: DataTemplate?): Unit {
      val fnPtr = _2004843813_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2004843813_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_RightHeader(): IUnknown? {
      val fnPtr = _2004843813_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__2004843813_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_RightHeader(value: IUnknown?): Unit {
      val fnPtr = _2004843813_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2004843813_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_RightHeaderTemplate(): DataTemplate? {
      val fnPtr = _2004843813_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataTemplate>()
      val hr = fn.invokeHR(arrayOf(__2004843813_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataTemplate>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_RightHeaderTemplate(value: DataTemplate?): Unit {
      val fnPtr = _2004843813_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2004843813_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_HeaderTemplate(): DataTemplate? {
      val fnPtr = _2004843813_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataTemplate>()
      val hr = fn.invokeHR(arrayOf(__2004843813_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataTemplate>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_HeaderTemplate(value: DataTemplate?): Unit {
      val fnPtr = _2004843813_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2004843813_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_SelectedIndex(): Int {
      val fnPtr = _2004843813_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__2004843813_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(15)
    public override fun put_SelectedIndex(value: Int): Unit {
      val fnPtr = _2004843813_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2004843813_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_SelectedItem(): IUnknown? {
      val fnPtr = _2004843813_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__2004843813_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun put_SelectedItem(value: IUnknown?): Unit {
      val fnPtr = _2004843813_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2004843813_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_IsLocked(): Boolean {
      val fnPtr = _2004843813_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2004843813_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(19)
    public override fun put_IsLocked(value: Boolean): Unit {
      val fnPtr = _2004843813_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2004843813_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun get_HeaderFocusVisualPlacement(): PivotHeaderFocusVisualPlacement? {
      val fnPtr = _2004843813_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PivotHeaderFocusVisualPlacement>()
      val hr = fn.invokeHR(arrayOf(__2004843813_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PivotHeaderFocusVisualPlacement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun put_HeaderFocusVisualPlacement(value: PivotHeaderFocusVisualPlacement?):
        Unit {
      val fnPtr = _2004843813_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2004843813_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun get_IsHeaderItemsCarouselEnabled(): Boolean {
      val fnPtr = _2004843813_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2004843813_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(23)
    public override fun put_IsHeaderItemsCarouselEnabled(value: Boolean): Unit {
      val fnPtr = _2004843813_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2004843813_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(24)
    public override fun add_SelectionChanged(handler: SelectionChangedEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _2004843813_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2004843813_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun remove_SelectionChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _2004843813_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2004843813_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(26)
    public override fun add_PivotItemLoading(handler: TypedEventHandler<Pivot?,
        PivotItemEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _2004843813_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2004843813_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(27)
    public override fun remove_PivotItemLoading(token: EventRegistrationToken?): Unit {
      val fnPtr = _2004843813_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2004843813_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(28)
    public override fun add_PivotItemLoaded(handler: TypedEventHandler<Pivot?,
        PivotItemEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _2004843813_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2004843813_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(29)
    public override fun remove_PivotItemLoaded(token: EventRegistrationToken?): Unit {
      val fnPtr = _2004843813_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2004843813_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(30)
    public override fun add_PivotItemUnloading(handler: TypedEventHandler<Pivot?,
        PivotItemEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _2004843813_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2004843813_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(31)
    public override fun remove_PivotItemUnloading(token: EventRegistrationToken?): Unit {
      val fnPtr = _2004843813_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2004843813_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(32)
    public override fun add_PivotItemUnloaded(handler: TypedEventHandler<Pivot?,
        PivotItemEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _2004843813_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2004843813_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(33)
    public override fun remove_PivotItemUnloaded(token: EventRegistrationToken?): Unit {
      val fnPtr = _2004843813_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2004843813_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPivot_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2004843813_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPivot, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1c6438e5ecac5fb68e8e00de7e922303")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPivot(ptr: Pointer?): WithDefault = IPivot_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPivot {
      val address = segment.toRawLongValue()
      return makeIPivot(Pointer(address))
    }

    public override fun toNative(obj: IPivot): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2004843813_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPivot): Array<IPivot?> = (elements as
        Array<IPivot?>).castToImpl<IPivot,IPivot_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPivot?> = arrayOfNulls<IPivot_Impl>(size) as
        Array<IPivot?>
  }
}
