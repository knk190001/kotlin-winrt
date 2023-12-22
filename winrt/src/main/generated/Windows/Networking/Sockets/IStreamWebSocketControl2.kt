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

@ABIMarker(IStreamWebSocketControl2.ABI::class)
@Signature("{215d9f7e-fa58-40da-9f11-a48dafe95037}")
@Guid("215d9f7efa5840da9f11a48dafe95037")
@WinRTInterface("215d9f7efa5840da9f11a48dafe95037")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStreamWebSocketControl2.ByReference::class)
public interface IStreamWebSocketControl2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DesiredUnsolicitedPongInterval(): TimeSpan?

  @InterfaceMethod(1)
  public fun put_DesiredUnsolicitedPongInterval(value: TimeSpan?): Unit

  @InterfaceMethod(2)
  public fun get_ActualUnsolicitedPongInterval(): TimeSpan?

  @InterfaceMethod(3)
  public fun get_ClientCertificate(): Certificate?

  @InterfaceMethod(4)
  public fun put_ClientCertificate(value: Certificate?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStreamWebSocketControl2> {
    public override fun getValue() = ABI.makeIStreamWebSocketControl2(pointer.getPointer(0))

    public fun setValue(value: IStreamWebSocketControl2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStreamWebSocketControl2 {
    public val __1807150556_Ptr: Pointer?

    public val _1807150556_VtblPtr: Pointer?
      get() = __1807150556_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DesiredUnsolicitedPongInterval(): TimeSpan? {
      val fnPtr = _1807150556_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1807150556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_DesiredUnsolicitedPongInterval(value: TimeSpan?): Unit {
      val fnPtr = _1807150556_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1807150556_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_ActualUnsolicitedPongInterval(): TimeSpan? {
      val fnPtr = _1807150556_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1807150556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_ClientCertificate(): Certificate? {
      val fnPtr = _1807150556_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Certificate>()
      val hr = fn.invokeHR(arrayOf(__1807150556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Certificate>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_ClientCertificate(value: Certificate?): Unit {
      val fnPtr = _1807150556_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1807150556_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IStreamWebSocketControl2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1807150556_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStreamWebSocketControl2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("215d9f7efa5840da9f11a48dafe95037")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStreamWebSocketControl2(ptr: Pointer?): WithDefault =
        IStreamWebSocketControl2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStreamWebSocketControl2 {
      val address = segment.toRawLongValue()
      return makeIStreamWebSocketControl2(Pointer(address))
    }

    public override fun toNative(obj: IStreamWebSocketControl2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1807150556_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStreamWebSocketControl2):
        Array<IStreamWebSocketControl2?> = (elements as
        Array<IStreamWebSocketControl2?>).castToImpl<IStreamWebSocketControl2,IStreamWebSocketControl2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStreamWebSocketControl2?> =
        arrayOfNulls<IStreamWebSocketControl2_Impl>(size) as Array<IStreamWebSocketControl2?>
  }
}
