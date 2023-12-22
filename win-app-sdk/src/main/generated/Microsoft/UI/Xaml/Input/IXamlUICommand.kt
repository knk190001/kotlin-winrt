package Microsoft.UI.Xaml.Input

import Microsoft.UI.Xaml.Controls.IconSource
import Windows.Foundation.Collections.IVector
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IXamlUICommand.ABI::class)
@Signature("{a457f2cb-51e0-541c-9c42-dd1dcbdf58fb}")
@Guid("a457f2cb51e0541c9c42dd1dcbdf58fb")
@WinRTInterface("a457f2cb51e0541c9c42dd1dcbdf58fb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXamlUICommand.ByReference::class)
public interface IXamlUICommand : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Label(): String?

  @InterfaceMethod(1)
  public fun put_Label(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_IconSource(): IconSource?

  @InterfaceMethod(3)
  public fun put_IconSource(value: IconSource?): Unit

  @InterfaceMethod(4)
  public fun get_KeyboardAccelerators(): IVector<KeyboardAccelerator?>?

  @InterfaceMethod(5)
  public fun get_AccessKey(): String?

  @InterfaceMethod(6)
  public fun put_AccessKey(value: String?): Unit

  @InterfaceMethod(7)
  public fun get_Description(): String?

  @InterfaceMethod(8)
  public fun put_Description(value: String?): Unit

  @InterfaceMethod(9)
  public fun get_Command(): ICommand?

  @InterfaceMethod(10)
  public fun put_Command(value: ICommand?): Unit

  @InterfaceMethod(11)
  public fun add_ExecuteRequested(handler: TypedEventHandler<XamlUICommand?,
      ExecuteRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(12)
  public fun remove_ExecuteRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(13)
  public fun add_CanExecuteRequested(handler: TypedEventHandler<XamlUICommand?,
      CanExecuteRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(14)
  public fun remove_CanExecuteRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(15)
  public fun NotifyCanExecuteChanged(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IXamlUICommand>
      {
    public override fun getValue() = ABI.makeIXamlUICommand(pointer.getPointer(0))

    public fun setValue(value: IXamlUICommand_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXamlUICommand {
    public val __1509254564_Ptr: Pointer?

    public val _1509254564_VtblPtr: Pointer?
      get() = __1509254564_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Label(): String? {
      val fnPtr = _1509254564_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1509254564_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Label(value: String?): Unit {
      val fnPtr = _1509254564_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1509254564_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_IconSource(): IconSource? {
      val fnPtr = _1509254564_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IconSource>()
      val hr = fn.invokeHR(arrayOf(__1509254564_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IconSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_IconSource(value: IconSource?): Unit {
      val fnPtr = _1509254564_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1509254564_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_KeyboardAccelerators(): IVector<KeyboardAccelerator?>? {
      val fnPtr = _1509254564_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<KeyboardAccelerator?>>()
      val hr = fn.invokeHR(arrayOf(__1509254564_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<KeyboardAccelerator?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_AccessKey(): String? {
      val fnPtr = _1509254564_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1509254564_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_AccessKey(value: String?): Unit {
      val fnPtr = _1509254564_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1509254564_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_Description(): String? {
      val fnPtr = _1509254564_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1509254564_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun put_Description(value: String?): Unit {
      val fnPtr = _1509254564_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1509254564_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_Command(): ICommand? {
      val fnPtr = _1509254564_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ICommand>()
      val hr = fn.invokeHR(arrayOf(__1509254564_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ICommand>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun put_Command(value: ICommand?): Unit {
      val fnPtr = _1509254564_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1509254564_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun add_ExecuteRequested(handler: TypedEventHandler<XamlUICommand?,
        ExecuteRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1509254564_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1509254564_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun remove_ExecuteRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _1509254564_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1509254564_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun add_CanExecuteRequested(handler: TypedEventHandler<XamlUICommand?,
        CanExecuteRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1509254564_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1509254564_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun remove_CanExecuteRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _1509254564_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1509254564_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun NotifyCanExecuteChanged(): Unit {
      val fnPtr = _1509254564_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1509254564_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IXamlUICommand_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1509254564_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXamlUICommand, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a457f2cb51e0541c9c42dd1dcbdf58fb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXamlUICommand(ptr: Pointer?): WithDefault = IXamlUICommand_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IXamlUICommand {
      val address = segment.toRawLongValue()
      return makeIXamlUICommand(Pointer(address))
    }

    public override fun toNative(obj: IXamlUICommand): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1509254564_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXamlUICommand): Array<IXamlUICommand?> = (elements as
        Array<IXamlUICommand?>).castToImpl<IXamlUICommand,IXamlUICommand_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXamlUICommand?> =
        arrayOfNulls<IXamlUICommand_Impl>(size) as Array<IXamlUICommand?>
  }
}
