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

@ABIMarker(IImageIconStatics.ABI::class)
@Signature("{6bd31828-f8f9-5d86-80d5-e7423546da7d}")
@Guid("6bd31828f8f95d8680d5e7423546da7d")
@WinRTInterface("6bd31828f8f95d8680d5e7423546da7d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IImageIconStatics.ByReference::class)
public interface IImageIconStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SourceProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IImageIconStatics> {
    public override fun getValue() = ABI.makeIImageIconStatics(pointer.getPointer(0))

    public fun setValue(value: IImageIconStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IImageIconStatics {
    public val __1939826568_Ptr: Pointer?

    public val _1939826568_VtblPtr: Pointer?
      get() = __1939826568_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SourceProperty(): DependencyProperty? {
      val fnPtr = _1939826568_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1939826568_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IImageIconStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1939826568_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IImageIconStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6bd31828f8f95d8680d5e7423546da7d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIImageIconStatics(ptr: Pointer?): WithDefault = IImageIconStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IImageIconStatics {
      val address = segment.toRawLongValue()
      return makeIImageIconStatics(Pointer(address))
    }

    public override fun toNative(obj: IImageIconStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1939826568_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IImageIconStatics): Array<IImageIconStatics?> = (elements
        as Array<IImageIconStatics?>).castToImpl<IImageIconStatics,IImageIconStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IImageIconStatics?> =
        arrayOfNulls<IImageIconStatics_Impl>(size) as Array<IImageIconStatics?>
  }
}
