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

@ABIMarker(ITogglePatternIdentifiersStatics.ABI::class)
@Signature("{c7f75544-14a5-4f2f-92fc-760524de06ea}")
@Guid("c7f7554414a54f2f92fc760524de06ea")
@WinRTInterface("c7f7554414a54f2f92fc760524de06ea")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITogglePatternIdentifiersStatics.ByReference::class)
public interface ITogglePatternIdentifiersStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ToggleStateProperty(): AutomationProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITogglePatternIdentifiersStatics> {
    public override fun getValue() = ABI.makeITogglePatternIdentifiersStatics(pointer.getPointer(0))

    public fun setValue(value: ITogglePatternIdentifiersStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITogglePatternIdentifiersStatics {
    public val __236840132_Ptr: Pointer?

    public val _236840132_VtblPtr: Pointer?
      get() = __236840132_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ToggleStateProperty(): AutomationProperty? {
      val fnPtr = _236840132_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__236840132_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }
  }

  public class ITogglePatternIdentifiersStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __236840132_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITogglePatternIdentifiersStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c7f7554414a54f2f92fc760524de06ea")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITogglePatternIdentifiersStatics(ptr: Pointer?): WithDefault =
        ITogglePatternIdentifiersStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITogglePatternIdentifiersStatics {
      val address = segment.toRawLongValue()
      return makeITogglePatternIdentifiersStatics(Pointer(address))
    }

    public override fun toNative(obj: ITogglePatternIdentifiersStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__236840132_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITogglePatternIdentifiersStatics):
        Array<ITogglePatternIdentifiersStatics?> = (elements as
        Array<ITogglePatternIdentifiersStatics?>).castToImpl<ITogglePatternIdentifiersStatics,ITogglePatternIdentifiersStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITogglePatternIdentifiersStatics?> =
        arrayOfNulls<ITogglePatternIdentifiersStatics_Impl>(size) as
        Array<ITogglePatternIdentifiersStatics?>
  }
}
