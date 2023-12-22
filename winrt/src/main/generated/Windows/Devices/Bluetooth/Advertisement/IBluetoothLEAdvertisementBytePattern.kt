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
import kotlin.Short
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBluetoothLEAdvertisementBytePattern.ABI::class)
@Signature("{fbfad7f2-b9c5-4a08-bc51-502f8ef68a79}")
@Guid("fbfad7f2b9c54a08bc51502f8ef68a79")
@WinRTInterface("fbfad7f2b9c54a08bc51502f8ef68a79")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBluetoothLEAdvertisementBytePattern.ByReference::class)
public interface IBluetoothLEAdvertisementBytePattern : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DataType(): Byte

  @InterfaceMethod(1)
  public fun put_DataType(value: Byte): Unit

  @InterfaceMethod(2)
  public fun get_Offset(): Short

  @InterfaceMethod(3)
  public fun put_Offset(value: Short): Unit

  @InterfaceMethod(4)
  public fun get_Data(): IBuffer?

  @InterfaceMethod(5)
  public fun put_Data(value: IBuffer?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBluetoothLEAdvertisementBytePattern> {
    public override fun getValue() =
        ABI.makeIBluetoothLEAdvertisementBytePattern(pointer.getPointer(0))

    public fun setValue(value: IBluetoothLEAdvertisementBytePattern_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBluetoothLEAdvertisementBytePattern {
    public val __1499439830_Ptr: Pointer?

    public val _1499439830_VtblPtr: Pointer?
      get() = __1499439830_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DataType(): Byte {
      val fnPtr = _1499439830_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__1499439830_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_DataType(value: Byte): Unit {
      val fnPtr = _1499439830_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1499439830_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Offset(): Short {
      val fnPtr = _1499439830_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Short>()
      val hr = fn.invokeHR(arrayOf(__1499439830_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Short>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_Offset(value: Short): Unit {
      val fnPtr = _1499439830_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1499439830_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Data(): IBuffer? {
      val fnPtr = _1499439830_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__1499439830_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_Data(value: IBuffer?): Unit {
      val fnPtr = _1499439830_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1499439830_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IBluetoothLEAdvertisementBytePattern_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1499439830_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBluetoothLEAdvertisementBytePattern, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fbfad7f2b9c54a08bc51502f8ef68a79")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBluetoothLEAdvertisementBytePattern(ptr: Pointer?): WithDefault =
        IBluetoothLEAdvertisementBytePattern_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBluetoothLEAdvertisementBytePattern {
      val address = segment.toRawLongValue()
      return makeIBluetoothLEAdvertisementBytePattern(Pointer(address))
    }

    public override fun toNative(obj: IBluetoothLEAdvertisementBytePattern): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1499439830_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBluetoothLEAdvertisementBytePattern):
        Array<IBluetoothLEAdvertisementBytePattern?> = (elements as
        Array<IBluetoothLEAdvertisementBytePattern?>).castToImpl<IBluetoothLEAdvertisementBytePattern,IBluetoothLEAdvertisementBytePattern_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBluetoothLEAdvertisementBytePattern?> =
        arrayOfNulls<IBluetoothLEAdvertisementBytePattern_Impl>(size) as
        Array<IBluetoothLEAdvertisementBytePattern?>
  }
}
