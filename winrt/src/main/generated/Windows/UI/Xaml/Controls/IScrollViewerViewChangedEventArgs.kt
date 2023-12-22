package Windows.UI.Xaml.Controls

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

@ABIMarker(IScrollViewerViewChangedEventArgs.ABI::class)
@Signature("{4dd04f7e-7a11-4b2e-9933-577df39252b6}")
@Guid("4dd04f7e7a114b2e9933577df39252b6")
@WinRTInterface("4dd04f7e7a114b2e9933577df39252b6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IScrollViewerViewChangedEventArgs.ByReference::class)
public interface IScrollViewerViewChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsIntermediate(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IScrollViewerViewChangedEventArgs> {
    public override fun getValue() =
        ABI.makeIScrollViewerViewChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IScrollViewerViewChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IScrollViewerViewChangedEventArgs {
    public val __2068252413_Ptr: Pointer?

    public val _2068252413_VtblPtr: Pointer?
      get() = __2068252413_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsIntermediate(): Boolean {
      val fnPtr = _2068252413_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2068252413_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IScrollViewerViewChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2068252413_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IScrollViewerViewChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4dd04f7e7a114b2e9933577df39252b6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIScrollViewerViewChangedEventArgs(ptr: Pointer?): WithDefault =
        IScrollViewerViewChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IScrollViewerViewChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIScrollViewerViewChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IScrollViewerViewChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2068252413_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IScrollViewerViewChangedEventArgs):
        Array<IScrollViewerViewChangedEventArgs?> = (elements as
        Array<IScrollViewerViewChangedEventArgs?>).castToImpl<IScrollViewerViewChangedEventArgs,IScrollViewerViewChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IScrollViewerViewChangedEventArgs?> =
        arrayOfNulls<IScrollViewerViewChangedEventArgs_Impl>(size) as
        Array<IScrollViewerViewChangedEventArgs?>
  }
}
