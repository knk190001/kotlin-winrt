package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.DependencyProperty
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

@ABIMarker(IScrollViewerStatics2.ABI::class)
@Signature("{33d129ad-8d7e-42a0-bf32-905cccd04d41}")
@Guid("33d129ad8d7e42a0bf32905cccd04d41")
@WinRTInterface("33d129ad8d7e42a0bf32905cccd04d41")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IScrollViewerStatics2.ByReference::class)
public interface IScrollViewerStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TopLeftHeaderProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_LeftHeaderProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_TopHeaderProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IScrollViewerStatics2> {
    public override fun getValue() = ABI.makeIScrollViewerStatics2(pointer.getPointer(0))

    public fun setValue(value: IScrollViewerStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IScrollViewerStatics2 {
    public val __129442936_Ptr: Pointer?

    public val _129442936_VtblPtr: Pointer?
      get() = __129442936_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TopLeftHeaderProperty(): DependencyProperty? {
      val fnPtr = _129442936_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__129442936_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_LeftHeaderProperty(): DependencyProperty? {
      val fnPtr = _129442936_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__129442936_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_TopHeaderProperty(): DependencyProperty? {
      val fnPtr = _129442936_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__129442936_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IScrollViewerStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __129442936_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IScrollViewerStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("33d129ad8d7e42a0bf32905cccd04d41")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIScrollViewerStatics2(ptr: Pointer?): WithDefault =
        IScrollViewerStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IScrollViewerStatics2 {
      val address = segment.toRawLongValue()
      return makeIScrollViewerStatics2(Pointer(address))
    }

    public override fun toNative(obj: IScrollViewerStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__129442936_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IScrollViewerStatics2): Array<IScrollViewerStatics2?> =
        (elements as
        Array<IScrollViewerStatics2?>).castToImpl<IScrollViewerStatics2,IScrollViewerStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IScrollViewerStatics2?> =
        arrayOfNulls<IScrollViewerStatics2_Impl>(size) as Array<IScrollViewerStatics2?>
  }
}
