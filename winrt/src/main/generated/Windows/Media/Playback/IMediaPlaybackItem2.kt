package Windows.Media.Playback

import Windows.Foundation.IReference
import Windows.Foundation.TimeSpan
import Windows.Media.Playback.IMediaPlaybackItem.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IMediaPlaybackItem2.ABI::class)
@Signature("{d859d171-d7ef-4b81-ac1f-f40493cbb091}")
@Guid("d859d171d7ef4b81ac1ff40493cbb091")
@WinRTInterface("d859d171d7ef4b81ac1ff40493cbb091")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaPlaybackItem2.ByReference::class)
public interface IMediaPlaybackItem2 : NativeMapped, IWinRTInterface, IMediaPlaybackItem,
    IMediaPlaybackSource {
  @InterfaceMethod(0)
  public fun get_BreakSchedule(): MediaBreakSchedule?

  @InterfaceMethod(1)
  public fun get_StartTime(): TimeSpan?

  @InterfaceMethod(2)
  public fun get_DurationLimit(): IReference<TimeSpan?>?

  @InterfaceMethod(3)
  public fun get_CanSkip(): Boolean

  @InterfaceMethod(4)
  public fun put_CanSkip(value: Boolean): Unit

  @InterfaceMethod(5)
  public fun GetDisplayProperties(): MediaItemDisplayProperties?

  @InterfaceMethod(6)
  public fun ApplyDisplayProperties(value: MediaItemDisplayProperties?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaPlaybackItem2> {
    public override fun getValue() = ABI.makeIMediaPlaybackItem2(pointer.getPointer(0))

    public fun setValue(value: IMediaPlaybackItem2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaPlaybackItem2, IMediaPlaybackItem.WithDefault,
      IMediaPlaybackSource.WithDefault {
    public val __1429972295_Ptr: Pointer?

    public val _1429972295_VtblPtr: Pointer?
      get() = __1429972295_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BreakSchedule(): MediaBreakSchedule? {
      val fnPtr = _1429972295_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaBreakSchedule>()
      val hr = fn.invokeHR(arrayOf(__1429972295_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaBreakSchedule>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_StartTime(): TimeSpan? {
      val fnPtr = _1429972295_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1429972295_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_DurationLimit(): IReference<TimeSpan?>? {
      val fnPtr = _1429972295_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<TimeSpan?>>()
      val hr = fn.invokeHR(arrayOf(__1429972295_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<TimeSpan?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_CanSkip(): Boolean {
      val fnPtr = _1429972295_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1429972295_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun put_CanSkip(value: Boolean): Unit {
      val fnPtr = _1429972295_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1429972295_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun GetDisplayProperties(): MediaItemDisplayProperties? {
      val fnPtr = _1429972295_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaItemDisplayProperties>()
      val hr = fn.invokeHR(arrayOf(__1429972295_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaItemDisplayProperties>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun ApplyDisplayProperties(value: MediaItemDisplayProperties?): Unit {
      val fnPtr = _1429972295_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1429972295_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMediaPlaybackItem2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IMediaPlaybackItem,
      IMediaPlaybackSource {
    public override val __1200797849_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1429972295_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1097311199_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IMediaPlaybackSource.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_1429972295_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1429972295_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaPlaybackItem2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d859d171d7ef4b81ac1ff40493cbb091")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaPlaybackItem2(ptr: Pointer?): WithDefault = IMediaPlaybackItem2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaPlaybackItem2 {
      val address = segment.toRawLongValue()
      return makeIMediaPlaybackItem2(Pointer(address))
    }

    public override fun toNative(obj: IMediaPlaybackItem2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1429972295_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaPlaybackItem2): Array<IMediaPlaybackItem2?> =
        (elements as
        Array<IMediaPlaybackItem2?>).castToImpl<IMediaPlaybackItem2,IMediaPlaybackItem2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaPlaybackItem2?> =
        arrayOfNulls<IMediaPlaybackItem2_Impl>(size) as Array<IMediaPlaybackItem2?>
  }
}
