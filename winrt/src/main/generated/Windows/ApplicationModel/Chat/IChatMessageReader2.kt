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

@ABIMarker(IChatMessageReader2.ABI::class)
@Signature("{89643683-64bb-470d-9df4-0de8be1a05bf}")
@Guid("8964368364bb470d9df40de8be1a05bf")
@WinRTInterface("8964368364bb470d9df40de8be1a05bf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IChatMessageReader2.ByReference::class)
public interface IChatMessageReader2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ReadBatchAsync(count: Int): IAsyncOperation<IVectorView<ChatMessage?>?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IChatMessageReader2> {
    public override fun getValue() = ABI.makeIChatMessageReader2(pointer.getPointer(0))

    public fun setValue(value: IChatMessageReader2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IChatMessageReader2 {
    public val __1934049543_Ptr: Pointer?

    public val _1934049543_VtblPtr: Pointer?
      get() = __1934049543_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ReadBatchAsync(count: Int): IAsyncOperation<IVectorView<ChatMessage?>?>? {
      val fnPtr = _1934049543_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<ChatMessage?>?>>()
      val hr = fn.invokeHR(arrayOf(__1934049543_Ptr, count, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<ChatMessage?>?>>(result.getValue())
      return resultValue
    }
  }

  public class IChatMessageReader2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1934049543_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IChatMessageReader2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8964368364bb470d9df40de8be1a05bf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIChatMessageReader2(ptr: Pointer?): WithDefault = IChatMessageReader2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IChatMessageReader2 {
      val address = segment.toRawLongValue()
      return makeIChatMessageReader2(Pointer(address))
    }

    public override fun toNative(obj: IChatMessageReader2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1934049543_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IChatMessageReader2): Array<IChatMessageReader2?> =
        (elements as
        Array<IChatMessageReader2?>).castToImpl<IChatMessageReader2,IChatMessageReader2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IChatMessageReader2?> =
        arrayOfNulls<IChatMessageReader2_Impl>(size) as Array<IChatMessageReader2?>
  }
}
