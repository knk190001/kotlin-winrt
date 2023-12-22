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
import kotlin.Byte
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IVpnInterfaceIdFactory.ABI::class)
@Signature("{9e2ddca2-1712-4ce4-b179-8c652c6d1000}")
@Guid("9e2ddca217124ce4b1798c652c6d1000")
@WinRTInterface("9e2ddca217124ce4b1798c652c6d1000")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVpnInterfaceIdFactory.ByReference::class)
public interface IVpnInterfaceIdFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateVpnInterfaceId(address: Array<Byte>): VpnInterfaceId?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVpnInterfaceIdFactory> {
    public override fun getValue() = ABI.makeIVpnInterfaceIdFactory(pointer.getPointer(0))

    public fun setValue(value: IVpnInterfaceIdFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVpnInterfaceIdFactory {
    public val __800368038_Ptr: Pointer?

    public val _800368038_VtblPtr: Pointer?
      get() = __800368038_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateVpnInterfaceId(address: Array<Byte>): VpnInterfaceId? {
      val fnPtr = _800368038_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VpnInterfaceId>()
      val hr = fn.invokeHR(arrayOf(__800368038_Ptr, address.size,marshalToNative(address), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VpnInterfaceId>(result.getValue())
      return resultValue
    }
  }

  public class IVpnInterfaceIdFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __800368038_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVpnInterfaceIdFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9e2ddca217124ce4b1798c652c6d1000")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVpnInterfaceIdFactory(ptr: Pointer?): WithDefault =
        IVpnInterfaceIdFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVpnInterfaceIdFactory {
      val address = segment.toRawLongValue()
      return makeIVpnInterfaceIdFactory(Pointer(address))
    }

    public override fun toNative(obj: IVpnInterfaceIdFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__800368038_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVpnInterfaceIdFactory): Array<IVpnInterfaceIdFactory?> =
        (elements as
        Array<IVpnInterfaceIdFactory?>).castToImpl<IVpnInterfaceIdFactory,IVpnInterfaceIdFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVpnInterfaceIdFactory?> =
        arrayOfNulls<IVpnInterfaceIdFactory_Impl>(size) as Array<IVpnInterfaceIdFactory?>
  }
}
