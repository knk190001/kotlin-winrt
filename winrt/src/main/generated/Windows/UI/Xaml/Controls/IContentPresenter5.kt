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

@ABIMarker(IContentPresenter5.ABI::class)
@Signature("{d248970c-b785-5e7f-9c11-8a6cd3d5929b}")
@Guid("d248970cb7855e7f9c118a6cd3d5929b")
@WinRTInterface("d248970cb7855e7f9c118a6cd3d5929b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContentPresenter5.ByReference::class)
public interface IContentPresenter5 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BackgroundTransition(): BrushTransition?

  @InterfaceMethod(1)
  public fun put_BackgroundTransition(value: BrushTransition?): Unit

  @InterfaceMethod(2)
  public fun get_BackgroundSizing(): BackgroundSizing?

  @InterfaceMethod(3)
  public fun put_BackgroundSizing(value: BackgroundSizing?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContentPresenter5> {
    public override fun getValue() = ABI.makeIContentPresenter5(pointer.getPointer(0))

    public fun setValue(value: IContentPresenter5_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContentPresenter5 {
    public val __1960411318_Ptr: Pointer?

    public val _1960411318_VtblPtr: Pointer?
      get() = __1960411318_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BackgroundTransition(): BrushTransition? {
      val fnPtr = _1960411318_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BrushTransition>()
      val hr = fn.invokeHR(arrayOf(__1960411318_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BrushTransition>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_BackgroundTransition(value: BrushTransition?): Unit {
      val fnPtr = _1960411318_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1960411318_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_BackgroundSizing(): BackgroundSizing? {
      val fnPtr = _1960411318_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BackgroundSizing>()
      val hr = fn.invokeHR(arrayOf(__1960411318_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BackgroundSizing>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_BackgroundSizing(value: BackgroundSizing?): Unit {
      val fnPtr = _1960411318_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1960411318_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IContentPresenter5_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1960411318_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContentPresenter5, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d248970cb7855e7f9c118a6cd3d5929b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContentPresenter5(ptr: Pointer?): WithDefault = IContentPresenter5_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContentPresenter5 {
      val address = segment.toRawLongValue()
      return makeIContentPresenter5(Pointer(address))
    }

    public override fun toNative(obj: IContentPresenter5): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1960411318_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContentPresenter5): Array<IContentPresenter5?> =
        (elements as
        Array<IContentPresenter5?>).castToImpl<IContentPresenter5,IContentPresenter5_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContentPresenter5?> =
        arrayOfNulls<IContentPresenter5_Impl>(size) as Array<IContentPresenter5?>
  }
}
