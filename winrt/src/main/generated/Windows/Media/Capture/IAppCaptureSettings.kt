package Windows.Media.Capture

import Windows.Foundation.TimeSpan
import Windows.Storage.StorageFolder
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
import com.sun.jna.platform.win32.WinDef
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAppCaptureSettings.ABI::class)
@Signature("{14683a86-8807-48d3-883a-970ee4532a39}")
@Guid("14683a86880748d3883a970ee4532a39")
@WinRTInterface("14683a86880748d3883a970ee4532a39")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppCaptureSettings.ByReference::class)
public interface IAppCaptureSettings : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_AppCaptureDestinationFolder(value: StorageFolder?): Unit

  @InterfaceMethod(1)
  public fun get_AppCaptureDestinationFolder(): StorageFolder?

  @InterfaceMethod(2)
  public fun put_AudioEncodingBitrate(value: WinDef.UINT): Unit

  @InterfaceMethod(3)
  public fun get_AudioEncodingBitrate(): WinDef.UINT

  @InterfaceMethod(4)
  public fun put_IsAudioCaptureEnabled(value: Boolean): Unit

  @InterfaceMethod(5)
  public fun get_IsAudioCaptureEnabled(): Boolean

  @InterfaceMethod(6)
  public fun put_CustomVideoEncodingBitrate(value: WinDef.UINT): Unit

  @InterfaceMethod(7)
  public fun get_CustomVideoEncodingBitrate(): WinDef.UINT

  @InterfaceMethod(8)
  public fun put_CustomVideoEncodingHeight(value: WinDef.UINT): Unit

  @InterfaceMethod(9)
  public fun get_CustomVideoEncodingHeight(): WinDef.UINT

  @InterfaceMethod(10)
  public fun put_CustomVideoEncodingWidth(value: WinDef.UINT): Unit

  @InterfaceMethod(11)
  public fun get_CustomVideoEncodingWidth(): WinDef.UINT

  @InterfaceMethod(12)
  public fun put_HistoricalBufferLength(value: WinDef.UINT): Unit

  @InterfaceMethod(13)
  public fun get_HistoricalBufferLength(): WinDef.UINT

  @InterfaceMethod(14)
  public fun put_HistoricalBufferLengthUnit(value: AppCaptureHistoricalBufferLengthUnit?): Unit

  @InterfaceMethod(15)
  public fun get_HistoricalBufferLengthUnit(): AppCaptureHistoricalBufferLengthUnit?

  @InterfaceMethod(16)
  public fun put_IsHistoricalCaptureEnabled(value: Boolean): Unit

  @InterfaceMethod(17)
  public fun get_IsHistoricalCaptureEnabled(): Boolean

  @InterfaceMethod(18)
  public fun put_IsHistoricalCaptureOnBatteryAllowed(value: Boolean): Unit

  @InterfaceMethod(19)
  public fun get_IsHistoricalCaptureOnBatteryAllowed(): Boolean

  @InterfaceMethod(20)
  public fun put_IsHistoricalCaptureOnWirelessDisplayAllowed(value: Boolean): Unit

  @InterfaceMethod(21)
  public fun get_IsHistoricalCaptureOnWirelessDisplayAllowed(): Boolean

  @InterfaceMethod(22)
  public fun put_MaximumRecordLength(value: TimeSpan?): Unit

  @InterfaceMethod(23)
  public fun get_MaximumRecordLength(): TimeSpan?

  @InterfaceMethod(24)
  public fun put_ScreenshotDestinationFolder(value: StorageFolder?): Unit

  @InterfaceMethod(25)
  public fun get_ScreenshotDestinationFolder(): StorageFolder?

  @InterfaceMethod(26)
  public fun put_VideoEncodingBitrateMode(value: AppCaptureVideoEncodingBitrateMode?): Unit

  @InterfaceMethod(27)
  public fun get_VideoEncodingBitrateMode(): AppCaptureVideoEncodingBitrateMode?

  @InterfaceMethod(28)
  public fun put_VideoEncodingResolutionMode(value: AppCaptureVideoEncodingResolutionMode?): Unit

  @InterfaceMethod(29)
  public fun get_VideoEncodingResolutionMode(): AppCaptureVideoEncodingResolutionMode?

  @InterfaceMethod(30)
  public fun put_IsAppCaptureEnabled(value: Boolean): Unit

  @InterfaceMethod(31)
  public fun get_IsAppCaptureEnabled(): Boolean

  @InterfaceMethod(32)
  public fun get_IsCpuConstrained(): Boolean

  @InterfaceMethod(33)
  public fun get_IsDisabledByPolicy(): Boolean

  @InterfaceMethod(34)
  public fun get_IsMemoryConstrained(): Boolean

  @InterfaceMethod(35)
  public fun get_HasHardwareEncoder(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppCaptureSettings> {
    public override fun getValue() = ABI.makeIAppCaptureSettings(pointer.getPointer(0))

    public fun setValue(value: IAppCaptureSettings_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppCaptureSettings {
    public val __600377600_Ptr: Pointer?

    public val _600377600_VtblPtr: Pointer?
      get() = __600377600_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_AppCaptureDestinationFolder(value: StorageFolder?): Unit {
      val fnPtr = _600377600_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__600377600_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_AppCaptureDestinationFolder(): StorageFolder? {
      val fnPtr = _600377600_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageFolder>()
      val hr = fn.invokeHR(arrayOf(__600377600_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageFolder>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_AudioEncodingBitrate(value: WinDef.UINT): Unit {
      val fnPtr = _600377600_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__600377600_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_AudioEncodingBitrate(): WinDef.UINT {
      val fnPtr = _600377600_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__600377600_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun put_IsAudioCaptureEnabled(value: Boolean): Unit {
      val fnPtr = _600377600_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__600377600_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_IsAudioCaptureEnabled(): Boolean {
      val fnPtr = _600377600_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__600377600_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun put_CustomVideoEncodingBitrate(value: WinDef.UINT): Unit {
      val fnPtr = _600377600_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__600377600_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_CustomVideoEncodingBitrate(): WinDef.UINT {
      val fnPtr = _600377600_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__600377600_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun put_CustomVideoEncodingHeight(value: WinDef.UINT): Unit {
      val fnPtr = _600377600_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__600377600_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_CustomVideoEncodingHeight(): WinDef.UINT {
      val fnPtr = _600377600_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__600377600_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(10)
    public override fun put_CustomVideoEncodingWidth(value: WinDef.UINT): Unit {
      val fnPtr = _600377600_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__600377600_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun get_CustomVideoEncodingWidth(): WinDef.UINT {
      val fnPtr = _600377600_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__600377600_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(12)
    public override fun put_HistoricalBufferLength(value: WinDef.UINT): Unit {
      val fnPtr = _600377600_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__600377600_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun get_HistoricalBufferLength(): WinDef.UINT {
      val fnPtr = _600377600_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__600377600_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(14)
    public override
        fun put_HistoricalBufferLengthUnit(value: AppCaptureHistoricalBufferLengthUnit?): Unit {
      val fnPtr = _600377600_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__600377600_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun get_HistoricalBufferLengthUnit(): AppCaptureHistoricalBufferLengthUnit? {
      val fnPtr = _600377600_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppCaptureHistoricalBufferLengthUnit>()
      val hr = fn.invokeHR(arrayOf(__600377600_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppCaptureHistoricalBufferLengthUnit>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun put_IsHistoricalCaptureEnabled(value: Boolean): Unit {
      val fnPtr = _600377600_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__600377600_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(17)
    public override fun get_IsHistoricalCaptureEnabled(): Boolean {
      val fnPtr = _600377600_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__600377600_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(18)
    public override fun put_IsHistoricalCaptureOnBatteryAllowed(value: Boolean): Unit {
      val fnPtr = _600377600_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__600377600_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(19)
    public override fun get_IsHistoricalCaptureOnBatteryAllowed(): Boolean {
      val fnPtr = _600377600_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__600377600_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(20)
    public override fun put_IsHistoricalCaptureOnWirelessDisplayAllowed(value: Boolean): Unit {
      val fnPtr = _600377600_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__600377600_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(21)
    public override fun get_IsHistoricalCaptureOnWirelessDisplayAllowed(): Boolean {
      val fnPtr = _600377600_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__600377600_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(22)
    public override fun put_MaximumRecordLength(value: TimeSpan?): Unit {
      val fnPtr = _600377600_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__600377600_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(23)
    public override fun get_MaximumRecordLength(): TimeSpan? {
      val fnPtr = _600377600_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__600377600_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(24)
    public override fun put_ScreenshotDestinationFolder(value: StorageFolder?): Unit {
      val fnPtr = _600377600_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__600377600_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(25)
    public override fun get_ScreenshotDestinationFolder(): StorageFolder? {
      val fnPtr = _600377600_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageFolder>()
      val hr = fn.invokeHR(arrayOf(__600377600_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageFolder>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(26)
    public override fun put_VideoEncodingBitrateMode(value: AppCaptureVideoEncodingBitrateMode?):
        Unit {
      val fnPtr = _600377600_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__600377600_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(27)
    public override fun get_VideoEncodingBitrateMode(): AppCaptureVideoEncodingBitrateMode? {
      val fnPtr = _600377600_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppCaptureVideoEncodingBitrateMode>()
      val hr = fn.invokeHR(arrayOf(__600377600_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppCaptureVideoEncodingBitrateMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(28)
    public override
        fun put_VideoEncodingResolutionMode(value: AppCaptureVideoEncodingResolutionMode?): Unit {
      val fnPtr = _600377600_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__600377600_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(29)
    public override fun get_VideoEncodingResolutionMode(): AppCaptureVideoEncodingResolutionMode? {
      val fnPtr = _600377600_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppCaptureVideoEncodingResolutionMode>()
      val hr = fn.invokeHR(arrayOf(__600377600_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppCaptureVideoEncodingResolutionMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(30)
    public override fun put_IsAppCaptureEnabled(value: Boolean): Unit {
      val fnPtr = _600377600_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__600377600_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(31)
    public override fun get_IsAppCaptureEnabled(): Boolean {
      val fnPtr = _600377600_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__600377600_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(32)
    public override fun get_IsCpuConstrained(): Boolean {
      val fnPtr = _600377600_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__600377600_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(33)
    public override fun get_IsDisabledByPolicy(): Boolean {
      val fnPtr = _600377600_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__600377600_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(34)
    public override fun get_IsMemoryConstrained(): Boolean {
      val fnPtr = _600377600_VtblPtr!!.getPointer(40L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__600377600_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(35)
    public override fun get_HasHardwareEncoder(): Boolean {
      val fnPtr = _600377600_VtblPtr!!.getPointer(41L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__600377600_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IAppCaptureSettings_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __600377600_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppCaptureSettings, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("14683a86880748d3883a970ee4532a39")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppCaptureSettings(ptr: Pointer?): WithDefault = IAppCaptureSettings_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppCaptureSettings {
      val address = segment.toRawLongValue()
      return makeIAppCaptureSettings(Pointer(address))
    }

    public override fun toNative(obj: IAppCaptureSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__600377600_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppCaptureSettings): Array<IAppCaptureSettings?> =
        (elements as
        Array<IAppCaptureSettings?>).castToImpl<IAppCaptureSettings,IAppCaptureSettings_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppCaptureSettings?> =
        arrayOfNulls<IAppCaptureSettings_Impl>(size) as Array<IAppCaptureSettings?>
  }
}
