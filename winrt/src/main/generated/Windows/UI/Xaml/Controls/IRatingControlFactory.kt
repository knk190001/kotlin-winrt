package Windows.UI.Xaml.Controls

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

@ABIMarker(IRatingControlFactory.ABI::class)
@Signature("{18d81716-c542-4ccb-b347-5e62c5db782e}")
@Guid("18d81716c5424ccbb3475e62c5db782e")
@WinRTInterface("18d81716c5424ccbb3475e62c5db782e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRatingControlFactory.ByReference::class)
public interface IRatingControlFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): RatingControl?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRatingControlFactory> {
    public override fun getValue() = ABI.makeIRatingControlFactory(pointer.getPointer(0))

    public fun setValue(value: IRatingControlFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRatingControlFactory {
    public val __1004261882_Ptr: Pointer?

    public val _1004261882_VtblPtr: Pointer?
      get() = __1004261882_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        RatingControl? {
      val fnPtr = _1004261882_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RatingControl>()
      val hr = fn.invokeHR(arrayOf(__1004261882_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RatingControl>(result.getValue())
      return resultValue
    }
  }

  public class IRatingControlFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1004261882_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRatingControlFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("18d81716c5424ccbb3475e62c5db782e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRatingControlFactory(ptr: Pointer?): WithDefault =
        IRatingControlFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRatingControlFactory {
      val address = segment.toRawLongValue()
      return makeIRatingControlFactory(Pointer(address))
    }

    public override fun toNative(obj: IRatingControlFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1004261882_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRatingControlFactory): Array<IRatingControlFactory?> =
        (elements as
        Array<IRatingControlFactory?>).castToImpl<IRatingControlFactory,IRatingControlFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRatingControlFactory?> =
        arrayOfNulls<IRatingControlFactory_Impl>(size) as Array<IRatingControlFactory?>
  }
}
