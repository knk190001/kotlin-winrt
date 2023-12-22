package Microsoft.UI.Xaml.Controls

import Windows.UI.Xaml.Interop.TypeName
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

@ABIMarker(IControlTemplate.ABI::class)
@Signature("{3a192751-2106-547a-aca0-f15ae8926ea0}")
@Guid("3a1927512106547aaca0f15ae8926ea0")
@WinRTInterface("3a1927512106547aaca0f15ae8926ea0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IControlTemplate.ByReference::class)
public interface IControlTemplate : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TargetType(): TypeName?

  @InterfaceMethod(1)
  public fun put_TargetType(value: TypeName?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IControlTemplate> {
    public override fun getValue() = ABI.makeIControlTemplate(pointer.getPointer(0))

    public fun setValue(value: IControlTemplate_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IControlTemplate {
    public val __597953456_Ptr: Pointer?

    public val _597953456_VtblPtr: Pointer?
      get() = __597953456_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TargetType(): TypeName? {
      val fnPtr = _597953456_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TypeName>()
      val hr = fn.invokeHR(arrayOf(__597953456_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TypeName>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_TargetType(value: TypeName?): Unit {
      val fnPtr = _597953456_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__597953456_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IControlTemplate_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __597953456_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IControlTemplate, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3a1927512106547aaca0f15ae8926ea0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIControlTemplate(ptr: Pointer?): WithDefault = IControlTemplate_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IControlTemplate {
      val address = segment.toRawLongValue()
      return makeIControlTemplate(Pointer(address))
    }

    public override fun toNative(obj: IControlTemplate): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__597953456_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IControlTemplate): Array<IControlTemplate?> = (elements as
        Array<IControlTemplate?>).castToImpl<IControlTemplate,IControlTemplate_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IControlTemplate?> =
        arrayOfNulls<IControlTemplate_Impl>(size) as Array<IControlTemplate?>
  }
}
