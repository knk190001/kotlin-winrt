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

@ABIMarker(IVpnTrafficFilterAssignment.ABI::class)
@Signature("{56ccd45c-e664-471e-89cd-601603b9e0f3}")
@Guid("56ccd45ce664471e89cd601603b9e0f3")
@WinRTInterface("56ccd45ce664471e89cd601603b9e0f3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVpnTrafficFilterAssignment.ByReference::class)
public interface IVpnTrafficFilterAssignment : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TrafficFilterList(): IVector<VpnTrafficFilter?>?

  @InterfaceMethod(1)
  public fun get_AllowOutbound(): Boolean

  @InterfaceMethod(2)
  public fun put_AllowOutbound(value: Boolean): Unit

  @InterfaceMethod(3)
  public fun get_AllowInbound(): Boolean

  @InterfaceMethod(4)
  public fun put_AllowInbound(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVpnTrafficFilterAssignment> {
    public override fun getValue() = ABI.makeIVpnTrafficFilterAssignment(pointer.getPointer(0))

    public fun setValue(value: IVpnTrafficFilterAssignment_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVpnTrafficFilterAssignment {
    public val __750100718_Ptr: Pointer?

    public val _750100718_VtblPtr: Pointer?
      get() = __750100718_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TrafficFilterList(): IVector<VpnTrafficFilter?>? {
      val fnPtr = _750100718_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<VpnTrafficFilter?>>()
      val hr = fn.invokeHR(arrayOf(__750100718_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<VpnTrafficFilter?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_AllowOutbound(): Boolean {
      val fnPtr = _750100718_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__750100718_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_AllowOutbound(value: Boolean): Unit {
      val fnPtr = _750100718_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__750100718_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_AllowInbound(): Boolean {
      val fnPtr = _750100718_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__750100718_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun put_AllowInbound(value: Boolean): Unit {
      val fnPtr = _750100718_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__750100718_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IVpnTrafficFilterAssignment_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __750100718_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVpnTrafficFilterAssignment, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("56ccd45ce664471e89cd601603b9e0f3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVpnTrafficFilterAssignment(ptr: Pointer?): WithDefault =
        IVpnTrafficFilterAssignment_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVpnTrafficFilterAssignment {
      val address = segment.toRawLongValue()
      return makeIVpnTrafficFilterAssignment(Pointer(address))
    }

    public override fun toNative(obj: IVpnTrafficFilterAssignment): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__750100718_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVpnTrafficFilterAssignment):
        Array<IVpnTrafficFilterAssignment?> = (elements as
        Array<IVpnTrafficFilterAssignment?>).castToImpl<IVpnTrafficFilterAssignment,IVpnTrafficFilterAssignment_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVpnTrafficFilterAssignment?> =
        arrayOfNulls<IVpnTrafficFilterAssignment_Impl>(size) as Array<IVpnTrafficFilterAssignment?>
  }
}
