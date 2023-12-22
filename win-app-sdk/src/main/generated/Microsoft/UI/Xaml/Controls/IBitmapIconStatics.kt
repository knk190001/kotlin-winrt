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

@ABIMarker(IBitmapIconStatics.ABI::class)
@Signature("{01c67eb2-327e-5c4e-afb4-38b02ed12886}")
@Guid("01c67eb2327e5c4eafb438b02ed12886")
@WinRTInterface("01c67eb2327e5c4eafb438b02ed12886")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBitmapIconStatics.ByReference::class)
public interface IBitmapIconStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_UriSourceProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_ShowAsMonochromeProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBitmapIconStatics> {
    public override fun getValue() = ABI.makeIBitmapIconStatics(pointer.getPointer(0))

    public fun setValue(value: IBitmapIconStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBitmapIconStatics {
    public val __246014602_Ptr: Pointer?

    public val _246014602_VtblPtr: Pointer?
      get() = __246014602_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_UriSourceProperty(): DependencyProperty? {
      val fnPtr = _246014602_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__246014602_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ShowAsMonochromeProperty(): DependencyProperty? {
      val fnPtr = _246014602_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__246014602_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IBitmapIconStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __246014602_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBitmapIconStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("01c67eb2327e5c4eafb438b02ed12886")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBitmapIconStatics(ptr: Pointer?): WithDefault = IBitmapIconStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBitmapIconStatics {
      val address = segment.toRawLongValue()
      return makeIBitmapIconStatics(Pointer(address))
    }

    public override fun toNative(obj: IBitmapIconStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__246014602_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBitmapIconStatics): Array<IBitmapIconStatics?> =
        (elements as
        Array<IBitmapIconStatics?>).castToImpl<IBitmapIconStatics,IBitmapIconStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBitmapIconStatics?> =
        arrayOfNulls<IBitmapIconStatics_Impl>(size) as Array<IBitmapIconStatics?>
  }
}
