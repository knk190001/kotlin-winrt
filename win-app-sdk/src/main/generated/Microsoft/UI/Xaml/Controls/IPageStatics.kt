package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.DependencyProperty
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

@ABIMarker(IPageStatics.ABI::class)
@Signature("{b6241486-a374-5d09-a01f-9abe311c0884}")
@Guid("b6241486a3745d09a01f9abe311c0884")
@WinRTInterface("b6241486a3745d09a01f9abe311c0884")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPageStatics.ByReference::class)
public interface IPageStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FrameProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_TopAppBarProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_BottomAppBarProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPageStatics> {
    public override fun getValue() = ABI.makeIPageStatics(pointer.getPointer(0))

    public fun setValue(value: IPageStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPageStatics {
    public val __331110897_Ptr: Pointer?

    public val _331110897_VtblPtr: Pointer?
      get() = __331110897_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FrameProperty(): DependencyProperty? {
      val fnPtr = _331110897_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__331110897_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_TopAppBarProperty(): DependencyProperty? {
      val fnPtr = _331110897_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__331110897_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_BottomAppBarProperty(): DependencyProperty? {
      val fnPtr = _331110897_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__331110897_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IPageStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __331110897_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPageStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b6241486a3745d09a01f9abe311c0884")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPageStatics(ptr: Pointer?): WithDefault = IPageStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPageStatics {
      val address = segment.toRawLongValue()
      return makeIPageStatics(Pointer(address))
    }

    public override fun toNative(obj: IPageStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__331110897_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPageStatics): Array<IPageStatics?> = (elements as
        Array<IPageStatics?>).castToImpl<IPageStatics,IPageStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPageStatics?> =
        arrayOfNulls<IPageStatics_Impl>(size) as Array<IPageStatics?>
  }
}
