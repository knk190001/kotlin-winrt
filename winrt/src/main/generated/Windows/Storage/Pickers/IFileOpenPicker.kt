package Windows.Storage.Pickers

import Windows.Foundation.Collections.IVector
import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IAsyncOperation
import Windows.Storage.StorageFile
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

@ABIMarker(IFileOpenPicker.ABI::class)
@Signature("{2ca8278a-12c5-4c5f-8977-94547793c241}")
@Guid("2ca8278a12c54c5f897794547793c241")
@WinRTInterface("2ca8278a12c54c5f897794547793c241")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFileOpenPicker.ByReference::class)
public interface IFileOpenPicker : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ViewMode(): PickerViewMode?

  @InterfaceMethod(1)
  public fun put_ViewMode(value: PickerViewMode?): Unit

  @InterfaceMethod(2)
  public fun get_SettingsIdentifier(): String?

  @InterfaceMethod(3)
  public fun put_SettingsIdentifier(value: String?): Unit

  @InterfaceMethod(4)
  public fun get_SuggestedStartLocation(): PickerLocationId?

  @InterfaceMethod(5)
  public fun put_SuggestedStartLocation(value: PickerLocationId?): Unit

  @InterfaceMethod(6)
  public fun get_CommitButtonText(): String?

  @InterfaceMethod(7)
  public fun put_CommitButtonText(value: String?): Unit

  @InterfaceMethod(8)
  public fun get_FileTypeFilter(): IVector<String?>?

  @InterfaceMethod(9)
  public fun PickSingleFileAsync(): IAsyncOperation<StorageFile?>?

  @InterfaceMethod(10)
  public fun PickMultipleFilesAsync(): IAsyncOperation<IVectorView<StorageFile?>?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFileOpenPicker> {
    public override fun getValue() = ABI.makeIFileOpenPicker(pointer.getPointer(0))

    public fun setValue(value: IFileOpenPicker_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFileOpenPicker {
    public val __57873290_Ptr: Pointer?

    public val _57873290_VtblPtr: Pointer?
      get() = __57873290_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ViewMode(): PickerViewMode? {
      val fnPtr = _57873290_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PickerViewMode>()
      val hr = fn.invokeHR(arrayOf(__57873290_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PickerViewMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_ViewMode(value: PickerViewMode?): Unit {
      val fnPtr = _57873290_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__57873290_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_SettingsIdentifier(): String? {
      val fnPtr = _57873290_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__57873290_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_SettingsIdentifier(value: String?): Unit {
      val fnPtr = _57873290_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__57873290_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_SuggestedStartLocation(): PickerLocationId? {
      val fnPtr = _57873290_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PickerLocationId>()
      val hr = fn.invokeHR(arrayOf(__57873290_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PickerLocationId>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_SuggestedStartLocation(value: PickerLocationId?): Unit {
      val fnPtr = _57873290_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__57873290_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_CommitButtonText(): String? {
      val fnPtr = _57873290_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__57873290_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_CommitButtonText(value: String?): Unit {
      val fnPtr = _57873290_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__57873290_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_FileTypeFilter(): IVector<String?>? {
      val fnPtr = _57873290_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__57873290_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun PickSingleFileAsync(): IAsyncOperation<StorageFile?>? {
      val fnPtr = _57873290_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StorageFile?>>()
      val hr = fn.invokeHR(arrayOf(__57873290_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<StorageFile?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun PickMultipleFilesAsync(): IAsyncOperation<IVectorView<StorageFile?>?>? {
      val fnPtr = _57873290_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<StorageFile?>?>>()
      val hr = fn.invokeHR(arrayOf(__57873290_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<StorageFile?>?>>(result.getValue())
      return resultValue
    }
  }

  public class IFileOpenPicker_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __57873290_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFileOpenPicker, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2ca8278a12c54c5f897794547793c241")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFileOpenPicker(ptr: Pointer?): WithDefault = IFileOpenPicker_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFileOpenPicker {
      val address = segment.toRawLongValue()
      return makeIFileOpenPicker(Pointer(address))
    }

    public override fun toNative(obj: IFileOpenPicker): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__57873290_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFileOpenPicker): Array<IFileOpenPicker?> = (elements as
        Array<IFileOpenPicker?>).castToImpl<IFileOpenPicker,IFileOpenPicker_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFileOpenPicker?> =
        arrayOfNulls<IFileOpenPicker_Impl>(size) as Array<IFileOpenPicker?>
  }
}
