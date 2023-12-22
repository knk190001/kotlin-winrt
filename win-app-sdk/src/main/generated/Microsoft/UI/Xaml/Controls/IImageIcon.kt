package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Media.ImageSource
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

@ABIMarker(IImageIcon.ABI::class)
@Signature("{78a7b526-e635-59c6-93a1-d7e3c2fac6d5}")
@Guid("78a7b526e63559c693a1d7e3c2fac6d5")
@WinRTInterface("78a7b526e63559c693a1d7e3c2fac6d5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IImageIcon.ByReference::class)
public interface IImageIcon : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Source(): ImageSource?

  @InterfaceMethod(1)
  public fun put_Source(value: ImageSource?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IImageIcon> {
    public override fun getValue() = ABI.makeIImageIcon(pointer.getPointer(0))

    public fun setValue(value: IImageIcon_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IImageIcon {
    public val __1461127539_Ptr: Pointer?

    public val _1461127539_VtblPtr: Pointer?
      get() = __1461127539_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Source(): ImageSource? {
      val fnPtr = _1461127539_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ImageSource>()
      val hr = fn.invokeHR(arrayOf(__1461127539_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ImageSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Source(value: ImageSource?): Unit {
      val fnPtr = _1461127539_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1461127539_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IImageIcon_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1461127539_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IImageIcon, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("78a7b526e63559c693a1d7e3c2fac6d5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIImageIcon(ptr: Pointer?): WithDefault = IImageIcon_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IImageIcon {
      val address = segment.toRawLongValue()
      return makeIImageIcon(Pointer(address))
    }

    public override fun toNative(obj: IImageIcon): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1461127539_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IImageIcon): Array<IImageIcon?> = (elements as
        Array<IImageIcon?>).castToImpl<IImageIcon,IImageIcon_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IImageIcon?> = arrayOfNulls<IImageIcon_Impl>(size)
        as Array<IImageIcon?>
  }
}
