package Windows.UI.Xaml.Controls

import Windows.Foundation.Rect
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

@ABIMarker(ISemanticZoomLocation.ABI::class)
@Signature("{42011736-e3c2-496b-bc4e-d750d4375b9a}")
@Guid("42011736e3c2496bbc4ed750d4375b9a")
@WinRTInterface("42011736e3c2496bbc4ed750d4375b9a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISemanticZoomLocation.ByReference::class)
public interface ISemanticZoomLocation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Item(): IUnknown?

  @InterfaceMethod(1)
  public fun put_Item(value: IUnknown?): Unit

  @InterfaceMethod(2)
  public fun get_Bounds(): Rect?

  @InterfaceMethod(3)
  public fun put_Bounds(value: Rect?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISemanticZoomLocation> {
    public override fun getValue() = ABI.makeISemanticZoomLocation(pointer.getPointer(0))

    public fun setValue(value: ISemanticZoomLocation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISemanticZoomLocation {
    public val __564583510_Ptr: Pointer?

    public val _564583510_VtblPtr: Pointer?
      get() = __564583510_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Item(): IUnknown? {
      val fnPtr = _564583510_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__564583510_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Item(value: IUnknown?): Unit {
      val fnPtr = _564583510_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__564583510_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Bounds(): Rect? {
      val fnPtr = _564583510_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__564583510_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Bounds(value: Rect?): Unit {
      val fnPtr = _564583510_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__564583510_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISemanticZoomLocation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __564583510_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISemanticZoomLocation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("42011736e3c2496bbc4ed750d4375b9a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISemanticZoomLocation(ptr: Pointer?): WithDefault =
        ISemanticZoomLocation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISemanticZoomLocation {
      val address = segment.toRawLongValue()
      return makeISemanticZoomLocation(Pointer(address))
    }

    public override fun toNative(obj: ISemanticZoomLocation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__564583510_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISemanticZoomLocation): Array<ISemanticZoomLocation?> =
        (elements as
        Array<ISemanticZoomLocation?>).castToImpl<ISemanticZoomLocation,ISemanticZoomLocation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISemanticZoomLocation?> =
        arrayOfNulls<ISemanticZoomLocation_Impl>(size) as Array<ISemanticZoomLocation?>
  }
}
