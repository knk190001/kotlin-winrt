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

@ABIMarker(IDeviceInformationPairingStatics.ABI::class)
@Signature("{e915c408-36d4-49a1-bf13-514173799b6b}")
@Guid("e915c40836d449a1bf13514173799b6b")
@WinRTInterface("e915c40836d449a1bf13514173799b6b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDeviceInformationPairingStatics.ByReference::class)
public interface IDeviceInformationPairingStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun TryRegisterForAllInboundPairingRequests(pairingKindsSupported: DevicePairingKinds?):
      Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDeviceInformationPairingStatics> {
    public override fun getValue() = ABI.makeIDeviceInformationPairingStatics(pointer.getPointer(0))

    public fun setValue(value: IDeviceInformationPairingStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDeviceInformationPairingStatics {
    public val __1774487723_Ptr: Pointer?

    public val _1774487723_VtblPtr: Pointer?
      get() = __1774487723_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override
        fun TryRegisterForAllInboundPairingRequests(pairingKindsSupported: DevicePairingKinds?):
        Boolean {
      val fnPtr = _1774487723_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1774487723_Ptr, marshalToNative(pairingKindsSupported),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IDeviceInformationPairingStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1774487723_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDeviceInformationPairingStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e915c40836d449a1bf13514173799b6b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDeviceInformationPairingStatics(ptr: Pointer?): WithDefault =
        IDeviceInformationPairingStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDeviceInformationPairingStatics {
      val address = segment.toRawLongValue()
      return makeIDeviceInformationPairingStatics(Pointer(address))
    }

    public override fun toNative(obj: IDeviceInformationPairingStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1774487723_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDeviceInformationPairingStatics):
        Array<IDeviceInformationPairingStatics?> = (elements as
        Array<IDeviceInformationPairingStatics?>).castToImpl<IDeviceInformationPairingStatics,IDeviceInformationPairingStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDeviceInformationPairingStatics?> =
        arrayOfNulls<IDeviceInformationPairingStatics_Impl>(size) as
        Array<IDeviceInformationPairingStatics?>
  }
}
