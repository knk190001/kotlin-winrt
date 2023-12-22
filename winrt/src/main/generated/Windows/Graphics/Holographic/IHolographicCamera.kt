package Windows.Graphics.Holographic

import Windows.Foundation.Size
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
import com.sun.jna.platform.win32.WinDef
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IHolographicCamera.ABI::class)
@Signature("{e4e98445-9bed-4980-9ba0-e87680d1cb74}")
@Guid("e4e984459bed49809ba0e87680d1cb74")
@WinRTInterface("e4e984459bed49809ba0e87680d1cb74")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHolographicCamera.ByReference::class)
public interface IHolographicCamera : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_RenderTargetSize(): Size?

  @InterfaceMethod(1)
  public fun get_ViewportScaleFactor(): Double

  @InterfaceMethod(2)
  public fun put_ViewportScaleFactor(value: Double): Unit

  @InterfaceMethod(3)
  public fun get_IsStereo(): Boolean

  @InterfaceMethod(4)
  public fun get_Id(): WinDef.UINT

  @InterfaceMethod(5)
  public fun SetNearPlaneDistance(value: Double): Unit

  @InterfaceMethod(6)
  public fun SetFarPlaneDistance(value: Double): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHolographicCamera> {
    public override fun getValue() = ABI.makeIHolographicCamera(pointer.getPointer(0))

    public fun setValue(value: IHolographicCamera_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHolographicCamera {
    public val __484208768_Ptr: Pointer?

    public val _484208768_VtblPtr: Pointer?
      get() = __484208768_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RenderTargetSize(): Size? {
      val fnPtr = _484208768_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Size>()
      val hr = fn.invokeHR(arrayOf(__484208768_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Size>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ViewportScaleFactor(): Double {
      val fnPtr = _484208768_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__484208768_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_ViewportScaleFactor(value: Double): Unit {
      val fnPtr = _484208768_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__484208768_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_IsStereo(): Boolean {
      val fnPtr = _484208768_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__484208768_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_Id(): WinDef.UINT {
      val fnPtr = _484208768_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__484208768_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun SetNearPlaneDistance(value: Double): Unit {
      val fnPtr = _484208768_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__484208768_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun SetFarPlaneDistance(value: Double): Unit {
      val fnPtr = _484208768_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__484208768_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IHolographicCamera_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __484208768_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHolographicCamera, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e4e984459bed49809ba0e87680d1cb74")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHolographicCamera(ptr: Pointer?): WithDefault = IHolographicCamera_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHolographicCamera {
      val address = segment.toRawLongValue()
      return makeIHolographicCamera(Pointer(address))
    }

    public override fun toNative(obj: IHolographicCamera): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__484208768_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHolographicCamera): Array<IHolographicCamera?> =
        (elements as
        Array<IHolographicCamera?>).castToImpl<IHolographicCamera,IHolographicCamera_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHolographicCamera?> =
        arrayOfNulls<IHolographicCamera_Impl>(size) as Array<IHolographicCamera?>
  }
}
