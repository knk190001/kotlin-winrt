package Microsoft.UI.Xaml

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDebugSettings2.ABI::class)
@Signature("{6dfb6f51-d2f8-59c4-8bca-4410929577d0}")
@Guid("6dfb6f51d2f859c48bca4410929577d0")
@WinRTInterface("6dfb6f51d2f859c48bca4410929577d0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDebugSettings2.ByReference::class)
public interface IDebugSettings2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsXamlResourceReferenceTracingEnabled(): Boolean

  @InterfaceMethod(1)
  public fun put_IsXamlResourceReferenceTracingEnabled(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun add_XamlResourceReferenceFailed(handler: TypedEventHandler<DebugSettings?,
      XamlResourceReferenceFailedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_XamlResourceReferenceFailed(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDebugSettings2> {
    public override fun getValue() = ABI.makeIDebugSettings2(pointer.getPointer(0))

    public fun setValue(value: IDebugSettings2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDebugSettings2 {
    public val __1110315165_Ptr: Pointer?

    public val _1110315165_VtblPtr: Pointer?
      get() = __1110315165_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsXamlResourceReferenceTracingEnabled(): Boolean {
      val fnPtr = _1110315165_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1110315165_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsXamlResourceReferenceTracingEnabled(value: Boolean): Unit {
      val fnPtr = _1110315165_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1110315165_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_XamlResourceReferenceFailed(handler: TypedEventHandler<DebugSettings?,
        XamlResourceReferenceFailedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1110315165_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1110315165_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_XamlResourceReferenceFailed(token: EventRegistrationToken?): Unit {
      val fnPtr = _1110315165_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1110315165_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDebugSettings2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1110315165_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDebugSettings2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6dfb6f51d2f859c48bca4410929577d0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDebugSettings2(ptr: Pointer?): WithDefault = IDebugSettings2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDebugSettings2 {
      val address = segment.toRawLongValue()
      return makeIDebugSettings2(Pointer(address))
    }

    public override fun toNative(obj: IDebugSettings2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1110315165_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDebugSettings2): Array<IDebugSettings2?> = (elements as
        Array<IDebugSettings2?>).castToImpl<IDebugSettings2,IDebugSettings2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDebugSettings2?> =
        arrayOfNulls<IDebugSettings2_Impl>(size) as Array<IDebugSettings2?>
  }
}
