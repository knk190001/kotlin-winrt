package Windows.UI.Xaml.Controls

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

@ABIMarker(ITextCompositionChangedEventArgs.ABI::class)
@Signature("{b9c7e0f2-50b7-441d-990c-68553e2e056b}")
@Guid("b9c7e0f250b7441d990c68553e2e056b")
@WinRTInterface("b9c7e0f250b7441d990c68553e2e056b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITextCompositionChangedEventArgs.ByReference::class)
public interface ITextCompositionChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_StartIndex(): Int

  @InterfaceMethod(1)
  public fun get_Length(): Int

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITextCompositionChangedEventArgs> {
    public override fun getValue() = ABI.makeITextCompositionChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ITextCompositionChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITextCompositionChangedEventArgs {
    public val __57799932_Ptr: Pointer?

    public val _57799932_VtblPtr: Pointer?
      get() = __57799932_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_StartIndex(): Int {
      val fnPtr = _57799932_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__57799932_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Length(): Int {
      val fnPtr = _57799932_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__57799932_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }
  }

  public class ITextCompositionChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __57799932_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITextCompositionChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b9c7e0f250b7441d990c68553e2e056b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITextCompositionChangedEventArgs(ptr: Pointer?): WithDefault =
        ITextCompositionChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITextCompositionChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeITextCompositionChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ITextCompositionChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__57799932_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITextCompositionChangedEventArgs):
        Array<ITextCompositionChangedEventArgs?> = (elements as
        Array<ITextCompositionChangedEventArgs?>).castToImpl<ITextCompositionChangedEventArgs,ITextCompositionChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextCompositionChangedEventArgs?> =
        arrayOfNulls<ITextCompositionChangedEventArgs_Impl>(size) as
        Array<ITextCompositionChangedEventArgs?>
  }
}
