package Windows.UI.Xaml.Controls.Maps

import Windows.Foundation.Collections.IVectorView
import Windows.Services.Maps.LocalSearch.LocalLocation
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

@ABIMarker(IMapControlBusinessLandmarkPointerExitedEventArgs.ABI::class)
@Signature("{2bb52caf-f24a-46d0-b463-65f719731057}")
@Guid("2bb52caff24a46d0b46365f719731057")
@WinRTInterface("2bb52caff24a46d0b46365f719731057")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapControlBusinessLandmarkPointerExitedEventArgs.ByReference::class)
public interface IMapControlBusinessLandmarkPointerExitedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_LocalLocations(): IVectorView<LocalLocation?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapControlBusinessLandmarkPointerExitedEventArgs> {
    public override fun getValue() =
        ABI.makeIMapControlBusinessLandmarkPointerExitedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IMapControlBusinessLandmarkPointerExitedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapControlBusinessLandmarkPointerExitedEventArgs {
    public val __452207911_Ptr: Pointer?

    public val _452207911_VtblPtr: Pointer?
      get() = __452207911_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LocalLocations(): IVectorView<LocalLocation?>? {
      val fnPtr = _452207911_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<LocalLocation?>>()
      val hr = fn.invokeHR(arrayOf(__452207911_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<LocalLocation?>>(result.getValue())
      return resultValue
    }
  }

  public class IMapControlBusinessLandmarkPointerExitedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __452207911_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapControlBusinessLandmarkPointerExitedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2bb52caff24a46d0b46365f719731057")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapControlBusinessLandmarkPointerExitedEventArgs(ptr: Pointer?): WithDefault =
        IMapControlBusinessLandmarkPointerExitedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IMapControlBusinessLandmarkPointerExitedEventArgs {
      val address = segment.toRawLongValue()
      return makeIMapControlBusinessLandmarkPointerExitedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IMapControlBusinessLandmarkPointerExitedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__452207911_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapControlBusinessLandmarkPointerExitedEventArgs):
        Array<IMapControlBusinessLandmarkPointerExitedEventArgs?> = (elements as
        Array<IMapControlBusinessLandmarkPointerExitedEventArgs?>).castToImpl<IMapControlBusinessLandmarkPointerExitedEventArgs,IMapControlBusinessLandmarkPointerExitedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IMapControlBusinessLandmarkPointerExitedEventArgs?> =
        arrayOfNulls<IMapControlBusinessLandmarkPointerExitedEventArgs_Impl>(size) as
        Array<IMapControlBusinessLandmarkPointerExitedEventArgs?>
  }
}
