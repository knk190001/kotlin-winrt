package Windows.Gaming.UI

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGameChatOverlay.ABI::class)
@Signature("{fbc64865-f6fc-4a48-ae07-03ac6ed43704}")
@Guid("fbc64865f6fc4a48ae0703ac6ed43704")
@WinRTInterface("fbc64865f6fc4a48ae0703ac6ed43704")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGameChatOverlay.ByReference::class)
public interface IGameChatOverlay : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DesiredPosition(): GameChatOverlayPosition?

  @InterfaceMethod(1)
  public fun put_DesiredPosition(value: GameChatOverlayPosition?): Unit

  @InterfaceMethod(2)
  public fun AddMessage(
    sender: String?,
    message: String?,
    origin: GameChatMessageOrigin?
  ): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGameChatOverlay> {
    public override fun getValue() = ABI.makeIGameChatOverlay(pointer.getPointer(0))

    public fun setValue(value: IGameChatOverlay_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGameChatOverlay {
    public val __1873591867_Ptr: Pointer?

    public val _1873591867_VtblPtr: Pointer?
      get() = __1873591867_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DesiredPosition(): GameChatOverlayPosition? {
      val fnPtr = _1873591867_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GameChatOverlayPosition>()
      val hr = fn.invokeHR(arrayOf(__1873591867_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GameChatOverlayPosition>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_DesiredPosition(value: GameChatOverlayPosition?): Unit {
      val fnPtr = _1873591867_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1873591867_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun AddMessage(
      sender: String?,
      message: String?,
      origin: GameChatMessageOrigin?
    ): Unit {
      val fnPtr = _1873591867_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1873591867_Ptr, marshalToNative(sender),
          marshalToNative(message), marshalToNative(origin),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IGameChatOverlay_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1873591867_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGameChatOverlay, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fbc64865f6fc4a48ae0703ac6ed43704")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGameChatOverlay(ptr: Pointer?): WithDefault = IGameChatOverlay_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGameChatOverlay {
      val address = segment.toRawLongValue()
      return makeIGameChatOverlay(Pointer(address))
    }

    public override fun toNative(obj: IGameChatOverlay): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1873591867_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGameChatOverlay): Array<IGameChatOverlay?> = (elements as
        Array<IGameChatOverlay?>).castToImpl<IGameChatOverlay,IGameChatOverlay_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGameChatOverlay?> =
        arrayOfNulls<IGameChatOverlay_Impl>(size) as Array<IGameChatOverlay?>
  }
}
