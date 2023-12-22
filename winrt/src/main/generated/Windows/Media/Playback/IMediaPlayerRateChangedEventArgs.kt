package Windows.Media.Playback

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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMediaPlayerRateChangedEventArgs.ABI::class)
@Signature("{40600d58-3b61-4bb2-989f-fc65608b6cab}")
@Guid("40600d583b614bb2989ffc65608b6cab")
@WinRTInterface("40600d583b614bb2989ffc65608b6cab")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaPlayerRateChangedEventArgs.ByReference::class)
public interface IMediaPlayerRateChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_NewRate(): Double

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaPlayerRateChangedEventArgs> {
    public override fun getValue() = ABI.makeIMediaPlayerRateChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IMediaPlayerRateChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaPlayerRateChangedEventArgs {
    public val __1775075663_Ptr: Pointer?

    public val _1775075663_VtblPtr: Pointer?
      get() = __1775075663_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_NewRate(): Double {
      val fnPtr = _1775075663_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1775075663_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }
  }

  public class IMediaPlayerRateChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1775075663_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaPlayerRateChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("40600d583b614bb2989ffc65608b6cab")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaPlayerRateChangedEventArgs(ptr: Pointer?): WithDefault =
        IMediaPlayerRateChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaPlayerRateChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIMediaPlayerRateChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IMediaPlayerRateChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1775075663_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaPlayerRateChangedEventArgs):
        Array<IMediaPlayerRateChangedEventArgs?> = (elements as
        Array<IMediaPlayerRateChangedEventArgs?>).castToImpl<IMediaPlayerRateChangedEventArgs,IMediaPlayerRateChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaPlayerRateChangedEventArgs?> =
        arrayOfNulls<IMediaPlayerRateChangedEventArgs_Impl>(size) as
        Array<IMediaPlayerRateChangedEventArgs?>
  }
}
