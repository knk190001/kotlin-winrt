package Windows.UI.Xaml.Controls

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import Windows.UI.Xaml.Input.ICommand
import Windows.UI.Xaml.Style
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IContentDialog2.ABI::class)
@Signature("{2f93eb45-ee43-4303-9b38-3fe1a111ecbf}")
@Guid("2f93eb45ee4343039b383fe1a111ecbf")
@WinRTInterface("2f93eb45ee4343039b383fe1a111ecbf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContentDialog2.ByReference::class)
public interface IContentDialog2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CloseButtonText(): String?

  @InterfaceMethod(1)
  public fun put_CloseButtonText(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_CloseButtonCommand(): ICommand?

  @InterfaceMethod(3)
  public fun put_CloseButtonCommand(value: ICommand?): Unit

  @InterfaceMethod(4)
  public fun get_CloseButtonCommandParameter(): IUnknown?

  @InterfaceMethod(5)
  public fun put_CloseButtonCommandParameter(value: IUnknown?): Unit

  @InterfaceMethod(6)
  public fun get_PrimaryButtonStyle(): Style?

  @InterfaceMethod(7)
  public fun put_PrimaryButtonStyle(value: Style?): Unit

  @InterfaceMethod(8)
  public fun get_SecondaryButtonStyle(): Style?

  @InterfaceMethod(9)
  public fun put_SecondaryButtonStyle(value: Style?): Unit

  @InterfaceMethod(10)
  public fun get_CloseButtonStyle(): Style?

  @InterfaceMethod(11)
  public fun put_CloseButtonStyle(value: Style?): Unit

  @InterfaceMethod(12)
  public fun get_DefaultButton(): ContentDialogButton?

  @InterfaceMethod(13)
  public fun put_DefaultButton(value: ContentDialogButton?): Unit

  @InterfaceMethod(14)
  public fun add_CloseButtonClick(handler: TypedEventHandler<ContentDialog?,
      ContentDialogButtonClickEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(15)
  public fun remove_CloseButtonClick(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContentDialog2> {
    public override fun getValue() = ABI.makeIContentDialog2(pointer.getPointer(0))

    public fun setValue(value: IContentDialog2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContentDialog2 {
    public val __587186253_Ptr: Pointer?

    public val _587186253_VtblPtr: Pointer?
      get() = __587186253_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CloseButtonText(): String? {
      val fnPtr = _587186253_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__587186253_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_CloseButtonText(value: String?): Unit {
      val fnPtr = _587186253_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__587186253_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_CloseButtonCommand(): ICommand? {
      val fnPtr = _587186253_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ICommand>()
      val hr = fn.invokeHR(arrayOf(__587186253_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ICommand>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_CloseButtonCommand(value: ICommand?): Unit {
      val fnPtr = _587186253_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__587186253_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_CloseButtonCommandParameter(): IUnknown? {
      val fnPtr = _587186253_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__587186253_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_CloseButtonCommandParameter(value: IUnknown?): Unit {
      val fnPtr = _587186253_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__587186253_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_PrimaryButtonStyle(): Style? {
      val fnPtr = _587186253_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Style>()
      val hr = fn.invokeHR(arrayOf(__587186253_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Style>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_PrimaryButtonStyle(value: Style?): Unit {
      val fnPtr = _587186253_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__587186253_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_SecondaryButtonStyle(): Style? {
      val fnPtr = _587186253_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Style>()
      val hr = fn.invokeHR(arrayOf(__587186253_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Style>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_SecondaryButtonStyle(value: Style?): Unit {
      val fnPtr = _587186253_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__587186253_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_CloseButtonStyle(): Style? {
      val fnPtr = _587186253_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Style>()
      val hr = fn.invokeHR(arrayOf(__587186253_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Style>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_CloseButtonStyle(value: Style?): Unit {
      val fnPtr = _587186253_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__587186253_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_DefaultButton(): ContentDialogButton? {
      val fnPtr = _587186253_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContentDialogButton>()
      val hr = fn.invokeHR(arrayOf(__587186253_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContentDialogButton>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_DefaultButton(value: ContentDialogButton?): Unit {
      val fnPtr = _587186253_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__587186253_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun add_CloseButtonClick(handler: TypedEventHandler<ContentDialog?,
        ContentDialogButtonClickEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _587186253_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__587186253_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun remove_CloseButtonClick(token: EventRegistrationToken?): Unit {
      val fnPtr = _587186253_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__587186253_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IContentDialog2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __587186253_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContentDialog2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2f93eb45ee4343039b383fe1a111ecbf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContentDialog2(ptr: Pointer?): WithDefault = IContentDialog2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContentDialog2 {
      val address = segment.toRawLongValue()
      return makeIContentDialog2(Pointer(address))
    }

    public override fun toNative(obj: IContentDialog2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__587186253_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContentDialog2): Array<IContentDialog2?> = (elements as
        Array<IContentDialog2?>).castToImpl<IContentDialog2,IContentDialog2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContentDialog2?> =
        arrayOfNulls<IContentDialog2_Impl>(size) as Array<IContentDialog2?>
  }
}
