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

@ABIMarker(IVpnPacketBuffer3.ABI::class)
@Signature("{e256072f-107b-4c40-b127-5bc53e0ad960}")
@Guid("e256072f107b4c40b1275bc53e0ad960")
@WinRTInterface("e256072f107b4c40b1275bc53e0ad960")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVpnPacketBuffer3.ByReference::class)
public interface IVpnPacketBuffer3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_TransportContext(value: IUnknown?): Unit

  @InterfaceMethod(1)
  public fun get_TransportContext(): IUnknown?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVpnPacketBuffer3> {
    public override fun getValue() = ABI.makeIVpnPacketBuffer3(pointer.getPointer(0))

    public fun setValue(value: IVpnPacketBuffer3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVpnPacketBuffer3 {
    public val __2091902171_Ptr: Pointer?

    public val _2091902171_VtblPtr: Pointer?
      get() = __2091902171_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_TransportContext(value: IUnknown?): Unit {
      val fnPtr = _2091902171_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2091902171_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_TransportContext(): IUnknown? {
      val fnPtr = _2091902171_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__2091902171_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }
  }

  public class IVpnPacketBuffer3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2091902171_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVpnPacketBuffer3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e256072f107b4c40b1275bc53e0ad960")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVpnPacketBuffer3(ptr: Pointer?): WithDefault = IVpnPacketBuffer3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVpnPacketBuffer3 {
      val address = segment.toRawLongValue()
      return makeIVpnPacketBuffer3(Pointer(address))
    }

    public override fun toNative(obj: IVpnPacketBuffer3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2091902171_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVpnPacketBuffer3): Array<IVpnPacketBuffer3?> = (elements
        as Array<IVpnPacketBuffer3?>).castToImpl<IVpnPacketBuffer3,IVpnPacketBuffer3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVpnPacketBuffer3?> =
        arrayOfNulls<IVpnPacketBuffer3_Impl>(size) as Array<IVpnPacketBuffer3?>
  }
}
