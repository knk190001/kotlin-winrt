package Windows.ApplicationModel.Chat

import Windows.Foundation.Collections.IVector
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

@ABIMarker(IChatConversationThreadingInfo.ABI::class)
@Signature("{331c21dc-7a07-4422-a32c-24be7c6dab24}")
@Guid("331c21dc7a074422a32c24be7c6dab24")
@WinRTInterface("331c21dc7a074422a32c24be7c6dab24")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IChatConversationThreadingInfo.ByReference::class)
public interface IChatConversationThreadingInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ContactId(): String?

  @InterfaceMethod(1)
  public fun put_ContactId(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_Custom(): String?

  @InterfaceMethod(3)
  public fun put_Custom(value: String?): Unit

  @InterfaceMethod(4)
  public fun get_ConversationId(): String?

  @InterfaceMethod(5)
  public fun put_ConversationId(value: String?): Unit

  @InterfaceMethod(6)
  public fun get_Participants(): IVector<String?>?

  @InterfaceMethod(7)
  public fun get_Kind(): ChatConversationThreadingKind?

  @InterfaceMethod(8)
  public fun put_Kind(value: ChatConversationThreadingKind?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IChatConversationThreadingInfo> {
    public override fun getValue() = ABI.makeIChatConversationThreadingInfo(pointer.getPointer(0))

    public fun setValue(value: IChatConversationThreadingInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IChatConversationThreadingInfo {
    public val __1196538364_Ptr: Pointer?

    public val _1196538364_VtblPtr: Pointer?
      get() = __1196538364_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ContactId(): String? {
      val fnPtr = _1196538364_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1196538364_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_ContactId(value: String?): Unit {
      val fnPtr = _1196538364_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1196538364_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Custom(): String? {
      val fnPtr = _1196538364_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1196538364_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Custom(value: String?): Unit {
      val fnPtr = _1196538364_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1196538364_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_ConversationId(): String? {
      val fnPtr = _1196538364_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1196538364_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_ConversationId(value: String?): Unit {
      val fnPtr = _1196538364_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1196538364_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_Participants(): IVector<String?>? {
      val fnPtr = _1196538364_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__1196538364_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_Kind(): ChatConversationThreadingKind? {
      val fnPtr = _1196538364_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ChatConversationThreadingKind>()
      val hr = fn.invokeHR(arrayOf(__1196538364_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ChatConversationThreadingKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun put_Kind(value: ChatConversationThreadingKind?): Unit {
      val fnPtr = _1196538364_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1196538364_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IChatConversationThreadingInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1196538364_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IChatConversationThreadingInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("331c21dc7a074422a32c24be7c6dab24")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIChatConversationThreadingInfo(ptr: Pointer?): WithDefault =
        IChatConversationThreadingInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IChatConversationThreadingInfo {
      val address = segment.toRawLongValue()
      return makeIChatConversationThreadingInfo(Pointer(address))
    }

    public override fun toNative(obj: IChatConversationThreadingInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1196538364_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IChatConversationThreadingInfo):
        Array<IChatConversationThreadingInfo?> = (elements as
        Array<IChatConversationThreadingInfo?>).castToImpl<IChatConversationThreadingInfo,IChatConversationThreadingInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IChatConversationThreadingInfo?> =
        arrayOfNulls<IChatConversationThreadingInfo_Impl>(size) as
        Array<IChatConversationThreadingInfo?>
  }
}
