package Microsoft.UI.Xaml.Controls

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

@ABIMarker(IScrollingZoomCompletedEventArgs.ABI::class)
@Signature("{c821207e-ab2a-5f6c-9074-411840a68d55}")
@Guid("c821207eab2a5f6c9074411840a68d55")
@WinRTInterface("c821207eab2a5f6c9074411840a68d55")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IScrollingZoomCompletedEventArgs.ByReference::class)
public interface IScrollingZoomCompletedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CorrelationId(): Int

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IScrollingZoomCompletedEventArgs> {
    public override fun getValue() = ABI.makeIScrollingZoomCompletedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IScrollingZoomCompletedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IScrollingZoomCompletedEventArgs {
    public val __357731181_Ptr: Pointer?

    public val _357731181_VtblPtr: Pointer?
      get() = __357731181_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CorrelationId(): Int {
      val fnPtr = _357731181_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__357731181_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }
  }

  public class IScrollingZoomCompletedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __357731181_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IScrollingZoomCompletedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c821207eab2a5f6c9074411840a68d55")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIScrollingZoomCompletedEventArgs(ptr: Pointer?): WithDefault =
        IScrollingZoomCompletedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IScrollingZoomCompletedEventArgs {
      val address = segment.toRawLongValue()
      return makeIScrollingZoomCompletedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IScrollingZoomCompletedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__357731181_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IScrollingZoomCompletedEventArgs):
        Array<IScrollingZoomCompletedEventArgs?> = (elements as
        Array<IScrollingZoomCompletedEventArgs?>).castToImpl<IScrollingZoomCompletedEventArgs,IScrollingZoomCompletedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IScrollingZoomCompletedEventArgs?> =
        arrayOfNulls<IScrollingZoomCompletedEventArgs_Impl>(size) as
        Array<IScrollingZoomCompletedEventArgs?>
  }
}
