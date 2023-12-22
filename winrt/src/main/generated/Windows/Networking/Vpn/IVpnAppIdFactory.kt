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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IVpnAppIdFactory.ABI::class)
@Signature("{46adfd2a-0aab-4fdb-821d-d3ddc919788b}")
@Guid("46adfd2a0aab4fdb821dd3ddc919788b")
@WinRTInterface("46adfd2a0aab4fdb821dd3ddc919788b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVpnAppIdFactory.ByReference::class)
public interface IVpnAppIdFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(type: VpnAppIdType?, value: String?): VpnAppId?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVpnAppIdFactory> {
    public override fun getValue() = ABI.makeIVpnAppIdFactory(pointer.getPointer(0))

    public fun setValue(value: IVpnAppIdFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVpnAppIdFactory {
    public val __398593602_Ptr: Pointer?

    public val _398593602_VtblPtr: Pointer?
      get() = __398593602_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(type: VpnAppIdType?, value: String?): VpnAppId? {
      val fnPtr = _398593602_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VpnAppId>()
      val hr = fn.invokeHR(arrayOf(__398593602_Ptr, marshalToNative(type), marshalToNative(value),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VpnAppId>(result.getValue())
      return resultValue
    }
  }

  public class IVpnAppIdFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __398593602_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVpnAppIdFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("46adfd2a0aab4fdb821dd3ddc919788b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVpnAppIdFactory(ptr: Pointer?): WithDefault = IVpnAppIdFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVpnAppIdFactory {
      val address = segment.toRawLongValue()
      return makeIVpnAppIdFactory(Pointer(address))
    }

    public override fun toNative(obj: IVpnAppIdFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__398593602_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVpnAppIdFactory): Array<IVpnAppIdFactory?> = (elements as
        Array<IVpnAppIdFactory?>).castToImpl<IVpnAppIdFactory,IVpnAppIdFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVpnAppIdFactory?> =
        arrayOfNulls<IVpnAppIdFactory_Impl>(size) as Array<IVpnAppIdFactory?>
  }
}
