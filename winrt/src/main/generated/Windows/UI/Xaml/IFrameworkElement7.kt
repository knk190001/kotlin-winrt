package Windows.UI.Xaml

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

@ABIMarker(IFrameworkElement7.ABI::class)
@Signature("{2263886c-c069-570f-b9cc-9e21dd028d8e}")
@Guid("2263886cc069570fb9cc9e21dd028d8e")
@WinRTInterface("2263886cc069570fb9cc9e21dd028d8e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFrameworkElement7.ByReference::class)
public interface IFrameworkElement7 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsLoaded(): Boolean

  @InterfaceMethod(1)
  public fun add_EffectiveViewportChanged(handler: TypedEventHandler<FrameworkElement?,
      EffectiveViewportChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(2)
  public fun remove_EffectiveViewportChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFrameworkElement7> {
    public override fun getValue() = ABI.makeIFrameworkElement7(pointer.getPointer(0))

    public fun setValue(value: IFrameworkElement7_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFrameworkElement7 {
    public val __329359559_Ptr: Pointer?

    public val _329359559_VtblPtr: Pointer?
      get() = __329359559_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsLoaded(): Boolean {
      val fnPtr = _329359559_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__329359559_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun add_EffectiveViewportChanged(handler: TypedEventHandler<FrameworkElement?,
        EffectiveViewportChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _329359559_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__329359559_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun remove_EffectiveViewportChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _329359559_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__329359559_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IFrameworkElement7_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __329359559_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFrameworkElement7, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2263886cc069570fb9cc9e21dd028d8e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFrameworkElement7(ptr: Pointer?): WithDefault = IFrameworkElement7_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFrameworkElement7 {
      val address = segment.toRawLongValue()
      return makeIFrameworkElement7(Pointer(address))
    }

    public override fun toNative(obj: IFrameworkElement7): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__329359559_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFrameworkElement7): Array<IFrameworkElement7?> =
        (elements as
        Array<IFrameworkElement7?>).castToImpl<IFrameworkElement7,IFrameworkElement7_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFrameworkElement7?> =
        arrayOfNulls<IFrameworkElement7_Impl>(size) as Array<IFrameworkElement7?>
  }
}
