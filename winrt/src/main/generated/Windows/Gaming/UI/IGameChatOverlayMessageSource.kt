package Windows.Gaming.UI

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TimeSpan
import Windows.Foundation.TypedEventHandler
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

@ABIMarker(IGameChatOverlayMessageSource.ABI::class)
@Signature("{1e177397-59fb-4f4f-8e9a-80acf817743c}")
@Guid("1e17739759fb4f4f8e9a80acf817743c")
@WinRTInterface("1e17739759fb4f4f8e9a80acf817743c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGameChatOverlayMessageSource.ByReference::class)
public interface IGameChatOverlayMessageSource : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_MessageReceived(handler: TypedEventHandler<GameChatOverlayMessageSource?,
      GameChatMessageReceivedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_MessageReceived(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun SetDelayBeforeClosingAfterMessageReceived(value: TimeSpan?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGameChatOverlayMessageSource> {
    public override fun getValue() = ABI.makeIGameChatOverlayMessageSource(pointer.getPointer(0))

    public fun setValue(value: IGameChatOverlayMessageSource_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGameChatOverlayMessageSource {
    public val __1057642179_Ptr: Pointer?

    public val _1057642179_VtblPtr: Pointer?
      get() = __1057642179_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override
        fun add_MessageReceived(handler: TypedEventHandler<GameChatOverlayMessageSource?,
        GameChatMessageReceivedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1057642179_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1057642179_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_MessageReceived(token: EventRegistrationToken?): Unit {
      val fnPtr = _1057642179_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1057642179_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun SetDelayBeforeClosingAfterMessageReceived(value: TimeSpan?): Unit {
      val fnPtr = _1057642179_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1057642179_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IGameChatOverlayMessageSource_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1057642179_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGameChatOverlayMessageSource, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1e17739759fb4f4f8e9a80acf817743c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGameChatOverlayMessageSource(ptr: Pointer?): WithDefault =
        IGameChatOverlayMessageSource_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGameChatOverlayMessageSource {
      val address = segment.toRawLongValue()
      return makeIGameChatOverlayMessageSource(Pointer(address))
    }

    public override fun toNative(obj: IGameChatOverlayMessageSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1057642179_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGameChatOverlayMessageSource):
        Array<IGameChatOverlayMessageSource?> = (elements as
        Array<IGameChatOverlayMessageSource?>).castToImpl<IGameChatOverlayMessageSource,IGameChatOverlayMessageSource_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGameChatOverlayMessageSource?> =
        arrayOfNulls<IGameChatOverlayMessageSource_Impl>(size) as
        Array<IGameChatOverlayMessageSource?>
  }
}
