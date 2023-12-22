package Windows.Devices.Enumeration

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

@ABIMarker(IDeviceInformationPairingStatics2.ABI::class)
@Signature("{04de5372-b7b7-476b-a74f-c5836a704d98}")
@Guid("04de5372b7b7476ba74fc5836a704d98")
@WinRTInterface("04de5372b7b7476ba74fc5836a704d98")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDeviceInformationPairingStatics2.ByReference::class)
public interface IDeviceInformationPairingStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public
      fun TryRegisterForAllInboundPairingRequestsWithProtectionLevel(pairingKindsSupported: DevicePairingKinds?,
      minProtectionLevel: DevicePairingProtectionLevel?): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDeviceInformationPairingStatics2> {
    public override fun getValue() =
        ABI.makeIDeviceInformationPairingStatics2(pointer.getPointer(0))

    public fun setValue(value: IDeviceInformationPairingStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDeviceInformationPairingStatics2 {
    public val __825455485_Ptr: Pointer?

    public val _825455485_VtblPtr: Pointer?
      get() = __825455485_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override
        fun TryRegisterForAllInboundPairingRequestsWithProtectionLevel(pairingKindsSupported: DevicePairingKinds?,
        minProtectionLevel: DevicePairingProtectionLevel?): Boolean {
      val fnPtr = _825455485_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__825455485_Ptr, marshalToNative(pairingKindsSupported),
          marshalToNative(minProtectionLevel), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IDeviceInformationPairingStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __825455485_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDeviceInformationPairingStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("04de5372b7b7476ba74fc5836a704d98")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDeviceInformationPairingStatics2(ptr: Pointer?): WithDefault =
        IDeviceInformationPairingStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDeviceInformationPairingStatics2 {
      val address = segment.toRawLongValue()
      return makeIDeviceInformationPairingStatics2(Pointer(address))
    }

    public override fun toNative(obj: IDeviceInformationPairingStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__825455485_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDeviceInformationPairingStatics2):
        Array<IDeviceInformationPairingStatics2?> = (elements as
        Array<IDeviceInformationPairingStatics2?>).castToImpl<IDeviceInformationPairingStatics2,IDeviceInformationPairingStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDeviceInformationPairingStatics2?> =
        arrayOfNulls<IDeviceInformationPairingStatics2_Impl>(size) as
        Array<IDeviceInformationPairingStatics2?>
  }
}
