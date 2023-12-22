package Microsoft.UI.Xaml.Data

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(INotifyDataErrorInfo.ABI::class)
@Signature("{0ee6c2cc-273e-567d-bc0a-1dd87ee51eba}")
@Guid("0ee6c2cc273e567dbc0a1dd87ee51eba")
@WinRTInterface("0ee6c2cc273e567dbc0a1dd87ee51eba")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INotifyDataErrorInfo.ByReference::class)
public interface INotifyDataErrorInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_HasErrors(): Boolean

  @InterfaceMethod(1)
  public fun add_ErrorsChanged(handler: EventHandler<DataErrorsChangedEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(2)
  public fun remove_ErrorsChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(3)
  public fun GetErrors(propertyName: String?): IIterable<IUnknown?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INotifyDataErrorInfo> {
    public override fun getValue() = ABI.makeINotifyDataErrorInfo(pointer.getPointer(0))

    public fun setValue(value: INotifyDataErrorInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INotifyDataErrorInfo {
    public val __1257873072_Ptr: Pointer?

    public val _1257873072_VtblPtr: Pointer?
      get() = __1257873072_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_HasErrors(): Boolean {
      val fnPtr = _1257873072_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1257873072_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun add_ErrorsChanged(handler: EventHandler<DataErrorsChangedEventArgs?>?):
        EventRegistrationToken? {
      val fnPtr = _1257873072_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1257873072_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun remove_ErrorsChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1257873072_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1257873072_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun GetErrors(propertyName: String?): IIterable<IUnknown?>? {
      val fnPtr = _1257873072_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IIterable<IUnknown?>>()
      val hr = fn.invokeHR(arrayOf(__1257873072_Ptr, marshalToNative(propertyName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IIterable<IUnknown?>>(result.getValue())
      return resultValue
    }
  }

  public class INotifyDataErrorInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1257873072_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INotifyDataErrorInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0ee6c2cc273e567dbc0a1dd87ee51eba")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINotifyDataErrorInfo(ptr: Pointer?): WithDefault = INotifyDataErrorInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INotifyDataErrorInfo {
      val address = segment.toRawLongValue()
      return makeINotifyDataErrorInfo(Pointer(address))
    }

    public override fun toNative(obj: INotifyDataErrorInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1257873072_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INotifyDataErrorInfo): Array<INotifyDataErrorInfo?> =
        (elements as
        Array<INotifyDataErrorInfo?>).castToImpl<INotifyDataErrorInfo,INotifyDataErrorInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INotifyDataErrorInfo?> =
        arrayOfNulls<INotifyDataErrorInfo_Impl>(size) as Array<INotifyDataErrorInfo?>
  }
}
