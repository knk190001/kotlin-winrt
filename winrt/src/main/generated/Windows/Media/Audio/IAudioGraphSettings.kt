package Windows.Media.Audio

import Windows.Devices.Enumeration.DeviceInformation
import Windows.Media.AudioProcessing
import Windows.Media.MediaProperties.AudioEncodingProperties
import Windows.Media.Render.AudioRenderCategory
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

@ABIMarker(IAudioGraphSettings.ABI::class)
@Signature("{1d59647f-e6fe-4628-84f8-9d8bdba25785}")
@Guid("1d59647fe6fe462884f89d8bdba25785")
@WinRTInterface("1d59647fe6fe462884f89d8bdba25785")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAudioGraphSettings.ByReference::class)
public interface IAudioGraphSettings : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_EncodingProperties(): AudioEncodingProperties?

  @InterfaceMethod(1)
  public fun put_EncodingProperties(value: AudioEncodingProperties?): Unit

  @InterfaceMethod(2)
  public fun get_PrimaryRenderDevice(): DeviceInformation?

  @InterfaceMethod(3)
  public fun put_PrimaryRenderDevice(value: DeviceInformation?): Unit

  @InterfaceMethod(4)
  public fun get_QuantumSizeSelectionMode(): QuantumSizeSelectionMode?

  @InterfaceMethod(5)
  public fun put_QuantumSizeSelectionMode(value: QuantumSizeSelectionMode?): Unit

  @InterfaceMethod(6)
  public fun get_DesiredSamplesPerQuantum(): Int

  @InterfaceMethod(7)
  public fun put_DesiredSamplesPerQuantum(value: Int): Unit

  @InterfaceMethod(8)
  public fun get_AudioRenderCategory(): AudioRenderCategory?

  @InterfaceMethod(9)
  public fun put_AudioRenderCategory(value: AudioRenderCategory?): Unit

  @InterfaceMethod(10)
  public fun get_DesiredRenderDeviceAudioProcessing(): AudioProcessing?

  @InterfaceMethod(11)
  public fun put_DesiredRenderDeviceAudioProcessing(value: AudioProcessing?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAudioGraphSettings> {
    public override fun getValue() = ABI.makeIAudioGraphSettings(pointer.getPointer(0))

    public fun setValue(value: IAudioGraphSettings_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAudioGraphSettings {
    public val __1934541853_Ptr: Pointer?

    public val _1934541853_VtblPtr: Pointer?
      get() = __1934541853_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_EncodingProperties(): AudioEncodingProperties? {
      val fnPtr = _1934541853_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioEncodingProperties>()
      val hr = fn.invokeHR(arrayOf(__1934541853_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioEncodingProperties>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_EncodingProperties(value: AudioEncodingProperties?): Unit {
      val fnPtr = _1934541853_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1934541853_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_PrimaryRenderDevice(): DeviceInformation? {
      val fnPtr = _1934541853_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DeviceInformation>()
      val hr = fn.invokeHR(arrayOf(__1934541853_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DeviceInformation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_PrimaryRenderDevice(value: DeviceInformation?): Unit {
      val fnPtr = _1934541853_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1934541853_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_QuantumSizeSelectionMode(): QuantumSizeSelectionMode? {
      val fnPtr = _1934541853_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<QuantumSizeSelectionMode>()
      val hr = fn.invokeHR(arrayOf(__1934541853_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<QuantumSizeSelectionMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_QuantumSizeSelectionMode(value: QuantumSizeSelectionMode?): Unit {
      val fnPtr = _1934541853_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1934541853_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_DesiredSamplesPerQuantum(): Int {
      val fnPtr = _1934541853_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1934541853_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_DesiredSamplesPerQuantum(value: Int): Unit {
      val fnPtr = _1934541853_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1934541853_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_AudioRenderCategory(): AudioRenderCategory? {
      val fnPtr = _1934541853_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioRenderCategory>()
      val hr = fn.invokeHR(arrayOf(__1934541853_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioRenderCategory>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_AudioRenderCategory(value: AudioRenderCategory?): Unit {
      val fnPtr = _1934541853_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1934541853_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_DesiredRenderDeviceAudioProcessing(): AudioProcessing? {
      val fnPtr = _1934541853_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioProcessing>()
      val hr = fn.invokeHR(arrayOf(__1934541853_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioProcessing>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_DesiredRenderDeviceAudioProcessing(value: AudioProcessing?): Unit {
      val fnPtr = _1934541853_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1934541853_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAudioGraphSettings_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1934541853_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAudioGraphSettings, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1d59647fe6fe462884f89d8bdba25785")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAudioGraphSettings(ptr: Pointer?): WithDefault = IAudioGraphSettings_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAudioGraphSettings {
      val address = segment.toRawLongValue()
      return makeIAudioGraphSettings(Pointer(address))
    }

    public override fun toNative(obj: IAudioGraphSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1934541853_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAudioGraphSettings): Array<IAudioGraphSettings?> =
        (elements as
        Array<IAudioGraphSettings?>).castToImpl<IAudioGraphSettings,IAudioGraphSettings_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAudioGraphSettings?> =
        arrayOfNulls<IAudioGraphSettings_Impl>(size) as Array<IAudioGraphSettings?>
  }
}
