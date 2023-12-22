package Windows.Graphics.Holographic

import Windows.Foundation.Size
import Windows.Perception.Spatial.SpatialLocator
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IHolographicDisplay.ABI::class)
@Signature("{9acea414-1d9f-4090-a388-90c06f6eae9c}")
@Guid("9acea4141d9f4090a38890c06f6eae9c")
@WinRTInterface("9acea4141d9f4090a38890c06f6eae9c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHolographicDisplay.ByReference::class)
public interface IHolographicDisplay : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DisplayName(): String?

  @InterfaceMethod(1)
  public fun get_MaxViewportSize(): Size?

  @InterfaceMethod(2)
  public fun get_IsStereo(): Boolean

  @InterfaceMethod(3)
  public fun get_IsOpaque(): Boolean

  @InterfaceMethod(4)
  public fun get_AdapterId(): HolographicAdapterId?

  @InterfaceMethod(5)
  public fun get_SpatialLocator(): SpatialLocator?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHolographicDisplay> {
    public override fun getValue() = ABI.makeIHolographicDisplay(pointer.getPointer(0))

    public fun setValue(value: IHolographicDisplay_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHolographicDisplay {
    public val __1003169849_Ptr: Pointer?

    public val _1003169849_VtblPtr: Pointer?
      get() = __1003169849_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DisplayName(): String? {
      val fnPtr = _1003169849_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1003169849_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_MaxViewportSize(): Size? {
      val fnPtr = _1003169849_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Size>()
      val hr = fn.invokeHR(arrayOf(__1003169849_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Size>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_IsStereo(): Boolean {
      val fnPtr = _1003169849_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1003169849_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_IsOpaque(): Boolean {
      val fnPtr = _1003169849_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1003169849_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_AdapterId(): HolographicAdapterId? {
      val fnPtr = _1003169849_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HolographicAdapterId>()
      val hr = fn.invokeHR(arrayOf(__1003169849_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HolographicAdapterId>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_SpatialLocator(): SpatialLocator? {
      val fnPtr = _1003169849_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialLocator>()
      val hr = fn.invokeHR(arrayOf(__1003169849_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialLocator>(result.getValue())
      return resultValue
    }
  }

  public class IHolographicDisplay_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1003169849_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHolographicDisplay, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9acea4141d9f4090a38890c06f6eae9c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHolographicDisplay(ptr: Pointer?): WithDefault = IHolographicDisplay_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHolographicDisplay {
      val address = segment.toRawLongValue()
      return makeIHolographicDisplay(Pointer(address))
    }

    public override fun toNative(obj: IHolographicDisplay): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1003169849_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHolographicDisplay): Array<IHolographicDisplay?> =
        (elements as
        Array<IHolographicDisplay?>).castToImpl<IHolographicDisplay,IHolographicDisplay_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHolographicDisplay?> =
        arrayOfNulls<IHolographicDisplay_Impl>(size) as Array<IHolographicDisplay?>
  }
}
