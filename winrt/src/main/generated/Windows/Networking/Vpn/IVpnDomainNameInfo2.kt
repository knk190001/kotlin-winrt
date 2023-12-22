package Windows.Networking.Vpn

import Windows.Foundation.Collections.IVector
import Windows.Foundation.Uri
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

@ABIMarker(IVpnDomainNameInfo2.ABI::class)
@Signature("{ab871151-6c53-4828-9883-d886de104407}")
@Guid("ab8711516c5348289883d886de104407")
@WinRTInterface("ab8711516c5348289883d886de104407")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVpnDomainNameInfo2.ByReference::class)
public interface IVpnDomainNameInfo2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_WebProxyUris(): IVector<Uri?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVpnDomainNameInfo2> {
    public override fun getValue() = ABI.makeIVpnDomainNameInfo2(pointer.getPointer(0))

    public fun setValue(value: IVpnDomainNameInfo2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVpnDomainNameInfo2 {
    public val __382924709_Ptr: Pointer?

    public val _382924709_VtblPtr: Pointer?
      get() = __382924709_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_WebProxyUris(): IVector<Uri?>? {
      val fnPtr = _382924709_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<Uri?>>()
      val hr = fn.invokeHR(arrayOf(__382924709_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<Uri?>>(result.getValue())
      return resultValue
    }
  }

  public class IVpnDomainNameInfo2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __382924709_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVpnDomainNameInfo2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ab8711516c5348289883d886de104407")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVpnDomainNameInfo2(ptr: Pointer?): WithDefault = IVpnDomainNameInfo2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVpnDomainNameInfo2 {
      val address = segment.toRawLongValue()
      return makeIVpnDomainNameInfo2(Pointer(address))
    }

    public override fun toNative(obj: IVpnDomainNameInfo2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__382924709_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVpnDomainNameInfo2): Array<IVpnDomainNameInfo2?> =
        (elements as
        Array<IVpnDomainNameInfo2?>).castToImpl<IVpnDomainNameInfo2,IVpnDomainNameInfo2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVpnDomainNameInfo2?> =
        arrayOfNulls<IVpnDomainNameInfo2_Impl>(size) as Array<IVpnDomainNameInfo2?>
  }
}
