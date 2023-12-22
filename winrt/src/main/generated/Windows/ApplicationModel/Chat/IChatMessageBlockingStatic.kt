package Windows.ApplicationModel.Chat

import Windows.Foundation.IAsyncAction
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IChatMessageBlockingStatic.ABI::class)
@Signature("{f6b9a380-cdea-11e4-8830-0800200c9a66}")
@Guid("f6b9a380cdea11e488300800200c9a66")
@WinRTInterface("f6b9a380cdea11e488300800200c9a66")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IChatMessageBlockingStatic.ByReference::class)
public interface IChatMessageBlockingStatic : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun MarkMessageAsBlockedAsync(localChatMessageId: String?, blocked: Boolean): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IChatMessageBlockingStatic> {
    public override fun getValue() = ABI.makeIChatMessageBlockingStatic(pointer.getPointer(0))

    public fun setValue(value: IChatMessageBlockingStatic_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IChatMessageBlockingStatic {
    public val __1713595701_Ptr: Pointer?

    public val _1713595701_VtblPtr: Pointer?
      get() = __1713595701_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun MarkMessageAsBlockedAsync(localChatMessageId: String?, blocked: Boolean):
        IAsyncAction? {
      val fnPtr = _1713595701_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1713595701_Ptr, marshalToNative(localChatMessageId), blocked,
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IChatMessageBlockingStatic_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1713595701_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IChatMessageBlockingStatic, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f6b9a380cdea11e488300800200c9a66")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIChatMessageBlockingStatic(ptr: Pointer?): WithDefault =
        IChatMessageBlockingStatic_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IChatMessageBlockingStatic {
      val address = segment.toRawLongValue()
      return makeIChatMessageBlockingStatic(Pointer(address))
    }

    public override fun toNative(obj: IChatMessageBlockingStatic): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1713595701_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IChatMessageBlockingStatic):
        Array<IChatMessageBlockingStatic?> = (elements as
        Array<IChatMessageBlockingStatic?>).castToImpl<IChatMessageBlockingStatic,IChatMessageBlockingStatic_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IChatMessageBlockingStatic?> =
        arrayOfNulls<IChatMessageBlockingStatic_Impl>(size) as Array<IChatMessageBlockingStatic?>
  }
}
