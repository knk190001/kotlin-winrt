package Windows.Networking.Vpn

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
import com.github.knk190001.winrtbinding.runtime.interop.OutArray
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
import kotlin.Byte
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IVpnInterfaceId.ABI::class)
@Signature("{9e2ddca2-1712-4ce4-b179-8c652c6d1011}")
@Guid("9e2ddca217124ce4b1798c652c6d1011")
@WinRTInterface("9e2ddca217124ce4b1798c652c6d1011")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVpnInterfaceId.ByReference::class)
public interface IVpnInterfaceId : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetAddressInfo(id: OutArray<Byte>): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVpnInterfaceId> {
    public override fun getValue() = ABI.makeIVpnInterfaceId(pointer.getPointer(0))

    public fun setValue(value: IVpnInterfaceId_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVpnInterfaceId {
    public val __926695740_Ptr: Pointer?

    public val _926695740_VtblPtr: Pointer?
      get() = __926695740_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetAddressInfo(id: OutArray<Byte>): Unit {
      val fnPtr = _926695740_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__926695740_Ptr, id.size,marshalToNative(id),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IVpnInterfaceId_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __926695740_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVpnInterfaceId, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9e2ddca217124ce4b1798c652c6d1011")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVpnInterfaceId(ptr: Pointer?): WithDefault = IVpnInterfaceId_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVpnInterfaceId {
      val address = segment.toRawLongValue()
      return makeIVpnInterfaceId(Pointer(address))
    }

    public override fun toNative(obj: IVpnInterfaceId): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__926695740_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVpnInterfaceId): Array<IVpnInterfaceId?> = (elements as
        Array<IVpnInterfaceId?>).castToImpl<IVpnInterfaceId,IVpnInterfaceId_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVpnInterfaceId?> =
        arrayOfNulls<IVpnInterfaceId_Impl>(size) as Array<IVpnInterfaceId?>
  }
}
