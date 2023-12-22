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

@ABIMarker(ICompassStatics2.ABI::class)
@Signature("{0ace0ead-3baa-4990-9ce4-be0913754ed2}")
@Guid("0ace0ead3baa49909ce4be0913754ed2")
@WinRTInterface("0ace0ead3baa49909ce4be0913754ed2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompassStatics2.ByReference::class)
public interface ICompassStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDeviceSelector(): String?

  @InterfaceMethod(1)
  public fun FromIdAsync(deviceId: String?): IAsyncOperation<Compass?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompassStatics2> {
    public override fun getValue() = ABI.makeICompassStatics2(pointer.getPointer(0))

    public fun setValue(value: ICompassStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompassStatics2 {
    public val __1713602349_Ptr: Pointer?

    public val _1713602349_VtblPtr: Pointer?
      get() = __1713602349_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDeviceSelector(): String? {
      val fnPtr = _1713602349_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1713602349_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun FromIdAsync(deviceId: String?): IAsyncOperation<Compass?>? {
      val fnPtr = _1713602349_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Compass?>>()
      val hr = fn.invokeHR(arrayOf(__1713602349_Ptr, marshalToNative(deviceId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Compass?>>(result.getValue())
      return resultValue
    }
  }

  public class ICompassStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1713602349_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompassStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0ace0ead3baa49909ce4be0913754ed2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompassStatics2(ptr: Pointer?): WithDefault = ICompassStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompassStatics2 {
      val address = segment.toRawLongValue()
      return makeICompassStatics2(Pointer(address))
    }

    public override fun toNative(obj: ICompassStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1713602349_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompassStatics2): Array<ICompassStatics2?> = (elements as
        Array<ICompassStatics2?>).castToImpl<ICompassStatics2,ICompassStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompassStatics2?> =
        arrayOfNulls<ICompassStatics2_Impl>(size) as Array<ICompassStatics2?>
  }
}
