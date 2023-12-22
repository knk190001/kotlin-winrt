package Windows.UI.Xaml.Controls.Primitives

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IReference
import Windows.UI.Xaml.Controls.SelectionChangedEventHandler
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISelector.ABI::class)
@Signature("{e30eb3a5-b36b-42dc-8527-cd25136c083c}")
@Guid("e30eb3a5b36b42dc8527cd25136c083c")
@WinRTInterface("e30eb3a5b36b42dc8527cd25136c083c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISelector.ByReference::class)
public interface ISelector : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SelectedIndex(): Int

  @InterfaceMethod(1)
  public fun put_SelectedIndex(value: Int): Unit

  @InterfaceMethod(2)
  public fun get_SelectedItem(): IUnknown?

  @InterfaceMethod(3)
  public fun put_SelectedItem(value: IUnknown?): Unit

  @InterfaceMethod(4)
  public fun get_SelectedValue(): IUnknown?

  @InterfaceMethod(5)
  public fun put_SelectedValue(value: IUnknown?): Unit

  @InterfaceMethod(6)
  public fun get_SelectedValuePath(): String?

  @InterfaceMethod(7)
  public fun put_SelectedValuePath(value: String?): Unit

  @InterfaceMethod(8)
  public fun get_IsSynchronizedWithCurrentItem(): IReference<Boolean>?

  @InterfaceMethod(9)
  public fun put_IsSynchronizedWithCurrentItem(value: IReference<Boolean>?): Unit

  @InterfaceMethod(10)
  public fun add_SelectionChanged(handler: SelectionChangedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(11)
  public fun remove_SelectionChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ISelector> {
    public override fun getValue() = ABI.makeISelector(pointer.getPointer(0))

    public fun setValue(value: ISelector_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISelector {
    public val __948886853_Ptr: Pointer?

    public val _948886853_VtblPtr: Pointer?
      get() = __948886853_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SelectedIndex(): Int {
      val fnPtr = _948886853_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__948886853_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_SelectedIndex(value: Int): Unit {
      val fnPtr = _948886853_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__948886853_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_SelectedItem(): IUnknown? {
      val fnPtr = _948886853_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__948886853_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_SelectedItem(value: IUnknown?): Unit {
      val fnPtr = _948886853_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__948886853_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_SelectedValue(): IUnknown? {
      val fnPtr = _948886853_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__948886853_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_SelectedValue(value: IUnknown?): Unit {
      val fnPtr = _948886853_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__948886853_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_SelectedValuePath(): String? {
      val fnPtr = _948886853_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__948886853_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_SelectedValuePath(value: String?): Unit {
      val fnPtr = _948886853_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__948886853_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_IsSynchronizedWithCurrentItem(): IReference<Boolean>? {
      val fnPtr = _948886853_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__948886853_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_IsSynchronizedWithCurrentItem(value: IReference<Boolean>?): Unit {
      val fnPtr = _948886853_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__948886853_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun add_SelectionChanged(handler: SelectionChangedEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _948886853_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__948886853_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun remove_SelectionChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _948886853_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__948886853_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISelector_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __948886853_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISelector, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e30eb3a5b36b42dc8527cd25136c083c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISelector(ptr: Pointer?): WithDefault = ISelector_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISelector {
      val address = segment.toRawLongValue()
      return makeISelector(Pointer(address))
    }

    public override fun toNative(obj: ISelector): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__948886853_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISelector): Array<ISelector?> = (elements as
        Array<ISelector?>).castToImpl<ISelector,ISelector_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISelector?> = arrayOfNulls<ISelector_Impl>(size)
        as Array<ISelector?>
  }
}
