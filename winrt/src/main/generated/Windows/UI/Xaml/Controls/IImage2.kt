package Windows.UI.Xaml.Controls

import Windows.Media.Casting.CastingSource
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

@ABIMarker(IImage2.ABI::class)
@Signature("{f445119e-881f-48bb-873a-64417ca4f002}")
@Guid("f445119e881f48bb873a64417ca4f002")
@WinRTInterface("f445119e881f48bb873a64417ca4f002")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IImage2.ByReference::class)
public interface IImage2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetAsCastingSource(): CastingSource?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IImage2> {
    public override fun getValue() = ABI.makeIImage2(pointer.getPointer(0))

    public fun setValue(value: IImage2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IImage2 {
    public val __449993043_Ptr: Pointer?

    public val _449993043_VtblPtr: Pointer?
      get() = __449993043_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetAsCastingSource(): CastingSource? {
      val fnPtr = _449993043_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CastingSource>()
      val hr = fn.invokeHR(arrayOf(__449993043_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CastingSource>(result.getValue())
      return resultValue
    }
  }

  public class IImage2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __449993043_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IImage2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f445119e881f48bb873a64417ca4f002")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIImage2(ptr: Pointer?): WithDefault = IImage2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IImage2 {
      val address = segment.toRawLongValue()
      return makeIImage2(Pointer(address))
    }

    public override fun toNative(obj: IImage2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__449993043_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IImage2): Array<IImage2?> = (elements as
        Array<IImage2?>).castToImpl<IImage2,IImage2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IImage2?> = arrayOfNulls<IImage2_Impl>(size) as
        Array<IImage2?>
  }
}
