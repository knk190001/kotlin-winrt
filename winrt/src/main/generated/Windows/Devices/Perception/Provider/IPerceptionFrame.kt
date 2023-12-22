package Windows.Devices.Perception.Provider

import Windows.Foundation.Collections.ValueSet
import Windows.Foundation.IMemoryBuffer
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

@ABIMarker(IPerceptionFrame.ABI::class)
@Signature("{7cfe7825-54bb-4d9d-bec5-8ef66151d2ac}")
@Guid("7cfe782554bb4d9dbec58ef66151d2ac")
@WinRTInterface("7cfe782554bb4d9dbec58ef66151d2ac")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPerceptionFrame.ByReference::class)
public interface IPerceptionFrame : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_RelativeTime(): TimeSpan?

  @InterfaceMethod(1)
  public fun put_RelativeTime(value: TimeSpan?): Unit

  @InterfaceMethod(2)
  public fun get_Properties(): ValueSet?

  @InterfaceMethod(3)
  public fun get_FrameData(): IMemoryBuffer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPerceptionFrame> {
    public override fun getValue() = ABI.makeIPerceptionFrame(pointer.getPointer(0))

    public fun setValue(value: IPerceptionFrame_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPerceptionFrame {
    public val __1010981277_Ptr: Pointer?

    public val _1010981277_VtblPtr: Pointer?
      get() = __1010981277_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RelativeTime(): TimeSpan? {
      val fnPtr = _1010981277_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1010981277_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_RelativeTime(value: TimeSpan?): Unit {
      val fnPtr = _1010981277_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1010981277_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Properties(): ValueSet? {
      val fnPtr = _1010981277_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ValueSet>()
      val hr = fn.invokeHR(arrayOf(__1010981277_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ValueSet>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_FrameData(): IMemoryBuffer? {
      val fnPtr = _1010981277_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMemoryBuffer>()
      val hr = fn.invokeHR(arrayOf(__1010981277_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMemoryBuffer>(result.getValue())
      return resultValue
    }
  }

  public class IPerceptionFrame_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1010981277_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPerceptionFrame, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7cfe782554bb4d9dbec58ef66151d2ac")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPerceptionFrame(ptr: Pointer?): WithDefault = IPerceptionFrame_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPerceptionFrame {
      val address = segment.toRawLongValue()
      return makeIPerceptionFrame(Pointer(address))
    }

    public override fun toNative(obj: IPerceptionFrame): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1010981277_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPerceptionFrame): Array<IPerceptionFrame?> = (elements as
        Array<IPerceptionFrame?>).castToImpl<IPerceptionFrame,IPerceptionFrame_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPerceptionFrame?> =
        arrayOfNulls<IPerceptionFrame_Impl>(size) as Array<IPerceptionFrame?>
  }
}
