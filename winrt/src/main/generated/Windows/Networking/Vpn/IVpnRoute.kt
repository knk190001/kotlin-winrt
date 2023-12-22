package Windows.Networking.Vpn

import Windows.Networking.HostName
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
import kotlin.Byte
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IVpnRoute.ABI::class)
@Signature("{b5731b83-0969-4699-938e-7776db29cfb3}")
@Guid("b5731b8309694699938e7776db29cfb3")
@WinRTInterface("b5731b8309694699938e7776db29cfb3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVpnRoute.ByReference::class)
public interface IVpnRoute : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_Address(value: HostName?): Unit

  @InterfaceMethod(1)
  public fun get_Address(): HostName?

  @InterfaceMethod(2)
  public fun put_PrefixSize(value: Byte): Unit

  @InterfaceMethod(3)
  public fun get_PrefixSize(): Byte

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IVpnRoute> {
    public override fun getValue() = ABI.makeIVpnRoute(pointer.getPointer(0))

    public fun setValue(value: IVpnRoute_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVpnRoute {
    public val __1328770855_Ptr: Pointer?

    public val _1328770855_VtblPtr: Pointer?
      get() = __1328770855_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_Address(value: HostName?): Unit {
      val fnPtr = _1328770855_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1328770855_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_Address(): HostName? {
      val fnPtr = _1328770855_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HostName>()
      val hr = fn.invokeHR(arrayOf(__1328770855_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HostName>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_PrefixSize(value: Byte): Unit {
      val fnPtr = _1328770855_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1328770855_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_PrefixSize(): Byte {
      val fnPtr = _1328770855_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__1328770855_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }
  }

  public class IVpnRoute_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1328770855_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVpnRoute, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b5731b8309694699938e7776db29cfb3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVpnRoute(ptr: Pointer?): WithDefault = IVpnRoute_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVpnRoute {
      val address = segment.toRawLongValue()
      return makeIVpnRoute(Pointer(address))
    }

    public override fun toNative(obj: IVpnRoute): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1328770855_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVpnRoute): Array<IVpnRoute?> = (elements as
        Array<IVpnRoute?>).castToImpl<IVpnRoute,IVpnRoute_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVpnRoute?> = arrayOfNulls<IVpnRoute_Impl>(size)
        as Array<IVpnRoute?>
  }
}
