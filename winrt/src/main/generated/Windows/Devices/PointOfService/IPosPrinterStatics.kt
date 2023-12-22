package Windows.Devices.PointOfService

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

@ABIMarker(IPosPrinterStatics.ABI::class)
@Signature("{8ce0d4ea-132f-4cdf-a64a-2d0d7c96a85b}")
@Guid("8ce0d4ea132f4cdfa64a2d0d7c96a85b")
@WinRTInterface("8ce0d4ea132f4cdfa64a2d0d7c96a85b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPosPrinterStatics.ByReference::class)
public interface IPosPrinterStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDefaultAsync(): IAsyncOperation<PosPrinter?>?

  @InterfaceMethod(1)
  public fun FromIdAsync(deviceId: String?): IAsyncOperation<PosPrinter?>?

  @InterfaceMethod(2)
  public fun GetDeviceSelector(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPosPrinterStatics> {
    public override fun getValue() = ABI.makeIPosPrinterStatics(pointer.getPointer(0))

    public fun setValue(value: IPosPrinterStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPosPrinterStatics {
    public val __1181953920_Ptr: Pointer?

    public val _1181953920_VtblPtr: Pointer?
      get() = __1181953920_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDefaultAsync(): IAsyncOperation<PosPrinter?>? {
      val fnPtr = _1181953920_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<PosPrinter?>>()
      val hr = fn.invokeHR(arrayOf(__1181953920_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<PosPrinter?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun FromIdAsync(deviceId: String?): IAsyncOperation<PosPrinter?>? {
      val fnPtr = _1181953920_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<PosPrinter?>>()
      val hr = fn.invokeHR(arrayOf(__1181953920_Ptr, marshalToNative(deviceId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<PosPrinter?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetDeviceSelector(): String? {
      val fnPtr = _1181953920_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1181953920_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IPosPrinterStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1181953920_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPosPrinterStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8ce0d4ea132f4cdfa64a2d0d7c96a85b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPosPrinterStatics(ptr: Pointer?): WithDefault = IPosPrinterStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPosPrinterStatics {
      val address = segment.toRawLongValue()
      return makeIPosPrinterStatics(Pointer(address))
    }

    public override fun toNative(obj: IPosPrinterStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1181953920_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPosPrinterStatics): Array<IPosPrinterStatics?> =
        (elements as
        Array<IPosPrinterStatics?>).castToImpl<IPosPrinterStatics,IPosPrinterStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPosPrinterStatics?> =
        arrayOfNulls<IPosPrinterStatics_Impl>(size) as Array<IPosPrinterStatics?>
  }
}
