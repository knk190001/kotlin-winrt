package Windows.ApplicationModel.Chat

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IChatMessageChangeReader.ABI::class)
@Signature("{14267020-28ce-5f26-7b05-9a5c7cce87ca}")
@Guid("1426702028ce5f267b059a5c7cce87ca")
@WinRTInterface("1426702028ce5f267b059a5c7cce87ca")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IChatMessageChangeReader.ByReference::class)
public interface IChatMessageChangeReader : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun AcceptChanges(): Unit

  @InterfaceMethod(1)
  public fun AcceptChangesThrough(lastChangeToAcknowledge: ChatMessageChange?): Unit

  @InterfaceMethod(2)
  public fun ReadBatchAsync(): IAsyncOperation<IVectorView<ChatMessageChange?>?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IChatMessageChangeReader> {
    public override fun getValue() = ABI.makeIChatMessageChangeReader(pointer.getPointer(0))

    public fun setValue(value: IChatMessageChangeReader_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IChatMessageChangeReader {
    public val __362391973_Ptr: Pointer?

    public val _362391973_VtblPtr: Pointer?
      get() = __362391973_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun AcceptChanges(): Unit {
      val fnPtr = _362391973_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__362391973_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun AcceptChangesThrough(lastChangeToAcknowledge: ChatMessageChange?): Unit {
      val fnPtr = _362391973_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__362391973_Ptr, marshalToNative(lastChangeToAcknowledge),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun ReadBatchAsync(): IAsyncOperation<IVectorView<ChatMessageChange?>?>? {
      val fnPtr = _362391973_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<ChatMessageChange?>?>>()
      val hr = fn.invokeHR(arrayOf(__362391973_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<ChatMessageChange?>?>>(result.getValue())
      return resultValue
    }
  }

  public class IChatMessageChangeReader_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __362391973_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IChatMessageChangeReader, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1426702028ce5f267b059a5c7cce87ca")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIChatMessageChangeReader(ptr: Pointer?): WithDefault =
        IChatMessageChangeReader_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IChatMessageChangeReader {
      val address = segment.toRawLongValue()
      return makeIChatMessageChangeReader(Pointer(address))
    }

    public override fun toNative(obj: IChatMessageChangeReader): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__362391973_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IChatMessageChangeReader):
        Array<IChatMessageChangeReader?> = (elements as
        Array<IChatMessageChangeReader?>).castToImpl<IChatMessageChangeReader,IChatMessageChangeReader_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IChatMessageChangeReader?> =
        arrayOfNulls<IChatMessageChangeReader_Impl>(size) as Array<IChatMessageChangeReader?>
  }
}
