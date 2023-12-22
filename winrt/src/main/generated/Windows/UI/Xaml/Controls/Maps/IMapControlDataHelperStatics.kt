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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMapControlDataHelperStatics.ABI::class)
@Signature("{7a6632d6-e944-4110-83cf-314d0722e2e5}")
@Guid("7a6632d6e944411083cf314d0722e2e5")
@WinRTInterface("7a6632d6e944411083cf314d0722e2e5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapControlDataHelperStatics.ByReference::class)
public interface IMapControlDataHelperStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateMapControl(rasterRenderMode: Boolean): MapControl?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapControlDataHelperStatics> {
    public override fun getValue() = ABI.makeIMapControlDataHelperStatics(pointer.getPointer(0))

    public fun setValue(value: IMapControlDataHelperStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapControlDataHelperStatics {
    public val __897013157_Ptr: Pointer?

    public val _897013157_VtblPtr: Pointer?
      get() = __897013157_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateMapControl(rasterRenderMode: Boolean): MapControl? {
      val fnPtr = _897013157_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapControl>()
      val hr = fn.invokeHR(arrayOf(__897013157_Ptr, rasterRenderMode, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapControl>(result.getValue())
      return resultValue
    }
  }

  public class IMapControlDataHelperStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __897013157_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapControlDataHelperStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7a6632d6e944411083cf314d0722e2e5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapControlDataHelperStatics(ptr: Pointer?): WithDefault =
        IMapControlDataHelperStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapControlDataHelperStatics {
      val address = segment.toRawLongValue()
      return makeIMapControlDataHelperStatics(Pointer(address))
    }

    public override fun toNative(obj: IMapControlDataHelperStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__897013157_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapControlDataHelperStatics):
        Array<IMapControlDataHelperStatics?> = (elements as
        Array<IMapControlDataHelperStatics?>).castToImpl<IMapControlDataHelperStatics,IMapControlDataHelperStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapControlDataHelperStatics?> =
        arrayOfNulls<IMapControlDataHelperStatics_Impl>(size) as
        Array<IMapControlDataHelperStatics?>
  }
}
