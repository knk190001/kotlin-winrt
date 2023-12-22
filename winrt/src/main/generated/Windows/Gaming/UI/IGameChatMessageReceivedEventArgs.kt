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

@ABIMarker(IGameChatMessageReceivedEventArgs.ABI::class)
@Signature("{a28201f1-3fb9-4e42-a403-7afce2023b1e}")
@Guid("a28201f13fb94e42a4037afce2023b1e")
@WinRTInterface("a28201f13fb94e42a4037afce2023b1e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGameChatMessageReceivedEventArgs.ByReference::class)
public interface IGameChatMessageReceivedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AppId(): String?

  @InterfaceMethod(1)
  public fun get_AppDisplayName(): String?

  @InterfaceMethod(2)
  public fun get_SenderName(): String?

  @InterfaceMethod(3)
  public fun get_Message(): String?

  @InterfaceMethod(4)
  public fun get_Origin(): GameChatMessageOrigin?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGameChatMessageReceivedEventArgs> {
    public override fun getValue() =
        ABI.makeIGameChatMessageReceivedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IGameChatMessageReceivedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGameChatMessageReceivedEventArgs {
    public val __920844390_Ptr: Pointer?

    public val _920844390_VtblPtr: Pointer?
      get() = __920844390_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AppId(): String? {
      val fnPtr = _920844390_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__920844390_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_AppDisplayName(): String? {
      val fnPtr = _920844390_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__920844390_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_SenderName(): String? {
      val fnPtr = _920844390_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__920844390_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Message(): String? {
      val fnPtr = _920844390_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__920844390_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Origin(): GameChatMessageOrigin? {
      val fnPtr = _920844390_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GameChatMessageOrigin>()
      val hr = fn.invokeHR(arrayOf(__920844390_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GameChatMessageOrigin>(result.getValue())
      return resultValue
    }
  }

  public class IGameChatMessageReceivedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __920844390_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGameChatMessageReceivedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a28201f13fb94e42a4037afce2023b1e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGameChatMessageReceivedEventArgs(ptr: Pointer?): WithDefault =
        IGameChatMessageReceivedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGameChatMessageReceivedEventArgs {
      val address = segment.toRawLongValue()
      return makeIGameChatMessageReceivedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IGameChatMessageReceivedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__920844390_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGameChatMessageReceivedEventArgs):
        Array<IGameChatMessageReceivedEventArgs?> = (elements as
        Array<IGameChatMessageReceivedEventArgs?>).castToImpl<IGameChatMessageReceivedEventArgs,IGameChatMessageReceivedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGameChatMessageReceivedEventArgs?> =
        arrayOfNulls<IGameChatMessageReceivedEventArgs_Impl>(size) as
        Array<IGameChatMessageReceivedEventArgs?>
  }
}
