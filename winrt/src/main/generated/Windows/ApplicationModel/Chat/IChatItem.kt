package Windows.ApplicationModel.Chat

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

@ABIMarker(IChatItem.ABI::class)
@Signature("{8751d000-ceb1-4243-b803-15d45a1dd428}")
@Guid("8751d000ceb14243b80315d45a1dd428")
@WinRTInterface("8751d000ceb14243b80315d45a1dd428")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IChatItem.ByReference::class)
public interface IChatItem : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ItemKind(): ChatItemKind?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IChatItem> {
    public override fun getValue() = ABI.makeIChatItem(pointer.getPointer(0))

    public fun setValue(value: IChatItem_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IChatItem {
    public val __2120983278_Ptr: Pointer?

    public val _2120983278_VtblPtr: Pointer?
      get() = __2120983278_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ItemKind(): ChatItemKind? {
      val fnPtr = _2120983278_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ChatItemKind>()
      val hr = fn.invokeHR(arrayOf(__2120983278_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ChatItemKind>(result.getValue())
      return resultValue
    }
  }

  public class IChatItem_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2120983278_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IChatItem, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8751d000ceb14243b80315d45a1dd428")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIChatItem(ptr: Pointer?): WithDefault = IChatItem_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IChatItem {
      val address = segment.toRawLongValue()
      return makeIChatItem(Pointer(address))
    }

    public override fun toNative(obj: IChatItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2120983278_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IChatItem): Array<IChatItem?> = (elements as
        Array<IChatItem?>).castToImpl<IChatItem,IChatItem_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IChatItem?> = arrayOfNulls<IChatItem_Impl>(size)
        as Array<IChatItem?>
  }
}
