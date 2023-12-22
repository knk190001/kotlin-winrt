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

@ABIMarker(IUIElementStatics9.ABI::class)
@Signature("{71467e77-8ca3-5ed7-95db-d51cdad77f81}")
@Guid("71467e778ca35ed795dbd51cdad77f81")
@WinRTInterface("71467e778ca35ed795dbd51cdad77f81")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUIElementStatics9.ByReference::class)
public interface IUIElementStatics9 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CanBeScrollAnchorProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUIElementStatics9> {
    public override fun getValue() = ABI.makeIUIElementStatics9(pointer.getPointer(0))

    public fun setValue(value: IUIElementStatics9_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUIElementStatics9 {
    public val __1915643126_Ptr: Pointer?

    public val _1915643126_VtblPtr: Pointer?
      get() = __1915643126_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CanBeScrollAnchorProperty(): DependencyProperty? {
      val fnPtr = _1915643126_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1915643126_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IUIElementStatics9_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1915643126_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUIElementStatics9, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("71467e778ca35ed795dbd51cdad77f81")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUIElementStatics9(ptr: Pointer?): WithDefault = IUIElementStatics9_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUIElementStatics9 {
      val address = segment.toRawLongValue()
      return makeIUIElementStatics9(Pointer(address))
    }

    public override fun toNative(obj: IUIElementStatics9): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1915643126_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUIElementStatics9): Array<IUIElementStatics9?> =
        (elements as
        Array<IUIElementStatics9?>).castToImpl<IUIElementStatics9,IUIElementStatics9_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUIElementStatics9?> =
        arrayOfNulls<IUIElementStatics9_Impl>(size) as Array<IUIElementStatics9?>
  }
}
