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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICommandBarElement.ABI::class)
@Signature("{67918e1b-f2d5-44d1-8b84-92b87f80a350}")
@Guid("67918e1bf2d544d18b8492b87f80a350")
@WinRTInterface("67918e1bf2d544d18b8492b87f80a350")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICommandBarElement.ByReference::class)
public interface ICommandBarElement : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsCompact(): Boolean

  @InterfaceMethod(1)
  public fun put_IsCompact(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICommandBarElement> {
    public override fun getValue() = ABI.makeICommandBarElement(pointer.getPointer(0))

    public fun setValue(value: ICommandBarElement_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICommandBarElement {
    public val __1747695496_Ptr: Pointer?

    public val _1747695496_VtblPtr: Pointer?
      get() = __1747695496_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsCompact(): Boolean {
      val fnPtr = _1747695496_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1747695496_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsCompact(value: Boolean): Unit {
      val fnPtr = _1747695496_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1747695496_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICommandBarElement_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1747695496_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICommandBarElement, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("67918e1bf2d544d18b8492b87f80a350")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICommandBarElement(ptr: Pointer?): WithDefault = ICommandBarElement_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICommandBarElement {
      val address = segment.toRawLongValue()
      return makeICommandBarElement(Pointer(address))
    }

    public override fun toNative(obj: ICommandBarElement): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1747695496_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICommandBarElement): Array<ICommandBarElement?> =
        (elements as
        Array<ICommandBarElement?>).castToImpl<ICommandBarElement,ICommandBarElement_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICommandBarElement?> =
        arrayOfNulls<ICommandBarElement_Impl>(size) as Array<ICommandBarElement?>
  }
}
