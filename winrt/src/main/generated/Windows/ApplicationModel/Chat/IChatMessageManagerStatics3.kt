package Windows.ApplicationModel.Chat

import Windows.ApplicationModel.Chat.IChatMessageManagerStatic.ABI.IID
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IChatMessageManagerStatics3.ABI::class)
@Signature("{208b830d-6755-48cc-9ab3-fd03c463fc92}")
@Guid("208b830d675548cc9ab3fd03c463fc92")
@WinRTInterface("208b830d675548cc9ab3fd03c463fc92")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IChatMessageManagerStatics3.ByReference::class)
public interface IChatMessageManagerStatics3 : NativeMapped, IWinRTInterface,
    IChatMessageManagerStatic {
  @InterfaceMethod(0)
  public fun RequestSyncManagerAsync(): IAsyncOperation<ChatSyncManager?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IChatMessageManagerStatics3> {
    public override fun getValue() = ABI.makeIChatMessageManagerStatics3(pointer.getPointer(0))

    public fun setValue(value: IChatMessageManagerStatics3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IChatMessageManagerStatics3, IChatMessageManagerStatic.WithDefault
      {
    public val __1933559533_Ptr: Pointer?

    public val _1933559533_VtblPtr: Pointer?
      get() = __1933559533_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RequestSyncManagerAsync(): IAsyncOperation<ChatSyncManager?>? {
      val fnPtr = _1933559533_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ChatSyncManager?>>()
      val hr = fn.invokeHR(arrayOf(__1933559533_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<ChatSyncManager?>>(result.getValue())
      return resultValue
    }
  }

  public class IChatMessageManagerStatics3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IChatMessageManagerStatic {
    public override val __614747059_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1933559533_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1933559533_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IChatMessageManagerStatics3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("208b830d675548cc9ab3fd03c463fc92")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIChatMessageManagerStatics3(ptr: Pointer?): WithDefault =
        IChatMessageManagerStatics3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IChatMessageManagerStatics3 {
      val address = segment.toRawLongValue()
      return makeIChatMessageManagerStatics3(Pointer(address))
    }

    public override fun toNative(obj: IChatMessageManagerStatics3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1933559533_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IChatMessageManagerStatics3):
        Array<IChatMessageManagerStatics3?> = (elements as
        Array<IChatMessageManagerStatics3?>).castToImpl<IChatMessageManagerStatics3,IChatMessageManagerStatics3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IChatMessageManagerStatics3?> =
        arrayOfNulls<IChatMessageManagerStatics3_Impl>(size) as Array<IChatMessageManagerStatics3?>
  }
}
