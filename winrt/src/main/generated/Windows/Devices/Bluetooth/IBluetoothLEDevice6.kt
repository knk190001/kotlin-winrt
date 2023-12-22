package Windows.Devices.Bluetooth

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

@ABIMarker(IBluetoothLEDevice6.ABI::class)
@Signature("{ca7190ef-0cae-573c-a1ca-e1fc5bfc39e2}")
@Guid("ca7190ef0cae573ca1cae1fc5bfc39e2")
@WinRTInterface("ca7190ef0cae573ca1cae1fc5bfc39e2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBluetoothLEDevice6.ByReference::class)
public interface IBluetoothLEDevice6 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetConnectionParameters(): BluetoothLEConnectionParameters?

  @InterfaceMethod(1)
  public fun GetConnectionPhy(): BluetoothLEConnectionPhy?

  @InterfaceMethod(2)
  public
      fun RequestPreferredConnectionParameters(preferredConnectionParameters: BluetoothLEPreferredConnectionParameters?):
      BluetoothLEPreferredConnectionParametersRequest?

  @InterfaceMethod(3)
  public fun add_ConnectionParametersChanged(handler: TypedEventHandler<BluetoothLEDevice?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(4)
  public fun remove_ConnectionParametersChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(5)
  public fun add_ConnectionPhyChanged(handler: TypedEventHandler<BluetoothLEDevice?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(6)
  public fun remove_ConnectionPhyChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBluetoothLEDevice6> {
    public override fun getValue() = ABI.makeIBluetoothLEDevice6(pointer.getPointer(0))

    public fun setValue(value: IBluetoothLEDevice6_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBluetoothLEDevice6 {
    public val __157700848_Ptr: Pointer?

    public val _157700848_VtblPtr: Pointer?
      get() = __157700848_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetConnectionParameters(): BluetoothLEConnectionParameters? {
      val fnPtr = _157700848_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BluetoothLEConnectionParameters>()
      val hr = fn.invokeHR(arrayOf(__157700848_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BluetoothLEConnectionParameters>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetConnectionPhy(): BluetoothLEConnectionPhy? {
      val fnPtr = _157700848_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BluetoothLEConnectionPhy>()
      val hr = fn.invokeHR(arrayOf(__157700848_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BluetoothLEConnectionPhy>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override
        fun RequestPreferredConnectionParameters(preferredConnectionParameters: BluetoothLEPreferredConnectionParameters?):
        BluetoothLEPreferredConnectionParametersRequest? {
      val fnPtr = _157700848_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BluetoothLEPreferredConnectionParametersRequest>()
      val hr = fn.invokeHR(arrayOf(__157700848_Ptr, marshalToNative(preferredConnectionParameters),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<BluetoothLEPreferredConnectionParametersRequest>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override
        fun add_ConnectionParametersChanged(handler: TypedEventHandler<BluetoothLEDevice?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _157700848_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__157700848_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun remove_ConnectionParametersChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _157700848_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__157700848_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun add_ConnectionPhyChanged(handler: TypedEventHandler<BluetoothLEDevice?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _157700848_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__157700848_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun remove_ConnectionPhyChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _157700848_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__157700848_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IBluetoothLEDevice6_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __157700848_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBluetoothLEDevice6, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ca7190ef0cae573ca1cae1fc5bfc39e2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBluetoothLEDevice6(ptr: Pointer?): WithDefault = IBluetoothLEDevice6_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBluetoothLEDevice6 {
      val address = segment.toRawLongValue()
      return makeIBluetoothLEDevice6(Pointer(address))
    }

    public override fun toNative(obj: IBluetoothLEDevice6): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__157700848_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBluetoothLEDevice6): Array<IBluetoothLEDevice6?> =
        (elements as
        Array<IBluetoothLEDevice6?>).castToImpl<IBluetoothLEDevice6,IBluetoothLEDevice6_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBluetoothLEDevice6?> =
        arrayOfNulls<IBluetoothLEDevice6_Impl>(size) as Array<IBluetoothLEDevice6?>
  }
}
