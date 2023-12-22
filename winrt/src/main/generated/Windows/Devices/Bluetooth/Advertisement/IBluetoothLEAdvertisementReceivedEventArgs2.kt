package Windows.Devices.Bluetooth.Advertisement

import Windows.Devices.Bluetooth.BluetoothAddressType
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Short
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBluetoothLEAdvertisementReceivedEventArgs2.ABI::class)
@Signature("{12d9c87b-0399-5f0e-a348-53b02b6b162e}")
@Guid("12d9c87b03995f0ea34853b02b6b162e")
@WinRTInterface("12d9c87b03995f0ea34853b02b6b162e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBluetoothLEAdvertisementReceivedEventArgs2.ByReference::class)
public interface IBluetoothLEAdvertisementReceivedEventArgs2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BluetoothAddressType(): BluetoothAddressType?

  @InterfaceMethod(1)
  public fun get_TransmitPowerLevelInDBm(): IReference<Short>?

  @InterfaceMethod(2)
  public fun get_IsAnonymous(): Boolean

  @InterfaceMethod(3)
  public fun get_IsConnectable(): Boolean

  @InterfaceMethod(4)
  public fun get_IsScannable(): Boolean

  @InterfaceMethod(5)
  public fun get_IsDirected(): Boolean

  @InterfaceMethod(6)
  public fun get_IsScanResponse(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBluetoothLEAdvertisementReceivedEventArgs2> {
    public override fun getValue() =
        ABI.makeIBluetoothLEAdvertisementReceivedEventArgs2(pointer.getPointer(0))

    public fun setValue(value: IBluetoothLEAdvertisementReceivedEventArgs2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBluetoothLEAdvertisementReceivedEventArgs2 {
    public val __35505978_Ptr: Pointer?

    public val _35505978_VtblPtr: Pointer?
      get() = __35505978_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BluetoothAddressType(): BluetoothAddressType? {
      val fnPtr = _35505978_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BluetoothAddressType>()
      val hr = fn.invokeHR(arrayOf(__35505978_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BluetoothAddressType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_TransmitPowerLevelInDBm(): IReference<Short>? {
      val fnPtr = _35505978_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Short>>()
      val hr = fn.invokeHR(arrayOf(__35505978_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Short>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_IsAnonymous(): Boolean {
      val fnPtr = _35505978_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__35505978_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_IsConnectable(): Boolean {
      val fnPtr = _35505978_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__35505978_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_IsScannable(): Boolean {
      val fnPtr = _35505978_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__35505978_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_IsDirected(): Boolean {
      val fnPtr = _35505978_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__35505978_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_IsScanResponse(): Boolean {
      val fnPtr = _35505978_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__35505978_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IBluetoothLEAdvertisementReceivedEventArgs2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __35505978_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBluetoothLEAdvertisementReceivedEventArgs2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("12d9c87b03995f0ea34853b02b6b162e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBluetoothLEAdvertisementReceivedEventArgs2(ptr: Pointer?): WithDefault =
        IBluetoothLEAdvertisementReceivedEventArgs2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IBluetoothLEAdvertisementReceivedEventArgs2 {
      val address = segment.toRawLongValue()
      return makeIBluetoothLEAdvertisementReceivedEventArgs2(Pointer(address))
    }

    public override fun toNative(obj: IBluetoothLEAdvertisementReceivedEventArgs2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__35505978_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBluetoothLEAdvertisementReceivedEventArgs2):
        Array<IBluetoothLEAdvertisementReceivedEventArgs2?> = (elements as
        Array<IBluetoothLEAdvertisementReceivedEventArgs2?>).castToImpl<IBluetoothLEAdvertisementReceivedEventArgs2,IBluetoothLEAdvertisementReceivedEventArgs2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBluetoothLEAdvertisementReceivedEventArgs2?> =
        arrayOfNulls<IBluetoothLEAdvertisementReceivedEventArgs2_Impl>(size) as
        Array<IBluetoothLEAdvertisementReceivedEventArgs2?>
  }
}
