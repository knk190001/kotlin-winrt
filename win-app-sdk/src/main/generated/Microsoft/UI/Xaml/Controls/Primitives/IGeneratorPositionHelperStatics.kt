package Microsoft.UI.Xaml.Controls.Primitives

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

@ABIMarker(IGeneratorPositionHelperStatics.ABI::class)
@Signature("{3113605a-3feb-54f9-a256-f373250281d4}")
@Guid("3113605a3feb54f9a256f373250281d4")
@WinRTInterface("3113605a3feb54f9a256f373250281d4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGeneratorPositionHelperStatics.ByReference::class)
public interface IGeneratorPositionHelperStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun FromIndexAndOffset(index: Int, offset: Int): GeneratorPosition?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGeneratorPositionHelperStatics> {
    public override fun getValue() = ABI.makeIGeneratorPositionHelperStatics(pointer.getPointer(0))

    public fun setValue(value: IGeneratorPositionHelperStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGeneratorPositionHelperStatics {
    public val __1457978636_Ptr: Pointer?

    public val _1457978636_VtblPtr: Pointer?
      get() = __1457978636_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FromIndexAndOffset(index: Int, offset: Int): GeneratorPosition? {
      val fnPtr = _1457978636_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GeneratorPosition>()
      val hr = fn.invokeHR(arrayOf(__1457978636_Ptr, index, offset, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GeneratorPosition>(result.getValue())
      return resultValue
    }
  }

  public class IGeneratorPositionHelperStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1457978636_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGeneratorPositionHelperStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3113605a3feb54f9a256f373250281d4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGeneratorPositionHelperStatics(ptr: Pointer?): WithDefault =
        IGeneratorPositionHelperStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGeneratorPositionHelperStatics {
      val address = segment.toRawLongValue()
      return makeIGeneratorPositionHelperStatics(Pointer(address))
    }

    public override fun toNative(obj: IGeneratorPositionHelperStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1457978636_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGeneratorPositionHelperStatics):
        Array<IGeneratorPositionHelperStatics?> = (elements as
        Array<IGeneratorPositionHelperStatics?>).castToImpl<IGeneratorPositionHelperStatics,IGeneratorPositionHelperStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGeneratorPositionHelperStatics?> =
        arrayOfNulls<IGeneratorPositionHelperStatics_Impl>(size) as
        Array<IGeneratorPositionHelperStatics?>
  }
}
