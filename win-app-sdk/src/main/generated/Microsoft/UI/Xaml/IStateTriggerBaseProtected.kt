package Microsoft.UI.Xaml

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IStateTriggerBaseProtected.ABI::class)
@Signature("{2f695047-335b-5c00-a0d4-2a8fa54544c6}")
@Guid("2f695047335b5c00a0d42a8fa54544c6")
@WinRTInterface("2f695047335b5c00a0d42a8fa54544c6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStateTriggerBaseProtected.ByReference::class)
public interface IStateTriggerBaseProtected : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SetActive(IsActive: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStateTriggerBaseProtected> {
    public override fun getValue() = ABI.makeIStateTriggerBaseProtected(pointer.getPointer(0))

    public fun setValue(value: IStateTriggerBaseProtected_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStateTriggerBaseProtected {
    public val __2111512369_Ptr: Pointer?

    public val _2111512369_VtblPtr: Pointer?
      get() = __2111512369_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SetActive(IsActive: Boolean): Unit {
      val fnPtr = _2111512369_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2111512369_Ptr, IsActive,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IStateTriggerBaseProtected_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2111512369_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStateTriggerBaseProtected, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2f695047335b5c00a0d42a8fa54544c6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStateTriggerBaseProtected(ptr: Pointer?): WithDefault =
        IStateTriggerBaseProtected_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStateTriggerBaseProtected {
      val address = segment.toRawLongValue()
      return makeIStateTriggerBaseProtected(Pointer(address))
    }

    public override fun toNative(obj: IStateTriggerBaseProtected): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2111512369_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStateTriggerBaseProtected):
        Array<IStateTriggerBaseProtected?> = (elements as
        Array<IStateTriggerBaseProtected?>).castToImpl<IStateTriggerBaseProtected,IStateTriggerBaseProtected_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStateTriggerBaseProtected?> =
        arrayOfNulls<IStateTriggerBaseProtected_Impl>(size) as Array<IStateTriggerBaseProtected?>
  }
}
