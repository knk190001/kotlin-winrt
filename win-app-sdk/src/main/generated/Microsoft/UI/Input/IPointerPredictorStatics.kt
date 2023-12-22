package Microsoft.UI.Input

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

@ABIMarker(IPointerPredictorStatics.ABI::class)
@Signature("{78a8ef30-3e5c-55cd-8f85-65ac09b1a987}")
@Guid("78a8ef303e5c55cd8f8565ac09b1a987")
@WinRTInterface("78a8ef303e5c55cd8f8565ac09b1a987")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPointerPredictorStatics.ByReference::class)
public interface IPointerPredictorStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateForInputPointerSource(inputPointerSource: InputPointerSource?): PointerPredictor?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPointerPredictorStatics> {
    public override fun getValue() = ABI.makeIPointerPredictorStatics(pointer.getPointer(0))

    public fun setValue(value: IPointerPredictorStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPointerPredictorStatics {
    public val __1539417491_Ptr: Pointer?

    public val _1539417491_VtblPtr: Pointer?
      get() = __1539417491_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateForInputPointerSource(inputPointerSource: InputPointerSource?):
        PointerPredictor? {
      val fnPtr = _1539417491_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PointerPredictor>()
      val hr = fn.invokeHR(arrayOf(__1539417491_Ptr, marshalToNative(inputPointerSource), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PointerPredictor>(result.getValue())
      return resultValue
    }
  }

  public class IPointerPredictorStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1539417491_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPointerPredictorStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("78a8ef303e5c55cd8f8565ac09b1a987")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPointerPredictorStatics(ptr: Pointer?): WithDefault =
        IPointerPredictorStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPointerPredictorStatics {
      val address = segment.toRawLongValue()
      return makeIPointerPredictorStatics(Pointer(address))
    }

    public override fun toNative(obj: IPointerPredictorStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1539417491_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPointerPredictorStatics):
        Array<IPointerPredictorStatics?> = (elements as
        Array<IPointerPredictorStatics?>).castToImpl<IPointerPredictorStatics,IPointerPredictorStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPointerPredictorStatics?> =
        arrayOfNulls<IPointerPredictorStatics_Impl>(size) as Array<IPointerPredictorStatics?>
  }
}
