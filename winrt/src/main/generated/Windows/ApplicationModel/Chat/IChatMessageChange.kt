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

@ABIMarker(IChatMessageChange.ABI::class)
@Signature("{1c18c355-421e-54b8-6d38-6b3a6c82fccc}")
@Guid("1c18c355421e54b86d386b3a6c82fccc")
@WinRTInterface("1c18c355421e54b86d386b3a6c82fccc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IChatMessageChange.ByReference::class)
public interface IChatMessageChange : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ChangeType(): ChatMessageChangeType?

  @InterfaceMethod(1)
  public fun get_Message(): ChatMessage?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IChatMessageChange> {
    public override fun getValue() = ABI.makeIChatMessageChange(pointer.getPointer(0))

    public fun setValue(value: IChatMessageChange_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IChatMessageChange {
    public val __1436846968_Ptr: Pointer?

    public val _1436846968_VtblPtr: Pointer?
      get() = __1436846968_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ChangeType(): ChatMessageChangeType? {
      val fnPtr = _1436846968_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ChatMessageChangeType>()
      val hr = fn.invokeHR(arrayOf(__1436846968_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ChatMessageChangeType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Message(): ChatMessage? {
      val fnPtr = _1436846968_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ChatMessage>()
      val hr = fn.invokeHR(arrayOf(__1436846968_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ChatMessage>(result.getValue())
      return resultValue
    }
  }

  public class IChatMessageChange_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1436846968_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IChatMessageChange, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1c18c355421e54b86d386b3a6c82fccc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIChatMessageChange(ptr: Pointer?): WithDefault = IChatMessageChange_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IChatMessageChange {
      val address = segment.toRawLongValue()
      return makeIChatMessageChange(Pointer(address))
    }

    public override fun toNative(obj: IChatMessageChange): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1436846968_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IChatMessageChange): Array<IChatMessageChange?> =
        (elements as
        Array<IChatMessageChange?>).castToImpl<IChatMessageChange,IChatMessageChange_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IChatMessageChange?> =
        arrayOfNulls<IChatMessageChange_Impl>(size) as Array<IChatMessageChange?>
  }
}
