package Windows.ApplicationModel.Chat

import Windows.ApplicationModel.Chat.IChatMessageStore.ABI.IID
import Windows.Foundation.IAsyncOperation
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IChatMessageStore3.ABI::class)
@Signature("{9adbbb09-4345-4ec1-8b74-b7338243719c}")
@Guid("9adbbb0943454ec18b74b7338243719c")
@WinRTInterface("9adbbb0943454ec18b74b7338243719c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IChatMessageStore3.ByReference::class)
public interface IChatMessageStore3 : NativeMapped, IWinRTInterface, IChatMessageStore {
  @InterfaceMethod(0)
  public fun GetMessageBySyncIdAsync(syncId: String?): IAsyncOperation<ChatMessage?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IChatMessageStore3> {
    public override fun getValue() = ABI.makeIChatMessageStore3(pointer.getPointer(0))

    public fun setValue(value: IChatMessageStore3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IChatMessageStore3, IChatMessageStore.WithDefault {
    public val __1906416442_Ptr: Pointer?

    public val _1906416442_VtblPtr: Pointer?
      get() = __1906416442_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetMessageBySyncIdAsync(syncId: String?): IAsyncOperation<ChatMessage?>? {
      val fnPtr = _1906416442_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ChatMessage?>>()
      val hr = fn.invokeHR(arrayOf(__1906416442_Ptr, marshalToNative(syncId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<ChatMessage?>>(result.getValue())
      return resultValue
    }
  }

  public class IChatMessageStore3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IChatMessageStore {
    public override val __2016712679_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1906416442_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1906416442_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IChatMessageStore3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9adbbb0943454ec18b74b7338243719c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIChatMessageStore3(ptr: Pointer?): WithDefault = IChatMessageStore3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IChatMessageStore3 {
      val address = segment.toRawLongValue()
      return makeIChatMessageStore3(Pointer(address))
    }

    public override fun toNative(obj: IChatMessageStore3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1906416442_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IChatMessageStore3): Array<IChatMessageStore3?> =
        (elements as
        Array<IChatMessageStore3?>).castToImpl<IChatMessageStore3,IChatMessageStore3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IChatMessageStore3?> =
        arrayOfNulls<IChatMessageStore3_Impl>(size) as Array<IChatMessageStore3?>
  }
}
