package Windows.Media.Devices

import Windows.Storage.Streams.IBuffer
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

@ABIMarker(IAudioDeviceModuleNotificationEventArgs.ABI::class)
@Signature("{e3e3ccaf-224c-48be-956b-9a13134e96e8}")
@Guid("e3e3ccaf224c48be956b9a13134e96e8")
@WinRTInterface("e3e3ccaf224c48be956b9a13134e96e8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAudioDeviceModuleNotificationEventArgs.ByReference::class)
public interface IAudioDeviceModuleNotificationEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Module(): AudioDeviceModule?

  @InterfaceMethod(1)
  public fun get_NotificationData(): IBuffer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAudioDeviceModuleNotificationEventArgs> {
    public override fun getValue() =
        ABI.makeIAudioDeviceModuleNotificationEventArgs(pointer.getPointer(0))

    public fun setValue(value: IAudioDeviceModuleNotificationEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAudioDeviceModuleNotificationEventArgs {
    public val __202540587_Ptr: Pointer?

    public val _202540587_VtblPtr: Pointer?
      get() = __202540587_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Module(): AudioDeviceModule? {
      val fnPtr = _202540587_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioDeviceModule>()
      val hr = fn.invokeHR(arrayOf(__202540587_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioDeviceModule>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_NotificationData(): IBuffer? {
      val fnPtr = _202540587_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__202540587_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }
  }

  public class IAudioDeviceModuleNotificationEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __202540587_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAudioDeviceModuleNotificationEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e3e3ccaf224c48be956b9a13134e96e8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAudioDeviceModuleNotificationEventArgs(ptr: Pointer?): WithDefault =
        IAudioDeviceModuleNotificationEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IAudioDeviceModuleNotificationEventArgs {
      val address = segment.toRawLongValue()
      return makeIAudioDeviceModuleNotificationEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IAudioDeviceModuleNotificationEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__202540587_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAudioDeviceModuleNotificationEventArgs):
        Array<IAudioDeviceModuleNotificationEventArgs?> = (elements as
        Array<IAudioDeviceModuleNotificationEventArgs?>).castToImpl<IAudioDeviceModuleNotificationEventArgs,IAudioDeviceModuleNotificationEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAudioDeviceModuleNotificationEventArgs?> =
        arrayOfNulls<IAudioDeviceModuleNotificationEventArgs_Impl>(size) as
        Array<IAudioDeviceModuleNotificationEventArgs?>
  }
}
