package Windows.UI.Xaml.Data

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPropertyChangedEventArgs.ABI::class)
@Signature("{4f33a9a0-5cf4-47a4-b16f-d7faaf17457e}")
@Guid("4f33a9a05cf447a4b16fd7faaf17457e")
@WinRTInterface("4f33a9a05cf447a4b16fd7faaf17457e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPropertyChangedEventArgs.ByReference::class)
public interface IPropertyChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PropertyName(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPropertyChangedEventArgs> {
    public override fun getValue() = ABI.makeIPropertyChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IPropertyChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPropertyChangedEventArgs {
    public val __1472638880_Ptr: Pointer?

    public val _1472638880_VtblPtr: Pointer?
      get() = __1472638880_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PropertyName(): String? {
      val fnPtr = _1472638880_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1472638880_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IPropertyChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1472638880_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPropertyChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4f33a9a05cf447a4b16fd7faaf17457e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPropertyChangedEventArgs(ptr: Pointer?): WithDefault =
        IPropertyChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPropertyChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIPropertyChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IPropertyChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1472638880_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPropertyChangedEventArgs):
        Array<IPropertyChangedEventArgs?> = (elements as
        Array<IPropertyChangedEventArgs?>).castToImpl<IPropertyChangedEventArgs,IPropertyChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPropertyChangedEventArgs?> =
        arrayOfNulls<IPropertyChangedEventArgs_Impl>(size) as Array<IPropertyChangedEventArgs?>
  }
}
