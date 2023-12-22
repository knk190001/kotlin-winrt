package Windows.UI.Xaml.Media

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

@ABIMarker(ITimelineMarkerRoutedEventArgs.ABI::class)
@Signature("{7c3b3ef3-2c88-4d9c-99b6-46cdbd48d4c1}")
@Guid("7c3b3ef32c884d9c99b646cdbd48d4c1")
@WinRTInterface("7c3b3ef32c884d9c99b646cdbd48d4c1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITimelineMarkerRoutedEventArgs.ByReference::class)
public interface ITimelineMarkerRoutedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Marker(): TimelineMarker?

  @InterfaceMethod(1)
  public fun put_Marker(value: TimelineMarker?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITimelineMarkerRoutedEventArgs> {
    public override fun getValue() = ABI.makeITimelineMarkerRoutedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ITimelineMarkerRoutedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITimelineMarkerRoutedEventArgs {
    public val __1986993093_Ptr: Pointer?

    public val _1986993093_VtblPtr: Pointer?
      get() = __1986993093_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Marker(): TimelineMarker? {
      val fnPtr = _1986993093_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimelineMarker>()
      val hr = fn.invokeHR(arrayOf(__1986993093_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimelineMarker>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Marker(value: TimelineMarker?): Unit {
      val fnPtr = _1986993093_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1986993093_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ITimelineMarkerRoutedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1986993093_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITimelineMarkerRoutedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7c3b3ef32c884d9c99b646cdbd48d4c1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITimelineMarkerRoutedEventArgs(ptr: Pointer?): WithDefault =
        ITimelineMarkerRoutedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITimelineMarkerRoutedEventArgs {
      val address = segment.toRawLongValue()
      return makeITimelineMarkerRoutedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ITimelineMarkerRoutedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1986993093_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITimelineMarkerRoutedEventArgs):
        Array<ITimelineMarkerRoutedEventArgs?> = (elements as
        Array<ITimelineMarkerRoutedEventArgs?>).castToImpl<ITimelineMarkerRoutedEventArgs,ITimelineMarkerRoutedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITimelineMarkerRoutedEventArgs?> =
        arrayOfNulls<ITimelineMarkerRoutedEventArgs_Impl>(size) as
        Array<ITimelineMarkerRoutedEventArgs?>
  }
}
