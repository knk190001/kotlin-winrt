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

@ABIMarker(IPerceptionInfraredFrameSourceAddedEventArgs.ABI::class)
@Signature("{6d334120-95ce-4660-907a-d98035aa2b7c}")
@Guid("6d33412095ce4660907ad98035aa2b7c")
@WinRTInterface("6d33412095ce4660907ad98035aa2b7c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPerceptionInfraredFrameSourceAddedEventArgs.ByReference::class)
public interface IPerceptionInfraredFrameSourceAddedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FrameSource(): PerceptionInfraredFrameSource?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPerceptionInfraredFrameSourceAddedEventArgs> {
    public override fun getValue() =
        ABI.makeIPerceptionInfraredFrameSourceAddedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IPerceptionInfraredFrameSourceAddedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPerceptionInfraredFrameSourceAddedEventArgs {
    public val __1645987857_Ptr: Pointer?

    public val _1645987857_VtblPtr: Pointer?
      get() = __1645987857_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FrameSource(): PerceptionInfraredFrameSource? {
      val fnPtr = _1645987857_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PerceptionInfraredFrameSource>()
      val hr = fn.invokeHR(arrayOf(__1645987857_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PerceptionInfraredFrameSource>(result.getValue())
      return resultValue
    }
  }

  public class IPerceptionInfraredFrameSourceAddedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1645987857_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPerceptionInfraredFrameSourceAddedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6d33412095ce4660907ad98035aa2b7c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPerceptionInfraredFrameSourceAddedEventArgs(ptr: Pointer?): WithDefault =
        IPerceptionInfraredFrameSourceAddedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IPerceptionInfraredFrameSourceAddedEventArgs {
      val address = segment.toRawLongValue()
      return makeIPerceptionInfraredFrameSourceAddedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IPerceptionInfraredFrameSourceAddedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1645987857_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPerceptionInfraredFrameSourceAddedEventArgs):
        Array<IPerceptionInfraredFrameSourceAddedEventArgs?> = (elements as
        Array<IPerceptionInfraredFrameSourceAddedEventArgs?>).castToImpl<IPerceptionInfraredFrameSourceAddedEventArgs,IPerceptionInfraredFrameSourceAddedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPerceptionInfraredFrameSourceAddedEventArgs?> =
        arrayOfNulls<IPerceptionInfraredFrameSourceAddedEventArgs_Impl>(size) as
        Array<IPerceptionInfraredFrameSourceAddedEventArgs?>
  }
}
