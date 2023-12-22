package Windows.Media.Audio

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import Windows.Media.SoundLevel
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAudioStateMonitor.ABI::class)
@Signature("{1d13d136-0199-4cdc-b84e-e72c2b581ece}")
@Guid("1d13d13601994cdcb84ee72c2b581ece")
@WinRTInterface("1d13d13601994cdcb84ee72c2b581ece")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAudioStateMonitor.ByReference::class)
public interface IAudioStateMonitor : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_SoundLevelChanged(handler: TypedEventHandler<AudioStateMonitor?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_SoundLevelChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun get_SoundLevel(): SoundLevel?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAudioStateMonitor> {
    public override fun getValue() = ABI.makeIAudioStateMonitor(pointer.getPointer(0))

    public fun setValue(value: IAudioStateMonitor_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAudioStateMonitor {
    public val __1449042167_Ptr: Pointer?

    public val _1449042167_VtblPtr: Pointer?
      get() = __1449042167_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_SoundLevelChanged(handler: TypedEventHandler<AudioStateMonitor?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1449042167_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1449042167_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_SoundLevelChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1449042167_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1449042167_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_SoundLevel(): SoundLevel? {
      val fnPtr = _1449042167_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SoundLevel>()
      val hr = fn.invokeHR(arrayOf(__1449042167_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SoundLevel>(result.getValue())
      return resultValue
    }
  }

  public class IAudioStateMonitor_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1449042167_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAudioStateMonitor, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1d13d13601994cdcb84ee72c2b581ece")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAudioStateMonitor(ptr: Pointer?): WithDefault = IAudioStateMonitor_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAudioStateMonitor {
      val address = segment.toRawLongValue()
      return makeIAudioStateMonitor(Pointer(address))
    }

    public override fun toNative(obj: IAudioStateMonitor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1449042167_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAudioStateMonitor): Array<IAudioStateMonitor?> =
        (elements as
        Array<IAudioStateMonitor?>).castToImpl<IAudioStateMonitor,IAudioStateMonitor_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAudioStateMonitor?> =
        arrayOfNulls<IAudioStateMonitor_Impl>(size) as Array<IAudioStateMonitor?>
  }
}
