package Windows.Networking.Sockets

import Windows.Networking.Sockets.IMessageWebSocketMessageReceivedEventArgs.ABI.IID
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMessageWebSocketMessageReceivedEventArgs2.ABI::class)
@Signature("{89ce06fd-dd6f-4a07-87f9-f9eb4d89d83d}")
@Guid("89ce06fddd6f4a0787f9f9eb4d89d83d")
@WinRTInterface("89ce06fddd6f4a0787f9f9eb4d89d83d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMessageWebSocketMessageReceivedEventArgs2.ByReference::class)
public interface IMessageWebSocketMessageReceivedEventArgs2 : NativeMapped, IWinRTInterface,
    IMessageWebSocketMessageReceivedEventArgs {
  @InterfaceMethod(0)
  public fun get_IsMessageComplete(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMessageWebSocketMessageReceivedEventArgs2> {
    public override fun getValue() =
        ABI.makeIMessageWebSocketMessageReceivedEventArgs2(pointer.getPointer(0))

    public fun setValue(value: IMessageWebSocketMessageReceivedEventArgs2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMessageWebSocketMessageReceivedEventArgs2,
      IMessageWebSocketMessageReceivedEventArgs.WithDefault {
    public val __1369454037_Ptr: Pointer?

    public val _1369454037_VtblPtr: Pointer?
      get() = __1369454037_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsMessageComplete(): Boolean {
      val fnPtr = _1369454037_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1369454037_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IMessageWebSocketMessageReceivedEventArgs2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface,
      IMessageWebSocketMessageReceivedEventArgs {
    public override val __1341297383_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1369454037_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1369454037_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMessageWebSocketMessageReceivedEventArgs2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("89ce06fddd6f4a0787f9f9eb4d89d83d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMessageWebSocketMessageReceivedEventArgs2(ptr: Pointer?): WithDefault =
        IMessageWebSocketMessageReceivedEventArgs2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IMessageWebSocketMessageReceivedEventArgs2 {
      val address = segment.toRawLongValue()
      return makeIMessageWebSocketMessageReceivedEventArgs2(Pointer(address))
    }

    public override fun toNative(obj: IMessageWebSocketMessageReceivedEventArgs2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1369454037_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMessageWebSocketMessageReceivedEventArgs2):
        Array<IMessageWebSocketMessageReceivedEventArgs2?> = (elements as
        Array<IMessageWebSocketMessageReceivedEventArgs2?>).castToImpl<IMessageWebSocketMessageReceivedEventArgs2,IMessageWebSocketMessageReceivedEventArgs2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMessageWebSocketMessageReceivedEventArgs2?> =
        arrayOfNulls<IMessageWebSocketMessageReceivedEventArgs2_Impl>(size) as
        Array<IMessageWebSocketMessageReceivedEventArgs2?>
  }
}
