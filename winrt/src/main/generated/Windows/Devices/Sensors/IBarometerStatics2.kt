package Windows.Devices.Sensors

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

@ABIMarker(IBarometerStatics2.ABI::class)
@Signature("{8fc6b1e7-95ff-44ac-878e-d65c8308c34c}")
@Guid("8fc6b1e795ff44ac878ed65c8308c34c")
@WinRTInterface("8fc6b1e795ff44ac878ed65c8308c34c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBarometerStatics2.ByReference::class)
public interface IBarometerStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun FromIdAsync(deviceId: String?): IAsyncOperation<Barometer?>?

  @InterfaceMethod(1)
  public fun GetDeviceSelector(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBarometerStatics2> {
    public override fun getValue() = ABI.makeIBarometerStatics2(pointer.getPointer(0))

    public fun setValue(value: IBarometerStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBarometerStatics2 {
    public val __1852734990_Ptr: Pointer?

    public val _1852734990_VtblPtr: Pointer?
      get() = __1852734990_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FromIdAsync(deviceId: String?): IAsyncOperation<Barometer?>? {
      val fnPtr = _1852734990_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Barometer?>>()
      val hr = fn.invokeHR(arrayOf(__1852734990_Ptr, marshalToNative(deviceId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Barometer?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDeviceSelector(): String? {
      val fnPtr = _1852734990_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1852734990_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IBarometerStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1852734990_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBarometerStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8fc6b1e795ff44ac878ed65c8308c34c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBarometerStatics2(ptr: Pointer?): WithDefault = IBarometerStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBarometerStatics2 {
      val address = segment.toRawLongValue()
      return makeIBarometerStatics2(Pointer(address))
    }

    public override fun toNative(obj: IBarometerStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1852734990_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBarometerStatics2): Array<IBarometerStatics2?> =
        (elements as
        Array<IBarometerStatics2?>).castToImpl<IBarometerStatics2,IBarometerStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBarometerStatics2?> =
        arrayOfNulls<IBarometerStatics2_Impl>(size) as Array<IBarometerStatics2?>
  }
}
