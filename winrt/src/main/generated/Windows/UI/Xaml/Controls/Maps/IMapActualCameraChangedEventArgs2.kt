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

@ABIMarker(IMapActualCameraChangedEventArgs2.ABI::class)
@Signature("{7ba4c7e5-10dc-455a-9d04-1d72fb6d9b93}")
@Guid("7ba4c7e510dc455a9d041d72fb6d9b93")
@WinRTInterface("7ba4c7e510dc455a9d041d72fb6d9b93")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapActualCameraChangedEventArgs2.ByReference::class)
public interface IMapActualCameraChangedEventArgs2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ChangeReason(): MapCameraChangeReason?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapActualCameraChangedEventArgs2> {
    public override fun getValue() =
        ABI.makeIMapActualCameraChangedEventArgs2(pointer.getPointer(0))

    public fun setValue(value: IMapActualCameraChangedEventArgs2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapActualCameraChangedEventArgs2 {
    public val __53617041_Ptr: Pointer?

    public val _53617041_VtblPtr: Pointer?
      get() = __53617041_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ChangeReason(): MapCameraChangeReason? {
      val fnPtr = _53617041_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapCameraChangeReason>()
      val hr = fn.invokeHR(arrayOf(__53617041_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapCameraChangeReason>(result.getValue())
      return resultValue
    }
  }

  public class IMapActualCameraChangedEventArgs2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __53617041_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapActualCameraChangedEventArgs2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7ba4c7e510dc455a9d041d72fb6d9b93")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapActualCameraChangedEventArgs2(ptr: Pointer?): WithDefault =
        IMapActualCameraChangedEventArgs2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapActualCameraChangedEventArgs2 {
      val address = segment.toRawLongValue()
      return makeIMapActualCameraChangedEventArgs2(Pointer(address))
    }

    public override fun toNative(obj: IMapActualCameraChangedEventArgs2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__53617041_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapActualCameraChangedEventArgs2):
        Array<IMapActualCameraChangedEventArgs2?> = (elements as
        Array<IMapActualCameraChangedEventArgs2?>).castToImpl<IMapActualCameraChangedEventArgs2,IMapActualCameraChangedEventArgs2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapActualCameraChangedEventArgs2?> =
        arrayOfNulls<IMapActualCameraChangedEventArgs2_Impl>(size) as
        Array<IMapActualCameraChangedEventArgs2?>
  }
}
