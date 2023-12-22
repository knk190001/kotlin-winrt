package Windows.UI.Xaml.Automation

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

@ABIMarker(IExpandCollapsePatternIdentifiersStatics.ABI::class)
@Signature("{d7816fd4-6ee0-4f38-8e14-56ef21adacfd}")
@Guid("d7816fd46ee04f388e1456ef21adacfd")
@WinRTInterface("d7816fd46ee04f388e1456ef21adacfd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IExpandCollapsePatternIdentifiersStatics.ByReference::class)
public interface IExpandCollapsePatternIdentifiersStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ExpandCollapseStateProperty(): AutomationProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IExpandCollapsePatternIdentifiersStatics> {
    public override fun getValue() =
        ABI.makeIExpandCollapsePatternIdentifiersStatics(pointer.getPointer(0))

    public fun setValue(value: IExpandCollapsePatternIdentifiersStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IExpandCollapsePatternIdentifiersStatics {
    public val __1665326967_Ptr: Pointer?

    public val _1665326967_VtblPtr: Pointer?
      get() = __1665326967_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ExpandCollapseStateProperty(): AutomationProperty? {
      val fnPtr = _1665326967_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__1665326967_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }
  }

  public class IExpandCollapsePatternIdentifiersStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1665326967_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IExpandCollapsePatternIdentifiersStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d7816fd46ee04f388e1456ef21adacfd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIExpandCollapsePatternIdentifiersStatics(ptr: Pointer?): WithDefault =
        IExpandCollapsePatternIdentifiersStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IExpandCollapsePatternIdentifiersStatics {
      val address = segment.toRawLongValue()
      return makeIExpandCollapsePatternIdentifiersStatics(Pointer(address))
    }

    public override fun toNative(obj: IExpandCollapsePatternIdentifiersStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1665326967_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IExpandCollapsePatternIdentifiersStatics):
        Array<IExpandCollapsePatternIdentifiersStatics?> = (elements as
        Array<IExpandCollapsePatternIdentifiersStatics?>).castToImpl<IExpandCollapsePatternIdentifiersStatics,IExpandCollapsePatternIdentifiersStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IExpandCollapsePatternIdentifiersStatics?> =
        arrayOfNulls<IExpandCollapsePatternIdentifiersStatics_Impl>(size) as
        Array<IExpandCollapsePatternIdentifiersStatics?>
  }
}
