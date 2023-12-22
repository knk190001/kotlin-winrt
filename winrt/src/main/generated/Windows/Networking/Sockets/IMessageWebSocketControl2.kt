package Windows.Networking.Sockets

import Windows.Foundation.TimeSpan
import Windows.Security.Cryptography.Certificates.Certificate
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

@ABIMarker(IMessageWebSocketControl2.ABI::class)
@Signature("{e30fd791-080c-400a-a712-27dfa9e744d8}")
@Guid("e30fd791080c400aa71227dfa9e744d8")
@WinRTInterface("e30fd791080c400aa71227dfa9e744d8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMessageWebSocketControl2.ByReference::class)
public interface IMessageWebSocketControl2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DesiredUnsolicitedPongInterval(): TimeSpan?

  @InterfaceMethod(1)
  public fun put_DesiredUnsolicitedPongInterval(value: TimeSpan?): Unit

  @InterfaceMethod(2)
  public fun get_ActualUnsolicitedPongInterval(): TimeSpan?

  @InterfaceMethod(3)
  public fun get_ReceiveMode(): MessageWebSocketReceiveMode?

  @InterfaceMethod(4)
  public fun put_ReceiveMode(value: MessageWebSocketReceiveMode?): Unit

  @InterfaceMethod(5)
  public fun get_ClientCertificate(): Certificate?

  @InterfaceMethod(6)
  public fun put_ClientCertificate(value: Certificate?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMessageWebSocketControl2> {
    public override fun getValue() = ABI.makeIMessageWebSocketControl2(pointer.getPointer(0))

    public fun setValue(value: IMessageWebSocketControl2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMessageWebSocketControl2 {
    public val __1922940141_Ptr: Pointer?

    public val _1922940141_VtblPtr: Pointer?
      get() = __1922940141_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DesiredUnsolicitedPongInterval(): TimeSpan? {
      val fnPtr = _1922940141_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1922940141_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_DesiredUnsolicitedPongInterval(value: TimeSpan?): Unit {
      val fnPtr = _1922940141_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1922940141_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_ActualUnsolicitedPongInterval(): TimeSpan? {
      val fnPtr = _1922940141_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1922940141_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_ReceiveMode(): MessageWebSocketReceiveMode? {
      val fnPtr = _1922940141_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MessageWebSocketReceiveMode>()
      val hr = fn.invokeHR(arrayOf(__1922940141_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MessageWebSocketReceiveMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_ReceiveMode(value: MessageWebSocketReceiveMode?): Unit {
      val fnPtr = _1922940141_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1922940141_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_ClientCertificate(): Certificate? {
      val fnPtr = _1922940141_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Certificate>()
      val hr = fn.invokeHR(arrayOf(__1922940141_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Certificate>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_ClientCertificate(value: Certificate?): Unit {
      val fnPtr = _1922940141_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1922940141_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMessageWebSocketControl2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1922940141_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMessageWebSocketControl2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e30fd791080c400aa71227dfa9e744d8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMessageWebSocketControl2(ptr: Pointer?): WithDefault =
        IMessageWebSocketControl2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMessageWebSocketControl2 {
      val address = segment.toRawLongValue()
      return makeIMessageWebSocketControl2(Pointer(address))
    }

    public override fun toNative(obj: IMessageWebSocketControl2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1922940141_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMessageWebSocketControl2):
        Array<IMessageWebSocketControl2?> = (elements as
        Array<IMessageWebSocketControl2?>).castToImpl<IMessageWebSocketControl2,IMessageWebSocketControl2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMessageWebSocketControl2?> =
        arrayOfNulls<IMessageWebSocketControl2_Impl>(size) as Array<IMessageWebSocketControl2?>
  }
}
