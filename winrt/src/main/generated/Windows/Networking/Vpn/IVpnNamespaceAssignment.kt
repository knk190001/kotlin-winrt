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

@ABIMarker(IVpnNamespaceAssignment.ABI::class)
@Signature("{d7f7db18-307d-4c0e-bd62-8fa270bbadd6}")
@Guid("d7f7db18307d4c0ebd628fa270bbadd6")
@WinRTInterface("d7f7db18307d4c0ebd628fa270bbadd6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVpnNamespaceAssignment.ByReference::class)
public interface IVpnNamespaceAssignment : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_NamespaceList(value: IVector<VpnNamespaceInfo?>?): Unit

  @InterfaceMethod(1)
  public fun get_NamespaceList(): IVector<VpnNamespaceInfo?>?

  @InterfaceMethod(2)
  public fun put_ProxyAutoConfigUri(value: Uri?): Unit

  @InterfaceMethod(3)
  public fun get_ProxyAutoConfigUri(): Uri?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVpnNamespaceAssignment> {
    public override fun getValue() = ABI.makeIVpnNamespaceAssignment(pointer.getPointer(0))

    public fun setValue(value: IVpnNamespaceAssignment_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVpnNamespaceAssignment {
    public val __978901736_Ptr: Pointer?

    public val _978901736_VtblPtr: Pointer?
      get() = __978901736_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_NamespaceList(value: IVector<VpnNamespaceInfo?>?): Unit {
      val fnPtr = _978901736_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__978901736_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_NamespaceList(): IVector<VpnNamespaceInfo?>? {
      val fnPtr = _978901736_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<VpnNamespaceInfo?>>()
      val hr = fn.invokeHR(arrayOf(__978901736_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<VpnNamespaceInfo?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_ProxyAutoConfigUri(value: Uri?): Unit {
      val fnPtr = _978901736_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__978901736_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_ProxyAutoConfigUri(): Uri? {
      val fnPtr = _978901736_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__978901736_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }
  }

  public class IVpnNamespaceAssignment_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __978901736_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVpnNamespaceAssignment, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d7f7db18307d4c0ebd628fa270bbadd6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVpnNamespaceAssignment(ptr: Pointer?): WithDefault =
        IVpnNamespaceAssignment_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVpnNamespaceAssignment {
      val address = segment.toRawLongValue()
      return makeIVpnNamespaceAssignment(Pointer(address))
    }

    public override fun toNative(obj: IVpnNamespaceAssignment): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__978901736_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVpnNamespaceAssignment): Array<IVpnNamespaceAssignment?>
        = (elements as
        Array<IVpnNamespaceAssignment?>).castToImpl<IVpnNamespaceAssignment,IVpnNamespaceAssignment_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVpnNamespaceAssignment?> =
        arrayOfNulls<IVpnNamespaceAssignment_Impl>(size) as Array<IVpnNamespaceAssignment?>
  }
}
