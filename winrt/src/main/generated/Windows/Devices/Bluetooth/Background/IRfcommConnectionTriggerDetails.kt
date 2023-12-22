package Windows.Devices.Bluetooth.Background

import Windows.Devices.Bluetooth.BluetoothDevice
import Windows.Networking.Sockets.StreamSocket
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IRfcommConnectionTriggerDetails.ABI::class)
@Signature("{f922734d-2e3c-4efc-ab59-fc5cf96f97e3}")
@Guid("f922734d2e3c4efcab59fc5cf96f97e3")
@WinRTInterface("f922734d2e3c4efcab59fc5cf96f97e3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRfcommConnectionTriggerDetails.ByReference::class)
public interface IRfcommConnectionTriggerDetails : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Socket(): StreamSocket?

  @InterfaceMethod(1)
  public fun get_Incoming(): Boolean

  @InterfaceMethod(2)
  public fun get_RemoteDevice(): BluetoothDevice?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRfcommConnectionTriggerDetails> {
    public override fun getValue() = ABI.makeIRfcommConnectionTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: IRfcommConnectionTriggerDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRfcommConnectionTriggerDetails {
    public val __2050734023_Ptr: Pointer?

    public val _2050734023_VtblPtr: Pointer?
      get() = __2050734023_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Socket(): StreamSocket? {
      val fnPtr = _2050734023_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StreamSocket>()
      val hr = fn.invokeHR(arrayOf(__2050734023_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StreamSocket>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Incoming(): Boolean {
      val fnPtr = _2050734023_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2050734023_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_RemoteDevice(): BluetoothDevice? {
      val fnPtr = _2050734023_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BluetoothDevice>()
      val hr = fn.invokeHR(arrayOf(__2050734023_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BluetoothDevice>(result.getValue())
      return resultValue
    }
  }

  public class IRfcommConnectionTriggerDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2050734023_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRfcommConnectionTriggerDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f922734d2e3c4efcab59fc5cf96f97e3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRfcommConnectionTriggerDetails(ptr: Pointer?): WithDefault =
        IRfcommConnectionTriggerDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRfcommConnectionTriggerDetails {
      val address = segment.toRawLongValue()
      return makeIRfcommConnectionTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: IRfcommConnectionTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2050734023_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRfcommConnectionTriggerDetails):
        Array<IRfcommConnectionTriggerDetails?> = (elements as
        Array<IRfcommConnectionTriggerDetails?>).castToImpl<IRfcommConnectionTriggerDetails,IRfcommConnectionTriggerDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRfcommConnectionTriggerDetails?> =
        arrayOfNulls<IRfcommConnectionTriggerDetails_Impl>(size) as
        Array<IRfcommConnectionTriggerDetails?>
  }
}
