package Windows.Media.Playback

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IReference
import Windows.Foundation.TimeSpan
import Windows.Media.Playback.IMediaPlaybackList.ABI.IID
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMediaPlaybackList2.ABI::class)
@Signature("{0e09b478-600a-4274-a14b-0b6723d0f48b}")
@Guid("0e09b478600a4274a14b0b6723d0f48b")
@WinRTInterface("0e09b478600a4274a14b0b6723d0f48b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaPlaybackList2.ByReference::class)
public interface IMediaPlaybackList2 : NativeMapped, IWinRTInterface, IMediaPlaybackList,
    IMediaPlaybackSource {
  @InterfaceMethod(0)
  public fun get_MaxPrefetchTime(): IReference<TimeSpan?>?

  @InterfaceMethod(1)
  public fun put_MaxPrefetchTime(value: IReference<TimeSpan?>?): Unit

  @InterfaceMethod(2)
  public fun get_StartingItem(): MediaPlaybackItem?

  @InterfaceMethod(3)
  public fun put_StartingItem(value: MediaPlaybackItem?): Unit

  @InterfaceMethod(4)
  public fun get_ShuffledItems(): IVectorView<MediaPlaybackItem?>?

  @InterfaceMethod(5)
  public fun SetShuffledItems(value: IIterable<MediaPlaybackItem?>?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaPlaybackList2> {
    public override fun getValue() = ABI.makeIMediaPlaybackList2(pointer.getPointer(0))

    public fun setValue(value: IMediaPlaybackList2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaPlaybackList2, IMediaPlaybackList.WithDefault,
      IMediaPlaybackSource.WithDefault {
    public val __1427515762_Ptr: Pointer?

    public val _1427515762_VtblPtr: Pointer?
      get() = __1427515762_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MaxPrefetchTime(): IReference<TimeSpan?>? {
      val fnPtr = _1427515762_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<TimeSpan?>>()
      val hr = fn.invokeHR(arrayOf(__1427515762_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<TimeSpan?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_MaxPrefetchTime(value: IReference<TimeSpan?>?): Unit {
      val fnPtr = _1427515762_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1427515762_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_StartingItem(): MediaPlaybackItem? {
      val fnPtr = _1427515762_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaPlaybackItem>()
      val hr = fn.invokeHR(arrayOf(__1427515762_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaPlaybackItem>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_StartingItem(value: MediaPlaybackItem?): Unit {
      val fnPtr = _1427515762_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1427515762_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_ShuffledItems(): IVectorView<MediaPlaybackItem?>? {
      val fnPtr = _1427515762_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<MediaPlaybackItem?>>()
      val hr = fn.invokeHR(arrayOf(__1427515762_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<MediaPlaybackItem?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun SetShuffledItems(value: IIterable<MediaPlaybackItem?>?): Unit {
      val fnPtr = _1427515762_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1427515762_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMediaPlaybackList2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IMediaPlaybackList,
      IMediaPlaybackSource {
    public override val __1200877092_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1427515762_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1097311199_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IMediaPlaybackSource.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_1427515762_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1427515762_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaPlaybackList2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0e09b478600a4274a14b0b6723d0f48b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaPlaybackList2(ptr: Pointer?): WithDefault = IMediaPlaybackList2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaPlaybackList2 {
      val address = segment.toRawLongValue()
      return makeIMediaPlaybackList2(Pointer(address))
    }

    public override fun toNative(obj: IMediaPlaybackList2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1427515762_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaPlaybackList2): Array<IMediaPlaybackList2?> =
        (elements as
        Array<IMediaPlaybackList2?>).castToImpl<IMediaPlaybackList2,IMediaPlaybackList2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaPlaybackList2?> =
        arrayOfNulls<IMediaPlaybackList2_Impl>(size) as Array<IMediaPlaybackList2?>
  }
}
