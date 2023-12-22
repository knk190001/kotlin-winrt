package Windows.Media.Editing

import Windows.Foundation.Rect
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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMediaOverlay.ABI::class)
@Signature("{a902ae5d-7869-4830-8ab1-94dc01c05fa4}")
@Guid("a902ae5d786948308ab194dc01c05fa4")
@WinRTInterface("a902ae5d786948308ab194dc01c05fa4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaOverlay.ByReference::class)
public interface IMediaOverlay : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Position(): Rect?

  @InterfaceMethod(1)
  public fun put_Position(value: Rect?): Unit

  @InterfaceMethod(2)
  public fun put_Delay(value: TimeSpan?): Unit

  @InterfaceMethod(3)
  public fun get_Delay(): TimeSpan?

  @InterfaceMethod(4)
  public fun get_Opacity(): Double

  @InterfaceMethod(5)
  public fun put_Opacity(value: Double): Unit

  @InterfaceMethod(6)
  public fun Clone(): MediaOverlay?

  @InterfaceMethod(7)
  public fun get_Clip(): MediaClip?

  @InterfaceMethod(8)
  public fun get_AudioEnabled(): Boolean

  @InterfaceMethod(9)
  public fun put_AudioEnabled(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IMediaOverlay>
      {
    public override fun getValue() = ABI.makeIMediaOverlay(pointer.getPointer(0))

    public fun setValue(value: IMediaOverlay_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaOverlay {
    public val __1651766638_Ptr: Pointer?

    public val _1651766638_VtblPtr: Pointer?
      get() = __1651766638_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Position(): Rect? {
      val fnPtr = _1651766638_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__1651766638_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Position(value: Rect?): Unit {
      val fnPtr = _1651766638_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1651766638_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun put_Delay(value: TimeSpan?): Unit {
      val fnPtr = _1651766638_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1651766638_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_Delay(): TimeSpan? {
      val fnPtr = _1651766638_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1651766638_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Opacity(): Double {
      val fnPtr = _1651766638_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1651766638_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_Opacity(value: Double): Unit {
      val fnPtr = _1651766638_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1651766638_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun Clone(): MediaOverlay? {
      val fnPtr = _1651766638_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaOverlay>()
      val hr = fn.invokeHR(arrayOf(__1651766638_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaOverlay>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_Clip(): MediaClip? {
      val fnPtr = _1651766638_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaClip>()
      val hr = fn.invokeHR(arrayOf(__1651766638_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaClip>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_AudioEnabled(): Boolean {
      val fnPtr = _1651766638_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1651766638_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_AudioEnabled(value: Boolean): Unit {
      val fnPtr = _1651766638_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1651766638_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMediaOverlay_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1651766638_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaOverlay, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a902ae5d786948308ab194dc01c05fa4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaOverlay(ptr: Pointer?): WithDefault = IMediaOverlay_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaOverlay {
      val address = segment.toRawLongValue()
      return makeIMediaOverlay(Pointer(address))
    }

    public override fun toNative(obj: IMediaOverlay): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1651766638_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaOverlay): Array<IMediaOverlay?> = (elements as
        Array<IMediaOverlay?>).castToImpl<IMediaOverlay,IMediaOverlay_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaOverlay?> =
        arrayOfNulls<IMediaOverlay_Impl>(size) as Array<IMediaOverlay?>
  }
}
