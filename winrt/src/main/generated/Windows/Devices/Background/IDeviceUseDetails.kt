package Windows.Devices.Background

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

@ABIMarker(IDeviceUseDetails.ABI::class)
@Signature("{7d565141-557e-4154-b994-e4f7a11fb323}")
@Guid("7d565141557e4154b994e4f7a11fb323")
@WinRTInterface("7d565141557e4154b994e4f7a11fb323")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDeviceUseDetails.ByReference::class)
public interface IDeviceUseDetails : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DeviceId(): String?

  @InterfaceMethod(1)
  public fun get_Arguments(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDeviceUseDetails> {
    public override fun getValue() = ABI.makeIDeviceUseDetails(pointer.getPointer(0))

    public fun setValue(value: IDeviceUseDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDeviceUseDetails {
    public val __1576784688_Ptr: Pointer?

    public val _1576784688_VtblPtr: Pointer?
      get() = __1576784688_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DeviceId(): String? {
      val fnPtr = _1576784688_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1576784688_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Arguments(): String? {
      val fnPtr = _1576784688_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1576784688_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IDeviceUseDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1576784688_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDeviceUseDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7d565141557e4154b994e4f7a11fb323")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDeviceUseDetails(ptr: Pointer?): WithDefault = IDeviceUseDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDeviceUseDetails {
      val address = segment.toRawLongValue()
      return makeIDeviceUseDetails(Pointer(address))
    }

    public override fun toNative(obj: IDeviceUseDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1576784688_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDeviceUseDetails): Array<IDeviceUseDetails?> = (elements
        as Array<IDeviceUseDetails?>).castToImpl<IDeviceUseDetails,IDeviceUseDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDeviceUseDetails?> =
        arrayOfNulls<IDeviceUseDetails_Impl>(size) as Array<IDeviceUseDetails?>
  }
}
