package Microsoft.Windows.PushNotifications

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperationWithProgress
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPushNotificationManager.ABI::class)
@Signature("{902f4aba-ff63-5dfe-a88f-15cc6bed55ff}")
@Guid("902f4abaff635dfea88f15cc6bed55ff")
@WinRTInterface("902f4abaff635dfea88f15cc6bed55ff")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPushNotificationManager.ByReference::class)
public interface IPushNotificationManager : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Register(): Unit

  @InterfaceMethod(1)
  public fun Unregister(): Unit

  @InterfaceMethod(2)
  public fun UnregisterAll(): Unit

  @InterfaceMethod(3)
  public fun CreateChannelAsync(remoteId: com.sun.jna.platform.win32.Guid.GUID?):
      IAsyncOperationWithProgress<PushNotificationCreateChannelResult?,
      PushNotificationCreateChannelStatus?>?

  @InterfaceMethod(4)
  public fun add_PushReceived(handler: TypedEventHandler<PushNotificationManager?,
      PushNotificationReceivedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_PushReceived(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPushNotificationManager> {
    public override fun getValue() = ABI.makeIPushNotificationManager(pointer.getPointer(0))

    public fun setValue(value: IPushNotificationManager_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPushNotificationManager {
    public val __246923042_Ptr: Pointer?

    public val _246923042_VtblPtr: Pointer?
      get() = __246923042_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Register(): Unit {
      val fnPtr = _246923042_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__246923042_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun Unregister(): Unit {
      val fnPtr = _246923042_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__246923042_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun UnregisterAll(): Unit {
      val fnPtr = _246923042_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__246923042_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun CreateChannelAsync(remoteId: com.sun.jna.platform.win32.Guid.GUID?):
        IAsyncOperationWithProgress<PushNotificationCreateChannelResult?,
        PushNotificationCreateChannelStatus?>? {
      val fnPtr = _246923042_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result =
          makeByReferenceType<IAsyncOperationWithProgress<PushNotificationCreateChannelResult?,
          PushNotificationCreateChannelStatus?>>()
      val hr = fn.invokeHR(arrayOf(__246923042_Ptr, marshalToNative(remoteId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperationWithProgress<PushNotificationCreateChannelResult?,
          PushNotificationCreateChannelStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun add_PushReceived(handler: TypedEventHandler<PushNotificationManager?,
        PushNotificationReceivedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _246923042_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__246923042_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_PushReceived(token: EventRegistrationToken?): Unit {
      val fnPtr = _246923042_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__246923042_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPushNotificationManager_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __246923042_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPushNotificationManager, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("902f4abaff635dfea88f15cc6bed55ff")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPushNotificationManager(ptr: Pointer?): WithDefault =
        IPushNotificationManager_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPushNotificationManager {
      val address = segment.toRawLongValue()
      return makeIPushNotificationManager(Pointer(address))
    }

    public override fun toNative(obj: IPushNotificationManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__246923042_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPushNotificationManager):
        Array<IPushNotificationManager?> = (elements as
        Array<IPushNotificationManager?>).castToImpl<IPushNotificationManager,IPushNotificationManager_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPushNotificationManager?> =
        arrayOfNulls<IPushNotificationManager_Impl>(size) as Array<IPushNotificationManager?>
  }
}
