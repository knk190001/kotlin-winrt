package Windows.Networking.Vpn

import Windows.Foundation.Collections.IVector
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

@ABIMarker(IVpnRouteAssignment.ABI::class)
@Signature("{db64de22-ce39-4a76-9550-f61039f80e48}")
@Guid("db64de22ce394a769550f61039f80e48")
@WinRTInterface("db64de22ce394a769550f61039f80e48")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVpnRouteAssignment.ByReference::class)
public interface IVpnRouteAssignment : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_Ipv4InclusionRoutes(value: IVector<VpnRoute?>?): Unit

  @InterfaceMethod(1)
  public fun put_Ipv6InclusionRoutes(value: IVector<VpnRoute?>?): Unit

  @InterfaceMethod(2)
  public fun get_Ipv4InclusionRoutes(): IVector<VpnRoute?>?

  @InterfaceMethod(3)
  public fun get_Ipv6InclusionRoutes(): IVector<VpnRoute?>?

  @InterfaceMethod(4)
  public fun put_Ipv4ExclusionRoutes(value: IVector<VpnRoute?>?): Unit

  @InterfaceMethod(5)
  public fun put_Ipv6ExclusionRoutes(value: IVector<VpnRoute?>?): Unit

  @InterfaceMethod(6)
  public fun get_Ipv4ExclusionRoutes(): IVector<VpnRoute?>?

  @InterfaceMethod(7)
  public fun get_Ipv6ExclusionRoutes(): IVector<VpnRoute?>?

  @InterfaceMethod(8)
  public fun put_ExcludeLocalSubnets(value: Boolean): Unit

  @InterfaceMethod(9)
  public fun get_ExcludeLocalSubnets(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVpnRouteAssignment> {
    public override fun getValue() = ABI.makeIVpnRouteAssignment(pointer.getPointer(0))

    public fun setValue(value: IVpnRouteAssignment_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVpnRouteAssignment {
    public val __1338935162_Ptr: Pointer?

    public val _1338935162_VtblPtr: Pointer?
      get() = __1338935162_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_Ipv4InclusionRoutes(value: IVector<VpnRoute?>?): Unit {
      val fnPtr = _1338935162_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1338935162_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun put_Ipv6InclusionRoutes(value: IVector<VpnRoute?>?): Unit {
      val fnPtr = _1338935162_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1338935162_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Ipv4InclusionRoutes(): IVector<VpnRoute?>? {
      val fnPtr = _1338935162_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<VpnRoute?>>()
      val hr = fn.invokeHR(arrayOf(__1338935162_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<VpnRoute?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Ipv6InclusionRoutes(): IVector<VpnRoute?>? {
      val fnPtr = _1338935162_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<VpnRoute?>>()
      val hr = fn.invokeHR(arrayOf(__1338935162_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<VpnRoute?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_Ipv4ExclusionRoutes(value: IVector<VpnRoute?>?): Unit {
      val fnPtr = _1338935162_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1338935162_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun put_Ipv6ExclusionRoutes(value: IVector<VpnRoute?>?): Unit {
      val fnPtr = _1338935162_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1338935162_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_Ipv4ExclusionRoutes(): IVector<VpnRoute?>? {
      val fnPtr = _1338935162_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<VpnRoute?>>()
      val hr = fn.invokeHR(arrayOf(__1338935162_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<VpnRoute?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_Ipv6ExclusionRoutes(): IVector<VpnRoute?>? {
      val fnPtr = _1338935162_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<VpnRoute?>>()
      val hr = fn.invokeHR(arrayOf(__1338935162_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<VpnRoute?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun put_ExcludeLocalSubnets(value: Boolean): Unit {
      val fnPtr = _1338935162_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1338935162_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_ExcludeLocalSubnets(): Boolean {
      val fnPtr = _1338935162_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1338935162_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IVpnRouteAssignment_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1338935162_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVpnRouteAssignment, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("db64de22ce394a769550f61039f80e48")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVpnRouteAssignment(ptr: Pointer?): WithDefault = IVpnRouteAssignment_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVpnRouteAssignment {
      val address = segment.toRawLongValue()
      return makeIVpnRouteAssignment(Pointer(address))
    }

    public override fun toNative(obj: IVpnRouteAssignment): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1338935162_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVpnRouteAssignment): Array<IVpnRouteAssignment?> =
        (elements as
        Array<IVpnRouteAssignment?>).castToImpl<IVpnRouteAssignment,IVpnRouteAssignment_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVpnRouteAssignment?> =
        arrayOfNulls<IVpnRouteAssignment_Impl>(size) as Array<IVpnRouteAssignment?>
  }
}
