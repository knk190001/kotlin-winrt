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

@ABIMarker(IVpnDomainNameAssignment.ABI::class)
@Signature("{4135b141-ccdb-49b5-9401-039a8ae767e9}")
@Guid("4135b141ccdb49b59401039a8ae767e9")
@WinRTInterface("4135b141ccdb49b59401039a8ae767e9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVpnDomainNameAssignment.ByReference::class)
public interface IVpnDomainNameAssignment : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DomainNameList(): IVector<VpnDomainNameInfo?>?

  @InterfaceMethod(1)
  public fun put_ProxyAutoConfigurationUri(value: Uri?): Unit

  @InterfaceMethod(2)
  public fun get_ProxyAutoConfigurationUri(): Uri?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVpnDomainNameAssignment> {
    public override fun getValue() = ABI.makeIVpnDomainNameAssignment(pointer.getPointer(0))

    public fun setValue(value: IVpnDomainNameAssignment_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVpnDomainNameAssignment {
    public val __1614441204_Ptr: Pointer?

    public val _1614441204_VtblPtr: Pointer?
      get() = __1614441204_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DomainNameList(): IVector<VpnDomainNameInfo?>? {
      val fnPtr = _1614441204_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<VpnDomainNameInfo?>>()
      val hr = fn.invokeHR(arrayOf(__1614441204_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<VpnDomainNameInfo?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_ProxyAutoConfigurationUri(value: Uri?): Unit {
      val fnPtr = _1614441204_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1614441204_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_ProxyAutoConfigurationUri(): Uri? {
      val fnPtr = _1614441204_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__1614441204_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }
  }

  public class IVpnDomainNameAssignment_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1614441204_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVpnDomainNameAssignment, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4135b141ccdb49b59401039a8ae767e9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVpnDomainNameAssignment(ptr: Pointer?): WithDefault =
        IVpnDomainNameAssignment_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVpnDomainNameAssignment {
      val address = segment.toRawLongValue()
      return makeIVpnDomainNameAssignment(Pointer(address))
    }

    public override fun toNative(obj: IVpnDomainNameAssignment): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1614441204_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVpnDomainNameAssignment):
        Array<IVpnDomainNameAssignment?> = (elements as
        Array<IVpnDomainNameAssignment?>).castToImpl<IVpnDomainNameAssignment,IVpnDomainNameAssignment_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVpnDomainNameAssignment?> =
        arrayOfNulls<IVpnDomainNameAssignment_Impl>(size) as Array<IVpnDomainNameAssignment?>
  }
}
