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

@ABIMarker(ISwipeControl.ABI::class)
@Signature("{9ee3d96f-6704-4823-aa15-1c143bc53cf7}")
@Guid("9ee3d96f67044823aa151c143bc53cf7")
@WinRTInterface("9ee3d96f67044823aa151c143bc53cf7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISwipeControl.ByReference::class)
public interface ISwipeControl : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_LeftItems(): SwipeItems?

  @InterfaceMethod(1)
  public fun put_LeftItems(value: SwipeItems?): Unit

  @InterfaceMethod(2)
  public fun get_RightItems(): SwipeItems?

  @InterfaceMethod(3)
  public fun put_RightItems(value: SwipeItems?): Unit

  @InterfaceMethod(4)
  public fun get_TopItems(): SwipeItems?

  @InterfaceMethod(5)
  public fun put_TopItems(value: SwipeItems?): Unit

  @InterfaceMethod(6)
  public fun get_BottomItems(): SwipeItems?

  @InterfaceMethod(7)
  public fun put_BottomItems(value: SwipeItems?): Unit

  @InterfaceMethod(8)
  public fun Close(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ISwipeControl>
      {
    public override fun getValue() = ABI.makeISwipeControl(pointer.getPointer(0))

    public fun setValue(value: ISwipeControl_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISwipeControl {
    public val __1541661985_Ptr: Pointer?

    public val _1541661985_VtblPtr: Pointer?
      get() = __1541661985_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LeftItems(): SwipeItems? {
      val fnPtr = _1541661985_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SwipeItems>()
      val hr = fn.invokeHR(arrayOf(__1541661985_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SwipeItems>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_LeftItems(value: SwipeItems?): Unit {
      val fnPtr = _1541661985_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1541661985_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_RightItems(): SwipeItems? {
      val fnPtr = _1541661985_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SwipeItems>()
      val hr = fn.invokeHR(arrayOf(__1541661985_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SwipeItems>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_RightItems(value: SwipeItems?): Unit {
      val fnPtr = _1541661985_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1541661985_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_TopItems(): SwipeItems? {
      val fnPtr = _1541661985_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SwipeItems>()
      val hr = fn.invokeHR(arrayOf(__1541661985_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SwipeItems>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_TopItems(value: SwipeItems?): Unit {
      val fnPtr = _1541661985_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1541661985_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_BottomItems(): SwipeItems? {
      val fnPtr = _1541661985_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SwipeItems>()
      val hr = fn.invokeHR(arrayOf(__1541661985_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SwipeItems>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_BottomItems(value: SwipeItems?): Unit {
      val fnPtr = _1541661985_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1541661985_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun Close(): Unit {
      val fnPtr = _1541661985_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1541661985_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISwipeControl_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1541661985_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISwipeControl, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9ee3d96f67044823aa151c143bc53cf7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISwipeControl(ptr: Pointer?): WithDefault = ISwipeControl_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISwipeControl {
      val address = segment.toRawLongValue()
      return makeISwipeControl(Pointer(address))
    }

    public override fun toNative(obj: ISwipeControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1541661985_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISwipeControl): Array<ISwipeControl?> = (elements as
        Array<ISwipeControl?>).castToImpl<ISwipeControl,ISwipeControl_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISwipeControl?> =
        arrayOfNulls<ISwipeControl_Impl>(size) as Array<ISwipeControl?>
  }
}
