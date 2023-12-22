package Windows.UI.Xaml

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IDependencyPropertyChangedEventArgs.ABI::class)
@Signature("{81212c2b-24d0-4957-abc3-224470a93a4e}")
@Guid("81212c2b24d04957abc3224470a93a4e")
@WinRTInterface("81212c2b24d04957abc3224470a93a4e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDependencyPropertyChangedEventArgs.ByReference::class)
public interface IDependencyPropertyChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Property(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_OldValue(): IUnknown?

  @InterfaceMethod(2)
  public fun get_NewValue(): IUnknown?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDependencyPropertyChangedEventArgs> {
    public override fun getValue() =
        ABI.makeIDependencyPropertyChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IDependencyPropertyChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDependencyPropertyChangedEventArgs {
    public val __1063292299_Ptr: Pointer?

    public val _1063292299_VtblPtr: Pointer?
      get() = __1063292299_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Property(): DependencyProperty? {
      val fnPtr = _1063292299_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1063292299_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_OldValue(): IUnknown? {
      val fnPtr = _1063292299_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1063292299_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_NewValue(): IUnknown? {
      val fnPtr = _1063292299_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1063292299_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }
  }

  public class IDependencyPropertyChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1063292299_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDependencyPropertyChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("81212c2b24d04957abc3224470a93a4e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDependencyPropertyChangedEventArgs(ptr: Pointer?): WithDefault =
        IDependencyPropertyChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDependencyPropertyChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIDependencyPropertyChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IDependencyPropertyChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1063292299_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDependencyPropertyChangedEventArgs):
        Array<IDependencyPropertyChangedEventArgs?> = (elements as
        Array<IDependencyPropertyChangedEventArgs?>).castToImpl<IDependencyPropertyChangedEventArgs,IDependencyPropertyChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDependencyPropertyChangedEventArgs?> =
        arrayOfNulls<IDependencyPropertyChangedEventArgs_Impl>(size) as
        Array<IDependencyPropertyChangedEventArgs?>
  }
}
