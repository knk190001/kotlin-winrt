package Windows.ApplicationModel.Chat

import Windows.ApplicationModel.Chat.IChatMessageTransport.ABI.IID
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

@ABIMarker(IChatMessageTransport2.ABI::class)
@Signature("{90a75622-d84a-4c22-a94d-544444edc8a1}")
@Guid("90a75622d84a4c22a94d544444edc8a1")
@WinRTInterface("90a75622d84a4c22a94d544444edc8a1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IChatMessageTransport2.ByReference::class)
public interface IChatMessageTransport2 : NativeMapped, IWinRTInterface, IChatMessageTransport {
  @InterfaceMethod(0)
  public fun get_Configuration(): ChatMessageTransportConfiguration?

  @InterfaceMethod(1)
  public fun get_TransportKind(): ChatMessageTransportKind?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IChatMessageTransport2> {
    public override fun getValue() = ABI.makeIChatMessageTransport2(pointer.getPointer(0))

    public fun setValue(value: IChatMessageTransport2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IChatMessageTransport2, IChatMessageTransport.WithDefault {
    public val __1445445135_Ptr: Pointer?

    public val _1445445135_VtblPtr: Pointer?
      get() = __1445445135_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Configuration(): ChatMessageTransportConfiguration? {
      val fnPtr = _1445445135_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ChatMessageTransportConfiguration>()
      val hr = fn.invokeHR(arrayOf(__1445445135_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ChatMessageTransportConfiguration>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_TransportKind(): ChatMessageTransportKind? {
      val fnPtr = _1445445135_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ChatMessageTransportKind>()
      val hr = fn.invokeHR(arrayOf(__1445445135_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ChatMessageTransportKind>(result.getValue())
      return resultValue
    }
  }

  public class IChatMessageTransport2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IChatMessageTransport {
    public override val __1061751393_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1445445135_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1445445135_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IChatMessageTransport2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("90a75622d84a4c22a94d544444edc8a1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIChatMessageTransport2(ptr: Pointer?): WithDefault =
        IChatMessageTransport2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IChatMessageTransport2 {
      val address = segment.toRawLongValue()
      return makeIChatMessageTransport2(Pointer(address))
    }

    public override fun toNative(obj: IChatMessageTransport2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1445445135_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IChatMessageTransport2): Array<IChatMessageTransport2?> =
        (elements as
        Array<IChatMessageTransport2?>).castToImpl<IChatMessageTransport2,IChatMessageTransport2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IChatMessageTransport2?> =
        arrayOfNulls<IChatMessageTransport2_Impl>(size) as Array<IChatMessageTransport2?>
  }
}
