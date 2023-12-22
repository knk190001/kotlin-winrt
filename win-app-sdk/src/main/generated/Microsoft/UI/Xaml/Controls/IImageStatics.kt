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

@ABIMarker(IImageStatics.ABI::class)
@Signature("{cb5378a8-996b-547e-9c4c-7bbfd9dbe7dc}")
@Guid("cb5378a8996b547e9c4c7bbfd9dbe7dc")
@WinRTInterface("cb5378a8996b547e9c4c7bbfd9dbe7dc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IImageStatics.ByReference::class)
public interface IImageStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SourceProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_StretchProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_NineGridProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IImageStatics>
      {
    public override fun getValue() = ABI.makeIImageStatics(pointer.getPointer(0))

    public fun setValue(value: IImageStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IImageStatics {
    public val __1802181937_Ptr: Pointer?

    public val _1802181937_VtblPtr: Pointer?
      get() = __1802181937_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SourceProperty(): DependencyProperty? {
      val fnPtr = _1802181937_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1802181937_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_StretchProperty(): DependencyProperty? {
      val fnPtr = _1802181937_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1802181937_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_NineGridProperty(): DependencyProperty? {
      val fnPtr = _1802181937_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1802181937_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IImageStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1802181937_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IImageStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cb5378a8996b547e9c4c7bbfd9dbe7dc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIImageStatics(ptr: Pointer?): WithDefault = IImageStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IImageStatics {
      val address = segment.toRawLongValue()
      return makeIImageStatics(Pointer(address))
    }

    public override fun toNative(obj: IImageStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1802181937_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IImageStatics): Array<IImageStatics?> = (elements as
        Array<IImageStatics?>).castToImpl<IImageStatics,IImageStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IImageStatics?> =
        arrayOfNulls<IImageStatics_Impl>(size) as Array<IImageStatics?>
  }
}
