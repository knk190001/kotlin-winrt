package Windows.Media.Playback

import Windows.Foundation.Collections.ValueSet
import Windows.Foundation.IReference
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

@ABIMarker(IMediaBreak.ABI::class)
@Signature("{714be270-0def-4ebc-a489-6b34930e1558}")
@Guid("714be2700def4ebca4896b34930e1558")
@WinRTInterface("714be2700def4ebca4896b34930e1558")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaBreak.ByReference::class)
public interface IMediaBreak : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PlaybackList(): MediaPlaybackList?

  @InterfaceMethod(1)
  public fun get_PresentationPosition(): IReference<TimeSpan?>?

  @InterfaceMethod(2)
  public fun get_InsertionMethod(): MediaBreakInsertionMethod?

  @InterfaceMethod(3)
  public fun get_CustomProperties(): ValueSet?

  @InterfaceMethod(4)
  public fun get_CanStart(): Boolean

  @InterfaceMethod(5)
  public fun put_CanStart(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IMediaBreak> {
    public override fun getValue() = ABI.makeIMediaBreak(pointer.getPointer(0))

    public fun setValue(value: IMediaBreak_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaBreak {
    public val __1185063276_Ptr: Pointer?

    public val _1185063276_VtblPtr: Pointer?
      get() = __1185063276_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PlaybackList(): MediaPlaybackList? {
      val fnPtr = _1185063276_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaPlaybackList>()
      val hr = fn.invokeHR(arrayOf(__1185063276_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaPlaybackList>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_PresentationPosition(): IReference<TimeSpan?>? {
      val fnPtr = _1185063276_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<TimeSpan?>>()
      val hr = fn.invokeHR(arrayOf(__1185063276_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<TimeSpan?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_InsertionMethod(): MediaBreakInsertionMethod? {
      val fnPtr = _1185063276_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaBreakInsertionMethod>()
      val hr = fn.invokeHR(arrayOf(__1185063276_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaBreakInsertionMethod>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_CustomProperties(): ValueSet? {
      val fnPtr = _1185063276_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ValueSet>()
      val hr = fn.invokeHR(arrayOf(__1185063276_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ValueSet>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_CanStart(): Boolean {
      val fnPtr = _1185063276_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1185063276_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_CanStart(value: Boolean): Unit {
      val fnPtr = _1185063276_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1185063276_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMediaBreak_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1185063276_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaBreak, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("714be2700def4ebca4896b34930e1558")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaBreak(ptr: Pointer?): WithDefault = IMediaBreak_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaBreak {
      val address = segment.toRawLongValue()
      return makeIMediaBreak(Pointer(address))
    }

    public override fun toNative(obj: IMediaBreak): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1185063276_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaBreak): Array<IMediaBreak?> = (elements as
        Array<IMediaBreak?>).castToImpl<IMediaBreak,IMediaBreak_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaBreak?> =
        arrayOfNulls<IMediaBreak_Impl>(size) as Array<IMediaBreak?>
  }
}
