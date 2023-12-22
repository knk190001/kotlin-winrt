package Windows.Devices.Bluetooth.Background

import Windows.Devices.Bluetooth.BluetoothError
import Windows.Devices.Bluetooth.GenericAttributeProfile.GattValueChangedEventArgs
import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IGattCharacteristicNotificationTriggerDetails2.ABI::class)
@Signature("{727a50dc-949d-454a-b192-983467e3d50f}")
@Guid("727a50dc949d454ab192983467e3d50f")
@WinRTInterface("727a50dc949d454ab192983467e3d50f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGattCharacteristicNotificationTriggerDetails2.ByReference::class)
public interface IGattCharacteristicNotificationTriggerDetails2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Error(): BluetoothError?

  @InterfaceMethod(1)
  public fun get_EventTriggeringMode(): BluetoothEventTriggeringMode?

  @InterfaceMethod(2)
  public fun get_ValueChangedEvents(): IVectorView<GattValueChangedEventArgs?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGattCharacteristicNotificationTriggerDetails2> {
    public override fun getValue() =
        ABI.makeIGattCharacteristicNotificationTriggerDetails2(pointer.getPointer(0))

    public fun setValue(value: IGattCharacteristicNotificationTriggerDetails2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGattCharacteristicNotificationTriggerDetails2 {
    public val __1236760855_Ptr: Pointer?

    public val _1236760855_VtblPtr: Pointer?
      get() = __1236760855_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Error(): BluetoothError? {
      val fnPtr = _1236760855_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BluetoothError>()
      val hr = fn.invokeHR(arrayOf(__1236760855_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BluetoothError>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_EventTriggeringMode(): BluetoothEventTriggeringMode? {
      val fnPtr = _1236760855_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BluetoothEventTriggeringMode>()
      val hr = fn.invokeHR(arrayOf(__1236760855_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BluetoothEventTriggeringMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ValueChangedEvents(): IVectorView<GattValueChangedEventArgs?>? {
      val fnPtr = _1236760855_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<GattValueChangedEventArgs?>>()
      val hr = fn.invokeHR(arrayOf(__1236760855_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVectorView<GattValueChangedEventArgs?>>(result.getValue())
      return resultValue
    }
  }

  public class IGattCharacteristicNotificationTriggerDetails2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1236760855_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGattCharacteristicNotificationTriggerDetails2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("727a50dc949d454ab192983467e3d50f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGattCharacteristicNotificationTriggerDetails2(ptr: Pointer?): WithDefault =
        IGattCharacteristicNotificationTriggerDetails2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IGattCharacteristicNotificationTriggerDetails2 {
      val address = segment.toRawLongValue()
      return makeIGattCharacteristicNotificationTriggerDetails2(Pointer(address))
    }

    public override fun toNative(obj: IGattCharacteristicNotificationTriggerDetails2): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1236760855_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGattCharacteristicNotificationTriggerDetails2):
        Array<IGattCharacteristicNotificationTriggerDetails2?> = (elements as
        Array<IGattCharacteristicNotificationTriggerDetails2?>).castToImpl<IGattCharacteristicNotificationTriggerDetails2,IGattCharacteristicNotificationTriggerDetails2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGattCharacteristicNotificationTriggerDetails2?> =
        arrayOfNulls<IGattCharacteristicNotificationTriggerDetails2_Impl>(size) as
        Array<IGattCharacteristicNotificationTriggerDetails2?>
  }
}
