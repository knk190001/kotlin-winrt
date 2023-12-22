package Windows.UI.Xaml.Controls.Maps

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

@ABIMarker(IMapControlStatics8.ABI::class)
@Signature("{adb7a7b0-0605-592c-bf9d-d10bdc2be47b}")
@Guid("adb7a7b00605592cbf9dd10bdc2be47b")
@WinRTInterface("adb7a7b00605592cbf9dd10bdc2be47b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapControlStatics8.ByReference::class)
public interface IMapControlStatics8 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CanTiltDownProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_CanTiltUpProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_CanZoomInProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_CanZoomOutProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapControlStatics8> {
    public override fun getValue() = ABI.makeIMapControlStatics8(pointer.getPointer(0))

    public fun setValue(value: IMapControlStatics8_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapControlStatics8 {
    public val __142000219_Ptr: Pointer?

    public val _142000219_VtblPtr: Pointer?
      get() = __142000219_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CanTiltDownProperty(): DependencyProperty? {
      val fnPtr = _142000219_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__142000219_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_CanTiltUpProperty(): DependencyProperty? {
      val fnPtr = _142000219_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__142000219_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_CanZoomInProperty(): DependencyProperty? {
      val fnPtr = _142000219_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__142000219_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_CanZoomOutProperty(): DependencyProperty? {
      val fnPtr = _142000219_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__142000219_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IMapControlStatics8_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __142000219_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapControlStatics8, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("adb7a7b00605592cbf9dd10bdc2be47b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapControlStatics8(ptr: Pointer?): WithDefault = IMapControlStatics8_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapControlStatics8 {
      val address = segment.toRawLongValue()
      return makeIMapControlStatics8(Pointer(address))
    }

    public override fun toNative(obj: IMapControlStatics8): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__142000219_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapControlStatics8): Array<IMapControlStatics8?> =
        (elements as
        Array<IMapControlStatics8?>).castToImpl<IMapControlStatics8,IMapControlStatics8_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapControlStatics8?> =
        arrayOfNulls<IMapControlStatics8_Impl>(size) as Array<IMapControlStatics8?>
  }
}
