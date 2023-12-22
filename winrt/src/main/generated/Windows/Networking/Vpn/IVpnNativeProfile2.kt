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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IVpnNativeProfile2.ABI::class)
@Signature("{0fec2467-cdb5-4ac7-b5a3-0afb5ec47682}")
@Guid("0fec2467cdb54ac7b5a30afb5ec47682")
@WinRTInterface("0fec2467cdb54ac7b5a30afb5ec47682")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVpnNativeProfile2.ByReference::class)
public interface IVpnNativeProfile2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_RequireVpnClientAppUI(): Boolean

  @InterfaceMethod(1)
  public fun put_RequireVpnClientAppUI(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_ConnectionStatus(): VpnManagementConnectionStatus?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVpnNativeProfile2> {
    public override fun getValue() = ABI.makeIVpnNativeProfile2(pointer.getPointer(0))

    public fun setValue(value: IVpnNativeProfile2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVpnNativeProfile2 {
    public val __1449974864_Ptr: Pointer?

    public val _1449974864_VtblPtr: Pointer?
      get() = __1449974864_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RequireVpnClientAppUI(): Boolean {
      val fnPtr = _1449974864_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1449974864_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_RequireVpnClientAppUI(value: Boolean): Unit {
      val fnPtr = _1449974864_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1449974864_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_ConnectionStatus(): VpnManagementConnectionStatus? {
      val fnPtr = _1449974864_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VpnManagementConnectionStatus>()
      val hr = fn.invokeHR(arrayOf(__1449974864_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VpnManagementConnectionStatus>(result.getValue())
      return resultValue
    }
  }

  public class IVpnNativeProfile2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1449974864_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVpnNativeProfile2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0fec2467cdb54ac7b5a30afb5ec47682")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVpnNativeProfile2(ptr: Pointer?): WithDefault = IVpnNativeProfile2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVpnNativeProfile2 {
      val address = segment.toRawLongValue()
      return makeIVpnNativeProfile2(Pointer(address))
    }

    public override fun toNative(obj: IVpnNativeProfile2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1449974864_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVpnNativeProfile2): Array<IVpnNativeProfile2?> =
        (elements as
        Array<IVpnNativeProfile2?>).castToImpl<IVpnNativeProfile2,IVpnNativeProfile2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVpnNativeProfile2?> =
        arrayOfNulls<IVpnNativeProfile2_Impl>(size) as Array<IVpnNativeProfile2?>
  }
}
