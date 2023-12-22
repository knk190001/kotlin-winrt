package Windows.UI.Xaml

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
@Signature("{3c41e253-8d14-4216-994c-f9930429f6e5}")
@Guid("3c41e2538d144216994cf9930429f6e5")
@WinRTInterface("3c41e2538d144216994cf9930429f6e5")
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
    public val __1310317276_Ptr: Pointer?

    public val _1310317276_VtblPtr: Pointer?
      get() = __1310317276_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SetActive(IsActive: Boolean): Unit {
      val fnPtr = _1310317276_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1310317276_Ptr, IsActive,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IStateTriggerBaseProtected_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1310317276_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStateTriggerBaseProtected, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3c41e2538d144216994cf9930429f6e5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStateTriggerBaseProtected(ptr: Pointer?): WithDefault =
        IStateTriggerBaseProtected_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStateTriggerBaseProtected {
      val address = segment.toRawLongValue()
      return makeIStateTriggerBaseProtected(Pointer(address))
    }

    public override fun toNative(obj: IStateTriggerBaseProtected): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1310317276_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStateTriggerBaseProtected):
        Array<IStateTriggerBaseProtected?> = (elements as
        Array<IStateTriggerBaseProtected?>).castToImpl<IStateTriggerBaseProtected,IStateTriggerBaseProtected_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStateTriggerBaseProtected?> =
        arrayOfNulls<IStateTriggerBaseProtected_Impl>(size) as Array<IStateTriggerBaseProtected?>
  }
}
