package Windows.UI.Xaml.Controls.Maps

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMapTileSource2.ABI::class)
@Signature("{8e65ebbd-4095-5c15-99f1-1260b4e8b0a9}")
@Guid("8e65ebbd40955c1599f11260b4e8b0a9")
@WinRTInterface("8e65ebbd40955c1599f11260b4e8b0a9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapTileSource2.ByReference::class)
public interface IMapTileSource2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AnimationState(): MapTileAnimationState?

  @InterfaceMethod(1)
  public fun get_AutoPlay(): Boolean

  @InterfaceMethod(2)
  public fun put_AutoPlay(value: Boolean): Unit

  @InterfaceMethod(3)
  public fun get_FrameCount(): Int

  @InterfaceMethod(4)
  public fun put_FrameCount(value: Int): Unit

  @InterfaceMethod(5)
  public fun get_FrameDuration(): TimeSpan?

  @InterfaceMethod(6)
  public fun put_FrameDuration(value: TimeSpan?): Unit

  @InterfaceMethod(7)
  public fun Pause(): Unit

  @InterfaceMethod(8)
  public fun Play(): Unit

  @InterfaceMethod(9)
  public fun Stop(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapTileSource2> {
    public override fun getValue() = ABI.makeIMapTileSource2(pointer.getPointer(0))

    public fun setValue(value: IMapTileSource2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapTileSource2 {
    public val __78537346_Ptr: Pointer?

    public val _78537346_VtblPtr: Pointer?
      get() = __78537346_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AnimationState(): MapTileAnimationState? {
      val fnPtr = _78537346_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapTileAnimationState>()
      val hr = fn.invokeHR(arrayOf(__78537346_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapTileAnimationState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_AutoPlay(): Boolean {
      val fnPtr = _78537346_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__78537346_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_AutoPlay(value: Boolean): Unit {
      val fnPtr = _78537346_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__78537346_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_FrameCount(): Int {
      val fnPtr = _78537346_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__78537346_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun put_FrameCount(value: Int): Unit {
      val fnPtr = _78537346_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__78537346_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_FrameDuration(): TimeSpan? {
      val fnPtr = _78537346_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__78537346_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_FrameDuration(value: TimeSpan?): Unit {
      val fnPtr = _78537346_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__78537346_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun Pause(): Unit {
      val fnPtr = _78537346_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__78537346_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun Play(): Unit {
      val fnPtr = _78537346_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__78537346_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun Stop(): Unit {
      val fnPtr = _78537346_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__78537346_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMapTileSource2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __78537346_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapTileSource2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8e65ebbd40955c1599f11260b4e8b0a9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapTileSource2(ptr: Pointer?): WithDefault = IMapTileSource2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapTileSource2 {
      val address = segment.toRawLongValue()
      return makeIMapTileSource2(Pointer(address))
    }

    public override fun toNative(obj: IMapTileSource2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__78537346_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapTileSource2): Array<IMapTileSource2?> = (elements as
        Array<IMapTileSource2?>).castToImpl<IMapTileSource2,IMapTileSource2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapTileSource2?> =
        arrayOfNulls<IMapTileSource2_Impl>(size) as Array<IMapTileSource2?>
  }
}
