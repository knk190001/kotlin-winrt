package Microsoft.UI.Xaml.Controls

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IRatingItemFontInfoFactory.ABI::class)
@Signature("{109c6541-706e-5fd7-baae-020b24899f61}")
@Guid("109c6541706e5fd7baae020b24899f61")
@WinRTInterface("109c6541706e5fd7baae020b24899f61")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRatingItemFontInfoFactory.ByReference::class)
public interface IRatingItemFontInfoFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
      RatingItemFontInfo?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRatingItemFontInfoFactory> {
    public override fun getValue() = ABI.makeIRatingItemFontInfoFactory(pointer.getPointer(0))

    public fun setValue(value: IRatingItemFontInfoFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRatingItemFontInfoFactory {
    public val __873382826_Ptr: Pointer?

    public val _873382826_VtblPtr: Pointer?
      get() = __873382826_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        RatingItemFontInfo? {
      val fnPtr = _873382826_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RatingItemFontInfo>()
      val hr = fn.invokeHR(arrayOf(__873382826_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RatingItemFontInfo>(result.getValue())
      return resultValue
    }
  }

  public class IRatingItemFontInfoFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __873382826_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRatingItemFontInfoFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("109c6541706e5fd7baae020b24899f61")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRatingItemFontInfoFactory(ptr: Pointer?): WithDefault =
        IRatingItemFontInfoFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRatingItemFontInfoFactory {
      val address = segment.toRawLongValue()
      return makeIRatingItemFontInfoFactory(Pointer(address))
    }

    public override fun toNative(obj: IRatingItemFontInfoFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__873382826_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRatingItemFontInfoFactory):
        Array<IRatingItemFontInfoFactory?> = (elements as
        Array<IRatingItemFontInfoFactory?>).castToImpl<IRatingItemFontInfoFactory,IRatingItemFontInfoFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRatingItemFontInfoFactory?> =
        arrayOfNulls<IRatingItemFontInfoFactory_Impl>(size) as Array<IRatingItemFontInfoFactory?>
  }
}
