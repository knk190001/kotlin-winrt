package Windows.Media.Effects

import Windows.Media.AudioFrame
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

@ABIMarker(IProcessAudioFrameContext.ABI::class)
@Signature("{4cd92946-1222-4a27-a586-fb3e20273255}")
@Guid("4cd9294612224a27a586fb3e20273255")
@WinRTInterface("4cd9294612224a27a586fb3e20273255")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IProcessAudioFrameContext.ByReference::class)
public interface IProcessAudioFrameContext : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_InputFrame(): AudioFrame?

  @InterfaceMethod(1)
  public fun get_OutputFrame(): AudioFrame?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IProcessAudioFrameContext> {
    public override fun getValue() = ABI.makeIProcessAudioFrameContext(pointer.getPointer(0))

    public fun setValue(value: IProcessAudioFrameContext_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IProcessAudioFrameContext {
    public val __1271021211_Ptr: Pointer?

    public val _1271021211_VtblPtr: Pointer?
      get() = __1271021211_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_InputFrame(): AudioFrame? {
      val fnPtr = _1271021211_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioFrame>()
      val hr = fn.invokeHR(arrayOf(__1271021211_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioFrame>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_OutputFrame(): AudioFrame? {
      val fnPtr = _1271021211_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioFrame>()
      val hr = fn.invokeHR(arrayOf(__1271021211_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioFrame>(result.getValue())
      return resultValue
    }
  }

  public class IProcessAudioFrameContext_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1271021211_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IProcessAudioFrameContext, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4cd9294612224a27a586fb3e20273255")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIProcessAudioFrameContext(ptr: Pointer?): WithDefault =
        IProcessAudioFrameContext_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IProcessAudioFrameContext {
      val address = segment.toRawLongValue()
      return makeIProcessAudioFrameContext(Pointer(address))
    }

    public override fun toNative(obj: IProcessAudioFrameContext): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1271021211_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IProcessAudioFrameContext):
        Array<IProcessAudioFrameContext?> = (elements as
        Array<IProcessAudioFrameContext?>).castToImpl<IProcessAudioFrameContext,IProcessAudioFrameContext_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IProcessAudioFrameContext?> =
        arrayOfNulls<IProcessAudioFrameContext_Impl>(size) as Array<IProcessAudioFrameContext?>
  }
}
