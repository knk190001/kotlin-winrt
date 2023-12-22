package Windows.Networking.Sockets

import Windows.ApplicationModel.Background.IBackgroundTrigger
import Windows.Foundation.IClosable
import Windows.Foundation.IClosable.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IControlChannelTrigger.ABI::class)
@Signature("{7d1431a7-ee96-40e8-a199-8703cd969ec3}")
@Guid("7d1431a7ee9640e8a1998703cd969ec3")
@WinRTInterface("7d1431a7ee9640e8a1998703cd969ec3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IControlChannelTrigger.ByReference::class)
public interface IControlChannelTrigger : NativeMapped, IWinRTInterface, IClosable {
  @InterfaceMethod(0)
  public fun get_ControlChannelTriggerId(): String?

  @InterfaceMethod(1)
  public fun get_ServerKeepAliveIntervalInMinutes(): WinDef.UINT

  @InterfaceMethod(2)
  public fun put_ServerKeepAliveIntervalInMinutes(value: WinDef.UINT): Unit

  @InterfaceMethod(3)
  public fun get_CurrentKeepAliveIntervalInMinutes(): WinDef.UINT

  @InterfaceMethod(4)
  public fun get_TransportObject(): IUnknown?

  @InterfaceMethod(5)
  public fun get_KeepAliveTrigger(): IBackgroundTrigger?

  @InterfaceMethod(6)
  public fun get_PushNotificationTrigger(): IBackgroundTrigger?

  @InterfaceMethod(7)
  public fun UsingTransport(transport: IUnknown?): Unit

  @InterfaceMethod(8)
  public fun WaitForPushEnabled(): ControlChannelTriggerStatus?

  @InterfaceMethod(9)
  public fun DecreaseNetworkKeepAliveInterval(): Unit

  @InterfaceMethod(10)
  public fun FlushTransport(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IControlChannelTrigger> {
    public override fun getValue() = ABI.makeIControlChannelTrigger(pointer.getPointer(0))

    public fun setValue(value: IControlChannelTrigger_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IControlChannelTrigger, IClosable.WithDefault {
    public val __61844026_Ptr: Pointer?

    public val _61844026_VtblPtr: Pointer?
      get() = __61844026_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ControlChannelTriggerId(): String? {
      val fnPtr = _61844026_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__61844026_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ServerKeepAliveIntervalInMinutes(): WinDef.UINT {
      val fnPtr = _61844026_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__61844026_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_ServerKeepAliveIntervalInMinutes(value: WinDef.UINT): Unit {
      val fnPtr = _61844026_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__61844026_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_CurrentKeepAliveIntervalInMinutes(): WinDef.UINT {
      val fnPtr = _61844026_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__61844026_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_TransportObject(): IUnknown? {
      val fnPtr = _61844026_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__61844026_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_KeepAliveTrigger(): IBackgroundTrigger? {
      val fnPtr = _61844026_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBackgroundTrigger>()
      val hr = fn.invokeHR(arrayOf(__61844026_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBackgroundTrigger>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_PushNotificationTrigger(): IBackgroundTrigger? {
      val fnPtr = _61844026_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBackgroundTrigger>()
      val hr = fn.invokeHR(arrayOf(__61844026_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBackgroundTrigger>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun UsingTransport(transport: IUnknown?): Unit {
      val fnPtr = _61844026_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__61844026_Ptr, marshalToNative(transport),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun WaitForPushEnabled(): ControlChannelTriggerStatus? {
      val fnPtr = _61844026_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ControlChannelTriggerStatus>()
      val hr = fn.invokeHR(arrayOf(__61844026_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ControlChannelTriggerStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun DecreaseNetworkKeepAliveInterval(): Unit {
      val fnPtr = _61844026_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__61844026_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun FlushTransport(): Unit {
      val fnPtr = _61844026_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__61844026_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IControlChannelTrigger_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IClosable {
    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_61844026_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __61844026_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IControlChannelTrigger, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7d1431a7ee9640e8a1998703cd969ec3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIControlChannelTrigger(ptr: Pointer?): WithDefault =
        IControlChannelTrigger_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IControlChannelTrigger {
      val address = segment.toRawLongValue()
      return makeIControlChannelTrigger(Pointer(address))
    }

    public override fun toNative(obj: IControlChannelTrigger): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__61844026_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IControlChannelTrigger): Array<IControlChannelTrigger?> =
        (elements as
        Array<IControlChannelTrigger?>).castToImpl<IControlChannelTrigger,IControlChannelTrigger_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IControlChannelTrigger?> =
        arrayOfNulls<IControlChannelTrigger_Impl>(size) as Array<IControlChannelTrigger?>
  }
}
