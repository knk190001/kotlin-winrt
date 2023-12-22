package Windows.Devices.Bluetooth.Advertisement

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

@ABIMarker(IBluetoothLEAdvertisementPublisher2.ABI::class)
@Signature("{fbdb545e-56f1-510f-a434-217fbd9e7bd2}")
@Guid("fbdb545e56f1510fa434217fbd9e7bd2")
@WinRTInterface("fbdb545e56f1510fa434217fbd9e7bd2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBluetoothLEAdvertisementPublisher2.ByReference::class)
public interface IBluetoothLEAdvertisementPublisher2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PreferredTransmitPowerLevelInDBm(): IReference<Short>?

  @InterfaceMethod(1)
  public fun put_PreferredTransmitPowerLevelInDBm(value: IReference<Short>?): Unit

  @InterfaceMethod(2)
  public fun get_UseExtendedAdvertisement(): Boolean

  @InterfaceMethod(3)
  public fun put_UseExtendedAdvertisement(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun get_IsAnonymous(): Boolean

  @InterfaceMethod(5)
  public fun put_IsAnonymous(value: Boolean): Unit

  @InterfaceMethod(6)
  public fun get_IncludeTransmitPowerLevel(): Boolean

  @InterfaceMethod(7)
  public fun put_IncludeTransmitPowerLevel(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBluetoothLEAdvertisementPublisher2> {
    public override fun getValue() =
        ABI.makeIBluetoothLEAdvertisementPublisher2(pointer.getPointer(0))

    public fun setValue(value: IBluetoothLEAdvertisementPublisher2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBluetoothLEAdvertisementPublisher2 {
    public val __322098764_Ptr: Pointer?

    public val _322098764_VtblPtr: Pointer?
      get() = __322098764_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PreferredTransmitPowerLevelInDBm(): IReference<Short>? {
      val fnPtr = _322098764_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Short>>()
      val hr = fn.invokeHR(arrayOf(__322098764_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Short>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_PreferredTransmitPowerLevelInDBm(value: IReference<Short>?): Unit {
      val fnPtr = _322098764_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__322098764_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_UseExtendedAdvertisement(): Boolean {
      val fnPtr = _322098764_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__322098764_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_UseExtendedAdvertisement(value: Boolean): Unit {
      val fnPtr = _322098764_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__322098764_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_IsAnonymous(): Boolean {
      val fnPtr = _322098764_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__322098764_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_IsAnonymous(value: Boolean): Unit {
      val fnPtr = _322098764_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__322098764_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_IncludeTransmitPowerLevel(): Boolean {
      val fnPtr = _322098764_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__322098764_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_IncludeTransmitPowerLevel(value: Boolean): Unit {
      val fnPtr = _322098764_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__322098764_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IBluetoothLEAdvertisementPublisher2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __322098764_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBluetoothLEAdvertisementPublisher2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fbdb545e56f1510fa434217fbd9e7bd2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBluetoothLEAdvertisementPublisher2(ptr: Pointer?): WithDefault =
        IBluetoothLEAdvertisementPublisher2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBluetoothLEAdvertisementPublisher2 {
      val address = segment.toRawLongValue()
      return makeIBluetoothLEAdvertisementPublisher2(Pointer(address))
    }

    public override fun toNative(obj: IBluetoothLEAdvertisementPublisher2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__322098764_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBluetoothLEAdvertisementPublisher2):
        Array<IBluetoothLEAdvertisementPublisher2?> = (elements as
        Array<IBluetoothLEAdvertisementPublisher2?>).castToImpl<IBluetoothLEAdvertisementPublisher2,IBluetoothLEAdvertisementPublisher2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBluetoothLEAdvertisementPublisher2?> =
        arrayOfNulls<IBluetoothLEAdvertisementPublisher2_Impl>(size) as
        Array<IBluetoothLEAdvertisementPublisher2?>
  }
}
