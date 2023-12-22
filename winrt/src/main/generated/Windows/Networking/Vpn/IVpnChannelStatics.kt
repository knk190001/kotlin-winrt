package Windows.Networking.Vpn

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IVpnChannelStatics.ABI::class)
@Signature("{88eb062d-e818-4ffd-98a6-363e3736c95d}")
@Guid("88eb062de8184ffd98a6363e3736c95d")
@WinRTInterface("88eb062de8184ffd98a6363e3736c95d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVpnChannelStatics.ByReference::class)
public interface IVpnChannelStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ProcessEventAsync(thirdPartyPlugIn: IUnknown?, event: IUnknown?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVpnChannelStatics> {
    public override fun getValue() = ABI.makeIVpnChannelStatics(pointer.getPointer(0))

    public fun setValue(value: IVpnChannelStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVpnChannelStatics {
    public val __662862670_Ptr: Pointer?

    public val _662862670_VtblPtr: Pointer?
      get() = __662862670_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ProcessEventAsync(thirdPartyPlugIn: IUnknown?, event: IUnknown?): Unit {
      val fnPtr = _662862670_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__662862670_Ptr, marshalToNative(thirdPartyPlugIn),
          marshalToNative(event),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IVpnChannelStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __662862670_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVpnChannelStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("88eb062de8184ffd98a6363e3736c95d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVpnChannelStatics(ptr: Pointer?): WithDefault = IVpnChannelStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVpnChannelStatics {
      val address = segment.toRawLongValue()
      return makeIVpnChannelStatics(Pointer(address))
    }

    public override fun toNative(obj: IVpnChannelStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__662862670_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVpnChannelStatics): Array<IVpnChannelStatics?> =
        (elements as
        Array<IVpnChannelStatics?>).castToImpl<IVpnChannelStatics,IVpnChannelStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVpnChannelStatics?> =
        arrayOfNulls<IVpnChannelStatics_Impl>(size) as Array<IVpnChannelStatics?>
  }
}
