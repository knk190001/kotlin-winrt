package Windows.UI.ViewManagement

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
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
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IApplicationViewScaling.ABI::class)
@Signature("{1d0ddc23-23f3-4b2d-84fe-74bf37b48b66}")
@Guid("1d0ddc2323f34b2d84fe74bf37b48b66")
@WinRTInterface("1d0ddc2323f34b2d84fe74bf37b48b66")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IApplicationViewScaling.ByReference::class)
public interface IApplicationViewScaling : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IApplicationViewScaling> {
    public override fun getValue() = ABI.makeIApplicationViewScaling(pointer.getPointer(0))

    public fun setValue(value: IApplicationViewScaling_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IApplicationViewScaling {
    public val __749464260_Ptr: Pointer?

    public val _749464260_VtblPtr: Pointer?
      get() = __749464260_Ptr?.getPointer(0)
  }

  public class IApplicationViewScaling_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __749464260_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IApplicationViewScaling, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1d0ddc2323f34b2d84fe74bf37b48b66")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIApplicationViewScaling(ptr: Pointer?): WithDefault =
        IApplicationViewScaling_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IApplicationViewScaling {
      val address = segment.toRawLongValue()
      return makeIApplicationViewScaling(Pointer(address))
    }

    public override fun toNative(obj: IApplicationViewScaling): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__749464260_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IApplicationViewScaling): Array<IApplicationViewScaling?>
        = (elements as
        Array<IApplicationViewScaling?>).castToImpl<IApplicationViewScaling,IApplicationViewScaling_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IApplicationViewScaling?> =
        arrayOfNulls<IApplicationViewScaling_Impl>(size) as Array<IApplicationViewScaling?>
  }
}
