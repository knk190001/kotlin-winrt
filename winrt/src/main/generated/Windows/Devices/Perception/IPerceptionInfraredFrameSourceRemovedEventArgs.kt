package Windows.Devices.Perception

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

@ABIMarker(IPerceptionInfraredFrameSourceRemovedEventArgs.ABI::class)
@Signature("{ea1a8071-7a70-4a61-af94-07303853f695}")
@Guid("ea1a80717a704a61af9407303853f695")
@WinRTInterface("ea1a80717a704a61af9407303853f695")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPerceptionInfraredFrameSourceRemovedEventArgs.ByReference::class)
public interface IPerceptionInfraredFrameSourceRemovedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FrameSource(): PerceptionInfraredFrameSource?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPerceptionInfraredFrameSourceRemovedEventArgs> {
    public override fun getValue() =
        ABI.makeIPerceptionInfraredFrameSourceRemovedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IPerceptionInfraredFrameSourceRemovedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPerceptionInfraredFrameSourceRemovedEventArgs {
    public val __998465999_Ptr: Pointer?

    public val _998465999_VtblPtr: Pointer?
      get() = __998465999_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FrameSource(): PerceptionInfraredFrameSource? {
      val fnPtr = _998465999_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PerceptionInfraredFrameSource>()
      val hr = fn.invokeHR(arrayOf(__998465999_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PerceptionInfraredFrameSource>(result.getValue())
      return resultValue
    }
  }

  public class IPerceptionInfraredFrameSourceRemovedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __998465999_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPerceptionInfraredFrameSourceRemovedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ea1a80717a704a61af9407303853f695")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPerceptionInfraredFrameSourceRemovedEventArgs(ptr: Pointer?): WithDefault =
        IPerceptionInfraredFrameSourceRemovedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IPerceptionInfraredFrameSourceRemovedEventArgs {
      val address = segment.toRawLongValue()
      return makeIPerceptionInfraredFrameSourceRemovedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IPerceptionInfraredFrameSourceRemovedEventArgs): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__998465999_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPerceptionInfraredFrameSourceRemovedEventArgs):
        Array<IPerceptionInfraredFrameSourceRemovedEventArgs?> = (elements as
        Array<IPerceptionInfraredFrameSourceRemovedEventArgs?>).castToImpl<IPerceptionInfraredFrameSourceRemovedEventArgs,IPerceptionInfraredFrameSourceRemovedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPerceptionInfraredFrameSourceRemovedEventArgs?> =
        arrayOfNulls<IPerceptionInfraredFrameSourceRemovedEventArgs_Impl>(size) as
        Array<IPerceptionInfraredFrameSourceRemovedEventArgs?>
  }
}
