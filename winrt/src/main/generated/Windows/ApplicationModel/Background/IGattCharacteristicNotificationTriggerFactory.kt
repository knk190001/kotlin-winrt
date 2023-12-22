package Windows.ApplicationModel.Background

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

@ABIMarker(IGattCharacteristicNotificationTriggerFactory.ABI::class)
@Signature("{57ba1995-b143-4575-9f6b-fd59d93ace1a}")
@Guid("57ba1995b14345759f6bfd59d93ace1a")
@WinRTInterface("57ba1995b14345759f6bfd59d93ace1a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGattCharacteristicNotificationTriggerFactory.ByReference::class)
public interface IGattCharacteristicNotificationTriggerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(characteristic: GattCharacteristic?): GattCharacteristicNotificationTrigger?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGattCharacteristicNotificationTriggerFactory> {
    public override fun getValue() =
        ABI.makeIGattCharacteristicNotificationTriggerFactory(pointer.getPointer(0))

    public fun setValue(value: IGattCharacteristicNotificationTriggerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGattCharacteristicNotificationTriggerFactory {
    public val __1000350563_Ptr: Pointer?

    public val _1000350563_VtblPtr: Pointer?
      get() = __1000350563_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(characteristic: GattCharacteristic?):
        GattCharacteristicNotificationTrigger? {
      val fnPtr = _1000350563_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GattCharacteristicNotificationTrigger>()
      val hr = fn.invokeHR(arrayOf(__1000350563_Ptr, marshalToNative(characteristic), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GattCharacteristicNotificationTrigger>(result.getValue())
      return resultValue
    }
  }

  public class IGattCharacteristicNotificationTriggerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1000350563_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGattCharacteristicNotificationTriggerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("57ba1995b14345759f6bfd59d93ace1a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGattCharacteristicNotificationTriggerFactory(ptr: Pointer?): WithDefault =
        IGattCharacteristicNotificationTriggerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IGattCharacteristicNotificationTriggerFactory {
      val address = segment.toRawLongValue()
      return makeIGattCharacteristicNotificationTriggerFactory(Pointer(address))
    }

    public override fun toNative(obj: IGattCharacteristicNotificationTriggerFactory): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1000350563_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGattCharacteristicNotificationTriggerFactory):
        Array<IGattCharacteristicNotificationTriggerFactory?> = (elements as
        Array<IGattCharacteristicNotificationTriggerFactory?>).castToImpl<IGattCharacteristicNotificationTriggerFactory,IGattCharacteristicNotificationTriggerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGattCharacteristicNotificationTriggerFactory?> =
        arrayOfNulls<IGattCharacteristicNotificationTriggerFactory_Impl>(size) as
        Array<IGattCharacteristicNotificationTriggerFactory?>
  }
}
