package Windows.UI.Xaml

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

@ABIMarker(IDependencyProperty.ABI::class)
@Signature("{85b13970-9bc4-4e96-acf1-30c8fd3d55c8}")
@Guid("85b139709bc44e96acf130c8fd3d55c8")
@WinRTInterface("85b139709bc44e96acf130c8fd3d55c8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDependencyProperty.ByReference::class)
public interface IDependencyProperty : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetMetadata(forType: TypeName?): PropertyMetadata?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDependencyProperty> {
    public override fun getValue() = ABI.makeIDependencyProperty(pointer.getPointer(0))

    public fun setValue(value: IDependencyProperty_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDependencyProperty {
    public val __1766182894_Ptr: Pointer?

    public val _1766182894_VtblPtr: Pointer?
      get() = __1766182894_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetMetadata(forType: TypeName?): PropertyMetadata? {
      val fnPtr = _1766182894_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PropertyMetadata>()
      val hr = fn.invokeHR(arrayOf(__1766182894_Ptr, marshalToNative(forType), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PropertyMetadata>(result.getValue())
      return resultValue
    }
  }

  public class IDependencyProperty_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1766182894_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDependencyProperty, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("85b139709bc44e96acf130c8fd3d55c8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDependencyProperty(ptr: Pointer?): WithDefault = IDependencyProperty_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDependencyProperty {
      val address = segment.toRawLongValue()
      return makeIDependencyProperty(Pointer(address))
    }

    public override fun toNative(obj: IDependencyProperty): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1766182894_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDependencyProperty): Array<IDependencyProperty?> =
        (elements as
        Array<IDependencyProperty?>).castToImpl<IDependencyProperty,IDependencyProperty_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDependencyProperty?> =
        arrayOfNulls<IDependencyProperty_Impl>(size) as Array<IDependencyProperty?>
  }
}
