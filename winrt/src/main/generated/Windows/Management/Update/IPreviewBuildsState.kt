package Windows.Management.Update

import Windows.Foundation.Collections.ValueSet
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

@ABIMarker(IPreviewBuildsState.ABI::class)
@Signature("{a2f2903e-b223-5f63-7546-3e8eac070a2e}")
@Guid("a2f2903eb2235f6375463e8eac070a2e")
@WinRTInterface("a2f2903eb2235f6375463e8eac070a2e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPreviewBuildsState.ByReference::class)
public interface IPreviewBuildsState : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Properties(): ValueSet?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPreviewBuildsState> {
    public override fun getValue() = ABI.makeIPreviewBuildsState(pointer.getPointer(0))

    public fun setValue(value: IPreviewBuildsState_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPreviewBuildsState {
    public val __731013732_Ptr: Pointer?

    public val _731013732_VtblPtr: Pointer?
      get() = __731013732_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Properties(): ValueSet? {
      val fnPtr = _731013732_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ValueSet>()
      val hr = fn.invokeHR(arrayOf(__731013732_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ValueSet>(result.getValue())
      return resultValue
    }
  }

  public class IPreviewBuildsState_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __731013732_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPreviewBuildsState, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a2f2903eb2235f6375463e8eac070a2e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPreviewBuildsState(ptr: Pointer?): WithDefault = IPreviewBuildsState_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPreviewBuildsState {
      val address = segment.toRawLongValue()
      return makeIPreviewBuildsState(Pointer(address))
    }

    public override fun toNative(obj: IPreviewBuildsState): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__731013732_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPreviewBuildsState): Array<IPreviewBuildsState?> =
        (elements as
        Array<IPreviewBuildsState?>).castToImpl<IPreviewBuildsState,IPreviewBuildsState_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPreviewBuildsState?> =
        arrayOfNulls<IPreviewBuildsState_Impl>(size) as Array<IPreviewBuildsState?>
  }
}
