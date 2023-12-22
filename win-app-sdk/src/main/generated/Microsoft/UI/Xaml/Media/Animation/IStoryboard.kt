package Microsoft.UI.Xaml.Media.Animation

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

@ABIMarker(IStoryboard.ABI::class)
@Signature("{04d41bb3-8721-519e-8e53-fb8b34920305}")
@Guid("04d41bb38721519e8e53fb8b34920305")
@WinRTInterface("04d41bb38721519e8e53fb8b34920305")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStoryboard.ByReference::class)
public interface IStoryboard : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Children(): TimelineCollection?

  @InterfaceMethod(1)
  public fun Seek(offset: TimeSpan?): Unit

  @InterfaceMethod(2)
  public fun Stop(): Unit

  @InterfaceMethod(3)
  public fun Begin(): Unit

  @InterfaceMethod(4)
  public fun Pause(): Unit

  @InterfaceMethod(5)
  public fun Resume(): Unit

  @InterfaceMethod(6)
  public fun GetCurrentState(): ClockState?

  @InterfaceMethod(7)
  public fun GetCurrentTime(): TimeSpan?

  @InterfaceMethod(8)
  public fun SeekAlignedToLastTick(offset: TimeSpan?): Unit

  @InterfaceMethod(9)
  public fun SkipToFill(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IStoryboard> {
    public override fun getValue() = ABI.makeIStoryboard(pointer.getPointer(0))

    public fun setValue(value: IStoryboard_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStoryboard {
    public val __1021348020_Ptr: Pointer?

    public val _1021348020_VtblPtr: Pointer?
      get() = __1021348020_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Children(): TimelineCollection? {
      val fnPtr = _1021348020_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimelineCollection>()
      val hr = fn.invokeHR(arrayOf(__1021348020_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimelineCollection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun Seek(offset: TimeSpan?): Unit {
      val fnPtr = _1021348020_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1021348020_Ptr, marshalToNative(offset),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun Stop(): Unit {
      val fnPtr = _1021348020_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1021348020_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun Begin(): Unit {
      val fnPtr = _1021348020_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1021348020_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun Pause(): Unit {
      val fnPtr = _1021348020_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1021348020_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun Resume(): Unit {
      val fnPtr = _1021348020_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1021348020_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun GetCurrentState(): ClockState? {
      val fnPtr = _1021348020_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ClockState>()
      val hr = fn.invokeHR(arrayOf(__1021348020_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ClockState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun GetCurrentTime(): TimeSpan? {
      val fnPtr = _1021348020_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1021348020_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun SeekAlignedToLastTick(offset: TimeSpan?): Unit {
      val fnPtr = _1021348020_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1021348020_Ptr, marshalToNative(offset),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun SkipToFill(): Unit {
      val fnPtr = _1021348020_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1021348020_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IStoryboard_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1021348020_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStoryboard, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("04d41bb38721519e8e53fb8b34920305")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStoryboard(ptr: Pointer?): WithDefault = IStoryboard_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStoryboard {
      val address = segment.toRawLongValue()
      return makeIStoryboard(Pointer(address))
    }

    public override fun toNative(obj: IStoryboard): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1021348020_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStoryboard): Array<IStoryboard?> = (elements as
        Array<IStoryboard?>).castToImpl<IStoryboard,IStoryboard_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStoryboard?> =
        arrayOfNulls<IStoryboard_Impl>(size) as Array<IStoryboard?>
  }
}
