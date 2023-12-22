package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.DataTemplate
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IExpander.ABI::class)
@Signature("{ca633942-e584-55c2-b7ee-cffc73c8127a}")
@Guid("ca633942e58455c2b7eecffc73c8127a")
@WinRTInterface("ca633942e58455c2b7eecffc73c8127a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IExpander.ByReference::class)
public interface IExpander : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Header(): IUnknown?

  @InterfaceMethod(1)
  public fun put_Header(value: IUnknown?): Unit

  @InterfaceMethod(2)
  public fun get_HeaderTemplate(): DataTemplate?

  @InterfaceMethod(3)
  public fun put_HeaderTemplate(value: DataTemplate?): Unit

  @InterfaceMethod(4)
  public fun get_HeaderTemplateSelector(): DataTemplateSelector?

  @InterfaceMethod(5)
  public fun put_HeaderTemplateSelector(value: DataTemplateSelector?): Unit

  @InterfaceMethod(6)
  public fun get_IsExpanded(): Boolean

  @InterfaceMethod(7)
  public fun put_IsExpanded(value: Boolean): Unit

  @InterfaceMethod(8)
  public fun get_ExpandDirection(): ExpandDirection?

  @InterfaceMethod(9)
  public fun put_ExpandDirection(value: ExpandDirection?): Unit

  @InterfaceMethod(10)
  public fun add_Expanding(handler: TypedEventHandler<Expander?, ExpanderExpandingEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(11)
  public fun remove_Expanding(token: EventRegistrationToken?): Unit

  @InterfaceMethod(12)
  public fun add_Collapsed(handler: TypedEventHandler<Expander?, ExpanderCollapsedEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(13)
  public fun remove_Collapsed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(14)
  public fun get_TemplateSettings(): ExpanderTemplateSettings?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IExpander> {
    public override fun getValue() = ABI.makeIExpander(pointer.getPointer(0))

    public fun setValue(value: IExpander_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IExpander {
    public val __2059977614_Ptr: Pointer?

    public val _2059977614_VtblPtr: Pointer?
      get() = __2059977614_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Header(): IUnknown? {
      val fnPtr = _2059977614_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__2059977614_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Header(value: IUnknown?): Unit {
      val fnPtr = _2059977614_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2059977614_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_HeaderTemplate(): DataTemplate? {
      val fnPtr = _2059977614_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataTemplate>()
      val hr = fn.invokeHR(arrayOf(__2059977614_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataTemplate>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_HeaderTemplate(value: DataTemplate?): Unit {
      val fnPtr = _2059977614_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2059977614_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_HeaderTemplateSelector(): DataTemplateSelector? {
      val fnPtr = _2059977614_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataTemplateSelector>()
      val hr = fn.invokeHR(arrayOf(__2059977614_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataTemplateSelector>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_HeaderTemplateSelector(value: DataTemplateSelector?): Unit {
      val fnPtr = _2059977614_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2059977614_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_IsExpanded(): Boolean {
      val fnPtr = _2059977614_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2059977614_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_IsExpanded(value: Boolean): Unit {
      val fnPtr = _2059977614_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2059977614_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_ExpandDirection(): ExpandDirection? {
      val fnPtr = _2059977614_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ExpandDirection>()
      val hr = fn.invokeHR(arrayOf(__2059977614_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ExpandDirection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_ExpandDirection(value: ExpandDirection?): Unit {
      val fnPtr = _2059977614_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2059977614_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun add_Expanding(handler: TypedEventHandler<Expander?,
        ExpanderExpandingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _2059977614_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2059977614_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun remove_Expanding(token: EventRegistrationToken?): Unit {
      val fnPtr = _2059977614_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2059977614_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun add_Collapsed(handler: TypedEventHandler<Expander?,
        ExpanderCollapsedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _2059977614_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2059977614_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun remove_Collapsed(token: EventRegistrationToken?): Unit {
      val fnPtr = _2059977614_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2059977614_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_TemplateSettings(): ExpanderTemplateSettings? {
      val fnPtr = _2059977614_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ExpanderTemplateSettings>()
      val hr = fn.invokeHR(arrayOf(__2059977614_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ExpanderTemplateSettings>(result.getValue())
      return resultValue
    }
  }

  public class IExpander_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2059977614_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IExpander, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ca633942e58455c2b7eecffc73c8127a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIExpander(ptr: Pointer?): WithDefault = IExpander_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IExpander {
      val address = segment.toRawLongValue()
      return makeIExpander(Pointer(address))
    }

    public override fun toNative(obj: IExpander): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2059977614_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IExpander): Array<IExpander?> = (elements as
        Array<IExpander?>).castToImpl<IExpander,IExpander_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IExpander?> = arrayOfNulls<IExpander_Impl>(size)
        as Array<IExpander?>
  }
}
