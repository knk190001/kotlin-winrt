package Windows.UI.Xaml.Documents

import Windows.UI.Xaml.DependencyObject
import Windows.UI.Xaml.ElementSoundMode
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

@ABIMarker(IHyperlink3.ABI::class)
@Signature("{c3f157d9-e5d3-4fb7-8702-4f6d85dd9e0a}")
@Guid("c3f157d9e5d34fb787024f6d85dd9e0a")
@WinRTInterface("c3f157d9e5d34fb787024f6d85dd9e0a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHyperlink3.ByReference::class)
public interface IHyperlink3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_XYFocusLeft(): DependencyObject?

  @InterfaceMethod(1)
  public fun put_XYFocusLeft(value: DependencyObject?): Unit

  @InterfaceMethod(2)
  public fun get_XYFocusRight(): DependencyObject?

  @InterfaceMethod(3)
  public fun put_XYFocusRight(value: DependencyObject?): Unit

  @InterfaceMethod(4)
  public fun get_XYFocusUp(): DependencyObject?

  @InterfaceMethod(5)
  public fun put_XYFocusUp(value: DependencyObject?): Unit

  @InterfaceMethod(6)
  public fun get_XYFocusDown(): DependencyObject?

  @InterfaceMethod(7)
  public fun put_XYFocusDown(value: DependencyObject?): Unit

  @InterfaceMethod(8)
  public fun get_ElementSoundMode(): ElementSoundMode?

  @InterfaceMethod(9)
  public fun put_ElementSoundMode(value: ElementSoundMode?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IHyperlink3> {
    public override fun getValue() = ABI.makeIHyperlink3(pointer.getPointer(0))

    public fun setValue(value: IHyperlink3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHyperlink3 {
    public val __932194123_Ptr: Pointer?

    public val _932194123_VtblPtr: Pointer?
      get() = __932194123_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_XYFocusLeft(): DependencyObject? {
      val fnPtr = _932194123_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyObject>()
      val hr = fn.invokeHR(arrayOf(__932194123_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyObject>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_XYFocusLeft(value: DependencyObject?): Unit {
      val fnPtr = _932194123_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__932194123_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_XYFocusRight(): DependencyObject? {
      val fnPtr = _932194123_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyObject>()
      val hr = fn.invokeHR(arrayOf(__932194123_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyObject>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_XYFocusRight(value: DependencyObject?): Unit {
      val fnPtr = _932194123_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__932194123_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_XYFocusUp(): DependencyObject? {
      val fnPtr = _932194123_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyObject>()
      val hr = fn.invokeHR(arrayOf(__932194123_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyObject>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_XYFocusUp(value: DependencyObject?): Unit {
      val fnPtr = _932194123_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__932194123_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_XYFocusDown(): DependencyObject? {
      val fnPtr = _932194123_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyObject>()
      val hr = fn.invokeHR(arrayOf(__932194123_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyObject>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_XYFocusDown(value: DependencyObject?): Unit {
      val fnPtr = _932194123_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__932194123_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_ElementSoundMode(): ElementSoundMode? {
      val fnPtr = _932194123_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ElementSoundMode>()
      val hr = fn.invokeHR(arrayOf(__932194123_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ElementSoundMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_ElementSoundMode(value: ElementSoundMode?): Unit {
      val fnPtr = _932194123_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__932194123_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IHyperlink3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __932194123_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHyperlink3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c3f157d9e5d34fb787024f6d85dd9e0a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHyperlink3(ptr: Pointer?): WithDefault = IHyperlink3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHyperlink3 {
      val address = segment.toRawLongValue()
      return makeIHyperlink3(Pointer(address))
    }

    public override fun toNative(obj: IHyperlink3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__932194123_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHyperlink3): Array<IHyperlink3?> = (elements as
        Array<IHyperlink3?>).castToImpl<IHyperlink3,IHyperlink3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHyperlink3?> =
        arrayOfNulls<IHyperlink3_Impl>(size) as Array<IHyperlink3?>
  }
}
