package Windows.UI.Xaml.Input

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IKeyRoutedEventArgs3.ABI::class)
@Signature("{2779f5b4-ca41-411b-a8ef-f4fc78e78057}")
@Guid("2779f5b4ca41411ba8eff4fc78e78057")
@WinRTInterface("2779f5b4ca41411ba8eff4fc78e78057")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IKeyRoutedEventArgs3.ByReference::class)
public interface IKeyRoutedEventArgs3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DeviceId(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IKeyRoutedEventArgs3> {
    public override fun getValue() = ABI.makeIKeyRoutedEventArgs3(pointer.getPointer(0))

    public fun setValue(value: IKeyRoutedEventArgs3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IKeyRoutedEventArgs3 {
    public val __116461568_Ptr: Pointer?

    public val _116461568_VtblPtr: Pointer?
      get() = __116461568_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DeviceId(): String? {
      val fnPtr = _116461568_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__116461568_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IKeyRoutedEventArgs3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __116461568_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IKeyRoutedEventArgs3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2779f5b4ca41411ba8eff4fc78e78057")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIKeyRoutedEventArgs3(ptr: Pointer?): WithDefault = IKeyRoutedEventArgs3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IKeyRoutedEventArgs3 {
      val address = segment.toRawLongValue()
      return makeIKeyRoutedEventArgs3(Pointer(address))
    }

    public override fun toNative(obj: IKeyRoutedEventArgs3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__116461568_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IKeyRoutedEventArgs3): Array<IKeyRoutedEventArgs3?> =
        (elements as
        Array<IKeyRoutedEventArgs3?>).castToImpl<IKeyRoutedEventArgs3,IKeyRoutedEventArgs3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IKeyRoutedEventArgs3?> =
        arrayOfNulls<IKeyRoutedEventArgs3_Impl>(size) as Array<IKeyRoutedEventArgs3?>
  }
}
