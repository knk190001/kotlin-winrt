package Windows.Services.Maps

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

@ABIMarker(IMapRouteFinderResult.ABI::class)
@Signature("{a868a31a-9422-46ac-8ca1-b1614d4bfbe2}")
@Guid("a868a31a942246ac8ca1b1614d4bfbe2")
@WinRTInterface("a868a31a942246ac8ca1b1614d4bfbe2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapRouteFinderResult.ByReference::class)
public interface IMapRouteFinderResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Route(): MapRoute?

  @InterfaceMethod(1)
  public fun get_Status(): MapRouteFinderStatus?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapRouteFinderResult> {
    public override fun getValue() = ABI.makeIMapRouteFinderResult(pointer.getPointer(0))

    public fun setValue(value: IMapRouteFinderResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapRouteFinderResult {
    public val __339139491_Ptr: Pointer?

    public val _339139491_VtblPtr: Pointer?
      get() = __339139491_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Route(): MapRoute? {
      val fnPtr = _339139491_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapRoute>()
      val hr = fn.invokeHR(arrayOf(__339139491_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapRoute>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Status(): MapRouteFinderStatus? {
      val fnPtr = _339139491_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapRouteFinderStatus>()
      val hr = fn.invokeHR(arrayOf(__339139491_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapRouteFinderStatus>(result.getValue())
      return resultValue
    }
  }

  public class IMapRouteFinderResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __339139491_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapRouteFinderResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a868a31a942246ac8ca1b1614d4bfbe2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapRouteFinderResult(ptr: Pointer?): WithDefault =
        IMapRouteFinderResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapRouteFinderResult {
      val address = segment.toRawLongValue()
      return makeIMapRouteFinderResult(Pointer(address))
    }

    public override fun toNative(obj: IMapRouteFinderResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__339139491_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapRouteFinderResult): Array<IMapRouteFinderResult?> =
        (elements as
        Array<IMapRouteFinderResult?>).castToImpl<IMapRouteFinderResult,IMapRouteFinderResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapRouteFinderResult?> =
        arrayOfNulls<IMapRouteFinderResult_Impl>(size) as Array<IMapRouteFinderResult?>
  }
}
