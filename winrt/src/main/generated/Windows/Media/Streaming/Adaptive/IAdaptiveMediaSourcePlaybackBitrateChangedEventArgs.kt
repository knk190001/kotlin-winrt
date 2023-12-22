package Windows.Media.Streaming.Adaptive

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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IAdaptiveMediaSourcePlaybackBitrateChangedEventArgs.ABI::class)
@Signature("{23a29f6d-7dda-4a51-87a9-6fa8c5b292be}")
@Guid("23a29f6d7dda4a5187a96fa8c5b292be")
@WinRTInterface("23a29f6d7dda4a5187a96fa8c5b292be")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAdaptiveMediaSourcePlaybackBitrateChangedEventArgs.ByReference::class)
public interface IAdaptiveMediaSourcePlaybackBitrateChangedEventArgs : NativeMapped, IWinRTInterface
    {
  @InterfaceMethod(0)
  public fun get_OldValue(): WinDef.UINT

  @InterfaceMethod(1)
  public fun get_NewValue(): WinDef.UINT

  @InterfaceMethod(2)
  public fun get_AudioOnly(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAdaptiveMediaSourcePlaybackBitrateChangedEventArgs> {
    public override fun getValue() =
        ABI.makeIAdaptiveMediaSourcePlaybackBitrateChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IAdaptiveMediaSourcePlaybackBitrateChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAdaptiveMediaSourcePlaybackBitrateChangedEventArgs {
    public val __698482274_Ptr: Pointer?

    public val _698482274_VtblPtr: Pointer?
      get() = __698482274_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_OldValue(): WinDef.UINT {
      val fnPtr = _698482274_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__698482274_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_NewValue(): WinDef.UINT {
      val fnPtr = _698482274_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__698482274_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_AudioOnly(): Boolean {
      val fnPtr = _698482274_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__698482274_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IAdaptiveMediaSourcePlaybackBitrateChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __698482274_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAdaptiveMediaSourcePlaybackBitrateChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("23a29f6d7dda4a5187a96fa8c5b292be")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAdaptiveMediaSourcePlaybackBitrateChangedEventArgs(ptr: Pointer?): WithDefault =
        IAdaptiveMediaSourcePlaybackBitrateChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IAdaptiveMediaSourcePlaybackBitrateChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIAdaptiveMediaSourcePlaybackBitrateChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IAdaptiveMediaSourcePlaybackBitrateChangedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__698482274_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAdaptiveMediaSourcePlaybackBitrateChangedEventArgs):
        Array<IAdaptiveMediaSourcePlaybackBitrateChangedEventArgs?> = (elements as
        Array<IAdaptiveMediaSourcePlaybackBitrateChangedEventArgs?>).castToImpl<IAdaptiveMediaSourcePlaybackBitrateChangedEventArgs,IAdaptiveMediaSourcePlaybackBitrateChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IAdaptiveMediaSourcePlaybackBitrateChangedEventArgs?> =
        arrayOfNulls<IAdaptiveMediaSourcePlaybackBitrateChangedEventArgs_Impl>(size) as
        Array<IAdaptiveMediaSourcePlaybackBitrateChangedEventArgs?>
  }
}
