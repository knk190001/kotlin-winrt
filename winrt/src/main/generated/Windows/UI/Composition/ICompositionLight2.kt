package Windows.UI.Composition

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

@ABIMarker(ICompositionLight2.ABI::class)
@Signature("{a7bcda72-f35d-425d-9b98-23f4205f6669}")
@Guid("a7bcda72f35d425d9b9823f4205f6669")
@WinRTInterface("a7bcda72f35d425d9b9823f4205f6669")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionLight2.ByReference::class)
public interface ICompositionLight2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ExclusionsFromTargets(): VisualUnorderedCollection?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionLight2> {
    public override fun getValue() = ABI.makeICompositionLight2(pointer.getPointer(0))

    public fun setValue(value: ICompositionLight2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionLight2 {
    public val __1070966328_Ptr: Pointer?

    public val _1070966328_VtblPtr: Pointer?
      get() = __1070966328_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ExclusionsFromTargets(): VisualUnorderedCollection? {
      val fnPtr = _1070966328_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VisualUnorderedCollection>()
      val hr = fn.invokeHR(arrayOf(__1070966328_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VisualUnorderedCollection>(result.getValue())
      return resultValue
    }
  }

  public class ICompositionLight2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1070966328_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionLight2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a7bcda72f35d425d9b9823f4205f6669")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionLight2(ptr: Pointer?): WithDefault = ICompositionLight2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionLight2 {
      val address = segment.toRawLongValue()
      return makeICompositionLight2(Pointer(address))
    }

    public override fun toNative(obj: ICompositionLight2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1070966328_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionLight2): Array<ICompositionLight2?> =
        (elements as
        Array<ICompositionLight2?>).castToImpl<ICompositionLight2,ICompositionLight2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionLight2?> =
        arrayOfNulls<ICompositionLight2_Impl>(size) as Array<ICompositionLight2?>
  }
}
