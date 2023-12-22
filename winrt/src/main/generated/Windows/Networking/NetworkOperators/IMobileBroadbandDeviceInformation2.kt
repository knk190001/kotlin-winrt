package Windows.Networking.NetworkOperators

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

@ABIMarker(IMobileBroadbandDeviceInformation2.ABI::class)
@Signature("{2e467af1-f932-4737-a722-03ba72370cb8}")
@Guid("2e467af1f9324737a72203ba72370cb8")
@WinRTInterface("2e467af1f9324737a72203ba72370cb8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMobileBroadbandDeviceInformation2.ByReference::class)
public interface IMobileBroadbandDeviceInformation2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PinManager(): MobileBroadbandPinManager?

  @InterfaceMethod(1)
  public fun get_Revision(): String?

  @InterfaceMethod(2)
  public fun get_SerialNumber(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMobileBroadbandDeviceInformation2> {
    public override fun getValue() =
        ABI.makeIMobileBroadbandDeviceInformation2(pointer.getPointer(0))

    public fun setValue(value: IMobileBroadbandDeviceInformation2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMobileBroadbandDeviceInformation2 {
    public val __284562744_Ptr: Pointer?

    public val _284562744_VtblPtr: Pointer?
      get() = __284562744_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PinManager(): MobileBroadbandPinManager? {
      val fnPtr = _284562744_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MobileBroadbandPinManager>()
      val hr = fn.invokeHR(arrayOf(__284562744_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MobileBroadbandPinManager>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Revision(): String? {
      val fnPtr = _284562744_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__284562744_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_SerialNumber(): String? {
      val fnPtr = _284562744_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__284562744_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IMobileBroadbandDeviceInformation2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __284562744_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMobileBroadbandDeviceInformation2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2e467af1f9324737a72203ba72370cb8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMobileBroadbandDeviceInformation2(ptr: Pointer?): WithDefault =
        IMobileBroadbandDeviceInformation2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMobileBroadbandDeviceInformation2 {
      val address = segment.toRawLongValue()
      return makeIMobileBroadbandDeviceInformation2(Pointer(address))
    }

    public override fun toNative(obj: IMobileBroadbandDeviceInformation2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__284562744_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMobileBroadbandDeviceInformation2):
        Array<IMobileBroadbandDeviceInformation2?> = (elements as
        Array<IMobileBroadbandDeviceInformation2?>).castToImpl<IMobileBroadbandDeviceInformation2,IMobileBroadbandDeviceInformation2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMobileBroadbandDeviceInformation2?> =
        arrayOfNulls<IMobileBroadbandDeviceInformation2_Impl>(size) as
        Array<IMobileBroadbandDeviceInformation2?>
  }
}
