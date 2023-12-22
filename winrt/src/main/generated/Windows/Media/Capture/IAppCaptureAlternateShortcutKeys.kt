package Windows.Media.Capture

import Windows.System.VirtualKey
import Windows.System.VirtualKeyModifiers
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAppCaptureAlternateShortcutKeys.ABI::class)
@Signature("{19e8e0ef-236c-40f9-b38f-9b7dd65d1ccc}")
@Guid("19e8e0ef236c40f9b38f9b7dd65d1ccc")
@WinRTInterface("19e8e0ef236c40f9b38f9b7dd65d1ccc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppCaptureAlternateShortcutKeys.ByReference::class)
public interface IAppCaptureAlternateShortcutKeys : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_ToggleGameBarKey(value: VirtualKey?): Unit

  @InterfaceMethod(1)
  public fun get_ToggleGameBarKey(): VirtualKey?

  @InterfaceMethod(2)
  public fun put_ToggleGameBarKeyModifiers(value: VirtualKeyModifiers?): Unit

  @InterfaceMethod(3)
  public fun get_ToggleGameBarKeyModifiers(): VirtualKeyModifiers?

  @InterfaceMethod(4)
  public fun put_SaveHistoricalVideoKey(value: VirtualKey?): Unit

  @InterfaceMethod(5)
  public fun get_SaveHistoricalVideoKey(): VirtualKey?

  @InterfaceMethod(6)
  public fun put_SaveHistoricalVideoKeyModifiers(value: VirtualKeyModifiers?): Unit

  @InterfaceMethod(7)
  public fun get_SaveHistoricalVideoKeyModifiers(): VirtualKeyModifiers?

  @InterfaceMethod(8)
  public fun put_ToggleRecordingKey(value: VirtualKey?): Unit

  @InterfaceMethod(9)
  public fun get_ToggleRecordingKey(): VirtualKey?

  @InterfaceMethod(10)
  public fun put_ToggleRecordingKeyModifiers(value: VirtualKeyModifiers?): Unit

  @InterfaceMethod(11)
  public fun get_ToggleRecordingKeyModifiers(): VirtualKeyModifiers?

  @InterfaceMethod(12)
  public fun put_TakeScreenshotKey(value: VirtualKey?): Unit

  @InterfaceMethod(13)
  public fun get_TakeScreenshotKey(): VirtualKey?

  @InterfaceMethod(14)
  public fun put_TakeScreenshotKeyModifiers(value: VirtualKeyModifiers?): Unit

  @InterfaceMethod(15)
  public fun get_TakeScreenshotKeyModifiers(): VirtualKeyModifiers?

  @InterfaceMethod(16)
  public fun put_ToggleRecordingIndicatorKey(value: VirtualKey?): Unit

  @InterfaceMethod(17)
  public fun get_ToggleRecordingIndicatorKey(): VirtualKey?

  @InterfaceMethod(18)
  public fun put_ToggleRecordingIndicatorKeyModifiers(value: VirtualKeyModifiers?): Unit

  @InterfaceMethod(19)
  public fun get_ToggleRecordingIndicatorKeyModifiers(): VirtualKeyModifiers?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppCaptureAlternateShortcutKeys> {
    public override fun getValue() = ABI.makeIAppCaptureAlternateShortcutKeys(pointer.getPointer(0))

    public fun setValue(value: IAppCaptureAlternateShortcutKeys_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppCaptureAlternateShortcutKeys {
    public val __279358775_Ptr: Pointer?

    public val _279358775_VtblPtr: Pointer?
      get() = __279358775_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_ToggleGameBarKey(value: VirtualKey?): Unit {
      val fnPtr = _279358775_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__279358775_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_ToggleGameBarKey(): VirtualKey? {
      val fnPtr = _279358775_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VirtualKey>()
      val hr = fn.invokeHR(arrayOf(__279358775_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VirtualKey>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_ToggleGameBarKeyModifiers(value: VirtualKeyModifiers?): Unit {
      val fnPtr = _279358775_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__279358775_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_ToggleGameBarKeyModifiers(): VirtualKeyModifiers? {
      val fnPtr = _279358775_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VirtualKeyModifiers>()
      val hr = fn.invokeHR(arrayOf(__279358775_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VirtualKeyModifiers>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_SaveHistoricalVideoKey(value: VirtualKey?): Unit {
      val fnPtr = _279358775_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__279358775_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_SaveHistoricalVideoKey(): VirtualKey? {
      val fnPtr = _279358775_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VirtualKey>()
      val hr = fn.invokeHR(arrayOf(__279358775_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VirtualKey>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_SaveHistoricalVideoKeyModifiers(value: VirtualKeyModifiers?): Unit {
      val fnPtr = _279358775_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__279358775_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_SaveHistoricalVideoKeyModifiers(): VirtualKeyModifiers? {
      val fnPtr = _279358775_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VirtualKeyModifiers>()
      val hr = fn.invokeHR(arrayOf(__279358775_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VirtualKeyModifiers>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun put_ToggleRecordingKey(value: VirtualKey?): Unit {
      val fnPtr = _279358775_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__279358775_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_ToggleRecordingKey(): VirtualKey? {
      val fnPtr = _279358775_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VirtualKey>()
      val hr = fn.invokeHR(arrayOf(__279358775_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VirtualKey>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun put_ToggleRecordingKeyModifiers(value: VirtualKeyModifiers?): Unit {
      val fnPtr = _279358775_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__279358775_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun get_ToggleRecordingKeyModifiers(): VirtualKeyModifiers? {
      val fnPtr = _279358775_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VirtualKeyModifiers>()
      val hr = fn.invokeHR(arrayOf(__279358775_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VirtualKeyModifiers>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun put_TakeScreenshotKey(value: VirtualKey?): Unit {
      val fnPtr = _279358775_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__279358775_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun get_TakeScreenshotKey(): VirtualKey? {
      val fnPtr = _279358775_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VirtualKey>()
      val hr = fn.invokeHR(arrayOf(__279358775_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VirtualKey>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun put_TakeScreenshotKeyModifiers(value: VirtualKeyModifiers?): Unit {
      val fnPtr = _279358775_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__279358775_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun get_TakeScreenshotKeyModifiers(): VirtualKeyModifiers? {
      val fnPtr = _279358775_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VirtualKeyModifiers>()
      val hr = fn.invokeHR(arrayOf(__279358775_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VirtualKeyModifiers>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun put_ToggleRecordingIndicatorKey(value: VirtualKey?): Unit {
      val fnPtr = _279358775_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__279358775_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(17)
    public override fun get_ToggleRecordingIndicatorKey(): VirtualKey? {
      val fnPtr = _279358775_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VirtualKey>()
      val hr = fn.invokeHR(arrayOf(__279358775_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VirtualKey>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun put_ToggleRecordingIndicatorKeyModifiers(value: VirtualKeyModifiers?):
        Unit {
      val fnPtr = _279358775_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__279358775_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(19)
    public override fun get_ToggleRecordingIndicatorKeyModifiers(): VirtualKeyModifiers? {
      val fnPtr = _279358775_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VirtualKeyModifiers>()
      val hr = fn.invokeHR(arrayOf(__279358775_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VirtualKeyModifiers>(result.getValue())
      return resultValue
    }
  }

  public class IAppCaptureAlternateShortcutKeys_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __279358775_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppCaptureAlternateShortcutKeys, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("19e8e0ef236c40f9b38f9b7dd65d1ccc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppCaptureAlternateShortcutKeys(ptr: Pointer?): WithDefault =
        IAppCaptureAlternateShortcutKeys_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppCaptureAlternateShortcutKeys {
      val address = segment.toRawLongValue()
      return makeIAppCaptureAlternateShortcutKeys(Pointer(address))
    }

    public override fun toNative(obj: IAppCaptureAlternateShortcutKeys): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__279358775_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppCaptureAlternateShortcutKeys):
        Array<IAppCaptureAlternateShortcutKeys?> = (elements as
        Array<IAppCaptureAlternateShortcutKeys?>).castToImpl<IAppCaptureAlternateShortcutKeys,IAppCaptureAlternateShortcutKeys_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppCaptureAlternateShortcutKeys?> =
        arrayOfNulls<IAppCaptureAlternateShortcutKeys_Impl>(size) as
        Array<IAppCaptureAlternateShortcutKeys?>
  }
}
