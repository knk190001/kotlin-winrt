package Windows.UI.Xaml.Controls

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TimeSpan
import Windows.Foundation.TypedEventHandler
import Windows.UI.Xaml.DataTemplate
import Windows.UI.Xaml.Media.Animation.TransitionCollection
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

@ABIMarker(IListViewBase2.ABI::class)
@Signature("{d1c2a4f7-78a3-4491-86e0-2ddebc007ac5}")
@Guid("d1c2a4f778a3449186e02ddebc007ac5")
@WinRTInterface("d1c2a4f778a3449186e02ddebc007ac5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IListViewBase2.ByReference::class)
public interface IListViewBase2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ShowsScrollingPlaceholders(): Boolean

  @InterfaceMethod(1)
  public fun put_ShowsScrollingPlaceholders(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun add_ContainerContentChanging(handler: TypedEventHandler<ListViewBase?,
      ContainerContentChangingEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_ContainerContentChanging(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun SetDesiredContainerUpdateDuration(duration: TimeSpan?): Unit

  @InterfaceMethod(5)
  public fun get_Footer(): IUnknown?

  @InterfaceMethod(6)
  public fun put_Footer(value: IUnknown?): Unit

  @InterfaceMethod(7)
  public fun get_FooterTemplate(): DataTemplate?

  @InterfaceMethod(8)
  public fun put_FooterTemplate(value: DataTemplate?): Unit

  @InterfaceMethod(9)
  public fun get_FooterTransitions(): TransitionCollection?

  @InterfaceMethod(10)
  public fun put_FooterTransitions(value: TransitionCollection?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IListViewBase2>
      {
    public override fun getValue() = ABI.makeIListViewBase2(pointer.getPointer(0))

    public fun setValue(value: IListViewBase2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IListViewBase2 {
    public val __1194261058_Ptr: Pointer?

    public val _1194261058_VtblPtr: Pointer?
      get() = __1194261058_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ShowsScrollingPlaceholders(): Boolean {
      val fnPtr = _1194261058_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1194261058_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_ShowsScrollingPlaceholders(value: Boolean): Unit {
      val fnPtr = _1194261058_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1194261058_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_ContainerContentChanging(handler: TypedEventHandler<ListViewBase?,
        ContainerContentChangingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1194261058_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1194261058_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_ContainerContentChanging(token: EventRegistrationToken?): Unit {
      val fnPtr = _1194261058_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1194261058_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun SetDesiredContainerUpdateDuration(duration: TimeSpan?): Unit {
      val fnPtr = _1194261058_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1194261058_Ptr, marshalToNative(duration),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_Footer(): IUnknown? {
      val fnPtr = _1194261058_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1194261058_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_Footer(value: IUnknown?): Unit {
      val fnPtr = _1194261058_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1194261058_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_FooterTemplate(): DataTemplate? {
      val fnPtr = _1194261058_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataTemplate>()
      val hr = fn.invokeHR(arrayOf(__1194261058_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataTemplate>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun put_FooterTemplate(value: DataTemplate?): Unit {
      val fnPtr = _1194261058_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1194261058_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_FooterTransitions(): TransitionCollection? {
      val fnPtr = _1194261058_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TransitionCollection>()
      val hr = fn.invokeHR(arrayOf(__1194261058_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TransitionCollection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun put_FooterTransitions(value: TransitionCollection?): Unit {
      val fnPtr = _1194261058_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1194261058_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IListViewBase2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1194261058_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IListViewBase2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d1c2a4f778a3449186e02ddebc007ac5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIListViewBase2(ptr: Pointer?): WithDefault = IListViewBase2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IListViewBase2 {
      val address = segment.toRawLongValue()
      return makeIListViewBase2(Pointer(address))
    }

    public override fun toNative(obj: IListViewBase2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1194261058_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IListViewBase2): Array<IListViewBase2?> = (elements as
        Array<IListViewBase2?>).castToImpl<IListViewBase2,IListViewBase2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IListViewBase2?> =
        arrayOfNulls<IListViewBase2_Impl>(size) as Array<IListViewBase2?>
  }
}
