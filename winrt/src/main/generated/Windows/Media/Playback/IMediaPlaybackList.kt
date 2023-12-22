package Windows.Media.Playback

import Windows.Foundation.Collections.IObservableVector
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import Windows.Media.Playback.IMediaPlaybackSource.ABI.IID
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IMediaPlaybackList.ABI::class)
@Signature("{7f77ee9c-dc42-4e26-a98d-7850df8ec925}")
@Guid("7f77ee9cdc424e26a98d7850df8ec925")
@WinRTInterface("7f77ee9cdc424e26a98d7850df8ec925")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaPlaybackList.ByReference::class)
public interface IMediaPlaybackList : NativeMapped, IWinRTInterface, IMediaPlaybackSource {
  @InterfaceMethod(0)
  public fun add_ItemFailed(handler: TypedEventHandler<MediaPlaybackList?,
      MediaPlaybackItemFailedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_ItemFailed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_CurrentItemChanged(handler: TypedEventHandler<MediaPlaybackList?,
      CurrentMediaPlaybackItemChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_CurrentItemChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun add_ItemOpened(handler: TypedEventHandler<MediaPlaybackList?,
      MediaPlaybackItemOpenedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_ItemOpened(token: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun get_Items(): IObservableVector<MediaPlaybackItem?>?

  @InterfaceMethod(7)
  public fun get_AutoRepeatEnabled(): Boolean

  @InterfaceMethod(8)
  public fun put_AutoRepeatEnabled(value: Boolean): Unit

  @InterfaceMethod(9)
  public fun get_ShuffleEnabled(): Boolean

  @InterfaceMethod(10)
  public fun put_ShuffleEnabled(value: Boolean): Unit

  @InterfaceMethod(11)
  public fun get_CurrentItem(): MediaPlaybackItem?

  @InterfaceMethod(12)
  public fun get_CurrentItemIndex(): WinDef.UINT

  @InterfaceMethod(13)
  public fun MoveNext(): MediaPlaybackItem?

  @InterfaceMethod(14)
  public fun MovePrevious(): MediaPlaybackItem?

  @InterfaceMethod(15)
  public fun MoveTo(itemIndex: WinDef.UINT): MediaPlaybackItem?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaPlaybackList> {
    public override fun getValue() = ABI.makeIMediaPlaybackList(pointer.getPointer(0))

    public fun setValue(value: IMediaPlaybackList_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaPlaybackList, IMediaPlaybackSource.WithDefault {
    public val __1200877092_Ptr: Pointer?

    public val _1200877092_VtblPtr: Pointer?
      get() = __1200877092_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_ItemFailed(handler: TypedEventHandler<MediaPlaybackList?,
        MediaPlaybackItemFailedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1200877092_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1200877092_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_ItemFailed(token: EventRegistrationToken?): Unit {
      val fnPtr = _1200877092_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1200877092_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_CurrentItemChanged(handler: TypedEventHandler<MediaPlaybackList?,
        CurrentMediaPlaybackItemChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1200877092_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1200877092_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_CurrentItemChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1200877092_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1200877092_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_ItemOpened(handler: TypedEventHandler<MediaPlaybackList?,
        MediaPlaybackItemOpenedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1200877092_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1200877092_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_ItemOpened(token: EventRegistrationToken?): Unit {
      val fnPtr = _1200877092_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1200877092_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_Items(): IObservableVector<MediaPlaybackItem?>? {
      val fnPtr = _1200877092_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IObservableVector<MediaPlaybackItem?>>()
      val hr = fn.invokeHR(arrayOf(__1200877092_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IObservableVector<MediaPlaybackItem?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_AutoRepeatEnabled(): Boolean {
      val fnPtr = _1200877092_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1200877092_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun put_AutoRepeatEnabled(value: Boolean): Unit {
      val fnPtr = _1200877092_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1200877092_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_ShuffleEnabled(): Boolean {
      val fnPtr = _1200877092_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1200877092_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(10)
    public override fun put_ShuffleEnabled(value: Boolean): Unit {
      val fnPtr = _1200877092_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1200877092_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun get_CurrentItem(): MediaPlaybackItem? {
      val fnPtr = _1200877092_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaPlaybackItem>()
      val hr = fn.invokeHR(arrayOf(__1200877092_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaPlaybackItem>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun get_CurrentItemIndex(): WinDef.UINT {
      val fnPtr = _1200877092_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1200877092_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun MoveNext(): MediaPlaybackItem? {
      val fnPtr = _1200877092_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaPlaybackItem>()
      val hr = fn.invokeHR(arrayOf(__1200877092_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaPlaybackItem>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun MovePrevious(): MediaPlaybackItem? {
      val fnPtr = _1200877092_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaPlaybackItem>()
      val hr = fn.invokeHR(arrayOf(__1200877092_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaPlaybackItem>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun MoveTo(itemIndex: WinDef.UINT): MediaPlaybackItem? {
      val fnPtr = _1200877092_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaPlaybackItem>()
      val hr = fn.invokeHR(arrayOf(__1200877092_Ptr, itemIndex, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaPlaybackItem>(result.getValue())
      return resultValue
    }
  }

  public class IMediaPlaybackList_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IMediaPlaybackSource {
    public override val __1097311199_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1200877092_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1200877092_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaPlaybackList, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7f77ee9cdc424e26a98d7850df8ec925")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaPlaybackList(ptr: Pointer?): WithDefault = IMediaPlaybackList_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaPlaybackList {
      val address = segment.toRawLongValue()
      return makeIMediaPlaybackList(Pointer(address))
    }

    public override fun toNative(obj: IMediaPlaybackList): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1200877092_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaPlaybackList): Array<IMediaPlaybackList?> =
        (elements as
        Array<IMediaPlaybackList?>).castToImpl<IMediaPlaybackList,IMediaPlaybackList_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaPlaybackList?> =
        arrayOfNulls<IMediaPlaybackList_Impl>(size) as Array<IMediaPlaybackList?>
  }
}
