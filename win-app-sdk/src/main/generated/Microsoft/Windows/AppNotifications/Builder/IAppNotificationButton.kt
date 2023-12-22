package Microsoft.Windows.AppNotifications.Builder

import Windows.Foundation.Collections.IMap
import Windows.Foundation.Uri
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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAppNotificationButton.ABI::class)
@Signature("{a7c03031-5634-5098-aec9-47ecb60c3499}")
@Guid("a7c0303156345098aec947ecb60c3499")
@WinRTInterface("a7c0303156345098aec947ecb60c3499")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppNotificationButton.ByReference::class)
public interface IAppNotificationButton : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Content(): String?

  @InterfaceMethod(1)
  public fun put_Content(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_Arguments(): IMap<String?, String?>?

  @InterfaceMethod(3)
  public fun put_Arguments(value: IMap<String?, String?>?): Unit

  @InterfaceMethod(4)
  public fun get_Icon(): Uri?

  @InterfaceMethod(5)
  public fun put_Icon(value: Uri?): Unit

  @InterfaceMethod(6)
  public fun get_ToolTip(): String?

  @InterfaceMethod(7)
  public fun put_ToolTip(value: String?): Unit

  @InterfaceMethod(8)
  public fun get_ContextMenuPlacement(): Boolean

  @InterfaceMethod(9)
  public fun put_ContextMenuPlacement(value: Boolean): Unit

  @InterfaceMethod(10)
  public fun get_ButtonStyle(): AppNotificationButtonStyle?

  @InterfaceMethod(11)
  public fun put_ButtonStyle(value: AppNotificationButtonStyle?): Unit

  @InterfaceMethod(12)
  public fun get_InputId(): String?

  @InterfaceMethod(13)
  public fun put_InputId(value: String?): Unit

  @InterfaceMethod(14)
  public fun get_InvokeUri(): Uri?

  @InterfaceMethod(15)
  public fun put_InvokeUri(value: Uri?): Unit

  @InterfaceMethod(16)
  public fun get_TargetAppId(): String?

  @InterfaceMethod(17)
  public fun put_TargetAppId(value: String?): Unit

  @InterfaceMethod(18)
  public fun AddArgument(key: String?, value: String?): AppNotificationButton?

  @InterfaceMethod(19)
  public fun SetIcon(value: Uri?): AppNotificationButton?

  @InterfaceMethod(20)
  public fun SetToolTip(value: String?): AppNotificationButton?

  @InterfaceMethod(21)
  public fun SetContextMenuPlacement(): AppNotificationButton?

  @InterfaceMethod(22)
  public fun SetButtonStyle(value: AppNotificationButtonStyle?): AppNotificationButton?

  @InterfaceMethod(23)
  public fun SetInputId(value: String?): AppNotificationButton?

  @InterfaceMethod(24)
  public fun SetInvokeUri(protocolUri: Uri?): AppNotificationButton?

  @InterfaceMethod(25)
  public fun SetInvokeUri(protocolUri: Uri?, targetAppId: String?): AppNotificationButton?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppNotificationButton> {
    public override fun getValue() = ABI.makeIAppNotificationButton(pointer.getPointer(0))

    public fun setValue(value: IAppNotificationButton_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppNotificationButton {
    public val __1201055028_Ptr: Pointer?

    public val _1201055028_VtblPtr: Pointer?
      get() = __1201055028_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Content(): String? {
      val fnPtr = _1201055028_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1201055028_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Content(value: String?): Unit {
      val fnPtr = _1201055028_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1201055028_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Arguments(): IMap<String?, String?>? {
      val fnPtr = _1201055028_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMap<String?, String?>>()
      val hr = fn.invokeHR(arrayOf(__1201055028_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMap<String?, String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Arguments(value: IMap<String?, String?>?): Unit {
      val fnPtr = _1201055028_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1201055028_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Icon(): Uri? {
      val fnPtr = _1201055028_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__1201055028_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_Icon(value: Uri?): Unit {
      val fnPtr = _1201055028_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1201055028_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_ToolTip(): String? {
      val fnPtr = _1201055028_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1201055028_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_ToolTip(value: String?): Unit {
      val fnPtr = _1201055028_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1201055028_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_ContextMenuPlacement(): Boolean {
      val fnPtr = _1201055028_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1201055028_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_ContextMenuPlacement(value: Boolean): Unit {
      val fnPtr = _1201055028_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1201055028_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_ButtonStyle(): AppNotificationButtonStyle? {
      val fnPtr = _1201055028_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppNotificationButtonStyle>()
      val hr = fn.invokeHR(arrayOf(__1201055028_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppNotificationButtonStyle>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_ButtonStyle(value: AppNotificationButtonStyle?): Unit {
      val fnPtr = _1201055028_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1201055028_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_InputId(): String? {
      val fnPtr = _1201055028_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1201055028_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_InputId(value: String?): Unit {
      val fnPtr = _1201055028_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1201055028_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_InvokeUri(): Uri? {
      val fnPtr = _1201055028_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__1201055028_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun put_InvokeUri(value: Uri?): Unit {
      val fnPtr = _1201055028_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1201055028_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_TargetAppId(): String? {
      val fnPtr = _1201055028_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1201055028_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun put_TargetAppId(value: String?): Unit {
      val fnPtr = _1201055028_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1201055028_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun AddArgument(key: String?, value: String?): AppNotificationButton? {
      val fnPtr = _1201055028_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppNotificationButton>()
      val hr = fn.invokeHR(arrayOf(__1201055028_Ptr, marshalToNative(key), marshalToNative(value),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppNotificationButton>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun SetIcon(value: Uri?): AppNotificationButton? {
      val fnPtr = _1201055028_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppNotificationButton>()
      val hr = fn.invokeHR(arrayOf(__1201055028_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppNotificationButton>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun SetToolTip(value: String?): AppNotificationButton? {
      val fnPtr = _1201055028_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppNotificationButton>()
      val hr = fn.invokeHR(arrayOf(__1201055028_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppNotificationButton>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun SetContextMenuPlacement(): AppNotificationButton? {
      val fnPtr = _1201055028_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppNotificationButton>()
      val hr = fn.invokeHR(arrayOf(__1201055028_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppNotificationButton>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(22)
    public override fun SetButtonStyle(value: AppNotificationButtonStyle?): AppNotificationButton? {
      val fnPtr = _1201055028_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppNotificationButton>()
      val hr = fn.invokeHR(arrayOf(__1201055028_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppNotificationButton>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun SetInputId(value: String?): AppNotificationButton? {
      val fnPtr = _1201055028_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppNotificationButton>()
      val hr = fn.invokeHR(arrayOf(__1201055028_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppNotificationButton>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(24)
    public override fun SetInvokeUri(protocolUri: Uri?): AppNotificationButton? {
      val fnPtr = _1201055028_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppNotificationButton>()
      val hr = fn.invokeHR(arrayOf(__1201055028_Ptr, marshalToNative(protocolUri), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppNotificationButton>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun SetInvokeUri(protocolUri: Uri?, targetAppId: String?):
        AppNotificationButton? {
      val fnPtr = _1201055028_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppNotificationButton>()
      val hr = fn.invokeHR(arrayOf(__1201055028_Ptr, marshalToNative(protocolUri),
          marshalToNative(targetAppId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppNotificationButton>(result.getValue())
      return resultValue
    }
  }

  public class IAppNotificationButton_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1201055028_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppNotificationButton, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a7c0303156345098aec947ecb60c3499")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppNotificationButton(ptr: Pointer?): WithDefault =
        IAppNotificationButton_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppNotificationButton {
      val address = segment.toRawLongValue()
      return makeIAppNotificationButton(Pointer(address))
    }

    public override fun toNative(obj: IAppNotificationButton): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1201055028_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppNotificationButton): Array<IAppNotificationButton?> =
        (elements as
        Array<IAppNotificationButton?>).castToImpl<IAppNotificationButton,IAppNotificationButton_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppNotificationButton?> =
        arrayOfNulls<IAppNotificationButton_Impl>(size) as Array<IAppNotificationButton?>
  }
}
