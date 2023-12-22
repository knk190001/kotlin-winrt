package Windows.Media.Devices

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

@ABIMarker(IAudioDeviceModulesManager.ABI::class)
@Signature("{6aa40c4d-960a-4d1c-b318-0022604547ed}")
@Guid("6aa40c4d960a4d1cb3180022604547ed")
@WinRTInterface("6aa40c4d960a4d1cb3180022604547ed")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAudioDeviceModulesManager.ByReference::class)
public interface IAudioDeviceModulesManager : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_ModuleNotificationReceived(handler: TypedEventHandler<AudioDeviceModulesManager?,
      AudioDeviceModuleNotificationEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_ModuleNotificationReceived(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun FindAllById(moduleId: String?): IVectorView<AudioDeviceModule?>?

  @InterfaceMethod(3)
  public fun FindAll(): IVectorView<AudioDeviceModule?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAudioDeviceModulesManager> {
    public override fun getValue() = ABI.makeIAudioDeviceModulesManager(pointer.getPointer(0))

    public fun setValue(value: IAudioDeviceModulesManager_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAudioDeviceModulesManager {
    public val __1515623697_Ptr: Pointer?

    public val _1515623697_VtblPtr: Pointer?
      get() = __1515623697_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override
        fun add_ModuleNotificationReceived(handler: TypedEventHandler<AudioDeviceModulesManager?,
        AudioDeviceModuleNotificationEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1515623697_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1515623697_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_ModuleNotificationReceived(token: EventRegistrationToken?): Unit {
      val fnPtr = _1515623697_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1515623697_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun FindAllById(moduleId: String?): IVectorView<AudioDeviceModule?>? {
      val fnPtr = _1515623697_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<AudioDeviceModule?>>()
      val hr = fn.invokeHR(arrayOf(__1515623697_Ptr, marshalToNative(moduleId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<AudioDeviceModule?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun FindAll(): IVectorView<AudioDeviceModule?>? {
      val fnPtr = _1515623697_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<AudioDeviceModule?>>()
      val hr = fn.invokeHR(arrayOf(__1515623697_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<AudioDeviceModule?>>(result.getValue())
      return resultValue
    }
  }

  public class IAudioDeviceModulesManager_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1515623697_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAudioDeviceModulesManager, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6aa40c4d960a4d1cb3180022604547ed")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAudioDeviceModulesManager(ptr: Pointer?): WithDefault =
        IAudioDeviceModulesManager_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAudioDeviceModulesManager {
      val address = segment.toRawLongValue()
      return makeIAudioDeviceModulesManager(Pointer(address))
    }

    public override fun toNative(obj: IAudioDeviceModulesManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1515623697_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAudioDeviceModulesManager):
        Array<IAudioDeviceModulesManager?> = (elements as
        Array<IAudioDeviceModulesManager?>).castToImpl<IAudioDeviceModulesManager,IAudioDeviceModulesManager_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAudioDeviceModulesManager?> =
        arrayOfNulls<IAudioDeviceModulesManager_Impl>(size) as Array<IAudioDeviceModulesManager?>
  }
}
