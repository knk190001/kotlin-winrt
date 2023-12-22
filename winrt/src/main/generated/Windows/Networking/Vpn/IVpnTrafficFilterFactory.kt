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

@ABIMarker(IVpnTrafficFilterFactory.ABI::class)
@Signature("{480d41d5-7f99-474c-86ee-96df168318f1}")
@Guid("480d41d57f99474c86ee96df168318f1")
@WinRTInterface("480d41d57f99474c86ee96df168318f1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVpnTrafficFilterFactory.ByReference::class)
public interface IVpnTrafficFilterFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(appId: VpnAppId?): VpnTrafficFilter?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVpnTrafficFilterFactory> {
    public override fun getValue() = ABI.makeIVpnTrafficFilterFactory(pointer.getPointer(0))

    public fun setValue(value: IVpnTrafficFilterFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVpnTrafficFilterFactory {
    public val __1393834267_Ptr: Pointer?

    public val _1393834267_VtblPtr: Pointer?
      get() = __1393834267_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(appId: VpnAppId?): VpnTrafficFilter? {
      val fnPtr = _1393834267_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VpnTrafficFilter>()
      val hr = fn.invokeHR(arrayOf(__1393834267_Ptr, marshalToNative(appId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VpnTrafficFilter>(result.getValue())
      return resultValue
    }
  }

  public class IVpnTrafficFilterFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1393834267_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVpnTrafficFilterFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("480d41d57f99474c86ee96df168318f1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVpnTrafficFilterFactory(ptr: Pointer?): WithDefault =
        IVpnTrafficFilterFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVpnTrafficFilterFactory {
      val address = segment.toRawLongValue()
      return makeIVpnTrafficFilterFactory(Pointer(address))
    }

    public override fun toNative(obj: IVpnTrafficFilterFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1393834267_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVpnTrafficFilterFactory):
        Array<IVpnTrafficFilterFactory?> = (elements as
        Array<IVpnTrafficFilterFactory?>).castToImpl<IVpnTrafficFilterFactory,IVpnTrafficFilterFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVpnTrafficFilterFactory?> =
        arrayOfNulls<IVpnTrafficFilterFactory_Impl>(size) as Array<IVpnTrafficFilterFactory?>
  }
}
