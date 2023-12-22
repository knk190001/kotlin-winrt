package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Composition.CompositionObject
import Microsoft.UI.Xaml.DataTemplate
import Microsoft.UI.Xaml.Media.Stretch
import Windows.Foundation.IAsyncAction
import Windows.Foundation.TimeSpan
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAnimatedVisualPlayer.ABI::class)
@Signature("{17f024f0-1692-51dd-a4da-f4ed648d614c}")
@Guid("17f024f0169251dda4daf4ed648d614c")
@WinRTInterface("17f024f0169251dda4daf4ed648d614c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAnimatedVisualPlayer.ByReference::class)
public interface IAnimatedVisualPlayer : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Diagnostics(): IUnknown?

  @InterfaceMethod(1)
  public fun get_Duration(): TimeSpan?

  @InterfaceMethod(2)
  public fun get_Source(): IAnimatedVisualSource?

  @InterfaceMethod(3)
  public fun put_Source(value: IAnimatedVisualSource?): Unit

  @InterfaceMethod(4)
  public fun get_FallbackContent(): DataTemplate?

  @InterfaceMethod(5)
  public fun put_FallbackContent(value: DataTemplate?): Unit

  @InterfaceMethod(6)
  public fun get_AutoPlay(): Boolean

  @InterfaceMethod(7)
  public fun put_AutoPlay(value: Boolean): Unit

  @InterfaceMethod(8)
  public fun get_IsAnimatedVisualLoaded(): Boolean

  @InterfaceMethod(9)
  public fun get_IsPlaying(): Boolean

  @InterfaceMethod(10)
  public fun get_PlaybackRate(): Double

  @InterfaceMethod(11)
  public fun put_PlaybackRate(value: Double): Unit

  @InterfaceMethod(12)
  public fun get_ProgressObject(): CompositionObject?

  @InterfaceMethod(13)
  public fun get_Stretch(): Stretch?

  @InterfaceMethod(14)
  public fun put_Stretch(value: Stretch?): Unit

  @InterfaceMethod(15)
  public fun Pause(): Unit

  @InterfaceMethod(16)
  public fun PlayAsync(
    fromProgress: Double,
    toProgress: Double,
    looped: Boolean
  ): IAsyncAction?

  @InterfaceMethod(17)
  public fun Resume(): Unit

  @InterfaceMethod(18)
  public fun SetProgress(progress: Double): Unit

  @InterfaceMethod(19)
  public fun Stop(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAnimatedVisualPlayer> {
    public override fun getValue() = ABI.makeIAnimatedVisualPlayer(pointer.getPointer(0))

    public fun setValue(value: IAnimatedVisualPlayer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAnimatedVisualPlayer {
    public val __332536885_Ptr: Pointer?

    public val _332536885_VtblPtr: Pointer?
      get() = __332536885_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Diagnostics(): IUnknown? {
      val fnPtr = _332536885_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__332536885_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Duration(): TimeSpan? {
      val fnPtr = _332536885_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__332536885_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Source(): IAnimatedVisualSource? {
      val fnPtr = _332536885_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAnimatedVisualSource>()
      val hr = fn.invokeHR(arrayOf(__332536885_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAnimatedVisualSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Source(value: IAnimatedVisualSource?): Unit {
      val fnPtr = _332536885_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__332536885_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_FallbackContent(): DataTemplate? {
      val fnPtr = _332536885_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataTemplate>()
      val hr = fn.invokeHR(arrayOf(__332536885_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataTemplate>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_FallbackContent(value: DataTemplate?): Unit {
      val fnPtr = _332536885_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__332536885_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_AutoPlay(): Boolean {
      val fnPtr = _332536885_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__332536885_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_AutoPlay(value: Boolean): Unit {
      val fnPtr = _332536885_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__332536885_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_IsAnimatedVisualLoaded(): Boolean {
      val fnPtr = _332536885_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__332536885_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun get_IsPlaying(): Boolean {
      val fnPtr = _332536885_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__332536885_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(10)
    public override fun get_PlaybackRate(): Double {
      val fnPtr = _332536885_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__332536885_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun put_PlaybackRate(value: Double): Unit {
      val fnPtr = _332536885_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__332536885_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_ProgressObject(): CompositionObject? {
      val fnPtr = _332536885_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionObject>()
      val hr = fn.invokeHR(arrayOf(__332536885_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionObject>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun get_Stretch(): Stretch? {
      val fnPtr = _332536885_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Stretch>()
      val hr = fn.invokeHR(arrayOf(__332536885_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Stretch>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun put_Stretch(value: Stretch?): Unit {
      val fnPtr = _332536885_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__332536885_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun Pause(): Unit {
      val fnPtr = _332536885_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__332536885_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun PlayAsync(
      fromProgress: Double,
      toProgress: Double,
      looped: Boolean
    ): IAsyncAction? {
      val fnPtr = _332536885_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__332536885_Ptr, fromProgress, toProgress, looped, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun Resume(): Unit {
      val fnPtr = _332536885_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__332536885_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun SetProgress(progress: Double): Unit {
      val fnPtr = _332536885_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__332536885_Ptr, progress,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(19)
    public override fun Stop(): Unit {
      val fnPtr = _332536885_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__332536885_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAnimatedVisualPlayer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __332536885_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAnimatedVisualPlayer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("17f024f0169251dda4daf4ed648d614c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAnimatedVisualPlayer(ptr: Pointer?): WithDefault =
        IAnimatedVisualPlayer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAnimatedVisualPlayer {
      val address = segment.toRawLongValue()
      return makeIAnimatedVisualPlayer(Pointer(address))
    }

    public override fun toNative(obj: IAnimatedVisualPlayer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__332536885_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAnimatedVisualPlayer): Array<IAnimatedVisualPlayer?> =
        (elements as
        Array<IAnimatedVisualPlayer?>).castToImpl<IAnimatedVisualPlayer,IAnimatedVisualPlayer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAnimatedVisualPlayer?> =
        arrayOfNulls<IAnimatedVisualPlayer_Impl>(size) as Array<IAnimatedVisualPlayer?>
  }
}
