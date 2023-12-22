package Windows.System.Profile

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IVectorView
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAppApplicabilityStatics.ABI::class)
@Signature("{1664a082-0f38-5c99-83e4-48995970861c}")
@Guid("1664a0820f385c9983e448995970861c")
@WinRTInterface("1664a0820f385c9983e448995970861c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppApplicabilityStatics.ByReference::class)
public interface IAppApplicabilityStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetUnsupportedAppRequirements(capabilities: IIterable<String?>?):
      IVectorView<UnsupportedAppRequirement?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppApplicabilityStatics> {
    public override fun getValue() = ABI.makeIAppApplicabilityStatics(pointer.getPointer(0))

    public fun setValue(value: IAppApplicabilityStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppApplicabilityStatics {
    public val __8224435_Ptr: Pointer?

    public val _8224435_VtblPtr: Pointer?
      get() = __8224435_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetUnsupportedAppRequirements(capabilities: IIterable<String?>?):
        IVectorView<UnsupportedAppRequirement?>? {
      val fnPtr = _8224435_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<UnsupportedAppRequirement?>>()
      val hr = fn.invokeHR(arrayOf(__8224435_Ptr, marshalToNative(capabilities), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVectorView<UnsupportedAppRequirement?>>(result.getValue())
      return resultValue
    }
  }

  public class IAppApplicabilityStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __8224435_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppApplicabilityStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1664a0820f385c9983e448995970861c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppApplicabilityStatics(ptr: Pointer?): WithDefault =
        IAppApplicabilityStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppApplicabilityStatics {
      val address = segment.toRawLongValue()
      return makeIAppApplicabilityStatics(Pointer(address))
    }

    public override fun toNative(obj: IAppApplicabilityStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__8224435_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppApplicabilityStatics):
        Array<IAppApplicabilityStatics?> = (elements as
        Array<IAppApplicabilityStatics?>).castToImpl<IAppApplicabilityStatics,IAppApplicabilityStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppApplicabilityStatics?> =
        arrayOfNulls<IAppApplicabilityStatics_Impl>(size) as Array<IAppApplicabilityStatics?>
  }
}
