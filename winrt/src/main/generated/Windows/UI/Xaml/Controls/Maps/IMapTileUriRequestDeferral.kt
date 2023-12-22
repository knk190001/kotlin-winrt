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

@ABIMarker(IMapTileUriRequestDeferral.ABI::class)
@Signature("{c117ade0-bf3e-4c51-8faa-4b593cf68eb2}")
@Guid("c117ade0bf3e4c518faa4b593cf68eb2")
@WinRTInterface("c117ade0bf3e4c518faa4b593cf68eb2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapTileUriRequestDeferral.ByReference::class)
public interface IMapTileUriRequestDeferral : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Complete(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapTileUriRequestDeferral> {
    public override fun getValue() = ABI.makeIMapTileUriRequestDeferral(pointer.getPointer(0))

    public fun setValue(value: IMapTileUriRequestDeferral_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapTileUriRequestDeferral {
    public val __1428648025_Ptr: Pointer?

    public val _1428648025_VtblPtr: Pointer?
      get() = __1428648025_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Complete(): Unit {
      val fnPtr = _1428648025_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1428648025_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMapTileUriRequestDeferral_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1428648025_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapTileUriRequestDeferral, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c117ade0bf3e4c518faa4b593cf68eb2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapTileUriRequestDeferral(ptr: Pointer?): WithDefault =
        IMapTileUriRequestDeferral_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapTileUriRequestDeferral {
      val address = segment.toRawLongValue()
      return makeIMapTileUriRequestDeferral(Pointer(address))
    }

    public override fun toNative(obj: IMapTileUriRequestDeferral): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1428648025_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapTileUriRequestDeferral):
        Array<IMapTileUriRequestDeferral?> = (elements as
        Array<IMapTileUriRequestDeferral?>).castToImpl<IMapTileUriRequestDeferral,IMapTileUriRequestDeferral_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapTileUriRequestDeferral?> =
        arrayOfNulls<IMapTileUriRequestDeferral_Impl>(size) as Array<IMapTileUriRequestDeferral?>
  }
}
