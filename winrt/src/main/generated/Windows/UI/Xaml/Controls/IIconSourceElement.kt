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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IIconSourceElement.ABI::class)
@Signature("{d7a64502-ddda-55cd-b4c9-e79abc8b0ea4}")
@Guid("d7a64502ddda55cdb4c9e79abc8b0ea4")
@WinRTInterface("d7a64502ddda55cdb4c9e79abc8b0ea4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IIconSourceElement.ByReference::class)
public interface IIconSourceElement : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IconSource(): IconSource?

  @InterfaceMethod(1)
  public fun put_IconSource(value: IconSource?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IIconSourceElement> {
    public override fun getValue() = ABI.makeIIconSourceElement(pointer.getPointer(0))

    public fun setValue(value: IIconSourceElement_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IIconSourceElement {
    public val __237218252_Ptr: Pointer?

    public val _237218252_VtblPtr: Pointer?
      get() = __237218252_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IconSource(): IconSource? {
      val fnPtr = _237218252_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IconSource>()
      val hr = fn.invokeHR(arrayOf(__237218252_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IconSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_IconSource(value: IconSource?): Unit {
      val fnPtr = _237218252_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__237218252_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IIconSourceElement_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __237218252_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IIconSourceElement, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d7a64502ddda55cdb4c9e79abc8b0ea4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIIconSourceElement(ptr: Pointer?): WithDefault = IIconSourceElement_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IIconSourceElement {
      val address = segment.toRawLongValue()
      return makeIIconSourceElement(Pointer(address))
    }

    public override fun toNative(obj: IIconSourceElement): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__237218252_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IIconSourceElement): Array<IIconSourceElement?> =
        (elements as
        Array<IIconSourceElement?>).castToImpl<IIconSourceElement,IIconSourceElement_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IIconSourceElement?> =
        arrayOfNulls<IIconSourceElement_Impl>(size) as Array<IIconSourceElement?>
  }
}
