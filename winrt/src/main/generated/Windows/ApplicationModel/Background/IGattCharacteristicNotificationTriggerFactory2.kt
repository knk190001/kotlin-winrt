package Windows.ApplicationModel.Background

import Windows.Devices.Bluetooth.Background.BluetoothEventTriggeringMode
import Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristic
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

@ABIMarker(IGattCharacteristicNotificationTriggerFactory2.ABI::class)
@Signature("{5998e91f-8a53-4e9f-a32c-23cd33664cee}")
@Guid("5998e91f8a534e9fa32c23cd33664cee")
@WinRTInterface("5998e91f8a534e9fa32c23cd33664cee")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGattCharacteristicNotificationTriggerFactory2.ByReference::class)
public interface IGattCharacteristicNotificationTriggerFactory2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(characteristic: GattCharacteristic?,
      eventTriggeringMode: BluetoothEventTriggeringMode?): GattCharacteristicNotificationTrigger?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGattCharacteristicNotificationTriggerFactory2> {
    public override fun getValue() =
        ABI.makeIGattCharacteristicNotificationTriggerFactory2(pointer.getPointer(0))

    public fun setValue(value: IGattCharacteristicNotificationTriggerFactory2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGattCharacteristicNotificationTriggerFactory2 {
    public val __946096431_Ptr: Pointer?

    public val _946096431_VtblPtr: Pointer?
      get() = __946096431_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(characteristic: GattCharacteristic?,
        eventTriggeringMode: BluetoothEventTriggeringMode?):
        GattCharacteristicNotificationTrigger? {
      val fnPtr = _946096431_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GattCharacteristicNotificationTrigger>()
      val hr = fn.invokeHR(arrayOf(__946096431_Ptr, marshalToNative(characteristic),
          marshalToNative(eventTriggeringMode), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GattCharacteristicNotificationTrigger>(result.getValue())
      return resultValue
    }
  }

  public class IGattCharacteristicNotificationTriggerFactory2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __946096431_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGattCharacteristicNotificationTriggerFactory2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5998e91f8a534e9fa32c23cd33664cee")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGattCharacteristicNotificationTriggerFactory2(ptr: Pointer?): WithDefault =
        IGattCharacteristicNotificationTriggerFactory2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IGattCharacteristicNotificationTriggerFactory2 {
      val address = segment.toRawLongValue()
      return makeIGattCharacteristicNotificationTriggerFactory2(Pointer(address))
    }

    public override fun toNative(obj: IGattCharacteristicNotificationTriggerFactory2): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__946096431_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGattCharacteristicNotificationTriggerFactory2):
        Array<IGattCharacteristicNotificationTriggerFactory2?> = (elements as
        Array<IGattCharacteristicNotificationTriggerFactory2?>).castToImpl<IGattCharacteristicNotificationTriggerFactory2,IGattCharacteristicNotificationTriggerFactory2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGattCharacteristicNotificationTriggerFactory2?> =
        arrayOfNulls<IGattCharacteristicNotificationTriggerFactory2_Impl>(size) as
        Array<IGattCharacteristicNotificationTriggerFactory2?>
  }
}
