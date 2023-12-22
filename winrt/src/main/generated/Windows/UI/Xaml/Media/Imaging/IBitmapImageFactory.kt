package Windows.UI.Xaml.Media.Imaging

import Windows.Foundation.Uri
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

@ABIMarker(IBitmapImageFactory.ABI::class)
@Signature("{c9132978-4810-4e5e-8087-03671ee60d85}")
@Guid("c913297848104e5e808703671ee60d85")
@WinRTInterface("c913297848104e5e808703671ee60d85")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBitmapImageFactory.ByReference::class)
public interface IBitmapImageFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithUriSource(uriSource: Uri?): BitmapImage?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBitmapImageFactory> {
    public override fun getValue() = ABI.makeIBitmapImageFactory(pointer.getPointer(0))

    public fun setValue(value: IBitmapImageFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBitmapImageFactory {
    public val __206567824_Ptr: Pointer?

    public val _206567824_VtblPtr: Pointer?
      get() = __206567824_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithUriSource(uriSource: Uri?): BitmapImage? {
      val fnPtr = _206567824_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BitmapImage>()
      val hr = fn.invokeHR(arrayOf(__206567824_Ptr, marshalToNative(uriSource), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BitmapImage>(result.getValue())
      return resultValue
    }
  }

  public class IBitmapImageFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __206567824_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBitmapImageFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c913297848104e5e808703671ee60d85")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBitmapImageFactory(ptr: Pointer?): WithDefault = IBitmapImageFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBitmapImageFactory {
      val address = segment.toRawLongValue()
      return makeIBitmapImageFactory(Pointer(address))
    }

    public override fun toNative(obj: IBitmapImageFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__206567824_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBitmapImageFactory): Array<IBitmapImageFactory?> =
        (elements as
        Array<IBitmapImageFactory?>).castToImpl<IBitmapImageFactory,IBitmapImageFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBitmapImageFactory?> =
        arrayOfNulls<IBitmapImageFactory_Impl>(size) as Array<IBitmapImageFactory?>
  }
}
