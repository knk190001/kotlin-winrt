package Windows.Devices.I2c

import Windows.Foundation.IClosable
import Windows.Foundation.IClosable.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Byte
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(II2cDevice.ABI::class)
@Signature("{8636c136-b9c5-4f70-9449-cc46dc6f57eb}")
@Guid("8636c136b9c54f709449cc46dc6f57eb")
@WinRTInterface("8636c136b9c54f709449cc46dc6f57eb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = II2cDevice.ByReference::class)
public interface II2cDevice : NativeMapped, IWinRTInterface, IClosable {
  @InterfaceMethod(0)
  public fun get_DeviceId(): String?

  @InterfaceMethod(1)
  public fun get_ConnectionSettings(): I2cConnectionSettings?

  @InterfaceMethod(2)
  public fun Write(buffer: Array<Byte>): Unit

  @InterfaceMethod(3)
  public fun WritePartial(buffer: Array<Byte>): I2cTransferResult?

  @InterfaceMethod(4)
  public fun Read(buffer: Array<Byte>): Unit

  @InterfaceMethod(5)
  public fun ReadPartial(buffer: Array<Byte>): I2cTransferResult?

  @InterfaceMethod(6)
  public fun WriteRead(writeBuffer: Array<Byte>, readBuffer: Array<Byte>): Unit

  @InterfaceMethod(7)
  public fun WriteReadPartial(writeBuffer: Array<Byte>, readBuffer: Array<Byte>): I2cTransferResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<II2cDevice> {
    public override fun getValue() = ABI.makeII2cDevice(pointer.getPointer(0))

    public fun setValue(value: II2cDevice_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : II2cDevice, IClosable.WithDefault {
    public val __1394515835_Ptr: Pointer?

    public val _1394515835_VtblPtr: Pointer?
      get() = __1394515835_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DeviceId(): String? {
      val fnPtr = _1394515835_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1394515835_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ConnectionSettings(): I2cConnectionSettings? {
      val fnPtr = _1394515835_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<I2cConnectionSettings>()
      val hr = fn.invokeHR(arrayOf(__1394515835_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<I2cConnectionSettings>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun Write(buffer: Array<Byte>): Unit {
      val fnPtr = _1394515835_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1394515835_Ptr, buffer.size,marshalToNative(buffer),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun WritePartial(buffer: Array<Byte>): I2cTransferResult? {
      val fnPtr = _1394515835_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<I2cTransferResult>()
      val hr = fn.invokeHR(arrayOf(__1394515835_Ptr, buffer.size,marshalToNative(buffer), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<I2cTransferResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun Read(buffer: Array<Byte>): Unit {
      val fnPtr = _1394515835_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1394515835_Ptr, buffer.size,marshalToNative(buffer),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun ReadPartial(buffer: Array<Byte>): I2cTransferResult? {
      val fnPtr = _1394515835_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<I2cTransferResult>()
      val hr = fn.invokeHR(arrayOf(__1394515835_Ptr, buffer.size,marshalToNative(buffer), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<I2cTransferResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun WriteRead(writeBuffer: Array<Byte>, readBuffer: Array<Byte>): Unit {
      val fnPtr = _1394515835_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1394515835_Ptr, writeBuffer.size,marshalToNative(writeBuffer),
          readBuffer.size,marshalToNative(readBuffer),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun WriteReadPartial(writeBuffer: Array<Byte>, readBuffer: Array<Byte>):
        I2cTransferResult? {
      val fnPtr = _1394515835_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<I2cTransferResult>()
      val hr = fn.invokeHR(arrayOf(__1394515835_Ptr, writeBuffer.size,marshalToNative(writeBuffer),
          readBuffer.size,marshalToNative(readBuffer), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<I2cTransferResult>(result.getValue())
      return resultValue
    }
  }

  public class II2cDevice_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IClosable {
    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1394515835_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1394515835_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<II2cDevice, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8636c136b9c54f709449cc46dc6f57eb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeII2cDevice(ptr: Pointer?): WithDefault = II2cDevice_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): II2cDevice {
      val address = segment.toRawLongValue()
      return makeII2cDevice(Pointer(address))
    }

    public override fun toNative(obj: II2cDevice): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1394515835_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: II2cDevice): Array<II2cDevice?> = (elements as
        Array<II2cDevice?>).castToImpl<II2cDevice,II2cDevice_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<II2cDevice?> = arrayOfNulls<II2cDevice_Impl>(size)
        as Array<II2cDevice?>
  }
}
