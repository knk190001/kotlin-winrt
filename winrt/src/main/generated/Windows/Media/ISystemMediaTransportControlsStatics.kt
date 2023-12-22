package Windows.Media

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

@ABIMarker(ISystemMediaTransportControlsStatics.ABI::class)
@Signature("{43ba380a-eca4-4832-91ab-d415fae484c6}")
@Guid("43ba380aeca4483291abd415fae484c6")
@WinRTInterface("43ba380aeca4483291abd415fae484c6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISystemMediaTransportControlsStatics.ByReference::class)
public interface ISystemMediaTransportControlsStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetForCurrentView(): SystemMediaTransportControls?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISystemMediaTransportControlsStatics> {
    public override fun getValue() =
        ABI.makeISystemMediaTransportControlsStatics(pointer.getPointer(0))

    public fun setValue(value: ISystemMediaTransportControlsStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISystemMediaTransportControlsStatics {
    public val __614067403_Ptr: Pointer?

    public val _614067403_VtblPtr: Pointer?
      get() = __614067403_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetForCurrentView(): SystemMediaTransportControls? {
      val fnPtr = _614067403_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SystemMediaTransportControls>()
      val hr = fn.invokeHR(arrayOf(__614067403_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SystemMediaTransportControls>(result.getValue())
      return resultValue
    }
  }

  public class ISystemMediaTransportControlsStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __614067403_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISystemMediaTransportControlsStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("43ba380aeca4483291abd415fae484c6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISystemMediaTransportControlsStatics(ptr: Pointer?): WithDefault =
        ISystemMediaTransportControlsStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISystemMediaTransportControlsStatics {
      val address = segment.toRawLongValue()
      return makeISystemMediaTransportControlsStatics(Pointer(address))
    }

    public override fun toNative(obj: ISystemMediaTransportControlsStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__614067403_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISystemMediaTransportControlsStatics):
        Array<ISystemMediaTransportControlsStatics?> = (elements as
        Array<ISystemMediaTransportControlsStatics?>).castToImpl<ISystemMediaTransportControlsStatics,ISystemMediaTransportControlsStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISystemMediaTransportControlsStatics?> =
        arrayOfNulls<ISystemMediaTransportControlsStatics_Impl>(size) as
        Array<ISystemMediaTransportControlsStatics?>
  }
}
