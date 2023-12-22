package Windows.ApplicationModel.Background

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

@ABIMarker(IBluetoothLEAdvertisementPublisherTrigger2.ABI::class)
@Signature("{aa28d064-38f4-597d-b597-4e55588c6503}")
@Guid("aa28d06438f4597db5974e55588c6503")
@WinRTInterface("aa28d06438f4597db5974e55588c6503")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBluetoothLEAdvertisementPublisherTrigger2.ByReference::class)
public interface IBluetoothLEAdvertisementPublisherTrigger2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PreferredTransmitPowerLevelInDBm(): IReference<Short>?

  @InterfaceMethod(1)
  public fun put_PreferredTransmitPowerLevelInDBm(value: IReference<Short>?): Unit

  @InterfaceMethod(2)
  public fun get_UseExtendedFormat(): Boolean

  @InterfaceMethod(3)
  public fun put_UseExtendedFormat(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun get_IsAnonymous(): Boolean

  @InterfaceMethod(5)
  public fun put_IsAnonymous(value: Boolean): Unit

  @InterfaceMethod(6)
  public fun get_IncludeTransmitPowerLevel(): Boolean

  @InterfaceMethod(7)
  public fun put_IncludeTransmitPowerLevel(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBluetoothLEAdvertisementPublisherTrigger2> {
    public override fun getValue() =
        ABI.makeIBluetoothLEAdvertisementPublisherTrigger2(pointer.getPointer(0))

    public fun setValue(value: IBluetoothLEAdvertisementPublisherTrigger2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBluetoothLEAdvertisementPublisherTrigger2 {
    public val __84498489_Ptr: Pointer?

    public val _84498489_VtblPtr: Pointer?
      get() = __84498489_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PreferredTransmitPowerLevelInDBm(): IReference<Short>? {
      val fnPtr = _84498489_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Short>>()
      val hr = fn.invokeHR(arrayOf(__84498489_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Short>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_PreferredTransmitPowerLevelInDBm(value: IReference<Short>?): Unit {
      val fnPtr = _84498489_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__84498489_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_UseExtendedFormat(): Boolean {
      val fnPtr = _84498489_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__84498489_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_UseExtendedFormat(value: Boolean): Unit {
      val fnPtr = _84498489_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__84498489_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_IsAnonymous(): Boolean {
      val fnPtr = _84498489_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__84498489_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_IsAnonymous(value: Boolean): Unit {
      val fnPtr = _84498489_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__84498489_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_IncludeTransmitPowerLevel(): Boolean {
      val fnPtr = _84498489_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__84498489_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_IncludeTransmitPowerLevel(value: Boolean): Unit {
      val fnPtr = _84498489_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__84498489_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IBluetoothLEAdvertisementPublisherTrigger2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __84498489_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBluetoothLEAdvertisementPublisherTrigger2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("aa28d06438f4597db5974e55588c6503")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBluetoothLEAdvertisementPublisherTrigger2(ptr: Pointer?): WithDefault =
        IBluetoothLEAdvertisementPublisherTrigger2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IBluetoothLEAdvertisementPublisherTrigger2 {
      val address = segment.toRawLongValue()
      return makeIBluetoothLEAdvertisementPublisherTrigger2(Pointer(address))
    }

    public override fun toNative(obj: IBluetoothLEAdvertisementPublisherTrigger2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__84498489_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBluetoothLEAdvertisementPublisherTrigger2):
        Array<IBluetoothLEAdvertisementPublisherTrigger2?> = (elements as
        Array<IBluetoothLEAdvertisementPublisherTrigger2?>).castToImpl<IBluetoothLEAdvertisementPublisherTrigger2,IBluetoothLEAdvertisementPublisherTrigger2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBluetoothLEAdvertisementPublisherTrigger2?> =
        arrayOfNulls<IBluetoothLEAdvertisementPublisherTrigger2_Impl>(size) as
        Array<IBluetoothLEAdvertisementPublisherTrigger2?>
  }
}
