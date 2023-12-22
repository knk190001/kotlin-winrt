package Windows.UI.Xaml

import Windows.UI.Core.CoreDispatcher
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IDependencyObject.ABI::class)
@Signature("{5c526665-f60e-4912-af59-5fe0680f089d}")
@Guid("5c526665f60e4912af595fe0680f089d")
@WinRTInterface("5c526665f60e4912af595fe0680f089d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDependencyObject.ByReference::class)
public interface IDependencyObject : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetValue(dp: DependencyProperty?): IUnknown?

  @InterfaceMethod(1)
  public fun SetValue(dp: DependencyProperty?, value: IUnknown?): Unit

  @InterfaceMethod(2)
  public fun ClearValue(dp: DependencyProperty?): Unit

  @InterfaceMethod(3)
  public fun ReadLocalValue(dp: DependencyProperty?): IUnknown?

  @InterfaceMethod(4)
  public fun GetAnimationBaseValue(dp: DependencyProperty?): IUnknown?

  @InterfaceMethod(5)
  public fun get_Dispatcher(): CoreDispatcher?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDependencyObject> {
    public override fun getValue() = ABI.makeIDependencyObject(pointer.getPointer(0))

    public fun setValue(value: IDependencyObject_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDependencyObject {
    public val __392585404_Ptr: Pointer?

    public val _392585404_VtblPtr: Pointer?
      get() = __392585404_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetValue(dp: DependencyProperty?): IUnknown? {
      val fnPtr = _392585404_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__392585404_Ptr, marshalToNative(dp), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun SetValue(dp: DependencyProperty?, value: IUnknown?): Unit {
      val fnPtr = _392585404_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__392585404_Ptr, marshalToNative(dp), marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun ClearValue(dp: DependencyProperty?): Unit {
      val fnPtr = _392585404_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__392585404_Ptr, marshalToNative(dp),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun ReadLocalValue(dp: DependencyProperty?): IUnknown? {
      val fnPtr = _392585404_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__392585404_Ptr, marshalToNative(dp), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetAnimationBaseValue(dp: DependencyProperty?): IUnknown? {
      val fnPtr = _392585404_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__392585404_Ptr, marshalToNative(dp), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_Dispatcher(): CoreDispatcher? {
      val fnPtr = _392585404_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreDispatcher>()
      val hr = fn.invokeHR(arrayOf(__392585404_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreDispatcher>(result.getValue())
      return resultValue
    }
  }

  public class IDependencyObject_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __392585404_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDependencyObject, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5c526665f60e4912af595fe0680f089d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDependencyObject(ptr: Pointer?): WithDefault = IDependencyObject_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDependencyObject {
      val address = segment.toRawLongValue()
      return makeIDependencyObject(Pointer(address))
    }

    public override fun toNative(obj: IDependencyObject): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__392585404_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDependencyObject): Array<IDependencyObject?> = (elements
        as Array<IDependencyObject?>).castToImpl<IDependencyObject,IDependencyObject_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDependencyObject?> =
        arrayOfNulls<IDependencyObject_Impl>(size) as Array<IDependencyObject?>
  }
}
