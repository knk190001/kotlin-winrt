package Windows.Media

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

@ABIMarker(IMediaMarkers.ABI::class)
@Signature("{afeab189-f8dd-466e-aa10-920b52353fdf}")
@Guid("afeab189f8dd466eaa10920b52353fdf")
@WinRTInterface("afeab189f8dd466eaa10920b52353fdf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaMarkers.ByReference::class)
public interface IMediaMarkers : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Markers(): IVectorView<IMediaMarker?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IMediaMarkers>
      {
    public override fun getValue() = ABI.makeIMediaMarkers(pointer.getPointer(0))

    public fun setValue(value: IMediaMarkers_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaMarkers {
    public val __241016325_Ptr: Pointer?

    public val _241016325_VtblPtr: Pointer?
      get() = __241016325_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Markers(): IVectorView<IMediaMarker?>? {
      val fnPtr = _241016325_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<IMediaMarker?>>()
      val hr = fn.invokeHR(arrayOf(__241016325_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<IMediaMarker?>>(result.getValue())
      return resultValue
    }
  }

  public class IMediaMarkers_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __241016325_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaMarkers, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("afeab189f8dd466eaa10920b52353fdf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaMarkers(ptr: Pointer?): WithDefault = IMediaMarkers_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaMarkers {
      val address = segment.toRawLongValue()
      return makeIMediaMarkers(Pointer(address))
    }

    public override fun toNative(obj: IMediaMarkers): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__241016325_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaMarkers): Array<IMediaMarkers?> = (elements as
        Array<IMediaMarkers?>).castToImpl<IMediaMarkers,IMediaMarkers_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaMarkers?> =
        arrayOfNulls<IMediaMarkers_Impl>(size) as Array<IMediaMarkers?>
  }
}
