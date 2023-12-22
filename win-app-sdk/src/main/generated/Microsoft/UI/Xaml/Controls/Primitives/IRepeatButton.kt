package Microsoft.UI.Xaml.Controls.Primitives

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

@ABIMarker(IRepeatButton.ABI::class)
@Signature("{97f4c728-4a94-56b5-91e4-e7c6f6a1251a}")
@Guid("97f4c7284a9456b591e4e7c6f6a1251a")
@WinRTInterface("97f4c7284a9456b591e4e7c6f6a1251a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRepeatButton.ByReference::class)
public interface IRepeatButton : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Delay(): Int

  @InterfaceMethod(1)
  public fun put_Delay(value: Int): Unit

  @InterfaceMethod(2)
  public fun get_Interval(): Int

  @InterfaceMethod(3)
  public fun put_Interval(value: Int): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IRepeatButton>
      {
    public override fun getValue() = ABI.makeIRepeatButton(pointer.getPointer(0))

    public fun setValue(value: IRepeatButton_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRepeatButton {
    public val __718643070_Ptr: Pointer?

    public val _718643070_VtblPtr: Pointer?
      get() = __718643070_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Delay(): Int {
      val fnPtr = _718643070_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__718643070_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Delay(value: Int): Unit {
      val fnPtr = _718643070_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__718643070_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Interval(): Int {
      val fnPtr = _718643070_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__718643070_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_Interval(value: Int): Unit {
      val fnPtr = _718643070_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__718643070_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IRepeatButton_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __718643070_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRepeatButton, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("97f4c7284a9456b591e4e7c6f6a1251a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRepeatButton(ptr: Pointer?): WithDefault = IRepeatButton_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRepeatButton {
      val address = segment.toRawLongValue()
      return makeIRepeatButton(Pointer(address))
    }

    public override fun toNative(obj: IRepeatButton): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__718643070_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRepeatButton): Array<IRepeatButton?> = (elements as
        Array<IRepeatButton?>).castToImpl<IRepeatButton,IRepeatButton_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRepeatButton?> =
        arrayOfNulls<IRepeatButton_Impl>(size) as Array<IRepeatButton?>
  }
}
