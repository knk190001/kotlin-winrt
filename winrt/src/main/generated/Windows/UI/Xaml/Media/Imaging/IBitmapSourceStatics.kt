package Windows.UI.Xaml.Media.Imaging

import Windows.UI.Xaml.DependencyProperty
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

@ABIMarker(IBitmapSourceStatics.ABI::class)
@Signature("{9a9c9981-827b-4e51-891b-8a15b511842d}")
@Guid("9a9c9981827b4e51891b8a15b511842d")
@WinRTInterface("9a9c9981827b4e51891b8a15b511842d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBitmapSourceStatics.ByReference::class)
public interface IBitmapSourceStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PixelWidthProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_PixelHeightProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBitmapSourceStatics> {
    public override fun getValue() = ABI.makeIBitmapSourceStatics(pointer.getPointer(0))

    public fun setValue(value: IBitmapSourceStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBitmapSourceStatics {
    public val __1493876727_Ptr: Pointer?

    public val _1493876727_VtblPtr: Pointer?
      get() = __1493876727_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PixelWidthProperty(): DependencyProperty? {
      val fnPtr = _1493876727_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1493876727_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_PixelHeightProperty(): DependencyProperty? {
      val fnPtr = _1493876727_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1493876727_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IBitmapSourceStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1493876727_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBitmapSourceStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9a9c9981827b4e51891b8a15b511842d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBitmapSourceStatics(ptr: Pointer?): WithDefault = IBitmapSourceStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBitmapSourceStatics {
      val address = segment.toRawLongValue()
      return makeIBitmapSourceStatics(Pointer(address))
    }

    public override fun toNative(obj: IBitmapSourceStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1493876727_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBitmapSourceStatics): Array<IBitmapSourceStatics?> =
        (elements as
        Array<IBitmapSourceStatics?>).castToImpl<IBitmapSourceStatics,IBitmapSourceStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBitmapSourceStatics?> =
        arrayOfNulls<IBitmapSourceStatics_Impl>(size) as Array<IBitmapSourceStatics?>
  }
}
