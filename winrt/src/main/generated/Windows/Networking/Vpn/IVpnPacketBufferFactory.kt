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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IVpnPacketBufferFactory.ABI::class)
@Signature("{9e2ddca2-1712-4ce4-b179-8c652c6d9999}")
@Guid("9e2ddca217124ce4b1798c652c6d9999")
@WinRTInterface("9e2ddca217124ce4b1798c652c6d9999")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVpnPacketBufferFactory.ByReference::class)
public interface IVpnPacketBufferFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateVpnPacketBuffer(
    parentBuffer: VpnPacketBuffer?,
    offset: WinDef.UINT,
    length: WinDef.UINT
  ): VpnPacketBuffer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVpnPacketBufferFactory> {
    public override fun getValue() = ABI.makeIVpnPacketBufferFactory(pointer.getPointer(0))

    public fun setValue(value: IVpnPacketBufferFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVpnPacketBufferFactory {
    public val __479228014_Ptr: Pointer?

    public val _479228014_VtblPtr: Pointer?
      get() = __479228014_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateVpnPacketBuffer(
      parentBuffer: VpnPacketBuffer?,
      offset: WinDef.UINT,
      length: WinDef.UINT
    ): VpnPacketBuffer? {
      val fnPtr = _479228014_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VpnPacketBuffer>()
      val hr = fn.invokeHR(arrayOf(__479228014_Ptr, marshalToNative(parentBuffer), offset, length,
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VpnPacketBuffer>(result.getValue())
      return resultValue
    }
  }

  public class IVpnPacketBufferFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __479228014_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVpnPacketBufferFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9e2ddca217124ce4b1798c652c6d9999")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVpnPacketBufferFactory(ptr: Pointer?): WithDefault =
        IVpnPacketBufferFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVpnPacketBufferFactory {
      val address = segment.toRawLongValue()
      return makeIVpnPacketBufferFactory(Pointer(address))
    }

    public override fun toNative(obj: IVpnPacketBufferFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__479228014_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVpnPacketBufferFactory): Array<IVpnPacketBufferFactory?>
        = (elements as
        Array<IVpnPacketBufferFactory?>).castToImpl<IVpnPacketBufferFactory,IVpnPacketBufferFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVpnPacketBufferFactory?> =
        arrayOfNulls<IVpnPacketBufferFactory_Impl>(size) as Array<IVpnPacketBufferFactory?>
  }
}
