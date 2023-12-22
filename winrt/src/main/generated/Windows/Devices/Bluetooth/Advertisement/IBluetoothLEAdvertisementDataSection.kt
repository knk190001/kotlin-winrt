package Windows.Devices.Bluetooth.Advertisement

import Windows.Storage.Streams.IBuffer
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
import kotlin.Byte
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBluetoothLEAdvertisementDataSection.ABI::class)
@Signature("{d7213314-3a43-40f9-b6f0-92bfefc34ae3}")
@Guid("d72133143a4340f9b6f092bfefc34ae3")
@WinRTInterface("d72133143a4340f9b6f092bfefc34ae3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBluetoothLEAdvertisementDataSection.ByReference::class)
public interface IBluetoothLEAdvertisementDataSection : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DataType(): Byte

  @InterfaceMethod(1)
  public fun put_DataType(value: Byte): Unit

  @InterfaceMethod(2)
  public fun get_Data(): IBuffer?

  @InterfaceMethod(3)
  public fun put_Data(value: IBuffer?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBluetoothLEAdvertisementDataSection> {
    public override fun getValue() =
        ABI.makeIBluetoothLEAdvertisementDataSection(pointer.getPointer(0))

    public fun setValue(value: IBluetoothLEAdvertisementDataSection_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBluetoothLEAdvertisementDataSection {
    public val __291960931_Ptr: Pointer?

    public val _291960931_VtblPtr: Pointer?
      get() = __291960931_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DataType(): Byte {
      val fnPtr = _291960931_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__291960931_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_DataType(value: Byte): Unit {
      val fnPtr = _291960931_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__291960931_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Data(): IBuffer? {
      val fnPtr = _291960931_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__291960931_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Data(value: IBuffer?): Unit {
      val fnPtr = _291960931_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__291960931_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IBluetoothLEAdvertisementDataSection_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __291960931_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBluetoothLEAdvertisementDataSection, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d72133143a4340f9b6f092bfefc34ae3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBluetoothLEAdvertisementDataSection(ptr: Pointer?): WithDefault =
        IBluetoothLEAdvertisementDataSection_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBluetoothLEAdvertisementDataSection {
      val address = segment.toRawLongValue()
      return makeIBluetoothLEAdvertisementDataSection(Pointer(address))
    }

    public override fun toNative(obj: IBluetoothLEAdvertisementDataSection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__291960931_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBluetoothLEAdvertisementDataSection):
        Array<IBluetoothLEAdvertisementDataSection?> = (elements as
        Array<IBluetoothLEAdvertisementDataSection?>).castToImpl<IBluetoothLEAdvertisementDataSection,IBluetoothLEAdvertisementDataSection_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBluetoothLEAdvertisementDataSection?> =
        arrayOfNulls<IBluetoothLEAdvertisementDataSection_Impl>(size) as
        Array<IBluetoothLEAdvertisementDataSection?>
  }
}
