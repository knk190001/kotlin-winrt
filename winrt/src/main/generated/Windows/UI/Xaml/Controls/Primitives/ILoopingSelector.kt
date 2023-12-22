package Windows.UI.Xaml.Controls.Primitives

import Windows.Foundation.Collections.IVector
import Windows.Foundation.EventRegistrationToken
import Windows.UI.Xaml.Controls.SelectionChangedEventHandler
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ILoopingSelector.ABI::class)
@Signature("{4c9a3e04-4827-49d9-8806-093957b0fd21}")
@Guid("4c9a3e04482749d98806093957b0fd21")
@WinRTInterface("4c9a3e04482749d98806093957b0fd21")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILoopingSelector.ByReference::class)
public interface ILoopingSelector : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ShouldLoop(): Boolean

  @InterfaceMethod(1)
  public fun put_ShouldLoop(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_Items(): IVector<IUnknown?>?

  @InterfaceMethod(3)
  public fun put_Items(value: IVector<IUnknown?>?): Unit

  @InterfaceMethod(4)
  public fun get_SelectedIndex(): Int

  @InterfaceMethod(5)
  public fun put_SelectedIndex(value: Int): Unit

  @InterfaceMethod(6)
  public fun get_SelectedItem(): IUnknown?

  @InterfaceMethod(7)
  public fun put_SelectedItem(value: IUnknown?): Unit

  @InterfaceMethod(8)
  public fun get_ItemWidth(): Int

  @InterfaceMethod(9)
  public fun put_ItemWidth(value: Int): Unit

  @InterfaceMethod(10)
  public fun get_ItemHeight(): Int

  @InterfaceMethod(11)
  public fun put_ItemHeight(value: Int): Unit

  @InterfaceMethod(12)
  public fun get_ItemTemplate(): DataTemplate?

  @InterfaceMethod(13)
  public fun put_ItemTemplate(value: DataTemplate?): Unit

  @InterfaceMethod(14)
  public fun add_SelectionChanged(handler: SelectionChangedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(15)
  public fun remove_SelectionChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILoopingSelector> {
    public override fun getValue() = ABI.makeILoopingSelector(pointer.getPointer(0))

    public fun setValue(value: ILoopingSelector_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILoopingSelector {
    public val __1731200415_Ptr: Pointer?

    public val _1731200415_VtblPtr: Pointer?
      get() = __1731200415_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ShouldLoop(): Boolean {
      val fnPtr = _1731200415_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1731200415_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_ShouldLoop(value: Boolean): Unit {
      val fnPtr = _1731200415_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1731200415_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Items(): IVector<IUnknown?>? {
      val fnPtr = _1731200415_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<IUnknown?>>()
      val hr = fn.invokeHR(arrayOf(__1731200415_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<IUnknown?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Items(value: IVector<IUnknown?>?): Unit {
      val fnPtr = _1731200415_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1731200415_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_SelectedIndex(): Int {
      val fnPtr = _1731200415_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1731200415_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_SelectedIndex(value: Int): Unit {
      val fnPtr = _1731200415_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1731200415_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_SelectedItem(): IUnknown? {
      val fnPtr = _1731200415_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1731200415_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_SelectedItem(value: IUnknown?): Unit {
      val fnPtr = _1731200415_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1731200415_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_ItemWidth(): Int {
      val fnPtr = _1731200415_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1731200415_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_ItemWidth(value: Int): Unit {
      val fnPtr = _1731200415_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1731200415_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_ItemHeight(): Int {
      val fnPtr = _1731200415_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1731200415_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun put_ItemHeight(value: Int): Unit {
      val fnPtr = _1731200415_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1731200415_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_ItemTemplate(): DataTemplate? {
      val fnPtr = _1731200415_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataTemplate>()
      val hr = fn.invokeHR(arrayOf(__1731200415_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataTemplate>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_ItemTemplate(value: DataTemplate?): Unit {
      val fnPtr = _1731200415_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1731200415_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun add_SelectionChanged(handler: SelectionChangedEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _1731200415_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1731200415_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun remove_SelectionChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1731200415_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1731200415_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ILoopingSelector_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1731200415_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILoopingSelector, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4c9a3e04482749d98806093957b0fd21")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILoopingSelector(ptr: Pointer?): WithDefault = ILoopingSelector_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILoopingSelector {
      val address = segment.toRawLongValue()
      return makeILoopingSelector(Pointer(address))
    }

    public override fun toNative(obj: ILoopingSelector): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1731200415_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILoopingSelector): Array<ILoopingSelector?> = (elements as
        Array<ILoopingSelector?>).castToImpl<ILoopingSelector,ILoopingSelector_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILoopingSelector?> =
        arrayOfNulls<ILoopingSelector_Impl>(size) as Array<ILoopingSelector?>
  }
}
