package Windows.Storage.Pickers

import Windows.Foundation.Collections.IMap
import Windows.Foundation.Collections.IVector
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

@ABIMarker(IFileSavePicker.ABI::class)
@Signature("{3286ffcb-617f-4cc5-af6a-b3fdf29ad145}")
@Guid("3286ffcb617f4cc5af6ab3fdf29ad145")
@WinRTInterface("3286ffcb617f4cc5af6ab3fdf29ad145")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFileSavePicker.ByReference::class)
public interface IFileSavePicker : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SettingsIdentifier(): String?

  @InterfaceMethod(1)
  public fun put_SettingsIdentifier(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_SuggestedStartLocation(): PickerLocationId?

  @InterfaceMethod(3)
  public fun put_SuggestedStartLocation(value: PickerLocationId?): Unit

  @InterfaceMethod(4)
  public fun get_CommitButtonText(): String?

  @InterfaceMethod(5)
  public fun put_CommitButtonText(value: String?): Unit

  @InterfaceMethod(6)
  public fun get_FileTypeChoices(): IMap<String?, IVector<String?>?>?

  @InterfaceMethod(7)
  public fun get_DefaultFileExtension(): String?

  @InterfaceMethod(8)
  public fun put_DefaultFileExtension(value: String?): Unit

  @InterfaceMethod(9)
  public fun get_SuggestedSaveFile(): StorageFile?

  @InterfaceMethod(10)
  public fun put_SuggestedSaveFile(value: StorageFile?): Unit

  @InterfaceMethod(11)
  public fun get_SuggestedFileName(): String?

  @InterfaceMethod(12)
  public fun put_SuggestedFileName(value: String?): Unit

  @InterfaceMethod(13)
  public fun PickSaveFileAsync(): IAsyncOperation<StorageFile?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFileSavePicker> {
    public override fun getValue() = ABI.makeIFileSavePicker(pointer.getPointer(0))

    public fun setValue(value: IFileSavePicker_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFileSavePicker {
    public val __663491945_Ptr: Pointer?

    public val _663491945_VtblPtr: Pointer?
      get() = __663491945_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SettingsIdentifier(): String? {
      val fnPtr = _663491945_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__663491945_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_SettingsIdentifier(value: String?): Unit {
      val fnPtr = _663491945_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__663491945_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_SuggestedStartLocation(): PickerLocationId? {
      val fnPtr = _663491945_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PickerLocationId>()
      val hr = fn.invokeHR(arrayOf(__663491945_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PickerLocationId>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_SuggestedStartLocation(value: PickerLocationId?): Unit {
      val fnPtr = _663491945_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__663491945_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_CommitButtonText(): String? {
      val fnPtr = _663491945_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__663491945_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_CommitButtonText(value: String?): Unit {
      val fnPtr = _663491945_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__663491945_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_FileTypeChoices(): IMap<String?, IVector<String?>?>? {
      val fnPtr = _663491945_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMap<String?, IVector<String?>?>>()
      val hr = fn.invokeHR(arrayOf(__663491945_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMap<String?, IVector<String?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_DefaultFileExtension(): String? {
      val fnPtr = _663491945_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__663491945_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun put_DefaultFileExtension(value: String?): Unit {
      val fnPtr = _663491945_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__663491945_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_SuggestedSaveFile(): StorageFile? {
      val fnPtr = _663491945_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageFile>()
      val hr = fn.invokeHR(arrayOf(__663491945_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageFile>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun put_SuggestedSaveFile(value: StorageFile?): Unit {
      val fnPtr = _663491945_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__663491945_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun get_SuggestedFileName(): String? {
      val fnPtr = _663491945_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__663491945_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun put_SuggestedFileName(value: String?): Unit {
      val fnPtr = _663491945_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__663491945_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun PickSaveFileAsync(): IAsyncOperation<StorageFile?>? {
      val fnPtr = _663491945_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StorageFile?>>()
      val hr = fn.invokeHR(arrayOf(__663491945_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<StorageFile?>>(result.getValue())
      return resultValue
    }
  }

  public class IFileSavePicker_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __663491945_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFileSavePicker, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3286ffcb617f4cc5af6ab3fdf29ad145")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFileSavePicker(ptr: Pointer?): WithDefault = IFileSavePicker_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFileSavePicker {
      val address = segment.toRawLongValue()
      return makeIFileSavePicker(Pointer(address))
    }

    public override fun toNative(obj: IFileSavePicker): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__663491945_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFileSavePicker): Array<IFileSavePicker?> = (elements as
        Array<IFileSavePicker?>).castToImpl<IFileSavePicker,IFileSavePicker_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFileSavePicker?> =
        arrayOfNulls<IFileSavePicker_Impl>(size) as Array<IFileSavePicker?>
  }
}
