package Windows.UI.Xaml.Automation

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
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
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAutomationProperties.ABI::class)
@Signature("{68d7232c-e622-48e9-af0b-1ffa33cc5cba}")
@Guid("68d7232ce62248e9af0b1ffa33cc5cba")
@WinRTInterface("68d7232ce62248e9af0b1ffa33cc5cba")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAutomationProperties.ByReference::class)
public interface IAutomationProperties : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAutomationProperties> {
    public override fun getValue() = ABI.makeIAutomationProperties(pointer.getPointer(0))

    public fun setValue(value: IAutomationProperties_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAutomationProperties {
    public val __633636293_Ptr: Pointer?

    public val _633636293_VtblPtr: Pointer?
      get() = __633636293_Ptr?.getPointer(0)
  }

  public class IAutomationProperties_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __633636293_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAutomationProperties, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("68d7232ce62248e9af0b1ffa33cc5cba")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAutomationProperties(ptr: Pointer?): WithDefault =
        IAutomationProperties_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAutomationProperties {
      val address = segment.toRawLongValue()
      return makeIAutomationProperties(Pointer(address))
    }

    public override fun toNative(obj: IAutomationProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__633636293_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAutomationProperties): Array<IAutomationProperties?> =
        (elements as
        Array<IAutomationProperties?>).castToImpl<IAutomationProperties,IAutomationProperties_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAutomationProperties?> =
        arrayOfNulls<IAutomationProperties_Impl>(size) as Array<IAutomationProperties?>
  }
}
