package Windows.UI.Xaml.Controls

import Windows.Foundation.Collections.IObservableVector
import Windows.Foundation.Collections.IVector
import Windows.Foundation.EventRegistrationToken
import Windows.UI.Xaml.DataTemplate
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IHub.ABI::class)
@Signature("{ae692e82-7314-4f51-ab11-2af1ed4a19f8}")
@Guid("ae692e8273144f51ab112af1ed4a19f8")
@WinRTInterface("ae692e8273144f51ab112af1ed4a19f8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHub.ByReference::class)
public interface IHub : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Header(): IUnknown?

  @InterfaceMethod(1)
  public fun put_Header(value: IUnknown?): Unit

  @InterfaceMethod(2)
  public fun get_HeaderTemplate(): DataTemplate?

  @InterfaceMethod(3)
  public fun put_HeaderTemplate(value: DataTemplate?): Unit

  @InterfaceMethod(4)
  public fun get_Orientation(): Orientation?

  @InterfaceMethod(5)
  public fun put_Orientation(value: Orientation?): Unit

  @InterfaceMethod(6)
  public fun get_DefaultSectionIndex(): Int

  @InterfaceMethod(7)
  public fun put_DefaultSectionIndex(value: Int): Unit

  @InterfaceMethod(8)
  public fun get_Sections(): IVector<HubSection?>?

  @InterfaceMethod(9)
  public fun get_SectionsInView(): IVector<HubSection?>?

  @InterfaceMethod(10)
  public fun get_SectionHeaders(): IObservableVector<IUnknown?>?

  @InterfaceMethod(11)
  public fun add_SectionHeaderClick(handler: HubSectionHeaderClickEventHandler?):
      EventRegistrationToken?

  @InterfaceMethod(12)
  public fun remove_SectionHeaderClick(token: EventRegistrationToken?): Unit

  @InterfaceMethod(13)
  public fun add_SectionsInViewChanged(handler: SectionsInViewChangedEventHandler?):
      EventRegistrationToken?

  @InterfaceMethod(14)
  public fun remove_SectionsInViewChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(15)
  public fun ScrollToSection(section: HubSection?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IHub> {
    public override fun getValue() = ABI.makeIHub(pointer.getPointer(0))

    public fun setValue(value: IHub_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHub {
    public val __1604481881_Ptr: Pointer?

    public val _1604481881_VtblPtr: Pointer?
      get() = __1604481881_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Header(): IUnknown? {
      val fnPtr = _1604481881_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1604481881_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Header(value: IUnknown?): Unit {
      val fnPtr = _1604481881_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1604481881_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_HeaderTemplate(): DataTemplate? {
      val fnPtr = _1604481881_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataTemplate>()
      val hr = fn.invokeHR(arrayOf(__1604481881_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataTemplate>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_HeaderTemplate(value: DataTemplate?): Unit {
      val fnPtr = _1604481881_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1604481881_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Orientation(): Orientation? {
      val fnPtr = _1604481881_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Orientation>()
      val hr = fn.invokeHR(arrayOf(__1604481881_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Orientation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_Orientation(value: Orientation?): Unit {
      val fnPtr = _1604481881_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1604481881_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_DefaultSectionIndex(): Int {
      val fnPtr = _1604481881_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1604481881_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_DefaultSectionIndex(value: Int): Unit {
      val fnPtr = _1604481881_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1604481881_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_Sections(): IVector<HubSection?>? {
      val fnPtr = _1604481881_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<HubSection?>>()
      val hr = fn.invokeHR(arrayOf(__1604481881_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<HubSection?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_SectionsInView(): IVector<HubSection?>? {
      val fnPtr = _1604481881_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<HubSection?>>()
      val hr = fn.invokeHR(arrayOf(__1604481881_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<HubSection?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_SectionHeaders(): IObservableVector<IUnknown?>? {
      val fnPtr = _1604481881_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IObservableVector<IUnknown?>>()
      val hr = fn.invokeHR(arrayOf(__1604481881_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IObservableVector<IUnknown?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun add_SectionHeaderClick(handler: HubSectionHeaderClickEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _1604481881_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1604481881_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun remove_SectionHeaderClick(token: EventRegistrationToken?): Unit {
      val fnPtr = _1604481881_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1604481881_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun add_SectionsInViewChanged(handler: SectionsInViewChangedEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _1604481881_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1604481881_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun remove_SectionsInViewChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1604481881_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1604481881_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun ScrollToSection(section: HubSection?): Unit {
      val fnPtr = _1604481881_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1604481881_Ptr, marshalToNative(section),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IHub_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1604481881_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHub, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ae692e8273144f51ab112af1ed4a19f8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHub(ptr: Pointer?): WithDefault = IHub_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHub {
      val address = segment.toRawLongValue()
      return makeIHub(Pointer(address))
    }

    public override fun toNative(obj: IHub): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1604481881_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHub): Array<IHub?> = (elements as
        Array<IHub?>).castToImpl<IHub,IHub_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHub?> = arrayOfNulls<IHub_Impl>(size) as
        Array<IHub?>
  }
}
