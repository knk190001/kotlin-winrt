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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMobileBroadbandDeviceServiceInformation.ABI::class)
@Signature("{53d69b5b-c4ed-45f0-803a-d9417a6d9846}")
@Guid("53d69b5bc4ed45f0803ad9417a6d9846")
@WinRTInterface("53d69b5bc4ed45f0803ad9417a6d9846")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMobileBroadbandDeviceServiceInformation.ByReference::class)
public interface IMobileBroadbandDeviceServiceInformation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DeviceServiceId(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(1)
  public fun get_IsDataReadSupported(): Boolean

  @InterfaceMethod(2)
  public fun get_IsDataWriteSupported(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMobileBroadbandDeviceServiceInformation> {
    public override fun getValue() =
        ABI.makeIMobileBroadbandDeviceServiceInformation(pointer.getPointer(0))

    public fun setValue(value: IMobileBroadbandDeviceServiceInformation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMobileBroadbandDeviceServiceInformation {
    public val __532060777_Ptr: Pointer?

    public val _532060777_VtblPtr: Pointer?
      get() = __532060777_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DeviceServiceId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _532060777_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__532060777_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsDataReadSupported(): Boolean {
      val fnPtr = _532060777_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__532060777_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_IsDataWriteSupported(): Boolean {
      val fnPtr = _532060777_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__532060777_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IMobileBroadbandDeviceServiceInformation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __532060777_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMobileBroadbandDeviceServiceInformation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("53d69b5bc4ed45f0803ad9417a6d9846")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMobileBroadbandDeviceServiceInformation(ptr: Pointer?): WithDefault =
        IMobileBroadbandDeviceServiceInformation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IMobileBroadbandDeviceServiceInformation {
      val address = segment.toRawLongValue()
      return makeIMobileBroadbandDeviceServiceInformation(Pointer(address))
    }

    public override fun toNative(obj: IMobileBroadbandDeviceServiceInformation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__532060777_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMobileBroadbandDeviceServiceInformation):
        Array<IMobileBroadbandDeviceServiceInformation?> = (elements as
        Array<IMobileBroadbandDeviceServiceInformation?>).castToImpl<IMobileBroadbandDeviceServiceInformation,IMobileBroadbandDeviceServiceInformation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMobileBroadbandDeviceServiceInformation?> =
        arrayOfNulls<IMobileBroadbandDeviceServiceInformation_Impl>(size) as
        Array<IMobileBroadbandDeviceServiceInformation?>
  }
}
