package Windows.UI.Xaml.Documents

import Windows.UI.Xaml.XamlRoot
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

@ABIMarker(ITextElement5.ABI::class)
@Signature("{bd9552f3-540d-58bf-b6a8-07556aeda2ea}")
@Guid("bd9552f3540d58bfb6a807556aeda2ea")
@WinRTInterface("bd9552f3540d58bfb6a807556aeda2ea")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITextElement5.ByReference::class)
public interface ITextElement5 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_XamlRoot(): XamlRoot?

  @InterfaceMethod(1)
  public fun put_XamlRoot(value: XamlRoot?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ITextElement5>
      {
    public override fun getValue() = ABI.makeITextElement5(pointer.getPointer(0))

    public fun setValue(value: ITextElement5_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITextElement5 {
    public val __791160622_Ptr: Pointer?

    public val _791160622_VtblPtr: Pointer?
      get() = __791160622_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_XamlRoot(): XamlRoot? {
      val fnPtr = _791160622_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XamlRoot>()
      val hr = fn.invokeHR(arrayOf(__791160622_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XamlRoot>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_XamlRoot(value: XamlRoot?): Unit {
      val fnPtr = _791160622_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__791160622_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ITextElement5_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __791160622_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITextElement5, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bd9552f3540d58bfb6a807556aeda2ea")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITextElement5(ptr: Pointer?): WithDefault = ITextElement5_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITextElement5 {
      val address = segment.toRawLongValue()
      return makeITextElement5(Pointer(address))
    }

    public override fun toNative(obj: ITextElement5): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__791160622_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITextElement5): Array<ITextElement5?> = (elements as
        Array<ITextElement5?>).castToImpl<ITextElement5,ITextElement5_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextElement5?> =
        arrayOfNulls<ITextElement5_Impl>(size) as Array<ITextElement5?>
  }
}
