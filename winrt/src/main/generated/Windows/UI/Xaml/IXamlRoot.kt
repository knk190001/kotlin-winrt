package Windows.UI.Xaml

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.Size
import Windows.Foundation.TypedEventHandler
import Windows.UI.UIContext
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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IXamlRoot.ABI::class)
@Signature("{34b50756-1696-5b6d-8e9b-c71464ccad5a}")
@Guid("34b5075616965b6d8e9bc71464ccad5a")
@WinRTInterface("34b5075616965b6d8e9bc71464ccad5a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXamlRoot.ByReference::class)
public interface IXamlRoot : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Content(): UIElement?

  @InterfaceMethod(1)
  public fun get_Size(): Size?

  @InterfaceMethod(2)
  public fun get_RasterizationScale(): Double

  @InterfaceMethod(3)
  public fun get_IsHostVisible(): Boolean

  @InterfaceMethod(4)
  public fun get_UIContext(): UIContext?

  @InterfaceMethod(5)
  public fun add_Changed(handler: TypedEventHandler<XamlRoot?, XamlRootChangedEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(6)
  public fun remove_Changed(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IXamlRoot> {
    public override fun getValue() = ABI.makeIXamlRoot(pointer.getPointer(0))

    public fun setValue(value: IXamlRoot_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXamlRoot {
    public val __531371108_Ptr: Pointer?

    public val _531371108_VtblPtr: Pointer?
      get() = __531371108_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Content(): UIElement? {
      val fnPtr = _531371108_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIElement>()
      val hr = fn.invokeHR(arrayOf(__531371108_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Size(): Size? {
      val fnPtr = _531371108_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Size>()
      val hr = fn.invokeHR(arrayOf(__531371108_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Size>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_RasterizationScale(): Double {
      val fnPtr = _531371108_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__531371108_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_IsHostVisible(): Boolean {
      val fnPtr = _531371108_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__531371108_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_UIContext(): UIContext? {
      val fnPtr = _531371108_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIContext>()
      val hr = fn.invokeHR(arrayOf(__531371108_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIContext>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun add_Changed(handler: TypedEventHandler<XamlRoot?,
        XamlRootChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _531371108_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__531371108_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun remove_Changed(token: EventRegistrationToken?): Unit {
      val fnPtr = _531371108_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__531371108_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IXamlRoot_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __531371108_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXamlRoot, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("34b5075616965b6d8e9bc71464ccad5a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXamlRoot(ptr: Pointer?): WithDefault = IXamlRoot_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IXamlRoot {
      val address = segment.toRawLongValue()
      return makeIXamlRoot(Pointer(address))
    }

    public override fun toNative(obj: IXamlRoot): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__531371108_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXamlRoot): Array<IXamlRoot?> = (elements as
        Array<IXamlRoot?>).castToImpl<IXamlRoot,IXamlRoot_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXamlRoot?> = arrayOfNulls<IXamlRoot_Impl>(size)
        as Array<IXamlRoot?>
  }
}
