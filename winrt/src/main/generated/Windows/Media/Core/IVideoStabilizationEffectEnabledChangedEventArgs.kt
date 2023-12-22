package Windows.Media.Core

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

@ABIMarker(IVideoStabilizationEffectEnabledChangedEventArgs.ABI::class)
@Signature("{187eff28-67bb-4713-b900-4168da164529}")
@Guid("187eff2867bb4713b9004168da164529")
@WinRTInterface("187eff2867bb4713b9004168da164529")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVideoStabilizationEffectEnabledChangedEventArgs.ByReference::class)
public interface IVideoStabilizationEffectEnabledChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Reason(): VideoStabilizationEffectEnabledChangedReason?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVideoStabilizationEffectEnabledChangedEventArgs> {
    public override fun getValue() =
        ABI.makeIVideoStabilizationEffectEnabledChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IVideoStabilizationEffectEnabledChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVideoStabilizationEffectEnabledChangedEventArgs {
    public val __771828890_Ptr: Pointer?

    public val _771828890_VtblPtr: Pointer?
      get() = __771828890_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Reason(): VideoStabilizationEffectEnabledChangedReason? {
      val fnPtr = _771828890_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VideoStabilizationEffectEnabledChangedReason>()
      val hr = fn.invokeHR(arrayOf(__771828890_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<VideoStabilizationEffectEnabledChangedReason>(result.getValue())
      return resultValue
    }
  }

  public class IVideoStabilizationEffectEnabledChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __771828890_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVideoStabilizationEffectEnabledChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("187eff2867bb4713b9004168da164529")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVideoStabilizationEffectEnabledChangedEventArgs(ptr: Pointer?): WithDefault =
        IVideoStabilizationEffectEnabledChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IVideoStabilizationEffectEnabledChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIVideoStabilizationEffectEnabledChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IVideoStabilizationEffectEnabledChangedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__771828890_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVideoStabilizationEffectEnabledChangedEventArgs):
        Array<IVideoStabilizationEffectEnabledChangedEventArgs?> = (elements as
        Array<IVideoStabilizationEffectEnabledChangedEventArgs?>).castToImpl<IVideoStabilizationEffectEnabledChangedEventArgs,IVideoStabilizationEffectEnabledChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVideoStabilizationEffectEnabledChangedEventArgs?>
        = arrayOfNulls<IVideoStabilizationEffectEnabledChangedEventArgs_Impl>(size) as
        Array<IVideoStabilizationEffectEnabledChangedEventArgs?>
  }
}
