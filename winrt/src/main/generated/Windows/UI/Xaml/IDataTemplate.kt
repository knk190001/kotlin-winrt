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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDataTemplate.ABI::class)
@Signature("{9910aec7-8ab5-4118-9bc6-09f45a35073d}")
@Guid("9910aec78ab541189bc609f45a35073d")
@WinRTInterface("9910aec78ab541189bc609f45a35073d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDataTemplate.ByReference::class)
public interface IDataTemplate : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun LoadContent(): DependencyObject?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IDataTemplate>
      {
    public override fun getValue() = ABI.makeIDataTemplate(pointer.getPointer(0))

    public fun setValue(value: IDataTemplate_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDataTemplate {
    public val __410930794_Ptr: Pointer?

    public val _410930794_VtblPtr: Pointer?
      get() = __410930794_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun LoadContent(): DependencyObject? {
      val fnPtr = _410930794_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyObject>()
      val hr = fn.invokeHR(arrayOf(__410930794_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyObject>(result.getValue())
      return resultValue
    }
  }

  public class IDataTemplate_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __410930794_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDataTemplate, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9910aec78ab541189bc609f45a35073d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDataTemplate(ptr: Pointer?): WithDefault = IDataTemplate_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDataTemplate {
      val address = segment.toRawLongValue()
      return makeIDataTemplate(Pointer(address))
    }

    public override fun toNative(obj: IDataTemplate): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__410930794_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDataTemplate): Array<IDataTemplate?> = (elements as
        Array<IDataTemplate?>).castToImpl<IDataTemplate,IDataTemplate_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDataTemplate?> =
        arrayOfNulls<IDataTemplate_Impl>(size) as Array<IDataTemplate?>
  }
}
