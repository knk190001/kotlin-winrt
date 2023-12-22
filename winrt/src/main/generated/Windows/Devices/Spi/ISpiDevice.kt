package Windows.Devices.Spi

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

@ABIMarker(ISpiDevice.ABI::class)
@Signature("{05d5356d-11b6-4d39-84d5-95dfb4c9f2ce}")
@Guid("05d5356d11b64d3984d595dfb4c9f2ce")
@WinRTInterface("05d5356d11b64d3984d595dfb4c9f2ce")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpiDevice.ByReference::class)
public interface ISpiDevice : NativeMapped, IWinRTInterface, IClosable {
  @InterfaceMethod(0)
  public fun get_DeviceId(): String?

  @InterfaceMethod(1)
  public fun get_ConnectionSettings(): SpiConnectionSettings?

  @InterfaceMethod(2)
  public fun Write(buffer: Array<Byte>): Unit

  @InterfaceMethod(3)
  public fun Read(buffer: Array<Byte>): Unit

  @InterfaceMethod(4)
  public fun TransferSequential(writeBuffer: Array<Byte>, readBuffer: Array<Byte>): Unit

  @InterfaceMethod(5)
  public fun TransferFullDuplex(writeBuffer: Array<Byte>, readBuffer: Array<Byte>): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ISpiDevice> {
    public override fun getValue() = ABI.makeISpiDevice(pointer.getPointer(0))

    public fun setValue(value: ISpiDevice_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpiDevice, IClosable.WithDefault {
    public val __1996720471_Ptr: Pointer?

    public val _1996720471_VtblPtr: Pointer?
      get() = __1996720471_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DeviceId(): String? {
      val fnPtr = _1996720471_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1996720471_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ConnectionSettings(): SpiConnectionSettings? {
      val fnPtr = _1996720471_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpiConnectionSettings>()
      val hr = fn.invokeHR(arrayOf(__1996720471_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpiConnectionSettings>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun Write(buffer: Array<Byte>): Unit {
      val fnPtr = _1996720471_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1996720471_Ptr, buffer.size,marshalToNative(buffer),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun Read(buffer: Array<Byte>): Unit {
      val fnPtr = _1996720471_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1996720471_Ptr, buffer.size,marshalToNative(buffer),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun TransferSequential(writeBuffer: Array<Byte>, readBuffer: Array<Byte>):
        Unit {
      val fnPtr = _1996720471_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1996720471_Ptr, writeBuffer.size,marshalToNative(writeBuffer),
          readBuffer.size,marshalToNative(readBuffer),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun TransferFullDuplex(writeBuffer: Array<Byte>, readBuffer: Array<Byte>):
        Unit {
      val fnPtr = _1996720471_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1996720471_Ptr, writeBuffer.size,marshalToNative(writeBuffer),
          readBuffer.size,marshalToNative(readBuffer),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISpiDevice_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IClosable {
    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1996720471_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1996720471_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpiDevice, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("05d5356d11b64d3984d595dfb4c9f2ce")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpiDevice(ptr: Pointer?): WithDefault = ISpiDevice_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpiDevice {
      val address = segment.toRawLongValue()
      return makeISpiDevice(Pointer(address))
    }

    public override fun toNative(obj: ISpiDevice): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1996720471_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpiDevice): Array<ISpiDevice?> = (elements as
        Array<ISpiDevice?>).castToImpl<ISpiDevice,ISpiDevice_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpiDevice?> = arrayOfNulls<ISpiDevice_Impl>(size)
        as Array<ISpiDevice?>
  }
}
