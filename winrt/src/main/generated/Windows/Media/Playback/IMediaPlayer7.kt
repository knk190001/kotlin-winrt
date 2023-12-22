package Windows.Media.Playback

import Windows.Media.Audio.AudioStateMonitor
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

@ABIMarker(IMediaPlayer7.ABI::class)
@Signature("{5d1dc478-4500-4531-b3f4-777a71491f7f}")
@Guid("5d1dc47845004531b3f4777a71491f7f")
@WinRTInterface("5d1dc47845004531b3f4777a71491f7f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaPlayer7.ByReference::class)
public interface IMediaPlayer7 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AudioStateMonitor(): AudioStateMonitor?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IMediaPlayer7>
      {
    public override fun getValue() = ABI.makeIMediaPlayer7(pointer.getPointer(0))

    public fun setValue(value: IMediaPlayer7_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaPlayer7 {
    public val __1314081333_Ptr: Pointer?

    public val _1314081333_VtblPtr: Pointer?
      get() = __1314081333_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AudioStateMonitor(): AudioStateMonitor? {
      val fnPtr = _1314081333_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioStateMonitor>()
      val hr = fn.invokeHR(arrayOf(__1314081333_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioStateMonitor>(result.getValue())
      return resultValue
    }
  }

  public class IMediaPlayer7_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1314081333_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaPlayer7, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5d1dc47845004531b3f4777a71491f7f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaPlayer7(ptr: Pointer?): WithDefault = IMediaPlayer7_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaPlayer7 {
      val address = segment.toRawLongValue()
      return makeIMediaPlayer7(Pointer(address))
    }

    public override fun toNative(obj: IMediaPlayer7): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1314081333_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaPlayer7): Array<IMediaPlayer7?> = (elements as
        Array<IMediaPlayer7?>).castToImpl<IMediaPlayer7,IMediaPlayer7_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaPlayer7?> =
        arrayOfNulls<IMediaPlayer7_Impl>(size) as Array<IMediaPlayer7?>
  }
}
