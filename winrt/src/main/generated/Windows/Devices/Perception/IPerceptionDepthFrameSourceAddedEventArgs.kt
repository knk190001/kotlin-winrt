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

@ABIMarker(IPerceptionDepthFrameSourceAddedEventArgs.ABI::class)
@Signature("{93a48168-8bf8-45d2-a2f8-4ac0931cc7a6}")
@Guid("93a481688bf845d2a2f84ac0931cc7a6")
@WinRTInterface("93a481688bf845d2a2f84ac0931cc7a6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPerceptionDepthFrameSourceAddedEventArgs.ByReference::class)
public interface IPerceptionDepthFrameSourceAddedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FrameSource(): PerceptionDepthFrameSource?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPerceptionDepthFrameSourceAddedEventArgs> {
    public override fun getValue() =
        ABI.makeIPerceptionDepthFrameSourceAddedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IPerceptionDepthFrameSourceAddedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPerceptionDepthFrameSourceAddedEventArgs {
    public val __826221431_Ptr: Pointer?

    public val _826221431_VtblPtr: Pointer?
      get() = __826221431_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FrameSource(): PerceptionDepthFrameSource? {
      val fnPtr = _826221431_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PerceptionDepthFrameSource>()
      val hr = fn.invokeHR(arrayOf(__826221431_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PerceptionDepthFrameSource>(result.getValue())
      return resultValue
    }
  }

  public class IPerceptionDepthFrameSourceAddedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __826221431_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPerceptionDepthFrameSourceAddedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("93a481688bf845d2a2f84ac0931cc7a6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPerceptionDepthFrameSourceAddedEventArgs(ptr: Pointer?): WithDefault =
        IPerceptionDepthFrameSourceAddedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IPerceptionDepthFrameSourceAddedEventArgs {
      val address = segment.toRawLongValue()
      return makeIPerceptionDepthFrameSourceAddedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IPerceptionDepthFrameSourceAddedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__826221431_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPerceptionDepthFrameSourceAddedEventArgs):
        Array<IPerceptionDepthFrameSourceAddedEventArgs?> = (elements as
        Array<IPerceptionDepthFrameSourceAddedEventArgs?>).castToImpl<IPerceptionDepthFrameSourceAddedEventArgs,IPerceptionDepthFrameSourceAddedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPerceptionDepthFrameSourceAddedEventArgs?> =
        arrayOfNulls<IPerceptionDepthFrameSourceAddedEventArgs_Impl>(size) as
        Array<IPerceptionDepthFrameSourceAddedEventArgs?>
  }
}
