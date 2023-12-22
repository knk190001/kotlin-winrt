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
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IApplication2.ABI::class)
@Signature("{469e6d36-2e11-5b06-9e0a-c5eef0cf8f12}")
@Guid("469e6d362e115b069e0ac5eef0cf8f12")
@WinRTInterface("469e6d362e115b069e0ac5eef0cf8f12")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IApplication2.ByReference::class)
public interface IApplication2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_ResourceManagerRequested(handler: TypedEventHandler<IUnknown?,
      ResourceManagerRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_ResourceManagerRequested(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IApplication2>
      {
    public override fun getValue() = ABI.makeIApplication2(pointer.getPointer(0))

    public fun setValue(value: IApplication2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IApplication2 {
    public val __330683735_Ptr: Pointer?

    public val _330683735_VtblPtr: Pointer?
      get() = __330683735_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_ResourceManagerRequested(handler: TypedEventHandler<IUnknown?,
        ResourceManagerRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _330683735_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__330683735_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_ResourceManagerRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _330683735_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__330683735_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IApplication2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __330683735_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IApplication2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("469e6d362e115b069e0ac5eef0cf8f12")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIApplication2(ptr: Pointer?): WithDefault = IApplication2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IApplication2 {
      val address = segment.toRawLongValue()
      return makeIApplication2(Pointer(address))
    }

    public override fun toNative(obj: IApplication2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__330683735_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IApplication2): Array<IApplication2?> = (elements as
        Array<IApplication2?>).castToImpl<IApplication2,IApplication2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IApplication2?> =
        arrayOfNulls<IApplication2_Impl>(size) as Array<IApplication2?>
  }
}
