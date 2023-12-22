package Windows.ApplicationModel.Chat

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncOperation
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

@ABIMarker(IChatMessageManagerStatic.ABI::class)
@Signature("{f15c60f7-d5e8-5e92-556d-e03b60253104}")
@Guid("f15c60f7d5e85e92556de03b60253104")
@WinRTInterface("f15c60f7d5e85e92556de03b60253104")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IChatMessageManagerStatic.ByReference::class)
public interface IChatMessageManagerStatic : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetTransportsAsync(): IAsyncOperation<IVectorView<ChatMessageTransport?>?>?

  @InterfaceMethod(1)
  public fun RequestStoreAsync(): IAsyncOperation<ChatMessageStore?>?

  @InterfaceMethod(2)
  public fun ShowComposeSmsMessageAsync(message: ChatMessage?): IAsyncAction?

  @InterfaceMethod(3)
  public fun ShowSmsSettings(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IChatMessageManagerStatic> {
    public override fun getValue() = ABI.makeIChatMessageManagerStatic(pointer.getPointer(0))

    public fun setValue(value: IChatMessageManagerStatic_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IChatMessageManagerStatic {
    public val __614747059_Ptr: Pointer?

    public val _614747059_VtblPtr: Pointer?
      get() = __614747059_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetTransportsAsync():
        IAsyncOperation<IVectorView<ChatMessageTransport?>?>? {
      val fnPtr = _614747059_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<ChatMessageTransport?>?>>()
      val hr = fn.invokeHR(arrayOf(__614747059_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<ChatMessageTransport?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun RequestStoreAsync(): IAsyncOperation<ChatMessageStore?>? {
      val fnPtr = _614747059_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ChatMessageStore?>>()
      val hr = fn.invokeHR(arrayOf(__614747059_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<ChatMessageStore?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun ShowComposeSmsMessageAsync(message: ChatMessage?): IAsyncAction? {
      val fnPtr = _614747059_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__614747059_Ptr, marshalToNative(message), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun ShowSmsSettings(): Unit {
      val fnPtr = _614747059_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__614747059_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IChatMessageManagerStatic_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __614747059_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IChatMessageManagerStatic, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f15c60f7d5e85e92556de03b60253104")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIChatMessageManagerStatic(ptr: Pointer?): WithDefault =
        IChatMessageManagerStatic_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IChatMessageManagerStatic {
      val address = segment.toRawLongValue()
      return makeIChatMessageManagerStatic(Pointer(address))
    }

    public override fun toNative(obj: IChatMessageManagerStatic): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__614747059_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IChatMessageManagerStatic):
        Array<IChatMessageManagerStatic?> = (elements as
        Array<IChatMessageManagerStatic?>).castToImpl<IChatMessageManagerStatic,IChatMessageManagerStatic_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IChatMessageManagerStatic?> =
        arrayOfNulls<IChatMessageManagerStatic_Impl>(size) as Array<IChatMessageManagerStatic?>
  }
}
