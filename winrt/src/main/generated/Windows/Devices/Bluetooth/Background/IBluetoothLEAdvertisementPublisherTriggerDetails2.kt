package Windows.Devices.Bluetooth.Background

import Windows.Foundation.IReference
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
import kotlin.Short
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBluetoothLEAdvertisementPublisherTriggerDetails2.ABI::class)
@Signature("{d4a3d025-c601-42d6-9829-4ccb3f5cd77f}")
@Guid("d4a3d025c60142d698294ccb3f5cd77f")
@WinRTInterface("d4a3d025c60142d698294ccb3f5cd77f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBluetoothLEAdvertisementPublisherTriggerDetails2.ByReference::class)
public interface IBluetoothLEAdvertisementPublisherTriggerDetails2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SelectedTransmitPowerLevelInDBm(): IReference<Short>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBluetoothLEAdvertisementPublisherTriggerDetails2> {
    public override fun getValue() =
        ABI.makeIBluetoothLEAdvertisementPublisherTriggerDetails2(pointer.getPointer(0))

    public fun setValue(value: IBluetoothLEAdvertisementPublisherTriggerDetails2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBluetoothLEAdvertisementPublisherTriggerDetails2 {
    public val __573512681_Ptr: Pointer?

    public val _573512681_VtblPtr: Pointer?
      get() = __573512681_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SelectedTransmitPowerLevelInDBm(): IReference<Short>? {
      val fnPtr = _573512681_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Short>>()
      val hr = fn.invokeHR(arrayOf(__573512681_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Short>>(result.getValue())
      return resultValue
    }
  }

  public class IBluetoothLEAdvertisementPublisherTriggerDetails2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __573512681_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBluetoothLEAdvertisementPublisherTriggerDetails2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d4a3d025c60142d698294ccb3f5cd77f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBluetoothLEAdvertisementPublisherTriggerDetails2(ptr: Pointer?): WithDefault =
        IBluetoothLEAdvertisementPublisherTriggerDetails2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IBluetoothLEAdvertisementPublisherTriggerDetails2 {
      val address = segment.toRawLongValue()
      return makeIBluetoothLEAdvertisementPublisherTriggerDetails2(Pointer(address))
    }

    public override fun toNative(obj: IBluetoothLEAdvertisementPublisherTriggerDetails2):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__573512681_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBluetoothLEAdvertisementPublisherTriggerDetails2):
        Array<IBluetoothLEAdvertisementPublisherTriggerDetails2?> = (elements as
        Array<IBluetoothLEAdvertisementPublisherTriggerDetails2?>).castToImpl<IBluetoothLEAdvertisementPublisherTriggerDetails2,IBluetoothLEAdvertisementPublisherTriggerDetails2_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IBluetoothLEAdvertisementPublisherTriggerDetails2?> =
        arrayOfNulls<IBluetoothLEAdvertisementPublisherTriggerDetails2_Impl>(size) as
        Array<IBluetoothLEAdvertisementPublisherTriggerDetails2?>
  }
}
