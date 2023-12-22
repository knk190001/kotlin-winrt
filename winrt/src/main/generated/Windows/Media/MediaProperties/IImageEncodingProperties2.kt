package Windows.Media.MediaProperties

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

@ABIMarker(IImageEncodingProperties2.ABI::class)
@Signature("{c854a2df-c923-469b-ac8e-6a9f3c1cd9e3}")
@Guid("c854a2dfc923469bac8e6a9f3c1cd9e3")
@WinRTInterface("c854a2dfc923469bac8e6a9f3c1cd9e3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IImageEncodingProperties2.ByReference::class)
public interface IImageEncodingProperties2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Copy(): ImageEncodingProperties?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IImageEncodingProperties2> {
    public override fun getValue() = ABI.makeIImageEncodingProperties2(pointer.getPointer(0))

    public fun setValue(value: IImageEncodingProperties2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IImageEncodingProperties2 {
    public val __1409640520_Ptr: Pointer?

    public val _1409640520_VtblPtr: Pointer?
      get() = __1409640520_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Copy(): ImageEncodingProperties? {
      val fnPtr = _1409640520_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ImageEncodingProperties>()
      val hr = fn.invokeHR(arrayOf(__1409640520_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ImageEncodingProperties>(result.getValue())
      return resultValue
    }
  }

  public class IImageEncodingProperties2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1409640520_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IImageEncodingProperties2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c854a2dfc923469bac8e6a9f3c1cd9e3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIImageEncodingProperties2(ptr: Pointer?): WithDefault =
        IImageEncodingProperties2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IImageEncodingProperties2 {
      val address = segment.toRawLongValue()
      return makeIImageEncodingProperties2(Pointer(address))
    }

    public override fun toNative(obj: IImageEncodingProperties2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1409640520_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IImageEncodingProperties2):
        Array<IImageEncodingProperties2?> = (elements as
        Array<IImageEncodingProperties2?>).castToImpl<IImageEncodingProperties2,IImageEncodingProperties2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IImageEncodingProperties2?> =
        arrayOfNulls<IImageEncodingProperties2_Impl>(size) as Array<IImageEncodingProperties2?>
  }
}
