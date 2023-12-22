package Windows.Devices.Spi

import Windows.Foundation.IAsyncOperation
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISpiDeviceStatics.ABI::class)
@Signature("{a278e559-5720-4d3f-bd93-56f5ff5a5879}")
@Guid("a278e55957204d3fbd9356f5ff5a5879")
@WinRTInterface("a278e55957204d3fbd9356f5ff5a5879")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpiDeviceStatics.ByReference::class)
public interface ISpiDeviceStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDeviceSelector(): String?

  @InterfaceMethod(1)
  public fun GetDeviceSelector(friendlyName: String?): String?

  @InterfaceMethod(2)
  public fun GetBusInfo(busId: String?): SpiBusInfo?

  @InterfaceMethod(3)
  public fun FromIdAsync(busId: String?, settings: SpiConnectionSettings?):
      IAsyncOperation<SpiDevice?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpiDeviceStatics> {
    public override fun getValue() = ABI.makeISpiDeviceStatics(pointer.getPointer(0))

    public fun setValue(value: ISpiDeviceStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpiDeviceStatics {
    public val __201457444_Ptr: Pointer?

    public val _201457444_VtblPtr: Pointer?
      get() = __201457444_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDeviceSelector(): String? {
      val fnPtr = _201457444_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__201457444_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDeviceSelector(friendlyName: String?): String? {
      val fnPtr = _201457444_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__201457444_Ptr, marshalToNative(friendlyName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetBusInfo(busId: String?): SpiBusInfo? {
      val fnPtr = _201457444_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpiBusInfo>()
      val hr = fn.invokeHR(arrayOf(__201457444_Ptr, marshalToNative(busId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpiBusInfo>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun FromIdAsync(busId: String?, settings: SpiConnectionSettings?):
        IAsyncOperation<SpiDevice?>? {
      val fnPtr = _201457444_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<SpiDevice?>>()
      val hr = fn.invokeHR(arrayOf(__201457444_Ptr, marshalToNative(busId),
          marshalToNative(settings), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<SpiDevice?>>(result.getValue())
      return resultValue
    }
  }

  public class ISpiDeviceStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __201457444_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpiDeviceStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a278e55957204d3fbd9356f5ff5a5879")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpiDeviceStatics(ptr: Pointer?): WithDefault = ISpiDeviceStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpiDeviceStatics {
      val address = segment.toRawLongValue()
      return makeISpiDeviceStatics(Pointer(address))
    }

    public override fun toNative(obj: ISpiDeviceStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__201457444_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpiDeviceStatics): Array<ISpiDeviceStatics?> = (elements
        as Array<ISpiDeviceStatics?>).castToImpl<ISpiDeviceStatics,ISpiDeviceStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpiDeviceStatics?> =
        arrayOfNulls<ISpiDeviceStatics_Impl>(size) as Array<ISpiDeviceStatics?>
  }
}
