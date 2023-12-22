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

@ABIMarker(IMapControlBusinessLandmarkClickEventArgs.ABI::class)
@Signature("{5e464922-4a1a-4797-beb7-5cf7754cb867}")
@Guid("5e4649224a1a4797beb75cf7754cb867")
@WinRTInterface("5e4649224a1a4797beb75cf7754cb867")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapControlBusinessLandmarkClickEventArgs.ByReference::class)
public interface IMapControlBusinessLandmarkClickEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_LocalLocations(): IVectorView<LocalLocation?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapControlBusinessLandmarkClickEventArgs> {
    public override fun getValue() =
        ABI.makeIMapControlBusinessLandmarkClickEventArgs(pointer.getPointer(0))

    public fun setValue(value: IMapControlBusinessLandmarkClickEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapControlBusinessLandmarkClickEventArgs {
    public val __1729473593_Ptr: Pointer?

    public val _1729473593_VtblPtr: Pointer?
      get() = __1729473593_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LocalLocations(): IVectorView<LocalLocation?>? {
      val fnPtr = _1729473593_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<LocalLocation?>>()
      val hr = fn.invokeHR(arrayOf(__1729473593_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<LocalLocation?>>(result.getValue())
      return resultValue
    }
  }

  public class IMapControlBusinessLandmarkClickEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1729473593_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapControlBusinessLandmarkClickEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5e4649224a1a4797beb75cf7754cb867")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapControlBusinessLandmarkClickEventArgs(ptr: Pointer?): WithDefault =
        IMapControlBusinessLandmarkClickEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IMapControlBusinessLandmarkClickEventArgs {
      val address = segment.toRawLongValue()
      return makeIMapControlBusinessLandmarkClickEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IMapControlBusinessLandmarkClickEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1729473593_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapControlBusinessLandmarkClickEventArgs):
        Array<IMapControlBusinessLandmarkClickEventArgs?> = (elements as
        Array<IMapControlBusinessLandmarkClickEventArgs?>).castToImpl<IMapControlBusinessLandmarkClickEventArgs,IMapControlBusinessLandmarkClickEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapControlBusinessLandmarkClickEventArgs?> =
        arrayOfNulls<IMapControlBusinessLandmarkClickEventArgs_Impl>(size) as
        Array<IMapControlBusinessLandmarkClickEventArgs?>
  }
}
