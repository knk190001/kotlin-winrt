package Windows.Devices.Background

import Windows.Foundation.TimeSpan
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

@ABIMarker(IDeviceServicingDetails.ABI::class)
@Signature("{4aabee29-2344-4ac4-8527-4a8ef6905645}")
@Guid("4aabee2923444ac485274a8ef6905645")
@WinRTInterface("4aabee2923444ac485274a8ef6905645")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDeviceServicingDetails.ByReference::class)
public interface IDeviceServicingDetails : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DeviceId(): String?

  @InterfaceMethod(1)
  public fun get_Arguments(): String?

  @InterfaceMethod(2)
  public fun get_ExpectedDuration(): TimeSpan?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDeviceServicingDetails> {
    public override fun getValue() = ABI.makeIDeviceServicingDetails(pointer.getPointer(0))

    public fun setValue(value: IDeviceServicingDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDeviceServicingDetails {
    public val __1250836987_Ptr: Pointer?

    public val _1250836987_VtblPtr: Pointer?
      get() = __1250836987_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DeviceId(): String? {
      val fnPtr = _1250836987_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1250836987_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Arguments(): String? {
      val fnPtr = _1250836987_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1250836987_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ExpectedDuration(): TimeSpan? {
      val fnPtr = _1250836987_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1250836987_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }
  }

  public class IDeviceServicingDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1250836987_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDeviceServicingDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4aabee2923444ac485274a8ef6905645")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDeviceServicingDetails(ptr: Pointer?): WithDefault =
        IDeviceServicingDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDeviceServicingDetails {
      val address = segment.toRawLongValue()
      return makeIDeviceServicingDetails(Pointer(address))
    }

    public override fun toNative(obj: IDeviceServicingDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1250836987_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDeviceServicingDetails): Array<IDeviceServicingDetails?>
        = (elements as
        Array<IDeviceServicingDetails?>).castToImpl<IDeviceServicingDetails,IDeviceServicingDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDeviceServicingDetails?> =
        arrayOfNulls<IDeviceServicingDetails_Impl>(size) as Array<IDeviceServicingDetails?>
  }
}
