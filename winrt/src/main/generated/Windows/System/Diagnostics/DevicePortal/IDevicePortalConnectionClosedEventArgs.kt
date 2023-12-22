package Windows.System.Diagnostics.DevicePortal

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

@ABIMarker(IDevicePortalConnectionClosedEventArgs.ABI::class)
@Signature("{fcf70e38-7032-428c-9f50-945c15a9f0cb}")
@Guid("fcf70e387032428c9f50945c15a9f0cb")
@WinRTInterface("fcf70e387032428c9f50945c15a9f0cb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDevicePortalConnectionClosedEventArgs.ByReference::class)
public interface IDevicePortalConnectionClosedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Reason(): DevicePortalConnectionClosedReason?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDevicePortalConnectionClosedEventArgs> {
    public override fun getValue() =
        ABI.makeIDevicePortalConnectionClosedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IDevicePortalConnectionClosedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDevicePortalConnectionClosedEventArgs {
    public val __1165752934_Ptr: Pointer?

    public val _1165752934_VtblPtr: Pointer?
      get() = __1165752934_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Reason(): DevicePortalConnectionClosedReason? {
      val fnPtr = _1165752934_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DevicePortalConnectionClosedReason>()
      val hr = fn.invokeHR(arrayOf(__1165752934_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DevicePortalConnectionClosedReason>(result.getValue())
      return resultValue
    }
  }

  public class IDevicePortalConnectionClosedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1165752934_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDevicePortalConnectionClosedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fcf70e387032428c9f50945c15a9f0cb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDevicePortalConnectionClosedEventArgs(ptr: Pointer?): WithDefault =
        IDevicePortalConnectionClosedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDevicePortalConnectionClosedEventArgs {
      val address = segment.toRawLongValue()
      return makeIDevicePortalConnectionClosedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IDevicePortalConnectionClosedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1165752934_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDevicePortalConnectionClosedEventArgs):
        Array<IDevicePortalConnectionClosedEventArgs?> = (elements as
        Array<IDevicePortalConnectionClosedEventArgs?>).castToImpl<IDevicePortalConnectionClosedEventArgs,IDevicePortalConnectionClosedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDevicePortalConnectionClosedEventArgs?> =
        arrayOfNulls<IDevicePortalConnectionClosedEventArgs_Impl>(size) as
        Array<IDevicePortalConnectionClosedEventArgs?>
  }
}
