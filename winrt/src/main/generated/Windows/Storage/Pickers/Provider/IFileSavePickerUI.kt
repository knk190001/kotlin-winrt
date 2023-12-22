package Windows.Storage.Pickers.Provider

import Windows.Foundation.Collections.IVectorView
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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IFileSavePickerUI.ABI::class)
@Signature("{9656c1e7-3e56-43cc-8a39-33c73d9d542b}")
@Guid("9656c1e73e5643cc8a3933c73d9d542b")
@WinRTInterface("9656c1e73e5643cc8a3933c73d9d542b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFileSavePickerUI.ByReference::class)
public interface IFileSavePickerUI : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Title(): String?

  @InterfaceMethod(1)
  public fun put_Title(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_AllowedFileTypes(): IVectorView<String?>?

  @InterfaceMethod(3)
  public fun get_SettingsIdentifier(): String?

  @InterfaceMethod(4)
  public fun get_FileName(): String?

  @InterfaceMethod(5)
  public fun TrySetFileName(value: String?): SetFileNameResult?

  @InterfaceMethod(6)
  public fun add_FileNameChanged(handler: TypedEventHandler<FileSavePickerUI?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_FileNameChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(8)
  public fun add_TargetFileRequested(handler: TypedEventHandler<FileSavePickerUI?,
      TargetFileRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(9)
  public fun remove_TargetFileRequested(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFileSavePickerUI> {
    public override fun getValue() = ABI.makeIFileSavePickerUI(pointer.getPointer(0))

    public fun setValue(value: IFileSavePickerUI_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFileSavePickerUI {
    public val __1036403572_Ptr: Pointer?

    public val _1036403572_VtblPtr: Pointer?
      get() = __1036403572_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Title(): String? {
      val fnPtr = _1036403572_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1036403572_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Title(value: String?): Unit {
      val fnPtr = _1036403572_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1036403572_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_AllowedFileTypes(): IVectorView<String?>? {
      val fnPtr = _1036403572_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<String?>>()
      val hr = fn.invokeHR(arrayOf(__1036403572_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_SettingsIdentifier(): String? {
      val fnPtr = _1036403572_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1036403572_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_FileName(): String? {
      val fnPtr = _1036403572_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1036403572_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun TrySetFileName(value: String?): SetFileNameResult? {
      val fnPtr = _1036403572_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SetFileNameResult>()
      val hr = fn.invokeHR(arrayOf(__1036403572_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SetFileNameResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun add_FileNameChanged(handler: TypedEventHandler<FileSavePickerUI?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1036403572_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1036403572_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_FileNameChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1036403572_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1036403572_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun add_TargetFileRequested(handler: TypedEventHandler<FileSavePickerUI?,
        TargetFileRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1036403572_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1036403572_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun remove_TargetFileRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _1036403572_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1036403572_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IFileSavePickerUI_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1036403572_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFileSavePickerUI, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9656c1e73e5643cc8a3933c73d9d542b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFileSavePickerUI(ptr: Pointer?): WithDefault = IFileSavePickerUI_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFileSavePickerUI {
      val address = segment.toRawLongValue()
      return makeIFileSavePickerUI(Pointer(address))
    }

    public override fun toNative(obj: IFileSavePickerUI): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1036403572_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFileSavePickerUI): Array<IFileSavePickerUI?> = (elements
        as Array<IFileSavePickerUI?>).castToImpl<IFileSavePickerUI,IFileSavePickerUI_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFileSavePickerUI?> =
        arrayOfNulls<IFileSavePickerUI_Impl>(size) as Array<IFileSavePickerUI?>
  }
}
