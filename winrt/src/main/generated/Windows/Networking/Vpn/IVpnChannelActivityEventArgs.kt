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

@ABIMarker(IVpnChannelActivityEventArgs.ABI::class)
@Signature("{a36c88f2-afdc-4775-855d-d4ac0a35fc55}")
@Guid("a36c88f2afdc4775855dd4ac0a35fc55")
@WinRTInterface("a36c88f2afdc4775855dd4ac0a35fc55")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVpnChannelActivityEventArgs.ByReference::class)
public interface IVpnChannelActivityEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Type(): VpnChannelActivityEventType?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVpnChannelActivityEventArgs> {
    public override fun getValue() = ABI.makeIVpnChannelActivityEventArgs(pointer.getPointer(0))

    public fun setValue(value: IVpnChannelActivityEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVpnChannelActivityEventArgs {
    public val __1287517963_Ptr: Pointer?

    public val _1287517963_VtblPtr: Pointer?
      get() = __1287517963_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Type(): VpnChannelActivityEventType? {
      val fnPtr = _1287517963_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VpnChannelActivityEventType>()
      val hr = fn.invokeHR(arrayOf(__1287517963_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VpnChannelActivityEventType>(result.getValue())
      return resultValue
    }
  }

  public class IVpnChannelActivityEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1287517963_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVpnChannelActivityEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a36c88f2afdc4775855dd4ac0a35fc55")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVpnChannelActivityEventArgs(ptr: Pointer?): WithDefault =
        IVpnChannelActivityEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVpnChannelActivityEventArgs {
      val address = segment.toRawLongValue()
      return makeIVpnChannelActivityEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IVpnChannelActivityEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1287517963_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVpnChannelActivityEventArgs):
        Array<IVpnChannelActivityEventArgs?> = (elements as
        Array<IVpnChannelActivityEventArgs?>).castToImpl<IVpnChannelActivityEventArgs,IVpnChannelActivityEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVpnChannelActivityEventArgs?> =
        arrayOfNulls<IVpnChannelActivityEventArgs_Impl>(size) as
        Array<IVpnChannelActivityEventArgs?>
  }
}
