package Windows.UI.Xaml.Controls

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

@ABIMarker(IRadioButton.ABI::class)
@Signature("{325c44e0-9a03-4bf3-abd6-6fbb46c9a486}")
@Guid("325c44e09a034bf3abd66fbb46c9a486")
@WinRTInterface("325c44e09a034bf3abd66fbb46c9a486")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRadioButton.ByReference::class)
public interface IRadioButton : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_GroupName(): String?

  @InterfaceMethod(1)
  public fun put_GroupName(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IRadioButton> {
    public override fun getValue() = ABI.makeIRadioButton(pointer.getPointer(0))

    public fun setValue(value: IRadioButton_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRadioButton {
    public val __847562383_Ptr: Pointer?

    public val _847562383_VtblPtr: Pointer?
      get() = __847562383_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_GroupName(): String? {
      val fnPtr = _847562383_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__847562383_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_GroupName(value: String?): Unit {
      val fnPtr = _847562383_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__847562383_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IRadioButton_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __847562383_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRadioButton, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("325c44e09a034bf3abd66fbb46c9a486")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRadioButton(ptr: Pointer?): WithDefault = IRadioButton_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRadioButton {
      val address = segment.toRawLongValue()
      return makeIRadioButton(Pointer(address))
    }

    public override fun toNative(obj: IRadioButton): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__847562383_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRadioButton): Array<IRadioButton?> = (elements as
        Array<IRadioButton?>).castToImpl<IRadioButton,IRadioButton_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRadioButton?> =
        arrayOfNulls<IRadioButton_Impl>(size) as Array<IRadioButton?>
  }
}
