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

@ABIMarker(IImageIconSourceStatics.ABI::class)
@Signature("{3aae805c-c128-5f0d-ae43-1b158891a1dd}")
@Guid("3aae805cc1285f0dae431b158891a1dd")
@WinRTInterface("3aae805cc1285f0dae431b158891a1dd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IImageIconSourceStatics.ByReference::class)
public interface IImageIconSourceStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ImageSourceProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IImageIconSourceStatics> {
    public override fun getValue() = ABI.makeIImageIconSourceStatics(pointer.getPointer(0))

    public fun setValue(value: IImageIconSourceStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IImageIconSourceStatics {
    public val __1529672093_Ptr: Pointer?

    public val _1529672093_VtblPtr: Pointer?
      get() = __1529672093_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ImageSourceProperty(): DependencyProperty? {
      val fnPtr = _1529672093_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1529672093_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IImageIconSourceStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1529672093_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IImageIconSourceStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3aae805cc1285f0dae431b158891a1dd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIImageIconSourceStatics(ptr: Pointer?): WithDefault =
        IImageIconSourceStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IImageIconSourceStatics {
      val address = segment.toRawLongValue()
      return makeIImageIconSourceStatics(Pointer(address))
    }

    public override fun toNative(obj: IImageIconSourceStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1529672093_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IImageIconSourceStatics): Array<IImageIconSourceStatics?>
        = (elements as
        Array<IImageIconSourceStatics?>).castToImpl<IImageIconSourceStatics,IImageIconSourceStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IImageIconSourceStatics?> =
        arrayOfNulls<IImageIconSourceStatics_Impl>(size) as Array<IImageIconSourceStatics?>
  }
}
