package Windows.UI.Xaml.Media.Imaging

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

@ABIMarker(ISvgImageSourceFailedEventArgs.ABI::class)
@Signature("{68bb3170-3ccc-4035-ac01-9834543d744e}")
@Guid("68bb31703ccc4035ac019834543d744e")
@WinRTInterface("68bb31703ccc4035ac019834543d744e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISvgImageSourceFailedEventArgs.ByReference::class)
public interface ISvgImageSourceFailedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): SvgImageSourceLoadStatus?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISvgImageSourceFailedEventArgs> {
    public override fun getValue() = ABI.makeISvgImageSourceFailedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ISvgImageSourceFailedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISvgImageSourceFailedEventArgs {
    public val __299605110_Ptr: Pointer?

    public val _299605110_VtblPtr: Pointer?
      get() = __299605110_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): SvgImageSourceLoadStatus? {
      val fnPtr = _299605110_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SvgImageSourceLoadStatus>()
      val hr = fn.invokeHR(arrayOf(__299605110_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SvgImageSourceLoadStatus>(result.getValue())
      return resultValue
    }
  }

  public class ISvgImageSourceFailedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __299605110_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISvgImageSourceFailedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("68bb31703ccc4035ac019834543d744e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISvgImageSourceFailedEventArgs(ptr: Pointer?): WithDefault =
        ISvgImageSourceFailedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISvgImageSourceFailedEventArgs {
      val address = segment.toRawLongValue()
      return makeISvgImageSourceFailedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ISvgImageSourceFailedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__299605110_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISvgImageSourceFailedEventArgs):
        Array<ISvgImageSourceFailedEventArgs?> = (elements as
        Array<ISvgImageSourceFailedEventArgs?>).castToImpl<ISvgImageSourceFailedEventArgs,ISvgImageSourceFailedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISvgImageSourceFailedEventArgs?> =
        arrayOfNulls<ISvgImageSourceFailedEventArgs_Impl>(size) as
        Array<ISvgImageSourceFailedEventArgs?>
  }
}
