package Windows.UI.Input.Inking

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

@ABIMarker(IInkDrawingAttributesStatics.ABI::class)
@Signature("{f731e03f-1a65-4862-96cb-6e1665e17f6d}")
@Guid("f731e03f1a65486296cb6e1665e17f6d")
@WinRTInterface("f731e03f1a65486296cb6e1665e17f6d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkDrawingAttributesStatics.ByReference::class)
public interface IInkDrawingAttributesStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateForPencil(): InkDrawingAttributes?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkDrawingAttributesStatics> {
    public override fun getValue() = ABI.makeIInkDrawingAttributesStatics(pointer.getPointer(0))

    public fun setValue(value: IInkDrawingAttributesStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkDrawingAttributesStatics {
    public val __1576624668_Ptr: Pointer?

    public val _1576624668_VtblPtr: Pointer?
      get() = __1576624668_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateForPencil(): InkDrawingAttributes? {
      val fnPtr = _1576624668_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InkDrawingAttributes>()
      val hr = fn.invokeHR(arrayOf(__1576624668_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InkDrawingAttributes>(result.getValue())
      return resultValue
    }
  }

  public class IInkDrawingAttributesStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1576624668_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkDrawingAttributesStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f731e03f1a65486296cb6e1665e17f6d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkDrawingAttributesStatics(ptr: Pointer?): WithDefault =
        IInkDrawingAttributesStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkDrawingAttributesStatics {
      val address = segment.toRawLongValue()
      return makeIInkDrawingAttributesStatics(Pointer(address))
    }

    public override fun toNative(obj: IInkDrawingAttributesStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1576624668_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkDrawingAttributesStatics):
        Array<IInkDrawingAttributesStatics?> = (elements as
        Array<IInkDrawingAttributesStatics?>).castToImpl<IInkDrawingAttributesStatics,IInkDrawingAttributesStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkDrawingAttributesStatics?> =
        arrayOfNulls<IInkDrawingAttributesStatics_Impl>(size) as
        Array<IInkDrawingAttributesStatics?>
  }
}
