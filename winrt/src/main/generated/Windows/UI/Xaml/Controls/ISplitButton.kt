package Windows.UI.Xaml.Controls

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import Windows.UI.Xaml.Controls.Primitives.FlyoutBase
import Windows.UI.Xaml.Input.ICommand
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

@ABIMarker(ISplitButton.ABI::class)
@Signature("{58bbb066-c2ea-5499-8150-40faa75f6bb5}")
@Guid("58bbb066c2ea5499815040faa75f6bb5")
@WinRTInterface("58bbb066c2ea5499815040faa75f6bb5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISplitButton.ByReference::class)
public interface ISplitButton : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Flyout(): FlyoutBase?

  @InterfaceMethod(1)
  public fun put_Flyout(value: FlyoutBase?): Unit

  @InterfaceMethod(2)
  public fun get_Command(): ICommand?

  @InterfaceMethod(3)
  public fun put_Command(value: ICommand?): Unit

  @InterfaceMethod(4)
  public fun get_CommandParameter(): IUnknown?

  @InterfaceMethod(5)
  public fun put_CommandParameter(value: IUnknown?): Unit

  @InterfaceMethod(6)
  public fun add_Click(handler: TypedEventHandler<SplitButton?, SplitButtonClickEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_Click(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ISplitButton> {
    public override fun getValue() = ABI.makeISplitButton(pointer.getPointer(0))

    public fun setValue(value: ISplitButton_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISplitButton {
    public val __1565535568_Ptr: Pointer?

    public val _1565535568_VtblPtr: Pointer?
      get() = __1565535568_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Flyout(): FlyoutBase? {
      val fnPtr = _1565535568_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FlyoutBase>()
      val hr = fn.invokeHR(arrayOf(__1565535568_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FlyoutBase>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Flyout(value: FlyoutBase?): Unit {
      val fnPtr = _1565535568_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1565535568_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Command(): ICommand? {
      val fnPtr = _1565535568_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ICommand>()
      val hr = fn.invokeHR(arrayOf(__1565535568_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ICommand>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Command(value: ICommand?): Unit {
      val fnPtr = _1565535568_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1565535568_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_CommandParameter(): IUnknown? {
      val fnPtr = _1565535568_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1565535568_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_CommandParameter(value: IUnknown?): Unit {
      val fnPtr = _1565535568_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1565535568_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun add_Click(handler: TypedEventHandler<SplitButton?,
        SplitButtonClickEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1565535568_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1565535568_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_Click(token: EventRegistrationToken?): Unit {
      val fnPtr = _1565535568_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1565535568_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISplitButton_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1565535568_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISplitButton, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("58bbb066c2ea5499815040faa75f6bb5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISplitButton(ptr: Pointer?): WithDefault = ISplitButton_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISplitButton {
      val address = segment.toRawLongValue()
      return makeISplitButton(Pointer(address))
    }

    public override fun toNative(obj: ISplitButton): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1565535568_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISplitButton): Array<ISplitButton?> = (elements as
        Array<ISplitButton?>).castToImpl<ISplitButton,ISplitButton_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISplitButton?> =
        arrayOfNulls<ISplitButton_Impl>(size) as Array<ISplitButton?>
  }
}
