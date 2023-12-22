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

@ABIMarker(IMapControlBusinessLandmarkRightTappedEventArgs.ABI::class)
@Signature("{59ab8ae7-f184-4ab1-b0b0-35c8bf0654b2}")
@Guid("59ab8ae7f1844ab1b0b035c8bf0654b2")
@WinRTInterface("59ab8ae7f1844ab1b0b035c8bf0654b2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapControlBusinessLandmarkRightTappedEventArgs.ByReference::class)
public interface IMapControlBusinessLandmarkRightTappedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_LocalLocations(): IVectorView<LocalLocation?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapControlBusinessLandmarkRightTappedEventArgs> {
    public override fun getValue() =
        ABI.makeIMapControlBusinessLandmarkRightTappedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IMapControlBusinessLandmarkRightTappedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapControlBusinessLandmarkRightTappedEventArgs {
    public val __944686713_Ptr: Pointer?

    public val _944686713_VtblPtr: Pointer?
      get() = __944686713_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LocalLocations(): IVectorView<LocalLocation?>? {
      val fnPtr = _944686713_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<LocalLocation?>>()
      val hr = fn.invokeHR(arrayOf(__944686713_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<LocalLocation?>>(result.getValue())
      return resultValue
    }
  }

  public class IMapControlBusinessLandmarkRightTappedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __944686713_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapControlBusinessLandmarkRightTappedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("59ab8ae7f1844ab1b0b035c8bf0654b2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapControlBusinessLandmarkRightTappedEventArgs(ptr: Pointer?): WithDefault =
        IMapControlBusinessLandmarkRightTappedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IMapControlBusinessLandmarkRightTappedEventArgs {
      val address = segment.toRawLongValue()
      return makeIMapControlBusinessLandmarkRightTappedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IMapControlBusinessLandmarkRightTappedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__944686713_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapControlBusinessLandmarkRightTappedEventArgs):
        Array<IMapControlBusinessLandmarkRightTappedEventArgs?> = (elements as
        Array<IMapControlBusinessLandmarkRightTappedEventArgs?>).castToImpl<IMapControlBusinessLandmarkRightTappedEventArgs,IMapControlBusinessLandmarkRightTappedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapControlBusinessLandmarkRightTappedEventArgs?>
        = arrayOfNulls<IMapControlBusinessLandmarkRightTappedEventArgs_Impl>(size) as
        Array<IMapControlBusinessLandmarkRightTappedEventArgs?>
  }
}
