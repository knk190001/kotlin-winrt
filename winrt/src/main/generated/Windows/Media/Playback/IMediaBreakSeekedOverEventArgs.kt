package Windows.Media.Playback

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.TimeSpan
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

@ABIMarker(IMediaBreakSeekedOverEventArgs.ABI::class)
@Signature("{e5aa6746-0606-4492-b9d3-c3c8fde0a4ea}")
@Guid("e5aa674606064492b9d3c3c8fde0a4ea")
@WinRTInterface("e5aa674606064492b9d3c3c8fde0a4ea")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaBreakSeekedOverEventArgs.ByReference::class)
public interface IMediaBreakSeekedOverEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SeekedOverBreaks(): IVectorView<MediaBreak?>?

  @InterfaceMethod(1)
  public fun get_OldPosition(): TimeSpan?

  @InterfaceMethod(2)
  public fun get_NewPosition(): TimeSpan?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaBreakSeekedOverEventArgs> {
    public override fun getValue() = ABI.makeIMediaBreakSeekedOverEventArgs(pointer.getPointer(0))

    public fun setValue(value: IMediaBreakSeekedOverEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaBreakSeekedOverEventArgs {
    public val __156161304_Ptr: Pointer?

    public val _156161304_VtblPtr: Pointer?
      get() = __156161304_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SeekedOverBreaks(): IVectorView<MediaBreak?>? {
      val fnPtr = _156161304_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<MediaBreak?>>()
      val hr = fn.invokeHR(arrayOf(__156161304_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<MediaBreak?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_OldPosition(): TimeSpan? {
      val fnPtr = _156161304_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__156161304_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_NewPosition(): TimeSpan? {
      val fnPtr = _156161304_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__156161304_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }
  }

  public class IMediaBreakSeekedOverEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __156161304_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaBreakSeekedOverEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e5aa674606064492b9d3c3c8fde0a4ea")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaBreakSeekedOverEventArgs(ptr: Pointer?): WithDefault =
        IMediaBreakSeekedOverEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaBreakSeekedOverEventArgs {
      val address = segment.toRawLongValue()
      return makeIMediaBreakSeekedOverEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IMediaBreakSeekedOverEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__156161304_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaBreakSeekedOverEventArgs):
        Array<IMediaBreakSeekedOverEventArgs?> = (elements as
        Array<IMediaBreakSeekedOverEventArgs?>).castToImpl<IMediaBreakSeekedOverEventArgs,IMediaBreakSeekedOverEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaBreakSeekedOverEventArgs?> =
        arrayOfNulls<IMediaBreakSeekedOverEventArgs_Impl>(size) as
        Array<IMediaBreakSeekedOverEventArgs?>
  }
}
