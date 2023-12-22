package Microsoft.UI.Composition

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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(ICompositionApiInformationStatics.ABI::class)
@Signature("{85260ed3-365b-5e70-b79a-f9f1d10fa4b5}")
@Guid("85260ed3365b5e70b79af9f1d10fa4b5")
@WinRTInterface("85260ed3365b5e70b79af9f1d10fa4b5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionApiInformationStatics.ByReference::class)
public interface ICompositionApiInformationStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ApiVersion(): WinDef.ULONG

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionApiInformationStatics> {
    public override fun getValue() =
        ABI.makeICompositionApiInformationStatics(pointer.getPointer(0))

    public fun setValue(value: ICompositionApiInformationStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionApiInformationStatics {
    public val __1387976002_Ptr: Pointer?

    public val _1387976002_VtblPtr: Pointer?
      get() = __1387976002_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ApiVersion(): WinDef.ULONG {
      val fnPtr = _1387976002_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__1387976002_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }
  }

  public class ICompositionApiInformationStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1387976002_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionApiInformationStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("85260ed3365b5e70b79af9f1d10fa4b5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionApiInformationStatics(ptr: Pointer?): WithDefault =
        ICompositionApiInformationStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionApiInformationStatics {
      val address = segment.toRawLongValue()
      return makeICompositionApiInformationStatics(Pointer(address))
    }

    public override fun toNative(obj: ICompositionApiInformationStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1387976002_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionApiInformationStatics):
        Array<ICompositionApiInformationStatics?> = (elements as
        Array<ICompositionApiInformationStatics?>).castToImpl<ICompositionApiInformationStatics,ICompositionApiInformationStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionApiInformationStatics?> =
        arrayOfNulls<ICompositionApiInformationStatics_Impl>(size) as
        Array<ICompositionApiInformationStatics?>
  }
}
