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

@ABIMarker(IVpnAppId.ABI::class)
@Signature("{7b06a635-5c58-41d9-94a7-bfbcf1d8ca54}")
@Guid("7b06a6355c5841d994a7bfbcf1d8ca54")
@WinRTInterface("7b06a6355c5841d994a7bfbcf1d8ca54")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVpnAppId.ByReference::class)
public interface IVpnAppId : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Type(): VpnAppIdType?

  @InterfaceMethod(1)
  public fun put_Type(value: VpnAppIdType?): Unit

  @InterfaceMethod(2)
  public fun get_Value(): String?

  @InterfaceMethod(3)
  public fun put_Value(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IVpnAppId> {
    public override fun getValue() = ABI.makeIVpnAppId(pointer.getPointer(0))

    public fun setValue(value: IVpnAppId_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVpnAppId {
    public val __1344447060_Ptr: Pointer?

    public val _1344447060_VtblPtr: Pointer?
      get() = __1344447060_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Type(): VpnAppIdType? {
      val fnPtr = _1344447060_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VpnAppIdType>()
      val hr = fn.invokeHR(arrayOf(__1344447060_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VpnAppIdType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Type(value: VpnAppIdType?): Unit {
      val fnPtr = _1344447060_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1344447060_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Value(): String? {
      val fnPtr = _1344447060_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1344447060_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Value(value: String?): Unit {
      val fnPtr = _1344447060_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1344447060_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IVpnAppId_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1344447060_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVpnAppId, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7b06a6355c5841d994a7bfbcf1d8ca54")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVpnAppId(ptr: Pointer?): WithDefault = IVpnAppId_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVpnAppId {
      val address = segment.toRawLongValue()
      return makeIVpnAppId(Pointer(address))
    }

    public override fun toNative(obj: IVpnAppId): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1344447060_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVpnAppId): Array<IVpnAppId?> = (elements as
        Array<IVpnAppId?>).castToImpl<IVpnAppId,IVpnAppId_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVpnAppId?> = arrayOfNulls<IVpnAppId_Impl>(size)
        as Array<IVpnAppId?>
  }
}
