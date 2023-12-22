package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Media.Brush
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

@ABIMarker(IIconElement.ABI::class)
@Signature("{9af0803b-d04c-467a-bbd5-9b81f02d9a56}")
@Guid("9af0803bd04c467abbd59b81f02d9a56")
@WinRTInterface("9af0803bd04c467abbd59b81f02d9a56")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IIconElement.ByReference::class)
public interface IIconElement : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Foreground(): Brush?

  @InterfaceMethod(1)
  public fun put_Foreground(value: Brush?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IIconElement> {
    public override fun getValue() = ABI.makeIIconElement(pointer.getPointer(0))

    public fun setValue(value: IIconElement_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IIconElement {
    public val __2036034215_Ptr: Pointer?

    public val _2036034215_VtblPtr: Pointer?
      get() = __2036034215_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Foreground(): Brush? {
      val fnPtr = _2036034215_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__2036034215_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Foreground(value: Brush?): Unit {
      val fnPtr = _2036034215_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2036034215_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IIconElement_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2036034215_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IIconElement, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9af0803bd04c467abbd59b81f02d9a56")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIIconElement(ptr: Pointer?): WithDefault = IIconElement_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IIconElement {
      val address = segment.toRawLongValue()
      return makeIIconElement(Pointer(address))
    }

    public override fun toNative(obj: IIconElement): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2036034215_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IIconElement): Array<IIconElement?> = (elements as
        Array<IIconElement?>).castToImpl<IIconElement,IIconElement_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IIconElement?> =
        arrayOfNulls<IIconElement_Impl>(size) as Array<IIconElement?>
  }
}
