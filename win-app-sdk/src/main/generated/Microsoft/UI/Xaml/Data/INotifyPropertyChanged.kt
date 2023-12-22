package Microsoft.UI.Xaml.Data

import Windows.Foundation.EventRegistrationToken
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

@ABIMarker(INotifyPropertyChanged.ABI::class)
@Signature("{90b17601-b065-586e-83d9-9adc3a695284}")
@Guid("90b17601b065586e83d99adc3a695284")
@WinRTInterface("90b17601b065586e83d99adc3a695284")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INotifyPropertyChanged.ByReference::class)
public interface INotifyPropertyChanged : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_PropertyChanged(handler: PropertyChangedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_PropertyChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INotifyPropertyChanged> {
    public override fun getValue() = ABI.makeINotifyPropertyChanged(pointer.getPointer(0))

    public fun setValue(value: INotifyPropertyChanged_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INotifyPropertyChanged {
    public val __542577373_Ptr: Pointer?

    public val _542577373_VtblPtr: Pointer?
      get() = __542577373_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_PropertyChanged(handler: PropertyChangedEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _542577373_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__542577373_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_PropertyChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _542577373_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__542577373_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class INotifyPropertyChanged_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __542577373_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INotifyPropertyChanged, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("90b17601b065586e83d99adc3a695284")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINotifyPropertyChanged(ptr: Pointer?): WithDefault =
        INotifyPropertyChanged_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INotifyPropertyChanged {
      val address = segment.toRawLongValue()
      return makeINotifyPropertyChanged(Pointer(address))
    }

    public override fun toNative(obj: INotifyPropertyChanged): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__542577373_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INotifyPropertyChanged): Array<INotifyPropertyChanged?> =
        (elements as
        Array<INotifyPropertyChanged?>).castToImpl<INotifyPropertyChanged,INotifyPropertyChanged_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INotifyPropertyChanged?> =
        arrayOfNulls<INotifyPropertyChanged_Impl>(size) as Array<INotifyPropertyChanged?>
  }
}
