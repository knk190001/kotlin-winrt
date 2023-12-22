package Windows.Media.Miracast

import Windows.ApplicationModel.Core.CoreApplicationView
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMiracastReceiver.ABI::class)
@Signature("{7a315258-e444-51b4-aff7-b88daa1229e0}")
@Guid("7a315258e44451b4aff7b88daa1229e0")
@WinRTInterface("7a315258e44451b4aff7b88daa1229e0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMiracastReceiver.ByReference::class)
public interface IMiracastReceiver : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDefaultSettings(): MiracastReceiverSettings?

  @InterfaceMethod(1)
  public fun GetCurrentSettings(): MiracastReceiverSettings?

  @InterfaceMethod(2)
  public fun GetCurrentSettingsAsync(): IAsyncOperation<MiracastReceiverSettings?>?

  @InterfaceMethod(3)
  public fun DisconnectAllAndApplySettings(settings: MiracastReceiverSettings?):
      MiracastReceiverApplySettingsResult?

  @InterfaceMethod(4)
  public fun DisconnectAllAndApplySettingsAsync(settings: MiracastReceiverSettings?):
      IAsyncOperation<MiracastReceiverApplySettingsResult?>?

  @InterfaceMethod(5)
  public fun GetStatus(): MiracastReceiverStatus?

  @InterfaceMethod(6)
  public fun GetStatusAsync(): IAsyncOperation<MiracastReceiverStatus?>?

  @InterfaceMethod(7)
  public fun add_StatusChanged(handler: TypedEventHandler<MiracastReceiver?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(8)
  public fun remove_StatusChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(9)
  public fun CreateSession(view: CoreApplicationView?): MiracastReceiverSession?

  @InterfaceMethod(10)
  public fun CreateSessionAsync(view: CoreApplicationView?):
      IAsyncOperation<MiracastReceiverSession?>?

  @InterfaceMethod(11)
  public fun ClearKnownTransmitters(): Unit

  @InterfaceMethod(12)
  public fun RemoveKnownTransmitter(transmitter: MiracastTransmitter?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMiracastReceiver> {
    public override fun getValue() = ABI.makeIMiracastReceiver(pointer.getPointer(0))

    public fun setValue(value: IMiracastReceiver_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMiracastReceiver {
    public val __1560926621_Ptr: Pointer?

    public val _1560926621_VtblPtr: Pointer?
      get() = __1560926621_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDefaultSettings(): MiracastReceiverSettings? {
      val fnPtr = _1560926621_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MiracastReceiverSettings>()
      val hr = fn.invokeHR(arrayOf(__1560926621_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MiracastReceiverSettings>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetCurrentSettings(): MiracastReceiverSettings? {
      val fnPtr = _1560926621_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MiracastReceiverSettings>()
      val hr = fn.invokeHR(arrayOf(__1560926621_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MiracastReceiverSettings>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetCurrentSettingsAsync(): IAsyncOperation<MiracastReceiverSettings?>? {
      val fnPtr = _1560926621_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<MiracastReceiverSettings?>>()
      val hr = fn.invokeHR(arrayOf(__1560926621_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<MiracastReceiverSettings?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun DisconnectAllAndApplySettings(settings: MiracastReceiverSettings?):
        MiracastReceiverApplySettingsResult? {
      val fnPtr = _1560926621_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MiracastReceiverApplySettingsResult>()
      val hr = fn.invokeHR(arrayOf(__1560926621_Ptr, marshalToNative(settings), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MiracastReceiverApplySettingsResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun DisconnectAllAndApplySettingsAsync(settings: MiracastReceiverSettings?):
        IAsyncOperation<MiracastReceiverApplySettingsResult?>? {
      val fnPtr = _1560926621_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<MiracastReceiverApplySettingsResult?>>()
      val hr = fn.invokeHR(arrayOf(__1560926621_Ptr, marshalToNative(settings), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<MiracastReceiverApplySettingsResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun GetStatus(): MiracastReceiverStatus? {
      val fnPtr = _1560926621_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MiracastReceiverStatus>()
      val hr = fn.invokeHR(arrayOf(__1560926621_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MiracastReceiverStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun GetStatusAsync(): IAsyncOperation<MiracastReceiverStatus?>? {
      val fnPtr = _1560926621_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<MiracastReceiverStatus?>>()
      val hr = fn.invokeHR(arrayOf(__1560926621_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<MiracastReceiverStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun add_StatusChanged(handler: TypedEventHandler<MiracastReceiver?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1560926621_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1560926621_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun remove_StatusChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1560926621_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1560926621_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun CreateSession(view: CoreApplicationView?): MiracastReceiverSession? {
      val fnPtr = _1560926621_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MiracastReceiverSession>()
      val hr = fn.invokeHR(arrayOf(__1560926621_Ptr, marshalToNative(view), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MiracastReceiverSession>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun CreateSessionAsync(view: CoreApplicationView?):
        IAsyncOperation<MiracastReceiverSession?>? {
      val fnPtr = _1560926621_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<MiracastReceiverSession?>>()
      val hr = fn.invokeHR(arrayOf(__1560926621_Ptr, marshalToNative(view), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<MiracastReceiverSession?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun ClearKnownTransmitters(): Unit {
      val fnPtr = _1560926621_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1560926621_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun RemoveKnownTransmitter(transmitter: MiracastTransmitter?): Unit {
      val fnPtr = _1560926621_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1560926621_Ptr, marshalToNative(transmitter),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMiracastReceiver_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1560926621_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMiracastReceiver, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7a315258e44451b4aff7b88daa1229e0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMiracastReceiver(ptr: Pointer?): WithDefault = IMiracastReceiver_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMiracastReceiver {
      val address = segment.toRawLongValue()
      return makeIMiracastReceiver(Pointer(address))
    }

    public override fun toNative(obj: IMiracastReceiver): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1560926621_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMiracastReceiver): Array<IMiracastReceiver?> = (elements
        as Array<IMiracastReceiver?>).castToImpl<IMiracastReceiver,IMiracastReceiver_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMiracastReceiver?> =
        arrayOfNulls<IMiracastReceiver_Impl>(size) as Array<IMiracastReceiver?>
  }
}
