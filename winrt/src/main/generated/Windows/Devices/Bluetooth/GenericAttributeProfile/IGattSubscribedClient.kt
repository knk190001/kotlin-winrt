package Windows.Devices.Bluetooth.GenericAttributeProfile

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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IGattSubscribedClient.ABI::class)
@Signature("{736e9001-15a4-4ec2-9248-e3f20d463be9}")
@Guid("736e900115a44ec29248e3f20d463be9")
@WinRTInterface("736e900115a44ec29248e3f20d463be9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGattSubscribedClient.ByReference::class)
public interface IGattSubscribedClient : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Session(): GattSession?

  @InterfaceMethod(1)
  public fun get_MaxNotificationSize(): WinDef.USHORT

  @InterfaceMethod(2)
  public fun add_MaxNotificationSizeChanged(handler: TypedEventHandler<GattSubscribedClient?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_MaxNotificationSizeChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGattSubscribedClient> {
    public override fun getValue() = ABI.makeIGattSubscribedClient(pointer.getPointer(0))

    public fun setValue(value: IGattSubscribedClient_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGattSubscribedClient {
    public val __1918205056_Ptr: Pointer?

    public val _1918205056_VtblPtr: Pointer?
      get() = __1918205056_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Session(): GattSession? {
      val fnPtr = _1918205056_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GattSession>()
      val hr = fn.invokeHR(arrayOf(__1918205056_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GattSession>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_MaxNotificationSize(): WinDef.USHORT {
      val fnPtr = _1918205056_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__1918205056_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override
        fun add_MaxNotificationSizeChanged(handler: TypedEventHandler<GattSubscribedClient?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1918205056_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1918205056_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_MaxNotificationSizeChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1918205056_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1918205056_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IGattSubscribedClient_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1918205056_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGattSubscribedClient, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("736e900115a44ec29248e3f20d463be9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGattSubscribedClient(ptr: Pointer?): WithDefault =
        IGattSubscribedClient_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGattSubscribedClient {
      val address = segment.toRawLongValue()
      return makeIGattSubscribedClient(Pointer(address))
    }

    public override fun toNative(obj: IGattSubscribedClient): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1918205056_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGattSubscribedClient): Array<IGattSubscribedClient?> =
        (elements as
        Array<IGattSubscribedClient?>).castToImpl<IGattSubscribedClient,IGattSubscribedClient_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGattSubscribedClient?> =
        arrayOfNulls<IGattSubscribedClient_Impl>(size) as Array<IGattSubscribedClient?>
  }
}
