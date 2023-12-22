package Microsoft.UI.Xaml.Controls

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IScrollViewerViewChangingEventArgs.ABI::class)
@Signature("{aee37d7c-4696-55f1-96ca-656832fc0fd2}")
@Guid("aee37d7c469655f196ca656832fc0fd2")
@WinRTInterface("aee37d7c469655f196ca656832fc0fd2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IScrollViewerViewChangingEventArgs.ByReference::class)
public interface IScrollViewerViewChangingEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_NextView(): ScrollViewerView?

  @InterfaceMethod(1)
  public fun get_FinalView(): ScrollViewerView?

  @InterfaceMethod(2)
  public fun get_IsInertial(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IScrollViewerViewChangingEventArgs> {
    public override fun getValue() =
        ABI.makeIScrollViewerViewChangingEventArgs(pointer.getPointer(0))

    public fun setValue(value: IScrollViewerViewChangingEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IScrollViewerViewChangingEventArgs {
    public val __432303713_Ptr: Pointer?

    public val _432303713_VtblPtr: Pointer?
      get() = __432303713_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_NextView(): ScrollViewerView? {
      val fnPtr = _432303713_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ScrollViewerView>()
      val hr = fn.invokeHR(arrayOf(__432303713_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ScrollViewerView>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_FinalView(): ScrollViewerView? {
      val fnPtr = _432303713_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ScrollViewerView>()
      val hr = fn.invokeHR(arrayOf(__432303713_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ScrollViewerView>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_IsInertial(): Boolean {
      val fnPtr = _432303713_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__432303713_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IScrollViewerViewChangingEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __432303713_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IScrollViewerViewChangingEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("aee37d7c469655f196ca656832fc0fd2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIScrollViewerViewChangingEventArgs(ptr: Pointer?): WithDefault =
        IScrollViewerViewChangingEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IScrollViewerViewChangingEventArgs {
      val address = segment.toRawLongValue()
      return makeIScrollViewerViewChangingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IScrollViewerViewChangingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__432303713_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IScrollViewerViewChangingEventArgs):
        Array<IScrollViewerViewChangingEventArgs?> = (elements as
        Array<IScrollViewerViewChangingEventArgs?>).castToImpl<IScrollViewerViewChangingEventArgs,IScrollViewerViewChangingEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IScrollViewerViewChangingEventArgs?> =
        arrayOfNulls<IScrollViewerViewChangingEventArgs_Impl>(size) as
        Array<IScrollViewerViewChangingEventArgs?>
  }
}
