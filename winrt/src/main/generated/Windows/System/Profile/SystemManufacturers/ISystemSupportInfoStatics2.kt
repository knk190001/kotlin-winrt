package Windows.System.Profile.SystemManufacturers

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

@ABIMarker(ISystemSupportInfoStatics2.ABI::class)
@Signature("{33f349a4-3fa1-4986-aa4b-057420455e6d}")
@Guid("33f349a43fa14986aa4b057420455e6d")
@WinRTInterface("33f349a43fa14986aa4b057420455e6d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISystemSupportInfoStatics2.ByReference::class)
public interface ISystemSupportInfoStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_LocalDeviceInfo(): SystemSupportDeviceInfo?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISystemSupportInfoStatics2> {
    public override fun getValue() = ABI.makeISystemSupportInfoStatics2(pointer.getPointer(0))

    public fun setValue(value: ISystemSupportInfoStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISystemSupportInfoStatics2 {
    public val __1325373716_Ptr: Pointer?

    public val _1325373716_VtblPtr: Pointer?
      get() = __1325373716_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LocalDeviceInfo(): SystemSupportDeviceInfo? {
      val fnPtr = _1325373716_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SystemSupportDeviceInfo>()
      val hr = fn.invokeHR(arrayOf(__1325373716_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SystemSupportDeviceInfo>(result.getValue())
      return resultValue
    }
  }

  public class ISystemSupportInfoStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1325373716_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISystemSupportInfoStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("33f349a43fa14986aa4b057420455e6d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISystemSupportInfoStatics2(ptr: Pointer?): WithDefault =
        ISystemSupportInfoStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISystemSupportInfoStatics2 {
      val address = segment.toRawLongValue()
      return makeISystemSupportInfoStatics2(Pointer(address))
    }

    public override fun toNative(obj: ISystemSupportInfoStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1325373716_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISystemSupportInfoStatics2):
        Array<ISystemSupportInfoStatics2?> = (elements as
        Array<ISystemSupportInfoStatics2?>).castToImpl<ISystemSupportInfoStatics2,ISystemSupportInfoStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISystemSupportInfoStatics2?> =
        arrayOfNulls<ISystemSupportInfoStatics2_Impl>(size) as Array<ISystemSupportInfoStatics2?>
  }
}
