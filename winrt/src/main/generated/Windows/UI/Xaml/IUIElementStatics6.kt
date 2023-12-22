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

@ABIMarker(IUIElementStatics6.ABI::class)
@Signature("{647e03b7-036a-4dea-9540-1dd7fd1266f1}")
@Guid("647e03b7036a4dea95401dd7fd1266f1")
@WinRTInterface("647e03b7036a4dea95401dd7fd1266f1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUIElementStatics6.ByReference::class)
public interface IUIElementStatics6 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_GettingFocusEvent(): RoutedEvent?

  @InterfaceMethod(1)
  public fun get_LosingFocusEvent(): RoutedEvent?

  @InterfaceMethod(2)
  public fun get_NoFocusCandidateFoundEvent(): RoutedEvent?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUIElementStatics6> {
    public override fun getValue() = ABI.makeIUIElementStatics6(pointer.getPointer(0))

    public fun setValue(value: IUIElementStatics6_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUIElementStatics6 {
    public val __1915643129_Ptr: Pointer?

    public val _1915643129_VtblPtr: Pointer?
      get() = __1915643129_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_GettingFocusEvent(): RoutedEvent? {
      val fnPtr = _1915643129_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RoutedEvent>()
      val hr = fn.invokeHR(arrayOf(__1915643129_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RoutedEvent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_LosingFocusEvent(): RoutedEvent? {
      val fnPtr = _1915643129_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RoutedEvent>()
      val hr = fn.invokeHR(arrayOf(__1915643129_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RoutedEvent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_NoFocusCandidateFoundEvent(): RoutedEvent? {
      val fnPtr = _1915643129_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RoutedEvent>()
      val hr = fn.invokeHR(arrayOf(__1915643129_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RoutedEvent>(result.getValue())
      return resultValue
    }
  }

  public class IUIElementStatics6_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1915643129_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUIElementStatics6, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("647e03b7036a4dea95401dd7fd1266f1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUIElementStatics6(ptr: Pointer?): WithDefault = IUIElementStatics6_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUIElementStatics6 {
      val address = segment.toRawLongValue()
      return makeIUIElementStatics6(Pointer(address))
    }

    public override fun toNative(obj: IUIElementStatics6): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1915643129_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUIElementStatics6): Array<IUIElementStatics6?> =
        (elements as
        Array<IUIElementStatics6?>).castToImpl<IUIElementStatics6,IUIElementStatics6_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUIElementStatics6?> =
        arrayOfNulls<IUIElementStatics6_Impl>(size) as Array<IUIElementStatics6?>
  }
}
