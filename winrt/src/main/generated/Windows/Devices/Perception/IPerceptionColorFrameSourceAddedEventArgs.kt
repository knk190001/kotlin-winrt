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

@ABIMarker(IPerceptionColorFrameSourceAddedEventArgs.ABI::class)
@Signature("{d16bf4e6-da24-442c-bbd5-55549b5b94f3}")
@Guid("d16bf4e6da24442cbbd555549b5b94f3")
@WinRTInterface("d16bf4e6da24442cbbd555549b5b94f3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPerceptionColorFrameSourceAddedEventArgs.ByReference::class)
public interface IPerceptionColorFrameSourceAddedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FrameSource(): PerceptionColorFrameSource?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPerceptionColorFrameSourceAddedEventArgs> {
    public override fun getValue() =
        ABI.makeIPerceptionColorFrameSourceAddedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IPerceptionColorFrameSourceAddedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPerceptionColorFrameSourceAddedEventArgs {
    public val __1680413719_Ptr: Pointer?

    public val _1680413719_VtblPtr: Pointer?
      get() = __1680413719_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FrameSource(): PerceptionColorFrameSource? {
      val fnPtr = _1680413719_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PerceptionColorFrameSource>()
      val hr = fn.invokeHR(arrayOf(__1680413719_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PerceptionColorFrameSource>(result.getValue())
      return resultValue
    }
  }

  public class IPerceptionColorFrameSourceAddedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1680413719_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPerceptionColorFrameSourceAddedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d16bf4e6da24442cbbd555549b5b94f3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPerceptionColorFrameSourceAddedEventArgs(ptr: Pointer?): WithDefault =
        IPerceptionColorFrameSourceAddedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IPerceptionColorFrameSourceAddedEventArgs {
      val address = segment.toRawLongValue()
      return makeIPerceptionColorFrameSourceAddedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IPerceptionColorFrameSourceAddedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1680413719_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPerceptionColorFrameSourceAddedEventArgs):
        Array<IPerceptionColorFrameSourceAddedEventArgs?> = (elements as
        Array<IPerceptionColorFrameSourceAddedEventArgs?>).castToImpl<IPerceptionColorFrameSourceAddedEventArgs,IPerceptionColorFrameSourceAddedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPerceptionColorFrameSourceAddedEventArgs?> =
        arrayOfNulls<IPerceptionColorFrameSourceAddedEventArgs_Impl>(size) as
        Array<IPerceptionColorFrameSourceAddedEventArgs?>
  }
}
