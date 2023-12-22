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

@ABIMarker(IVpnPacketBuffer2.ABI::class)
@Signature("{665e91f0-8805-4bf5-a619-2e84882e6b4f}")
@Guid("665e91f088054bf5a6192e84882e6b4f")
@WinRTInterface("665e91f088054bf5a6192e84882e6b4f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVpnPacketBuffer2.ByReference::class)
public interface IVpnPacketBuffer2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AppId(): VpnAppId?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVpnPacketBuffer2> {
    public override fun getValue() = ABI.makeIVpnPacketBuffer2(pointer.getPointer(0))

    public fun setValue(value: IVpnPacketBuffer2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVpnPacketBuffer2 {
    public val __2091902170_Ptr: Pointer?

    public val _2091902170_VtblPtr: Pointer?
      get() = __2091902170_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AppId(): VpnAppId? {
      val fnPtr = _2091902170_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VpnAppId>()
      val hr = fn.invokeHR(arrayOf(__2091902170_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VpnAppId>(result.getValue())
      return resultValue
    }
  }

  public class IVpnPacketBuffer2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2091902170_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVpnPacketBuffer2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("665e91f088054bf5a6192e84882e6b4f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVpnPacketBuffer2(ptr: Pointer?): WithDefault = IVpnPacketBuffer2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVpnPacketBuffer2 {
      val address = segment.toRawLongValue()
      return makeIVpnPacketBuffer2(Pointer(address))
    }

    public override fun toNative(obj: IVpnPacketBuffer2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2091902170_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVpnPacketBuffer2): Array<IVpnPacketBuffer2?> = (elements
        as Array<IVpnPacketBuffer2?>).castToImpl<IVpnPacketBuffer2,IVpnPacketBuffer2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVpnPacketBuffer2?> =
        arrayOfNulls<IVpnPacketBuffer2_Impl>(size) as Array<IVpnPacketBuffer2?>
  }
}
