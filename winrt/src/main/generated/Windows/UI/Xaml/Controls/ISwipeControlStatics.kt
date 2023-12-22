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

@ABIMarker(ISwipeControlStatics.ABI::class)
@Signature("{e57ae83c-2216-4717-9ef6-4662334c6501}")
@Guid("e57ae83c221647179ef64662334c6501")
@WinRTInterface("e57ae83c221647179ef64662334c6501")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISwipeControlStatics.ByReference::class)
public interface ISwipeControlStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_LeftItemsProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_RightItemsProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_TopItemsProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_BottomItemsProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISwipeControlStatics> {
    public override fun getValue() = ABI.makeISwipeControlStatics(pointer.getPointer(0))

    public fun setValue(value: ISwipeControlStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISwipeControlStatics {
    public val __306009062_Ptr: Pointer?

    public val _306009062_VtblPtr: Pointer?
      get() = __306009062_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LeftItemsProperty(): DependencyProperty? {
      val fnPtr = _306009062_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__306009062_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_RightItemsProperty(): DependencyProperty? {
      val fnPtr = _306009062_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__306009062_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_TopItemsProperty(): DependencyProperty? {
      val fnPtr = _306009062_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__306009062_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_BottomItemsProperty(): DependencyProperty? {
      val fnPtr = _306009062_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__306009062_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ISwipeControlStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __306009062_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISwipeControlStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e57ae83c221647179ef64662334c6501")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISwipeControlStatics(ptr: Pointer?): WithDefault = ISwipeControlStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISwipeControlStatics {
      val address = segment.toRawLongValue()
      return makeISwipeControlStatics(Pointer(address))
    }

    public override fun toNative(obj: ISwipeControlStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__306009062_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISwipeControlStatics): Array<ISwipeControlStatics?> =
        (elements as
        Array<ISwipeControlStatics?>).castToImpl<ISwipeControlStatics,ISwipeControlStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISwipeControlStatics?> =
        arrayOfNulls<ISwipeControlStatics_Impl>(size) as Array<ISwipeControlStatics?>
  }
}
