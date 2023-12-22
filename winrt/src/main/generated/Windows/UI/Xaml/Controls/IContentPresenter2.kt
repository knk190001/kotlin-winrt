package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.OpticalMarginAlignment
import Windows.UI.Xaml.TextLineBounds
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

@ABIMarker(IContentPresenter2.ABI::class)
@Signature("{5138e958-335d-4210-8bbb-0aa2b4b5c29e}")
@Guid("5138e958335d42108bbb0aa2b4b5c29e")
@WinRTInterface("5138e958335d42108bbb0aa2b4b5c29e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContentPresenter2.ByReference::class)
public interface IContentPresenter2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_OpticalMarginAlignment(): OpticalMarginAlignment?

  @InterfaceMethod(1)
  public fun put_OpticalMarginAlignment(value: OpticalMarginAlignment?): Unit

  @InterfaceMethod(2)
  public fun get_TextLineBounds(): TextLineBounds?

  @InterfaceMethod(3)
  public fun put_TextLineBounds(value: TextLineBounds?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContentPresenter2> {
    public override fun getValue() = ABI.makeIContentPresenter2(pointer.getPointer(0))

    public fun setValue(value: IContentPresenter2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContentPresenter2 {
    public val __1960411321_Ptr: Pointer?

    public val _1960411321_VtblPtr: Pointer?
      get() = __1960411321_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_OpticalMarginAlignment(): OpticalMarginAlignment? {
      val fnPtr = _1960411321_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<OpticalMarginAlignment>()
      val hr = fn.invokeHR(arrayOf(__1960411321_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<OpticalMarginAlignment>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_OpticalMarginAlignment(value: OpticalMarginAlignment?): Unit {
      val fnPtr = _1960411321_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1960411321_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_TextLineBounds(): TextLineBounds? {
      val fnPtr = _1960411321_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TextLineBounds>()
      val hr = fn.invokeHR(arrayOf(__1960411321_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TextLineBounds>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_TextLineBounds(value: TextLineBounds?): Unit {
      val fnPtr = _1960411321_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1960411321_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IContentPresenter2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1960411321_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContentPresenter2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5138e958335d42108bbb0aa2b4b5c29e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContentPresenter2(ptr: Pointer?): WithDefault = IContentPresenter2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContentPresenter2 {
      val address = segment.toRawLongValue()
      return makeIContentPresenter2(Pointer(address))
    }

    public override fun toNative(obj: IContentPresenter2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1960411321_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContentPresenter2): Array<IContentPresenter2?> =
        (elements as
        Array<IContentPresenter2?>).castToImpl<IContentPresenter2,IContentPresenter2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContentPresenter2?> =
        arrayOfNulls<IContentPresenter2_Impl>(size) as Array<IContentPresenter2?>
  }
}
