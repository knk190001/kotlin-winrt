package Windows.Devices.I2c.Provider

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

@ABIMarker(II2cDeviceProvider.ABI::class)
@Signature("{ad342654-57e8-453e-8329-d1e447d103a9}")
@Guid("ad34265457e8453e8329d1e447d103a9")
@WinRTInterface("ad34265457e8453e8329d1e447d103a9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = II2cDeviceProvider.ByReference::class)
public interface II2cDeviceProvider : NativeMapped, IWinRTInterface, IClosable {
  @InterfaceMethod(0)
  public fun get_DeviceId(): String?

  @InterfaceMethod(1)
  public fun Write(buffer: Array<Byte>): Unit

  @InterfaceMethod(2)
  public fun WritePartial(buffer: Array<Byte>): ProviderI2cTransferResult?

  @InterfaceMethod(3)
  public fun Read(buffer: Array<Byte>): Unit

  @InterfaceMethod(4)
  public fun ReadPartial(buffer: Array<Byte>): ProviderI2cTransferResult?

  @InterfaceMethod(5)
  public fun WriteRead(writeBuffer: Array<Byte>, readBuffer: Array<Byte>): Unit

  @InterfaceMethod(6)
  public fun WriteReadPartial(writeBuffer: Array<Byte>, readBuffer: Array<Byte>):
      ProviderI2cTransferResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<II2cDeviceProvider> {
    public override fun getValue() = ABI.makeII2cDeviceProvider(pointer.getPointer(0))

    public fun setValue(value: II2cDeviceProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : II2cDeviceProvider, IClosable.WithDefault {
    public val __744235865_Ptr: Pointer?

    public val _744235865_VtblPtr: Pointer?
      get() = __744235865_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DeviceId(): String? {
      val fnPtr = _744235865_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__744235865_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun Write(buffer: Array<Byte>): Unit {
      val fnPtr = _744235865_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__744235865_Ptr, buffer.size,marshalToNative(buffer),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun WritePartial(buffer: Array<Byte>): ProviderI2cTransferResult? {
      val fnPtr = _744235865_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ProviderI2cTransferResult>()
      val hr = fn.invokeHR(arrayOf(__744235865_Ptr, buffer.size,marshalToNative(buffer), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ProviderI2cTransferResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun Read(buffer: Array<Byte>): Unit {
      val fnPtr = _744235865_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__744235865_Ptr, buffer.size,marshalToNative(buffer),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun ReadPartial(buffer: Array<Byte>): ProviderI2cTransferResult? {
      val fnPtr = _744235865_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ProviderI2cTransferResult>()
      val hr = fn.invokeHR(arrayOf(__744235865_Ptr, buffer.size,marshalToNative(buffer), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ProviderI2cTransferResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun WriteRead(writeBuffer: Array<Byte>, readBuffer: Array<Byte>): Unit {
      val fnPtr = _744235865_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__744235865_Ptr, writeBuffer.size,marshalToNative(writeBuffer),
          readBuffer.size,marshalToNative(readBuffer),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun WriteReadPartial(writeBuffer: Array<Byte>, readBuffer: Array<Byte>):
        ProviderI2cTransferResult? {
      val fnPtr = _744235865_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ProviderI2cTransferResult>()
      val hr = fn.invokeHR(arrayOf(__744235865_Ptr, writeBuffer.size,marshalToNative(writeBuffer),
          readBuffer.size,marshalToNative(readBuffer), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ProviderI2cTransferResult>(result.getValue())
      return resultValue
    }
  }

  public class II2cDeviceProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IClosable {
    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_744235865_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __744235865_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<II2cDeviceProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ad34265457e8453e8329d1e447d103a9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeII2cDeviceProvider(ptr: Pointer?): WithDefault = II2cDeviceProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): II2cDeviceProvider {
      val address = segment.toRawLongValue()
      return makeII2cDeviceProvider(Pointer(address))
    }

    public override fun toNative(obj: II2cDeviceProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__744235865_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: II2cDeviceProvider): Array<II2cDeviceProvider?> =
        (elements as
        Array<II2cDeviceProvider?>).castToImpl<II2cDeviceProvider,II2cDeviceProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<II2cDeviceProvider?> =
        arrayOfNulls<II2cDeviceProvider_Impl>(size) as Array<II2cDeviceProvider?>
  }
}
