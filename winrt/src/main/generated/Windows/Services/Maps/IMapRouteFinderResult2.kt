package Windows.Services.Maps

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IMapRouteFinderResult2.ABI::class)
@Signature("{20709c6d-d90c-46c8-91c6-7d4be4efb215}")
@Guid("20709c6dd90c46c891c67d4be4efb215")
@WinRTInterface("20709c6dd90c46c891c67d4be4efb215")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapRouteFinderResult2.ByReference::class)
public interface IMapRouteFinderResult2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AlternateRoutes(): IVectorView<MapRoute?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapRouteFinderResult2> {
    public override fun getValue() = ABI.makeIMapRouteFinderResult2(pointer.getPointer(0))

    public fun setValue(value: IMapRouteFinderResult2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapRouteFinderResult2 {
    public val __1923389579_Ptr: Pointer?

    public val _1923389579_VtblPtr: Pointer?
      get() = __1923389579_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AlternateRoutes(): IVectorView<MapRoute?>? {
      val fnPtr = _1923389579_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<MapRoute?>>()
      val hr = fn.invokeHR(arrayOf(__1923389579_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<MapRoute?>>(result.getValue())
      return resultValue
    }
  }

  public class IMapRouteFinderResult2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1923389579_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapRouteFinderResult2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("20709c6dd90c46c891c67d4be4efb215")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapRouteFinderResult2(ptr: Pointer?): WithDefault =
        IMapRouteFinderResult2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapRouteFinderResult2 {
      val address = segment.toRawLongValue()
      return makeIMapRouteFinderResult2(Pointer(address))
    }

    public override fun toNative(obj: IMapRouteFinderResult2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1923389579_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapRouteFinderResult2): Array<IMapRouteFinderResult2?> =
        (elements as
        Array<IMapRouteFinderResult2?>).castToImpl<IMapRouteFinderResult2,IMapRouteFinderResult2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapRouteFinderResult2?> =
        arrayOfNulls<IMapRouteFinderResult2_Impl>(size) as Array<IMapRouteFinderResult2?>
  }
}
