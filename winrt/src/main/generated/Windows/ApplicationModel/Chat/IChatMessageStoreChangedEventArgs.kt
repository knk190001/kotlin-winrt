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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IChatMessageStoreChangedEventArgs.ABI::class)
@Signature("{65c66fac-fe8c-46d4-9119-57b8410311d5}")
@Guid("65c66facfe8c46d4911957b8410311d5")
@WinRTInterface("65c66facfe8c46d4911957b8410311d5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IChatMessageStoreChangedEventArgs.ByReference::class)
public interface IChatMessageStoreChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Id(): String?

  @InterfaceMethod(1)
  public fun get_Kind(): ChatStoreChangedEventKind?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IChatMessageStoreChangedEventArgs> {
    public override fun getValue() =
        ABI.makeIChatMessageStoreChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IChatMessageStoreChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IChatMessageStoreChangedEventArgs {
    public val __857359236_Ptr: Pointer?

    public val _857359236_VtblPtr: Pointer?
      get() = __857359236_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): String? {
      val fnPtr = _857359236_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__857359236_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Kind(): ChatStoreChangedEventKind? {
      val fnPtr = _857359236_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ChatStoreChangedEventKind>()
      val hr = fn.invokeHR(arrayOf(__857359236_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ChatStoreChangedEventKind>(result.getValue())
      return resultValue
    }
  }

  public class IChatMessageStoreChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __857359236_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IChatMessageStoreChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("65c66facfe8c46d4911957b8410311d5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIChatMessageStoreChangedEventArgs(ptr: Pointer?): WithDefault =
        IChatMessageStoreChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IChatMessageStoreChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIChatMessageStoreChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IChatMessageStoreChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__857359236_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IChatMessageStoreChangedEventArgs):
        Array<IChatMessageStoreChangedEventArgs?> = (elements as
        Array<IChatMessageStoreChangedEventArgs?>).castToImpl<IChatMessageStoreChangedEventArgs,IChatMessageStoreChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IChatMessageStoreChangedEventArgs?> =
        arrayOfNulls<IChatMessageStoreChangedEventArgs_Impl>(size) as
        Array<IChatMessageStoreChangedEventArgs?>
  }
}
