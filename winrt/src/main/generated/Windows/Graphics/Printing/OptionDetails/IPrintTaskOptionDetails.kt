package Windows.Graphics.Printing.OptionDetails

import Windows.Foundation.Collections.IMapView
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPrintTaskOptionDetails.ABI::class)
@Signature("{f5720af1-a89e-42a6-81af-f8e010b38a68}")
@Guid("f5720af1a89e42a681aff8e010b38a68")
@WinRTInterface("f5720af1a89e42a681aff8e010b38a68")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintTaskOptionDetails.ByReference::class)
public interface IPrintTaskOptionDetails : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Options(): IMapView<String?, IPrintOptionDetails?>?

  @InterfaceMethod(1)
  public fun CreateItemListOption(optionId: String?, displayName: String?):
      PrintCustomItemListOptionDetails?

  @InterfaceMethod(2)
  public fun CreateTextOption(optionId: String?, displayName: String?):
      PrintCustomTextOptionDetails?

  @InterfaceMethod(3)
  public fun add_OptionChanged(eventHandler: TypedEventHandler<PrintTaskOptionDetails?,
      PrintTaskOptionChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(4)
  public fun remove_OptionChanged(eventCookie: EventRegistrationToken?): Unit

  @InterfaceMethod(5)
  public fun add_BeginValidation(eventHandler: TypedEventHandler<PrintTaskOptionDetails?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(6)
  public fun remove_BeginValidation(eventCookie: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintTaskOptionDetails> {
    public override fun getValue() = ABI.makeIPrintTaskOptionDetails(pointer.getPointer(0))

    public fun setValue(value: IPrintTaskOptionDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintTaskOptionDetails {
    public val __1596620408_Ptr: Pointer?

    public val _1596620408_VtblPtr: Pointer?
      get() = __1596620408_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Options(): IMapView<String?, IPrintOptionDetails?>? {
      val fnPtr = _1596620408_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMapView<String?, IPrintOptionDetails?>>()
      val hr = fn.invokeHR(arrayOf(__1596620408_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMapView<String?,
          IPrintOptionDetails?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateItemListOption(optionId: String?, displayName: String?):
        PrintCustomItemListOptionDetails? {
      val fnPtr = _1596620408_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintCustomItemListOptionDetails>()
      val hr = fn.invokeHR(arrayOf(__1596620408_Ptr, marshalToNative(optionId),
          marshalToNative(displayName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintCustomItemListOptionDetails>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateTextOption(optionId: String?, displayName: String?):
        PrintCustomTextOptionDetails? {
      val fnPtr = _1596620408_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintCustomTextOptionDetails>()
      val hr = fn.invokeHR(arrayOf(__1596620408_Ptr, marshalToNative(optionId),
          marshalToNative(displayName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintCustomTextOptionDetails>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun add_OptionChanged(eventHandler: TypedEventHandler<PrintTaskOptionDetails?,
        PrintTaskOptionChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1596620408_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1596620408_Ptr, marshalToNative(eventHandler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun remove_OptionChanged(eventCookie: EventRegistrationToken?): Unit {
      val fnPtr = _1596620408_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1596620408_Ptr, marshalToNative(eventCookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun add_BeginValidation(eventHandler: TypedEventHandler<PrintTaskOptionDetails?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1596620408_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1596620408_Ptr, marshalToNative(eventHandler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun remove_BeginValidation(eventCookie: EventRegistrationToken?): Unit {
      val fnPtr = _1596620408_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1596620408_Ptr, marshalToNative(eventCookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPrintTaskOptionDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1596620408_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintTaskOptionDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f5720af1a89e42a681aff8e010b38a68")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintTaskOptionDetails(ptr: Pointer?): WithDefault =
        IPrintTaskOptionDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrintTaskOptionDetails {
      val address = segment.toRawLongValue()
      return makeIPrintTaskOptionDetails(Pointer(address))
    }

    public override fun toNative(obj: IPrintTaskOptionDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1596620408_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintTaskOptionDetails): Array<IPrintTaskOptionDetails?>
        = (elements as
        Array<IPrintTaskOptionDetails?>).castToImpl<IPrintTaskOptionDetails,IPrintTaskOptionDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintTaskOptionDetails?> =
        arrayOfNulls<IPrintTaskOptionDetails_Impl>(size) as Array<IPrintTaskOptionDetails?>
  }
}
