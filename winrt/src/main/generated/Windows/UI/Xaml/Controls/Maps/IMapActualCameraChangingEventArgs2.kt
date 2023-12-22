package Windows.UI.Xaml.Controls.Maps

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

@ABIMarker(IMapActualCameraChangingEventArgs2.ABI::class)
@Signature("{f2867897-40ac-4e8a-a927-510f3846a47e}")
@Guid("f286789740ac4e8aa927510f3846a47e")
@WinRTInterface("f286789740ac4e8aa927510f3846a47e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapActualCameraChangingEventArgs2.ByReference::class)
public interface IMapActualCameraChangingEventArgs2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ChangeReason(): MapCameraChangeReason?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapActualCameraChangingEventArgs2> {
    public override fun getValue() =
        ABI.makeIMapActualCameraChangingEventArgs2(pointer.getPointer(0))

    public fun setValue(value: IMapActualCameraChangingEventArgs2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapActualCameraChangingEventArgs2 {
    public val __1225481786_Ptr: Pointer?

    public val _1225481786_VtblPtr: Pointer?
      get() = __1225481786_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ChangeReason(): MapCameraChangeReason? {
      val fnPtr = _1225481786_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapCameraChangeReason>()
      val hr = fn.invokeHR(arrayOf(__1225481786_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapCameraChangeReason>(result.getValue())
      return resultValue
    }
  }

  public class IMapActualCameraChangingEventArgs2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1225481786_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapActualCameraChangingEventArgs2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f286789740ac4e8aa927510f3846a47e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapActualCameraChangingEventArgs2(ptr: Pointer?): WithDefault =
        IMapActualCameraChangingEventArgs2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapActualCameraChangingEventArgs2 {
      val address = segment.toRawLongValue()
      return makeIMapActualCameraChangingEventArgs2(Pointer(address))
    }

    public override fun toNative(obj: IMapActualCameraChangingEventArgs2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1225481786_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapActualCameraChangingEventArgs2):
        Array<IMapActualCameraChangingEventArgs2?> = (elements as
        Array<IMapActualCameraChangingEventArgs2?>).castToImpl<IMapActualCameraChangingEventArgs2,IMapActualCameraChangingEventArgs2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapActualCameraChangingEventArgs2?> =
        arrayOfNulls<IMapActualCameraChangingEventArgs2_Impl>(size) as
        Array<IMapActualCameraChangingEventArgs2?>
  }
}
