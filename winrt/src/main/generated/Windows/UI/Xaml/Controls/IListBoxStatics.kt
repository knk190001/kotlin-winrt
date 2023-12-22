package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.DependencyProperty
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

@ABIMarker(IListBoxStatics.ABI::class)
@Signature("{6d3f7f73-706a-4e53-a9aa-c9a53c9cdd70}")
@Guid("6d3f7f73706a4e53a9aac9a53c9cdd70")
@WinRTInterface("6d3f7f73706a4e53a9aac9a53c9cdd70")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IListBoxStatics.ByReference::class)
public interface IListBoxStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SelectionModeProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IListBoxStatics> {
    public override fun getValue() = ABI.makeIListBoxStatics(pointer.getPointer(0))

    public fun setValue(value: IListBoxStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IListBoxStatics {
    public val __1657345580_Ptr: Pointer?

    public val _1657345580_VtblPtr: Pointer?
      get() = __1657345580_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SelectionModeProperty(): DependencyProperty? {
      val fnPtr = _1657345580_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1657345580_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IListBoxStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1657345580_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IListBoxStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6d3f7f73706a4e53a9aac9a53c9cdd70")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIListBoxStatics(ptr: Pointer?): WithDefault = IListBoxStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IListBoxStatics {
      val address = segment.toRawLongValue()
      return makeIListBoxStatics(Pointer(address))
    }

    public override fun toNative(obj: IListBoxStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1657345580_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IListBoxStatics): Array<IListBoxStatics?> = (elements as
        Array<IListBoxStatics?>).castToImpl<IListBoxStatics,IListBoxStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IListBoxStatics?> =
        arrayOfNulls<IListBoxStatics_Impl>(size) as Array<IListBoxStatics?>
  }
}
