package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.BrushTransition
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

@ABIMarker(IPanel2.ABI::class)
@Signature("{709133c7-38f3-5083-a4bb-06a548a1d231}")
@Guid("709133c738f35083a4bb06a548a1d231")
@WinRTInterface("709133c738f35083a4bb06a548a1d231")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPanel2.ByReference::class)
public interface IPanel2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BackgroundTransition(): BrushTransition?

  @InterfaceMethod(1)
  public fun put_BackgroundTransition(value: BrushTransition?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPanel2> {
    public override fun getValue() = ABI.makeIPanel2(pointer.getPointer(0))

    public fun setValue(value: IPanel2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPanel2 {
    public val __639700426_Ptr: Pointer?

    public val _639700426_VtblPtr: Pointer?
      get() = __639700426_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BackgroundTransition(): BrushTransition? {
      val fnPtr = _639700426_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BrushTransition>()
      val hr = fn.invokeHR(arrayOf(__639700426_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BrushTransition>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_BackgroundTransition(value: BrushTransition?): Unit {
      val fnPtr = _639700426_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__639700426_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPanel2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __639700426_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPanel2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("709133c738f35083a4bb06a548a1d231")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPanel2(ptr: Pointer?): WithDefault = IPanel2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPanel2 {
      val address = segment.toRawLongValue()
      return makeIPanel2(Pointer(address))
    }

    public override fun toNative(obj: IPanel2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__639700426_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPanel2): Array<IPanel2?> = (elements as
        Array<IPanel2?>).castToImpl<IPanel2,IPanel2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPanel2?> = arrayOfNulls<IPanel2_Impl>(size) as
        Array<IPanel2?>
  }
}
