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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IChatMessageManager2Statics.ABI::class)
@Signature("{1d45390f-9f4f-4e35-964e-1b9ca61ac044}")
@Guid("1d45390f9f4f4e35964e1b9ca61ac044")
@WinRTInterface("1d45390f9f4f4e35964e1b9ca61ac044")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IChatMessageManager2Statics.ByReference::class)
public interface IChatMessageManager2Statics : NativeMapped, IWinRTInterface,
    IChatMessageManagerStatic {
  @InterfaceMethod(0)
  public fun RegisterTransportAsync(): IAsyncOperation<String?>?

  @InterfaceMethod(1)
  public fun GetTransportAsync(transportId: String?): IAsyncOperation<ChatMessageTransport?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IChatMessageManager2Statics> {
    public override fun getValue() = ABI.makeIChatMessageManager2Statics(pointer.getPointer(0))

    public fun setValue(value: IChatMessageManager2Statics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IChatMessageManager2Statics, IChatMessageManagerStatic.WithDefault
      {
    public val __1987131160_Ptr: Pointer?

    public val _1987131160_VtblPtr: Pointer?
      get() = __1987131160_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RegisterTransportAsync(): IAsyncOperation<String?>? {
      val fnPtr = _1987131160_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<String?>>()
      val hr = fn.invokeHR(arrayOf(__1987131160_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetTransportAsync(transportId: String?):
        IAsyncOperation<ChatMessageTransport?>? {
      val fnPtr = _1987131160_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ChatMessageTransport?>>()
      val hr = fn.invokeHR(arrayOf(__1987131160_Ptr, marshalToNative(transportId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<ChatMessageTransport?>>(result.getValue())
      return resultValue
    }
  }

  public class IChatMessageManager2Statics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IChatMessageManagerStatic {
    public override val __614747059_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1987131160_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1987131160_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IChatMessageManager2Statics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1d45390f9f4f4e35964e1b9ca61ac044")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIChatMessageManager2Statics(ptr: Pointer?): WithDefault =
        IChatMessageManager2Statics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IChatMessageManager2Statics {
      val address = segment.toRawLongValue()
      return makeIChatMessageManager2Statics(Pointer(address))
    }

    public override fun toNative(obj: IChatMessageManager2Statics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1987131160_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IChatMessageManager2Statics):
        Array<IChatMessageManager2Statics?> = (elements as
        Array<IChatMessageManager2Statics?>).castToImpl<IChatMessageManager2Statics,IChatMessageManager2Statics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IChatMessageManager2Statics?> =
        arrayOfNulls<IChatMessageManager2Statics_Impl>(size) as Array<IChatMessageManager2Statics?>
  }
}
