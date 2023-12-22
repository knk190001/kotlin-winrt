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

@ABIMarker(IFrameworkElementStatics5.ABI::class)
@Signature("{525d3941-0b3c-4be6-9978-19a8025c09d8}")
@Guid("525d39410b3c4be6997819a8025c09d8")
@WinRTInterface("525d39410b3c4be6997819a8025c09d8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFrameworkElementStatics5.ByReference::class)
public interface IFrameworkElementStatics5 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun DeferTree(element: DependencyObject?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFrameworkElementStatics5> {
    public override fun getValue() = ABI.makeIFrameworkElementStatics5(pointer.getPointer(0))

    public fun setValue(value: IFrameworkElementStatics5_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFrameworkElementStatics5 {
    public val __1113717408_Ptr: Pointer?

    public val _1113717408_VtblPtr: Pointer?
      get() = __1113717408_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun DeferTree(element: DependencyObject?): Unit {
      val fnPtr = _1113717408_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1113717408_Ptr, marshalToNative(element),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IFrameworkElementStatics5_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1113717408_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFrameworkElementStatics5, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("525d39410b3c4be6997819a8025c09d8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFrameworkElementStatics5(ptr: Pointer?): WithDefault =
        IFrameworkElementStatics5_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFrameworkElementStatics5 {
      val address = segment.toRawLongValue()
      return makeIFrameworkElementStatics5(Pointer(address))
    }

    public override fun toNative(obj: IFrameworkElementStatics5): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1113717408_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFrameworkElementStatics5):
        Array<IFrameworkElementStatics5?> = (elements as
        Array<IFrameworkElementStatics5?>).castToImpl<IFrameworkElementStatics5,IFrameworkElementStatics5_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFrameworkElementStatics5?> =
        arrayOfNulls<IFrameworkElementStatics5_Impl>(size) as Array<IFrameworkElementStatics5?>
  }
}
