package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Interop.TypeName
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

@ABIMarker(INavigate.ABI::class)
@Signature("{bf2195a9-f4ea-4336-977c-f8fcf78b0d9e}")
@Guid("bf2195a9f4ea4336977cf8fcf78b0d9e")
@WinRTInterface("bf2195a9f4ea4336977cf8fcf78b0d9e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INavigate.ByReference::class)
public interface INavigate : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Navigate(sourcePageType: TypeName?): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<INavigate> {
    public override fun getValue() = ABI.makeINavigate(pointer.getPointer(0))

    public fun setValue(value: INavigate_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INavigate {
    public val __1613759885_Ptr: Pointer?

    public val _1613759885_VtblPtr: Pointer?
      get() = __1613759885_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Navigate(sourcePageType: TypeName?): Boolean {
      val fnPtr = _1613759885_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1613759885_Ptr, marshalToNative(sourcePageType), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class INavigate_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1613759885_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INavigate, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bf2195a9f4ea4336977cf8fcf78b0d9e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINavigate(ptr: Pointer?): WithDefault = INavigate_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INavigate {
      val address = segment.toRawLongValue()
      return makeINavigate(Pointer(address))
    }

    public override fun toNative(obj: INavigate): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1613759885_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INavigate): Array<INavigate?> = (elements as
        Array<INavigate?>).castToImpl<INavigate,INavigate_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INavigate?> = arrayOfNulls<INavigate_Impl>(size)
        as Array<INavigate?>
  }
}
