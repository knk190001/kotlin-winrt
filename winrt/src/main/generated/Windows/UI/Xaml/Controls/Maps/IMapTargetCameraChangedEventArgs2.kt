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

@ABIMarker(IMapTargetCameraChangedEventArgs2.ABI::class)
@Signature("{97c0b332-f2b6-460b-8d91-ac020a2383dd}")
@Guid("97c0b332f2b6460b8d91ac020a2383dd")
@WinRTInterface("97c0b332f2b6460b8d91ac020a2383dd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapTargetCameraChangedEventArgs2.ByReference::class)
public interface IMapTargetCameraChangedEventArgs2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ChangeReason(): MapCameraChangeReason?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapTargetCameraChangedEventArgs2> {
    public override fun getValue() =
        ABI.makeIMapTargetCameraChangedEventArgs2(pointer.getPointer(0))

    public fun setValue(value: IMapTargetCameraChangedEventArgs2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapTargetCameraChangedEventArgs2 {
    public val __1765341650_Ptr: Pointer?

    public val _1765341650_VtblPtr: Pointer?
      get() = __1765341650_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ChangeReason(): MapCameraChangeReason? {
      val fnPtr = _1765341650_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapCameraChangeReason>()
      val hr = fn.invokeHR(arrayOf(__1765341650_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapCameraChangeReason>(result.getValue())
      return resultValue
    }
  }

  public class IMapTargetCameraChangedEventArgs2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1765341650_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapTargetCameraChangedEventArgs2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("97c0b332f2b6460b8d91ac020a2383dd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapTargetCameraChangedEventArgs2(ptr: Pointer?): WithDefault =
        IMapTargetCameraChangedEventArgs2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapTargetCameraChangedEventArgs2 {
      val address = segment.toRawLongValue()
      return makeIMapTargetCameraChangedEventArgs2(Pointer(address))
    }

    public override fun toNative(obj: IMapTargetCameraChangedEventArgs2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1765341650_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapTargetCameraChangedEventArgs2):
        Array<IMapTargetCameraChangedEventArgs2?> = (elements as
        Array<IMapTargetCameraChangedEventArgs2?>).castToImpl<IMapTargetCameraChangedEventArgs2,IMapTargetCameraChangedEventArgs2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapTargetCameraChangedEventArgs2?> =
        arrayOfNulls<IMapTargetCameraChangedEventArgs2_Impl>(size) as
        Array<IMapTargetCameraChangedEventArgs2?>
  }
}
