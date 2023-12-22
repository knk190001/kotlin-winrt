package Windows.Devices.Printers

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

@ABIMarker(IPrint3DDeviceStatics.ABI::class)
@Signature("{fde3620a-67cd-41b7-a344-5150a1fd75b5}")
@Guid("fde3620a67cd41b7a3445150a1fd75b5")
@WinRTInterface("fde3620a67cd41b7a3445150a1fd75b5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrint3DDeviceStatics.ByReference::class)
public interface IPrint3DDeviceStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun FromIdAsync(deviceId: String?): IAsyncOperation<Print3DDevice?>?

  @InterfaceMethod(1)
  public fun GetDeviceSelector(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrint3DDeviceStatics> {
    public override fun getValue() = ABI.makeIPrint3DDeviceStatics(pointer.getPointer(0))

    public fun setValue(value: IPrint3DDeviceStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrint3DDeviceStatics {
    public val __1295840869_Ptr: Pointer?

    public val _1295840869_VtblPtr: Pointer?
      get() = __1295840869_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FromIdAsync(deviceId: String?): IAsyncOperation<Print3DDevice?>? {
      val fnPtr = _1295840869_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Print3DDevice?>>()
      val hr = fn.invokeHR(arrayOf(__1295840869_Ptr, marshalToNative(deviceId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Print3DDevice?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDeviceSelector(): String? {
      val fnPtr = _1295840869_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1295840869_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IPrint3DDeviceStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1295840869_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrint3DDeviceStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fde3620a67cd41b7a3445150a1fd75b5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrint3DDeviceStatics(ptr: Pointer?): WithDefault =
        IPrint3DDeviceStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrint3DDeviceStatics {
      val address = segment.toRawLongValue()
      return makeIPrint3DDeviceStatics(Pointer(address))
    }

    public override fun toNative(obj: IPrint3DDeviceStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1295840869_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrint3DDeviceStatics): Array<IPrint3DDeviceStatics?> =
        (elements as
        Array<IPrint3DDeviceStatics?>).castToImpl<IPrint3DDeviceStatics,IPrint3DDeviceStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrint3DDeviceStatics?> =
        arrayOfNulls<IPrint3DDeviceStatics_Impl>(size) as Array<IPrint3DDeviceStatics?>
  }
}
