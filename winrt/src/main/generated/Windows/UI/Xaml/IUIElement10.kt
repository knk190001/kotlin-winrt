package Windows.UI.Xaml

import Windows.Foundation.Numerics.Vector2
import Windows.Foundation.Numerics.Vector3
import Windows.UI.UIContext
import Windows.UI.Xaml.Media.Shadow
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

@ABIMarker(IUIElement10.ABI::class)
@Signature("{d531c629-ad2c-5f6b-adcf-fb87287d18d7}")
@Guid("d531c629ad2c5f6badcffb87287d18d7")
@WinRTInterface("d531c629ad2c5f6badcffb87287d18d7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUIElement10.ByReference::class)
public interface IUIElement10 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ActualOffset(): Vector3?

  @InterfaceMethod(1)
  public fun get_ActualSize(): Vector2?

  @InterfaceMethod(2)
  public fun get_XamlRoot(): XamlRoot?

  @InterfaceMethod(3)
  public fun put_XamlRoot(value: XamlRoot?): Unit

  @InterfaceMethod(4)
  public fun get_UIContext(): UIContext?

  @InterfaceMethod(5)
  public fun get_Shadow(): Shadow?

  @InterfaceMethod(6)
  public fun put_Shadow(value: Shadow?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IUIElement10> {
    public override fun getValue() = ABI.makeIUIElement10(pointer.getPointer(0))

    public fun setValue(value: IUIElement10_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUIElement10 {
    public val __1589894261_Ptr: Pointer?

    public val _1589894261_VtblPtr: Pointer?
      get() = __1589894261_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ActualOffset(): Vector3? {
      val fnPtr = _1589894261_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector3>()
      val hr = fn.invokeHR(arrayOf(__1589894261_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector3>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ActualSize(): Vector2? {
      val fnPtr = _1589894261_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector2>()
      val hr = fn.invokeHR(arrayOf(__1589894261_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector2>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_XamlRoot(): XamlRoot? {
      val fnPtr = _1589894261_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XamlRoot>()
      val hr = fn.invokeHR(arrayOf(__1589894261_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XamlRoot>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_XamlRoot(value: XamlRoot?): Unit {
      val fnPtr = _1589894261_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1589894261_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_UIContext(): UIContext? {
      val fnPtr = _1589894261_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIContext>()
      val hr = fn.invokeHR(arrayOf(__1589894261_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIContext>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_Shadow(): Shadow? {
      val fnPtr = _1589894261_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Shadow>()
      val hr = fn.invokeHR(arrayOf(__1589894261_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Shadow>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_Shadow(value: Shadow?): Unit {
      val fnPtr = _1589894261_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1589894261_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IUIElement10_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1589894261_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUIElement10, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d531c629ad2c5f6badcffb87287d18d7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUIElement10(ptr: Pointer?): WithDefault = IUIElement10_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUIElement10 {
      val address = segment.toRawLongValue()
      return makeIUIElement10(Pointer(address))
    }

    public override fun toNative(obj: IUIElement10): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1589894261_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUIElement10): Array<IUIElement10?> = (elements as
        Array<IUIElement10?>).castToImpl<IUIElement10,IUIElement10_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUIElement10?> =
        arrayOfNulls<IUIElement10_Impl>(size) as Array<IUIElement10?>
  }
}
