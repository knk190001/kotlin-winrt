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

@ABIMarker(IMapControlBusinessLandmarkPointerEnteredEventArgs.ABI::class)
@Signature("{5e4081a6-ea98-4f95-8caf-5b42696ff504}")
@Guid("5e4081a6ea984f958caf5b42696ff504")
@WinRTInterface("5e4081a6ea984f958caf5b42696ff504")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapControlBusinessLandmarkPointerEnteredEventArgs.ByReference::class)
public interface IMapControlBusinessLandmarkPointerEnteredEventArgs : NativeMapped, IWinRTInterface
    {
  @InterfaceMethod(0)
  public fun get_LocalLocations(): IVectorView<LocalLocation?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapControlBusinessLandmarkPointerEnteredEventArgs> {
    public override fun getValue() =
        ABI.makeIMapControlBusinessLandmarkPointerEnteredEventArgs(pointer.getPointer(0))

    public fun setValue(value: IMapControlBusinessLandmarkPointerEnteredEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapControlBusinessLandmarkPointerEnteredEventArgs {
    public val __1427795917_Ptr: Pointer?

    public val _1427795917_VtblPtr: Pointer?
      get() = __1427795917_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LocalLocations(): IVectorView<LocalLocation?>? {
      val fnPtr = _1427795917_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<LocalLocation?>>()
      val hr = fn.invokeHR(arrayOf(__1427795917_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<LocalLocation?>>(result.getValue())
      return resultValue
    }
  }

  public class IMapControlBusinessLandmarkPointerEnteredEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1427795917_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapControlBusinessLandmarkPointerEnteredEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5e4081a6ea984f958caf5b42696ff504")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapControlBusinessLandmarkPointerEnteredEventArgs(ptr: Pointer?): WithDefault =
        IMapControlBusinessLandmarkPointerEnteredEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IMapControlBusinessLandmarkPointerEnteredEventArgs {
      val address = segment.toRawLongValue()
      return makeIMapControlBusinessLandmarkPointerEnteredEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IMapControlBusinessLandmarkPointerEnteredEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1427795917_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapControlBusinessLandmarkPointerEnteredEventArgs):
        Array<IMapControlBusinessLandmarkPointerEnteredEventArgs?> = (elements as
        Array<IMapControlBusinessLandmarkPointerEnteredEventArgs?>).castToImpl<IMapControlBusinessLandmarkPointerEnteredEventArgs,IMapControlBusinessLandmarkPointerEnteredEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IMapControlBusinessLandmarkPointerEnteredEventArgs?> =
        arrayOfNulls<IMapControlBusinessLandmarkPointerEnteredEventArgs_Impl>(size) as
        Array<IMapControlBusinessLandmarkPointerEnteredEventArgs?>
  }
}
