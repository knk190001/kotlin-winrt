package Microsoft.UI.Xaml.Data

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
@Signature("{63d0c952-396b-54f4-af8c-ba8724a427bf}")
@Guid("63d0c952396b54f4af8cba8724a427bf")
@WinRTInterface("63d0c952396b54f4af8cba8724a427bf")
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
    public val __2114731659_Ptr: Pointer?

    public val _2114731659_VtblPtr: Pointer?
      get() = __2114731659_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PropertyName(): String? {
      val fnPtr = _2114731659_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2114731659_Ptr,  result))
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
    public override val __2114731659_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPropertyChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("63d0c952396b54f4af8cba8724a427bf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPropertyChangedEventArgs(ptr: Pointer?): WithDefault =
        IPropertyChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPropertyChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIPropertyChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IPropertyChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2114731659_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPropertyChangedEventArgs):
        Array<IPropertyChangedEventArgs?> = (elements as
        Array<IPropertyChangedEventArgs?>).castToImpl<IPropertyChangedEventArgs,IPropertyChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPropertyChangedEventArgs?> =
        arrayOfNulls<IPropertyChangedEventArgs_Impl>(size) as Array<IPropertyChangedEventArgs?>
  }
}
