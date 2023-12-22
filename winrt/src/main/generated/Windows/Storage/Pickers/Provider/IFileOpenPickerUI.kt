package Windows.Storage.Pickers.Provider

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import Windows.Storage.IStorageFile
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

@ABIMarker(IFileOpenPickerUI.ABI::class)
@Signature("{dda45a10-f9d4-40c4-8af5-c5b6b5a61d1d}")
@Guid("dda45a10f9d440c48af5c5b6b5a61d1d")
@WinRTInterface("dda45a10f9d440c48af5c5b6b5a61d1d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFileOpenPickerUI.ByReference::class)
public interface IFileOpenPickerUI : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun AddFile(id: String?, `file`: IStorageFile?): AddFileResult?

  @InterfaceMethod(1)
  public fun RemoveFile(id: String?): Unit

  @InterfaceMethod(2)
  public fun ContainsFile(id: String?): Boolean

  @InterfaceMethod(3)
  public fun CanAddFile(`file`: IStorageFile?): Boolean

  @InterfaceMethod(4)
  public fun get_AllowedFileTypes(): IVectorView<String?>?

  @InterfaceMethod(5)
  public fun get_SelectionMode(): FileSelectionMode?

  @InterfaceMethod(6)
  public fun get_SettingsIdentifier(): String?

  @InterfaceMethod(7)
  public fun get_Title(): String?

  @InterfaceMethod(8)
  public fun put_Title(value: String?): Unit

  @InterfaceMethod(9)
  public fun add_FileRemoved(handler: TypedEventHandler<FileOpenPickerUI?, FileRemovedEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(10)
  public fun remove_FileRemoved(token: EventRegistrationToken?): Unit

  @InterfaceMethod(11)
  public fun add_Closing(handler: TypedEventHandler<FileOpenPickerUI?, PickerClosingEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(12)
  public fun remove_Closing(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFileOpenPickerUI> {
    public override fun getValue() = ABI.makeIFileOpenPickerUI(pointer.getPointer(0))

    public fun setValue(value: IFileOpenPickerUI_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFileOpenPickerUI {
    public val __1516307545_Ptr: Pointer?

    public val _1516307545_VtblPtr: Pointer?
      get() = __1516307545_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun AddFile(id: String?, `file`: IStorageFile?): AddFileResult? {
      val fnPtr = _1516307545_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AddFileResult>()
      val hr = fn.invokeHR(arrayOf(__1516307545_Ptr, marshalToNative(id), marshalToNative(file),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AddFileResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun RemoveFile(id: String?): Unit {
      val fnPtr = _1516307545_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1516307545_Ptr, marshalToNative(id),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun ContainsFile(id: String?): Boolean {
      val fnPtr = _1516307545_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1516307545_Ptr, marshalToNative(id), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun CanAddFile(`file`: IStorageFile?): Boolean {
      val fnPtr = _1516307545_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1516307545_Ptr, marshalToNative(file), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_AllowedFileTypes(): IVectorView<String?>? {
      val fnPtr = _1516307545_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<String?>>()
      val hr = fn.invokeHR(arrayOf(__1516307545_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_SelectionMode(): FileSelectionMode? {
      val fnPtr = _1516307545_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FileSelectionMode>()
      val hr = fn.invokeHR(arrayOf(__1516307545_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FileSelectionMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_SettingsIdentifier(): String? {
      val fnPtr = _1516307545_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1516307545_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_Title(): String? {
      val fnPtr = _1516307545_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1516307545_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun put_Title(value: String?): Unit {
      val fnPtr = _1516307545_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1516307545_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun add_FileRemoved(handler: TypedEventHandler<FileOpenPickerUI?,
        FileRemovedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1516307545_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1516307545_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun remove_FileRemoved(token: EventRegistrationToken?): Unit {
      val fnPtr = _1516307545_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1516307545_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun add_Closing(handler: TypedEventHandler<FileOpenPickerUI?,
        PickerClosingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1516307545_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1516307545_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun remove_Closing(token: EventRegistrationToken?): Unit {
      val fnPtr = _1516307545_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1516307545_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IFileOpenPickerUI_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1516307545_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFileOpenPickerUI, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("dda45a10f9d440c48af5c5b6b5a61d1d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFileOpenPickerUI(ptr: Pointer?): WithDefault = IFileOpenPickerUI_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFileOpenPickerUI {
      val address = segment.toRawLongValue()
      return makeIFileOpenPickerUI(Pointer(address))
    }

    public override fun toNative(obj: IFileOpenPickerUI): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1516307545_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFileOpenPickerUI): Array<IFileOpenPickerUI?> = (elements
        as Array<IFileOpenPickerUI?>).castToImpl<IFileOpenPickerUI,IFileOpenPickerUI_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFileOpenPickerUI?> =
        arrayOfNulls<IFileOpenPickerUI_Impl>(size) as Array<IFileOpenPickerUI?>
  }
}
