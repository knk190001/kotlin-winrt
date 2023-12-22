package Windows.Devices.Spi.Provider

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

@ABIMarker(ISpiDeviceProvider.ABI::class)
@Signature("{0d1c3443-304b-405c-b4f7-f5ab1074461e}")
@Guid("0d1c3443304b405cb4f7f5ab1074461e")
@WinRTInterface("0d1c3443304b405cb4f7f5ab1074461e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpiDeviceProvider.ByReference::class)
public interface ISpiDeviceProvider : NativeMapped, IWinRTInterface, IClosable {
  @InterfaceMethod(0)
  public fun get_DeviceId(): String?

  @InterfaceMethod(1)
  public fun get_ConnectionSettings(): ProviderSpiConnectionSettings?

  @InterfaceMethod(2)
  public fun Write(buffer: Array<Byte>): Unit

  @InterfaceMethod(3)
  public fun Read(buffer: Array<Byte>): Unit

  @InterfaceMethod(4)
  public fun TransferSequential(writeBuffer: Array<Byte>, readBuffer: Array<Byte>): Unit

  @InterfaceMethod(5)
  public fun TransferFullDuplex(writeBuffer: Array<Byte>, readBuffer: Array<Byte>): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpiDeviceProvider> {
    public override fun getValue() = ABI.makeISpiDeviceProvider(pointer.getPointer(0))

    public fun setValue(value: ISpiDeviceProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpiDeviceProvider, IClosable.WithDefault {
    public val __1133166439_Ptr: Pointer?

    public val _1133166439_VtblPtr: Pointer?
      get() = __1133166439_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DeviceId(): String? {
      val fnPtr = _1133166439_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1133166439_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ConnectionSettings(): ProviderSpiConnectionSettings? {
      val fnPtr = _1133166439_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ProviderSpiConnectionSettings>()
      val hr = fn.invokeHR(arrayOf(__1133166439_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ProviderSpiConnectionSettings>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun Write(buffer: Array<Byte>): Unit {
      val fnPtr = _1133166439_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1133166439_Ptr, buffer.size,marshalToNative(buffer),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun Read(buffer: Array<Byte>): Unit {
      val fnPtr = _1133166439_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1133166439_Ptr, buffer.size,marshalToNative(buffer),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun TransferSequential(writeBuffer: Array<Byte>, readBuffer: Array<Byte>):
        Unit {
      val fnPtr = _1133166439_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1133166439_Ptr, writeBuffer.size,marshalToNative(writeBuffer),
          readBuffer.size,marshalToNative(readBuffer),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun TransferFullDuplex(writeBuffer: Array<Byte>, readBuffer: Array<Byte>):
        Unit {
      val fnPtr = _1133166439_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1133166439_Ptr, writeBuffer.size,marshalToNative(writeBuffer),
          readBuffer.size,marshalToNative(readBuffer),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISpiDeviceProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IClosable {
    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1133166439_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1133166439_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpiDeviceProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0d1c3443304b405cb4f7f5ab1074461e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpiDeviceProvider(ptr: Pointer?): WithDefault = ISpiDeviceProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpiDeviceProvider {
      val address = segment.toRawLongValue()
      return makeISpiDeviceProvider(Pointer(address))
    }

    public override fun toNative(obj: ISpiDeviceProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1133166439_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpiDeviceProvider): Array<ISpiDeviceProvider?> =
        (elements as
        Array<ISpiDeviceProvider?>).castToImpl<ISpiDeviceProvider,ISpiDeviceProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpiDeviceProvider?> =
        arrayOfNulls<ISpiDeviceProvider_Impl>(size) as Array<ISpiDeviceProvider?>
  }
}
